package io.swagger.client

import com.github.panthro.hockeyapp._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val default = new DefaultApi(client, config)
  

  def close() {
    client.close()
  }
}
