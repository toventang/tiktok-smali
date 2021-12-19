package com.ss.android.ugc.aweme.bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.specact.a.a;
import h.f.b.l;
import java.util.Arrays;

public final class b {
    @c(a = "round_robin_interval")

    /* renamed from: a  reason: collision with root package name */
    public final Long f68658a = null;
    @c(a = "rand_time")

    /* renamed from: b  reason: collision with root package name */
    public final Long f68659b = null;
    @c(a = "popups")

    /* renamed from: c  reason: collision with root package name */
    public final e[] f68660c = null;
    @c(a = "notice")

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.specact.api.b[] f68661d = null;
    @c(a = "activity_video_resource")

    /* renamed from: e  reason: collision with root package name */
    public final a[] f68662e = null;

    static {
        Covode.recordClassIndex(42255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f68658a, bVar.f68658a) && l.a(this.f68659b, bVar.f68659b) && l.a(this.f68660c, bVar.f68660c) && l.a(this.f68661d, bVar.f68661d) && l.a(this.f68662e, bVar.f68662e);
    }

    public final int hashCode() {
        Long l2 = this.f68658a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Long l3 = this.f68659b;
        int hashCode2 = (hashCode + (l3 != null ? l3.hashCode() : 0)) * 31;
        e[] eVarArr = this.f68660c;
        int hashCode3 = (hashCode2 + (eVarArr != null ? Arrays.hashCode(eVarArr) : 0)) * 31;
        com.ss.android.ugc.aweme.specact.api.b[] bVarArr = this.f68661d;
        int hashCode4 = (hashCode3 + (bVarArr != null ? Arrays.hashCode(bVarArr) : 0)) * 31;
        a[] aVarArr = this.f68662e;
        if (aVarArr != null) {
            i2 = Arrays.hashCode(aVarArr);
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "KproActivityResponseData(interval=" + this.f68658a + ", randTime=" + this.f68659b + ", popupSettings=" + Arrays.toString(this.f68660c) + ", mesEntraSettings=" + Arrays.toString(this.f68661d) + ", activityVideoResource=" + Arrays.toString(this.f68662e) + ")";
    }

    private b() {
    }
}
