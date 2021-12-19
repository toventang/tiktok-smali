package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.g.c;
import com.facebook.imagepipeline.r.a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f47734a = new ImageDecodeOptionsBuilder().a();

    /* renamed from: b  reason: collision with root package name */
    public final int f47735b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f47736c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47737d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f47738e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47739f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f47740g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f47741h;

    /* renamed from: i  reason: collision with root package name */
    public Bitmap.Config f47742i;

    /* renamed from: j  reason: collision with root package name */
    public final c f47743j;

    /* renamed from: k  reason: collision with root package name */
    public final a f47744k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f47745l;

    static {
        Covode.recordClassIndex(28924);
    }

    public int hashCode() {
        int i2;
        int ordinal = ((((((((((((this.f47735b * 31) + (this.f47736c ? 1 : 0)) * 31) + (this.f47738e ? 1 : 0)) * 31) + (this.f47739f ? 1 : 0)) * 31) + (this.f47740g ? 1 : 0)) * 31) + (this.f47741h ? 1 : 0)) * 31) + this.f47742i.ordinal()) * 31;
        c cVar = this.f47743j;
        int i3 = 0;
        if (cVar != null) {
            i2 = cVar.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (ordinal + i2) * 31;
        a aVar = this.f47744k;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return com.a.a(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[]{Integer.valueOf(this.f47735b), Boolean.valueOf(this.f47736c), Boolean.valueOf(this.f47738e), Boolean.valueOf(this.f47739f), Boolean.valueOf(this.f47740g), Boolean.valueOf(this.f47741h), this.f47742i.name(), this.f47743j, this.f47744k});
    }

    public b(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.f47735b = imageDecodeOptionsBuilder.f47720a;
        this.f47736c = imageDecodeOptionsBuilder.f47721b;
        this.f47737d = imageDecodeOptionsBuilder.f47722c;
        this.f47738e = imageDecodeOptionsBuilder.f47723d;
        this.f47739f = imageDecodeOptionsBuilder.f47724e;
        this.f47740g = imageDecodeOptionsBuilder.f47725f;
        this.f47742i = imageDecodeOptionsBuilder.f47727h;
        this.f47743j = imageDecodeOptionsBuilder.f47728i;
        this.f47741h = imageDecodeOptionsBuilder.f47726g;
        this.f47744k = imageDecodeOptionsBuilder.f47729j;
        this.f47745l = imageDecodeOptionsBuilder.f47730k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f47736c == bVar.f47736c && this.f47738e == bVar.f47738e && this.f47739f == bVar.f47739f && this.f47740g == bVar.f47740g && this.f47741h == bVar.f47741h && this.f47742i == bVar.f47742i && this.f47743j == bVar.f47743j && this.f47744k == bVar.f47744k) {
            return true;
        }
        return false;
    }
}
