package com.facebook.imagepipeline.m;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.o.a;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f48018a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48019b;

    /* renamed from: c  reason: collision with root package name */
    private e f48020c;

    static {
        Covode.recordClassIndex(29034);
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public e getPostprocessorCacheKey() {
        if (this.f48020c == null) {
            this.f48020c = new j(com.a.a(null, "i%dr%d", new Object[]{Integer.valueOf(this.f48018a), Integer.valueOf(this.f48019b)}));
        }
        return this.f48020c;
    }

    public b(int i2) {
        this(i2, (byte) 0);
    }

    @Override // com.facebook.imagepipeline.o.a
    public void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.f48018a, this.f48019b);
    }

    private b(int i2, byte b2) {
        boolean z = true;
        i.a(true);
        i.a(i2 <= 0 ? false : z);
        this.f48018a = 3;
        this.f48019b = i2;
    }
}
