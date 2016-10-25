#import "SWGDefaultApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApps.h"
#import "SWGApp.h"


@interface SWGDefaultApi ()

@property (nonatomic, strong) NSMutableDictionary *defaultHeaders;

@end

@implementation SWGDefaultApi

NSString* kSWGDefaultApiErrorDomain = @"SWGDefaultApiErrorDomain";
NSInteger kSWGDefaultApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        _apiClient = config.apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+ (instancetype)sharedAPI {
    static SWGDefaultApi *sharedAPI;
    static dispatch_once_t once;
    dispatch_once(&once, ^{
        sharedAPI = [[self alloc] init];
    });
    return sharedAPI;
}

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.defaultHeaders[key];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self setDefaultHeaderValue:value forKey:key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(NSUInteger) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// 
/// Gets `Apps`. 
///  @returns SWGApps*
///
-(NSNumber*) appsGetWithCompletionHandler: 
    (void (^)(SWGApps* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"token"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGApps*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGApps*)data, error);
                                }
                           }
          ];
}

///
/// 
/// Upload a new app
///  @param ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android 
///
///  @param dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional)
///
///  @param notes release notes as Textile or Markdown (after 5k characters note are truncated) (optional)
///
///  @param notesType type of release notes. `0` for Textile, `1` for Markdown (optional)
///
///  @param notify notify testers (can only be set with full-access tokens). `0` to not notify, `1` to notify all testers that can install this app,  `2` to notify all testers (optional)
///
///  @param status download status (can only be set with full-access tokens). `1` to not allow users to download the version, `2` to make the version available for download (optional)
///
///  @param strategy replace or add build with same build number. `add` to add the build as a new build to even if it has the same build number __default__, `replace` to replace to a build with the same build number (optional)
///
///  @param tags restrict download to comma-separated list of tags (optional)
///
///  @param teams restrict download to comma-separated list of team IDs (optional)
///
///  @param users restrict download to comma-separated list of user IDs (optional)
///
///  @param mandatory set version as mandatory `0` for not mandatory __default__, `1` for mandatory (optional)
///
///  @param releaseType set the release type of the app. `0` for beta __default__  `1` for store `2` for alpha `3` for enterprise (optional)
///
///  @param private set to `true` to enable the private download page (default is `true`) (optional)
///
///  @param ownerId set to the ID of your organization (optional)
///
///  @param commitSha set to the git commit sha for this build (optional)
///
///  @param buildServerUrl set to the URL of the build job on your build server (optional)
///
///  @param repositoryUrl set to your source repository (optional)
///
///  @returns SWGApp*
///
-(NSNumber*) appsUploadPostWithIpa: (NSURL*) ipa
    dsym: (NSURL*) dsym
    notes: (NSString*) notes
    notesType: (NSNumber*) notesType
    notify: (NSNumber*) notify
    status: (NSNumber*) status
    strategy: (NSString*) strategy
    tags: (NSArray<NSString*>*) tags
    teams: (NSArray<NSNumber*>*) teams
    users: (NSArray<NSNumber*>*) users
    mandatory: (NSNumber*) mandatory
    releaseType: (NSNumber*) releaseType
    private: (NSNumber*) private
    ownerId: (NSNumber*) ownerId
    commitSha: (NSString*) commitSha
    buildServerUrl: (NSString*) buildServerUrl
    repositoryUrl: (NSString*) repositoryUrl
    completionHandler: (void (^)(SWGApp* output, NSError* error)) handler {
    // verify the required parameter 'ipa' is set
    if (ipa == nil) {
        NSParameterAssert(ipa);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"ipa"] };
            NSError* error = [NSError errorWithDomain:kSWGDefaultApiErrorDomain code:kSWGDefaultApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/apps/upload"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"token"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"ipa"] = ipa;
    localVarFiles[@"dsym"] = dsym;
    if (notes) {
        formParams[@"notes"] = notes;
    }
    if (notesType) {
        formParams[@"notes_type"] = notesType;
    }
    if (notify) {
        formParams[@"notify"] = notify;
    }
    if (status) {
        formParams[@"status"] = status;
    }
    if (strategy) {
        formParams[@"strategy"] = strategy;
    }
    if (tags) {
        formParams[@"tags"] = tags;
    }
    if (teams) {
        formParams[@"teams"] = teams;
    }
    if (users) {
        formParams[@"users"] = users;
    }
    if (mandatory) {
        formParams[@"mandatory"] = mandatory;
    }
    if (releaseType) {
        formParams[@"release_type"] = releaseType;
    }
    if (private) {
        formParams[@"private"] = private;
    }
    if (ownerId) {
        formParams[@"owner_id"] = ownerId;
    }
    if (commitSha) {
        formParams[@"commit_sha"] = commitSha;
    }
    if (buildServerUrl) {
        formParams[@"build_server_url"] = buildServerUrl;
    }
    if (repositoryUrl) {
        formParams[@"repository_url"] = repositoryUrl;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"SWGApp*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((SWGApp*)data, error);
                                }
                           }
          ];
}



@end
