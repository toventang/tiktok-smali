package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerpreload.task.e;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class ChallengeDetailActivity extends com.bytedance.ies.foundation.activity.a implements com.ss.android.ugc.aweme.analysis.c, g, f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f70021c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f70022a = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: b  reason: collision with root package name */
    String f70023b = "";

    /* renamed from: d  reason: collision with root package name */
    private final h f70024d = i.a((h.f.a.a) new b(this));

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<com.ss.android.ugc.aweme.base.a.a> f70025e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f70026f;

    static {
        Covode.recordClassIndex(43196);
    }

    private final ChallengeDetailParam a() {
        return (ChallengeDetailParam) this.f70024d.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f70026f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f70026f == null) {
            this.f70026f = new SparseArray();
        }
        View view = (View) this.f70026f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f70026f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "challenge";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43197);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
        com.ss.android.ugc.aweme.miniapp_api.a.a(this);
    }

    static final class b extends m implements h.f.a.a<ChallengeDetailParam> {
        final /* synthetic */ ChallengeDetailActivity this$0;

        static {
            Covode.recordClassIndex(43198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChallengeDetailActivity challengeDetailActivity) {
            super(0);
            this.this$0 = challengeDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChallengeDetailParam invoke() {
            Object value = this.this$0.f70022a.getValue();
            if (value == null) {
                return new ChallengeDetailParam(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
            }
            return value;
        }
    }

    static final class c extends m implements h.f.a.a<p<? extends Long, ? extends String>> {
        final /* synthetic */ ChallengeDetailActivity this$0;

        static {
            Covode.recordClassIndex(43199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChallengeDetailActivity challengeDetailActivity) {
            super(0);
            this.this$0 = challengeDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ p<? extends Long, ? extends String> invoke() {
            Long valueOf = Long.valueOf(this.this$0.getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", 0));
            String a2 = e.a(this.this$0.getIntent());
            if (a2 == null) {
                a2 = "";
            }
            return new p(valueOf, a2);
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

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        long j2;
        long j3 = 0;
        try {
            String cid = a().getCid();
            if (cid == null) {
                l.b();
            }
            j2 = Long.parseLong(cid);
        } catch (Exception e2) {
            e2.printStackTrace();
            j2 = 0;
        }
        try {
            String awemeId = a().getAwemeId();
            if (awemeId == null) {
                l.b();
            }
            j3 = Long.parseLong(awemeId);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", a().getProcessId());
            jSONObject.put("challenge_id", this.f70023b);
        } catch (JSONException unused) {
        }
        Analysis ext_json = new Analysis().setLabelName("challenge").setExt_value(j2).setValue(j3).setExt_json(jSONObject);
        l.b(ext_json, "");
        return ext_json;
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public final void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
        ArrayList<com.ss.android.ugc.aweme.base.a.a> arrayList = this.f70025e;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    static final class d extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f70027a = new d();

        static {
            Covode.recordClassIndex(43200);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f70028a);
            baseActivityViewModel2.config(AnonymousClass2.f70029a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public final void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
        if (!this.f70025e.contains(aVar)) {
            this.f70025e.add(aVar);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        com.ss.android.ugc.aweme.cc.c.a("challenge_detail");
        activityConfiguration(d.f70027a);
        super.onCreate(bundle);
        setContentView(R.layout.aja);
        View findViewById = findViewById(R.id.ad7);
        l.b(findViewById, "");
        findViewById.setFitsSystemWindows(false);
        if (TextUtils.isEmpty(a().getCid())) {
            finish();
        } else {
            a().setShootEnterFrom(a(getIntent(), "shoot_enter_from"));
            a().setBundled(Integer.valueOf(getIntent().getIntExtra("is_bundled", 0)));
            androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            ChallengeDetailParam a2 = a();
            l.d(supportFragmentManager, "");
            l.d(a2, "");
            n a3 = supportFragmentManager.a();
            l.b(a3, "");
            Fragment a4 = supportFragmentManager.a("challenge_detail_fragment_tag");
            if (a4 == null) {
                l.d(a2, "");
                a4 = new j();
                RouteArgExtension.INSTANCE.withNavArg(a4, a2);
            }
            a4.setUserVisibleHint(true);
            a3.b(R.id.ad7, a4, "challenge_detail_fragment_tag");
            a3.b();
            if (a4 instanceof j) {
                ((j) a4).r = new c(this);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<com.ss.android.ugc.aweme.base.a.a> it = this.f70025e.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
