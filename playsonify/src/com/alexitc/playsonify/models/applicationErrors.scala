package com.alexitc.playsonify.models

trait ApplicationError
trait InputValidationError extends ApplicationError
trait ConflictError extends ApplicationError
trait NotFoundError extends ApplicationError
trait AuthenticationError extends ApplicationError
trait ServerError extends ApplicationError {
  // contains data private to the server
  def cause: Throwable
}

case class WrappedExceptionError(cause: Throwable) extends ServerError
