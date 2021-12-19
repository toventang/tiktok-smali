package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.d.c;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.f.b;
import h.f.b.l;
import h.z;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f83601a;

    /* renamed from: b  reason: collision with root package name */
    private final int f83602b = Math.min(com.bytedance.common.utility.c.c(d.a()) / 3, 300);

    static {
        Covode.recordClassIndex(52169);
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a$a  reason: collision with other inner class name */
    public static final class C1985a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f83617b;

        static {
            Covode.recordClassIndex(52170);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            this.f83617b.invoke(null);
        }

        @Override // com.facebook.imagepipeline.f.b
        public final void a(Bitmap bitmap) {
            MethodCollector.i(1873);
            if (bitmap != null) {
                this.f83617b.invoke(bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
                MethodCollector.o(1873);
                return;
            }
            this.f83617b.invoke(null);
            MethodCollector.o(1873);
        }

        C1985a(a aVar, h.f.a.b bVar) {
            this.f83616a = aVar;
            this.f83617b = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.c
    public final void a(String str, h.f.a.b<? super Bitmap, z> bVar) {
        l.d(bVar, "");
        c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar = this.f83601a;
        if (cVar != null) {
            cVar.g();
        }
        if (str != null) {
            h e2 = k.a().e();
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
            int i2 = this.f83602b;
            a2.f48447d = new com.facebook.imagepipeline.common.d(i2, i2);
            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = e2.a(a2.a(), (Object) null);
            a3.a(new C1985a(this, bVar), com.facebook.common.b.a.f47054a);
            this.f83601a = a3;
        }
    }
}
