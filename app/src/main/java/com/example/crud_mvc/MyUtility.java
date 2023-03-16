package com.example.crud_mvc;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class MyUtility {
    public static String POST(String action, String callparam) {
        String sResult = "";
        Log.e("Post:==>", action+"=="+callparam);
        try {
            sResult=APICALLJSON(action,callparam);

        } catch (Exception e) {
            Log.d("Post", e.getMessage());
        }
        return sResult;
    }

    public static String APICALLJSON(String action, String body) {
        // you can use your api url
        final String urlPost="http://192.168.42.82/mywapi/api/tcrud/"+action;
        String sResult = "";
        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(urlPost);
            httppost.setHeader("Accept-Encoding", "gzip,deflate");
            httppost.setHeader("Content-Type", "application/json");
            //httppost.setHeader("Host", "www.example.com");
            httppost.setHeader("Host", "192.168.42.82");
            httppost.setHeader("Connection", "Keep-Alive");
            httppost.setHeader("User-Agent", "Apache-HttpClient/4.1.1");
            StringEntity se = new StringEntity(body);
            httppost.setEntity(se);
            HttpResponse resp = httpclient.execute(httppost);
            if(resp.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                HttpEntity ent = resp.getEntity();
                sResult = EntityUtils.toString(ent);
                return sResult;
            }
        } catch (Exception e) {
            Log.d("Post", e.getMessage());
        }
        finally {
            sResult="";
        }
        return sResult;
    }
}
