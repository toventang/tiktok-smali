package com.kakao.network.storage;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.storage.ImageInfo;

public class ImageUploadResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<ImageUploadResponse> CONVERTER = new ResponseStringConverter<ImageUploadResponse>() {
        /* class com.kakao.network.storage.ImageUploadResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34400);
        }

        public final ImageUploadResponse convert(String str) {
            return new ImageUploadResponse(str);
        }
    };
    private ImageInfo original = getImageInfo(getBody().getBody("infos").getBody(ImageInfo.ImageSize.ORIGINAL.getValue()));

    public ImageInfo getOriginal() {
        return this.original;
    }

    static {
        Covode.recordClassIndex(34399);
    }

    public ImageUploadResponse(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    public ImageInfo getImageInfo(ResponseBody responseBody) {
        return new ImageInfo(responseBody.getString("url"), Integer.valueOf(responseBody.getInt("length")), responseBody.getString("content_type"), Integer.valueOf(responseBody.getInt("width")), Integer.valueOf(responseBody.getInt("height")));
    }
}
