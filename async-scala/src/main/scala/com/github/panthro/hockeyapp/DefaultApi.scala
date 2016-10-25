package com.github.panthro.hockeyapp

import io.swagger.client.model.Apps
import io.swagger.client.model.App
import java.io.File
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class DefaultApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def appsGet()(implicit reader: ClientResponseReader[Apps]): Future[Apps] = {
    // create path and map variables
    val path = (addFmt("/apps"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def appsUploadPost(ipa: File,
      dsym: Option[File] = None,
      notes: Option[String] = None,
      notesType: Option[Integer] = None,
      notify: Option[Integer] = None,
      status: Option[Integer] = None,
      strategy: Option[String] = None,
      tags: Option[List[String]] = None,
      teams: Option[List[Integer]] = None,
      users: Option[List[Integer]] = None,
      mandatory: Option[Integer] = None,
      releaseType: Option[Integer] = None,
      _private: Option[Boolean] = None,
      ownerId: Option[Integer] = None,
      commitSha: Option[String] = None,
      buildServerUrl: Option[String] = None,
      repositoryUrl: Option[String] = None
      )(implicit reader: ClientResponseReader[App]): Future[App] = {
    // create path and map variables
    val path = (addFmt("/apps/upload"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (ipa == null) throw new Exception("Missing required parameter 'ipa' when calling DefaultApi->appsUploadPost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
