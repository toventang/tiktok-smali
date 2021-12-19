package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.commercialize.model.aa;
import com.ss.android.ugc.aweme.commercialize.profile.i;
import com.ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.z;

public final class o extends com.ss.android.ugc.aweme.base.ui.e implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, com.ss.android.ugc.aweme.profile.ui.d.a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f75236c = o.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static final a f75237d = new a((byte) 0);
    private com.ss.android.ugc.aweme.arch.widgets.base.e A;
    private SparseArray B;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f75238a;

    /* renamed from: b  reason: collision with root package name */
    public String f75239b;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f75240j = h.i.a((h.f.a.a) new i(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f75241k = h.i.a((h.f.a.a) new m(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f75242l = h.i.a((h.f.a.a) new f(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f75243m = h.i.a((h.f.a.a) new l(this));
    private final h.h n = h.i.a((h.f.a.a) new j(this));
    private final h.h o = h.i.a((h.f.a.a) new n(this));
    private final h.h p = h.i.a((h.f.a.a) new p(this));
    private final h.h q = h.i.a((h.f.a.a) new C1716o(this));
    private final h.h r = h.i.a((h.f.a.a) new k(this));
    private final h.h s = h.i.a((h.f.a.a) new d(this));
    private final h.h t = h.i.a((h.f.a.a) new e(this));
    private final h.h u = h.i.a((h.f.a.a) new q(this));
    private final h.h v = h.i.a((h.f.a.a) new h(this));
    private final h.h w = h.i.a((h.f.a.a) new g(this));
    private String y;
    private DataCenter z;

    private final View g() {
        return (View) this.f75240j.getValue();
    }

    private final TextView h() {
        return (TextView) this.q.getValue();
    }

    private final TextView i() {
        return (TextView) this.r.getValue();
    }

    private final ConstraintLayout j() {
        return (ConstraintLayout) this.t.getValue();
    }

    private final View k() {
        return (View) this.w.getValue();
    }

    public final View a() {
        return (View) this.f75241k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final View a(int i2) {
        if (this.B == null) {
            this.B = new SparseArray();
        }
        View view = (View) this.B.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.B.put(i2, findViewById);
        return findViewById;
    }

    public final TextView b() {
        return (TextView) this.f75243m.getValue();
    }

    public final TextView d() {
        return (TextView) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final void e() {
        SparseArray sparseArray = this.B;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46414);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.bytedance.lighten.a.a.a a(User user) {
            UrlModel avatarLarger;
            if (user == null) {
                return null;
            }
            if (user.getAvatarMedium() != null) {
                avatarLarger = user.getAvatarMedium();
            } else if (user.getAvatarThumb() != null) {
                avatarLarger = user.getAvatarThumb();
            } else {
                if (user.getAvatarLarger() != null) {
                    avatarLarger = user.getAvatarLarger();
                }
                return null;
            }
            if (avatarLarger != null) {
                return new com.bytedance.lighten.a.a.a(avatarLarger.getUrlList());
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final Fragment c() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.d_);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.da);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.a(R.id.q9);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.a(R.id.awd);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.a(R.id.ffy);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.dqn);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<NestedScrollView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NestedScrollView invoke() {
            return this.this$0.a(R.id.dtg);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.elq);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.title);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.em8);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<SmartRoundImageView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.this$0.a(R.id.fcu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.o$o  reason: collision with other inner class name */
    static final class C1716o extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1716o(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.fd9);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.fdm);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.a(R.id.ffw);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.z;
        if (dataCenter != null) {
            dataCenter.a(this);
        }
    }

    static {
        Covode.recordClassIndex(46413);
    }

    private final boolean l() {
        AwemeRawAd awemeRawAd;
        aa fakeAuthor;
        Integer fakeAuthorVersion;
        Aweme aweme = this.f75238a;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) == null || fakeAuthorVersion.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(String str) {
        this.y = str;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(boolean z2) {
        setUserVisibleHint(z2);
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f75245a;

        static {
            Covode.recordClassIndex(46431);
        }

        r(h.f.a.a aVar) {
            this.f75245a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75245a.invoke();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<i, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(46415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            iVar2.f75183a = this.this$0.f75238a;
            iVar2.f75184b = this.this$0;
            iVar2.f75185c = this.this$0.f75239b;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        ((ImageView) this.f75242l.getValue()).setOnClickListener(new r(aVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        DataCenter dataCenter = this.z;
        if (dataCenter != null) {
            dataCenter.a("AD_PROFILE_VISIBILITY_CHANGED", Boolean.valueOf(z2));
        }
        com.ss.android.ugc.aweme.base.utils.o.a((Activity) getActivity());
        if (z2) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                h.f.b.l.b(window, "");
                View decorView = window.getDecorView();
                h.f.b.l.b(decorView, "");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                Window window2 = activity.getWindow();
                h.f.b.l.b(window2, "");
                View decorView2 = window2.getDecorView();
                h.f.b.l.b(decorView2, "");
                decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
            }
        } else {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null && Build.VERSION.SDK_INT >= 23) {
                Window window3 = activity2.getWindow();
                h.f.b.l.b(window3, "");
                View decorView3 = window3.getDecorView();
                h.f.b.l.b(decorView3, "");
                decorView3.setSystemUiVisibility(1024);
            }
        }
        com.ss.android.ugc.aweme.commercialize.utils.f.f75762c = z2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && (str = bVar2.f67014a) != null && str.hashCode() == 860337036 && str.equals("ON_VIDEO_CONTAINER_SIZE_CHANGE")) {
            Rect c2 = com.ss.android.ugc.aweme.base.utils.o.c(g().findViewById(R.id.ffq));
            View findViewById = g().findViewById(R.id.ffp);
            Rect c3 = com.ss.android.ugc.aweme.base.utils.o.c(findViewById);
            View findViewById2 = g().findViewById(R.id.d_);
            Rect c4 = com.ss.android.ugc.aweme.base.utils.o.c(g().findViewById(R.id.d_));
            h.f.b.l.b(findViewById2, "");
            float a2 = (((float) c4.top) + (((float) com.ss.android.ugc.aweme.base.utils.n.a(-16.0d)) - findViewById2.getTranslationY())) - ((float) c2.top);
            if (l()) {
                a2 = (float) (com.ss.android.ugc.aweme.base.utils.o.c(g().findViewById(R.id.awd)).top - c2.top);
            }
            if (a2 - ((float) c3.height()) > 0.0f) {
                h.f.b.l.b(findViewById, "");
                findViewById.setTranslationY((a2 - ((float) c3.height())) / 2.0f);
            }
            Rect c5 = com.ss.android.ugc.aweme.base.utils.o.c(g());
            View findViewById3 = g().findViewById(R.id.ffs);
            int i2 = c5.bottom - com.ss.android.ugc.aweme.base.utils.o.c(findViewById3).top;
            if (i2 > 0) {
                h.f.b.l.b(findViewById3, "");
                ViewWrapper viewWrapper = new ViewWrapper(findViewById3);
                viewWrapper.setWidth(c5.width());
                viewWrapper.setHeight(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        User user;
        String str5;
        AwemeRawAd awemeRawAd;
        aa fakeAuthor;
        String str6;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String str7;
        String str8;
        String str9;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        aa fakeAuthor2;
        User author;
        User author2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str10 = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.f75238a = com.ss.android.ugc.aweme.commercialize.e.a.b.d(str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("enter_from");
        } else {
            str2 = null;
        }
        this.f75239b = str2;
        DataCenter a2 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.z = a2;
        if (a2 != null) {
            a2.a("AD_PROFILE_PARAMS", (Object) new i.a().a(new b(this)).f75479a);
        }
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.ss.android.ugc.aweme.adaptation.c.d(getContext());
            a().setLayoutParams(marginLayoutParams);
        }
        TextView b2 = b();
        Aweme aweme = this.f75238a;
        if (aweme == null || (author2 = aweme.getAuthor()) == null) {
            str3 = null;
        } else {
            str3 = author2.getNickname();
        }
        b2.setText(str3);
        ((NestedScrollView) this.n.getValue()).setOnScrollChangeListener(new c(this));
        TextView d2 = d();
        Aweme aweme2 = this.f75238a;
        if (aweme2 == null || (author = aweme2.getAuthor()) == null) {
            str4 = null;
        } else {
            str4 = author.getNickname();
        }
        d2.setText(str4);
        Aweme aweme3 = this.f75238a;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        } else {
            user = null;
        }
        com.bytedance.lighten.a.a.a a3 = a.a(user);
        if (a3 != null) {
            v a4 = com.bytedance.lighten.a.r.a(a3);
            a4.E = (SmartRoundImageView) this.o.getValue();
            a4.c();
        }
        if (l()) {
            i().setVisibility(0);
            h().setVisibility(8);
            TextView i2 = i();
            Aweme aweme4 = this.f75238a;
            if (aweme4 == null || (awemeRawAd6 = aweme4.getAwemeRawAd()) == null || (fakeAuthor2 = awemeRawAd6.getFakeAuthor()) == null) {
                str7 = null;
            } else {
                str7 = fakeAuthor2.getDescription();
            }
            i2.setText(str7);
            ((ConstraintLayout) this.s.getValue()).setVisibility(8);
            ((FrameLayout) this.u.getValue()).setVisibility(8);
            k().setVisibility(0);
            Aweme aweme5 = this.f75238a;
            if (aweme5 == null || (awemeRawAd5 = aweme5.getAwemeRawAd()) == null) {
                str8 = null;
            } else {
                str8 = awemeRawAd5.getOpenUrl();
            }
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.c(str8)) {
                Aweme aweme6 = this.f75238a;
                if (aweme6 == null || (awemeRawAd4 = aweme6.getAwemeRawAd()) == null) {
                    str9 = null;
                } else {
                    str9 = awemeRawAd4.getType();
                }
                if (!h.f.b.l.a((Object) str9, (Object) "app")) {
                    j().setVisibility(8);
                }
            }
        } else {
            i().setVisibility(8);
            h().setVisibility(0);
            TextView h2 = h();
            Aweme aweme7 = this.f75238a;
            if (aweme7 == null || (awemeRawAd = aweme7.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                str5 = null;
            } else {
                str5 = fakeAuthor.getDescription();
            }
            h2.setText(str5);
            ((LinearLayout) this.v.getValue()).setVisibility(8);
            j().setVisibility(8);
            k().setVisibility(8);
        }
        DataCenter dataCenter = this.z;
        if (dataCenter != null) {
            dataCenter.a("ON_VIDEO_CONTAINER_SIZE_CHANGE", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
        com.ss.android.ugc.aweme.arch.widgets.base.e a5 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, g());
        this.A = a5;
        if (a5 != null) {
            a5.a(this.z);
        }
        com.ss.android.ugc.aweme.arch.widgets.base.e eVar = this.A;
        if (eVar != null) {
            eVar.b(R.id.ffq, new AdFakeUserProfileVideoPlayWidget());
            if (l()) {
                eVar.b(R.id.ffy, new AdFakeUserProfileVideoNewDescWidget());
                Aweme aweme8 = this.f75238a;
                if (aweme8 == null || (awemeRawAd3 = aweme8.getAwemeRawAd()) == null) {
                    str6 = null;
                } else {
                    str6 = awemeRawAd3.getOpenUrl();
                }
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.c(str6)) {
                    Aweme aweme9 = this.f75238a;
                    if (!(aweme9 == null || (awemeRawAd2 = aweme9.getAwemeRawAd()) == null)) {
                        str10 = awemeRawAd2.getType();
                    }
                    if (!h.f.b.l.a((Object) str10, (Object) "app")) {
                        eVar.b(R.id.e9, new AdFakePopUpWebPageWidget());
                        return;
                    }
                }
                eVar.b(R.id.da, new AdFakeUserProfileNewBottomBarWidget());
                return;
            }
            eVar.b(R.id.d_, new AdFakeUserProfileBottomBarWidget());
            eVar.b(R.id.ffw, new AdFakeUserProfileVideoDescWidget());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0z, viewGroup, false);
    }

    static final class c implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f75244a;

        static {
            Covode.recordClassIndex(46416);
        }

        c(o oVar) {
            this.f75244a = oVar;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            Rect c2 = com.ss.android.ugc.aweme.base.utils.o.c(this.f75244a.a());
            Rect c3 = com.ss.android.ugc.aweme.base.utils.o.c(this.f75244a.d());
            if (c2.bottom > c3.bottom && this.f75244a.b().getAlpha() == 0.0f) {
                this.f75244a.b().animate().alpha(1.0f).setDuration(350).start();
            } else if (c2.bottom < c3.bottom && this.f75244a.b().getAlpha() == 1.0f) {
                this.f75244a.b().animate().alpha(0.0f).setDuration(350).start();
            }
        }
    }
}
