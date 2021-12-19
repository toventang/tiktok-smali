package com.ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.be;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class VideoCommentVM extends FeedBaseViewModel<n> {
    static {
        Covode.recordClassIndex(58664);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new n();
    }

    public static Drawable h() {
        com.ss.android.ugc.aweme.aq.a.a.a();
        return androidx.core.content.b.a(g.a(), 2131233108);
    }

    public final void c(Aweme aweme) {
        a(new d(this, aweme));
    }

    static final class c extends m implements h.f.a.b<n, n> {
        final /* synthetic */ VideoCommentVM this$0;

        static {
            Covode.recordClassIndex(58669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoCommentVM videoCommentVM) {
            super(1);
            this.this$0 = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ n invoke(n nVar) {
            n nVar2 = nVar;
            l.d(nVar2, "");
            return n.a(nVar2, VideoCommentVM.h(), 0, false, null, 0, 0, 62);
        }
    }

    static final class d extends m implements h.f.a.b<n, n> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ VideoCommentVM this$0;

        static {
            Covode.recordClassIndex(58670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoCommentVM videoCommentVM, Aweme aweme) {
            super(1);
            this.this$0 = videoCommentVM;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ n invoke(n nVar) {
            n nVar2 = nVar;
            l.d(nVar2, "");
            return n.a(nVar2, null, 0, false, VideoCommentVM.a(this.$aweme), VideoCommentVM.b(this.$aweme), 0, 39);
        }
    }

    static final class b extends m implements h.f.a.b<n, z> {
        final /* synthetic */ VideoCommentVM this$0;

        static {
            Covode.recordClassIndex(58667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoCommentVM videoCommentVM) {
            super(1);
            this.this$0 = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            Aweme aweme;
            n nVar2 = nVar;
            l.d(nVar2, "");
            IVideoGiftService l2 = VideoGiftService.l();
            VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (l2.a(aweme) && nVar2.f92621b == 8) {
                this.this$0.a(AnonymousClass1.f92594a);
            }
            return z.f158842a;
        }
    }

    public static int b(Aweme aweme) {
        if (aweme == null) {
            l.b();
        }
        if (!aweme.isAd() && com.ss.android.ugc.aweme.commercialize.e.a.b.T(aweme)) {
            return 0;
        }
        if (aweme.isCmtSwt() || com.ss.android.ugc.aweme.commercialize.e.a.b.U(aweme)) {
            return 4;
        }
        return 0;
    }

    public static String a(Aweme aweme) {
        long j2;
        Long l2;
        s adCommentStruct;
        long j3 = 0;
        if (aweme != null && !CommentServiceImpl.e().c(aweme) && !com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j2 = statistics.getCommentCount();
            } else {
                j2 = 0;
            }
            s a2 = CommentServiceImpl.e().a(aweme);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                l2 = Long.valueOf(statistics2.getCommentCount());
            } else {
                l2 = null;
            }
            if (l2 != null) {
                j3 = (a2 != null || (aweme.getAdCommentStruct() != null && (j2 > 0 || ((adCommentStruct = aweme.getAdCommentStruct()) != null && adCommentStruct.showAsDefault())))) ? 1 + j2 : j2;
            }
        }
        try {
            String a3 = com.ss.android.ugc.aweme.i18n.b.a(j3);
            l.b(a3, "");
            return a3;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return "0";
        }
    }

    static final class a extends m implements h.f.a.b<n, z> {
        final /* synthetic */ VideoCommentVM this$0;

        static {
            Covode.recordClassIndex(58665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoCommentVM videoCommentVM) {
            super(1);
            this.this$0 = videoCommentVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n nVar) {
            Aweme aweme;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            l.d(nVar, "");
            IVideoGiftService l2 = VideoGiftService.l();
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            String str = null;
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            if (!(!l2.a(aweme) || (videoItemParams = (VideoItemParams) this.this$0.g()) == null || (aweme2 = videoItemParams.mAweme) == null)) {
                String aid = aweme2.getAid();
                l.b(aid, "");
                if (be.b(aid)) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    VideoItemParams videoItemParams3 = (VideoItemParams) this.this$0.g();
                    if (videoItemParams3 != null) {
                        str = videoItemParams3.mEventType;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("group_id", ac.e(aweme2)).a("author_id", ac.a(aweme2));
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("user_id", g2.getCurUserId());
                    int i2 = 1;
                    if (aweme2.getFollowStatus() != 1) {
                        i2 = 0;
                    }
                    r.a("show_gift_icon", a3.a("is_follow", i2).a("is_like", aweme2.isLike() ? 1 : 0).f66730a);
                    this.this$0.a(AnonymousClass1.f92593a);
                } else {
                    String aid2 = aweme2.getAid();
                    l.b(aid2, "");
                    be.a(aid2);
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ n a(n nVar, VideoItemParams videoItemParams) {
        int i2;
        Aweme aweme;
        int i3;
        l.d(nVar, "");
        l.d(videoItemParams, "");
        Drawable h2 = h();
        Aweme aweme2 = videoItemParams.mAweme;
        if (!(aweme2 == null || aweme2.getAid() == null)) {
            String aid = aweme2.getAid();
            l.b(aid, "");
            if (be.c(aid)) {
                i2 = 0;
                String a2 = a(videoItemParams.mAweme);
                int b2 = b(videoItemParams.mAweme);
                aweme = videoItemParams.mAweme;
                if (aweme != null || aweme.isDelete()) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                return n.a(h2, i2, false, a2, b2, i3);
            }
        }
        i2 = 8;
        String a22 = a(videoItemParams.mAweme);
        int b22 = b(videoItemParams.mAweme);
        aweme = videoItemParams.mAweme;
        if (aweme != null) {
        }
        i3 = 8;
        return n.a(h2, i2, false, a22, b22, i3);
    }
}
