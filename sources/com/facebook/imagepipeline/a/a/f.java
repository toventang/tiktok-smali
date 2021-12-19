package com.facebook.imagepipeline.a.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import java.util.Collection;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f47653a;

    /* renamed from: b  reason: collision with root package name */
    public a<Bitmap> f47654b;

    /* renamed from: c  reason: collision with root package name */
    List<a<Bitmap>> f47655c;

    /* renamed from: d  reason: collision with root package name */
    public int f47656d;

    static {
        Covode.recordClassIndex(28888);
    }

    public final e a() {
        try {
            return new e(this);
        } finally {
            a.c(this.f47654b);
            this.f47654b = null;
            a.a((Iterable<? extends a<?>>) this.f47655c);
            this.f47655c = null;
        }
    }

    public f(c cVar) {
        this.f47653a = cVar;
    }

    public final f a(List<a<Bitmap>> list) {
        this.f47655c = a.a((Collection) list);
        return this;
    }
}
