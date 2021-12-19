package com.facebook.a.b.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f46624a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46625b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46626c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46627d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46628e;

    /* renamed from: f  reason: collision with root package name */
    public final String f46629f;

    /* renamed from: g  reason: collision with root package name */
    public final String f46630g;

    /* renamed from: h  reason: collision with root package name */
    public final int f46631h;

    static {
        Covode.recordClassIndex(28425);
    }

    public enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(28426);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    c(JSONObject jSONObject) {
        this.f46624a = jSONObject.getString("class_name");
        this.f46625b = jSONObject.optInt("index", -1);
        this.f46626c = jSONObject.optInt("id");
        this.f46627d = jSONObject.optString("text");
        this.f46628e = jSONObject.optString("tag");
        this.f46629f = jSONObject.optString("description");
        this.f46630g = jSONObject.optString("hint");
        this.f46631h = jSONObject.optInt("match_bitmask");
    }
}
