/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/12/2016
 */
package io.apimatic.examples;
 
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Configuration {
    //The base Uri for API calls
    public static String baseUri = "https://examples.apimatic.io/apps/calculator";

    //retains status whether we have already initialized
    private static boolean initialized = false;
    private static RequestQueue requestQueue = null;

    //Initialization of configuration
    public static void initialize(Context context){
        if(initialized)
            throw new IllegalStateException("Already initialized");
        requestQueue = Volley.newRequestQueue(context);
    
        initialized = true;
    }

	// volley request queue needs to be initialized before use
    public static RequestQueue getRequestQueue() {
        if(!initialized)
            throw new IllegalStateException("Must initialize before accessing request queue");
        return requestQueue;
    }

}
