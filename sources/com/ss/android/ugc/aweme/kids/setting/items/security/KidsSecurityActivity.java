package com.ss.android.ugc.aweme.kids.setting.items.security;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class KidsSecurityActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f107081b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public IKidsAccountService f107082a = KidsAccountServiceImpl.h();

    /* renamed from: c  reason: collision with root package name */
    private HashMap f107083c;

    static {
        Covode.recordClassIndex(68485);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f107083c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f107083c == null) {
            this.f107083c = new HashMap();
        }
        View view = (View) this.f107083c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f107083c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
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

    public static final class d implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsSecurityActivity f107089a;

        static {
            Covode.recordClassIndex(68492);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(KidsSecurityActivity kidsSecurityActivity) {
            this.f107089a = kidsSecurityActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f107089a.finish();
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107087a = new c();

        static {
            Covode.recordClassIndex(68490);
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
            baseActivityViewModel2.config(AnonymousClass1.f107088a);
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        this.f107082a.a("allow_one_key_login", z);
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.ds5);
        l.b(commonItemView, "");
        commonItemView.setChecked(z);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsSecurityActivity f107084a;

        static {
            Covode.recordClassIndex(68487);
        }

        b(KidsSecurityActivity kidsSecurityActivity) {
            this.f107084a = kidsSecurityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f107084a.f107082a.c()) {
                this.f107084a.a(true);
            } else if (this.f107084a.f107082a.d()) {
                a.C0731a aVar = new a.C0731a(this.f107084a);
                aVar.a(R.string.fn);
                aVar.M = false;
                aVar.b(R.string.fk).b(R.string.fl, (DialogInterface.OnClickListener) AnonymousClass1.f107085a, false).a(R.string.fm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f107086a;

                    static {
                        Covode.recordClassIndex(68489);
                    }

                    {
                        this.f107086a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f107086a.f107084a.a(false);
                    }
                }, false).a().c();
            } else {
                this.f107084a.a(false);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", true);
        activityConfiguration(c.f107087a);
        super.onCreate(bundle);
        setContentView(R.layout.ac3);
        boolean c2 = this.f107082a.c();
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.ds5);
        l.b(commonItemView, "");
        commonItemView.setVisibility(0);
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.ds5);
        l.b(commonItemView2, "");
        commonItemView2.setChecked(c2);
        ((CommonItemView) _$_findCachedViewById(R.id.ds5)).setOnClickListener(new b(this));
        ((ButtonTitleBar) _$_findCachedViewById(R.id.emo)).setOnTitleBarClickListener(new d(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", false);
    }
}
