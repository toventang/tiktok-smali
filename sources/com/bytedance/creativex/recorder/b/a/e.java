package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f28179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28180b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28181c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28182d;

    static {
        Covode.recordClassIndex(16512);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28179a == eVar.f28179a && l.a(this.f28180b, eVar.f28180b) && l.a(this.f28181c, eVar.f28181c) && l.a(this.f28182d, eVar.f28182d);
    }

    public final int hashCode() {
        long j2 = this.f28179a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f28180b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28181c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28182d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "CameraChangedLogEvent(duration=" + this.f28179a + ", cameraType=" + this.f28180b + ", toStatus=" + this.f28181c + ", enterMethod=" + this.f28182d + ")";
    }

    public e(long j2, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        this.f28179a = j2;
        this.f28180b = str;
        this.f28181c = str2;
        this.f28182d = str3;
    }
}
