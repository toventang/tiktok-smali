package com.ss.android.ugc.aweme.notificationlive;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
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
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.profile.edit.g;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class j extends Fragment implements com.bytedance.assem.arch.viewModel.h, ar<com.ss.android.ugc.aweme.base.arch.i>, com.bytedance.jedi.arch.q {
    private ConstraintLayout A;
    private ImageView B;
    private ImageView C;
    private ImageView D;
    private ImageView E;
    private final lifecycleAwareLazy F;
    private final com.bytedance.assem.arch.viewModel.b G;
    private final lifecycleAwareLazy H;
    private final boolean I;
    private final String J;
    private SparseArray K;

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.i f114326a;

    /* renamed from: b  reason: collision with root package name */
    public final c f114327b;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f114328c;

    /* renamed from: d  reason: collision with root package name */
    public ConstraintLayout f114329d;

    /* renamed from: e  reason: collision with root package name */
    public MusAvatarWithBorderView f114330e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f114331f;

    /* renamed from: g  reason: collision with root package name */
    public TuxButton f114332g;

    /* renamed from: h  reason: collision with root package name */
    public View f114333h;

    /* renamed from: i  reason: collision with root package name */
    public ScrollView f114334i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f114335j;

    /* renamed from: k  reason: collision with root package name */
    public CommonItemView f114336k;

    /* renamed from: l  reason: collision with root package name */
    public final DialogInterface.OnDismissListener f114337l;

    /* renamed from: m  reason: collision with root package name */
    public final DialogInterface.OnCancelListener f114338m;
    public final User n;
    public final t.a o;
    public final String p;
    public final String q;
    public final String r;
    public final AwemeRawAd s;
    public final com.ss.android.ugc.aweme.profile.f t;
    private TextView u;
    private ImageView v;
    private TextView w;
    private ConstraintLayout x;
    private TextView y;
    private ConstraintLayout z;

    public static final class b extends h.f.b.m implements h.f.a.b<b, b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(73515);
        }

        public b() {
            super(1);
        }

        public final b invoke(b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(73513);
    }

    public j() {
        this((User) null, (t.a) null, false, (String) null, (String) null, (String) null, (String) null, (AwemeRawAd) null, 511);
    }

    private final NotificationLiveViewModel j() {
        return (NotificationLiveViewModel) this.F.getValue();
    }

    private final UserViewModel k() {
        return (UserViewModel) this.H.getValue();
    }

    /* access modifiers changed from: package-private */
    public final NotificationGameViewModel a() {
        return (NotificationGameViewModel) this.G.getValue();
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

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.ar
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.base.arch.i d() {
        return this.f114326a;
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
            Covode.recordClassIndex(73516);
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
            Covode.recordClassIndex(73519);
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
        final /* synthetic */ j f114343a;

        static {
            Covode.recordClassIndex(73528);
        }

        l(j jVar) {
            this.f114343a = jVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            GeneralPermission generalPermission;
            int followToastType;
            int i2;
            ClickAgent.onClick(view);
            this.f114343a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114343a.h();
            } else if (this.f114343a.c()) {
                j jVar = this.f114343a;
                User user = jVar.n;
                if (user == null || (generalPermission = user.getGeneralPermission()) == null || !((followToastType = generalPermission.getFollowToastType()) == 2 || followToastType == 3 || followToastType == 4)) {
                    this.f114343a.b();
                    return;
                }
                Context context = jVar.getContext();
                if (context != null) {
                    h.f.b.l.b(context, "");
                    com.bytedance.tux.dialog.internal.b a2 = new com.bytedance.tux.dialog.b(context).a(R.string.byx);
                    if (followToastType == 4) {
                        i2 = R.string.bzy;
                    } else {
                        i2 = R.string.c02;
                    }
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a2.b(i2), new h(jVar, followToastType)).a().b().show();
                }
            }
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114345a;

        static {
            Covode.recordClassIndex(73532);
        }

        p(j jVar) {
            this.f114345a = jVar;
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
            this.f114345a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114345a.f();
                return;
            }
            User user = this.f114345a.n;
            if (user == null || user.getLivePushNotificationStatus() != 1) {
                this.f114345a.a(1);
                String str2 = this.f114345a.p;
                User user2 = this.f114345a.n;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114345a.n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114345a.q, "all");
            }
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114346a;

        static {
            Covode.recordClassIndex(73533);
        }

        q(j jVar) {
            this.f114346a = jVar;
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
            this.f114346a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114346a.f();
                return;
            }
            User user = this.f114346a.n;
            if (user == null || user.getLivePushNotificationStatus() != 2) {
                this.f114346a.a(2);
                String str2 = this.f114346a.p;
                User user2 = this.f114346a.n;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114346a.n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114346a.q, "personalized");
            }
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114347a;

        static {
            Covode.recordClassIndex(73534);
        }

        r(j jVar) {
            this.f114347a = jVar;
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
            this.f114347a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114347a.f();
                return;
            }
            User user = this.f114347a.n;
            if (user == null || user.getLivePushNotificationStatus() != 3) {
                this.f114347a.a(3);
                String str2 = this.f114347a.p;
                User user2 = this.f114347a.n;
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                } else {
                    i2 = 0;
                }
                User user3 = this.f114347a.n;
                if (user3 == null || (str = user3.getUid()) == null) {
                    str = "";
                }
                y.a(str2, i2, str, this.f114347a.q, "off");
            }
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114348a;

        static {
            Covode.recordClassIndex(73535);
        }

        s(j jVar) {
            this.f114348a = jVar;
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
            this.f114348a.getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                this.f114348a.g();
            }
            j jVar = this.f114348a;
            CommonItemView commonItemView = jVar.f114336k;
            if (commonItemView != null) {
                z = commonItemView.d();
            } else {
                z = true;
            }
            boolean z2 = !z;
            c cVar = jVar.f114327b;
            if (cVar != null) {
                cVar.show();
            }
            AwemeRawAd awemeRawAd = jVar.s;
            if (awemeRawAd == null || (str = awemeRawAd.getLogExtra()) == null) {
                str = "";
            }
            String string = new JSONObject(str).getString("req_id");
            NotificationGameViewModel a2 = jVar.a();
            AwemeRawAd awemeRawAd2 = jVar.s;
            if (awemeRawAd2 == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
                str2 = "";
            }
            h.f.b.l.b(string, "");
            a2.a(new g(z2, str2, string));
        }
    }

    public final boolean i() {
        AwemeRawAd awemeRawAd = this.s;
        if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.K;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
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

    public final void h() {
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.g21).a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        /*
            r1 = this;
            super.onResume()
            android.content.Context r0 = r1.getContext()
            boolean r0 = com.ss.android.ugc.aweme.utils.fg.a(r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = com.ss.android.ugc.aweme.notificationlive.t.c()
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            r0 = r1
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.onResume():void");
    }

    public static final class d extends h.f.b.m implements h.f.a.a<NotificationLiveViewModel> {
        final /* synthetic */ h.f.a.m $argumentsAcceptor;
        final /* synthetic */ h.f.a.a $keyFactory;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(73517);
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel> r0 = com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.j$d$1 r0 = new com.ss.android.ugc.aweme.notificationlive.j$d$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
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
            Covode.recordClassIndex(73520);
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
                androidx.lifecycle.ac r2 = com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f39365j
                java.lang.Class<com.ss.android.ugc.aweme.user.repository.UserViewModel> r0 = com.ss.android.ugc.aweme.user.repository.UserViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                h.f.b.l.a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.j$f$1 r0 = new com.ss.android.ugc.aweme.notificationlive.j$f$1
                r0.<init>(r3)
                r2.a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.f.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_notificationlive_NotificationLiveBottomDialog$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public final boolean c() {
        Integer num;
        User user = this.n;
        if (user != null && user.isBlocked()) {
            User user2 = this.n;
            if (user2 != null) {
                num = Integer.valueOf(user2.getFollowStatus());
            } else {
                num = null;
            }
            if (!in.a(num.intValue())) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.byv).a();
                return false;
            }
        }
        return true;
    }

    public final void g() {
        com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "save", this.s).b("refer", "manage_page").a("enter_from", this.r).a("success", 1).b();
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.c3t).a();
    }

    public final void e() {
        String str;
        Resources resources;
        if (i()) {
            TextView textView = this.w;
            if (textView == null) {
                h.f.b.l.a("pushSettingTitle");
            }
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.c3w);
            }
            textView.setText(str);
            LinearLayout linearLayout = this.f114335j;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ConstraintLayout constraintLayout = this.x;
            if (constraintLayout == null) {
                h.f.b.l.a("pushSettingAllLive");
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            ConstraintLayout constraintLayout2 = this.x;
            if (constraintLayout2 == null) {
                h.f.b.l.a("pushSettingAllLive");
            }
            constraintLayout2.setLayoutParams(marginLayoutParams);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow", this.s).b("refer", "manage_page").a("enter_from", this.r).b();
            return;
        }
        LinearLayout linearLayout2 = this.f114335j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public static final class m implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114344a;

        static {
            Covode.recordClassIndex(73529);
        }

        public final boolean onPreDraw() {
            int i2;
            int height = j.b(this.f114344a).getHeight() - j.c(this.f114344a).getHeight();
            TextView textView = this.f114344a.f114331f;
            if (textView == null) {
                h.f.b.l.a("followDoc");
            }
            int bottom = height - (textView.getBottom() - j.a(this.f114344a).getTop());
            View view = this.f114344a.f114333h;
            if (view == null) {
                h.f.b.l.a("followLine");
            }
            int bottom2 = (bottom - view.getBottom()) / 10;
            ViewGroup.LayoutParams layoutParams = j.a(this.f114344a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = j.c(this.f114344a).getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
            ViewGroup.LayoutParams layoutParams3 = j.b(this.f114344a).getLayoutParams();
            int height2 = j.b(this.f114344a).getHeight();
            double b2 = (double) com.bytedance.common.utility.n.b(this.f114344a.getContext());
            Double.isNaN(b2);
            if (height2 > ((int) (b2 * 0.73d))) {
                double b3 = (double) com.bytedance.common.utility.n.b(this.f114344a.getContext());
                Double.isNaN(b3);
                layoutParams3.height = (int) (b3 * 0.73d);
                j.b(this.f114344a).setLayoutParams(layoutParams3);
                return false;
            }
            int i3 = bottom2 * 4;
            if (aVar.topMargin == i3 && aVar2.topMargin == (i2 = bottom2 * 3) && aVar2.bottomMargin == i2) {
                j.d(this.f114344a).getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            aVar.topMargin = i3;
            int i4 = bottom2 * 3;
            aVar2.topMargin = i4;
            aVar2.bottomMargin = i4;
            j.a(this.f114344a).setLayoutParams(aVar);
            j.c(this.f114344a).setLayoutParams(aVar2);
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(j jVar) {
            this.f114344a = jVar;
        }
    }

    public final void b() {
        int i2;
        String str;
        String str2;
        int i3;
        String str3;
        String str4;
        int i4;
        int i5;
        User user = this.n;
        boolean z2 = true;
        if (user == null || user.getFollowStatus() != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        UserViewModel k2 = k();
        n.a aVar = new n.a();
        User user2 = this.n;
        String str5 = null;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        n.a a2 = aVar.a(str);
        User user3 = this.n;
        if (user3 != null) {
            str2 = user3.getSecUid();
        } else {
            str2 = null;
        }
        String str6 = "other_places";
        n.a b2 = a2.b(str2).a(i2).c(str6).b(0);
        User user4 = this.n;
        if (user4 != null) {
            i3 = user4.getFollowerStatus();
        } else {
            i3 = 0;
        }
        k2.a(b2.d(i3).a());
        User user5 = this.n;
        if (user5 == null || user5.getFollowerStatus() != 1) {
            str3 = "single";
        } else {
            str3 = "mutual";
        }
        com.ss.android.ugc.aweme.metrics.v vVar = new com.ss.android.ugc.aweme.metrics.v();
        User user6 = this.n;
        if (user6 != null) {
            str4 = user6.getUid();
        } else {
            str4 = null;
        }
        vVar.f109608e = str4;
        com.ss.android.ugc.aweme.metrics.v a3 = vVar.a(this.p);
        a3.s = "notification_bell";
        a3.f109605b = this.q;
        if (!h.f.b.l.a((Object) this.J, (Object) "")) {
            str6 = this.J;
        }
        a3.f109606c = str6;
        a3.v = str3;
        User user7 = this.n;
        if (user7 == null || !user7.isSecret()) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        a3.aa = i4;
        a3.a(this.n).f();
        User user8 = this.n;
        if (user8 != null) {
            str5 = user8.getUid();
        }
        User user9 = this.n;
        if (user9 != null) {
            i5 = user9.getFollowStatus();
        } else {
            i5 = 0;
        }
        User user10 = this.n;
        if (user10 == null || user10.getAccountType() != 3) {
            z2 = false;
        }
        com.ss.android.ugc.aweme.profile.f.ad.a(str5, i5, z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.j$j  reason: collision with other inner class name */
    public static final class C2928j extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114341a;

        static {
            Covode.recordClassIndex(73526);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2928j(j jVar) {
            this.f114341a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            Animatable i2;
            h.f.b.l.d(str, "");
            com.facebook.drawee.h.a controller = j.a(this.f114341a).getController();
            if (controller != null && (i2 = controller.i()) != null) {
                if (g.b.a()) {
                    i2.stop();
                } else if (this.f114341a.getUserVisibleHint() && !i2.isRunning()) {
                    i2.start();
                } else if (!this.f114341a.getUserVisibleHint() && i2.isRunning()) {
                    i2.stop();
                }
            }
        }
    }

    public static final class w implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114351a;

        static {
            Covode.recordClassIndex(73539);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(j jVar) {
            this.f114351a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            ConstraintLayout d2 = j.d(this.f114351a);
            if (d2 != null) {
                d2.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
            ScrollView scrollView = this.f114351a.f114334i;
            if (scrollView == null) {
                h.f.b.l.a("pushSettingLayout");
            }
            scrollView.setVisibility(0);
            this.f114351a.e();
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114342a;

        static {
            Covode.recordClassIndex(73527);
        }

        k(j jVar) {
            this.f114342a = jVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.notificationlive.j r0 = r1.f114342a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.k.onClick(android.view.View):void");
        }
    }

    static final class t implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114349a;

        static {
            Covode.recordClassIndex(73536);
        }

        t(j jVar) {
            this.f114349a = jVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.notificationlive.j r0 = r1.f114349a
                com.bytedance.tux.sheet.sheet.a.b.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.t.onClick(android.view.View):void");
        }
    }

    public static final /* synthetic */ MusAvatarWithBorderView a(j jVar) {
        MusAvatarWithBorderView musAvatarWithBorderView = jVar.f114330e;
        if (musAvatarWithBorderView == null) {
            h.f.b.l.a("followHeaderImage");
        }
        return musAvatarWithBorderView;
    }

    public static final /* synthetic */ FrameLayout b(j jVar) {
        FrameLayout frameLayout = jVar.f114328c;
        if (frameLayout == null) {
            h.f.b.l.a("root");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TuxButton c(j jVar) {
        TuxButton tuxButton = jVar.f114332g;
        if (tuxButton == null) {
            h.f.b.l.a("followButton");
        }
        return tuxButton;
    }

    public static final /* synthetic */ ConstraintLayout d(j jVar) {
        ConstraintLayout constraintLayout = jVar.f114329d;
        if (constraintLayout == null) {
            h.f.b.l.a("followLayout");
        }
        return constraintLayout;
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $canFollow$inlined;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(73523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j jVar, int i2) {
            super(1);
            this.this$0 = jVar;
            this.$canFollow$inlined = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.byp, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.j.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(73524);
                }

                {
                    this.this$0 = r2;
                }

                private static boolean a() {
                    try {
                        return f.a.f68431a.c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.getActivity();
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107229h = a();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                        this.this$0.this$0.h();
                    }
                    this.this$0.this$0.b();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    static final class g implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114339a;

        static {
            Covode.recordClassIndex(73522);
        }

        g(j jVar) {
            this.f114339a = jVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            LinearLayout linearLayout = this.f114339a.f114335j;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.f114339a.s).b("refer", "manage_page").a("enter_from", this.f114339a.r).a("notification_choose_type", 2).b();
            }
            com.ss.android.ugc.aweme.profile.f fVar = this.f114339a.t;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114340a;

        static {
            Covode.recordClassIndex(73525);
        }

        i(j jVar) {
            this.f114340a = jVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.profile.f fVar = this.f114340a.t;
            if (fVar != null) {
                fVar.b();
            }
            LinearLayout linearLayout = this.f114340a.f114335j;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", this.f114340a.s).b("refer", "manage_page").a("enter_from", this.f114340a.r).a("notification_choose_type", 2).b();
            }
        }
    }

    public final void a(int i2) {
        String str;
        c cVar = this.f114327b;
        if (cVar != null) {
            cVar.show();
        }
        NotificationLiveViewModel j2 = j();
        User user = this.n;
        String str2 = "";
        if (user == null || (str = user.getSecUid()) == null) {
            str = str2;
        }
        j2.a(new v(i2, str));
        com.ss.android.ugc.aweme.profile.f fVar = this.t;
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

    public final void b(int i2) {
        if (i2 == 1) {
            ImageView imageView = this.C;
            if (imageView == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView.setImageResource(2131233388);
            ImageView imageView2 = this.D;
            if (imageView2 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView2.setImageResource(2131233389);
            ImageView imageView3 = this.E;
            if (imageView3 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView3.setImageResource(2131233389);
        } else if (i2 == 2) {
            ImageView imageView4 = this.C;
            if (imageView4 == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView4.setImageResource(2131233389);
            ImageView imageView5 = this.D;
            if (imageView5 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView5.setImageResource(2131233388);
            ImageView imageView6 = this.E;
            if (imageView6 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView6.setImageResource(2131233389);
        } else if (i2 == 3) {
            ImageView imageView7 = this.C;
            if (imageView7 == null) {
                h.f.b.l.a("allLiveImage");
            }
            imageView7.setImageResource(2131233389);
            ImageView imageView8 = this.D;
            if (imageView8 == null) {
                h.f.b.l.a("recommendedLiveImage");
            }
            imageView8.setImageResource(2131233389);
            ImageView imageView9 = this.E;
            if (imageView9 == null) {
                h.f.b.l.a("offLiveImage");
            }
            imageView9.setImageResource(2131233388);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class v extends h.f.b.m implements h.f.a.m<ResponseState, Bundle, ResponseState> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f114350a = new v();

        static {
            Covode.recordClassIndex(73538);
        }

        v() {
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

    static final class x extends h.f.b.m implements h.f.a.m<UserState, Bundle, UserState> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(73540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ UserState invoke(UserState userState, Bundle bundle) {
            UserState userState2 = userState;
            h.f.b.l.d(userState2, "");
            User user = this.this$0.n;
            if (user == null) {
                user = new User();
            }
            return UserState.copy$default(userState2, user, false, null, null, null, 30, null);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, UserState, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(73537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(j jVar) {
            super(2);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r10, com.ss.android.ugc.aweme.user.repository.UserState r11) {
            /*
            // Method dump skipped, instructions count: 206
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.u.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        String str;
        String str2;
        UrlModel avatarVideoUri;
        List<String> urlList;
        UrlModel urlModel;
        boolean z2;
        CommerceUserInfo commerceUserInfo;
        String c2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.dqe);
        h.f.b.l.b(findViewById, "");
        this.f114328c = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.b7q);
        h.f.b.l.b(findViewById2, "");
        this.f114329d = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.b7y);
        h.f.b.l.b(findViewById3, "");
        this.u = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.b7m);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView");
        MusAvatarWithBorderView musAvatarWithBorderView = (MusAvatarWithBorderView) findViewById4;
        this.f114330e = musAvatarWithBorderView;
        if (musAvatarWithBorderView == null) {
            h.f.b.l.a("followHeaderImage");
        }
        musAvatarWithBorderView.setBorderColor(R.color.f159926j);
        MusAvatarWithBorderView musAvatarWithBorderView2 = this.f114330e;
        if (musAvatarWithBorderView2 == null) {
            h.f.b.l.a("followHeaderImage");
        }
        ((CircleImageView) musAvatarWithBorderView2).f68292f = true;
        MusAvatarWithBorderView musAvatarWithBorderView3 = this.f114330e;
        if (musAvatarWithBorderView3 == null) {
            h.f.b.l.a("followHeaderImage");
        }
        musAvatarWithBorderView3.setBorderWidth(0);
        View findViewById5 = view.findViewById(R.id.b7i);
        h.f.b.l.b(findViewById5, "");
        this.v = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.b7k);
        h.f.b.l.b(findViewById6, "");
        this.f114331f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b7g);
        h.f.b.l.b(findViewById7, "");
        this.f114332g = (TuxButton) findViewById7;
        View findViewById8 = view.findViewById(R.id.b7r);
        h.f.b.l.b(findViewById8, "");
        this.f114333h = findViewById8;
        View findViewById9 = view.findViewById(R.id.ddw);
        h.f.b.l.b(findViewById9, "");
        this.f114334i = (ScrollView) findViewById9;
        View findViewById10 = view.findViewById(R.id.de0);
        h.f.b.l.b(findViewById10, "");
        this.w = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.dds);
        h.f.b.l.b(findViewById11, "");
        this.x = (ConstraintLayout) findViewById11;
        View findViewById12 = view.findViewById(R.id.de2);
        h.f.b.l.b(findViewById12, "");
        this.y = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.ddz);
        h.f.b.l.b(findViewById13, "");
        this.z = (ConstraintLayout) findViewById13;
        View findViewById14 = view.findViewById(R.id.ddy);
        h.f.b.l.b(findViewById14, "");
        this.A = (ConstraintLayout) findViewById14;
        View findViewById15 = view.findViewById(R.id.ddt);
        h.f.b.l.b(findViewById15, "");
        this.B = (ImageView) findViewById15;
        View findViewById16 = view.findViewById(R.id.iz);
        h.f.b.l.b(findViewById16, "");
        this.C = (ImageView) findViewById16;
        View findViewById17 = view.findViewById(R.id.dir);
        h.f.b.l.b(findViewById17, "");
        this.D = (ImageView) findViewById17;
        View findViewById18 = view.findViewById(R.id.cyl);
        h.f.b.l.b(findViewById18, "");
        this.E = (ImageView) findViewById18;
        this.f114335j = (LinearLayout) view.findViewById(R.id.ddr);
        this.f114336k = (CommonItemView) view.findViewById(R.id.ddv);
        if (this.I) {
            ConstraintLayout constraintLayout = this.f114329d;
            if (constraintLayout == null) {
                h.f.b.l.a("followLayout");
            }
            constraintLayout.setVisibility(0);
            ScrollView scrollView = this.f114334i;
            if (scrollView == null) {
                h.f.b.l.a("pushSettingLayout");
            }
            scrollView.setVisibility(4);
        } else {
            ConstraintLayout constraintLayout2 = this.f114329d;
            if (constraintLayout2 == null) {
                h.f.b.l.a("followLayout");
            }
            constraintLayout2.setVisibility(4);
            ScrollView scrollView2 = this.f114334i;
            if (scrollView2 == null) {
                h.f.b.l.a("pushSettingLayout");
            }
            scrollView2.setVisibility(0);
            e();
        }
        com.ss.android.ugc.aweme.profile.f fVar = this.t;
        if (!(fVar == null || (c2 = fVar.c()) == null || c2.length() == 0)) {
            TextView textView = this.y;
            if (textView == null) {
                h.f.b.l.a("pushSettingNoticeStr");
            }
            textView.setVisibility(0);
            TextView textView2 = this.y;
            if (textView2 == null) {
                h.f.b.l.a("pushSettingNoticeStr");
            }
            textView2.setText(fVar.c());
        }
        ConstraintLayout constraintLayout3 = this.x;
        if (constraintLayout3 == null) {
            h.f.b.l.a("pushSettingAllLive");
        }
        constraintLayout3.setOnClickListener(new p(this));
        ConstraintLayout constraintLayout4 = this.z;
        if (constraintLayout4 == null) {
            h.f.b.l.a("pushSettingRecommendedLive");
        }
        constraintLayout4.setOnClickListener(new q(this));
        ConstraintLayout constraintLayout5 = this.A;
        if (constraintLayout5 == null) {
            h.f.b.l.a("pushSettingOffLive");
        }
        constraintLayout5.setOnClickListener(new r(this));
        CommonItemView commonItemView = this.f114336k;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new s(this));
        }
        CommonItemView commonItemView2 = this.f114336k;
        if (commonItemView2 != null) {
            User user = this.n;
            if (user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null || commerceUserInfo.getNotificationConfig() != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            commonItemView2.setChecked(z2);
        }
        ImageView imageView = this.B;
        if (imageView == null) {
            h.f.b.l.a("pushSettingClose");
        }
        imageView.setOnClickListener(new t(this));
        User user2 = this.n;
        if (user2 != null) {
            i2 = user2.getLivePushNotificationStatus();
        } else {
            i2 = 1;
        }
        b(i2);
        com.ss.android.ugc.aweme.profile.f fVar2 = this.t;
        if (fVar2 != null) {
            f.a a2 = fVar2.a();
            com.ss.android.ugc.aweme.common.r.a("livesdk_live_notification_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from_merge", a2.f116377c).a("enter_method", a2.f116378d).a("room_id", a2.f116375a).a("anchor_id", a2.f116376b).a(a2.f116379e).f66730a);
        }
        User user3 = this.n;
        String str3 = null;
        if (user3 != null) {
            str = user3.getUniqueId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            User user4 = this.n;
            if (user4 != null) {
                str2 = user4.getShortId();
            }
            str2 = null;
        } else {
            User user5 = this.n;
            if (user5 != null) {
                str2 = user5.getUniqueId();
            }
            str2 = null;
        }
        TextView textView3 = this.u;
        if (textView3 == null) {
            h.f.b.l.a("followTitle");
        }
        textView3.setText(str2);
        User user6 = this.n;
        if (user6 == null || (avatarVideoUri = user6.getAvatarVideoUri()) == null || (urlList = avatarVideoUri.getUrlList()) == null || urlList.size() <= 0) {
            MusAvatarWithBorderView musAvatarWithBorderView4 = this.f114330e;
            if (musAvatarWithBorderView4 == null) {
                h.f.b.l.a("followHeaderImage");
            }
            com.ss.android.ugc.aweme.base.e.a(musAvatarWithBorderView4, com.ss.android.ugc.aweme.utils.u.a(this.n));
        } else {
            MusAvatarWithBorderView musAvatarWithBorderView5 = this.f114330e;
            if (musAvatarWithBorderView5 == null) {
                h.f.b.l.a("followHeaderImage");
            }
            User user7 = this.n;
            if (user7 != null) {
                urlModel = user7.getAvatarVideoUri();
            } else {
                urlModel = null;
            }
            com.ss.android.ugc.aweme.base.e.a((RemoteImageView) musAvatarWithBorderView5, urlModel, (com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f>) new C2928j(this), false);
        }
        ImageView imageView2 = this.v;
        if (imageView2 == null) {
            h.f.b.l.a("followClose");
        }
        imageView2.setOnClickListener(new k(this));
        TextView textView4 = this.f114331f;
        if (textView4 == null) {
            h.f.b.l.a("followDoc");
        }
        if (getContext() != null) {
            Context context = getContext();
            if (context == null) {
                h.f.b.l.b();
            }
            String string = context.getString(R.string.bzs);
            h.f.b.l.b(string, "");
            str3 = com.a.a(string, Arrays.copyOf(new Object[]{str2}, 1));
            h.f.b.l.b(str3, "");
        }
        textView4.setText(str3);
        TuxButton tuxButton = this.f114332g;
        if (tuxButton == null) {
            h.f.b.l.a("followButton");
        }
        tuxButton.setOnClickListener(new l(this));
        ConstraintLayout constraintLayout6 = this.f114329d;
        if (constraintLayout6 == null) {
            h.f.b.l.a("followLayout");
        }
        constraintLayout6.getViewTreeObserver().addOnPreDrawListener(new m(this));
        f.a.b.b unused = subscribe(k(), new ah(), new u(this));
        f.a.b.b unused2 = selectSubscribe(j(), n.f114355a, o.f114356a, p.f114357a, new ah(), new o(this));
        f.a.a(this, a(), k.f114352a, l.f114353a, m.f114354a, (com.bytedance.assem.arch.viewModel.k) null, new n(this), 24);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ani, viewGroup, false);
        if (a2 == null) {
            h.f.b.l.b();
        }
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    static final class n extends h.f.b.m implements h.f.a.r<com.bytedance.tiktok.proxy.d, d, com.bytedance.jedi.arch.a<? extends Boolean>, Integer, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(73530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(j jVar) {
            super(4);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(com.bytedance.tiktok.proxy.d dVar, d dVar2, com.bytedance.jedi.arch.a<? extends Boolean> aVar, Integer num) {
            boolean z;
            boolean z2;
            com.bytedance.jedi.arch.a<? extends Boolean> aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar2, "");
            if (dVar2 != null) {
                c cVar = this.this$0.f114327b;
                if (cVar != null) {
                    cVar.dismiss();
                }
                if (intValue == 0) {
                    CommonItemView commonItemView = this.this$0.f114336k;
                    if (commonItemView != null) {
                        Boolean bool = (Boolean) aVar2.a();
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        commonItemView.setChecked(z2);
                    }
                    j jVar = this.this$0;
                    Boolean bool2 = (Boolean) aVar2.a();
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    } else {
                        z = true;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", jVar.s).b("refer", "manage_page").a("enter_from", jVar.r).a("notification_choose_type", Integer.valueOf(!z ? 1 : 0)).b();
                    new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.c3u).a();
                } else {
                    this.this$0.g();
                }
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.r<com.bytedance.jedi.arch.i, r, Integer, Integer, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(73531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar) {
            super(4);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(com.bytedance.jedi.arch.i r5, com.ss.android.ugc.aweme.notificationlive.r r6, java.lang.Integer r7, java.lang.Integer r8) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.o.a(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
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

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
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
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
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
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(com.ss.android.ugc.aweme.profile.model.User r12, com.ss.android.ugc.aweme.notificationlive.t.a r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r19, int r20) {
        /*
            r11 = this;
            r1 = r20
            r7 = r17
            r6 = r16
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0 = r1 & 1
            r9 = 0
            if (r0 == 0) goto L_0x0010
            r2 = r9
        L_0x0010:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0015
            r3 = r9
        L_0x0015:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001b
            r0 = 0
            r4 = 0
        L_0x001b:
            r0 = r1 & 8
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0022
            r5 = r8
        L_0x0022:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0027
            r6 = r8
        L_0x0027:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x002c
            r7 = r8
        L_0x002c:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x003d
        L_0x0030:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
        L_0x0034:
            r10 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003a:
            r9 = r19
            goto L_0x0034
        L_0x003d:
            r8 = r18
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.j.<init>(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.notificationlive.t$a, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, int):void");
    }

    public j(User user, t.a aVar, boolean z2, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, com.ss.android.ugc.aweme.profile.f fVar) {
        c cVar;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        this.n = user;
        this.o = aVar;
        this.I = z2;
        this.p = str;
        this.q = str2;
        this.J = str3;
        this.r = str4;
        this.s = awemeRawAd;
        this.t = fVar;
        this.f114326a = new com.ss.android.ugc.aweme.base.arch.i();
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            cVar = new c(context);
        } else {
            cVar = null;
        }
        this.f114327b = cVar;
        v vVar = v.f114350a;
        h.k.c a2 = h.f.b.ab.a(NotificationLiveViewModel.class);
        c cVar2 = new c(a2);
        this.F = new lifecycleAwareLazy(this, cVar2, new d(this, cVar2, a2, vVar));
        h.k.c a3 = h.f.b.ab.a(NotificationGameViewModel.class);
        this.G = new com.bytedance.assem.arch.viewModel.b(a3, new a(a3), u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
        x xVar = new x(this);
        h.k.c a4 = h.f.b.ab.a(UserViewModel.class);
        e eVar = new e(a4);
        this.H = new lifecycleAwareLazy(this, eVar, new f(this, eVar, a4, xVar));
        this.f114337l = new i(this);
        this.f114338m = new g(this);
    }
}
