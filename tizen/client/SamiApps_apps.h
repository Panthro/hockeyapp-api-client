/*
 * SamiApps_apps.h
 * 
 * 
 */

#ifndef SamiApps_apps_H_
#define SamiApps_apps_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


using Tizen::Base::Integer;
using Tizen::Base::String;


namespace Swagger {

class SamiApps_apps: public SamiObject {
public:
    SamiApps_apps();
    SamiApps_apps(String* json);
    virtual ~SamiApps_apps();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiApps_apps* fromJson(String* obj);

    String* getPTitle();
    void setPTitle(String* pTitle);
    String* getPBundleIdentifier();
    void setPBundleIdentifier(String* pBundle_identifier);
    String* getPPublicIdentifier();
    void setPPublicIdentifier(String* pPublic_identifier);
    String* getPDeviceFamily();
    void setPDeviceFamily(String* pDevice_family);
    String* getPMinimumOsVersion();
    void setPMinimumOsVersion(String* pMinimum_os_version);
    Integer* getPReleaseType();
    void setPReleaseType(Integer* pRelease_type);
    Integer* getPStatus();
    void setPStatus(Integer* pStatus);
    String* getPPlatform();
    void setPPlatform(String* pPlatform);

private:
    String* pTitle;
String* pBundle_identifier;
String* pPublic_identifier;
String* pDevice_family;
String* pMinimum_os_version;
Integer* pRelease_type;
Integer* pStatus;
String* pPlatform;
};

} /* namespace Swagger */

#endif /* SamiApps_apps_H_ */
