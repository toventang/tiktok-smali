package com.ss.android.ugc.aweme.creatortools.videogift;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.ss.android.ugc.aweme.utils.fy;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class VideoGiftEligibilityActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78441a;

    /* renamed from: b  reason: collision with root package name */
    public String f78442b = "";

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f78443c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f78444d;

    static {
        Covode.recordClassIndex(48716);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f78444d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f78444d == null) {
            this.f78444d = new SparseArray();
        }
        View view = (View) this.f78444d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f78444d.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f78443c.dispose();
        super.onDestroy();
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

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78446a;

        static {
            Covode.recordClassIndex(48718);
        }

        b(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f78446a = videoGiftEligibilityActivity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            th.getMessage();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78447a;

        static {
            Covode.recordClassIndex(48719);
        }

        c(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f78447a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78447a.onBackPressed();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPrivacyDisclaimerUtil f78450b;

        static {
            Covode.recordClassIndex(48721);
        }

        e(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f78449a = videoGiftEligibilityActivity;
            this.f78450b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78450b.b(this.f78449a);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPrivacyDisclaimerUtil f78452b;

        static {
            Covode.recordClassIndex(48722);
        }

        f(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f78451a = videoGiftEligibilityActivity;
            this.f78452b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78452b.a(this.f78451a);
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IPrivacyDisclaimerUtil f78454b;

        static {
            Covode.recordClassIndex(48723);
        }

        g(VideoGiftEligibilityActivity videoGiftEligibilityActivity, IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil) {
            this.f78453a = videoGiftEligibilityActivity;
            this.f78454b = iPrivacyDisclaimerUtil;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78454b.c(this.f78453a);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78448a;

        static {
            Covode.recordClassIndex(48720);
        }

        d(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f78448a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f78448a, "aweme://webview").withParam(Uri.parse(fy.a("virtual-items"))).open();
        }
    }

    static final class i extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f78456a = new i();

        static {
            Covode.recordClassIndex(48725);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f78457a);
            baseActivityViewModel2.config(AnonymousClass2.f78458a);
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78455a;

        static {
            Covode.recordClassIndex(48724);
        }

        h(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f78455a = videoGiftEligibilityActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f78455a, "aweme://account_settings_gifts_setting").withParam("bundle_enter_from_gift_eligibility", true).withParam("bundle_video_gift_enter_from_notification", this.f78455a.f78441a).withParam("bundle_video_gift_previous_page", this.f78455a.f78442b).open();
            this.f78455a.finish();
            if (this.f78455a.f78441a) {
                str = "notification";
            } else {
                str = "gift_setting";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str);
            l.b(a2, "");
            r.a("toggle_video_gift_on", a2.f66730a);
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftEligibilityActivity f78445a;

        static {
            Covode.recordClassIndex(48717);
        }

        a(VideoGiftEligibilityActivity videoGiftEligibilityActivity) {
            this.f78445a = videoGiftEligibilityActivity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> list;
            String str;
            MethodCollector.i(8156);
            e eVar = (e) obj;
            l.d(eVar, "");
            VideoGiftEligibilityActivity videoGiftEligibilityActivity = this.f78445a;
            if (videoGiftEligibilityActivity.isDestroyed() || videoGiftEligibilityActivity.isFinishing() || videoGiftEligibilityActivity._$_findCachedViewById(R.id.ck8) == null) {
                MethodCollector.o(8156);
                return;
            }
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.bb0);
            l.b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.au9);
            l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            b bVar = eVar.f78481a;
            if (!(bVar == null || (list = bVar.f78476b) == null || (str = (String) n.h((List) list)) == null)) {
                v a2 = com.bytedance.lighten.a.r.a(str);
                a2.E = (SmartImageView) videoGiftEligibilityActivity._$_findCachedViewById(R.id.dck);
                a2.v = w.CENTER_INSIDE;
                a2.c();
            }
            boolean z = true;
            List<d> list2 = eVar.f78482b;
            if (list2 != null) {
                for (T t : list2) {
                    View a3 = com.a.a(LayoutInflater.from(videoGiftEligibilityActivity), R.layout.ayu, (ViewGroup) videoGiftEligibilityActivity._$_findCachedViewById(R.id.ck8), false);
                    Integer num = t.f78480c;
                    int value = f.STATUS_PASS.getValue();
                    if (num == null || num.intValue() != value) {
                        l.b(a3, "");
                        ((ImageView) a3.findViewById(R.id.dm2)).setImageResource(2131233747);
                        z = false;
                    }
                    l.b(a3, "");
                    TuxTextView tuxTextView = (TuxTextView) a3.findViewById(R.id.dm3);
                    l.b(tuxTextView, "");
                    tuxTextView.setText(t.f78478a);
                    ((LinearLayout) videoGiftEligibilityActivity._$_findCachedViewById(R.id.ck8)).addView(a3);
                }
                if (!z) {
                    TuxButton tuxButton = (TuxButton) videoGiftEligibilityActivity._$_findCachedViewById(R.id.eu0);
                    l.b(tuxButton, "");
                    tuxButton.setEnabled(false);
                }
            }
            MethodCollector.o(8156);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", true);
        activityConfiguration(i.f78456a);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            bool = Boolean.valueOf(intent.getBooleanExtra("bundle_video_gift_enter_from_notification", false));
        } else {
            bool = null;
        }
        this.f78441a = bool.booleanValue();
        Intent intent2 = getIntent();
        if (intent2 == null || (str = a(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.f78442b = str;
        supportRequestWindowFeature(10);
        setContentView(R.layout.ay7);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
        l.b(buttonTitleBar, "");
        buttonTitleBar.getStartBtn().setOnClickListener(new c(this));
        ((ImageView) _$_findCachedViewById(R.id.bfx)).setOnClickListener(new d(this));
        IPrivacyDisclaimerUtil a2 = PrivacyDisclaimerUtilService.a();
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.d9h);
        l.b(tuxTextView, "");
        a2.a(this, tuxTextView, new e(this, a2), new f(this, a2), new g(this, a2));
        ((TuxButton) _$_findCachedViewById(R.id.eu0)).setOnClickListener(new h(this));
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) _$_findCachedViewById(R.id.bb0);
        l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.au9);
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        this.f78443c.a();
        this.f78443c.a(VideoGiftApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), new b(this)));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
