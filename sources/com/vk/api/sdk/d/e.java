package com.vk.api.sdk.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f156298a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f156299b = null;

    /* renamed from: c  reason: collision with root package name */
    public final String f156300c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f156301d = null;

    static {
        Covode.recordClassIndex(103799);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f156298a, eVar.f156298a) && l.a(this.f156299b, eVar.f156299b) && l.a(this.f156300c, eVar.f156300c) && l.a(this.f156301d, eVar.f156301d);
    }

    public final int hashCode() {
        Integer num = this.f156298a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.f156299b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f156300c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f156301d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "RequestTag(uid=" + this.f156298a + ", awaitNetwork=" + this.f156299b + ", reason=" + this.f156300c + ", retryCount=" + this.f156301d + ")";
    }

    private e() {
    }
}
