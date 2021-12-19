package com.ss.android.ugc.aweme.kids.homepage.ui;

import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.kids.homepage.bottomview.HomeBottomTabView;
import com.ss.android.ugc.aweme.kids.homepage.compliance.b;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a;
import com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast;
import com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class KidsMainActivity extends com.bytedance.ies.foundation.activity.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106668b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    String f106669a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f106670c = h.i.a((h.f.a.a) i.f106690a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f106671d = h.i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private long f106672e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f106673f = h.i.a((h.f.a.a) new m(this));

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f106674g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private int f106675h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f106676i = h.i.a((h.f.a.a) d.f106683a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f106677j = h.i.a((h.f.a.a) c.f106682a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f106678k = h.i.a((h.f.a.a) h.f106689a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f106679l = h.i.a((h.f.a.a) n.f106696a);

    /* renamed from: m  reason: collision with root package name */
    private HashMap f106680m;

    static {
        Covode.recordClassIndex(68169);
    }

    private final com.ss.android.ugc.aweme.kids.homepage.a.a c() {
        return (com.ss.android.ugc.aweme.kids.homepage.a.a) this.f106670c.getValue();
    }

    private final Fragment d() {
        return (Fragment) this.f106676i.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106680m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106680m == null) {
            this.f106680m = new HashMap();
        }
        View view = (View) this.f106680m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106680m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final androidx.fragment.app.i a() {
        return (androidx.fragment.app.i) this.f106671d.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(165, new org.greenrobot.eventbus.g(KidsMainActivity.class, "onSettingsDoneEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(166, new org.greenrobot.eventbus.g(KidsMainActivity.class, "onDestroyDraftEvent", com.ss.android.ugc.aweme.ftc.c.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(167, new org.greenrobot.eventbus.g(KidsMainActivity.class, "onShowPolicyNoticeToastEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(168, new org.greenrobot.eventbus.g(KidsMainActivity.class, "onClickDraftEvent", com.ss.android.ugc.aweme.kids.profile.api.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68170);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<androidx.fragment.app.i> {
        final /* synthetic */ KidsMainActivity this$0;

        static {
            Covode.recordClassIndex(68174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(KidsMainActivity kidsMainActivity) {
            super(0);
            this.this$0 = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.i invoke() {
            return this.this$0.getSupportFragmentManager();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.kids.homepage.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f106690a = new i();

        static {
            Covode.recordClassIndex(68181);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.kids.homepage.a.a invoke() {
            return new com.ss.android.ugc.aweme.kids.homepage.a.a();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f106682a = new c();

        static {
            Covode.recordClassIndex(68172);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return DiscoveryServiceImpl.b().a();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f106683a = new d();

        static {
            Covode.recordClassIndex(68173);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return RecommendFeedServiceImpl.c().a();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f106689a = new h();

        static {
            Covode.recordClassIndex(68180);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return FavoriteServiceImpl.b().a();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<PolicyNoticeToast> {
        final /* synthetic */ KidsMainActivity this$0;

        static {
            Covode.recordClassIndex(68186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(KidsMainActivity kidsMainActivity) {
            super(0);
            this.this$0 = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PolicyNoticeToast invoke() {
            return this.this$0._$_findCachedViewById(R.id.d6g);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f106696a = new n();

        static {
            Covode.recordClassIndex(68187);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ProfileServiceImpl.b().a();
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final f f106684a = new f();

        static {
            Covode.recordClassIndex(68175);
        }

        f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            KidsWellbeingSetting kidsWellbeingSetting;
            IKidsWellbeingService c2 = KidsWellbeingServiceImpl.c();
            KidsComplianceSettings a2 = com.ss.android.ugc.aweme.kids.homepage.compliance.a.f106573a.a();
            if (a2 != null) {
                kidsWellbeingSetting = a2.getWellbeingSetting();
            } else {
                kidsWellbeingSetting = null;
            }
            c2.a(kidsWellbeingSetting);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        EventBus.a().b(this);
        unregisterReceiver(c());
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        if (h.f.b.l.a((Object) this.f106669a, (Object) "homepage_hot")) {
            Fragment d2 = d();
            if (!(d2 instanceof com.ss.android.ugc.aweme.kids.commonfeed.c.b)) {
                d2 = null;
            }
            com.ss.android.ugc.aweme.kids.commonfeed.c.b bVar = (com.ss.android.ugc.aweme.kids.commonfeed.c.b) d2;
            if (bVar != null) {
                bVar.b();
            }
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        if (a().e() > 0) {
            a().c();
            this.f106669a = "personal_homepage";
            ((HomeBottomTabView) _$_findCachedViewById(R.id.bgi)).a(this.f106669a);
        } else if (System.currentTimeMillis() - this.f106672e <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            finish();
            this.f106672e = 0;
        } else {
            this.f106672e = System.currentTimeMillis();
            new com.bytedance.tux.g.b(this).e(R.string.a2i).b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z;
        int i2;
        T t;
        Map<Class<?>, t<? extends com.bytedance.ies.foundation.base.a>> map = provideBaseViewModel().getSubscribeStore().f33894a;
        if (!map.containsKey(x.class)) {
            map.put(x.class, new t<>());
        }
        if (map.containsKey(x.class)) {
            t<? extends com.bytedance.ies.foundation.base.a> tVar = map.get(x.class);
            if (tVar == null) {
                tVar = new t<>();
                map.put(x.class, tVar);
            }
            com.bytedance.ies.foundation.base.b configuration = provideBaseViewModel().getConfiguration();
            T t2 = (T) ((com.bytedance.ies.foundation.base.a) tVar.getValue());
            if (t2 == null) {
                Iterator<T> it = configuration.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t instanceof x) {
                        break;
                    }
                }
                if (!(t instanceof x)) {
                    t = null;
                }
                t2 = t;
                if (t2 == null) {
                    t2 = (T) ((com.bytedance.ies.foundation.base.a) x.class.newInstance());
                }
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.activity.processor.ImmersiveConfig");
            T t3 = t2;
            if (h.f.b.l.a((Object) this.f106669a, (Object) "homepage_hot") || h.f.b.l.a((Object) this.f106669a, (Object) "tab_draft")) {
                z = true;
                i2 = R.color.a2;
            } else {
                z = false;
                i2 = R.color.f159928l;
            }
            x a2 = x.a(t3, i2);
            a2.f65555a = !z;
            a2.f65558d = i2;
            configuration.a(a2);
            if (t2.equals(a2)) {
                return;
            }
            if (h.f.b.l.a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(a2);
            } else if (tVar instanceof t) {
                tVar.postValue(a2);
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        long j2;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", true);
        super.onResume();
        String str = "homepage_hot";
        if (this.f106675h == 0 && h.f.b.l.a((Object) this.f106669a, (Object) str)) {
            Fragment d2 = d();
            if (!(d2 instanceof com.ss.android.ugc.aweme.kids.commonfeed.c.b)) {
                d2 = null;
            }
            com.ss.android.ugc.aweme.kids.commonfeed.c.b bVar = (com.ss.android.ugc.aweme.kids.commonfeed.c.b) d2;
            if (bVar != null) {
                bVar.a();
            }
        }
        if (this.f106675h != 0) {
            HomeBottomTabView homeBottomTabView = (HomeBottomTabView) _$_findCachedViewById(R.id.bgi);
            int i2 = this.f106675h;
            if (i2 != 0) {
                if (i2 == 1) {
                    str = "discovery";
                } else if (i2 == 3) {
                    str = "liked";
                } else if (i2 == 4) {
                    str = "personal_homepage";
                } else {
                    throw new IllegalArgumentException("page index [" + i2 + "] is not support");
                }
            }
            homeBottomTabView.setCurrentTab(str);
        }
        if (com.ss.android.ugc.aweme.kids.common.c.d.f105892a != null) {
            Long l2 = com.ss.android.ugc.aweme.kids.common.c.d.f105893b;
            if (l2 != null) {
                j2 = System.currentTimeMillis() - l2.longValue();
            } else {
                j2 = 0;
            }
            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
            String valueOf = String.valueOf(com.ss.android.ugc.aweme.kids.common.c.d.f105892a);
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = valueOf.toLowerCase(Locale.ROOT);
            h.f.b.l.b(lowerCase, "");
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_app_launch", cVar.a(StringSet.type, lowerCase).a("duration", String.valueOf(j2)).a());
            com.ss.android.ugc.aweme.kids.common.c.d.f105892a = null;
            com.ss.android.ugc.aweme.kids.common.c.d.f105893b = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", false);
    }

    static final class j extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f106691a = new j();

        static {
            Covode.recordClassIndex(68182);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106692a);
            return z.f158842a;
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsMainActivity f106681a;

        static {
            Covode.recordClassIndex(68171);
        }

        b(KidsMainActivity kidsMainActivity) {
            this.f106681a = kidsMainActivity;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            KidsMainActivity kidsMainActivity = this.f106681a;
            AVExternalServiceImpl.a().publishService().tryRestorePublish(kidsMainActivity, new g(kidsMainActivity));
            return null;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onClickDraftEvent(com.ss.android.ugc.aweme.kids.profile.api.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f106669a = "tab_draft";
        b();
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bgi)).a(this.f106669a);
    }

    @r(a = ThreadMode.MAIN)
    public final void onShowPolicyNoticeToastEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.c cVar) {
        h.f.b.l.d(cVar, "");
        ((PolicyNoticeToast) this.f106673f.getValue()).setValues(cVar.f106615a);
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, Void> {
        final /* synthetic */ KidsMainActivity this$0;

        static {
            Covode.recordClassIndex(68176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(KidsMainActivity kidsMainActivity) {
            super(1);
            this.this$0 = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Void invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                return null;
            }
            a.C0731a b2 = new a.C0731a(this.this$0).b(R.string.h_r).a(R.string.asg, (DialogInterface.OnClickListener) new a(this), false).b(R.string.a9e, (DialogInterface.OnClickListener) new b(this), false);
            h.f.b.l.b(b2, "");
            b2.M = false;
            b2.a().b();
            return null;
        }

        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f106688a;

            static {
                Covode.recordClassIndex(68179);
            }

            b(g gVar) {
                this.f106688a = gVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                IAVPublishService publishService;
                h.f.b.l.b(dialogInterface, "");
                IExternalService a2 = AVExternalServiceImpl.a();
                if (!(a2 == null || (publishService = a2.publishService()) == null)) {
                    publishService.cancelRestoreOnMain();
                }
                dialogInterface.dismiss();
            }
        }

        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f106685a;

            static {
                Covode.recordClassIndex(68177);
            }

            a(g gVar) {
                this.f106685a = gVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                final RecordConfig.Builder creationId = new RecordConfig.Builder().shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString());
                AVExternalServiceImpl.a().asyncService(this.f106685a.this$0, "restore_crash", new SimpleServiceLoadCallback(this) {
                    /* class com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity.g.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f106686a;

                    static {
                        Covode.recordClassIndex(68178);
                    }

                    {
                        this.f106686a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j2) {
                        h.f.b.l.d(asyncAVService, "");
                        asyncAVService.uiService().recordService().startRecord(this.f106686a.f106685a.this$0, creationId.build());
                    }
                });
                dialogInterface.dismiss();
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDestroyDraftEvent(com.ss.android.ugc.aweme.ftc.c.b bVar) {
        h.f.b.l.d(bVar, "");
        if (h.f.b.l.a((Object) this.f106669a, (Object) "tab_draft")) {
            this.f106669a = "personal_homepage";
        }
        b();
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bgi)).a(this.f106669a);
    }

    @r(a = ThreadMode.MAIN)
    public final void onSettingsDoneEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.b bVar) {
        Boolean policyNoticeEnable;
        KidsComplianceSettings a2 = com.ss.android.ugc.aweme.kids.homepage.compliance.a.f106573a.a();
        if (a2 != null && (policyNoticeEnable = a2.getPolicyNoticeEnable()) != null && policyNoticeEnable.booleanValue()) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a aVar = new com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a();
            h.f.b.l.d(this, "");
            aVar.a().getPolicyNotice().a(new a.C2725a(System.currentTimeMillis(), this));
        }
    }

    /* access modifiers changed from: package-private */
    public final Fragment a(String str) {
        switch (str.hashCode()) {
            case -562830579:
                if (str.equals("personal_homepage")) {
                    return (Fragment) this.f106679l.getValue();
                }
                break;
            case -121207376:
                if (str.equals("discovery")) {
                    return (Fragment) this.f106677j.getValue();
                }
                break;
            case 102974381:
                if (str.equals("liked")) {
                    return (Fragment) this.f106678k.getValue();
                }
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return d();
                }
                break;
        }
        throw new IllegalArgumentException("[" + str + "] is not support");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", true);
        activityConfiguration(j.f106691a);
        super.onCreate(bundle);
        if (com.ss.android.ugc.aweme.kids.common.c.d.f105892a == null) {
            com.ss.android.ugc.aweme.kids.common.c.d.f105892a = com.ss.android.ugc.aweme.kids.common.c.a.WARM;
            com.ss.android.ugc.aweme.kids.common.c.d.f105893b = Long.valueOf(System.currentTimeMillis());
        }
        getWindow().clearFlags(1024);
        setContentView(R.layout.ada);
        this.f106675h = getIntent().getIntExtra("key_init_page_index", 0);
        EventBus.a(EventBus.a(), this);
        a().a().a(R.id.ad7, d(), "homepage_hot").b();
        this.f106669a = "homepage_hot";
        b();
        AppWidgetServiceImpl.a().a(this);
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bgi)).setTabSelectListener(new k(this));
        com.ss.android.ugc.aweme.kids.homepage.compliance.a.f106574b.f106578a.checkIn().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b.a(System.currentTimeMillis()));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b(this, c(), intentFilter);
        b.i.b(f.f106684a, b.i.f4824a);
        if (this.f106674g.compareAndSet(false, true)) {
            b.i.a(1800).b(new b(this), com.ss.android.ugc.aweme.cw.g.c());
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", false);
    }

    public static final class l extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsMainActivity f106694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig.Builder f106695b;

        static {
            Covode.recordClassIndex(68185);
        }

        @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
        }

        l(KidsMainActivity kidsMainActivity, RecordConfig.Builder builder) {
            this.f106694a = kidsMainActivity;
            this.f106695b = builder;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            h.f.b.l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f106694a, this.f106695b.build());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z;
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 == 24) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.common.b.c(z));
        return true;
    }

    static final class k implements com.ss.android.ugc.aweme.kids.homepage.bottomview.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsMainActivity f106693a;

        static {
            Covode.recordClassIndex(68184);
        }

        k(KidsMainActivity kidsMainActivity) {
            this.f106693a = kidsMainActivity;
        }

        @Override // com.ss.android.ugc.aweme.kids.homepage.bottomview.g
        public final void a(String str, String str2) {
            String str3;
            String str4;
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str2, (Object) "tab_publish")) {
                KidsMainActivity kidsMainActivity = this.f106693a;
                if (!com.ss.android.ugc.aweme.l.a.a.a(((HomeBottomTabView) kidsMainActivity._$_findCachedViewById(R.id.bgi)).f106543d.get("tab_publish"), 1200)) {
                    Aweme b2 = RecommendFeedServiceImpl.c().b();
                    com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("shoot_way", "direct_shoot");
                    if (b2 == null || (str3 = b2.getAid()) == null) {
                        str3 = "";
                    }
                    com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str3);
                    if (b2 == null || (str4 = b2.getLogPbString()) == null) {
                        str4 = "";
                    }
                    com.ss.android.ugc.aweme.kids.common.c.f.a("shoot", a3.a("log_pb", str4).a());
                    String uuid = UUID.randomUUID().toString();
                    h.f.b.l.b(uuid, "");
                    AVExternalServiceImpl.a().asyncServiceForMainRecordService(kidsMainActivity, "direct_shoot", new l(kidsMainActivity, new RecordConfig.Builder().shootWay("direct_shoot").creationId(uuid)));
                    return;
                }
                return;
            }
            KidsMainActivity kidsMainActivity2 = this.f106693a;
            if (!kidsMainActivity2.isFinishing() && !TextUtils.equals(str, str2)) {
                try {
                    Fragment a4 = kidsMainActivity2.a(str);
                    Fragment a5 = kidsMainActivity2.a(str2);
                    androidx.fragment.app.n a6 = kidsMainActivity2.a().a();
                    h.f.b.l.b(a6, "");
                    if (kidsMainActivity2.a().e() > 0) {
                        kidsMainActivity2.a().c();
                    }
                    if (!a5.isAdded()) {
                        a6.b(a4).a(R.id.ad7, a5, str2).c();
                    } else {
                        a6.b(a4).c(a5).c();
                    }
                    if (TextUtils.equals(str, "liked")) {
                        a6.a(a4);
                    }
                    if (TextUtils.equals(str, "homepage_hot")) {
                        if (!(a4 instanceof com.ss.android.ugc.aweme.kids.commonfeed.c.b)) {
                            a4 = null;
                        }
                        com.ss.android.ugc.aweme.kids.commonfeed.c.b bVar = (com.ss.android.ugc.aweme.kids.commonfeed.c.b) a4;
                        if (bVar != null) {
                            bVar.b();
                        }
                    }
                    if (TextUtils.equals(str2, "homepage_hot")) {
                        if (!(a5 instanceof com.ss.android.ugc.aweme.kids.commonfeed.c.b)) {
                            a5 = null;
                        }
                        com.ss.android.ugc.aweme.kids.commonfeed.c.b bVar2 = (com.ss.android.ugc.aweme.kids.commonfeed.c.b) a5;
                        if (bVar2 != null) {
                            bVar2.a();
                        }
                    }
                    kidsMainActivity2.f106669a = str2;
                    kidsMainActivity2.b();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private static Intent a(KidsMainActivity kidsMainActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return kidsMainActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity.b(com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
