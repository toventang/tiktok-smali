package com.bytedance.falconx.c;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(16924);
    }

    public static String a(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".json")) {
            return "application/json";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }
}
