package com.ss.android.ugc.aweme.ad.feed.card;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: j  reason: collision with root package name */
    public static final C1469a f65786j = new C1469a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f65787a;

    /* renamed from: b  reason: collision with root package name */
    public final b f65788b;

    /* renamed from: c  reason: collision with root package name */
    public d f65789c;

    /* renamed from: d  reason: collision with root package name */
    public DataCenter f65790d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f65791e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public Aweme f65792f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f65793g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f65794h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f65795i;

    /* renamed from: k  reason: collision with root package name */
    private final h f65796k = i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private String f65797l;

    /* renamed from: m  reason: collision with root package name */
    private final double f65798m;

    static {
        Covode.recordClassIndex(40482);
    }

    public final d a() {
        return (d) this.f65796k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$a  reason: collision with other inner class name */
    public static final class C1469a {
        static {
            Covode.recordClassIndex(40483);
        }

        private C1469a() {
        }

        public /* synthetic */ C1469a(byte b2) {
            this();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FrameLayout f65804a;

        static {
            Covode.recordClassIndex(40489);
        }

        f(FrameLayout frameLayout) {
            this.f65804a = frameLayout;
        }

        public final void run() {
            this.f65804a.setVisibility(8);
        }
    }

    public final void c() {
        this.f65788b.a(this.f65792f);
    }

    public final void g() {
        DataCenter dataCenter = this.f65790d;
        if (dataCenter != null) {
            dataCenter.a("action_ad_pop_up_web_pause_video", (Object) null);
        }
    }

    static final class b extends m implements h.f.a.a<d> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(40484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            b bVar = this.this$0.f65788b;
            if (bVar.f65809e == null) {
                bVar.f65809e = new c(bVar.f65806b);
            }
            return bVar.f65809e;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65799a;

        static {
            Covode.recordClassIndex(40485);
        }

        c(a aVar) {
            this.f65799a = aVar;
        }

        public final void run() {
            this.f65799a.f65793g = false;
            DataCenter dataCenter = this.f65799a.f65790d;
            if (dataCenter != null) {
                dataCenter.a("AD_ACTION_MOVE_IN_DESC", (Object) true);
            }
        }
    }

    private final void h() {
        this.f65794h = false;
        this.f65797l = null;
        this.f65793g = false;
        this.f65788b.a();
        this.f65791e.removeCallbacksAndMessages(null);
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65803a;

        static {
            Covode.recordClassIndex(40488);
        }

        public e(a aVar) {
            this.f65803a = aVar;
        }

        public final void run() {
            this.f65803a.f65793g = true;
            d dVar = this.f65803a.f65789c;
            if (dVar != null) {
                dVar.a(8);
            }
            d a2 = this.f65803a.a();
            if (a2 != null) {
                a2.a(0);
            }
            this.f65803a.e();
            d a3 = this.f65803a.a();
            if (a3 != null) {
                a3.a();
            }
        }
    }

    public final void b() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(this.f65792f) && !com.ss.android.ugc.aweme.commercialize.e.a.b.O(this.f65792f) && !this.f65793g) {
            c();
            d dVar = this.f65789c;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    public final void e() {
        FrameLayout frameLayout = this.f65787a;
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
            if (!this.f65795i) {
                frameLayout.setVisibility(0);
            }
            frameLayout.setTranslationY((float) n.a(this.f65798m));
            frameLayout.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(290).start();
        }
    }

    public final String f() {
        String str = this.f65797l;
        if (str != null && str.length() != 0) {
            return this.f65797l;
        }
        d dVar = this.f65789c;
        if (dVar == null || !dVar.e()) {
            return "data_load_fail";
        }
        d dVar2 = this.f65789c;
        if (dVar2 == null || !dVar2.f()) {
            return "load_timeout";
        }
        return null;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f65801b;

        static {
            Covode.recordClassIndex(40486);
        }

        d(a aVar, boolean z) {
            this.f65800a = aVar;
            this.f65801b = z;
        }

        public final void run() {
            String f2 = this.f65800a.f();
            if (f2 != null && f2.length() != 0) {
                d dVar = this.f65800a.f65789c;
                if (dVar != null) {
                    dVar.a(f2);
                }
            } else if (!this.f65800a.f65794h || this.f65801b) {
                this.f65800a.f65794h = true;
                DataCenter dataCenter = this.f65800a.f65790d;
                if (dataCenter != null) {
                    dataCenter.a("ad_feed_card_show_state", (Object) true);
                }
                DataCenter dataCenter2 = this.f65800a.f65790d;
                if (dataCenter2 != null) {
                    dataCenter2.a("AD_ACTION_MOVE_OUT_DESC", (Object) true);
                }
                this.f65800a.f65791e.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ad.feed.card.a.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f65802a;

                    static {
                        Covode.recordClassIndex(40487);
                    }

                    {
                        this.f65802a = r1;
                    }

                    public final void run() {
                        this.f65802a.f65800a.f65793g = true;
                        d dVar = this.f65802a.f65800a.f65789c;
                        if (dVar != null) {
                            dVar.a(0);
                        }
                        d a2 = this.f65802a.f65800a.a();
                        if (a2 != null) {
                            a2.a(8);
                        }
                        this.f65802a.f65800a.e();
                        d dVar2 = this.f65802a.f65800a.f65789c;
                        if (dVar2 != null) {
                            dVar2.a();
                        }
                    }
                }, 200);
            }
        }
    }

    public final void d() {
        if (this.f65793g) {
            DataCenter dataCenter = this.f65790d;
            if (dataCenter != null) {
                dataCenter.a("ad_feed_card_show_state", (Object) false);
            }
            FrameLayout frameLayout = this.f65787a;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).translationY((float) n.a(this.f65798m)).setDuration(290).withEndAction(new f(frameLayout)).start();
            }
            this.f65791e.postDelayed(new c(this), 200);
        }
    }

    public final void a(boolean z) {
        FrameLayout frameLayout;
        int i2;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(this.f65792f)) {
            this.f65795i = z;
            if (this.f65793g && (frameLayout = this.f65787a) != null) {
                if (z) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                frameLayout.setVisibility(i2);
            }
        }
    }

    public a(View view) {
        double d2;
        l.d(view, "");
        this.f65788b = new b(view);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.S(this.f65792f)) {
            d2 = 8.0d;
        } else {
            d2 = 15.0d;
        }
        this.f65798m = d2;
    }

    public final void a(Aweme aweme) {
        FrameLayout frameLayout;
        d dVar;
        if ((aweme != null && aweme.isAd()) || com.ss.android.ugc.aweme.commercialize.e.a.b.M(aweme)) {
            AwemeRawAd awemeRawAd = null;
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.K(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.O(aweme)) {
                this.f65792f = null;
                b bVar = this.f65788b;
                for (d dVar2 : h.a.n.b(bVar.f65807c, bVar.f65808d, bVar.f65809e)) {
                    if (dVar2 != null) {
                        dVar2.a((Aweme) null);
                    }
                }
                return;
            }
            this.f65792f = aweme;
            b bVar2 = this.f65788b;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme != null ? aweme.getAwemeRawAd() : null)) {
                frameLayout = bVar2.f65806b;
            } else {
                frameLayout = bVar2.f65805a;
            }
            this.f65787a = frameLayout;
            b bVar3 = this.f65788b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            l.d(this, "");
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.e(awemeRawAd)) {
                if (bVar3.f65808d == null) {
                    bVar3.f65808d = new FeedAdLynxCard(this, bVar3.f65806b);
                }
                dVar = bVar3.f65808d;
            } else {
                if (bVar3.f65807c == null) {
                    bVar3.f65807c = new FeedAdLynxCard(this, bVar3.f65805a);
                }
                dVar = bVar3.f65807c;
            }
            this.f65789c = dVar;
            if (dVar != null) {
                dVar.a(aweme);
            }
            d a2 = a();
            if (a2 != null) {
                a2.a(aweme);
            }
            h();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        d dVar;
        d dVar2;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(this.f65792f)) {
            String str2 = null;
            if (bVar2 != null && (str = bVar2.f67014a) != null) {
                switch (str.hashCode()) {
                    case -2033402377:
                        if (str.equals("ad_comment_dialog_visible")) {
                            Object a2 = bVar2.a();
                            l.b(a2, "");
                            if (((Boolean) a2).booleanValue()) {
                                str2 = "comment_block";
                            }
                            this.f65797l = str2;
                            return;
                        }
                        return;
                    case -1540531799:
                        if (str.equals("ad_feed_on_page_unselected")) {
                            d dVar3 = this.f65789c;
                            if (dVar3 != null) {
                                dVar3.d();
                            }
                            h();
                            return;
                        }
                        return;
                    case -1282907273:
                        if (str.equals("ad_share_dialog_visible")) {
                            Object a3 = bVar2.a();
                            l.b(a3, "");
                            if (((Boolean) a3).booleanValue()) {
                                str2 = "share_block";
                            }
                            this.f65797l = str2;
                            return;
                        }
                        return;
                    case -1132409520:
                        if (str.equals("ad_feed_on_page_selected") && (dVar = this.f65789c) != null) {
                            dVar.c();
                            return;
                        }
                        return;
                    case 2040441990:
                        if (str.equals("ad_video_on_resume_play") && (dVar2 = this.f65789c) != null) {
                            dVar2.g();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void a(long j2, boolean z) {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(this.f65792f) && !com.ss.android.ugc.aweme.commercialize.e.a.b.O(this.f65792f) && !this.f65793g) {
            this.f65791e.postDelayed(new d(this, z), j2);
        }
    }

    public final void a(int i2, int i3, int i4) {
        d dVar = this.f65789c;
        if (dVar != null) {
            dVar.a(i2, i3, i4);
        }
    }
}
