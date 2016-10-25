#import "SWGApp.h"

@implementation SWGApp

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"title": @"title", @"bundle_identifier": @"bundleIdentifier", @"public_identifier": @"publicIdentifier", @"release_type": @"releaseType", @"platform": @"platform" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"title", @"bundleIdentifier", @"publicIdentifier", @"releaseType", @"platform"];
  return [optionalProperties containsObject:propertyName];
}

@end
