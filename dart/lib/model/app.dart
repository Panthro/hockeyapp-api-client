part of swagger.api;


@Entity()
class App {
  
  @Property(name: 'title')
  String title = null;
  

  @Property(name: 'bundle_identifier')
  String bundleIdentifier = null;
  

  @Property(name: 'public_identifier')
  String publicIdentifier = null;
  

  @Property(name: 'release_type')
  int releaseType = null;
  

  @Property(name: 'platform')
  String platform = null;
  //enum platformEnum {  iOS,  Android,  Mac Os,  Windows Phone,  Custom,  };
  App();

  @override
  String toString()  {
    return 'App[title=$title, bundleIdentifier=$bundleIdentifier, publicIdentifier=$publicIdentifier, releaseType=$releaseType, platform=$platform, ]';
  }

}

