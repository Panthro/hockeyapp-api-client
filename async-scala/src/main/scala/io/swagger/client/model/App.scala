package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class App (
  title: Option[String],
bundle_identifier: Option[String],
public_identifier: Option[String],
release_type: Option[Integer],
platform: Option[String]
)
