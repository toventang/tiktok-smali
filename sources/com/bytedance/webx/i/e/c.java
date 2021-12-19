package com.bytedance.webx.i.e;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(28172);
    }

    public enum a {
        ApiFail("ApiRequest"),
        ApiResultError("ApiResultError"),
        Other("other");
        
        private String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(28173);
        }

        private a(String str) {
            this.type = str;
        }
    }
}
