package com.kakao.network.storage;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseStringConverter;

public class ImageDeleteResponse {
    public static final ResponseStringConverter<ImageDeleteResponse> CONVERTER = new ResponseStringConverter<ImageDeleteResponse>() {
        /* class com.kakao.network.storage.ImageDeleteResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34393);
        }

        public final ImageDeleteResponse convert(String str) {
            return new ImageDeleteResponse();
        }
    };

    ImageDeleteResponse() {
    }

    static {
        Covode.recordClassIndex(34392);
    }
}
