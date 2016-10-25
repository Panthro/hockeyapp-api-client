
#include "SamiApps.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiApps::SamiApps() {
    init();
}

SamiApps::~SamiApps() {
    this->cleanup();
}

void
SamiApps::init() {
    pSuccess = null;
pApps = null;
}

void
SamiApps::cleanup() {
    if(pSuccess != null) {
        
        delete pSuccess;
        pSuccess = null;
    }
if(pApps != null) {
        pApps->RemoveAll(true);
        delete pApps;
        pApps = null;
    }
}


SamiApps*
SamiApps::fromJson(String* json) {
    this->cleanup();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
    return this;
}


void
SamiApps::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pSuccessKey = new JsonString(L"success");
        IJsonValue* pSuccessVal = null;
        pJsonObject->GetValue(pSuccessKey, pSuccessVal);
        if(pSuccessVal != null) {
            
            pSuccess = new String();
            jsonToValue(pSuccess, pSuccessVal, L"String", L"String");
        }
        delete pSuccessKey;
JsonString* pAppsKey = new JsonString(L"apps");
        IJsonValue* pAppsVal = null;
        pJsonObject->GetValue(pAppsKey, pAppsVal);
        if(pAppsVal != null) {
            pApps = new ArrayList();
            
            jsonToValue(pApps, pAppsVal, L"IList", L"SamiApps_apps");
        }
        delete pAppsKey;
    }
}

SamiApps::SamiApps(String* json) {
    init();
    String str(json->GetPointer());
    int length = str.GetLength();

    ByteBuffer buffer;
    buffer.Construct(length);

    for (int i = 0; i < length; ++i) {
       byte b = str[i];
       buffer.SetByte(b);
    }

    IJsonValue* pJson = JsonParser::ParseN(buffer);
    fromJsonObject(pJson);
    if (pJson->GetType() == JSON_TYPE_OBJECT) {
       JsonObject* pObject = static_cast< JsonObject* >(pJson);
       pObject->RemoveAll(true);
    }
    else if (pJson->GetType() == JSON_TYPE_ARRAY) {
       JsonArray* pArray = static_cast< JsonArray* >(pJson);
       pArray->RemoveAll(true);
    }
    delete pJson;
}

String
SamiApps::asJson ()
{
    JsonObject* pJsonObject = asJsonObject();

    char *pComposeBuf = new char[256];
    JsonWriter::Compose(pJsonObject, pComposeBuf, 256);
    String s = String(pComposeBuf);

    delete pComposeBuf;
    pJsonObject->RemoveAll(true);
    delete pJsonObject;

    return s;
}

JsonObject*
SamiApps::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pSuccessKey = new JsonString(L"success");
    pJsonObject->Add(pSuccessKey, toJson(getPSuccess(), "String", ""));

    JsonString *pAppsKey = new JsonString(L"apps");
    pJsonObject->Add(pAppsKey, toJson(getPApps(), "SamiApps_apps", "array"));

    return pJsonObject;
}

String*
SamiApps::getPSuccess() {
    return pSuccess;
}
void
SamiApps::setPSuccess(String* pSuccess) {
    this->pSuccess = pSuccess;
}

IList*
SamiApps::getPApps() {
    return pApps;
}
void
SamiApps::setPApps(IList* pApps) {
    this->pApps = pApps;
}



} /* namespace Swagger */

