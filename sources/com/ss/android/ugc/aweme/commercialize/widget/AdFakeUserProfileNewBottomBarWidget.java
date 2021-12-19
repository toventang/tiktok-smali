package com.ss.android.ugc.aweme.commercialize.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.aa;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.profile.o;
import com.ss.android.ugc.aweme.commercialize.utils.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;

public final class AdFakeUserProfileNewBottomBarWidget extends AbsAdProfileWidget implements au {

    /* renamed from: j  reason: collision with root package name */
    public static final a f76275j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h f76276k = i.a((h.f.a.a) new d(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f76277l = i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f76278m = i.a((h.f.a.a) new e(this));
    private final h n = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(47036);
    }

    private final ViewGroup e() {
        return (ViewGroup) this.f76276k.getValue();
    }

    private final TextView f() {
        return (TextView) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47037);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.d9);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.a(R.id.da);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.dc);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SmartRoundImageView> {
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.this$0.a(R.id.de);
        }
    }

    private final void g() {
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.animate().translationY((float) n.a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        g();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f76279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.profile.i f76280b;

        static {
            Covode.recordClassIndex(47038);
        }

        b(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget, com.ss.android.ugc.aweme.commercialize.profile.i iVar) {
            this.f76279a = adFakeUserProfileNewBottomBarWidget;
            this.f76280b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ag.a(this.f76279a.f67007b, ((AbsAdProfileWidget) this.f76279a).f75063a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            ViewGroup e2 = e();
            if (e2 != null) {
                e2.animate().translationY((float) n.a(0.0d)).setDuration(300).start();
                return;
            }
            return;
        }
        g();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(com.ss.android.ugc.aweme.commercialize.profile.i iVar) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        aa fakeAuthor;
        AwemeRawAd awemeRawAd2;
        String str3;
        AwemeRawAd awemeRawAd3;
        l.d(iVar, "");
        super.a(iVar);
        TextView textView = (TextView) this.f76278m.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str3 = null;
            } else {
                str3 = awemeRawAd3.getButtonText();
            }
            textView.setText(str3);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd2.getOpenUrl();
        }
        if (str == null || str.length() == 0) {
            TextView f2 = f();
            if (f2 != null) {
                f2.setVisibility(0);
            }
            TextView f3 = f();
            if (f3 != null) {
                Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = fakeAuthor.getButtonText();
                }
                f3.setText(str2);
            }
        } else {
            TextView f4 = f();
            if (f4 != null) {
                f4.setVisibility(8);
            }
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        }
        com.bytedance.lighten.a.a.a a2 = o.a.a(user);
        if (a2 != null) {
            v a3 = r.a(a2);
            a3.E = (SmartRoundImageView) this.f76277l.getValue();
            a3.c();
        }
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.setOnClickListener(new b(this, iVar));
        }
    }
}
