package example;

import com.amazonaws.services.lambda.runtime.*;
import com.amazonaws.services.lambda.runtime.events.*;

public class JavaHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent requestEvent, Context context) {

        ScalaHandler.Response response = ScalaHandler.handle(requestEvent, context);

        return new APIGatewayProxyResponseEvent()
            .withBody(response.body())
            .withStatusCode(response.statusCode())
            .withHeaders(response.headers());
    }
}
