package com.alexitc.playsonify.models

import java.util.UUID

case class ErrorId(string: String) extends AnyVal

object ErrorId {
  def create: ErrorId = ErrorId(UUID.randomUUID().toString.replace("-", ""))
}
