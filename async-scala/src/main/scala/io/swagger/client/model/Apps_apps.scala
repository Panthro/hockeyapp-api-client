package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Apps_apps (
  title: Option[String],
bundle_identifier: Option[String],
public_identifier: Option[String],
device_family: Option[String],
minimum_os_version: Option[String],
release_type: Option[Integer],
status: Option[Integer],
platform: Option[String]
)
