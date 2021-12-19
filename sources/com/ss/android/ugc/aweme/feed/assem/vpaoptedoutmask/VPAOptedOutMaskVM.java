package com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class VPAOptedOutMaskVM extends FeedBaseViewModel<e> {
    static {
        Covode.recordClassIndex(58734);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new e();
    }

    public final int h() {
        String str;
        VideoItemParams videoItemParams;
        VideoItemParams videoItemParams2;
        VideoItemParams videoItemParams3 = (VideoItemParams) g();
        Aweme aweme = null;
        if (videoItemParams3 != null) {
            str = videoItemParams3.mEventType;
        } else {
            str = null;
        }
        if (!l.a((Object) "homepage_hot", (Object) str) || (videoItemParams = (VideoItemParams) g()) == null || videoItemParams.mPageType != 0 || (videoItemParams2 = (VideoItemParams) g()) == null || videoItemParams2.mAwemeFromPage != 1) {
            return 8;
        }
        VideoItemParams videoItemParams4 = (VideoItemParams) g();
        if (videoItemParams4 != null) {
            aweme = videoItemParams4.mAweme;
        }
        if (!g.a(aweme) || com.ss.android.ugc.aweme.compliance.api.a.e().c() != 3) {
            return 8;
        }
        return 0;
    }

    static final class b extends m implements h.f.a.b<e, e> {
        final /* synthetic */ VPAOptedOutMaskVM this$0;

        static {
            Covode.recordClassIndex(58736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VPAOptedOutMaskVM vPAOptedOutMaskVM) {
            super(1);
            this.this$0 = vPAOptedOutMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            VPAOptedOutMaskVM vPAOptedOutMaskVM = this.this$0;
            Object g2 = vPAOptedOutMaskVM.g();
            if (g2 == null) {
                l.b();
            }
            return vPAOptedOutMaskVM.a(eVar2, (VideoItemParams) g2);
        }
    }

    static final class a extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92640a = new a();

        static {
            Covode.recordClassIndex(58735);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (eVar2.f92647a == 0) {
                i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                }
            }
            return z.f158842a;
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

    public final e a(e eVar, VideoItemParams videoItemParams) {
        l.d(eVar, "");
        l.d(videoItemParams, "");
        return new e(h());
    }
}
