package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f112453a;

    /* renamed from: b  reason: collision with root package name */
    public String f112454b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f112455c;

    static {
        Covode.recordClassIndex(72268);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f112453a, bVar.f112453a) && l.a(this.f112454b, bVar.f112454b) && l.a(this.f112455c, bVar.f112455c);
    }

    public final int hashCode() {
        String str = this.f112453a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112454b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f112455c;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CommonLogItem(type='" + this.f112453a + "', subType='" + this.f112454b + "', log=" + this.f112455c + ')';
    }

    public b(String str, String str2, JSONObject jSONObject) {
        l.d(str, "");
        l.d(str2, "");
        l.d(jSONObject, "");
        this.f112453a = str;
        this.f112454b = str2;
        this.f112455c = jSONObject;
    }
}
