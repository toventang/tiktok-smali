package com.ss.android.ugc.aweme.feed.assem.report;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class ReportVideoMaskVM extends FeedBaseViewModel<h> {
    static {
        Covode.recordClassIndex(58462);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new h();
    }

    static final class b extends m implements h.f.a.b<h, h> {
        final /* synthetic */ VideoItemParams $param;
        final /* synthetic */ ReportVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VideoItemParams videoItemParams, ReportVideoMaskVM reportVideoMaskVM) {
            super(1);
            this.$param = videoItemParams;
            this.this$0 = reportVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h invoke(h hVar) {
            h hVar2 = hVar;
            l.d(hVar2, "");
            return this.this$0.a((j) hVar2, this.$param);
        }
    }

    public static final class a implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportVideoMaskVM f92399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f92400b;

        static {
            Covode.recordClassIndex(58463);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM$a$a  reason: collision with other inner class name */
        static final class C2244a extends m implements h.f.a.b<h, h> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2244a f92401a = new C2244a();

            static {
                Covode.recordClassIndex(58464);
            }

            C2244a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h invoke(h hVar) {
                l.d(hVar, "");
                return h.a(false, new VideoMaskInfo(null, null, null, null, null, null, 63, null));
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String errorMsg;
            l.d(th, "");
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = this.f92400b.getString(R.string.de5);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(errorMsg).a();
                Object rawResponse = aVar.getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
                String str = ((BaseResponse) rawResponse).extra.logid;
                l.b(str, "");
                Object rawResponse2 = aVar.getRawResponse();
                Objects.requireNonNull(rawResponse2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
                CancelVideoMaskApi.a(str, String.valueOf(((BaseResponse) rawResponse2).status_code));
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de5).a();
            CancelVideoMaskApi.a(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            Aweme aweme;
            Video video;
            String aid;
            BaseResponse baseResponse2 = baseResponse;
            String str = "";
            l.d(baseResponse2, str);
            if (baseResponse2.status_code == 0) {
                this.f92399a.a(C2244a.f92401a);
                VideoItemParams videoItemParams = (VideoItemParams) this.f92399a.g();
                Audio audio = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (aweme == null || !aweme.isAd()) {
                    i O = v.O();
                    if (aweme != null) {
                        video = aweme.getVideo();
                        audio = aweme.getAudio();
                    } else {
                        video = null;
                    }
                    O.a(video, audio, false, true);
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
                    e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                    if (a2 != null) {
                        a2.b();
                    }
                } else {
                    v.O().y();
                }
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                com.ss.android.ugc.d.a.c.a(new ah(false, str));
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.b());
                CancelVideoMaskApi.a(0);
                return;
            }
            String str2 = baseResponse2.extra.logid;
            l.b(str2, str);
            CancelVideoMaskApi.a(str2, String.valueOf(baseResponse2.status_code));
        }

        a(ReportVideoMaskVM reportVideoMaskVM, Context context) {
            this.f92399a = reportVideoMaskVM;
            this.f92400b = context;
        }
    }

    static final class c extends m implements h.f.a.b<h, h.z> {
        final /* synthetic */ ReportVideoMaskVM this$0;

        static {
            Covode.recordClassIndex(58466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReportVideoMaskVM reportVideoMaskVM) {
            super(1);
            this.this$0 = reportVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h hVar) {
            Aweme aweme;
            Aweme aweme2;
            String aid;
            h hVar2 = hVar;
            l.d(hVar2, "");
            if (hVar2.f92415a) {
                VideoItemParams videoItemParams = (VideoItemParams) this.this$0.g();
                Aweme aweme3 = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (y.f(aweme)) {
                    ReportVideoMaskVM reportVideoMaskVM = this.this$0;
                    VideoItemParams videoItemParams2 = (VideoItemParams) reportVideoMaskVM.g();
                    if (videoItemParams2 != null) {
                        aweme3 = videoItemParams2.mAweme;
                    }
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme3)) {
                        e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                        if (a2 != null) {
                            a2.c();
                        }
                    } else {
                        v.O().B();
                    }
                    VideoItemParams videoItemParams3 = (VideoItemParams) reportVideoMaskVM.g();
                    if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null || (aid = aweme2.getAid()) == null)) {
                        com.ss.android.ugc.d.a.c.a(new ah(true, aid));
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str) {
        String str2;
        Aweme aweme;
        Aweme aweme2;
        l.d(str, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.p);
        VideoItemParams videoItemParams = (VideoItemParams) g();
        String str3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
            str2 = null;
        } else {
            str2 = aweme2.getAid();
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str2);
        VideoItemParams videoItemParams2 = (VideoItemParams) g();
        if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
            str3 = aweme.getAuthorUid();
        }
        r.a(str, a3.a("author_id", str3).f66730a);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ h a(h hVar, VideoItemParams videoItemParams) {
        VideoMaskInfo videoMaskInfo;
        l.d(hVar, "");
        l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        return h.a(y.g(videoItemParams.mAweme), videoMaskInfo);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        VideoMaskInfo videoMaskInfo;
        h hVar = (h) jVar;
        VideoItemParams videoItemParams2 = videoItemParams;
        l.d(hVar, "");
        l.d(videoItemParams2, "");
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        if (!l.a(videoMaskInfo, hVar.f92416b)) {
            Aweme aweme2 = videoItemParams2.mAweme;
            if (aweme2 != null) {
                aweme2.setReportMaskInfo(hVar.f92416b);
            }
            AwemeService.b().a(videoItemParams2.mAweme);
        }
        return videoItemParams2;
    }

    public final void a(Context context, String str) {
        Aweme aweme;
        l.d(context, "");
        l.d(str, "");
        VideoItemParams videoItemParams = (VideoItemParams) g();
        AwemeRawAd awemeRawAd = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
            if (aweme != null && !aweme.isAd()) {
                return;
            }
        } else {
            aweme = null;
        }
        f.b a2 = f.a();
        a2.f74804a = "background_ad";
        a2.f74805b = str;
        a2.c("report_mask").b(aweme).a(context);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", str, awemeRawAd).b("refer", "report_mask").c();
    }
}
