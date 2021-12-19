package com.ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class DeleteAccountAlertActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62597b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    AgeGateResponse f62598a;

    /* renamed from: c  reason: collision with root package name */
    private final h f62599c = i.a((h.f.a.a) new d(this));

    /* renamed from: d  reason: collision with root package name */
    private HashMap f62600d;

    static {
        Covode.recordClassIndex(38525);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62600d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62600d == null) {
            this.f62600d = new HashMap();
        }
        View view = (View) this.f62600d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62600d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38526);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.view.a> {
        final /* synthetic */ DeleteAccountAlertActivity this$0;

        static {
            Covode.recordClassIndex(38529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            super(0);
            this.this$0 = deleteAccountAlertActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.view.a invoke() {
            DeleteAccountAlertActivity deleteAccountAlertActivity = this.this$0;
            return new com.ss.android.ugc.aweme.account.view.a(deleteAccountAlertActivity, deleteAccountAlertActivity.getString(R.string.a4g));
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

    private final SpannableStringBuilder a() {
        String string = getString(R.string.bf1);
        l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.bf0, new Object[]{string}));
        List<Object> b2 = n.b(new b(this, spannableStringBuilder, string), new ForegroundColorSpan(androidx.core.content.b.c(this, R.color.bx)), new StyleSpan(1));
        int a2 = p.a((CharSequence) spannableStringBuilder, string, 0, false, 6);
        int length = string.length() + a2;
        List b3 = n.b(Integer.valueOf(a2), Integer.valueOf(length));
        if (!(b3 instanceof Collection) || !b3.isEmpty()) {
            Iterator it = b3.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        for (Object obj : b2) {
            spannableStringBuilder.setSpan(obj, a2, length, 18);
        }
        return spannableStringBuilder;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteAccountAlertActivity f62601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f62602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f62603c;

        static {
            Covode.recordClassIndex(38527);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f62601a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/download-your-data?enter_from=banned&hide_nav_bar=1&banned=1").withParam("hide_nav_bar", true).open();
        }

        b(DeleteAccountAlertActivity deleteAccountAlertActivity, SpannableStringBuilder spannableStringBuilder, String str) {
            this.f62601a = deleteAccountAlertActivity;
            this.f62602b = spannableStringBuilder;
            this.f62603c = str;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteAccountAlertActivity f62604a;

        static {
            Covode.recordClassIndex(38528);
        }

        c(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            this.f62604a = deleteAccountAlertActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("age_gate_click_next", new com.ss.android.ugc.aweme.account.a.b.a().f62575a);
            DeleteAccountAlertActivity deleteAccountAlertActivity = this.f62604a;
            SmartRouter.buildRoute(deleteAccountAlertActivity, "//account/video/deleted/alert").withParam("age_gate_response", deleteAccountAlertActivity.f62598a).withParam("enter_from", "from_delete_account").open();
            deleteAccountAlertActivity.finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Object obj;
        int i2;
        Bundle a2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fi);
        Intent intent = getIntent();
        if (intent == null || (a2 = a(intent)) == null) {
            obj = null;
        } else {
            obj = a(a2, "age_gate_response");
        }
        this.f62598a = (AgeGateResponse) obj;
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.adh);
        l.b(tuxTextView, "");
        String string = getString(R.string.a65);
        l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.a64, new Object[]{string}));
        int a3 = p.a((CharSequence) spannableStringBuilder, string, 0, false, 6);
        int length = string.length() + a3;
        if (!(a3 == -1 || length == -1)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(this, R.color.bx)), a3, length, 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), a3, length, 18);
        }
        tuxTextView.setText(spannableStringBuilder);
        ((TuxTextView) _$_findCachedViewById(R.id.button)).setOnClickListener(new c(this));
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.apa);
        tuxTextView2.setText(a());
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        User f2 = cj.f();
        l.b(f2, "");
        if ((new Date().getTime() - f2.getAgeGateTime()) / 86400000 <= 20) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView2.setVisibility(i2);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", false);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
