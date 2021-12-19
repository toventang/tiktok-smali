package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    final t<Integer> f125099a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    final t<Integer> f125100b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    final t<Bitmap> f125101c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Bitmap> f125102d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    final t<Bitmap> f125103e = new t<>();

    static {
        Covode.recordClassIndex(82178);
    }

    public final void b(Bitmap bitmap) {
        this.f125102d.setValue(bitmap);
    }

    public final void c(Bitmap bitmap) {
        this.f125103e.setValue(bitmap);
    }

    public final void a(int i2) {
        this.f125099a.setValue(Integer.valueOf(i2));
    }

    public final void a(Bitmap bitmap) {
        l.d(bitmap, "");
        this.f125101c.setValue(bitmap);
    }
}
