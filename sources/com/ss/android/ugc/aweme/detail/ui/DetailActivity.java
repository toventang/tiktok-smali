package com.ss.android.ugc.aweme.detail.ui;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.q;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.a.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.bn;
import com.ss.android.ugc.aweme.d.d;
import com.ss.android.ugc.aweme.d.g;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.ss.android.ugc.aweme.detail.transition.a;
import com.ss.android.ugc.aweme.detail.transition.c;
import com.ss.android.ugc.aweme.experiment.bz;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.helper.u;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.a.a;
import com.ss.android.ugc.aweme.main.o;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.story.e.a;
import com.ss.android.ugc.aweme.utils.an;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public class DetailActivity extends ak implements b, f, d, c, al, a.AbstractC2797a, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f79882c = true;

    /* renamed from: i  reason: collision with root package name */
    public static HashSet<Integer> f79883i = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    protected l f79884a;

    /* renamed from: b  reason: collision with root package name */
    protected List<com.ss.android.ugc.aweme.base.a.a> f79885b;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f79886d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f79887e;

    /* renamed from: f  reason: collision with root package name */
    FrameLayout f79888f;

    /* renamed from: g  reason: collision with root package name */
    FrameLayout f79889g;

    /* renamed from: h  reason: collision with root package name */
    protected int f79890h;

    /* renamed from: j  reason: collision with root package name */
    private String f79891j = "";

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f79892k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.base.a.b f79893l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f79894m;
    private volatile boolean n;
    private int o = -1;
    private long p;
    private String q;
    private g r;

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "2878";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(DetailActivity.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(61, new org.greenrobot.eventbus.g(DetailActivity.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @r
    public void onVideoEvent(ag agVar) {
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.main.a.a.AbstractC2797a
    public o getHelper() {
        return this.f79884a.f79954b;
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.d.d
    public /* synthetic */ com.ss.android.ugc.aweme.d.c getInflater() {
        if (this.r == null) {
            this.r = new g(this);
        }
        return this.r;
    }

    static {
        Covode.recordClassIndex(49696);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        super.onResume();
        com.ss.android.ugc.aweme.detail.i.a(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.detail.transition.c
    public final FeedShareElementInfo[] e() {
        l lVar = this.f79884a;
        if (lVar == null || lVar.g() == null) {
            return new FeedShareElementInfo[0];
        }
        z g2 = this.f79884a.g();
        if (g2.f79992k == null || g2.f79992k.V() == null) {
            return new FeedShareElementInfo[0];
        }
        return new FeedShareElementInfo[]{new FeedShareElementInfo(g2.f79992k.V())};
    }

    public void finishAfterTransition() {
        Aweme h2;
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && (h2 = this.f79884a.h()) != null) {
            String aid = h2.getAid();
            l.d(this, "");
            l.d(aid, "");
            com.ss.android.ugc.aweme.detail.transition.b.a((Activity) this, true);
            Intent intent = new Intent();
            intent.putExtra("feed_share_element_aid", aid);
            setResult(-1, intent);
        }
        super.finishAfterTransition();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        ServiceManager.get().getService(IFeedDebugService.class);
        com.ss.android.ugc.aweme.detail.i.f79765b.removeCallbacksAndMessages(null);
        com.ss.android.ugc.aweme.detail.i.f79765b.postDelayed(i.a.f79767a, 500);
        com.bytedance.a.b.a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && Build.VERSION.SDK_INT >= 29 && !isFinishing()) {
            new Instrumentation().callActivityOnSaveInstanceState(this, new Bundle());
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        try {
            List<com.ss.android.ugc.aweme.base.a.a> list = this.f79885b;
            if (list != null) {
                for (com.ss.android.ugc.aweme.base.a.a aVar : list) {
                    if (aVar.onKeyDown(4, null)) {
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        l lVar = this.f79884a;
        if (lVar == null || !lVar.ab_()) {
            com.ss.android.ugc.aweme.framework.a.a.a(6, "DetailActivity", "back when fragment is null!");
            super.onBackPressed();
        } else if (!this.f79884a.d()) {
            this.f79884a.i();
        }
        com.ss.android.ugc.d.a.c.a(new ag(42));
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        l lVar;
        if (Build.VERSION.SDK_INT < 21 || !this.f79894m || this.n || !com.ss.android.ugc.aweme.detail.transition.b.f79870a) {
            super.finish();
            l lVar2 = this.f79884a;
            if (lVar2 != null) {
                lVar2.e();
            }
            String a2 = a(getIntent(), "video_from");
            if (!u.b(this) && !TextUtils.equals(a2, "from_follow_page")) {
                v.O().z();
            } else if (!TextUtils.equals("from_mix_video", a2)) {
                overridePendingTransition(R.anim.cb, R.anim.cc);
            }
            com.ss.android.ugc.aweme.miniapp_api.a.a(this);
            String a3 = a(getIntent(), "back_to");
            if (!TextUtils.isEmpty(a3)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse(a3);
                if ("sslocal".equals(parse.getScheme())) {
                    parse = Uri.parse(a3.replaceFirst("sslocal", "snssdk" + com.bytedance.ies.ugc.appcontext.d.n));
                }
                intent.setData(parse);
                intent.setPackage(getPackageName());
                intent.addCategory("android.intent.category.BROWSABLE");
                com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
                startActivity(intent);
            } else {
                com.ss.android.ugc.aweme.push.a.a(this);
            }
            getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            l lVar3 = this.f79884a;
            if (lVar3 != null) {
                lVar3.a(!TextUtils.equals(a2, "from_follow_page"), this.o);
                return;
            }
            return;
        }
        this.n = true;
        if (this.f79884a.g() != null) {
            this.f79884a.g().b(false);
        }
        if (!(Build.VERSION.SDK_INT < 29 || (lVar = this.f79884a) == null || lVar.h() == null)) {
            String aid = this.f79884a.h().getAid();
            l.d(aid, "");
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityTransitionState");
                l.b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Field declaredField2 = Class.forName("android.app.ActivityTransitionState").getDeclaredField("mPendingExitNames");
                l.b(declaredField2, "");
                declaredField2.setAccessible(true);
                if (declaredField2.get(obj) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aid);
                    declaredField2.set(obj, arrayList);
                }
            } catch (Exception unused) {
            }
        }
        finishAfterTransition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012e, code lost:
        if (r8.equals("challenge") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        if (r8.equals("others_homepage") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        if (r8.equals("personal_homepage") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        if (r8.equals("prop_page") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0152, code lost:
        if (r8.equals("question") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015b, code lost:
        if (r8.equals("single_song") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015e, code lost:
        r1 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", r8);
        r0 = r14.f79884a.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        if (r0 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r0 = r0.f79992k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0171, code lost:
        if (r0 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0173, code lost:
        r4 = r0.U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0177, code lost:
        com.ss.android.ugc.aweme.common.r.a("feed_back", r1.a("is_last", r4).a("group_id", r9.getAid()).f66730a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0197, code lost:
        if (r8.equals("ads_engage") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022a, code lost:
        if (r8.equals("select_ads") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022e, code lost:
        com.ss.android.ugc.aweme.common.r.a("feed_back", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", r8).f66730a);
     */
    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        // Method dump skipped, instructions count: 752
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.onDestroy():void");
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public void setActivityResultListener(com.ss.android.ugc.aweme.base.a.b bVar) {
        this.f79893l = bVar;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        List<com.ss.android.ugc.aweme.base.a.a> list = this.f79885b;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        if (this.f79885b == null) {
            this.f79885b = new ArrayList();
        }
        if (!this.f79885b.contains(aVar)) {
            this.f79885b.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public l a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        Bundle bundle;
        Intent intent = getIntent();
        if (intent == null || (bundle = a(intent)) == null) {
            bundle = new Bundle();
        }
        return l.a(bVar, bundle);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public <T extends View> T findViewById(int i2) {
        T t = (T) super.findViewById(i2);
        if (t != null || !f79883i.contains(Integer.valueOf(i2))) {
            return t;
        }
        ALog.d("live_fragment_id", "findViewById is null and id is ".concat(String.valueOf(i2)));
        return (T) super.findViewById(R.id.erg);
    }

    @r(a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        Aweme b2;
        try {
            if (TextUtils.equals("adVideoReportSuccess", jVar.f91311b.getString("eventName"))) {
                try {
                    ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
                    if (e2 != null) {
                        JSONObject jSONObject = jVar.f91311b.getJSONObject("data");
                        if (jSONObject.opt("object_id") != null) {
                            String string = jSONObject.getString("object_id");
                            IAwemeService b3 = AwemeService.b();
                            if (b3 != null && (b2 = b3.b(string)) != null) {
                                if (b2.getAwemeRawAd() != null) {
                                    e2.a(jSONObject, b2.getAwemeRawAd());
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.detail.ui.ak, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        Intent intent;
        String a2;
        Intent intent2;
        Aweme b2;
        MethodCollector.i(5337);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        if (bz.b()) {
            for (String str : bz.c()) {
                com.a.b.c.a(this, str);
            }
        }
        com.ss.android.ugc.aweme.cc.c.a("detail_page");
        if (TextUtils.equals(a(getIntent(), "enter_from"), "westwindow")) {
            l.d("detail_page", "");
            com.ss.android.ugc.aweme.story.e.a.f137035a.put("detail_page", new a.C3587a("detail_page", System.currentTimeMillis()));
        }
        x xVar = new x((byte) 0);
        xVar.f65561g = R.color.us;
        activityConfiguration(new b(xVar));
        if (com.ss.android.ugc.aweme.detail.transition.b.f79870a) {
            com.ss.android.ugc.aweme.detail.transition.b.a(this);
            l.d(this, "");
            l.d(this, "");
            DataCenter a3 = DataCenter.a(ae.a(this, (ad.b) null), this);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            androidx.core.app.a.b((Activity) this);
            setEnterSharedElementCallback(new a.d(this, this, atomicBoolean, a3));
        }
        super.onCreate(bundle);
        Intent intent3 = getIntent();
        if (intent3 != null && intent3.getBooleanExtra("from_notification", false)) {
            an.f142638a = System.currentTimeMillis();
            an.f142639b = 2;
            an.a();
        }
        if (!(intent3 == null || intent3.getData() == null)) {
            Uri data = intent3.getData();
            data.getHost();
            data.getPath();
            if (TextUtils.equals("user/video", data.getHost() + data.getPath())) {
                intent3.putExtra("enter_from", "push");
                intent3.putExtra("refer", "push");
                intent3.putExtra("id", data.getQueryParameter("id"));
                intent3.putExtra("cid", data.getQueryParameter("commentId"));
            }
        }
        getWindow().setSoftInputMode(48);
        setContentView(com.a.b.c.a((Activity) this, (int) R.layout.wa));
        this.f79889g = (FrameLayout) findViewById(R.id.al1);
        this.f79888f = (FrameLayout) findViewById(R.id.b94);
        this.f79886d = (FrameLayout) findViewById(R.id.b6p);
        com.ss.android.ugc.aweme.ca.c.b();
        this.f79889g.setBackground(null);
        this.f79890h = getIntent().getIntExtra("page_type", -1);
        String a4 = a(getIntent(), "from_micro_app");
        this.q = a4;
        if (TextUtils.isEmpty(a4) && getIntent().getData() != null) {
            this.q = getIntent().getData().getQueryParameter("from");
        }
        com.ss.android.ugc.aweme.feed.param.b a5 = com.ss.android.ugc.aweme.feed.param.a.a(this);
        HashMap<String, String> logExtra = a5.getLogExtra();
        l.d(this, "");
        l.d(logExtra, "");
        MobParamProvider.a.a(this).f93688a.putAll(logExtra);
        if (!TextUtils.isEmpty(a5.getAid()) || !TextUtils.isEmpty(a5.getIds()) || !TextUtils.isEmpty(a5.getPushParams()) || a5.isHotSpot() || a5.isSearchTopic() || a5.isfollowSkyLight().booleanValue()) {
            h.a().f93339b = a5.getAid();
            try {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "DetailActivity", "enter detail page,param from:" + a5.getFrom() + ",eventType:" + a5.getEventType());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
            this.f79891j = a5.getPreviousPage();
            if (!k.a(this, a5, this.f79890h)) {
                androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
                l lVar = (l) supportFragmentManager.a("detailFragment");
                n a6 = supportFragmentManager.a();
                if (lVar != null) {
                    this.f79884a = lVar;
                } else {
                    l a7 = a(a5);
                    this.f79884a = a7;
                    a6.b(R.id.b94, a7, "detailFragment");
                }
                Activity parent = getParent();
                l lVar2 = this.f79884a;
                if (!(parent == null || lVar2 == null || (intent = parent.getIntent()) == null || (a2 = bn.a(intent, "trigger_by")) == null)) {
                    Bundle arguments = lVar2.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        lVar2.setArguments(arguments);
                    }
                    arguments.putString("trigger_by", a2);
                }
                a6.c(this.f79884a);
                a6.b();
                this.f79884a.setUserVisibleHint(true);
                try {
                    Intent intent4 = getIntent();
                    if (intent4.getBooleanExtra("video_from_dcd", false)) {
                        com.ss.android.ugc.aweme.detail.f.a aVar = new com.ss.android.ugc.aweme.detail.f.a();
                        aVar.f79630b = a(intent4, "id");
                        aVar.f79629a = "general_search";
                        aVar.f79631c = ((LogPbBean) intent4.getSerializableExtra("extra_log_pb")).getImprId();
                        aVar.f();
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            finish();
        }
        this.p = System.currentTimeMillis();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = d();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            finish();
            new com.ss.android.ugc.aweme.tux.a.i.a(this).a(R.string.de8).a();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setNavigationBarColor(-16777216);
            }
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
        }
        if (!(getIntent() == null || a(getIntent()) == null)) {
            this.o = a(getIntent()).getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
            this.f79894m = getIntent().getBooleanExtra("feed_transition_enable", false);
        }
        if (!(Build.VERSION.SDK_INT < 21 || (intent2 = getIntent()) == null || !intent2.getBooleanExtra("video_cover_transition", false) || (b2 = AwemeService.b().b(a(intent2, "id"))) == null || b2.getVideo() == null || b2.getVideo().getCover() == null || com.bytedance.common.utility.collection.b.a((Collection) b2.getVideo().getCover().getUrlList()))) {
            this.f79886d.setVisibility(0);
            com.ss.android.ugc.aweme.feed.helper.c cVar = new com.ss.android.ugc.aweme.feed.helper.c();
            com.ss.android.ugc.aweme.feed.helper.c.a(this);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f79886d.getLayoutParams();
            layoutParams.topMargin = com.ss.android.ugc.aweme.feed.helper.c.f93319c;
            layoutParams.bottomMargin = com.ss.android.ugc.aweme.adaptation.c.a();
            this.f79886d.setLayoutParams(layoutParams);
            SmartImageView smartImageView = new SmartImageView(this);
            this.f79886d.addView(smartImageView, new FrameLayout.LayoutParams(-1, -1, 17));
            cVar.a(this, b2.getVideo(), (View) null, smartImageView, b2.getOcrLocation());
            androidx.core.h.v.a(smartImageView, "video_cover_transition");
            com.bytedance.lighten.a.v a8 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(b2.getVideo().getCover()));
            a8.A = q.HIGH;
            com.bytedance.lighten.a.v a9 = a8.a("DetailActivity");
            a9.E = smartImageView;
            a9.a(new com.bytedance.lighten.a.c.d() {
                /* class com.ss.android.ugc.aweme.detail.ui.DetailActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(49698);
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, Throwable th) {
                    androidx.core.app.a.c(DetailActivity.this);
                }

                @Override // com.bytedance.lighten.a.c.k
                public final void a(Uri uri, View view, com.bytedance.lighten.a.o oVar, Animatable animatable) {
                    androidx.core.app.a.c(DetailActivity.this);
                }
            });
            this.f79892k = true;
            androidx.core.app.a.b((Activity) this);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.addListener((Transition.TransitionListener) new a() {
                /* class com.ss.android.ugc.aweme.detail.ui.DetailActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(49697);
                }

                @Override // com.ss.android.ugc.aweme.detail.ui.a
                public final void onTransitionEnd(Transition transition) {
                    super.onTransitionEnd(transition);
                    DetailActivity detailActivity = DetailActivity.this;
                    if (!detailActivity.f79887e) {
                        detailActivity.f79887e = true;
                        detailActivity.f79886d.animate().alpha(0.0f).withEndAction(new d(detailActivity)).setDuration(50).start();
                    }
                }
            });
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        if (getIntent() != null && !getIntent().getBooleanExtra("activity_has_activity_options", false)) {
            activityConfiguration(c.f79944a);
            com.ss.android.ugc.aweme.base.a.d.a(this, 0, true);
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        findViewById(R.id.al1);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
        MethodCollector.o(5337);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onActivityReenter(int i2, Intent intent) {
        com.ss.android.ugc.aweme.detail.transition.a.a(this, i2);
        if (!(-1 != i2 || intent == null || getHelper() == null)) {
            getHelper().a(a(intent, "feed_share_element_aid"));
        }
        super.onActivityReenter(i2, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        List<com.ss.android.ugc.aweme.base.a.a> list = this.f79885b;
        if (list != null) {
            for (com.ss.android.ugc.aweme.base.a.a aVar : list) {
                if (aVar.onKeyDown(i2, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.base.a.b bVar = this.f79893l;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            activityConfiguration(e.f79947a);
            finish();
        }
    }
}
