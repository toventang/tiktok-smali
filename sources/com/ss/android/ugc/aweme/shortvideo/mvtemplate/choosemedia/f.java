package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final ad f129137a = new ad();

    static {
        Covode.recordClassIndex(84761);
    }

    static final class a extends m implements b<OpeningChooseMediaPageState, z> {
        final /* synthetic */ b $block;

        static {
            Covode.recordClassIndex(84762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.$block = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
            l.d(openingChooseMediaPageState, "");
            this.$block.invoke(openingChooseMediaPageState);
            return z.f158842a;
        }
    }

    public static final OpeningChooseMediaPageState a(ae aeVar) {
        l.d(aeVar, "");
        e activity = aeVar.getActivity();
        if (activity == null) {
            l.b();
        }
        return ((ChooseMediaState) ((BaseJediViewModel) t.a(activity).a(ChooseMediaViewModel.class)).a(aeVar)).getOpeningChooseMediaPageState();
    }

    public static final void a(com.ss.android.ugc.aweme.mediachoose.f fVar) {
        l.d(fVar, "");
        r.a("tool_performance_import_select_media", new com.ss.android.ugc.tools.f.b().a("is_support", fVar.f109383a).a("error_code", fVar.f109387e).a("file_format", fVar.f109386d).f149193a);
    }

    public static final void a(a aVar, ac acVar) {
        l.d(aVar, "");
        l.d(acVar, "");
        aVar.getLifecycle().a(new ChooseMediaExtensionKt$selectMediaList$1(aVar, acVar));
    }
}
