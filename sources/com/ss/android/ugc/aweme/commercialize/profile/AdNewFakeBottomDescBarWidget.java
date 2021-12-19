package com.ss.android.ugc.aweme.commercialize.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.aa;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class AdNewFakeBottomDescBarWidget extends AbsAdProfileWidget implements au, org.greenrobot.eventbus.i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final a f75088j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f75089k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f75090l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f75091m;
    private final h.h n;
    private final boolean o;

    static final class g implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f75093a = new g();

        static {
            Covode.recordClassIndex(46306);
        }

        g() {
        }
    }

    static final class h implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f75094a = new h();

        static {
            Covode.recordClassIndex(46307);
        }

        h() {
        }
    }

    static final class i implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final i f75095a = new i();

        static {
            Covode.recordClassIndex(46308);
        }

        i() {
        }
    }

    static {
        Covode.recordClassIndex(46299);
    }

    private AdNewFakeBottomDescBarWidget(byte b2) {
        this();
    }

    private final ViewGroup e() {
        return (ViewGroup) this.f75089k.getValue();
    }

    private final TextView f() {
        return (TextView) this.f75091m.getValue();
    }

    private final TextView g() {
        return (TextView) this.n.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(187, new org.greenrobot.eventbus.g(AdNewFakeBottomDescBarWidget.class, "onAdGPProfileWebViewHiddenEvent", com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46300);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ AdNewFakeBottomDescBarWidget() {
        this(false);
    }

    static final class c extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdNewFakeBottomDescBarWidget this$0;

        static {
            Covode.recordClassIndex(46302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.this$0 = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.fh);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ AdNewFakeBottomDescBarWidget this$0;

        static {
            Covode.recordClassIndex(46303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.this$0 = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.a(R.id.fi);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdNewFakeBottomDescBarWidget this$0;

        static {
            Covode.recordClassIndex(46304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.this$0 = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.fj);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SmartRoundImageView> {
        final /* synthetic */ AdNewFakeBottomDescBarWidget this$0;

        static {
            Covode.recordClassIndex(46305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.this$0 = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.this$0.a(R.id.fk);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    private final void h() {
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.animate().translationY((float) n.a(0.0d)).setDuration(300).start();
        }
    }

    private final void i() {
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.animate().translationY((float) n.a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        i();
    }

    @r(a = ThreadMode.MAIN)
    public final void onAdGPProfileWebViewHiddenEvent(com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.a aVar) {
        l.d(aVar, "");
        h();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(boolean z) {
        super.a(z);
        if (!z || this.o) {
            i();
        } else {
            h();
        }
    }

    public AdNewFakeBottomDescBarWidget(boolean z) {
        this.o = z;
        this.f75089k = h.i.a((h.f.a.a) new d(this));
        this.f75090l = h.i.a((h.f.a.a) new f(this));
        this.f75091m = h.i.a((h.f.a.a) new e(this));
        this.n = h.i.a((h.f.a.a) new c(this));
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f75092a;

        static {
            Covode.recordClassIndex(46301);
        }

        b(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            this.f75092a = adNewFakeBottomDescBarWidget;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            ClickAgent.onClick(view);
            AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget = this.f75092a;
            Aweme aweme = ((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f75063a;
            if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                l.b(awemeRawAd, "");
                String type = awemeRawAd.getType();
                if (!TextUtils.isEmpty(type) && type != null) {
                    int hashCode = type.hashCode();
                    if (hashCode != 96801) {
                        if (hashCode != 117588) {
                            if (hashCode == 1893962841 && type.equals("redpacket")) {
                                com.ss.android.ugc.aweme.commercialize.g.a().q(adNewFakeBottomDescBarWidget.f67007b, aweme);
                                com.ss.android.ugc.aweme.commercialize.g.a().t(adNewFakeBottomDescBarWidget.f67007b, aweme);
                                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_redpacket", awemeRawAd).c();
                                com.ss.android.ugc.aweme.commercialize.g.c().a(adNewFakeBottomDescBarWidget.f67007b, aweme, 8, i.f75095a);
                            }
                        } else if (type.equals("web")) {
                            com.ss.android.ugc.aweme.commercialize.g.a().p(adNewFakeBottomDescBarWidget.f67007b, aweme);
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click_button", awemeRawAd).c();
                            com.ss.android.ugc.aweme.commercialize.g.a().q(adNewFakeBottomDescBarWidget.f67007b, aweme);
                            com.ss.android.ugc.aweme.commercialize.g.c().a(adNewFakeBottomDescBarWidget.f67007b, aweme, 8, g.f75093a);
                        }
                    } else if (!type.equals("app")) {
                    } else {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aM(((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f75063a)) {
                            com.ss.android.ugc.aweme.commercialize.g.c().a(adNewFakeBottomDescBarWidget.f67007b, ((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f75063a, 8, h.f75094a);
                        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aN(((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f75063a)) {
                            com.ss.android.ugc.aweme.commercialize.g.c().b(adNewFakeBottomDescBarWidget.f67007b, aweme);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(i iVar) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        aa fakeAuthor;
        AwemeRawAd awemeRawAd2;
        String str3;
        AwemeRawAd awemeRawAd3;
        l.d(iVar, "");
        super.a(iVar);
        TextView f2 = f();
        User user = null;
        if (f2 != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str3 = null;
            } else {
                str3 = awemeRawAd3.getButtonText();
            }
            f2.setText(str3);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd2.getOpenUrl();
        }
        if (str == null || str.length() == 0) {
            TextView g2 = g();
            if (g2 != null) {
                g2.setVisibility(0);
            }
            TextView g3 = g();
            if (g3 != null) {
                Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = fakeAuthor.getButtonText();
                }
                g3.setText(str2);
            }
        } else {
            TextView g4 = g();
            if (g4 != null) {
                g4.setVisibility(8);
            }
            TextView f3 = f();
            if (f3 != null) {
                com.bytedance.tux.h.i.b(f3, 0, 0, 0, 0, false, 16);
            }
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        }
        com.bytedance.lighten.a.a.a a2 = AdNewFakeUserProfileHeaderWidget.a.a(user);
        if (a2 != null) {
            v a3 = com.bytedance.lighten.a.r.a(a2);
            a3.E = (SmartRoundImageView) this.f75090l.getValue();
            a3.c();
        }
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.setOnClickListener(new b(this));
        }
    }
}
