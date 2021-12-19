package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.filter.a.j;
import com.bytedance.creativex.recorder.filter.b.c;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ui.a.ah;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class ad extends com.bytedance.creativex.recorder.filter.b.c<ac> implements ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f131252a;

    static {
        Covode.recordClassIndex(85985);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(85988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ad adVar) {
            super(0);
            this.this$0 = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            T value = this.this$0.curSelectedFilter.f6468a.getValue();
            if (value != null) {
                this.this$0.setFilterChosen(value, "", false, false, true);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.a<ah> {
        final /* synthetic */ c.a $buildIn;
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(85986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ad adVar, c.a aVar) {
            super(0);
            this.this$0 = adVar;
            this.$buildIn = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            if (r2 != null) goto L_0x0050;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.ui.a.ah invoke() {
            /*
                r4 = this;
                java.lang.String r0 = "VideoRecordNewActivity"
                com.ss.android.ugc.aweme.filter.repository.internal.main.l r1 = com.ss.android.ugc.aweme.filter.repository.internal.main.l.a.a(r0)
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad$a$1 r0 = new com.ss.android.ugc.aweme.shortvideo.ui.a.ad$a$1
                r0.<init>()
                com.ss.android.ugc.aweme.filter.repository.a.m r3 = com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(r1, r0)
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad r0 = r4.this$0
                androidx.lifecycle.t<java.util.List<com.bytedance.creativex.recorder.filter.a.e>> r0 = r0.filterSources
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x003a
                java.util.Iterator r2 = r0.iterator()
            L_0x001f:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x005a
                java.lang.Object r1 = r2.next()
                r0 = r1
                com.bytedance.creativex.recorder.filter.a.e r0 = (com.bytedance.creativex.recorder.filter.a.e) r0
                boolean r0 = com.bytedance.creativex.recorder.filter.a.f.a(r0)
                if (r0 == 0) goto L_0x001f
            L_0x0032:
                com.bytedance.creativex.recorder.filter.a.e r1 = (com.bytedance.creativex.recorder.filter.a.e) r1
                if (r1 == 0) goto L_0x003a
                com.ss.android.ugc.aweme.filter.repository.a.m r2 = r1.f28228c
                if (r2 != 0) goto L_0x0050
            L_0x003a:
                com.bytedance.creativex.recorder.filter.b.c$a r0 = r4.$buildIn
                com.ss.android.ugc.aweme.filter.repository.a.n r1 = r0.f28244b
                com.ss.android.ugc.aweme.shortvideo.ui.a.ad r0 = r4.this$0
                com.bytedance.creativex.recorder.b.a.d r0 = r0.getCameraApiComponent()
                com.ss.android.ugc.asve.recorder.effect.a r0 = r0.z()
                com.ss.android.ugc.aweme.filter.repository.a.k r0 = com.bytedance.creativex.recorder.filter.e.a.a(r0)
                com.ss.android.ugc.aweme.filter.repository.a.m r2 = com.ss.android.ugc.aweme.filter.repository.internal.main.m.a(r1, r0)
            L_0x0050:
                com.bytedance.creativex.recorder.filter.b.c$a r0 = r4.$buildIn
                com.bytedance.creativex.recorder.filter.a.j r1 = r0.f28245c
                com.ss.android.ugc.aweme.shortvideo.ui.a.ah r0 = new com.ss.android.ugc.aweme.shortvideo.ui.a.ah
                r0.<init>(r3, r2, r1)
                return r0
            L_0x005a:
                r1 = 0
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.a.ad.a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        ah ahVar = (ah) this.f131252a.getValue();
        b bVar = new b(this);
        c cVar = new c(this);
        l.d(bVar, "");
        l.d(cVar, "");
        String str = ahVar.f131260a.get(g.a().r().h().b());
        if (str != null && !ahVar.f131261b.getBoolean("Filter_Data_Has_Migrated_".concat(String.valueOf(str)), false)) {
            new com.ss.android.ugc.aweme.filter.b(ah.d.f131266a, new ah.e(str)).a(new ah.b(ahVar, ahVar.f131264e.a(1), cVar, str, bVar), ah.c.f131265a);
        }
    }

    static final class c extends m implements h.f.a.b<String, z> {
        final /* synthetic */ ad this$0;

        static {
            Covode.recordClassIndex(85989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ad adVar) {
            super(1);
            this.this$0 = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            com.bytedance.creativex.recorder.filter.b.c.setChosenFilterFromStoreInternal$default(this.this$0, false, false, false, 6, null);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c
    public final void actualApplyFilter2Camera(com.bytedance.creativex.recorder.filter.a.b bVar) {
        if (getCameraApiComponent() instanceof com.bytedance.creativex.recorder.b.a.z) {
            d cameraApiComponent = getCameraApiComponent();
            Objects.requireNonNull(cameraApiComponent, "null cannot be cast to non-null type com.bytedance.creativex.recorder.camera.api.TikTokCameraApiComponent");
            com.bytedance.creativex.recorder.b.a.z zVar = (com.bytedance.creativex.recorder.b.a.z) cameraApiComponent;
            if (bVar == null) {
                zVar.a((FilterBean) this.curSelectedFilter.f6468a.getValue());
                return;
            }
            bVar.f28222a.setFilterFolder(bVar.f28224c);
            if (bVar.f28225d == null) {
                zVar.a(bVar.f28222a, (Float) null);
            } else {
                zVar.a(bVar.f28222a, bVar.f28225d);
            }
        } else {
            super.actualApplyFilter2Camera(bVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c
    public final void actualSaveDefaultFilte(FilterBean filterBean, j jVar) {
        l.d(filterBean, "");
        l.d(jVar, "");
        if (jVar instanceof com.bytedance.creativex.recorder.filter.b.d) {
            String resId = filterBean.getResId();
            l.b(resId, "");
            ((com.bytedance.creativex.recorder.filter.b.d) jVar).a(resId);
            return;
        }
        super.actualSaveDefaultFilte(filterBean, jVar);
    }

    @Override // com.bytedance.creativex.recorder.filter.b.c
    public final void actualSetFilterScroll(com.bytedance.creativex.recorder.filter.a.b bVar, com.bytedance.creativex.recorder.filter.a.b bVar2, float f2) {
        float f3;
        l.d(bVar, "");
        l.d(bVar2, "");
        d cameraApiComponent = getCameraApiComponent();
        if (!(cameraApiComponent instanceof com.bytedance.creativex.recorder.b.a.z)) {
            cameraApiComponent = null;
        }
        com.bytedance.creativex.recorder.b.a.z zVar = (com.bytedance.creativex.recorder.b.a.z) cameraApiComponent;
        if (zVar != null) {
            FilterBean filterBean = bVar.f28222a;
            Float f4 = bVar.f28225d;
            float f5 = 0.0f;
            if (f4 != null) {
                f3 = f4.floatValue();
            } else {
                f3 = 0.0f;
            }
            com.bytedance.creativex.recorder.filter.b.b bVar3 = new com.bytedance.creativex.recorder.filter.b.b(filterBean, f3, bVar.f28223b);
            FilterBean filterBean2 = bVar2.f28222a;
            Float f6 = bVar2.f28225d;
            if (f6 != null) {
                f5 = f6.floatValue();
            }
            zVar.a(bVar3, new com.bytedance.creativex.recorder.filter.b.b(filterBean2, f5, bVar2.f28223b), f2);
            return;
        }
        super.actualSetFilterScroll(bVar, bVar2, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(f fVar, androidx.appcompat.app.d dVar, c.a aVar, h.f.a.b<? super com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> bVar, h.f.a.a<Boolean> aVar2, h.f.a.b<? super com.bytedance.creativex.recorder.filter.b.a, z> bVar2) {
        super(fVar, dVar, aVar, bVar, aVar2, bVar2);
        l.d(fVar, "");
        l.d(dVar, "");
        l.d(aVar, "");
        this.f131252a = i.a((h.f.a.a) new a(this, aVar));
    }
}
