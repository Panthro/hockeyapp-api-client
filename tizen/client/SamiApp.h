/*
 * SamiApp.h
 * 
 * 
 */

#ifndef SamiApp_H_
#define SamiApp_H_

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

class SamiApp: public SamiObject {
public:
    SamiApp();
    SamiApp(String* json);
    virtual ~SamiApp();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiApp* fromJson(String* obj);

    String* getPTitle();
    void setPTitle(String* pTitle);
    String* getPBundleIdentifier();
    void setPBundleIdentifier(String* pBundle_identifier);
    String* getPPublicIdentifier();
    void setPPublicIdentifier(String* pPublic_identifier);
    Integer* getPReleaseType();
    void setPReleaseType(Integer* pRelease_type);
    String* getPPlatform();
    void setPPlatform(String* pPlatform);

private:
    String* pTitle;
String* pBundle_identifier;
String* pPublic_identifier;
Integer* pRelease_type;
String* pPlatform;
};

} /* namespace Swagger */

#endif /* SamiApp_H_ */
