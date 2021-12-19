package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseBody {
    private JSONObject json;
    private int statusCode;

    static {
        Covode.recordClassIndex(34383);
    }

    public static class ResponseBodyException extends RuntimeException {
        private static final long serialVersionUID = 8171429617556607125L;

        static {
            Covode.recordClassIndex(34384);
        }

        public ResponseBodyException() {
        }

        public ResponseBodyException(Exception exc) {
            super(exc);
        }

        public ResponseBodyException(String str) {
            super(str);
        }
    }

    public JSONObject getJson() {
        return this.json;
    }

    public String toString() {
        return this.json.toString();
    }

    private Iterator<String> getKeys() {
        JSONObject jSONObject = this.json;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.keys();
    }

    public boolean has(String str) {
        return this.json.has(str);
    }

    public JSONArray getJSONArray(String str) {
        try {
            return (JSONArray) getOrThrow(str);
        } catch (ResponseBodyException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ResponseBodyException(e3);
        }
    }

    public JSONObject getJSONObject(String str) {
        try {
            return (JSONObject) getOrThrow(str);
        } catch (ResponseBodyException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ResponseBodyException(e3);
        }
    }

    public String getString(String str) {
        try {
            return (String) getOrThrow(str);
        } catch (Exception e2) {
            throw new ResponseBodyException(e2);
        }
    }

    public ResponseBody(String str) {
        try {
            this.json = new JSONObject(str);
        } catch (JSONException e2) {
            throw new ResponseBodyException(e2);
        }
    }

    private Object getOrThrow(String str) {
        Object obj;
        try {
            obj = this.json.get(str);
        } catch (JSONException unused) {
            obj = null;
        }
        if (obj == null) {
            throw new NoSuchElementException(str);
        } else if (obj == JSONObject.NULL) {
            return null;
        } else {
            return obj;
        }
    }

    public ResponseBodyArray getArray(String str) {
        try {
            return new ResponseBodyArray((JSONArray) getOrThrow(str));
        } catch (ResponseBodyException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ResponseBodyException(e3);
        }
    }

    public ResponseBody getBody(String str) {
        try {
            return new ResponseBody((JSONObject) getOrThrow(str));
        } catch (Exception e2) {
            throw new ResponseBodyException(e2);
        }
    }

    public boolean getBoolean(String str) {
        try {
            return ((Boolean) getOrThrow(str)).booleanValue();
        } catch (Exception e2) {
            throw new ResponseBodyException(e2);
        }
    }

    public int getInt(String str) {
        try {
            return ((Integer) getOrThrow(str)).intValue();
        } catch (Exception e2) {
            throw new ResponseBodyException(e2);
        }
    }

    public static <T> Map<String, T> toMap(ResponseBody responseBody) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = responseBody.getKeys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object orThrow = responseBody.getOrThrow(next);
            if (orThrow instanceof JSONArray) {
                orThrow = ResponseBodyArray.toList(new ResponseBodyArray((JSONArray) orThrow));
            } else if (orThrow instanceof JSONObject) {
                orThrow = toMap(new ResponseBody((JSONObject) orThrow));
            }
            hashMap.put(next, orThrow);
        }
        return hashMap;
    }

    public long getLong(String str) {
        try {
            Object orThrow = getOrThrow(str);
            if (orThrow instanceof Integer) {
                return (long) ((Integer) orThrow).intValue();
            }
            if (orThrow instanceof Long) {
                return ((Long) orThrow).longValue();
            }
            throw new ResponseBodyException();
        } catch (ResponseBodyException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ResponseBodyException(e3);
        }
    }

    public ResponseBody(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.json = jSONObject;
            return;
        }
        throw new ResponseBodyException();
    }

    public ResponseBody(int i2, JSONObject jSONObject) {
        this.statusCode = i2;
        if (jSONObject != null) {
            this.json = jSONObject;
            return;
        }
        throw new ResponseBodyException();
    }

    public ResponseBodyArray optArray(String str, ResponseBodyArray responseBodyArray) {
        if (has(str)) {
            try {
                return getArray(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return responseBodyArray;
    }

    public ResponseBody optBody(String str, ResponseBody responseBody) {
        if (has(str)) {
            try {
                return getBody(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return responseBody;
    }

    public boolean optBoolean(String str, boolean z) {
        if (has(str)) {
            try {
                return getBoolean(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return z;
    }

    public int optInt(String str, int i2) {
        if (has(str)) {
            try {
                return getInt(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return i2;
    }

    public JSONArray optJSONArray(String str, JSONArray jSONArray) {
        if (has(str)) {
            try {
                return getJSONArray(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return jSONArray;
    }

    public JSONObject optJSONObject(String str, JSONObject jSONObject) {
        if (has(str)) {
            try {
                return getJSONObject(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return jSONObject;
    }

    public long optLong(String str, long j2) {
        if (has(str)) {
            try {
                return getLong(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return j2;
    }

    public String optString(String str, String str2) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (ResponseBodyException unused) {
            }
        }
        return str2;
    }

    public ResponseBody(int i2, byte[] bArr) {
        this.statusCode = i2;
        if (bArr == null) {
            throw new ResponseBodyException("Response body is null.");
        } else if (bArr.length != 0) {
            try {
                this.json = new JSONObject(new String(bArr));
            } catch (JSONException e2) {
                throw new ResponseBodyException(e2);
            }
        }
    }
}
