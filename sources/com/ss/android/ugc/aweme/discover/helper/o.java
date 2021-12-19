package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f81156a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f81157b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final int f81158c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final aj f81159d = null;

    static {
        Covode.recordClassIndex(50445);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f81156a == oVar.f81156a && this.f81157b == oVar.f81157b && this.f81158c == oVar.f81158c && l.a(this.f81159d, oVar.f81159d);
    }

    public final int hashCode() {
        int i2 = ((((this.f81156a * 31) + this.f81157b) * 31) + this.f81158c) * 31;
        aj ajVar = this.f81159d;
        return i2 + (ajVar != null ? ajVar.hashCode() : 0);
    }

    public final String toString() {
        return "MusicDownloadStatus(status=" + this.f81156a + ", percent=" + this.f81157b + ", errorMsg=" + this.f81158c + ", toVideoProgress=" + this.f81159d + ")";
    }

    private o() {
    }
}
