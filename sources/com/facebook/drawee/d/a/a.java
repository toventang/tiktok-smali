package com.facebook.drawee.d.a;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.c;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private long f47347a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f47348b = -1;

    /* renamed from: c  reason: collision with root package name */
    private b f47349c;

    static {
        Covode.recordClassIndex(28759);
    }

    public a(b bVar) {
        this.f47349c = bVar;
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onSubmit(String str, Object obj) {
        this.f47347a = System.currentTimeMillis();
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f47348b = currentTimeMillis;
        b bVar = this.f47349c;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f47347a);
        }
    }
}
