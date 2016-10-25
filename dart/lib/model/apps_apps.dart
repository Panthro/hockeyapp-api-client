part of swagger.api;


@Entity()
class AppsApps {
  
  @Property(name: 'title')
  String title = null;
  

  @Property(name: 'bundle_identifier')
  String bundleIdentifier = null;
  

  @Property(name: 'public_identifier')
  String publicIdentifier = null;
  

  @Property(name: 'device_family')
  String deviceFamily = null;
  

  @Property(name: 'minimum_os_version')
  String minimumOsVersion = null;
  

  @Property(name: 'release_type')
  int releaseType = null;
  

  @Property(name: 'status')
  int status = null;
  

  @Property(name: 'platform')
  String platform = null;
  //enum platformEnum {  iOS,  Android,  Mac Os,  Windows Phone,  Custom,  };
  AppsApps();

  @override
  String toString()  {
    return 'AppsApps[title=$title, bundleIdentifier=$bundleIdentifier, publicIdentifier=$publicIdentifier, deviceFamily=$deviceFamily, minimumOsVersion=$minimumOsVersion, releaseType=$releaseType, status=$status, platform=$platform, ]';
  }

}

