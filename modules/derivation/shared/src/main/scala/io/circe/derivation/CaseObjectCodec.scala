package io.circe.derivation

import io.circe._

private[derivation] class CaseObjectDecoder[A](obj: A) extends Decoder[A] {
  def apply(c: HCursor): Decoder.Result[A] =
    Right(obj)
}

private[derivation] class CaseObjectEncoder[A] extends Encoder.AsObject[A] {
  def encodeObject(a: A): JsonObject = JsonObject()
}

private[derivation] class CaseObjectCodec[A](obj: A) extends Codec.AsObject[A] {
  def apply(c: HCursor): Decoder.Result[A] =
    Right(obj)

  def encodeObject(a: A): JsonObject = JsonObject()
}
