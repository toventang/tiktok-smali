package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f135923a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f135924b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f135925c;

    /* renamed from: d  reason: collision with root package name */
    public final int f135926d;

    /* renamed from: e  reason: collision with root package name */
    public final int f135927e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f135928f;

    static {
        Covode.recordClassIndex(88820);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135924b == aVar.f135924b && this.f135925c == aVar.f135925c && this.f135926d == aVar.f135926d && this.f135927e == aVar.f135927e && l.a(this.f135928f, aVar.f135928f);
    }

    public final int hashCode() {
        boolean z = this.f135924b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f135925c) {
            i2 = 0;
        }
        int i7 = (((((i6 + i2) * 31) + this.f135926d) * 31) + this.f135927e) * 31;
        Boolean bool = this.f135928f;
        return i7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EffectSdkInfo(isUploadPic=" + this.f135924b + ", isMultiSelect=" + this.f135925c + ", minImageCount=" + this.f135926d + ", maxImageCount=" + this.f135927e + ", isSupportGiphy=" + this.f135928f + ")";
    }

    public /* synthetic */ a(boolean z, boolean z2, int i2, int i3) {
        this(z, z2, i2, i3, false);
    }

    private a(boolean z, boolean z2, int i2, int i3, Boolean bool) {
        this.f135924b = z;
        this.f135925c = z2;
        this.f135926d = i2;
        this.f135927e = i3;
        this.f135928f = bool;
    }
}
