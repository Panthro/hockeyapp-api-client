<?php
/**
 * Hockeyapp Public API wrapper
 * @version 0.0.2
 */

require_once __DIR__ . '/vendor/autoload.php';

$app = new Slim\App();


/**
 * GET appsGet
 * Summary: 
 * Notes: Gets &#x60;Apps&#x60;. 

 */
$app->GET('/api/2/apps', function($request, $response, $args) {
            
            
            
            
            $response->write('How about implementing appsGet as a GET method ?');
            return $response;
            });


/**
 * POST appsUploadPost
 * Summary: 
 * Notes: Upload a new app
 * Output-Formats: [application/json]
 */
$app->POST('/api/2/apps/upload', function($request, $response, $args) {
            
            
            $ipa = $args['ipa'];    $dsym = $args['dsym'];    $notes = $args['notes'];    $notesType = $args['notesType'];    $notify = $args['notify'];    $status = $args['status'];    $strategy = $args['strategy'];    $tags = $args['tags'];    $teams = $args['teams'];    $users = $args['users'];    $mandatory = $args['mandatory'];    $releaseType = $args['releaseType'];    $private = $args['private'];    $ownerId = $args['ownerId'];    $commitSha = $args['commitSha'];    $buildServerUrl = $args['buildServerUrl'];    $repositoryUrl = $args['repositoryUrl'];    
            
            $response->write('How about implementing appsUploadPost as a POST method ?');
            return $response;
            });



$app->run();
