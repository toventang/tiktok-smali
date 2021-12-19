package com.ss.android.ugc.aweme.notificationlive.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.android.livesdk.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ar;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.q;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel;
import com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.z;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends v implements com.bytedance.assem.arch.viewModel.h, ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q {
    public static final String t = "data_user_key";
    public static final String u = "data_enter_from_key";
    public static final String v = "data_previous_page_key";
    public static final String w = "data_click_from_key";
    public static final String x = "data_aweme_raw_ad_key";
    public static final g y = new g((byte) 0);
    private TextView A;
    private ConstraintLayout B;
    private TextView C;
    private ConstraintLayout D;
    private ConstraintLayout E;
    private ImageView F;
    private ImageView G;
    private ImageView H;
    private ImageView I;
    private final lifecycleAwareLazy J;
    private final com.bytedance.assem.arch.viewModel.b K;
    private final lifecycleAwareLazy L;
    private SparseArray M;

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f114399a = new com.ss.android.ugc.aweme.base.arch.i();

    /* renamed from: b  reason: collision with root package name */
    public final h f114400b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f114401c;

    /* renamed from: d  reason: collision with root package name */
    public CommonItemView f114402d;

    /* renamed from: e  reason: collision with root package name */
    public User f114403e;

    /* renamed from: f  reason: collision with root package name */
    public t.a f114404f;

    /* renamed from: g  reason: collision with root package name */
    public String f114405g;

    /* renamed from: h  reason: collision with root package name */
    public String f114406h;

    /* renamed from: i  reason: collision with root package name */
    public String f114407i;

    /* renamed from: j  reason: collision with root package name */
    public AwemeRawAd f114408j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.profile.f f114409k;

    /* renamed from: l  reason: collision with root package name */
    public DialogInterface.OnCancelListener f114410l;

    /* renamed from: m  reason: collision with root package name */
    public final DialogInterface.OnDismissListener f114411m;
    public final DialogInterface.OnCancelListener n;
    private ScrollView z;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.notificationlive.b, com.ss.android.ugc.aweme.notificationlive.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(73596);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.notificationlive.b invoke(com.ss.android.ugc.aweme.notificationlive.b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    private final NotificationLiveViewModel h() {
        return (NotificationLiveViewModel) this.J.getValue();
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        SparseArray sparseArray = this.M;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.M == null) {
            this.M = new SparseArray();
        }
        View view = (View) this.M.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.M.put(i2, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final NotificationGameViewModel e() {
        return (NotificationGameViewModel) this.K.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class g {
        static {
            Covode.recordClassIndex(73603);
        }

        private g() {
        }

        public /* synthetic */ g(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f114399a;
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            String name = h.f.a.a(this.$viewModelClass).getName();
            h.f.b.l.a((Object) name, "");
            return name;
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114414a;

        static {
            Covode.recordClassIndex(73608);
        }

        l(a aVar) {
            this.f114414a = aVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i2;
            String str;
            ClickAgent.onClick(view);
            this.f114414a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114414a.f();
                return;
            }
            User user = this.f114414a.f114403e;
            if (user == null || user.getLivePushNotificationStatus() != 1) {
                this.f114414a.b(1);
                String str2 = this.f114414a.f114405g;
                User user2 = this.f114414a.f114403e;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114414a.f114403e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114414a.f114406h, "all");
            }
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114415a;

        static {
            Covode.recordClassIndex(73609);
        }

        m(a aVar) {
            this.f114415a = aVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i2;
            String str;
            ClickAgent.onClick(view);
            this.f114415a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114415a.f();
                return;
            }
            User user = this.f114415a.f114403e;
            if (user == null || user.getLivePushNotificationStatus() != 2) {
                this.f114415a.b(2);
                String str2 = this.f114415a.f114405g;
                User user2 = this.f114415a.f114403e;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114415a.f114403e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114415a.f114406h, "personalized");
            }
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114416a;

        static {
            Covode.recordClassIndex(73610);
        }

        n(a aVar) {
            this.f114416a = aVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i2;
            String str;
            ClickAgent.onClick(view);
            this.f114416a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114416a.f();
                return;
            }
            User user = this.f114416a.f114403e;
            if (user == null || user.getLivePushNotificationStatus() != 3) {
                this.f114416a.b(3);
                String str2 = this.f114416a.f114405g;
                User user2 = this.f114416a.f114403e;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114416a.f114403e;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114416a.f114406h, "off");
            }
        }
    }

    static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114417a;

        static {
            Covode.recordClassIndex(73611);
        }

        o(a aVar) {
            this.f114417a = aVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            String str2;
            ClickAgent.onClick(view);
            this.f114417a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114417a.g();
            }
            a aVar = this.f114417a;
            CommonItemView commonItemView = aVar.f114402d;
            if (commonItemView != null) {
                z = commonItemView.d();
            } else {
                z = true;
            }
            boolean z2 = !z;
            h hVar = aVar.f114400b;
            if (hVar != null) {
                hVar.show();
            }
            AwemeRawAd awemeRawAd = aVar.f114408j;
            if (awemeRawAd == null || (str = awemeRawAd.getLogExtra()) == null) {
                str = "";
            }
            String string = new JSONObject(str).getString("req_id");
            NotificationGameViewModel e2 = aVar.e();
            AwemeRawAd awemeRawAd2 = aVar.f114408j;
            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
                str2 = "";
            }
            h.f.b.l.b(string, "");
            e2.a(new com.ss.android.ugc.aweme.notificationlive.g(z2, str2, string));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.a$a  reason: collision with other inner class name */
    public static final class C2929a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2929a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public final void f() {
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.dl9).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!fg.a(getContext()) || !t.c()) {
            dismiss();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<NotificationLiveViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel> r0 = com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.a$d$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.a$d$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.a.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<UserViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, h.f.a.a aVar, h.k.c cVar, h.f.a.m mVar) {
            super(0);
            this.$this_viewModel = fragment;
            this.$keyFactory = aVar;
            this.$viewModelClass = cVar;
            this.$argumentsAcceptor = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.user.repository.UserViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.$this_viewModel
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.ar) r0
                androidx.lifecycle.ad$b r0 = r0.d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.f.a.a r0 = r3.$keyFactory
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.user.repository.UserViewModel> r0 = com.ss.android.ugc.aweme.user.repository.UserViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.a$f$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.a$f$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.a.f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_notificationlive_ui_HorizontalNotificationDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(73594);
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.ani);
        bVar.f22380g = 8388613;
        bVar.f22381h = com.bytedance.android.live.core.f.y.a(375.0f);
        bVar.f22377d = false;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            bVar.f22382i = com.bytedance.android.live.core.f.y.a(activity).heightPixels;
        }
        return bVar;
    }

    public final void g() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "save", this.f114408j).b("refer", "manage_page").a("enter_from", this.f114407i).a("success", 1).b();
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.c3t).a();
    }

    public a() {
        h hVar;
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            hVar = new h(context);
        } else {
            hVar = null;
        }
        this.f114400b = hVar;
        this.f114405g = "";
        this.f114406h = "";
        this.f114407i = "";
        q qVar = q.f114419a;
        h.k.c a2 = h.f.b.ab.a(NotificationLiveViewModel.class);
        c cVar = new c(a2);
        this.J = new lifecycleAwareLazy(this, cVar, new d(this, cVar, a2, qVar));
        h.k.c a3 = h.f.b.ab.a(NotificationGameViewModel.class);
        this.K = new com.bytedance.assem.arch.viewModel.b(a3, new C2929a(a3), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
        r rVar = new r(this);
        h.k.c a4 = h.f.b.ab.a(UserViewModel.class);
        e eVar = new e(a4);
        this.L = new lifecycleAwareLazy(this, eVar, new f(this, eVar, a4, rVar));
        this.f114411m = new i(this);
        this.n = new h(this);
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114418a;

        static {
            Covode.recordClassIndex(73612);
        }

        p(a aVar) {
            this.f114418a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f114418a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f114410l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    static final class h implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114412a;

        static {
            Covode.recordClassIndex(73604);
        }

        h(a aVar) {
            this.f114412a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            LinearLayout linearLayout = this.f114412a.f114401c;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.f114412a.f114408j).b("refer", "manage_page").a("enter_from", this.f114412a.f114407i).a("notification_choose_type", 2).b();
            }
            com.ss.android.ugc.aweme.profile.f fVar = this.f114412a.f114409k;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f114413a;

        static {
            Covode.recordClassIndex(73605);
        }

        i(a aVar) {
            this.f114413a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.profile.f fVar = this.f114413a.f114409k;
            if (fVar != null) {
                fVar.b();
            }
            LinearLayout linearLayout = this.f114413a.f114401c;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.f114413a.f114408j).b("refer", "manage_page").a("enter_from", this.f114413a.f114407i).a("notification_choose_type", 2).b();
            }
        }
    }

    public final void b(int i2) {
        String str;
        h hVar = this.f114400b;
        if (hVar != null) {
            hVar.show();
        }
        NotificationLiveViewModel h2 = h();
        User user = this.f114403e;
        String str2 = "";
        if (user == null || (str = user.getSecUid()) == null) {
            str = str2;
        }
        h2.a(new com.ss.android.ugc.aweme.notificationlive.v(i2, str));
        com.ss.android.ugc.aweme.profile.f fVar = this.f114409k;
        if (fVar != null) {
            f.a a2 = fVar.a();
            if (i2 == 1) {
                str2 = "all";
            } else if (i2 == 2) {
                str2 = "personalized";
            } else if (i2 == 3) {
                str2 = "off";
            }
            com.ss.android.ugc.aweme.common.r.a("livesdk_live_notification_choose", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", a2.f116377c).a("enter_method", a2.f116378d).a("room_id", a2.f116375a).a("anchor_id", a2.f116376b).a("setting_type", str2).a(a2.f116379e).f66730a);
        }
    }

    public final void c(int i2) {
        if (i2 == 1) {
            ImageView imageView = this.G;
            if (imageView == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView.setImageResource(2131233388);
            ImageView imageView2 = this.H;
            if (imageView2 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView2.setImageResource(2131233389);
            ImageView imageView3 = this.I;
            if (imageView3 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView3.setImageResource(2131233389);
        } else if (i2 == 2) {
            ImageView imageView4 = this.G;
            if (imageView4 == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView4.setImageResource(2131233389);
            ImageView imageView5 = this.H;
            if (imageView5 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView5.setImageResource(2131233388);
            ImageView imageView6 = this.I;
            if (imageView6 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView6.setImageResource(2131233389);
        } else if (i2 == 3) {
            ImageView imageView7 = this.G;
            if (imageView7 == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView7.setImageResource(2131233389);
            ImageView imageView8 = this.H;
            if (imageView8 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView8.setImageResource(2131233389);
            ImageView imageView9 = this.I;
            if (imageView9 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView9.setImageResource(2131233388);
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class q extends h.f.b.m implements h.f.a.m<ResponseState, Bundle, ResponseState> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f114419a = new q();

        static {
            Covode.recordClassIndex(73613);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ResponseState invoke(ResponseState responseState, Bundle bundle) {
            ResponseState responseState2 = responseState;
            h.f.b.l.d(responseState2, "");
            return ResponseState.copy$default(responseState2, -1, -1, null, null, 12, null);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<UserState, Bundle, UserState> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(73614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ UserState invoke(UserState userState, Bundle bundle) {
            UserState userState2 = userState;
            h.f.b.l.d(userState2, "");
            User user = this.this$0.f114403e;
            if (user == null) {
                user = new User();
            }
            return UserState.copy$default(userState2, user, false, null, null, null, 30, null);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CommerceUserInfo commerceUserInfo;
        String c2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f114403e = (User) arguments.getSerializable(t);
            Object a2 = a(arguments, u);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.String");
            this.f114405g = (String) a2;
            Object a3 = a(arguments, v);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type kotlin.String");
            this.f114406h = (String) a3;
            Object a4 = a(arguments, w);
            Objects.requireNonNull(a4, "null cannot be cast to non-null type kotlin.String");
            this.f114407i = (String) a4;
            this.f114408j = (AwemeRawAd) a(arguments, x);
        }
        h.f.b.l.d(view, "");
        view.findViewById(R.id.dqe).setBackgroundResource(R.drawable.btk);
        View findViewById = view.findViewById(R.id.b7q);
        h.f.b.l.b(findViewById, "");
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.ddw);
        h.f.b.l.b(findViewById2, "");
        ScrollView scrollView = (ScrollView) findViewById2;
        this.z = scrollView;
        if (scrollView == null) {
            h.f.b.l.a("pushSettingLayout");
        }
        boolean z2 = false;
        scrollView.setVisibility(0);
        View findViewById3 = view.findViewById(R.id.de0);
        h.f.b.l.b(findViewById3, "");
        this.A = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dds);
        h.f.b.l.b(findViewById4, "");
        this.B = (ConstraintLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.de2);
        h.f.b.l.b(findViewById5, "");
        this.C = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ddz);
        h.f.b.l.b(findViewById6, "");
        this.D = (ConstraintLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.ddy);
        h.f.b.l.b(findViewById7, "");
        this.E = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.ddt);
        h.f.b.l.b(findViewById8, "");
        this.F = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.iz);
        h.f.b.l.b(findViewById9, "");
        this.G = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.dir);
        h.f.b.l.b(findViewById10, "");
        this.H = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cyl);
        h.f.b.l.b(findViewById11, "");
        this.I = (ImageView) findViewById11;
        this.f114401c = (LinearLayout) view.findViewById(R.id.ddr);
        this.f114402d = (CommonItemView) view.findViewById(R.id.ddv);
        com.ss.android.ugc.aweme.profile.f fVar = this.f114409k;
        int i2 = 1;
        if (!(fVar == null || (c2 = fVar.c()) == null || c2.length() == 0)) {
            TextView textView = this.C;
            if (textView == null) {
                h.f.b.l.a("pushSettingNoticeStr");
            }
            textView.setVisibility(0);
            TextView textView2 = this.C;
            if (textView2 == null) {
                h.f.b.l.a("pushSettingNoticeStr");
            }
            textView2.setText(fVar.c());
        }
        ConstraintLayout constraintLayout = this.B;
        if (constraintLayout == null) {
            h.f.b.l.a("pushSettingAllLive");
        }
        constraintLayout.setOnClickListener(new l(this));
        ConstraintLayout constraintLayout2 = this.D;
        if (constraintLayout2 == null) {
            h.f.b.l.a("pushSettingRecommendedLive");
        }
        constraintLayout2.setOnClickListener(new m(this));
        ConstraintLayout constraintLayout3 = this.E;
        if (constraintLayout3 == null) {
            h.f.b.l.a("pushSettingOffLive");
        }
        constraintLayout3.setOnClickListener(new n(this));
        CommonItemView commonItemView = this.f114402d;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new o(this));
        }
        CommonItemView commonItemView2 = this.f114402d;
        if (commonItemView2 != null) {
            User user = this.f114403e;
            if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null || commerceUserInfo.getNotificationConfig() != 1)) {
                z2 = true;
            }
            commonItemView2.setChecked(z2);
        }
        ImageView imageView = this.F;
        if (imageView == null) {
            h.f.b.l.a("pushSettingClose");
        }
        imageView.setOnClickListener(new p(this));
        User user2 = this.f114403e;
        if (user2 != null) {
            i2 = user2.getLivePushNotificationStatus();
        }
        c(i2);
        com.ss.android.ugc.aweme.profile.f fVar2 = this.f114409k;
        if (fVar2 != null) {
            f.a a5 = fVar2.a();
            com.ss.android.ugc.aweme.common.r.a("livesdk_live_notification_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", a5.f116377c).a("enter_method", a5.f116378d).a("room_id", a5.f116375a).a("anchor_id", a5.f116376b).a(a5.f116379e).f66730a);
        }
        f.a.b.b unused = selectSubscribe(h(), e.f114453a, f.f114454a, g.f114455a, new ah(), new k(this));
        f.a.a(this, e(), b.f114450a, c.f114451a, d.f114452a, (com.bytedance.assem.arch.viewModel.k) null, new j(this), 24);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    static final class j extends h.f.b.m implements h.f.a.r<com.bytedance.tiktok.proxy.d, com.ss.android.ugc.aweme.notificationlive.d, com.bytedance.jedi.arch.a<? extends Boolean>, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(73606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(4);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(com.bytedance.tiktok.proxy.d dVar, com.ss.android.ugc.aweme.notificationlive.d dVar2, com.bytedance.jedi.arch.a<? extends Boolean> aVar, Integer num) {
            boolean z;
            boolean z2;
            com.bytedance.jedi.arch.a<? extends Boolean> aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar2, "");
            if (dVar2 != null) {
                h hVar = this.this$0.f114400b;
                if (hVar != null) {
                    hVar.dismiss();
                }
                if (intValue == 0) {
                    CommonItemView commonItemView = this.this$0.f114402d;
                    if (commonItemView != null) {
                        Boolean bool = (Boolean) aVar2.a();
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        commonItemView.setChecked(z2);
                    }
                    a aVar3 = this.this$0;
                    Boolean bool2 = (Boolean) aVar2.a();
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = true;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", aVar3.f114408j).b("refer", "manage_page").a("enter_from", aVar3.f114407i).a("notification_choose_type", Integer.valueOf(!z ? 1 : 0)).b();
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.c3u).a();
                } else {
                    this.this$0.g();
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.r<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.notificationlive.r, Integer, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(73607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(4);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.notificationlive.r rVar, Integer num, Integer num2) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            h.f.b.l.d(iVar, "");
            if (rVar != null) {
                h hVar = this.this$0.f114400b;
                if (hVar != null) {
                    hVar.dismiss();
                }
                if (intValue2 == 0) {
                    this.this$0.c(intValue);
                    AwemeRawAd awemeRawAd = this.this$0.f114408j;
                    if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
                        this.this$0.dismiss();
                    }
                    a aVar = this.this$0;
                    if (intValue == 1) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(aVar.getContext()).a(R.string.sl).a();
                    } else if (intValue == 2) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(aVar.getContext()).a(R.string.gaj).a();
                    } else if (intValue == 3) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(aVar.getContext()).a(R.string.dlv).a();
                    }
                    com.ss.android.ugc.aweme.profile.f fVar = this.this$0.f114409k;
                    if (fVar != null) {
                        fVar.a(intValue);
                    }
                } else {
                    this.this$0.f();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
