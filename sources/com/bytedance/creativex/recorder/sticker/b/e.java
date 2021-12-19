package com.bytedance.creativex.recorder.sticker.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.sticker.presenter.i;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(16677);
    }

    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(16678);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.l;
        }
    }

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(16679);
        }

        public b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.l;
        }
    }

    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(16680);
        }

        public c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            return Boolean.valueOf(invoke(mVar));
        }

        public final boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return mVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.e;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.AVChallenge>, java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */
    public static final List<AVChallenge> a(i iVar) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(c.INSTANCE);
        if (!(a2 instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.e)) {
            a2 = null;
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.e eVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.e) a2;
        if (eVar != null) {
            return eVar.f135391a;
        }
        return null;
    }

    public static final void b(i iVar) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = iVar.a(a.INSTANCE);
        if (!(a2 instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.l)) {
            a2 = null;
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.l lVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.l) a2;
        if (lVar != null) {
            lVar.f135401a.hide();
        }
    }
}
