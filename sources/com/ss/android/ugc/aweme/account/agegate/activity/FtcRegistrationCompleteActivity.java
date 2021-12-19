package com.ss.android.ugc.aweme.account.agegate.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.e.f;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;

public final class FtcRegistrationCompleteActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62618a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f62619b = i.a((h.f.a.a) new c(this));

    /* renamed from: c  reason: collision with root package name */
    private HashMap f62620c;

    static {
        Covode.recordClassIndex(38541);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62620c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62620c == null) {
            this.f62620c = new HashMap();
        }
        View view = (View) this.f62620c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62620c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f62619b.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38542);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ FtcRegistrationCompleteActivity this$0;

        static {
            Covode.recordClassIndex(38544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(0);
            this.this$0 = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2;
            Intent intent = this.this$0.getIntent();
            if (intent == null || (a2 = a(intent, "enter_method")) == null) {
                return "";
            }
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
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

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.e.e, z> {
        final /* synthetic */ FtcRegistrationCompleteActivity this$0;

        static {
            Covode.recordClassIndex(38545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.this$0 = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.e.e eVar) {
            com.bytedance.tux.dialog.e.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44869a = FtcRegistrationCompleteActivity.a(this.this$0);
            eVar2.f44870b = FtcRegistrationCompleteActivity.a(this.this$0);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ FtcRegistrationCompleteActivity this$0;

        static {
            Covode.recordClassIndex(38546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.this$0 = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(R.string.fbi, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(38547);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity = this.this$0.this$0;
                    Bundle a2 = FtcRegistrationCompleteActivity.a(ftcRegistrationCompleteActivity.getIntent());
                    if (a2 == null) {
                        a2 = new Bundle();
                    }
                    l.b(a2, "");
                    if (cj.a()) {
                        a2.putBoolean("only_login", true);
                    }
                    com.ss.android.ugc.aweme.account.d.a(a2, ftcRegistrationCompleteActivity, new b(ftcRegistrationCompleteActivity));
                    r.a("confirm_relaunch_app_popup", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", ftcRegistrationCompleteActivity.a()).f62575a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static int a(Context context) {
        Resources resources = context.getResources();
        l.b(resources, "");
        return (int) TypedValue.applyDimension(1, 132.0f, resources.getDisplayMetrics());
    }

    static final class b extends m implements h.f.a.b<b.i<Bundle>, z> {
        final /* synthetic */ FtcRegistrationCompleteActivity this$0;

        static {
            Covode.recordClassIndex(38543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.this$0 = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.i<Bundle> iVar) {
            b.i<Bundle> iVar2 = iVar;
            l.d(iVar2, "");
            this.this$0.finish();
            com.ss.android.ugc.aweme.account.agegate.b.f62627b = false;
            if (cj.d()) {
                cj.a(1, 1, (Object) "");
            }
            com.ss.android.ugc.aweme.account.f.a.a(11);
            cj.a(cj.f());
            iVar2.d();
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String string;
        MethodCollector.i(9047);
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fk);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(2131231091);
        if (com.bytedance.ies.abmock.b.a().a(true, "kids_mode_relaunch_model_copy", 1) == com.ss.android.ugc.aweme.account.agegate.model.h.f62795a) {
            string = getString(R.string.fbk);
        } else {
            string = getString(R.string.fbl);
        }
        l.b(string, "");
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.e.a(f.a(a.C1094a.a(this), imageView, new d(this)).b(string).d(getString(R.string.fbj)), new e(this)).a(false)).a().b().show();
        r.a("show_relaunch_app_popup", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", a()).f62575a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", false);
        MethodCollector.o(9047);
    }
}
