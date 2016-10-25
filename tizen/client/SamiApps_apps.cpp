
#include "SamiApps_apps.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiApps_apps::SamiApps_apps() {
    init();
}

SamiApps_apps::~SamiApps_apps() {
    this->cleanup();
}

void
SamiApps_apps::init() {
    pTitle = null;
pBundle_identifier = null;
pPublic_identifier = null;
pDevice_family = null;
pMinimum_os_version = null;
pRelease_type = null;
pStatus = null;
pPlatform = null;
}

void
SamiApps_apps::cleanup() {
    if(pTitle != null) {
        
        delete pTitle;
        pTitle = null;
    }
if(pBundle_identifier != null) {
        
        delete pBundle_identifier;
        pBundle_identifier = null;
    }
if(pPublic_identifier != null) {
        
        delete pPublic_identifier;
        pPublic_identifier = null;
    }
if(pDevice_family != null) {
        
        delete pDevice_family;
        pDevice_family = null;
    }
if(pMinimum_os_version != null) {
        
        delete pMinimum_os_version;
        pMinimum_os_version = null;
    }
if(pRelease_type != null) {
        
        delete pRelease_type;
        pRelease_type = null;
    }
if(pStatus != null) {
        
        delete pStatus;
        pStatus = null;
    }
if(pPlatform != null) {
        
        delete pPlatform;
        pPlatform = null;
    }
}


SamiApps_apps*
SamiApps_apps::fromJson(String* json) {
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
SamiApps_apps::fromJsonObject(IJsonValue* pJson) {
    JsonObject* pJsonObject = static_cast< JsonObject* >(pJson);

    if(pJsonObject != null) {
        JsonString* pTitleKey = new JsonString(L"title");
        IJsonValue* pTitleVal = null;
        pJsonObject->GetValue(pTitleKey, pTitleVal);
        if(pTitleVal != null) {
            
            pTitle = new String();
            jsonToValue(pTitle, pTitleVal, L"String", L"String");
        }
        delete pTitleKey;
JsonString* pBundle_identifierKey = new JsonString(L"bundle_identifier");
        IJsonValue* pBundle_identifierVal = null;
        pJsonObject->GetValue(pBundle_identifierKey, pBundle_identifierVal);
        if(pBundle_identifierVal != null) {
            
            pBundle_identifier = new String();
            jsonToValue(pBundle_identifier, pBundle_identifierVal, L"String", L"String");
        }
        delete pBundle_identifierKey;
JsonString* pPublic_identifierKey = new JsonString(L"public_identifier");
        IJsonValue* pPublic_identifierVal = null;
        pJsonObject->GetValue(pPublic_identifierKey, pPublic_identifierVal);
        if(pPublic_identifierVal != null) {
            
            pPublic_identifier = new String();
            jsonToValue(pPublic_identifier, pPublic_identifierVal, L"String", L"String");
        }
        delete pPublic_identifierKey;
JsonString* pDevice_familyKey = new JsonString(L"device_family");
        IJsonValue* pDevice_familyVal = null;
        pJsonObject->GetValue(pDevice_familyKey, pDevice_familyVal);
        if(pDevice_familyVal != null) {
            
            pDevice_family = new String();
            jsonToValue(pDevice_family, pDevice_familyVal, L"String", L"String");
        }
        delete pDevice_familyKey;
JsonString* pMinimum_os_versionKey = new JsonString(L"minimum_os_version");
        IJsonValue* pMinimum_os_versionVal = null;
        pJsonObject->GetValue(pMinimum_os_versionKey, pMinimum_os_versionVal);
        if(pMinimum_os_versionVal != null) {
            
            pMinimum_os_version = new String();
            jsonToValue(pMinimum_os_version, pMinimum_os_versionVal, L"String", L"String");
        }
        delete pMinimum_os_versionKey;
JsonString* pRelease_typeKey = new JsonString(L"release_type");
        IJsonValue* pRelease_typeVal = null;
        pJsonObject->GetValue(pRelease_typeKey, pRelease_typeVal);
        if(pRelease_typeVal != null) {
            
            pRelease_type = null;
            jsonToValue(pRelease_type, pRelease_typeVal, L"Integer", L"Integer");
        }
        delete pRelease_typeKey;
JsonString* pStatusKey = new JsonString(L"status");
        IJsonValue* pStatusVal = null;
        pJsonObject->GetValue(pStatusKey, pStatusVal);
        if(pStatusVal != null) {
            
            pStatus = null;
            jsonToValue(pStatus, pStatusVal, L"Integer", L"Integer");
        }
        delete pStatusKey;
JsonString* pPlatformKey = new JsonString(L"platform");
        IJsonValue* pPlatformVal = null;
        pJsonObject->GetValue(pPlatformKey, pPlatformVal);
        if(pPlatformVal != null) {
            
            pPlatform = new String();
            jsonToValue(pPlatform, pPlatformVal, L"String", L"String");
        }
        delete pPlatformKey;
    }
}

SamiApps_apps::SamiApps_apps(String* json) {
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
SamiApps_apps::asJson ()
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
SamiApps_apps::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pTitleKey = new JsonString(L"title");
    pJsonObject->Add(pTitleKey, toJson(getPTitle(), "String", ""));

    JsonString *pBundle_identifierKey = new JsonString(L"bundle_identifier");
    pJsonObject->Add(pBundle_identifierKey, toJson(getPBundleIdentifier(), "String", ""));

    JsonString *pPublic_identifierKey = new JsonString(L"public_identifier");
    pJsonObject->Add(pPublic_identifierKey, toJson(getPPublicIdentifier(), "String", ""));

    JsonString *pDevice_familyKey = new JsonString(L"device_family");
    pJsonObject->Add(pDevice_familyKey, toJson(getPDeviceFamily(), "String", ""));

    JsonString *pMinimum_os_versionKey = new JsonString(L"minimum_os_version");
    pJsonObject->Add(pMinimum_os_versionKey, toJson(getPMinimumOsVersion(), "String", ""));

    JsonString *pRelease_typeKey = new JsonString(L"release_type");
    pJsonObject->Add(pRelease_typeKey, toJson(getPReleaseType(), "Integer", ""));

    JsonString *pStatusKey = new JsonString(L"status");
    pJsonObject->Add(pStatusKey, toJson(getPStatus(), "Integer", ""));

    JsonString *pPlatformKey = new JsonString(L"platform");
    pJsonObject->Add(pPlatformKey, toJson(getPPlatform(), "String", ""));

    return pJsonObject;
}

String*
SamiApps_apps::getPTitle() {
    return pTitle;
}
void
SamiApps_apps::setPTitle(String* pTitle) {
    this->pTitle = pTitle;
}

String*
SamiApps_apps::getPBundleIdentifier() {
    return pBundle_identifier;
}
void
SamiApps_apps::setPBundleIdentifier(String* pBundle_identifier) {
    this->pBundle_identifier = pBundle_identifier;
}

String*
SamiApps_apps::getPPublicIdentifier() {
    return pPublic_identifier;
}
void
SamiApps_apps::setPPublicIdentifier(String* pPublic_identifier) {
    this->pPublic_identifier = pPublic_identifier;
}

String*
SamiApps_apps::getPDeviceFamily() {
    return pDevice_family;
}
void
SamiApps_apps::setPDeviceFamily(String* pDevice_family) {
    this->pDevice_family = pDevice_family;
}

String*
SamiApps_apps::getPMinimumOsVersion() {
    return pMinimum_os_version;
}
void
SamiApps_apps::setPMinimumOsVersion(String* pMinimum_os_version) {
    this->pMinimum_os_version = pMinimum_os_version;
}

Integer*
SamiApps_apps::getPReleaseType() {
    return pRelease_type;
}
void
SamiApps_apps::setPReleaseType(Integer* pRelease_type) {
    this->pRelease_type = pRelease_type;
}

Integer*
SamiApps_apps::getPStatus() {
    return pStatus;
}
void
SamiApps_apps::setPStatus(Integer* pStatus) {
    this->pStatus = pStatus;
}

String*
SamiApps_apps::getPPlatform() {
    return pPlatform;
}
void
SamiApps_apps::setPPlatform(String* pPlatform) {
    this->pPlatform = pPlatform;
}



} /* namespace Swagger */

