<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/api/2/apps', function(Application $app, Request $request) {
            
            
            return new Response('How about implementing appsGet as a GET method ?');
            });


$app->POST('/api/2/apps/upload', function(Application $app, Request $request) {
            
            $ipa = $request->get('ipa');    $dsym = $request->get('dsym');    $notes = $request->get('notes');    $notes_type = $request->get('notes_type');    $notify = $request->get('notify');    $status = $request->get('status');    $strategy = $request->get('strategy');    $tags = $request->get('tags');    $teams = $request->get('teams');    $users = $request->get('users');    $mandatory = $request->get('mandatory');    $release_type = $request->get('release_type');    $private = $request->get('private');    $owner_id = $request->get('owner_id');    $commit_sha = $request->get('commit_sha');    $build_server_url = $request->get('build_server_url');    $repository_url = $request->get('repository_url');    
            return new Response('How about implementing appsUploadPost as a POST method ?');
            });


$app->run();
