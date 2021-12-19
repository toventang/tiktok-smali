package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class ae {
    static {
        Covode.recordClassIndex(86574);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<n<Boolean, Boolean>, z> {
        final /* synthetic */ h.f.a.m $action;

        static {
            Covode.recordClassIndex(86575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.m mVar) {
            super(1);
            this.$action = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n<Boolean, Boolean> nVar) {
            n<Boolean, Boolean> nVar2 = nVar;
            l.d(nVar2, "");
            this.$action.invoke(nVar2.f39404b.getFirst(), nVar2.f39404b.getSecond());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<n<Boolean, Boolean>, z> {
        final /* synthetic */ h.f.a.m $action;

        static {
            Covode.recordClassIndex(86576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.m mVar) {
            super(1);
            this.$action = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n<Boolean, Boolean> nVar) {
            n<Boolean, Boolean> nVar2 = nVar;
            l.d(nVar2, "");
            this.$action.invoke(nVar2.f39404b.getFirst(), nVar2.f39404b.getSecond());
            return z.f158842a;
        }
    }

    public static final void a(VideoPublishActivity videoPublishActivity, h.f.a.m<? super Boolean, ? super Boolean, z> mVar) {
        l.d(videoPublishActivity, "");
        l.d(mVar, "");
        JediViewModel a2 = t.a(videoPublishActivity).a(VideoPublishViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((VideoPublishViewModel) a2).a(videoPublishActivity, af.f132199a, new ah(), new a(mVar));
    }

    public static final void b(VideoPublishActivity videoPublishActivity, h.f.a.m<? super Boolean, ? super Boolean, z> mVar) {
        l.d(videoPublishActivity, "");
        l.d(mVar, "");
        JediViewModel a2 = t.a(videoPublishActivity).a(VideoPublishViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((VideoPublishViewModel) a2).a(videoPublishActivity, ag.f132200a, new ah(), new b(mVar));
    }
}
