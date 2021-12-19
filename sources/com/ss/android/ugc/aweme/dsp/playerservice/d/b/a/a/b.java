package com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f83482a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83483b;

    /* renamed from: c  reason: collision with root package name */
    public final a f83484c;

    static {
        Covode.recordClassIndex(52099);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f83482a, bVar.f83482a) && l.a(this.f83483b, bVar.f83483b) && l.a(this.f83484c, bVar.f83484c);
    }

    public final int hashCode() {
        String str = this.f83482a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83483b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        a aVar = this.f83484c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PreloadedModel(key=" + this.f83482a + ", filePath=" + this.f83483b + ", type=" + this.f83484c + ")";
    }

    public b(String str, String str2, a aVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(aVar, "");
        this.f83482a = str;
        this.f83483b = str2;
        this.f83484c = aVar;
    }
}
