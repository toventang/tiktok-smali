package com.ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;
import org.json.JSONObject;

public final class g implements b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f74050e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f74051a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f74052b;

    /* renamed from: c  reason: collision with root package name */
    public final String f74053c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f74054d;

    static {
        Covode.recordClassIndex(45606);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f74051a, gVar.f74051a) && l.a(this.f74052b, gVar.f74052b) && l.a(this.f74053c, gVar.f74053c) && l.a(this.f74054d, gVar.f74054d);
    }

    public final int hashCode() {
        String str = this.f74051a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f74052b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str2 = this.f74053c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Object obj = this.f74054d;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "JsBridgeEvent(funcName=" + this.f74051a + ", params=" + this.f74052b + ", callbackId=" + this.f74053c + ", jsBridge=" + this.f74054d + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45607);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ g(String str, JSONObject jSONObject) {
        this(str, jSONObject, null, null);
    }

    public g(String str, JSONObject jSONObject, String str2, Object obj) {
        l.d(str, "");
        this.f74051a = str;
        this.f74052b = jSONObject;
        this.f74053c = str2;
        this.f74054d = obj;
    }
}
