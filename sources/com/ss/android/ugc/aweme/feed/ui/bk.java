package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;

public final class bk extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f94383f = new a((byte) 0);

    static {
        Covode.recordClassIndex(59947);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final int b() {
        return R.layout.te;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public bk(View view) {
        super(view);
    }

    public static final class b implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk f94384a;

        static {
            Covode.recordClassIndex(59949);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(bk bkVar) {
            this.f94384a = bkVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String errorMsg;
            l.d(th, "");
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = this.f94384a.R.getString(R.string.de5);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(errorMsg).a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de5).a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                Aweme aweme = this.f94384a.L;
                l.b(aweme, "");
                aweme.setReportMaskInfo(new VideoMaskInfo(null, null, null, null, null, null, 63, null));
                AwemeService.b().a(this.f94384a.L);
                View view = ((a) this.f94384a).f94205a;
                if (view != null) {
                    view.setVisibility(8);
                }
                this.f94384a.c();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.b());
            }
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M);
        Aweme aweme = this.L;
        l.b(aweme, "");
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
        Aweme aweme2 = this.L;
        l.b(aweme2, "");
        r.a(str, a3.a("author_id", aweme2.getAuthorUid()).f66730a);
    }

    public final void b(String str) {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.L;
        l.b(aweme, "");
        if (aweme.isAd() && this.R != null) {
            f.b a2 = f.a();
            a2.f74804a = "background_ad";
            a2.f74805b = str;
            a2.c("report_mask").b(this.L).a(this.R);
            Aweme aweme2 = this.L;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", str, awemeRawAd).b("refer", "report_mask").c();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk f94385a;

        static {
            Covode.recordClassIndex(59950);
        }

        c(bk bkVar) {
            this.f94385a = bkVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bk bkVar = this.f94385a;
            Context context = bkVar.R;
            l.b(context, "");
            if (!fe.a(context)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(bkVar.R).a(bkVar.R.getString(R.string.de8)).a();
            } else if (bkVar.L != null) {
                Aweme aweme = bkVar.L;
                l.b(aweme, "");
                if (aweme.getReportMaskInfo() != null) {
                    Aweme aweme2 = bkVar.L;
                    l.b(aweme2, "");
                    String aid = aweme2.getAid();
                    l.b(aid, "");
                    Aweme aweme3 = bkVar.L;
                    l.b(aweme3, "");
                    Integer maskType = aweme3.getReportMaskInfo().getMaskType();
                    Aweme aweme4 = bkVar.L;
                    l.b(aweme4, "");
                    CancelVideoMaskApi.a(aid, maskType, aweme4.getReportMaskInfo().getStatus()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(bkVar));
                }
            }
            this.f94385a.a("showpost_click");
            this.f94385a.b("play");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.a
    public final void a(Aweme aweme) {
        String string;
        String string2;
        String string3;
        l.d(aweme, "");
        if (y.g(aweme)) {
            View view = ((a) this).f94205a;
            if (view == null || view.getVisibility() != 0) {
                TextView textView = this.f94206b;
                if (textView != null) {
                    Aweme aweme2 = this.L;
                    l.b(aweme2, "");
                    VideoMaskInfo reportMaskInfo = aweme2.getReportMaskInfo();
                    if (reportMaskInfo == null || (string3 = reportMaskInfo.getTitle()) == null) {
                        string3 = this.R.getString(R.string.fcz);
                    }
                    textView.setText(string3);
                }
                TextView textView2 = this.f94208d;
                if (textView2 != null) {
                    Aweme aweme3 = this.L;
                    l.b(aweme3, "");
                    VideoMaskInfo reportMaskInfo2 = aweme3.getReportMaskInfo();
                    if (reportMaskInfo2 == null || (string2 = reportMaskInfo2.getContent()) == null) {
                        string2 = this.R.getString(R.string.fcx);
                    }
                    textView2.setText(string2);
                }
                TextView textView3 = this.f94207c;
                if (textView3 != null) {
                    Aweme aweme4 = this.L;
                    l.b(aweme4, "");
                    VideoMaskInfo reportMaskInfo3 = aweme4.getReportMaskInfo();
                    if (reportMaskInfo3 == null || (string = reportMaskInfo3.getCancelMaskLabel()) == null) {
                        string = this.R.getString(R.string.fcy);
                    }
                    textView3.setText(string);
                    textView3.setOnClickListener(new c(this));
                }
                View view2 = ((a) this).f94205a;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                a("reportlayer_show");
                b("othershow");
                return;
            }
            return;
        }
        View view3 = ((a) this).f94205a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }
}
