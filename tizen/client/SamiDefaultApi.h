#ifndef SamiDefaultApi_H_
#define SamiDefaultApi_H_

#include <FNet.h>
#include "SamiApiClient.h"
#include "SamiError.h"

#include "SamiApps.h"
using Tizen::Base::Integer;
#include "SamiFile.h"
#include "SamiApp.h"
using Tizen::Base::String;
using Tizen::Base::Boolean;

using namespace Tizen::Net::Http;

namespace Swagger {

class SamiDefaultApi {
public:
  SamiDefaultApi();
  virtual ~SamiDefaultApi();

  SamiApps* 
  appsGetWithCompletion( void (* handler)(SamiApps*, SamiError*));
  SamiApp* 
  appsUploadPostWithCompletion(SamiFile* ipa, SamiFile* dsym, String* notes, Integer* notesType, Integer* notify, Integer* status, String* strategy, IList* tags, IList* teams, IList* users, Integer* mandatory, Integer* releaseType, Boolean* private, Integer* ownerId, String* commitSha, String* buildServerUrl, String* repositoryUrl, void (* handler)(SamiApp*, SamiError*));
  static String getBasePath() {
    return L"https://rink.hockeyapp.net/api/2";
  }

private:
  SamiApiClient* client;
};


} /* namespace Swagger */

#endif /* SamiDefaultApi_H_ */
