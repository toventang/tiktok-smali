package com.facebook.imagepipeline.n;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;

public final class i implements ak<com.facebook.common.h.a<c>> {

    /* renamed from: a  reason: collision with root package name */
    private final ak<com.facebook.common.h.a<c>> f48324a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48325b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48326c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f48327d;

    static {
        Covode.recordClassIndex(29156);
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<com.facebook.common.h.a<c>> kVar, al alVar) {
        if (!alVar.f() || this.f48327d) {
            this.f48324a.a(new a(kVar, this.f48325b, this.f48326c), alVar);
        } else {
            this.f48324a.a(kVar, alVar);
        }
    }

    static class a extends n<com.facebook.common.h.a<c>, com.facebook.common.h.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        private final int f48328a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48329b;

        static {
            Covode.recordClassIndex(29157);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final /* synthetic */ void a(Object obj, int i2) {
            c cVar;
            Bitmap bitmap;
            int rowBytes;
            com.facebook.common.h.a aVar = (com.facebook.common.h.a) obj;
            if (aVar != null && aVar.d() && (cVar = (c) aVar.a()) != null && !cVar.a() && (cVar instanceof d) && (bitmap = ((d) cVar).f47984a) != null && (rowBytes = bitmap.getRowBytes() * bitmap.getHeight()) >= this.f48328a && rowBytes <= this.f48329b) {
                bitmap.prepareToDraw();
            }
            this.f48362e.b(aVar, i2);
        }

        a(k<com.facebook.common.h.a<c>> kVar, int i2, int i3) {
            super(kVar);
            this.f48328a = i2;
            this.f48329b = i3;
        }
    }

    public i(ak<com.facebook.common.h.a<c>> akVar, int i2, int i3, boolean z) {
        boolean z2;
        if (i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.facebook.common.d.i.a(z2);
        this.f48324a = (ak) com.facebook.common.d.i.a(akVar);
        this.f48325b = i2;
        this.f48326c = i3;
        this.f48327d = z;
    }
}
