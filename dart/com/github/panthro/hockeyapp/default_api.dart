part of swagger.api;



class DefaultApi {
  final ApiClient apiClient;

  DefaultApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// 
  ///
  /// Gets &#x60;Apps&#x60;. 
  Future<Apps> appsGet( {  bool justIgnoreThisFlag: true}) async {
    if (!justIgnoreThisFlag) {
      print('Why???   Just trust me, I only need this variable inside the mustache codegen template.');
      // This code may be removed as soon as dart accepts trailing spaces (has already been implemented).
    }
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/apps".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["token"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return apiClient.deserialize(response.body, 'Apps') as Apps ;
    } else {
      return null;
    }
  }
  /// 
  ///
  /// Upload a new app
  Future<App> appsUploadPost(MultipartFile ipa,  {  MultipartFile dsym,  String notes,  int notesType,  int notify,  int status,  String strategy,  List<String> tags,  List<int> teams,  List<int> users,  int mandatory,  int releaseType,  bool private,  int ownerId,  String commitSha,  String buildServerUrl,  String repositoryUrl,  bool justIgnoreThisFlag: true}) async {
    if (!justIgnoreThisFlag) {
      print('Why???   Just trust me, I only need this variable inside the mustache codegen template.');
      // This code may be removed as soon as dart accepts trailing spaces (has already been implemented).
    }
    Object postBody = null;

    // verify required params are set
    if(ipa == null) {
     throw new ApiException(400, "Missing required param: ipa");
    }

    // create path and map variables
    String path = "/apps/upload".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["multipart/form-data"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = ["token"];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (ipa != null) {
        hasFields = true;
        mp.fields['Ipa'] = ipa.field;
        mp.files.add(ipa);
      }
      
      if (dsym != null) {
        hasFields = true;
        mp.fields['dsym'] = dsym.field;
        mp.files.add(dsym);
      }
      
      if (notes != null) {
        hasFields = true;
        mp.fields['notes'] = apiClient.parameterToString(notes);
      }
      
      if (notesType != null) {
        hasFields = true;
        mp.fields['notes_type'] = apiClient.parameterToString(notesType);
      }
      
      if (notify != null) {
        hasFields = true;
        mp.fields['notify'] = apiClient.parameterToString(notify);
      }
      
      if (status != null) {
        hasFields = true;
        mp.fields['status'] = apiClient.parameterToString(status);
      }
      
      if (strategy != null) {
        hasFields = true;
        mp.fields['strategy'] = apiClient.parameterToString(strategy);
      }
      
      if (tags != null) {
        hasFields = true;
        mp.fields['tags'] = apiClient.parameterToString(tags);
      }
      
      if (teams != null) {
        hasFields = true;
        mp.fields['teams'] = apiClient.parameterToString(teams);
      }
      
      if (users != null) {
        hasFields = true;
        mp.fields['users'] = apiClient.parameterToString(users);
      }
      
      if (mandatory != null) {
        hasFields = true;
        mp.fields['mandatory'] = apiClient.parameterToString(mandatory);
      }
      
      if (releaseType != null) {
        hasFields = true;
        mp.fields['release_type'] = apiClient.parameterToString(releaseType);
      }
      
      if (private != null) {
        hasFields = true;
        mp.fields['private'] = apiClient.parameterToString(private);
      }
      
      if (ownerId != null) {
        hasFields = true;
        mp.fields['owner_id'] = apiClient.parameterToString(ownerId);
      }
      
      if (commitSha != null) {
        hasFields = true;
        mp.fields['commit_sha'] = apiClient.parameterToString(commitSha);
      }
      
      if (buildServerUrl != null) {
        hasFields = true;
        mp.fields['build_server_url'] = apiClient.parameterToString(buildServerUrl);
      }
      
      if (repositoryUrl != null) {
        hasFields = true;
        mp.fields['repository_url'] = apiClient.parameterToString(repositoryUrl);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      

if (notes != null)
        formParams['notes'] = apiClient.parameterToString(notes);
if (notesType != null)
        formParams['notes_type'] = apiClient.parameterToString(notesType);
if (notify != null)
        formParams['notify'] = apiClient.parameterToString(notify);
if (status != null)
        formParams['status'] = apiClient.parameterToString(status);
if (strategy != null)
        formParams['strategy'] = apiClient.parameterToString(strategy);
if (tags != null)
        formParams['tags'] = apiClient.parameterToString(tags);
if (teams != null)
        formParams['teams'] = apiClient.parameterToString(teams);
if (users != null)
        formParams['users'] = apiClient.parameterToString(users);
if (mandatory != null)
        formParams['mandatory'] = apiClient.parameterToString(mandatory);
if (releaseType != null)
        formParams['release_type'] = apiClient.parameterToString(releaseType);
if (private != null)
        formParams['private'] = apiClient.parameterToString(private);
if (ownerId != null)
        formParams['owner_id'] = apiClient.parameterToString(ownerId);
if (commitSha != null)
        formParams['commit_sha'] = apiClient.parameterToString(commitSha);
if (buildServerUrl != null)
        formParams['build_server_url'] = apiClient.parameterToString(buildServerUrl);
if (repositoryUrl != null)
        formParams['repository_url'] = apiClient.parameterToString(repositoryUrl);
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return apiClient.deserialize(response.body, 'App') as App ;
    } else {
      return null;
    }
  }
}
