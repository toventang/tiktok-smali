package com.ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f92620a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92621b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f92622c;

    /* renamed from: d  reason: collision with root package name */
    public final String f92623d;

    /* renamed from: e  reason: collision with root package name */
    public final int f92624e;

    /* renamed from: f  reason: collision with root package name */
    public final int f92625f;

    static {
        Covode.recordClassIndex(58707);
    }

    public static n a(Drawable drawable, int i2, boolean z, String str, int i3, int i4) {
        l.d(str, "");
        return new n(drawable, i2, z, str, i3, i4);
    }

    public static /* synthetic */ n a(n nVar, Drawable drawable, int i2, boolean z, String str, int i3, int i4, int i5) {
        int i6 = i4;
        int i7 = i3;
        Drawable drawable2 = drawable;
        int i8 = i2;
        boolean z2 = z;
        String str2 = str;
        if ((i5 & 1) != 0) {
            drawable2 = nVar.f92620a;
        }
        if ((i5 & 2) != 0) {
            i8 = nVar.f92621b;
        }
        if ((i5 & 4) != 0) {
            z2 = nVar.f92622c;
        }
        if ((i5 & 8) != 0) {
            str2 = nVar.f92623d;
        }
        if ((i5 & 16) != 0) {
            i7 = nVar.f92624e;
        }
        if ((i5 & 32) != 0) {
            i6 = nVar.f92625f;
        }
        return a(drawable2, i8, z2, str2, i7, i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f92620a, nVar.f92620a) && this.f92621b == nVar.f92621b && this.f92622c == nVar.f92622c && l.a(this.f92623d, nVar.f92623d) && this.f92624e == nVar.f92624e && this.f92625f == nVar.f92625f;
    }

    public final int hashCode() {
        Drawable drawable = this.f92620a;
        int i2 = 0;
        int hashCode = (((drawable != null ? drawable.hashCode() : 0) * 31) + this.f92621b) * 31;
        boolean z = this.f92622c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str = this.f92623d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((i6 + i2) * 31) + this.f92624e) * 31) + this.f92625f;
    }

    public final String toString() {
        return "VideoCommentState(commentImageDrawable=" + this.f92620a + ", commentGiftVisible=" + this.f92621b + ", commentGiftAnimate=" + this.f92622c + ", commentCountText=" + this.f92623d + ", commentCountVisible=" + this.f92624e + ", commentLayoutVisible=" + this.f92625f + ")";
    }

    public /* synthetic */ n() {
        this(null, 8, false, "", 8, 0);
    }

    private n(Drawable drawable, int i2, boolean z, String str, int i3, int i4) {
        l.d(str, "");
        this.f92620a = drawable;
        this.f92621b = i2;
        this.f92622c = z;
        this.f92623d = str;
        this.f92624e = i3;
        this.f92625f = i4;
    }
}
