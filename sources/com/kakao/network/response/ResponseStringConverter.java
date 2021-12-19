package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class ResponseStringConverter<T> implements ResponseConverter<String, T> {
    public static final ResponseStringConverter<String> IDENTITY_CONVERTER = new ResponseStringConverter<String>() {
        /* class com.kakao.network.response.ResponseStringConverter.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34389);
        }

        public final String convert(String str) {
            return str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseConverter
        public final /* bridge */ /* synthetic */ String fromArray(JSONArray jSONArray, int i2) {
            return ResponseStringConverter.super.fromArray(jSONArray, i2);
        }
    };
    public static final ResponseStringConverter<Long> LONG_CONVERTER = new ResponseStringConverter<Long>() {
        /* class com.kakao.network.response.ResponseStringConverter.AnonymousClass2 */

        static {
            Covode.recordClassIndex(34390);
        }

        public final Long convert(String str) {
            return Long.valueOf(str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseConverter
        public final /* bridge */ /* synthetic */ String fromArray(JSONArray jSONArray, int i2) {
            return ResponseStringConverter.super.fromArray(jSONArray, i2);
        }
    };

    static {
        Covode.recordClassIndex(34388);
    }

    public List<T> convertList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            return convertList(new JSONArray(str));
        } catch (JSONException e2) {
            Logger.w(e2.toString());
            return arrayList;
        }
    }

    public List<T> convertList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(convert(fromArray(jSONArray, i2)));
        }
        return arrayList;
    }

    @Override // com.kakao.network.response.ResponseConverter
    public String fromArray(JSONArray jSONArray, int i2) {
        try {
            return jSONArray.getString(i2);
        } catch (JSONException unused) {
            return null;
        }
    }
}
