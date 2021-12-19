package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseBodyArray {
    private final JSONArray jsonArray;
    private int statusCode;

    static {
        Covode.recordClassIndex(34385);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int length() {
        return this.jsonArray.length();
    }

    public String toString() {
        return this.jsonArray.toString();
    }

    public Boolean getBoolean(int i2) {
        try {
            return (Boolean) getOrThrow(i2);
        } catch (Exception e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }

    public String getString(int i2) {
        try {
            return (String) getOrThrow(i2);
        } catch (Exception e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }

    public ResponseBodyArray(JSONArray jSONArray) {
        if (jSONArray != null) {
            this.jsonArray = jSONArray;
            return;
        }
        throw new ResponseBody.ResponseBodyException("Cannot instantiate ResponseBodyArray with null json array.");
    }

    private Object getOrThrow(int i2) {
        Object obj;
        try {
            obj = this.jsonArray.get(i2);
        } catch (JSONException unused) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    public ResponseBody getBody(int i2) {
        try {
            return new ResponseBody((JSONObject) getOrThrow(i2));
        } catch (ResponseBody.ResponseBodyException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ResponseBody.ResponseBodyException(e3);
        }
    }

    public int getInt(int i2) {
        try {
            return ((Integer) getOrThrow(i2)).intValue();
        } catch (Exception e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }

    public static <T> List<T> toList(ResponseBodyArray responseBodyArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < responseBodyArray.length(); i2++) {
            Object orThrow = responseBodyArray.getOrThrow(i2);
            if (orThrow instanceof JSONArray) {
                orThrow = toList(new ResponseBodyArray((JSONArray) orThrow));
            } else if (orThrow instanceof JSONObject) {
                orThrow = ResponseBody.toMap(new ResponseBody((JSONObject) orThrow));
            }
            arrayList.add(orThrow);
        }
        return arrayList;
    }

    public long getLong(int i2) {
        try {
            Object orThrow = getOrThrow(i2);
            if (orThrow instanceof Integer) {
                return (long) ((Integer) orThrow).intValue();
            }
            if (orThrow instanceof Long) {
                return ((Long) orThrow).longValue();
            }
            throw new ResponseBody.ResponseBodyException();
        } catch (Exception e2) {
            throw new ResponseBody.ResponseBodyException(e2);
        }
    }

    public ResponseBodyArray(int i2, JSONArray jSONArray) {
        this.statusCode = i2;
        if (jSONArray != null) {
            this.jsonArray = jSONArray;
            return;
        }
        throw new ResponseBody.ResponseBodyException();
    }

    public ResponseBodyArray(int i2, byte[] bArr) {
        this.statusCode = i2;
        if (bArr != null) {
            try {
                this.jsonArray = new JSONArray(new String(bArr));
            } catch (JSONException e2) {
                throw new ResponseBody.ResponseBodyException(e2);
            }
        } else {
            throw new ResponseBody.ResponseBodyException();
        }
    }
}
