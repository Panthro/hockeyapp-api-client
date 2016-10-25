part of swagger.api;


@Entity()
class Apps {
  
  @Property(name: 'success')
  String success = null;
  

  @Property(name: 'apps')
  List<AppsApps> apps = [];
  
  Apps();

  @override
  String toString()  {
    return 'Apps[success=$success, apps=$apps, ]';
  }

}

