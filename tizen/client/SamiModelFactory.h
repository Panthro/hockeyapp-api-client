#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SamiObject.h"

#include "SamiApp.h"
#include "SamiApps.h"
#include "SamiApps_apps.h"

namespace Swagger {
  void*
  create(String type) {
    if(type.Equals(L"SamiApp", true)) {
      return new SamiApp();
    }
    if(type.Equals(L"SamiApps", true)) {
      return new SamiApps();
    }
    if(type.Equals(L"SamiApps_apps", true)) {
      return new SamiApps_apps();
    }
    
    if(type.Equals(L"String", true)) {
      return new String();
    }
    if(type.Equals(L"Integer", true)) {
      return new Integer();
    }
    if(type.Equals(L"Long", true)) {
      return new Long();
    }
    if(type.Equals(L"DateTime", true)) {
      return new DateTime();
    }
    return null;
  }
} /* namespace Swagger */

#endif /* ModelFactory_H_ */
