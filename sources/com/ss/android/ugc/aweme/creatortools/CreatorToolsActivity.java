package com.ss.android.ugc.aweme.creatortools;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsAgencyCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsLiveCenterUrl;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.hp;
import com.ss.android.ugc.aweme.utils.is;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class CreatorToolsActivity extends com.bytedance.ies.foundation.activity.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: f  reason: collision with root package name */
    public static final a f78306f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f78307a = "";

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d f78308b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.dc.f f78309c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.f f78310d;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.ugc.aweme.dc.d f78311e;

    /* renamed from: g  reason: collision with root package name */
    private ButtonTitleBar f78312g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f78313h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a.b.a f78314i = new f.a.b.a();

    /* renamed from: j  reason: collision with root package name */
    private boolean f78315j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f78316k = true;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f78317l = h.i.a((h.f.a.a) new au(this));

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dc.f f78318m;
    private com.ss.android.ugc.aweme.dc.f n;
    private com.ss.android.ugc.aweme.dc.f o;
    private com.ss.android.ugc.aweme.dc.f p;
    private com.ss.android.ugc.aweme.dc.d q;
    private com.ss.android.ugc.aweme.dc.f r;
    private com.ss.android.ugc.aweme.dc.f s;
    private com.ss.android.ugc.aweme.dc.f t;
    private com.ss.android.ugc.aweme.dc.f u;
    private com.ss.android.ugc.aweme.dc.f v;
    private SparseArray w;

    static {
        Covode.recordClassIndex(48610);
    }

    private final dm c() {
        return (dm) this.f78317l.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.w == null) {
            this.w = new SparseArray();
        }
        View view = (View) this.w.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.w.put(i2, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(55, new org.greenrobot.eventbus.g(CreatorToolsActivity.class, "onSwitchBusinessAccountSuccessEvent", com.ss.android.ugc.aweme.setting.d.e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(61, new org.greenrobot.eventbus.g(CreatorToolsActivity.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48611);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<dm> {
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(CreatorToolsActivity creatorToolsActivity) {
            super(0);
            this.this$0 = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0._$_findCachedViewById(R.id.d7z);
            h.f.b.l.b(powerList, "");
            return new dm(powerList);
        }
    }

    public final String b() {
        String a2;
        Intent intent = getIntent();
        if (intent == null || (a2 = a(intent, "PRO_ENTER_FROM")) == null) {
            return "";
        }
        return a2;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        com.bytedance.android.live.broadcast.api.d dVar = this.f78308b;
        if (dVar != null) {
            dVar.a();
        }
        this.f78314i.a();
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", true);
        super.onResume();
        com.ss.android.ugc.aweme.dc.f fVar = this.r;
        if (fVar != null) {
            fVar.a(ar.f78338a);
        }
        com.ss.android.ugc.aweme.dc.f fVar2 = this.o;
        if (fVar2 != null) {
            fVar2.a(as.f78339a);
        }
        com.ss.android.ugc.aweme.dc.f fVar3 = this.v;
        if (fVar3 != null) {
            fVar3.a(at.f78340a);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", false);
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

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(com.ss.android.ugc.aweme.setting.d.e eVar) {
        finish();
    }

    public static final class ae implements com.ss.android.ugc.aweme.creatortools.api.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78323a;

        static {
            Covode.recordClassIndex(48616);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ae(CreatorToolsActivity creatorToolsActivity) {
            this.f78323a = creatorToolsActivity;
        }

        @Override // com.ss.android.ugc.aweme.creatortools.api.a
        public final void a(com.ss.android.ugc.aweme.creatortools.api.b bVar) {
            this.f78323a.a(bVar);
        }
    }

    public static final class an implements com.bytedance.android.livesdkapi.l.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78333a;

        static {
            Covode.recordClassIndex(48627);
        }

        @Override // com.bytedance.android.livesdkapi.l.c
        public final void a(Throwable th) {
            h.f.b.l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        an(CreatorToolsActivity creatorToolsActivity) {
            this.f78333a = creatorToolsActivity;
        }

        @Override // com.bytedance.android.livesdkapi.l.c
        public final void a(Boolean bool, com.bytedance.android.livesdkapi.l.b bVar, com.bytedance.android.livesdkapi.l.a aVar) {
            if (com.bytedance.android.livesdk.utils.p.a(bool)) {
                CreatorToolsActivity creatorToolsActivity = this.f78333a;
                com.ss.android.ugc.aweme.dc.d dVar = creatorToolsActivity.f78311e;
                if (dVar != null) {
                    dVar.a(t.f78362a);
                }
                com.ss.android.ugc.aweme.dc.f fVar = creatorToolsActivity.f78309c;
                if (fVar != null) {
                    fVar.a(new u(creatorToolsActivity));
                }
            }
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f78320a = new ab();

        static {
            Covode.recordClassIndex(48613);
        }

        ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bfe;
            return h.z.f158842a;
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f78322a = new ad();

        static {
            Covode.recordClassIndex(48615);
        }

        ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bff;
            return h.z.f158842a;
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ag f78325a = new ag();

        static {
            Covode.recordClassIndex(48618);
        }

        ag() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = 2131233675;
            return h.z.f158842a;
        }
    }

    static final class ai implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78328a;

        static {
            Covode.recordClassIndex(48622);
        }

        ai(CreatorToolsActivity creatorToolsActivity) {
            this.f78328a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78328a.onBackPressed();
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final aj f78329a = new aj();

        static {
            Covode.recordClassIndex(48623);
        }

        aj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bfg;
            return h.z.f158842a;
        }
    }

    static final class al extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final al f78331a = new al();

        static {
            Covode.recordClassIndex(48625);
        }

        al() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bfd;
            return h.z.f158842a;
        }
    }

    static final class am extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final am f78332a = new am();

        static {
            Covode.recordClassIndex(48626);
        }

        am() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = 2131233682;
            return h.z.f158842a;
        }
    }

    public static final class d implements com.google.c.h.a.k<PromoteEntryCheck> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f78344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f78345c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f78346d;

        static {
            Covode.recordClassIndex(48641);
        }

        private static Context a(CreatorToolsActivity creatorToolsActivity) {
            Context applicationContext = creatorToolsActivity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            h.f.b.l.d(th, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(a(this.f78343a)).a(R.string.de2).a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
            if (r9 != null) goto L_0x007d;
         */
        @Override // com.google.c.h.a.k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck r9) {
            /*
            // Method dump skipped, instructions count: 235
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.d.onSuccess(java.lang.Object):void");
        }

        d(CreatorToolsActivity creatorToolsActivity, String str, int i2, int i3) {
            this.f78343a = creatorToolsActivity;
            this.f78344b = str;
            this.f78345c = i2;
            this.f78346d = i3;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f78348a = new f();

        static {
            Covode.recordClassIndex(48643);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = 2131233676;
            return h.z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f78350a = new h();

        static {
            Covode.recordClassIndex(48645);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bf6;
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f78352a = new j();

        static {
            Covode.recordClassIndex(48647);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bf7;
            return h.z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f78354a = new l();

        static {
            Covode.recordClassIndex(48649);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bf8;
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f78357a = new o();

        static {
            Covode.recordClassIndex(48653);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bf9;
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f78360a = new r();

        static {
            Covode.recordClassIndex(48657);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bf_;
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f78364a = new v();

        static {
            Covode.recordClassIndex(48662);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bfb;
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f78366a = new x();

        static {
            Covode.recordClassIndex(48664);
        }

        x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.drawable.bfc;
            return h.z.f158842a;
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f78319a = new aa();

        static {
            Covode.recordClassIndex(48612);
        }

        aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    static final class af extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final af f78324a = new af();

        static {
            Covode.recordClassIndex(48617);
        }

        af() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, true, null, 11);
        }
    }

    static final class ak implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78330a;

        static {
            Covode.recordClassIndex(48624);
        }

        ak(CreatorToolsActivity creatorToolsActivity) {
            this.f78330a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f78330a, "aweme://account_settings_gifts_setting").withParam("bundle_video_gift_previous_page", "creator_tools").open();
        }
    }

    static final class ao extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.this$0 = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            String string = this.this$0.getString(R.string.b2r);
            h.f.b.l.b(string, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, string, false, false, null, 14);
        }
    }

    static final class ap extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.this$0 = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            String string = this.this$0.getString(R.string.b36);
            h.f.b.l.b(string, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, string, false, false, null, 14);
        }
    }

    static final class aq extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final aq f78334a = new aq();

        static {
            Covode.recordClassIndex(48630);
        }

        aq() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f78335a);
            baseActivityViewModel2.config(AnonymousClass2.f78336a);
            baseActivityViewModel2.config(AnonymousClass3.f78337a);
            return h.z.f158842a;
        }
    }

    static final class ar extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final ar f78338a = new ar();

        static {
            Covode.recordClassIndex(48634);
        }

        ar() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, hp.a.h(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    static final class as extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final as f78339a = new as();

        static {
            Covode.recordClassIndex(48635);
        }

        as() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, hp.a.g(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    static final class at extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final at f78340a = new at();

        static {
            Covode.recordClassIndex(48636);
        }

        at() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, is.a(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78342a = new c();

        static {
            Covode.recordClassIndex(48640);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f78347a = new e();

        static {
            Covode.recordClassIndex(48642);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, false, null, 11);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f78356a = new n();

        static {
            Covode.recordClassIndex(48652);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f78359a = new q();

        static {
            Covode.recordClassIndex(48656);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f78362a = new t();

        static {
            Covode.recordClassIndex(48659);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, true, null, 11);
        }
    }

    static final class w implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78365a;

        static {
            Covode.recordClassIndex(48663);
        }

        w(CreatorToolsActivity creatorToolsActivity) {
            this.f78365a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.k().a(this.f78365a.b(), this.f78365a.b(), this.f78365a);
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.common.r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", b()).f66730a);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        h.f.b.l.d(jVar, "");
        if (h.f.b.l.a((Object) jVar.f91311b.optString("eventName"), (Object) "cla_crowdsourcing_onboarding_complete")) {
            com.ss.android.ugc.aweme.experiment.n.f90266a = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ String $region;
        final /* synthetic */ com.ss.android.ugc.aweme.creatortools.api.b $showCaseModel;
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CreatorToolsActivity creatorToolsActivity, com.ss.android.ugc.aweme.creatortools.api.b bVar, String str) {
            super(1);
            this.this$0 = creatorToolsActivity;
            this.$showCaseModel = bVar;
            this.$region = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f78341a;

                static {
                    Covode.recordClassIndex(48639);
                }

                {
                    this.f78341a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    ClickAgent.onClick(view);
                    this.f78341a.this$0.a("click_creator_showcase");
                    SmartRouter.buildRoute(this.f78341a.this$0, this.f78341a.$showCaseModel.f78378c).open();
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("EVENT_ORIGIN_FEATURE", "TEMAI").a("page_name", "creator_tools");
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", g2.getCurUserId()).a("country", this.f78341a.$region).a("click_for", "tiktok_showcase");
                    String str2 = "yes";
                    if (this.f78341a.$showCaseModel.f78377b) {
                        str = str2;
                    } else {
                        str = "no";
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("is_onboard_ecom", str);
                    if (!a.a()) {
                        str2 = "no";
                    }
                    com.ss.android.ugc.aweme.common.r.a("tiktokec_creator_tools_module_click", a4.a("enable_showcase", str2).f66730a);
                }
            }, null, 6015);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78349a;

        static {
            Covode.recordClassIndex(48644);
        }

        g(CreatorToolsActivity creatorToolsActivity) {
            this.f78349a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f78349a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            SmartRouter.buildRoute(applicationContext, new com.ss.android.common.util.g(CreatorToolsAgencyCenterUrl.INSTANCE.getValue()).a()).open();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ h.a $creatorSchema;
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(CreatorToolsActivity creatorToolsActivity, h.a aVar) {
            super(1);
            this.this$0 = creatorToolsActivity;
            this.$creatorSchema = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.m.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m f78355a;

                static {
                    Covode.recordClassIndex(48651);
                }

                {
                    this.f78355a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f78355a.$creatorSchema.a("process_id", this.f78355a.this$0.f78307a);
                    SmartRouter.buildRoute(this.f78355a.this$0, this.f78355a.$creatorSchema.a().toString()).open();
                    com.ss.android.ugc.aweme.common.r.a("click_creator_fund", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f78355a.this$0.b()).a("process_id", this.f78355a.this$0.f78307a).f66730a);
                }
            }, null, 6015);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ z.e $schema;
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(CreatorToolsActivity creatorToolsActivity, z.e eVar) {
            super(1);
            this.this$0 = creatorToolsActivity;
            this.$schema = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f78358a;

                static {
                    Covode.recordClassIndex(48655);
                }

                {
                    this.f78358a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    CommerceUserInfo commerceUserInfo;
                    ClickAgent.onClick(view);
                    h.a a2 = com.ss.android.ugc.aweme.music.k.h.a(this.f78358a.$schema.element);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    User curUser = g2.getCurUser();
                    if (curUser == null || (commerceUserInfo = curUser.getCommerceUserInfo()) == null || commerceUserInfo.getStarAtlas() != 1) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    a2.a("isTCMCreator", str);
                    SmartRouter.buildRoute(this.f78358a.this$0, a2.a().toString()).open();
                    this.f78358a.this$0.a("enter_marketplace");
                    com.ss.android.ugc.aweme.common.r.a("click_creator_marketplace", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "creator_account").a("process_id", this.f78358a.this$0.f78307a).f66730a);
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    User curUser2 = g3.getCurUser();
                    h.f.b.l.b(curUser2, "");
                    SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "tcm_pro_account", 0).edit();
                    edit.putBoolean("tcm_first_dot" + curUser2.getUid(), false);
                    edit.apply();
                }
            }, null, 6015);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.this$0 = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.u.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ u f78363a;

                static {
                    Covode.recordClassIndex(48661);
                }

                {
                    this.f78363a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    Context applicationContext = this.f78363a.this$0.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("sslocal://webcast_lynxview");
                    gVar.a("url", CreatorToolsLiveCenterUrl.INSTANCE.getValue());
                    gVar.a("enter_from", "creator_tools");
                    gVar.a("should_full_screen", 1);
                    gVar.a("hide_nav_bar", 1);
                    gVar.a("hide_loading", 1);
                    com.ss.android.ugc.aweme.account.b.a();
                    IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                    h.f.b.l.b(e2, "");
                    gVar.a("anchor_id", e2.getCurUserId());
                    SmartRouter.buildRoute(applicationContext, gVar.a()).open();
                }
            }, null, 6015);
        }
    }

    static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f78368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f78369c;

        static {
            Covode.recordClassIndex(48665);
        }

        y(CreatorToolsActivity creatorToolsActivity, int i2, z.c cVar) {
            this.f78367a = creatorToolsActivity;
            this.f78368b = i2;
            this.f78369c = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                com.google.c.h.a.l.a(PromoteEntryCheckApi.a.a().getPromoteEntryCheck("", "creator_tools"), new d(this.f78367a, "creator_tools", this.f78368b, this.f78369c.element), com.ss.android.ugc.aweme.base.m.f68150a);
            }
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.f, com.ss.android.ugc.aweme.be.f> {
        final /* synthetic */ CreatorToolsActivity this$0;

        static {
            Covode.recordClassIndex(48666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.this$0 = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.f invoke(com.ss.android.ugc.aweme.be.f fVar) {
            com.ss.android.ugc.aweme.be.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            return com.ss.android.ugc.aweme.be.f.a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.z.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ z f78370a;

                static {
                    Covode.recordClassIndex(48667);
                }

                {
                    this.f78370a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    User curUser = g2.getCurUser();
                    h.f.b.l.b(curUser, "");
                    Keva.getRepo("keva_repo_qa").storeBoolean("keva_key_public_qna_setting" + curUser.getUid(), true);
                    SmartRouter.buildRoute(this.f78370a.this$0, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "creator_tools").withParam("enter_method", "creator_tools").open();
                }
            }, null, 6015);
        }
    }

    static final class ac implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78321a;

        static {
            Covode.recordClassIndex(48614);
        }

        ac(CreatorToolsActivity creatorToolsActivity) {
            this.f78321a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.common.r.a("click_tiktok_shoutouts", h.v.a(this.f78321a.b(), "enter_from"), h.v.a(this.f78321a.f78307a, "process_id"));
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            h.f.b.l.b(context, "");
            String b2 = this.f78321a.b();
            String str = this.f78321a.f78307a;
            h.f.b.l.d(context, "");
            h.f.b.l.d(b2, "");
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.shoutouts.b.a.b(context, "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?enter_from=" + b2 + "&process_id=" + str + "&hide_nav_bar=1");
        }
    }

    static final class ah implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78326a;

        static {
            Covode.recordClassIndex(48619);
        }

        ah(CreatorToolsActivity creatorToolsActivity) {
            this.f78326a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.android.live.broadcast.api.d dVar = this.f78326a.f78308b;
            if (dVar != null) {
                h.f.b.l.b(view, "");
                Context context = view.getContext();
                h.f.b.l.b(context, "");
                dVar.a(context, false, new h.f.a.a<h.z>(this) {
                    /* class com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.ah.AnonymousClass1 */
                    final /* synthetic */ ah this$0;

                    static {
                        Covode.recordClassIndex(48620);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ h.z invoke() {
                        SmartRouter.buildRoute(this.this$0.f78326a, "//live/container").withParam("fragment_type", "subscribe").open();
                        return h.z.f158842a;
                    }
                });
            }
            com.ss.android.ugc.aweme.dc.f fVar = this.f78326a.f78310d;
            if (fVar != null) {
                fVar.a(AnonymousClass2.f78327a);
            }
            Keva repo = Keva.getRepo("keva_repo_subs");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            repo.storeBoolean(sb.append(g2.getCurUserId()).toString(), false);
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78353a;

        static {
            Covode.recordClassIndex(48648);
        }

        k(CreatorToolsActivity creatorToolsActivity) {
            this.f78353a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f78353a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("aweme://webview");
            StringBuilder sb = new StringBuilder("https://www.tiktok.com/web-inapp/cla/crowdsourcing/translation-center?enter_from=settings&creator_tools&enter_method=creator_tools&translator_id=");
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            h.f.b.l.b(e2, "");
            gVar.a("url", sb.append(e2.getCurUserId()).toString());
            gVar.a("should_full_screen", 1);
            gVar.a("hide_nav_bar", 1);
            SmartRouter.buildRoute(applicationContext, gVar.a()).open();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.b(java.lang.String):void");
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78351a;

        static {
            Covode.recordClassIndex(48646);
        }

        i(CreatorToolsActivity creatorToolsActivity) {
            this.f78351a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            int i2;
            int dimensionPixelSize;
            ClickAgent.onClick(view);
            CreatorToolsActivity creatorToolsActivity = this.f78351a;
            int identifier = creatorToolsActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0 || (dimensionPixelSize = creatorToolsActivity.getResources().getDimensionPixelSize(identifier)) <= 0) {
                i2 = 44;
            } else {
                i2 = com.bytedance.common.utility.n.c(this.f78351a, (float) dimensionPixelSize);
            }
            com.ss.android.ugc.aweme.setting.utils.b.a(this.f78351a, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=".concat(String.valueOf(i2)), new HashMap());
            com.ss.android.ugc.aweme.common.r.a("click_creator_analytics", h.v.a("creator_account", "enter_from"), h.v.a(this.f78351a.f78307a, "process_id"));
            com.ss.android.ugc.aweme.common.r.a("click_insight", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f78351a.b()).a("previous_page", "settings_page").a("enter_method", "click_button").f66730a);
        }
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CreatorToolsActivity f78361a;

        static {
            Covode.recordClassIndex(48658);
        }

        s(CreatorToolsActivity creatorToolsActivity) {
            this.f78361a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f78361a.a("click_creator_portal");
            CreatorToolsActivity creatorToolsActivity = this.f78361a;
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = CreatorToolsActivity.a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(creatorToolsActivity).a(R.string.de8).a();
                return;
            }
            String h2 = SettingServiceImpl.v().h();
            Objects.requireNonNull(h2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = h2.toLowerCase();
            h.f.b.l.b(lowerCase, "");
            String g2 = com.ss.android.ugc.aweme.language.d.g();
            if (g2 != null) {
                Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
                str = g2.toLowerCase();
                h.f.b.l.b(str, "");
            } else {
                str = null;
            }
            String str2 = "/en-us/";
            Set a2 = h.a.am.a((Object[]) new String[]{str2, "/en-gb/", "/pt-br/", "/ja-jp/"});
            if (!TextUtils.isEmpty(lowerCase) && !TextUtils.isEmpty(str)) {
                String str3 = "/" + lowerCase + '-' + str + '/';
                if (a2.contains(str3)) {
                    str2 = str3;
                }
            }
            SmartRouter.buildRoute(creatorToolsActivity, "aweme://webview").withParam("url", new com.ss.android.common.util.g("https://www.tiktok.com/creators/creator-portal".concat(String.valueOf(str2))).a()).withParam("title", creatorToolsActivity.getString(R.string.b3y)).open();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.creatortools.api.b r9) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.a(com.ss.android.ugc.aweme.creatortools.api.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0628, code lost:
        if (r2.f78474a == true) goto L_0x062a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0470  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 1835
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }
}
