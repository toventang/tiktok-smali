package com.ss.android.ugc.aweme.profile.widgets.navbar.b.b;

import android.app.Activity;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2;
import com.ss.android.ugc.aweme.notificationlive.q;
import com.ss.android.ugc.aweme.notificationlive.r;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.notificationlive.w;
import com.ss.android.ugc.aweme.notificationlive.x;
import com.ss.android.ugc.aweme.notificationlive.y;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.ac;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class b extends com.ss.android.ugc.aweme.profile.widgets.navbar.a.h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> implements com.bytedance.assem.arch.viewModel.h, com.ss.android.ugc.aweme.setting.serverpush.b.c, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: h  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f118008h = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> f118009i = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f118010j;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$b  reason: collision with other inner class name */
    public static final class C3012b extends m implements h.f.a.b<y, y> {
        public static final C3012b INSTANCE = new C3012b();

        static {
            Covode.recordClassIndex(76551);
        }

        public C3012b() {
            super(1);
        }

        public final y invoke(y yVar) {
            l.c(yVar, "");
            return yVar;
        }
    }

    static {
        Covode.recordClassIndex(76549);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
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

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(69, new org.greenrobot.eventbus.g(b.class, "onEvent", com.ss.android.ugc.aweme.notificationlive.i.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final NotificationLiveViewModelV2 z() {
        return (NotificationLiveViewModelV2) this.f118010j.getValue();
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.Bell;
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        this.f118009i.cd_();
        EventBus.a().b(this);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76550);
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

    public static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b.c.invoke():java.lang.Object");
        }
    }

    public final Aweme A() {
        ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
        if (acVar != null) {
            return acVar.f117249g;
        }
        return null;
    }

    public final User B() {
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        NotificationLiveViewModelV2 z;
        super.f();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            EventBus.a(EventBus.a(), this);
            x();
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), c.f118016a, new i(this));
            a(z, d.f118017a, e.f118018a, com.bytedance.assem.arch.viewModel.l.a(z().f25686c), null, new j(this));
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            String str2;
            f.a.l.c<com.ss.android.ugc.aweme.notificationlive.a> a2 = t.a();
            if (a2 != null) {
                User B = this.this$0.B();
                Activity a3 = o.a(this.this$0.ar_());
                com.ss.android.ugc.aweme.profile.widgets.h.a.b bVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.this$0.f118008h.getValue();
                AwemeRawAd awemeRawAd = null;
                if (bVar != null) {
                    str = bVar.f117883c;
                } else {
                    str = null;
                }
                ac acVar = (ac) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class));
                if (acVar != null) {
                    str2 = acVar.f117248f;
                } else {
                    str2 = null;
                }
                AnonymousClass1 r9 = new t.a(this) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f118015a;

                    static {
                        Covode.recordClassIndex(76558);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f118015a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.notificationlive.t.a
                    public final void a(User user) {
                        j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.f118015a.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
                    }
                };
                Aweme A = this.this$0.A();
                if (A != null) {
                    awemeRawAd = A.getAwemeRawAd();
                }
                a2.onNext(new com.ss.android.ugc.aweme.notificationlive.a(B, a3, "others_homepage", str, str2, r9, "bell_notification", awemeRawAd));
            }
            return z.f158842a;
        }
    }

    public b() {
        h.k.c a2 = ab.a(NotificationLiveViewModelV2.class);
        this.f118010j = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), C3012b.INSTANCE, u.b(this), u.c(this));
    }

    static final class i extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        static final class a extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(76560);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.this$0 = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
                com.bytedance.tux.navigation.a.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(b.a(2));
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b$i$b  reason: collision with other inner class name */
        static final class C3013b extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
            final /* synthetic */ User $user;
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(76561);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3013b(User user, i iVar) {
                super(1);
                this.$user = user;
                this.this$0 = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
                com.bytedance.tux.navigation.a.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(b.a(this.$user.getLivePushNotificationStatus()));
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                boolean z = true;
                if (iVar == null || !iVar.f117707c) {
                    NotificationLiveViewModelV2 z2 = this.this$0.z();
                    String secUid = t.getSecUid();
                    if (!(secUid == null || secUid.length() == 0)) {
                        z = false;
                    }
                    if (!z) {
                        f.a.b.b d2 = com.ss.android.ugc.aweme.notificationlive.u.a(secUid).d(new NotificationLiveViewModelV2.a(z2));
                        l.b(d2, "");
                        z2.a(d2);
                    }
                    this.this$0.f118009i.a_(this.this$0);
                    this.this$0.f118009i.a(new Object[0]);
                    if (t.getFollowStatus() != 0 || t.getLivePushNotificationStatus() == 2 || !hl.a(t.getSecUid())) {
                        this.this$0.a(new C3013b(t, this));
                    } else {
                        this.this$0.a(new a(this));
                        t.setLivePushNotificationStatus(2);
                        j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), t, null, false, 6);
                        w wVar = new w(new w.a(), (byte) 0);
                        q qVar = x.f114480a;
                        String secUid2 = t.getSecUid();
                        l.b(secUid2, "");
                        qVar.a(secUid2, wVar);
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.q<com.bytedance.tiktok.proxy.d, r, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(76562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(3);
            this.this$0 = bVar;
        }

        static final class a extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
            final /* synthetic */ int $state$inlined;
            final /* synthetic */ j this$0;

            static {
                Covode.recordClassIndex(76563);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar, int i2) {
                super(1);
                this.this$0 = jVar;
                this.$state$inlined = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
                com.bytedance.tux.navigation.a.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(b.a(this.$state$inlined));
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, r rVar, Integer num) {
            User user;
            int intValue = num.intValue();
            l.d(dVar, "");
            if (rVar != null) {
                this.this$0.a(new a(this, intValue));
                com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                if (iVar != null) {
                    user = iVar.f117705a;
                    if (user != null) {
                        user.setLivePushNotificationStatus(intValue);
                    }
                } else {
                    user = null;
                }
                j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f118011a = new d();

        static {
            Covode.recordClassIndex(76553);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_bell;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f118012a = new e();

        static {
            Covode.recordClassIndex(76554);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_bell_activation;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f118013a = new f();

        static {
            Covode.recordClassIndex(76555);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_bell_slash;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f118014a = new g();

        static {
            Covode.recordClassIndex(76556);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_bell;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    public static com.bytedance.tux.c.a a(int i2) {
        if (i2 == 1) {
            return com.bytedance.tux.c.c.a(e.f118012a);
        }
        if (i2 == 2) {
            return com.bytedance.tux.c.c.a(d.f118011a);
        }
        if (i2 != 3) {
            return com.bytedance.tux.c.c.a(g.f118014a);
        }
        return com.bytedance.tux.c.c.a(f.f118013a);
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.notificationlive.i iVar) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        AwemeRawAd awemeRawAd;
        l.d(iVar, "");
        String str2 = iVar.f114324a;
        Aweme A = A();
        if (A == null || (awemeRawAd = A.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd.getCreativeIdStr();
        }
        if (!(!l.a((Object) str2, (Object) str))) {
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar2 = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
            if (iVar2 != null) {
                user = iVar2.f117705a;
                if (!(user == null || (commerceUserInfo = user.getCommerceUserInfo()) == null)) {
                    commerceUserInfo.setNotificationConfig(iVar.f114325b ? 1 : 0);
                }
            } else {
                user = null;
            }
            j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), user, null, false, 6);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(a(2)).a((h.f.a.a<z>) new h(this));
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
        boolean z = true;
        if (fVar == null || fVar.f122571j != 1) {
            z = false;
        }
        t.a(z);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(kVar5, "");
        l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
