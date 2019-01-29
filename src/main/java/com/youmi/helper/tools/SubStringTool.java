package com.youmi.helper.tools;

import java.net.URLEncoder;
import java.util.Map;

public class SubStringTool {
    public static String subURL(String url,Map<String,String> mapParameter ){
        StringBuffer urlSb=new StringBuffer();
        try{
            int size=mapParameter.size();
            int count=0;
            urlSb.append(url);
            urlSb.append("?");
            if(mapParameter!=null&&!mapParameter.isEmpty()){
                for (Map.Entry<String, String> entry : mapParameter.entrySet()) {
                    count++;
                    urlSb.append(entry.getKey());
                    urlSb.append("=");
                    urlSb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    if(count!=size){
                        urlSb.append("&");
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
        return urlSb.toString();
    }
}
