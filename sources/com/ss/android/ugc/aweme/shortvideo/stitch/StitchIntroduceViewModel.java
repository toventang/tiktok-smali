package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;

public final class StitchIntroduceViewModel extends BaseJediViewModel<StitchState> {
    static {
        Covode.recordClassIndex(85711);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new StitchState(null, null, null, null, null, 31, null);
    }

    public final void a() {
        if (c.a() && !c.f130814a.getBoolean("stitch_trimming_view_guide", false)) {
            c.f130814a.edit().putBoolean("stitch_trimming_view_guide", true).apply();
            c(d.f130800a);
        }
    }

    static final class a extends m implements h.f.a.b<StitchState, StitchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f130797a = new a();

        static {
            Covode.recordClassIndex(85712);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StitchState invoke(StitchState stitchState) {
            StitchState stitchState2 = stitchState;
            l.d(stitchState2, "");
            return StitchState.copy$default(stitchState2, null, new p(), null, null, null, 29, null);
        }
    }

    static final class b extends m implements h.f.a.b<StitchState, StitchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130798a = new b();

        static {
            Covode.recordClassIndex(85713);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StitchState invoke(StitchState stitchState) {
            StitchState stitchState2 = stitchState;
            l.d(stitchState2, "");
            return StitchState.copy$default(stitchState2, new p(), null, null, null, null, 30, null);
        }
    }

    static final class c extends m implements h.f.a.b<StitchState, StitchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f130799a = new c();

        static {
            Covode.recordClassIndex(85714);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StitchState invoke(StitchState stitchState) {
            StitchState stitchState2 = stitchState;
            l.d(stitchState2, "");
            return StitchState.copy$default(stitchState2, null, null, null, new p(), null, 23, null);
        }
    }

    static final class d extends m implements h.f.a.b<StitchState, StitchState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f130800a = new d();

        static {
            Covode.recordClassIndex(85715);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StitchState invoke(StitchState stitchState) {
            StitchState stitchState2 = stitchState;
            l.d(stitchState2, "");
            return StitchState.copy$default(stitchState2, null, null, new p(), null, null, 27, null);
        }
    }
}
