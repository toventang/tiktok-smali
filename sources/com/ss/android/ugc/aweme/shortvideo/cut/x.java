package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.x;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class x implements j {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<VEEditorAutoStartStopArbiter> f126293a;

    /* renamed from: b  reason: collision with root package name */
    private final h f126294b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final g f126295c;

    static {
        Covode.recordClassIndex(82894);
    }

    private final VEEditorAutoStartStopArbiter e() {
        return (VEEditorAutoStartStopArbiter) this.f126294b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final long a() {
        return (long) this.f126295c.k();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final long c() {
        return (long) this.f126295c.j();
    }

    static final class a extends m implements h.f.a.a<VEEditorAutoStartStopArbiter> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(82895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return this.this$0.f126293a.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final boolean b() {
        if (this.f126295c.f() == x.j.STARTED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final boolean d() {
        return e().f156721a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final void d(boolean z) {
        e().f156722b = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final void c(boolean z) {
        e().f156721a = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final boolean b(boolean z) {
        if (z) {
            e().a(true, false);
        } else {
            e().a();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final boolean a(boolean z) {
        if (z) {
            e().a(false, false);
            return true;
        }
        e().b();
        return true;
    }

    public x(g gVar, h.f.a.a<VEEditorAutoStartStopArbiter> aVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        this.f126295c = gVar;
        this.f126293a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.j
    public final boolean a(long j2, x.f fVar, VEListener.s sVar) {
        l.d(fVar, "");
        if (this.f126295c.a((int) j2, fVar, sVar) == 0) {
            return true;
        }
        return false;
    }
}
