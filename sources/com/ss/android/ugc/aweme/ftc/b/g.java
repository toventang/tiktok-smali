package com.ss.android.ugc.aweme.ftc.b;

import androidx.fragment.app.e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.vesdk.VEListener;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final e f97492a;

    /* renamed from: b  reason: collision with root package name */
    final d f97493b;

    /* renamed from: c  reason: collision with root package name */
    final j f97494c;

    /* renamed from: d  reason: collision with root package name */
    public final a f97495d;

    /* renamed from: e  reason: collision with root package name */
    final ShortVideoContext f97496e;

    static {
        Covode.recordClassIndex(61940);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(new PrivacyCert(new com.bytedance.bpea.basics.j("1004"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.cz.a.d, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(61941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.cz.a.d dVar) {
            com.ss.android.ugc.aweme.cz.a.d dVar2 = dVar;
            l.d(dVar2, "");
            this.this$0.a(new PrivacyCert(new com.bytedance.bpea.basics.j("1003"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
            this.this$0.f97495d.a(dVar2.f79323a, dVar2.f79325c, dVar2.f79326d);
            this.this$0.f97495d.a(dVar2);
            return z.f158842a;
        }
    }

    public final void a(PrivacyCert privacyCert) {
        j jVar = this.f97494c;
        if (this.f97496e.f124757b.r != null) {
            jVar.E().e();
        }
        this.f97493b.ag();
        if (!this.f97493b.b()) {
            this.f97493b.a(false, privacyCert);
        }
    }

    static final class c implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97497a;

        static {
            Covode.recordClassIndex(61943);
        }

        c(g gVar) {
            this.f97497a = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
            if (r0 != false) goto L_0x00e1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0152  */
        @Override // com.ss.android.vesdk.VEListener.j
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r21) {
            /*
            // Method dump skipped, instructions count: 594
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.b.g.c.a(int):void");
        }
    }

    public g(e eVar, d dVar, j jVar, a aVar, ShortVideoContext shortVideoContext) {
        l.d(eVar, "");
        l.d(dVar, "");
        l.d(jVar, "");
        l.d(aVar, "");
        l.d(shortVideoContext, "");
        this.f97492a = eVar;
        this.f97493b = dVar;
        this.f97494c = jVar;
        this.f97495d = aVar;
        this.f97496e = shortVideoContext;
    }
}
