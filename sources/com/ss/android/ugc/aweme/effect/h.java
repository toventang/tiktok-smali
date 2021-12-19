package com.ss.android.ugc.aweme.effect;

import android.graphics.Bitmap;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.e.c;
import dmt.av.video.k;
import dmt.av.video.p;
import dmt.av.video.u;
import dmt.av.video.w;
import h.f.b.l;
import h.i;
import h.m;
import java.util.ArrayList;

public final class h implements com.ss.android.ugc.aweme.effect.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f88946a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f88947b = i.a(m.NONE, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final t<Boolean> f88948c = new t<>();

    static {
        Covode.recordClassIndex(55939);
    }

    private final c n() {
        return (c) this.f88947b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final e a() {
        return this.f88946a;
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final t<Boolean> f() {
        return this.f88948c;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(55940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.e.c invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.effect.h r0 = r2.this$0
                androidx.fragment.app.e r0 = r0.f88946a
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.a.a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r0 = com.ss.android.ugc.gamora.editor.e.c.class
                com.bytedance.als.b r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.h.a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final VideoPublishEditModel b() {
        return n().Y();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final t<Boolean> c() {
        return n().h();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final t<Bitmap> d() {
        return n().i();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final LiveData<g> e() {
        return n().C();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final ArrayList<EffectPointModel> g() {
        return n().r();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final dmt.av.video.g<p> h() {
        return n().p();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final t<dmt.av.video.t> i() {
        return n().v();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final LiveData<Boolean> j() {
        return n().s();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final t<u> k() {
        return n().E();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final k<w> l() {
        return n().q();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final LiveData<w> m() {
        return n().t();
    }

    @Override // com.ss.android.ugc.aweme.effect.e.a
    public final void a(VEVolumeChangeOp vEVolumeChangeOp) {
        l.d(vEVolumeChangeOp, "");
        n().a(vEVolumeChangeOp);
    }

    public h(e eVar) {
        l.d(eVar, "");
        this.f88946a = eVar;
    }
}
