=begin comment

Hockeyapp Public API wrapper

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

OpenAPI spec version: 0.0.2

Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::DefaultApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;
use WWW::SwaggerClient::Configuration;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class   = shift;
    my (%self) = (
        'api_client' => WWW::SwaggerClient::ApiClient->instance,
        @_
    );

    #my $self = {
    #    #api_client => $options->{api_client}
    #    api_client => $default_api_client
    #}; 

    bless \%self, $class;

}


#
# apps_get
#
# 
# 
{
    my $params = {
    };
    __PACKAGE__->method_documentation->{ 'apps_get' } = { 
    	summary => '',
        params => $params,
        returns => 'Apps',
        };
}
# @return Apps
#
sub apps_get {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/apps';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept();
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(token )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('Apps', $response);
    return $_response_object;
}

#
# apps_upload_post
#
# 
# 
# @param File $ipa file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android (required)
# @param File $dsym file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android. (optional)
# @param string $notes release notes as Textile or Markdown (after 5k characters note are truncated) (optional)
# @param int $notes_type type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown (optional)
# @param int $notify notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers (optional)
# @param int $status download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download (optional)
# @param string $strategy replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number (optional)
# @param ARRAY[string] $tags restrict download to comma-separated list of tags (optional)
# @param ARRAY[int] $teams restrict download to comma-separated list of team IDs (optional)
# @param ARRAY[int] $users restrict download to comma-separated list of user IDs (optional)
# @param int $mandatory set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory (optional)
# @param int $release_type set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise (optional)
# @param boolean $private set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;) (optional)
# @param int $owner_id set to the ID of your organization (optional)
# @param string $commit_sha set to the git commit sha for this build (optional)
# @param string $build_server_url set to the URL of the build job on your build server (optional)
# @param string $repository_url set to your source repository (optional)
{
    my $params = {
    'ipa' => {
        data_type => 'File',
        description => 'file data of the .ipa for iOS, .app.zip for OS X, or .apk file for Android',
        required => '1',
    },
    'dsym' => {
        data_type => 'File',
        description => 'file data of the .dSYM.zip file (iOS and OS X) or mapping.txt (Android); note that the extension has to be .dsym.zip (case-insensitive) for iOS and OS X and the file name has to be mapping.txt for Android.',
        required => '0',
    },
    'notes' => {
        data_type => 'string',
        description => 'release notes as Textile or Markdown (after 5k characters note are truncated)',
        required => '0',
    },
    'notes_type' => {
        data_type => 'int',
        description => 'type of release notes. &#x60;0&#x60; for Textile, &#x60;1&#x60; for Markdown',
        required => '0',
    },
    'notify' => {
        data_type => 'int',
        description => 'notify testers (can only be set with full-access tokens). &#x60;0&#x60; to not notify, &#x60;1&#x60; to notify all testers that can install this app,  &#x60;2&#x60; to notify all testers',
        required => '0',
    },
    'status' => {
        data_type => 'int',
        description => 'download status (can only be set with full-access tokens). &#x60;1&#x60; to not allow users to download the version, &#x60;2&#x60; to make the version available for download',
        required => '0',
    },
    'strategy' => {
        data_type => 'string',
        description => 'replace or add build with same build number. &#x60;add&#x60; to add the build as a new build to even if it has the same build number __default__, &#x60;replace&#x60; to replace to a build with the same build number',
        required => '0',
    },
    'tags' => {
        data_type => 'ARRAY[string]',
        description => 'restrict download to comma-separated list of tags',
        required => '0',
    },
    'teams' => {
        data_type => 'ARRAY[int]',
        description => 'restrict download to comma-separated list of team IDs',
        required => '0',
    },
    'users' => {
        data_type => 'ARRAY[int]',
        description => 'restrict download to comma-separated list of user IDs',
        required => '0',
    },
    'mandatory' => {
        data_type => 'int',
        description => 'set version as mandatory &#x60;0&#x60; for not mandatory __default__, &#x60;1&#x60; for mandatory',
        required => '0',
    },
    'release_type' => {
        data_type => 'int',
        description => 'set the release type of the app. &#x60;0&#x60; for beta __default__  &#x60;1&#x60; for store &#x60;2&#x60; for alpha &#x60;3&#x60; for enterprise',
        required => '0',
    },
    'private' => {
        data_type => 'boolean',
        description => 'set to &#x60;true&#x60; to enable the private download page (default is &#x60;true&#x60;)',
        required => '0',
    },
    'owner_id' => {
        data_type => 'int',
        description => 'set to the ID of your organization',
        required => '0',
    },
    'commit_sha' => {
        data_type => 'string',
        description => 'set to the git commit sha for this build',
        required => '0',
    },
    'build_server_url' => {
        data_type => 'string',
        description => 'set to the URL of the build job on your build server',
        required => '0',
    },
    'repository_url' => {
        data_type => 'string',
        description => 'set to your source repository',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'apps_upload_post' } = { 
    	summary => '',
        params => $params,
        returns => 'App',
        };
}
# @return App
#
sub apps_upload_post {
    my ($self, %args) = @_;

    # verify the required parameter 'ipa' is set
    unless (exists $args{'ipa'}) {
      croak("Missing the required parameter 'ipa' when calling apps_upload_post");
    }

    # parse inputs
    my $_resource_path = '/apps/upload';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('multipart/form-data');

    # form params
    if ( exists $args{'ipa'} ) {
        $form_params->{'Ipa'} = [] unless defined $form_params->{'Ipa'};
        push @{$form_params->{'Ipa'}}, $args{'ipa'};
            }
    
    # form params
    if ( exists $args{'dsym'} ) {
        $form_params->{'dsym'} = [] unless defined $form_params->{'dsym'};
        push @{$form_params->{'dsym'}}, $args{'dsym'};
            }
    
    # form params
    if ( exists $args{'notes'} ) {
                $form_params->{'notes'} = $self->{api_client}->to_form_value($args{'notes'});
    }
    
    # form params
    if ( exists $args{'notes_type'} ) {
                $form_params->{'notes_type'} = $self->{api_client}->to_form_value($args{'notes_type'});
    }
    
    # form params
    if ( exists $args{'notify'} ) {
                $form_params->{'notify'} = $self->{api_client}->to_form_value($args{'notify'});
    }
    
    # form params
    if ( exists $args{'status'} ) {
                $form_params->{'status'} = $self->{api_client}->to_form_value($args{'status'});
    }
    
    # form params
    if ( exists $args{'strategy'} ) {
                $form_params->{'strategy'} = $self->{api_client}->to_form_value($args{'strategy'});
    }
    
    # form params
    if ( exists $args{'tags'} ) {
                $form_params->{'tags'} = $self->{api_client}->to_form_value($args{'tags'});
    }
    
    # form params
    if ( exists $args{'teams'} ) {
                $form_params->{'teams'} = $self->{api_client}->to_form_value($args{'teams'});
    }
    
    # form params
    if ( exists $args{'users'} ) {
                $form_params->{'users'} = $self->{api_client}->to_form_value($args{'users'});
    }
    
    # form params
    if ( exists $args{'mandatory'} ) {
                $form_params->{'mandatory'} = $self->{api_client}->to_form_value($args{'mandatory'});
    }
    
    # form params
    if ( exists $args{'release_type'} ) {
                $form_params->{'release_type'} = $self->{api_client}->to_form_value($args{'release_type'});
    }
    
    # form params
    if ( exists $args{'private'} ) {
                $form_params->{'private'} = $self->{api_client}->to_form_value($args{'private'});
    }
    
    # form params
    if ( exists $args{'owner_id'} ) {
                $form_params->{'owner_id'} = $self->{api_client}->to_form_value($args{'owner_id'});
    }
    
    # form params
    if ( exists $args{'commit_sha'} ) {
                $form_params->{'commit_sha'} = $self->{api_client}->to_form_value($args{'commit_sha'});
    }
    
    # form params
    if ( exists $args{'build_server_url'} ) {
                $form_params->{'build_server_url'} = $self->{api_client}->to_form_value($args{'build_server_url'});
    }
    
    # form params
    if ( exists $args{'repository_url'} ) {
                $form_params->{'repository_url'} = $self->{api_client}->to_form_value($args{'repository_url'});
    }
    
    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(token )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('App', $response);
    return $_response_object;
}

1;
