package example

import scala.jdk.CollectionConverters._
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent

object ScalaHandler {

  def handle(request: APIGatewayProxyRequestEvent, context: Context): Response = {

    val body: String = request.getBody
    val headers: java.util.Map[String, String] = Map("Content-Type" -> "text/json").asJava
    val statusCode: Int = 200

    Response(body, headers, statusCode)
  }

  case class Response(body: String, headers: java.util.Map[String, String], statusCode: Int)
}
