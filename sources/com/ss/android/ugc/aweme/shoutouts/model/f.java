package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class f {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f133220a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f133221b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f133222c;
    @c(a = "total")

    /* renamed from: d  reason: collision with root package name */
    public final int f133223d;
    @c(a = "ratings")

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<e> f133224e;

    static {
        Covode.recordClassIndex(87118);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f133220a == fVar.f133220a && l.a(this.f133221b, fVar.f133221b) && this.f133222c == fVar.f133222c && this.f133223d == fVar.f133223d && l.a(this.f133224e, fVar.f133224e);
    }

    public final int hashCode() {
        int i2 = this.f133220a * 31;
        String str = this.f133221b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f133222c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (((hashCode + i4) * 31) + this.f133223d) * 31;
        ArrayList<e> arrayList = this.f133224e;
        if (arrayList != null) {
            i3 = arrayList.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "ShoutoutsProductRatingListResp(statusCode=" + this.f133220a + ", statusMsg=" + this.f133221b + ", hasMore=" + this.f133222c + ", total=" + this.f133223d + ", ratings=" + this.f133224e + ")";
    }
}
