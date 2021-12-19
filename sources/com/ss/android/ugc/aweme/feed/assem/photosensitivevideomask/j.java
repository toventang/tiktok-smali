package com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j implements com.bytedance.assem.arch.viewModel.j {

    /* renamed from: a  reason: collision with root package name */
    public final int f92360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f92361b;

    /* renamed from: c  reason: collision with root package name */
    public final String f92362c;

    /* renamed from: d  reason: collision with root package name */
    public final int f92363d;

    /* renamed from: e  reason: collision with root package name */
    public final int f92364e;

    static {
        Covode.recordClassIndex(58409);
    }

    public static j a(int i2, String str, String str2, int i3, int i4) {
        return new j(i2, str, str2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f92360a == jVar.f92360a && l.a(this.f92361b, jVar.f92361b) && l.a(this.f92362c, jVar.f92362c) && this.f92363d == jVar.f92363d && this.f92364e == jVar.f92364e;
    }

    public final int hashCode() {
        int i2 = this.f92360a * 31;
        String str = this.f92361b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f92362c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((((hashCode + i3) * 31) + this.f92363d) * 31) + this.f92364e;
    }

    public final String toString() {
        return "PhotosensitiveVideoMaskState(contentVisible=" + this.f92360a + ", titleText=" + this.f92361b + ", contentText=" + this.f92362c + ", positiveButtonVisible=" + this.f92363d + ", negativeButtonVisible=" + this.f92364e + ")";
    }

    public /* synthetic */ j() {
        this(8, null, null, 8, 8);
    }

    private j(int i2, String str, String str2, int i3, int i4) {
        this.f92360a = i2;
        this.f92361b = str;
        this.f92362c = str2;
        this.f92363d = i3;
        this.f92364e = i4;
    }
}
