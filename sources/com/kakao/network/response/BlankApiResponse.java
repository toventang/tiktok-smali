package com.kakao.network.response;

import com.bytedance.covode.number.Covode;

public final class BlankApiResponse {
    public static final ResponseStringConverter<Boolean> CONVERTER = new ResponseStringConverter<Boolean>() {
        /* class com.kakao.network.response.BlankApiResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34378);
        }

        public final Boolean convert(String str) {
            return true;
        }
    };

    static {
        Covode.recordClassIndex(34377);
    }
}
