package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class JSONObjectConverter<T> implements ResponseConverter<JSONObject, T> {
    static {
        Covode.recordClassIndex(34380);
    }

    public abstract T convert(JSONObject jSONObject);

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
    public JSONObject fromArray(JSONArray jSONArray, int i2) {
        try {
            return jSONArray.getJSONObject(i2);
        } catch (JSONException unused) {
            return null;
        }
    }
}
