package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f112449a;

    /* renamed from: b  reason: collision with root package name */
    public String f112450b;

    /* renamed from: c  reason: collision with root package name */
    public String f112451c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f112452d;

    static {
        Covode.recordClassIndex(72267);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f112449a, aVar.f112449a) && l.a(this.f112450b, aVar.f112450b) && l.a(this.f112451c, aVar.f112451c) && l.a(this.f112452d, aVar.f112452d);
    }

    public final int hashCode() {
        String str = this.f112449a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112450b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112451c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f112452d;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "AppLogItem(category='" + this.f112449a + "', tag='" + this.f112450b + "', label='" + this.f112451c + "', extJson=" + this.f112452d + ')';
    }

    public a(String str, String str2, String str3, JSONObject jSONObject) {
        l.d(str, "");
        l.d(str2, "");
        l.d(jSONObject, "");
        this.f112449a = str;
        this.f112450b = str2;
        this.f112451c = str3;
        this.f112452d = jSONObject;
    }
}
