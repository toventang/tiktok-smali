package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {

    /* renamed from: a  reason: collision with root package name */
    private final h f125540a = i.a((h.f.a.a) b.f125544a);

    /* renamed from: b  reason: collision with root package name */
    private final h f125541b = i.a((h.f.a.a) e.f125545a);

    /* renamed from: c  reason: collision with root package name */
    private final h f125542c = i.a((h.f.a.a) a.f125543a);

    static {
        Covode.recordClassIndex(82421);
    }

    /* access modifiers changed from: package-private */
    public final t<com.ss.android.ugc.aweme.tools.i> a() {
        return (t) this.f125540a.getValue();
    }

    /* access modifiers changed from: package-private */
    public final t<Float> b() {
        return (t) this.f125541b.getValue();
    }

    /* access modifiers changed from: package-private */
    public final t<Float> g() {
        return (t) this.f125542c.getValue();
    }

    static final class a extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f125543a = new a();

        static {
            Covode.recordClassIndex(82422);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Float> invoke() {
            return new t();
        }
    }

    static final class b extends m implements h.f.a.a<t<com.ss.android.ugc.aweme.tools.i>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125544a = new b();

        static {
            Covode.recordClassIndex(82423);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<com.ss.android.ugc.aweme.tools.i> invoke() {
            return new t();
        }
    }

    static final class e extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f125545a = new e();

        static {
            Covode.recordClassIndex(82426);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Float> invoke() {
            return new t();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoSpeedState(null, null, 3, null);
    }

    static final class c extends m implements h.f.a.b<CutVideoSpeedState, CutVideoSpeedState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            CutVideoSpeedState cutVideoSpeedState2 = cutVideoSpeedState;
            l.d(cutVideoSpeedState2, "");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState2, Boolean.valueOf(this.$value), null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<CutVideoSpeedState, CutVideoSpeedState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(82425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            CutVideoSpeedState cutVideoSpeedState2 = cutVideoSpeedState;
            l.d(cutVideoSpeedState2, "");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState2, null, Boolean.valueOf(this.$value), 1, null);
        }
    }

    public final void a(float f2) {
        b().setValue(Float.valueOf(f2));
    }

    public final void b(float f2) {
        g().setValue(Float.valueOf(f2));
    }

    public final void a(com.ss.android.ugc.aweme.tools.i iVar) {
        l.d(iVar, "");
        a().setValue(iVar);
    }

    public final void b(boolean z) {
        c(new d(z));
    }

    public final void a(boolean z) {
        c(new c(z));
    }
}
