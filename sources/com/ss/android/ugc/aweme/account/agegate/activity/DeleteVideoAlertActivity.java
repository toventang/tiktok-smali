package com.ss.android.ugc.aweme.account.agegate.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.m;
import h.h;
import java.util.HashMap;

public final class DeleteVideoAlertActivity extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62605a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f62606b = RouteArgExtension.INSTANCE.optionalArg(this, b.f62608a, "enter_from", String.class);

    /* renamed from: c  reason: collision with root package name */
    private HashMap f62607c;

    static {
        Covode.recordClassIndex(38530);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62607c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62607c == null) {
            this.f62607c = new HashMap();
        }
        View view = (View) this.f62607c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62607c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f62606b.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38531);
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

    static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62608a = new b();

        static {
            Covode.recordClassIndex(38532);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00af  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onCreate(android.os.Bundle):void");
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteVideoAlertActivity f62609a;

        static {
            Covode.recordClassIndex(38533);
        }

        c(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f62609a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (TextUtils.equals(this.f62609a.a(), "from_delete_account")) {
                com.ss.android.ugc.aweme.account.agegate.util.c.c("cancel");
            }
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteVideoAlertActivity f62610a;

        static {
            Covode.recordClassIndex(38534);
        }

        d(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f62610a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!TextUtils.equals(this.f62610a.a(), "from_delete_account")) {
                r.a("export_video_no_confirm", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up").a(StringSet.type, TextUtils.equals(this.f62610a.a(), "from_create_account_password") ? 1 : 0).f62575a);
                q.a(false);
                Intent intent = new Intent(this.f62610a, OperatorCompleteActivity.class);
                intent.putExtra("age_gate_response", this.f62610a.getIntent().getSerializableExtra("age_gate_response"));
                DeleteVideoAlertActivity deleteVideoAlertActivity = this.f62610a;
                com.ss.android.ugc.tiktok.security.a.a.a(intent, deleteVideoAlertActivity);
                deleteVideoAlertActivity.startActivity(intent);
            } else {
                com.ss.android.ugc.aweme.account.agegate.util.c.c("log_out");
                SmartRouter.buildRoute(this.f62610a, "//account/deleted").withParam("age_gate_response", this.f62610a.getIntent().getSerializableExtra("age_gate_response")).open();
            }
            this.f62610a.finish();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1024 && i3 == -1) {
            finish();
        }
        super.onActivityResult(i2, i3, intent);
    }
}
