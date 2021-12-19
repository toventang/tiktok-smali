package com.ss.android.ugc.aweme.commercialize.widget;

import android.graphics.Color;
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

public final class AdFakeUserProfileBottomBarWidget extends AbsAdProfileWidget implements au {

    /* renamed from: j  reason: collision with root package name */
    public static final a f76269j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h f76270k = i.a((h.f.a.a) new d(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f76271l = i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private final h f76272m = i.a((h.f.a.a) new e(this));
    private final h n = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(47029);
    }

    private final ViewGroup e() {
        return (ViewGroup) this.f76270k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47030);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdFakeUserProfileBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.d8);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ AdFakeUserProfileBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            return this.this$0.a(R.id.d_);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ AdFakeUserProfileBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.a(R.id.db);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<SmartRoundImageView> {
        final /* synthetic */ AdFakeUserProfileBottomBarWidget this$0;

        static {
            Covode.recordClassIndex(47035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.this$0 = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.this$0.a(R.id.dd);
        }
    }

    private final void f() {
        ViewGroup e2 = e();
        if (e2 != null) {
            e2.animate().translationY((float) n.a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        f();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f76273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.profile.i f76274b;

        static {
            Covode.recordClassIndex(47031);
        }

        b(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget, com.ss.android.ugc.aweme.commercialize.profile.i iVar) {
            this.f76273a = adFakeUserProfileBottomBarWidget;
            this.f76274b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ag.a(this.f76273a.f67007b, ((AbsAdProfileWidget) this.f76273a).f75063a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            ViewGroup e2 = e();
            if (e2 != null) {
                e2.animate().translationY((float) n.a(-16.0d)).setDuration(300).start();
                return;
            }
            return;
        }
        f();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void a(com.ss.android.ugc.aweme.commercialize.profile.i iVar) {
        AwemeRawAd awemeRawAd;
        String learnMoreBgColor;
        String str;
        AwemeRawAd awemeRawAd2;
        aa fakeAuthor;
        String str2;
        AwemeRawAd awemeRawAd3;
        l.d(iVar, "");
        super.a(iVar);
        TextView textView = (TextView) this.f76272m.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str2 = null;
            } else {
                str2 = awemeRawAd3.getButtonText();
            }
            textView.setText(str2);
        }
        TextView textView2 = (TextView) this.n.getValue();
        if (textView2 != null) {
            Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null) {
                str = null;
            } else {
                str = fakeAuthor.getButtonText();
            }
            textView2.setText(str);
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        }
        com.bytedance.lighten.a.a.a a2 = o.a.a(user);
        if (a2 != null) {
            v a3 = r.a(a2);
            a3.E = (SmartRoundImageView) this.f76271l.getValue();
            a3.c();
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
        if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) == null || learnMoreBgColor.length() <= 0)) {
            int parseColor = Color.parseColor(learnMoreBgColor);
            ViewGroup e2 = e();
            if (e2 != null) {
                e2.setBackground(new com.ss.android.ugc.aweme.commercialize.ad.b((float) n.a(4.0d), parseColor));
            }
        }
        ViewGroup e3 = e();
        if (e3 != null) {
            e3.setOnClickListener(new b(this, iVar));
        }
    }
}
