package junitbook;

import java.util.HashMap;
import java.util.Map;

/**
 * The program
 *
 * @author wuguangsheng
 * @version V1.0 on 16/4/20
 */
public class DefaultController implements Controller {
    private Map requestHandlers = new HashMap();

    protected RequestHandler getHandler(Request request) {
        if (!this.requestHandlers.containsKey(request.getName())) {
            String message = "Cannot find handler for request name"
                + "[" + request.getName() + "]";
            throw new RuntimeException(message);
        }
        return (RequestHandler) this.requestHandlers.get(
            request.getName());
    }

    public Response processRequest(Request request) {
        Response response;
        try {
            response = getHandler(request).process(request);
        } catch (Exception exception) {
            response = new ErrorResponse(request, exception);
        }
        return response;
    }

    public void addHandler(Request request, RequestHandler requestHandler) {
        if (this.requestHandlers.containsKey(request.getName())) {
            throw new RuntimeException("A request handler has" + "[" +
                request.getName() + "]");
        } else {
            this.requestHandlers.put(request.getName(), requestHandler);
        }
    }
}
