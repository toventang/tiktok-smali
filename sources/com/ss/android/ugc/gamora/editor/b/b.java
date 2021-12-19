package com.ss.android.ugc.gamora.editor.b;

import androidx.lifecycle.t;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.b.c;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import h.m;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f145693a = {new y(b.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f145694b = this;

    /* renamed from: c  reason: collision with root package name */
    private final d f145695c = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: d  reason: collision with root package name */
    private final h f145696d = h.i.a(m.NONE, new a(this));

    /* renamed from: e  reason: collision with root package name */
    private c f145697e;

    /* renamed from: f  reason: collision with root package name */
    private final f f145698f;

    static {
        Covode.recordClassIndex(95686);
    }

    private final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.f145695c.a(this, f145693a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f145694b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145698f;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.b.b.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.b.a
    public final void a() {
        b().autoEnhanceType = 2;
        c cVar = new c(this, b());
        this.f145697e = cVar;
        t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> A = ((com.ss.android.ugc.aweme.shortvideo.preview.a) this.f145696d.getValue()).A();
        l.d(A, "");
        cVar.f126949a = A;
        t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> tVar = cVar.f126949a;
        if (tVar != null) {
            tVar.postValue(new com.ss.android.ugc.aweme.shortvideo.edit.b.b(cVar.f126951c.autoEnhanceOn, cVar.f126951c.autoEnhanceType, false, com.ss.android.ugc.aweme.shortvideo.edit.b.f.a(), com.ss.android.ugc.aweme.shortvideo.edit.b.f.b(), null, 36));
        }
        a(b().autoEnhanceOn);
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f145698f = fVar;
    }

    @Override // com.ss.android.ugc.gamora.editor.b.a
    public final void a(boolean z) {
        c cVar = this.f145697e;
        if (cVar != null) {
            cVar.f126951c.autoEnhanceOn = z;
            cVar.f126951c.autoEnhanceType = 2;
            t<com.ss.android.ugc.aweme.shortvideo.edit.b.b> tVar = cVar.f126949a;
            if (tVar != null) {
                tVar.postValue(new com.ss.android.ugc.aweme.shortvideo.edit.b.b(cVar.f126951c.autoEnhanceOn, cVar.f126951c.autoEnhanceType, false, com.ss.android.ugc.aweme.shortvideo.edit.b.f.a(), com.ss.android.ugc.aweme.shortvideo.edit.b.f.b(), null, 36));
            }
            dmt.av.video.a.a("hdr_enabled", Boolean.valueOf(z));
        }
    }
}
