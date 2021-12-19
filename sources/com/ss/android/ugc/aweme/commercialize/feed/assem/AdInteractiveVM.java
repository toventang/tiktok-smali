package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class AdInteractiveVM extends FeedBaseViewModel<p> {
    static {
        Covode.recordClassIndex(45632);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new p();
    }

    public static final class a extends m implements b<p, p> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f74081a = new a();

        static {
            Covode.recordClassIndex(45633);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p invoke(p pVar) {
            l.d(pVar, "");
            return new p(new com.bytedance.assem.arch.extensions.a(z.f158842a));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }
}
