package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f56736a;

    /* renamed from: b  reason: collision with root package name */
    private final d f56737b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56738c;

    static {
        Covode.recordClassIndex(35349);
    }

    public void c() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        d dVar = this;
        while (!dVar.f56738c) {
            dVar.f56736a = 0;
            dVar = dVar.f56737b;
            if (dVar == null) {
                return;
            }
        }
    }

    public final void b() {
        if (!this.f56738c) {
            d dVar = this.f56737b;
            if (dVar != null) {
                dVar.b();
            }
            c();
            this.f56738c = true;
        }
    }

    public d(d dVar) {
        this.f56737b = dVar;
    }

    public void b(Canvas canvas, Bitmap bitmap, b bVar) {
        d dVar = this.f56737b;
        if (dVar != null) {
            dVar.a(canvas, bitmap, bVar);
        }
    }

    public final void a(Canvas canvas, Bitmap bitmap, b bVar) {
        if (!this.f56738c) {
            this.f56736a++;
            b(canvas, bitmap, bVar);
        }
    }
}
