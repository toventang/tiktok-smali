package com.ss.android.ugc.aweme.sticker.repository.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f135492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135493b;

    /* renamed from: c  reason: collision with root package name */
    public final int f135494c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f135495d;

    static {
        Covode.recordClassIndex(88546);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f135492a, dVar.f135492a) && this.f135493b == dVar.f135493b && this.f135494c == dVar.f135494c && this.f135495d == dVar.f135495d;
    }

    public final int hashCode() {
        String str = this.f135492a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f135493b) * 31) + this.f135494c) * 31;
        boolean z = this.f135495d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "StickerPanelInfoFetcherRequest(category=" + this.f135492a + ", count=" + this.f135493b + ", cursor=" + this.f135494c + ", withCategoryEffects=" + this.f135495d + ")";
    }

    public /* synthetic */ d() {
        this("");
    }

    private d(String str) {
        l.d(str, "");
        this.f135492a = str;
        this.f135493b = 0;
        this.f135494c = 0;
        this.f135495d = true;
    }
}
