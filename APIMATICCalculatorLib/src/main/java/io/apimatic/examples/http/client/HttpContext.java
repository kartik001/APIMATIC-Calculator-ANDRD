/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/12/2016
 */
package io.apimatic.examples.http.client;

import io.apimatic.examples.http.request.HttpRequest;
import io.apimatic.examples.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * GETTER for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * GETTER for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getRespone() {
        return _response;
    }
}