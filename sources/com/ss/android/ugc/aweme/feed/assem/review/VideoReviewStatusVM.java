package com.ss.android.ugc.aweme.feed.assem.review;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class VideoReviewStatusVM extends FeedBaseViewModel<a> {

    /* renamed from: k  reason: collision with root package name */
    public static final List<Integer> f92419k = n.c(1, 2);

    /* renamed from: l  reason: collision with root package name */
    public static final a f92420l = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(58492);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new a();
    }

    static {
        Covode.recordClassIndex(58491);
    }

    static final class c extends m implements h.f.a.b<String, z> {
        final /* synthetic */ VideoReviewStatusVM this$0;

        static {
            Covode.recordClassIndex(58494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VideoReviewStatusVM videoReviewStatusVM) {
            super(1);
            this.this$0 = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2;
            Aweme aweme;
            String aid;
            String str3 = str;
            String str4 = "";
            l.d(str3, str4);
            if (str3.length() == 0) {
                str2 = "2";
            } else {
                str2 = "1";
            }
            VideoReviewStatusVM videoReviewStatusVM = this.this$0;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (aid = aweme.getAid()) == null)) {
                str4 = aid;
            }
            r.a("video_play_page_mute_tag_show", dVar.a("object_id", str4).a("tag_type", str2).f66730a);
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

    static final class b extends m implements h.f.a.m<View, String, z> {
        final /* synthetic */ VideoReviewStatusVM this$0;

        static {
            Covode.recordClassIndex(58493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoReviewStatusVM videoReviewStatusVM) {
            super(2);
            this.this$0 = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            l.d(view2, "");
            l.d(str2, "");
            VideoReviewStatusVM videoReviewStatusVM = this.this$0;
            l.d(view2, "");
            l.d(str2, "");
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.g();
            if (videoItemParams != null) {
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage");
                Aweme aweme = videoItemParams.mAweme;
                l.b(aweme, "");
                r.a("enter_appeal", a2.a("group_id", aweme.getFromGroupId()).f66730a);
                if (!TextUtils.isEmpty(str2)) {
                    SmartRouter.buildRoute(view2.getContext(), "aweme://webview/").withParam(Uri.parse(str2)).open();
                }
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<View, String, z> {
        final /* synthetic */ VideoReviewStatusVM this$0;

        static {
            Covode.recordClassIndex(58495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoReviewStatusVM videoReviewStatusVM) {
            super(2);
            this.this$0 = videoReviewStatusVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(View view, String str) {
            Aweme aweme;
            String str2;
            View view2 = view;
            String str3 = str;
            String str4 = "";
            l.d(view2, str4);
            l.d(str3, str4);
            VideoReviewStatusVM videoReviewStatusVM = this.this$0;
            l.d(view2, str4);
            l.d(str3, str4);
            VideoItemParams videoItemParams = (VideoItemParams) videoReviewStatusVM.g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || str3.length() <= 0)) {
                SmartRouter.buildRoute(view2.getContext(), "//webview").withParam(Uri.parse(str3)).open();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("group_id", aweme.getAid());
                Music music = aweme.getMusic();
                Object obj = str4;
                if (music != null) {
                    obj = Long.valueOf(music.getId());
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("music_id", obj);
                Video video = aweme.getVideo();
                if (video == null || !video.isLongVideo()) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                r.a("click_music_mute_detail", a3.a("is_long_video", str2).f66730a);
            }
            return z.f158842a;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ a a(a aVar, VideoItemParams videoItemParams) {
        String str;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        String muteDetailUrl;
        AwemeStatus status2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        String str2;
        String reviewDetailUrl;
        a aVar2 = aVar;
        String str3 = "";
        l.d(aVar2, str3);
        l.d(videoItemParams, str3);
        Aweme aweme = videoItemParams.mAweme;
        l.b(aweme, str3);
        if (aweme.isProhibitedAndShouldTell()) {
            Aweme aweme2 = videoItemParams.mAweme;
            l.b(aweme2, str3);
            String videoDetailNoticeBottom = aweme2.getVideoDetailNoticeBottom();
            if (TextUtils.isEmpty(videoDetailNoticeBottom)) {
                VideoItemParams videoItemParams2 = (VideoItemParams) g();
                if (videoItemParams2 != null) {
                    com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "video_detail_notice_bottom");
                    Aweme aweme3 = videoItemParams2.mAweme;
                    l.b(aweme3, str3);
                    com.ss.android.ugc.aweme.app.f.c a3 = a2.a("log_id", aweme3.getRequestId());
                    Aweme aweme4 = videoItemParams2.mAweme;
                    l.b(aweme4, str3);
                    com.ss.android.ugc.aweme.app.n.a("notice_content_empty", str3, a3.a("item_id", aweme4.getAid()).a());
                }
                Activity j2 = f.j();
                if (j2 == null || (videoDetailNoticeBottom = j2.getString(R.string.h_8)) == null) {
                    videoDetailNoticeBottom = str3;
                }
                l.b(videoDetailNoticeBottom, str3);
            } else {
                l.b(videoDetailNoticeBottom, str3);
            }
            Aweme aweme5 = videoItemParams.mAweme;
            if (!(aweme5 == null || (reviewDetailUrl = aweme5.getReviewDetailUrl()) == null)) {
                str3 = reviewDetailUrl;
            }
            return a.a(aVar2, 1, R.color.c8, R.raw.icon_exclamation_mark_circle_fill, videoDetailNoticeBottom, str3, null, new b(this), 32);
        } else if (!y.a(videoItemParams.mAweme)) {
            return aVar2;
        } else {
            Aweme aweme6 = videoItemParams.mAweme;
            l.b(aweme6, str3);
            AwemeStatus status3 = aweme6.getStatus();
            l.b(status3, str3);
            if (status3.getMusicEditStatus() == 2) {
                Activity j3 = f.j();
                if (j3 == null || (str2 = j3.getString(R.string.fdd)) == null) {
                    str2 = str3;
                }
                l.b(str2, str3);
                return a.a(aVar2, 2, R.color.a4, 0, str2, null, null, null, 116);
            }
            Aweme aweme7 = videoItemParams.mAweme;
            if (aweme7 == null || (status2 = aweme7.getStatus()) == null || (videoMuteInfo2 = status2.getVideoMuteInfo()) == null || (str = videoMuteInfo2.getMuteDetailNotice()) == null) {
                str = str3;
            }
            Aweme aweme8 = videoItemParams.mAweme;
            if (!(aweme8 == null || (status = aweme8.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || (muteDetailUrl = videoMuteInfo.getMuteDetailUrl()) == null)) {
                str3 = muteDetailUrl;
            }
            return a.a(2, R.color.a4, R.raw.icon_speaker_x_mark_fill_ltr, str, str3, new c(this), new d(this));
        }
    }
}
