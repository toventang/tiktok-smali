package com.he.lynx.loader;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface MediaLoader {

    public static class RequestParams {
        public boolean audio;
        public boolean effect;
        public FacingMode facingMode = FacingMode.USER;
        public boolean video;

        static {
            Covode.recordClassIndex(34214);
        }
    }

    public interface Responder {
        static {
            Covode.recordClassIndex(34215);
        }

        void onResponse(boolean z);
    }

    static {
        Covode.recordClassIndex(34212);
    }

    Uri loadMedia(String str);

    void onRequest(RequestParams requestParams, Responder responder);

    public enum FacingMode {
        USER,
        ENVIRONMENT;

        static {
            Covode.recordClassIndex(34213);
        }
    }
}
