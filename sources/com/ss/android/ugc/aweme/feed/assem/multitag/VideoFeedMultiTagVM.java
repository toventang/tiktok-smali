package com.ss.android.ugc.aweme.feed.assem.multitag;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class VideoFeedMultiTagVM extends FeedBaseViewModel<e> {
    static {
        Covode.recordClassIndex(58281);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new e();
    }

    public final Aweme h() {
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            return videoItemParams.mAweme;
        }
        return null;
    }

    static final class a extends m implements b<e, e> {
        final /* synthetic */ int $anchorType;

        static {
            Covode.recordClassIndex(58282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$anchorType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ e invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            return e.a(eVar2, null, this.$anchorType, 1);
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ e a(e eVar, VideoItemParams videoItemParams) {
        String str;
        e eVar2 = eVar;
        l.d(eVar2, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        return e.a(eVar2, str, 0, 2);
    }
}
