package com.bytedance.ugc.glue.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.UGCTools;
import com.bytedance.ugc.glue.json.UGCJson;
import java.lang.reflect.Type;
import org.json.JSONObject;

public class UGCSettingsItem<T> {
    private final T defaultValue;
    private final String key;
    private String lastString;
    private final Type type;
    private T value;

    static {
        Covode.recordClassIndex(27962);
    }

    public String getKey() {
        return this.key;
    }

    public T getValue() {
        if (!UGCTools.equal("", this.lastString)) {
            this.value = parse("", this.type);
            this.lastString = "";
        }
        T t = this.value;
        if (t == null) {
            return this.defaultValue;
        }
        return t;
    }

    public UGCSettingsItem(String str, T t) {
        this(str, t, t.getClass());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public T parse(String str, Type type2) {
        T t = null;
        if (UGCTools.isEmpty(str)) {
            return null;
        }
        if (type2 == String.class) {
            return str;
        }
        if (type2 == JSONObject.class) {
            return (T) UGCJson.jsonObject(str);
        }
        try {
            t = (T) UGCJson.fromJson(str, type2);
            return t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return t;
        }
    }

    public UGCSettingsItem(String str, T t, Type type2) {
        this.key = str;
        this.defaultValue = t;
        this.type = type2;
    }
}
