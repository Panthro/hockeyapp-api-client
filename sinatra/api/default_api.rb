require 'json'


MyApp.add_route('GET', '/api/2/apps', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "apps_get", 
  "responseClass" => "Apps", 
  "endpoint" => "/apps", 
  "notes" => "Gets `Apps`. ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/2/apps/upload', {
  "resourcePath" => "/Default",
  "summary" => "",
  "nickname" => "apps_upload_post", 
  "responseClass" => "App", 
  "endpoint" => "/apps/upload", 
  "notes" => "Upload a new app",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

