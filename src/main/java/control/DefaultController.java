package control;

import java.util.HashMap;
import java.util.Map;

/**
 * The program is a controller class. This class is a component that interacts with the
 * customer to control and manage each request, and it is used for both the presentation
 * layer and the business layer model. In a general way, the controllers do these things.
 * 1. accept the request.
 * 2. to perform common calculations on request.
 * 3. select the appropriate request processor.
 * 4. routing requests in order to enable the processor to execute the related business
 * logic.
 * 5. may provide a top-level processor for handling errors and exceptions.
 *
 * @author wuguangsheng
 * @version V1.0 on 16/4/20
 */
public class DefaultController implements Controller {
    /**
     * Declare HashMap, as a request handler for the registry.
     */
    private Map requestHandlers = new HashMap();
    /**
     *  Add a protection method getHandler, used to obtain the
     *  specified request RequestHandler.
     */
    protected RequestHandler getHandler(Request request) {
        /**
         * If the RequestHandler is not registered, it throws a
         * request exception, as this is a programming error.
         */
        if (!this.requestHandlers.containsKey(request.getName())) {
            String message = "Cannot find handler for request name"
                + "[" + request.getName() + "]";
            throw new RuntimeException(message);
        }
        /**
         * Returns a processor corresponding to the caller.
         */
        return (RequestHandler) this.requestHandlers.get(
            request.getName());
    }
    /**
     * The request is assigned to the corresponding processor,
     * and the processor Response returned to the caller. If an exception
     * occurs, the ErrorResponse class will catch it.
     */
    public Response processRequest(Request request) {
        Response response;
        try {
            response = getHandler(request).process(request);
        } catch (Exception exception) {
            response = new ErrorResponse(request, exception);
        }
        return response;
    }
    /**
     * Register a new processor. Check whether the processor's name has been
     * registered, if it has been registered, then throws an exception.
     */
    public void addHandler(Request request, RequestHandler requestHandler) {
        if (this.requestHandlers.containsKey(request.getName())) {
            throw new RuntimeException("A request handler has" + "[" +
                request.getName() + "]");
        } else {
            this.requestHandlers.put(request.getName(), requestHandler);
        }
    }
}
