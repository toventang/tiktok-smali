package com.ss.android.ugc.aweme.cq.b.a;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.impl.d;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.f.b;
import h.f.b.l;
import h.z;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f78285a;

    /* renamed from: b  reason: collision with root package name */
    private final int f78286b = Math.min(com.bytedance.common.utility.c.c(com.bytedance.ies.ugc.appcontext.d.a()) / 3, 300);

    static {
        Covode.recordClassIndex(48543);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.d
    public final void a() {
        com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f78285a;
        if (cVar != null) {
            cVar.g();
        }
        this.f78285a = null;
    }

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f78287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f78288b;

        static {
            Covode.recordClassIndex(48544);
        }

        @Override // com.facebook.imagepipeline.f.b
        public final void a(Bitmap bitmap) {
            this.f78288b.invoke(bitmap);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            this.f78288b.invoke(null);
        }

        a(c cVar, h.f.a.b bVar) {
            this.f78287a = cVar;
            this.f78288b = bVar;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.d
    public final void a(String str, h.f.a.b<? super Bitmap, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f78285a;
        if (cVar != null) {
            cVar.g();
        }
        h e2 = k.a().e();
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
        int i2 = this.f78286b;
        a2.f48447d = new com.facebook.imagepipeline.common.d(i2, i2);
        com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = e2.a(a2.a(), (Object) null);
        a3.a(new a(this, bVar), com.facebook.common.b.a.f47054a);
        this.f78285a = a3;
    }
}
