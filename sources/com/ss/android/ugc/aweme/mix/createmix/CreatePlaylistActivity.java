package com.ss.android.ugc.aweme.mix.createmix;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.d;
import com.ss.android.ugc.aweme.mix.createmix.g;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.h;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class CreatePlaylistActivity extends com.ss.android.ugc.aweme.mix.a implements com.bytedance.assem.arch.viewModel.h, org.greenrobot.eventbus.i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final e f109826c = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f109827a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f109828b;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109829d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109830e;

    /* renamed from: f  reason: collision with root package name */
    private String f109831f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f109832g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f109833h = "";

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f109834i;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70335);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(70337);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70333);
    }

    private final MixVideosManageViewModel c() {
        return (MixVideosManageViewModel) this.f109830e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f109834i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f109834i == null) {
            this.f109834i = new SparseArray();
        }
        View view = (View) this.f109834i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f109834i.put(i2, findViewById);
        return findViewById;
    }

    public final MixCreateViewModel b() {
        return (MixCreateViewModel) this.f109829d.getValue();
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
        hashMap.put(348, new org.greenrobot.eventbus.g(CreatePlaylistActivity.class, "onCreateMixListSuccess", com.ss.android.ugc.aweme.mix.b.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class e {
        static {
            Covode.recordClassIndex(70338);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static final class i extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f109835a = new i();

        static {
            Covode.recordClassIndex(70342);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
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

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70334);
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

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public CreatePlaylistActivity() {
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        this.f109829d = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, b.INSTANCE);
        h.k.c a3 = ab.a(MixVideosManageViewModel.class);
        this.f109830e = new com.bytedance.assem.arch.viewModel.b(a3, new c(a3), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, d.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.mix.a
    public final Fragment a() {
        Fragment a2;
        Fragment a3;
        int i2 = this.f109827a;
        if (i2 == 1) {
            b().a(true);
            com.ss.android.ugc.aweme.mix.a.a.b(b().f109870k, b().f109871l);
            if (MixFeedService.k().b()) {
                com.ss.android.ugc.aweme.mix.a.a.c(this.f109831f, this.f109832g);
                a2 = d.c.a(this.f109831f, b().f109871l);
            } else {
                com.ss.android.ugc.aweme.mix.a.a.d(b().f109870k, b().f109871l);
                a2 = h.c.a(1, null, null, null, null, null, 62);
            }
            return a2;
        } else if (i2 == 2) {
            b().a(true);
            com.ss.android.ugc.aweme.mix.a.a.b(b().f109870k, b().f109871l);
            c().a(this.f109833h, "", this.f109831f);
            b().a(this.f109833h);
            if (MixFeedService.k().b()) {
                com.ss.android.ugc.aweme.mix.a.a.c(this.f109831f, this.f109832g);
                a3 = d.c.a(this.f109831f, b().f109871l);
            } else {
                com.ss.android.ugc.aweme.mix.a.a.e(b().f109870k, b().f109871l);
                a3 = AddMultiVideoFragment.e.a();
            }
            return a3;
        } else if (i2 != 4) {
            b().a(true);
            com.ss.android.ugc.aweme.mix.a.a.b(b().f109870k, b().f109871l);
            com.ss.android.ugc.aweme.mix.a.a.d(b().f109870k, b().f109871l);
            return h.c.a(3, null, null, this.f109828b, null, null, 54);
        } else {
            c().a(this.f109833h, "", this.f109831f);
            b().a(this.f109833h);
            b().a(false);
            com.ss.android.ugc.aweme.mix.a.a.e(c().f110070j, "manage_video");
            return AddMultiVideoFragment.e.a();
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @r
    public final void onCreateMixListSuccess(com.ss.android.ugc.aweme.mix.b.e eVar) {
        l.d(eVar, "");
        finish();
    }

    static final class h extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ CreatePlaylistActivity this$0;

        static {
            Covode.recordClassIndex(70341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CreatePlaylistActivity createPlaylistActivity) {
            super(1);
            this.this$0 = createPlaylistActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            String message = th2.getMessage();
            if (message == null || !message.equals("dark_post_failed")) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
            } else {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.b4h).b();
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.b, z> {
        final /* synthetic */ String $secUid;
        final /* synthetic */ String $uid;
        final /* synthetic */ CreatePlaylistActivity this$0;

        static {
            Covode.recordClassIndex(70340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CreatePlaylistActivity createPlaylistActivity, String str, String str2) {
            super(1);
            this.this$0 = createPlaylistActivity;
            this.$uid = str;
            this.$secUid = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
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
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.api.response.b r9) {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.mix.api.response.b r9 = (com.ss.android.ugc.aweme.mix.api.response.b) r9
                if (r9 == 0) goto L_0x0048
                int r0 = r9.status_code
                if (r0 != 0) goto L_0x0048
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.this$0
                r1.<init>(r0)
                com.bytedance.tux.g.b r1 = r1.a()
                r0 = 2131830571(0x7f11272b, float:1.9294143E38)
                com.bytedance.tux.g.b r0 = r1.e(r0)
                r0.b()
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.this$0
                int r1 = r0.f109827a
                r0 = 1
                if (r1 == r0) goto L_0x002b
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r0 = r8.this$0
                int r1 = r0.f109827a
                r0 = 2
                if (r1 != r0) goto L_0x0040
            L_0x002b:
                com.ss.android.ugc.aweme.mix.services.IMixFeedService r0 = com.ss.android.ugc.aweme.mix.services.MixFeedService.k()
                com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity r1 = r8.this$0
                java.lang.String r4 = r9.f109797a
                java.lang.String r5 = r8.$uid
                java.lang.String r6 = r8.$secUid
                java.lang.String r2 = ""
                java.lang.String r3 = "from_profile_mix_list"
                java.lang.String r7 = ""
                com.ss.android.ugc.aweme.mix.services.IMixFeedService.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x0040:
                com.ss.android.ugc.aweme.mix.b.e r0 = new com.ss.android.ugc.aweme.mix.b.e
                r0.<init>()
                com.ss.android.ugc.d.a.c.a(r0)
            L_0x0048:
                h.z r0 = h.z.f158842a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity.g.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("enter_from")) {
            String a2 = a(intent, "enter_from");
            if (a2 == null) {
                a2 = "";
            }
            this.f109831f = a2;
            String a3 = a(intent, "enter_method");
            if (a3 == null) {
                a3 = "";
            }
            this.f109832g = a3;
            MixCreateViewModel b2 = b();
            String str = this.f109831f;
            String str2 = this.f109832g;
            l.d(str, "");
            l.d(str2, "");
            b2.f109870k = str;
            b2.f109871l = str2;
            this.f109827a = intent.getIntExtra("open_fragment_type", 1);
            String a4 = a(intent, "key_manage_mix_id");
            if (a4 == null) {
                a4 = "";
            }
            this.f109833h = a4;
            Bundle a5 = a(intent);
            if (!(a5 == null || a5.getSerializable("key_mix_add_aweme_info") == null)) {
                Serializable serializableExtra = intent.getSerializableExtra("key_mix_add_aweme_info");
                if (serializableExtra != null) {
                    this.f109828b = (Aweme) serializableExtra;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
                    throw nullPointerException;
                }
            }
        }
        super.onCreate(bundle);
        f.a.a(this, b(), b.f109837a, (k) null, new f(this), 6);
        EventBus.a(EventBus.a(), this);
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e2, "");
        String curUserId = e2.getCurUserId();
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e3, "");
        String curSecUserId = e3.getCurSecUserId();
        AssemViewModel.a(b(), c.f109838a, null, new h(this), i.f109835a, new g(this, curUserId, curSecUserId), 2);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.tiktok.proxy.d, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.mix.createmix.viewmodel.b>, z> {
        final /* synthetic */ CreatePlaylistActivity this$0;

        static {
            Covode.recordClassIndex(70339);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CreatePlaylistActivity createPlaylistActivity) {
            super(2);
            this.this$0 = createPlaylistActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.mix.createmix.viewmodel.b> aVar) {
            int i2;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.mix.createmix.viewmodel.b> aVar2 = aVar;
            l.d(dVar, "");
            if (aVar2 != null) {
                int i3 = a.f109836a[aVar2.f25631b.ordinal()];
                if (i3 == 1) {
                    com.ss.android.ugc.aweme.mix.a.a.e(this.this$0.b().f109870k, this.this$0.b().f109871l);
                    this.this$0.getSupportFragmentManager().a().a(R.anim.dq, R.anim.dx, 0, R.anim.dx).a(R.id.b94, AddMultiVideoFragment.e.a(), "TAG_CONTAINER").a((String) null).b();
                } else if (i3 == 2) {
                    this.this$0.getSupportFragmentManager().a().a(R.anim.dq, R.anim.dx, 0, R.anim.dx).a(R.id.b94, g.c.a(), "TAG_CONTAINER").a((String) null).b();
                    com.ss.android.ugc.aweme.mix.a.a.f(this.this$0.b().f109870k, this.this$0.b().f109871l);
                } else if (i3 == 3) {
                    com.ss.android.ugc.aweme.mix.a.a.d(this.this$0.b().f109870k, this.this$0.b().f109871l);
                    if (this.this$0.f109827a == 1 || this.this$0.f109827a == 2) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                    this.this$0.getSupportFragmentManager().a().a(R.anim.dq, R.anim.dx, 0, R.anim.dx).a(R.id.b94, h.c.a(i2, null, null, this.this$0.f109828b, null, null, 54), "TAG_CONTAINER").a((String) null).b();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
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
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        l.d(assemViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
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
