package org.eclipse.mat.json;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.mat.json.JSONStringer;

public class JSONArray {
    private final List<Object> values;

    static {
        Covode.recordClassIndex(106454);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public int length() {
        return this.values.size();
    }

    public JSONArray() {
        this.values = new ArrayList();
    }

    public String toString() {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            writeTo(jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean optBoolean(int i2) {
        return optBoolean(i2, false);
    }

    public double optDouble(int i2) {
        return optDouble(i2, Double.NaN);
    }

    public int optInt(int i2) {
        return optInt(i2, 0);
    }

    public long optLong(int i2) {
        return optLong(i2, 0);
    }

    public String optString(int i2) {
        return optString(i2, "");
    }

    public JSONArray put(Object obj) {
        this.values.add(obj);
        return this;
    }

    public boolean isNull(int i2) {
        Object opt = opt(i2);
        if (opt == null || opt == JSONObject.NULL) {
            return true;
        }
        return false;
    }

    public JSONArray optJSONArray(int i2) {
        Object opt = opt(i2);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i2) {
        Object opt = opt(i2);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public JSONArray put(double d2) {
        this.values.add(Double.valueOf(JSON.checkDouble(d2)));
        return this;
    }

    public JSONArray(String str) {
        this(new JSONTokener(str));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JSONArray) || !((JSONArray) obj).values.equals(this.values)) {
            return false;
        }
        return true;
    }

    public boolean getBoolean(int i2) {
        Object obj = get(i2);
        Boolean bool = JSON.toBoolean(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "boolean");
    }

    public double getDouble(int i2) {
        Object obj = get(i2);
        Double d2 = JSON.toDouble(obj);
        if (d2 != null) {
            return d2.doubleValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "double");
    }

    public int getInt(int i2) {
        Object obj = get(i2);
        Integer integer = JSON.toInteger(obj);
        if (integer != null) {
            return integer.intValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "int");
    }

    public JSONArray getJSONArray(int i2) {
        Object obj = get(i2);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "JSONArray");
    }

    public JSONObject getJSONObject(int i2) {
        Object obj = get(i2);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "JSONObject");
    }

    public long getLong(int i2) {
        Object obj = get(i2);
        Long l2 = JSON.toLong(obj);
        if (l2 != null) {
            return l2.longValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "long");
    }

    public String getString(int i2) {
        Object obj = get(i2);
        String json = JSON.toString(obj);
        if (json != null) {
            return json;
        }
        throw JSON.typeMismatch(Integer.valueOf(i2), obj, "String");
    }

    public Object opt(int i2) {
        if (i2 < 0 || i2 >= this.values.size()) {
            return null;
        }
        return this.values.get(i2);
    }

    public JSONArray put(int i2) {
        this.values.add(Integer.valueOf(i2));
        return this;
    }

    public String toString(int i2) {
        JSONStringer jSONStringer = new JSONStringer(i2);
        writeTo(jSONStringer);
        return jSONStringer.toString();
    }

    /* access modifiers changed from: package-private */
    public void writeTo(JSONStringer jSONStringer) {
        jSONStringer.array();
        for (Object obj : this.values) {
            jSONStringer.value(obj);
        }
        jSONStringer.endArray();
    }

    public JSONArray(Collection collection) {
        this();
        this.values.addAll(collection);
    }

    public String join(String str) {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.open(JSONStringer.Scope.NULL, "");
        int size = this.values.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                jSONStringer.out.append(str);
            }
            jSONStringer.value(this.values.get(i2));
        }
        JSONStringer.Scope scope = JSONStringer.Scope.NULL;
        jSONStringer.close(scope, scope, "");
        return jSONStringer.out.toString();
    }

    public JSONObject toJSONObject(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        int min = Math.min(jSONArray.length(), this.values.size());
        if (min == 0) {
            return null;
        }
        for (int i2 = 0; i2 < min; i2++) {
            jSONObject.put(JSON.toString(jSONArray.opt(i2)), opt(i2));
        }
        return jSONObject;
    }

    public JSONArray(JSONTokener jSONTokener) {
        Object nextValue = jSONTokener.nextValue();
        if (nextValue instanceof JSONArray) {
            this.values = ((JSONArray) nextValue).values;
            return;
        }
        throw JSON.typeMismatch(nextValue, "JSONArray");
    }

    public Object get(int i2) {
        try {
            Object obj = this.values.get(i2);
            if (obj != null) {
                return obj;
            }
            throw new JSONException("Value at " + i2 + " is null.");
        } catch (IndexOutOfBoundsException unused) {
            throw new JSONException("Index " + i2 + " out of range [0.." + this.values.size() + ")");
        }
    }

    public JSONArray put(long j2) {
        this.values.add(Long.valueOf(j2));
        return this;
    }

    public JSONArray put(boolean z) {
        this.values.add(Boolean.valueOf(z));
        return this;
    }

    public boolean optBoolean(int i2, boolean z) {
        Boolean bool = JSON.toBoolean(opt(i2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public double optDouble(int i2, double d2) {
        Double d3 = JSON.toDouble(opt(i2));
        if (d3 != null) {
            return d3.doubleValue();
        }
        return d2;
    }

    public int optInt(int i2, int i3) {
        Integer integer = JSON.toInteger(opt(i2));
        if (integer != null) {
            return integer.intValue();
        }
        return i3;
    }

    public long optLong(int i2, long j2) {
        Long l2 = JSON.toLong(opt(i2));
        if (l2 != null) {
            return l2.longValue();
        }
        return j2;
    }

    public String optString(int i2, String str) {
        String json = JSON.toString(opt(i2));
        if (json != null) {
            return json;
        }
        return str;
    }

    public JSONArray put(int i2, double d2) {
        return put(i2, Double.valueOf(d2));
    }

    public JSONArray put(int i2, int i3) {
        return put(i2, Integer.valueOf(i3));
    }

    public JSONArray put(int i2, long j2) {
        return put(i2, Long.valueOf(j2));
    }

    public JSONArray put(int i2, Object obj) {
        if (obj instanceof Number) {
            JSON.checkDouble(((Number) obj).doubleValue());
        }
        while (this.values.size() <= i2) {
            this.values.add(null);
        }
        this.values.set(i2, obj);
        return this;
    }

    public JSONArray put(int i2, boolean z) {
        return put(i2, Boolean.valueOf(z));
    }
}
