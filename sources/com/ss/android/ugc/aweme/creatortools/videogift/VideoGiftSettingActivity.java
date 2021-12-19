package com.ss.android.ugc.aweme.creatortools.videogift;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.ss.android.ugc.aweme.utils.fy;
import com.ss.android.ugc.aweme.utils.is;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class VideoGiftSettingActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f78459a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f78460b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f78461c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f78462d;

    /* renamed from: e  reason: collision with root package name */
    private String f78463e = "";

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f78464f;

    static {
        Covode.recordClassIndex(48728);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f78464f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f78464f == null) {
            this.f78464f = new SparseArray();
        }
        View view = (View) this.f78464f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f78464f.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        this.f78461c.dispose();
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

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftSettingActivity f78465a;

        static {
            Covode.recordClassIndex(48729);
        }

        a(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f78465a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78465a.onBackPressed();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftSettingActivity f78466a;

        static {
            Covode.recordClassIndex(48730);
        }

        b(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f78466a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f78466a, "aweme://webview").withParam(Uri.parse(fy.a("virtual-items"))).open();
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78467a = new c();

        static {
            Covode.recordClassIndex(48731);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f78468a);
            baseActivityViewModel2.config(AnonymousClass2.f78469a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftSettingActivity f78471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f78472b;

        static {
            Covode.recordClassIndex(48735);
        }

        e(VideoGiftSettingActivity videoGiftSettingActivity, boolean z) {
            this.f78471a = videoGiftSettingActivity;
            this.f78472b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            VideoGiftSettingActivity videoGiftSettingActivity = this.f78471a;
            CommonItemView commonItemView = (CommonItemView) videoGiftSettingActivity._$_findCachedViewById(R.id.bbs);
            l.b(commonItemView, "");
            commonItemView.setChecked(this.f78472b);
            if (this.f78472b) {
                videoGiftSettingActivity.b(0);
            } else {
                videoGiftSettingActivity.a(0);
            }
            th.getMessage();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftSettingActivity f78473a;

        static {
            Covode.recordClassIndex(48736);
        }

        f(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f78473a = videoGiftSettingActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
            boolean d2 = ((CommonItemView) view).d();
            if (d2) {
                this.f78473a.a(d2);
                return;
            }
            SmartRouter.buildRoute(this.f78473a, "aweme://video_gift_opt_in").withParam("bundle_video_gift_previous_page", "video_gift_opt_in").open();
            this.f78473a.finish();
        }
    }

    public final void a(int i2) {
        String str;
        String str2 = "gift_setting";
        if (!this.f78459a || this.f78460b) {
            str = str2;
        } else {
            this.f78460b = true;
            str = "video_gift_opt_in";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("is_success", i2);
        if (this.f78462d) {
            str2 = "notification";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("previous_page", str2);
        l.b(a3, "");
        r.a("enable_video_gifting", a3.f66730a);
    }

    public final void b(int i2) {
        String str = "gift_setting";
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("is_success", i2);
        if (this.f78462d) {
            str = "notification";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("previous_page", str);
        l.b(a3, "");
        r.a("disable_video_gifting", a3.f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoGiftSettingActivity f78470a;

        static {
            Covode.recordClassIndex(48734);
        }

        d(VideoGiftSettingActivity videoGiftSettingActivity) {
            this.f78470a = videoGiftSettingActivity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            g gVar = (g) obj;
            l.d(gVar, "");
            VideoGiftSettingActivity videoGiftSettingActivity = this.f78470a;
            Integer num = gVar.f78484a;
            if (num != null) {
                num.intValue();
                Integer num2 = gVar.f78484a;
                int value = h.ACCEPT.getValue();
                if (num2 != null && num2.intValue() == value) {
                    z = true;
                } else {
                    z = false;
                }
                is.a(z);
                Integer num3 = gVar.f78484a;
                int value2 = h.ACCEPT.getValue();
                if (num3 != null && num3.intValue() == value2) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f78470a).a(R.string.hc0).a();
                    videoGiftSettingActivity.a(1);
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f78470a).a(R.string.hbz).a();
                videoGiftSettingActivity.b(1);
            }
        }
    }

    public final void a(boolean z) {
        this.f78461c.a();
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.bbs);
        l.b(commonItemView, "");
        commonItemView.setChecked(!z);
        this.f78461c.a(VideoGiftApi.a.a(!z).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this, z)));
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String str;
        String str2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", true);
        activityConfiguration(c.f78467a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.ay6);
        Intent intent = getIntent();
        Boolean bool2 = null;
        if (intent != null) {
            bool = Boolean.valueOf(intent.getBooleanExtra("bundle_enter_from_gift_eligibility", false));
        } else {
            bool = null;
        }
        this.f78459a = bool.booleanValue();
        Intent intent2 = getIntent();
        if (intent2 == null || (str = a(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.f78463e = str;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            bool2 = Boolean.valueOf(intent3.getBooleanExtra("bundle_video_gift_enter_from_notification", false));
        }
        this.f78462d = bool2.booleanValue();
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.emo);
        l.b(buttonTitleBar, "");
        buttonTitleBar.getStartBtn().setOnClickListener(new a(this));
        ((ImageView) _$_findCachedViewById(R.id.bfx)).setOnClickListener(new b(this));
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(is.a("vgc_visiting_first_time"), false);
        boolean z = Keva.getRepo("video_gift_settings_keva_repo").getBoolean(is.a("vgc_accept_gifting"), false);
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.bbs);
        l.b(commonItemView, "");
        commonItemView.setChecked(z);
        ((CommonItemView) _$_findCachedViewById(R.id.bbs)).setOnClickListener(new f(this));
        if (this.f78459a) {
            a(false);
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "gift_setting");
        if (this.f78462d) {
            str2 = "notification";
        } else {
            str2 = this.f78463e;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("previous_page", str2);
        l.b(a3, "");
        r.a("enter_gift_setting_page", a3.f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
