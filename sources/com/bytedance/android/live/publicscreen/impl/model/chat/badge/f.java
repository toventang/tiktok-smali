package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.facebook.imagepipeline.f.b;
import h.f.b.l;
import h.z;

public abstract class f extends i {

    /* renamed from: c  reason: collision with root package name */
    public c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f12442c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12443d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f12444e;

    /* renamed from: h  reason: collision with root package name */
    private final ImageModel f12445h;

    static {
        Covode.recordClassIndex(6834);
    }

    public final Bitmap d() {
        Bitmap bitmap = this.f12444e;
        if (bitmap == null) {
            l.a("bitmap");
        }
        return bitmap;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.i
    public final void f() {
        this.f12443d = false;
        c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f12442c;
        if (cVar != null) {
            cVar.g();
        }
    }

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12446a;

        static {
            Covode.recordClassIndex(6835);
        }

        /* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.f$a$a  reason: collision with other inner class name */
        static final class RunnableC0261a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f12447a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f12448b;

            static {
                Covode.recordClassIndex(6836);
            }

            RunnableC0261a(a aVar, Bitmap bitmap) {
                this.f12447a = aVar;
                this.f12448b = bitmap;
            }

            public final void run() {
                f fVar = this.f12447a.f12446a;
                Bitmap bitmap = this.f12448b;
                l.d(bitmap, "");
                fVar.f12444e = bitmap;
                this.f12447a.f12446a.f12451g.invoke(this.f12447a.f12446a);
                this.f12447a.f12446a.f12443d = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.f12446a = fVar;
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            l.d(cVar, "");
            cVar.g();
            this.f12446a.f12443d = false;
        }

        @Override // com.facebook.imagepipeline.f.b
        public final void a(Bitmap bitmap) {
            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f12446a.f12442c;
            if (cVar == null || !cVar.b() || bitmap == null || bitmap.isRecycled()) {
                this.f12446a.f12443d = false;
            } else {
                this.f12446a.f12450f.post(new RunnableC0261a(this, bitmap));
            }
            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar2 = this.f12446a.f12442c;
            if (cVar2 != null) {
                cVar2.g();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.i
    public final void e() {
        if (this.f12444e == null && !this.f12443d) {
            this.f12443d = true;
            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f12442c;
            if (cVar != null) {
                cVar.g();
            }
            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a2 = k.a(this.f12445h, -1, -1);
            this.f12442c = a2;
            if (a2 != null) {
                a2.a(new a(this), com.facebook.common.b.a.f47054a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, Handler handler, ImageModel imageModel, h.f.a.b<? super i, z> bVar) {
        super(gVar, handler, bVar);
        l.d(gVar, "");
        l.d(handler, "");
        l.d(imageModel, "");
        l.d(bVar, "");
        this.f12445h = imageModel;
    }
}
