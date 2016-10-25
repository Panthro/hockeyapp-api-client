
#include "SamiApp.h"
#include <FLocales.h>

using namespace Tizen::Base;
using namespace Tizen::System;
using namespace Tizen::Base::Utility;
using namespace Tizen::Base::Collection;
using namespace Tizen::Web::Json;
using namespace Tizen::Locales;


namespace Swagger {

SamiApp::SamiApp() {
    init();
}

SamiApp::~SamiApp() {
    this->cleanup();
}

void
SamiApp::init() {
    pTitle = null;
pBundle_identifier = null;
pPublic_identifier = null;
pRelease_type = null;
pPlatform = null;
}

void
SamiApp::cleanup() {
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
if(pRelease_type != null) {
        
        delete pRelease_type;
        pRelease_type = null;
    }
if(pPlatform != null) {
        
        delete pPlatform;
        pPlatform = null;
    }
}


SamiApp*
SamiApp::fromJson(String* json) {
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
SamiApp::fromJsonObject(IJsonValue* pJson) {
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
JsonString* pRelease_typeKey = new JsonString(L"release_type");
        IJsonValue* pRelease_typeVal = null;
        pJsonObject->GetValue(pRelease_typeKey, pRelease_typeVal);
        if(pRelease_typeVal != null) {
            
            pRelease_type = null;
            jsonToValue(pRelease_type, pRelease_typeVal, L"Integer", L"Integer");
        }
        delete pRelease_typeKey;
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

SamiApp::SamiApp(String* json) {
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
SamiApp::asJson ()
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
SamiApp::asJsonObject() {
    JsonObject *pJsonObject = new JsonObject();
    pJsonObject->Construct();

    JsonString *pTitleKey = new JsonString(L"title");
    pJsonObject->Add(pTitleKey, toJson(getPTitle(), "String", ""));

    JsonString *pBundle_identifierKey = new JsonString(L"bundle_identifier");
    pJsonObject->Add(pBundle_identifierKey, toJson(getPBundleIdentifier(), "String", ""));

    JsonString *pPublic_identifierKey = new JsonString(L"public_identifier");
    pJsonObject->Add(pPublic_identifierKey, toJson(getPPublicIdentifier(), "String", ""));

    JsonString *pRelease_typeKey = new JsonString(L"release_type");
    pJsonObject->Add(pRelease_typeKey, toJson(getPReleaseType(), "Integer", ""));

    JsonString *pPlatformKey = new JsonString(L"platform");
    pJsonObject->Add(pPlatformKey, toJson(getPPlatform(), "String", ""));

    return pJsonObject;
}

String*
SamiApp::getPTitle() {
    return pTitle;
}
void
SamiApp::setPTitle(String* pTitle) {
    this->pTitle = pTitle;
}

String*
SamiApp::getPBundleIdentifier() {
    return pBundle_identifier;
}
void
SamiApp::setPBundleIdentifier(String* pBundle_identifier) {
    this->pBundle_identifier = pBundle_identifier;
}

String*
SamiApp::getPPublicIdentifier() {
    return pPublic_identifier;
}
void
SamiApp::setPPublicIdentifier(String* pPublic_identifier) {
    this->pPublic_identifier = pPublic_identifier;
}

Integer*
SamiApp::getPReleaseType() {
    return pRelease_type;
}
void
SamiApp::setPReleaseType(Integer* pRelease_type) {
    this->pRelease_type = pRelease_type;
}

String*
SamiApp::getPPlatform() {
    return pPlatform;
}
void
SamiApp::setPPlatform(String* pPlatform) {
    this->pPlatform = pPlatform;
}



} /* namespace Swagger */

