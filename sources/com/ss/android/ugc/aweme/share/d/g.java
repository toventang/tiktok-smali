package com.ss.android.ugc.aweme.share.d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView;
import h.f.b.l;
import h.f.b.z;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    static NoticeButtonView f123462a;

    /* renamed from: b  reason: collision with root package name */
    static final Handler f123463b = new b(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public static final g f123464c = new g();

    private g() {
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoticeButtonView f123467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f123468b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f123469c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f123470d;

        static {
            Covode.recordClassIndex(81066);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f123471a;

            static {
                Covode.recordClassIndex(81067);
            }

            a(c cVar) {
                this.f123471a = cVar;
            }

            public final void run() {
                this.f123471a.f123467a.setVisibility(0);
            }
        }

        public final void onGlobalLayout() {
            MethodCollector.i(10935);
            if (this.f123467a.getHeight() != 0) {
                this.f123467a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f123468b.removeView(this.f123467a);
                int b2 = (int) n.b(d.a(), 16.0f);
                l.b(c.b.f66221a, "");
                int a2 = com.ss.android.ugc.aweme.adaptation.c.a();
                int height = ((this.f123468b.getHeight() - b2) - this.f123467a.getHeight()) - a2;
                int i2 = this.f123470d;
                this.f123469c.element.setMargins(i2, height, i2, b2 + a2);
                if (Build.VERSION.SDK_INT < 24) {
                    this.f123467a.setY((float) height);
                }
                this.f123468b.addView(this.f123467a, this.f123469c.element);
                g.f123463b.post(new a(this));
            }
            MethodCollector.o(10935);
        }

        c(NoticeButtonView noticeButtonView, FrameLayout frameLayout, z.e eVar, int i2) {
            this.f123467a = noticeButtonView;
            this.f123468b = frameLayout;
            this.f123469c = eVar;
            this.f123470d = i2;
        }
    }

    private static void c() {
        Handler handler = f123463b;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
    }

    public static final class a implements NoticeButtonView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f123465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f123466b;

        static {
            Covode.recordClassIndex(81064);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void a() {
            g.f123464c.b();
            a.C1541a.f68149a.a("video_click_retry").postValue(this.f123466b);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView.b
        public final void b() {
            String str;
            g.f123464c.b();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", c.f123454f);
            Aweme aweme = c.f123453e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            r.a("download_cancel", a2.a("group_id", str).a("is_downloading", c.b() ? 1 : 0).f66730a);
        }

        a(Context context, Aweme aweme) {
            this.f123465a = context;
            this.f123466b = aweme;
        }
    }

    static {
        Covode.recordClassIndex(81063);
    }

    @Override // com.ss.android.ugc.aweme.share.d.f
    public final void a() {
        a.C1541a.f68149a.a("video_download_status").a(new d(), true);
        a.C1541a.f68149a.a("video_click_retry").observeForever(new e());
    }

    @Override // com.ss.android.ugc.aweme.share.d.f
    public final void b() {
        MethodCollector.i(9799);
        NoticeButtonView noticeButtonView = f123462a;
        if (noticeButtonView != null) {
            noticeButtonView.setVisibility(8);
            ViewParent parent = noticeButtonView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(noticeButtonView);
            }
        }
        c();
        f123462a = null;
        MethodCollector.o(9799);
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(81065);
        }

        b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            g.f123464c.b();
        }
    }
}
