/*
 * SamiApps.h
 * 
 * 
 */

#ifndef SamiApps_H_
#define SamiApps_H_

#include <FApp.h>
#include <FBase.h>
#include <FSystem.h>
#include <FWebJson.h>
#include "SamiHelpers.h"
#include "SamiObject.h"

using namespace Tizen::Web::Json;


#include "SamiApps_apps.h"
using Tizen::Base::Collection::IList;
using Tizen::Base::String;


namespace Swagger {

class SamiApps: public SamiObject {
public:
    SamiApps();
    SamiApps(String* json);
    virtual ~SamiApps();

    void init();

    void cleanup();

    String asJson ();

    JsonObject* asJsonObject();

    void fromJsonObject(IJsonValue* json);

    SamiApps* fromJson(String* obj);

    String* getPSuccess();
    void setPSuccess(String* pSuccess);
    IList* getPApps();
    void setPApps(IList* pApps);

private:
    String* pSuccess;
IList* pApps;
};

} /* namespace Swagger */

#endif /* SamiApps_H_ */
