package com.ss.android.ugc.aweme.profile.widgets.navbar.b.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.ag;
import com.bytedance.android.live.core.f.y;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.google.gson.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notificationlive.z;
import com.ss.android.ugc.aweme.profile.f.ad;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.json.JSONException;

public final class f extends com.ss.android.ugc.aweme.profile.widgets.navbar.a.h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> implements com.bytedance.assem.arch.viewModel.h, WeakHandler.IHandler, org.greenrobot.eventbus.i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final d f118019j = new d((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    WeakHandler f118020h;

    /* renamed from: i  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f118021i = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f118022k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.profile.widgets.redpoint.a, com.ss.android.ugc.aweme.profile.widgets.redpoint.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(76569);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.profile.widgets.redpoint.a invoke(com.ss.android.ugc.aweme.profile.widgets.redpoint.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(76567);
    }

    public final UserProfileBlockVM A() {
        return (UserProfileBlockVM) this.f118022k.getValue();
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
        hashMap.put(151, new org.greenrobot.eventbus.g(f.class, "onUnBlockUser", z.class, ThreadMode.MAIN, 0, false));
        hashMap.put(26, new org.greenrobot.eventbus.g(f.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(61, new org.greenrobot.eventbus.g(f.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class d {
        static {
            Covode.recordClassIndex(76571);
        }

        private d() {
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
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
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.More;
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(76568);
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
            Covode.recordClassIndex(76570);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f.c.invoke():java.lang.Object");
        }
    }

    public final User z() {
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
        if (iVar != null) {
            return iVar.f117705a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        EventBus.a(EventBus.a(), this);
        x();
        this.f118020h = new WeakHandler(this);
        f.a.a(this, A(), g.f118025a, (k) null, new h(this), 6);
        f.a.a(this, A(), h.f118026a, (k) null, new i(this), 6);
    }

    static final class g extends m implements h.f.a.a<h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            List<Aweme> list;
            f fVar = this.this$0;
            if (fVar.z() != null && !com.ss.android.ugc.aweme.l.a.a.a(fVar.t(), 1200)) {
                r.a("click_more_action", new com.ss.android.ugc.aweme.app.f.d().a("others_homepage", "others_homepage").f66730a);
                com.ss.android.ugc.aweme.profile.widgets.b.r rVar = (com.ss.android.ugc.aweme.profile.widgets.b.r) com.bytedance.assem.arch.service.d.e(fVar, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.r.class));
                if (rVar != null) {
                    list = rVar.V();
                } else {
                    list = null;
                }
                WeakHandler weakHandler = fVar.f118020h;
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(fVar);
                User z = fVar.z();
                if (!(z == null || z.getShareInfo() == null)) {
                    ah.f123352a.a(weakHandler, b2, z, list);
                }
            }
            return h.z.f158842a;
        }
    }

    public f() {
        h.k.c a2 = ab.a(UserProfileBlockVM.class);
        this.f118022k = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
    }

    private final void B() {
        String str;
        String str2;
        String str3;
        if (z() != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("others_homepage", "others_homepage");
            User z = z();
            String str4 = null;
            if (z != null) {
                str = z.getUid();
            } else {
                str = null;
            }
            r.a("click_block", a2.a("to_user_id", str).f66730a);
            User z2 = z();
            if (z2 == null || z2.isBlock()) {
                UserProfileBlockVM A = A();
                User z3 = z();
                if (z3 != null) {
                    str2 = z3.getUid();
                } else {
                    str2 = null;
                }
                User z4 = z();
                if (z4 != null) {
                    str3 = z4.getSecUid();
                } else {
                    str3 = null;
                }
                A.a(str2, str3, 0);
                User z5 = z();
                if (z5 != null) {
                    str4 = z5.getUid();
                }
                com.ss.android.ugc.aweme.im.f.a("others_homepage", str4);
                ad.a("unblock");
                return;
            }
            e eVar = new e(this);
            Context ar_ = ar_();
            if (ar_ != null) {
                ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(ar_).b(R.string.a6r)).a(R.string.asg, eVar).a(eVar).a().b().show();
            }
            User z6 = z();
            if (z6 != null) {
                str4 = z6.getUid();
            }
            com.ss.android.ugc.aweme.im.f.a("others_homepage", str4, "");
            ad.a("block");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r1 != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C() {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f.C():void");
    }

    static final class i extends m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Exception, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
            final /* synthetic */ Context $ctx;

            static {
                Covode.recordClassIndex(76577);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context) {
                super(1);
                this.$ctx = context;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                l.d(bVar2, "");
                bVar2.a(R.string.ere, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
                bVar2.b(R.string.erf, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                    /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f.i.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(76578);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        SmartRouter.buildRoute(this.this$0.$ctx, "//setting/blocklist").open();
                        return h.z.f158842a;
                    }
                });
                bVar2.f44820b = true;
                return h.z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, Exception exc) {
            Exception exc2 = exc;
            l.d(dVar, "");
            if (exc2 != null) {
                if (exc2 instanceof ExecutionException) {
                    exc2 = exc2.getCause();
                }
                if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
                    int errorCode = aVar.getErrorCode();
                    if (!(errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                        if (errorCode != 3002038) {
                            this.this$0.a(aVar.getErrorMsg());
                        } else {
                            Context ar_ = this.this$0.ar_();
                            if (ar_ != null) {
                                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(ar_).b(R.string.erg), new a(ar_)).a().b().show();
                            }
                        }
                    }
                } else {
                    this.this$0.a(y.a((int) R.string.de2));
                }
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f$f  reason: collision with other inner class name */
    static final class C3014f extends m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3014f f118024a = new C3014f();

        static {
            Covode.recordClassIndex(76573);
        }

        C3014f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_ellipsis_vertical;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return h.z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        l.d(jVar, "");
        if (TextUtils.equals("user", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(ar_(), t(), jVar);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        try {
            if (TextUtils.equals("userBlockSuccess", jVar.f91311b.getString("eventName"))) {
                BlockStruct blockStruct = new BlockStruct();
                blockStruct.blockStatus = 1;
                UserProfileBlockVM A = A();
                l.d(blockStruct, "");
                A.a(new UserProfileBlockVM.c(blockStruct));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onUnBlockUser(z zVar) {
        String str;
        String str2;
        String str3;
        l.d(zVar, "");
        String str4 = zVar.f114485a;
        User z = z();
        String str5 = null;
        if (z != null) {
            str = z.getUid();
        } else {
            str = null;
        }
        if (l.a((Object) str4, (Object) str)) {
            String str6 = zVar.f114486b;
            User z2 = z();
            if (z2 != null) {
                str2 = z2.getSecUid();
            } else {
                str2 = null;
            }
            if (l.a((Object) str6, (Object) str2)) {
                UserProfileBlockVM A = A();
                User z3 = z();
                if (z3 != null) {
                    str3 = z3.getUid();
                } else {
                    str3 = null;
                }
                User z4 = z();
                if (z4 != null) {
                    str5 = z4.getSecUid();
                }
                A.a(str3, str5, 0);
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        com.ss.android.ugc.aweme.profile.widgets.follow.c cVar;
        String str;
        String str2;
        String str3;
        Boolean bool;
        if (message != null) {
            if (message.what == 50) {
                if (z() != null) {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("others_homepage", "others_homepage");
                    User z = z();
                    String str4 = null;
                    if (z != null) {
                        str = z.getUid();
                    } else {
                        str = null;
                    }
                    r.a("report_user", a2.a("to_user_id", str).f66730a);
                    try {
                        o oVar = new o();
                        oVar.a("unique_id", in.b(z()));
                        User z2 = z();
                        if (z2 != null) {
                            bool = Boolean.valueOf(z2.isBlock());
                        } else {
                            bool = null;
                        }
                        oVar.a("is_blocked", bool);
                        str2 = dg.a().b(oVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        str2 = "";
                    }
                    Uri.Builder builder = new Uri.Builder();
                    User z3 = z();
                    if (z3 != null) {
                        str3 = z3.getUid();
                    } else {
                        str3 = null;
                    }
                    Uri.Builder appendQueryParameter = builder.appendQueryParameter("owner_id", str3);
                    User z4 = z();
                    if (z4 != null) {
                        str4 = z4.getUid();
                    }
                    com.ss.android.ugc.aweme.compliance.api.a.a().a(com.bytedance.assem.arch.extensions.b.b(this), appendQueryParameter.appendQueryParameter("object_id", str4).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str2));
                }
            } else if (message.what == 53) {
                C();
            } else if (message.what == 54 || message.what == 55) {
                B();
            } else if (message.what == 56 && (cVar = (com.ss.android.ugc.aweme.profile.widgets.follow.c) com.bytedance.assem.arch.service.d.c(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.follow.c.class))) != null) {
                cVar.a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(C3014f.f118024a)).a((h.f.a.a<h.z>) new g(this));
    }

    public final void a(String str) {
        Activity a2 = com.ss.android.ugc.aweme.base.utils.o.a(ar_());
        if (a2 != null) {
            new com.bytedance.tux.g.b(a2).a(str).b();
        }
    }

    static final class h extends m implements h.f.a.m<com.bytedance.tiktok.proxy.d, BlockStruct, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(76575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(com.bytedance.tiktok.proxy.d dVar, BlockStruct blockStruct) {
            com.ss.android.ugc.aweme.profile.ui.v2.ab abVar;
            BlockStruct blockStruct2 = blockStruct;
            l.d(dVar, "");
            if (!(blockStruct2 == null || (abVar = (com.ss.android.ugc.aweme.profile.ui.v2.ab) com.bytedance.assem.arch.service.d.c(this.this$0, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class))) == null)) {
                abVar.a(blockStruct2.blockStatus);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118023a;

        static {
            Covode.recordClassIndex(76572);
        }

        e(f fVar) {
            this.f118023a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6 = null;
            if (i2 == -2) {
                User z = this.f118023a.z();
                if (z != null) {
                    str6 = z.getUid();
                }
                com.ss.android.ugc.aweme.im.f.a("cancel", str6, "others_homepage");
                ad.b("cancel");
                dialogInterface.dismiss();
            } else if (i2 == -1) {
                dialogInterface.dismiss();
                UserProfileBlockVM A = this.f118023a.A();
                User z2 = this.f118023a.z();
                if (z2 != null) {
                    str = z2.getUid();
                } else {
                    str = null;
                }
                User z3 = this.f118023a.z();
                if (z3 != null) {
                    str2 = z3.getSecUid();
                } else {
                    str2 = null;
                }
                A.a(str, str2, 1);
                User z4 = this.f118023a.z();
                if (z4 != null) {
                    str3 = z4.getUid();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.im.f.a("success", str3, "others_homepage");
                ad.b("confirm");
                com.ss.android.ugc.aweme.profile.widgets.h.a.b bVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.b) this.f118023a.f118021i.getValue();
                if (bVar != null) {
                    str4 = bVar.f117884d;
                } else {
                    str4 = null;
                }
                if (TextUtils.equals(str4, "chat")) {
                    User z5 = this.f118023a.z();
                    if (z5 != null) {
                        str5 = z5.getUid();
                    } else {
                        str5 = null;
                    }
                    com.ss.android.ugc.aweme.im.f.a("chat", str5, "");
                }
                User z6 = this.f118023a.z();
                if (z6 == null || z6.getFollowStatus() != 0) {
                    User z7 = this.f118023a.z();
                    if (z7 != null) {
                        z7.setFollowStatus(0);
                    }
                    com.ss.android.ugc.aweme.profile.widgets.common.j jVar = (com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.c(this.f118023a, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class));
                    if (jVar != null) {
                        j.a.a(jVar, this.f118023a.z(), null, false, 6);
                    }
                }
            } else {
                User z8 = this.f118023a.z();
                if (z8 != null) {
                    str6 = z8.getUid();
                }
                com.ss.android.ugc.aweme.im.f.a("cancel", str6, "others_homepage");
                dialogInterface.dismiss();
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, h.z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, h.z> qVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, h.z> rVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, h.z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
