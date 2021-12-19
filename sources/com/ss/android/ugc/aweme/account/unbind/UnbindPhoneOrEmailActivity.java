package com.ss.android.ugc.aweme.account.unbind;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.b;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.i;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class UnbindPhoneOrEmailActivity extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f65440a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f65441b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private HashMap f65442c;

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f65442c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f65442c == null) {
            this.f65442c = new HashMap();
        }
        View view = (View) this.f65442c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65442c.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40229);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(40228);
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        k a2 = k.a.a(bundle2.getInt("next_page", k.UNBIND_PHONE_CONFIRM.getValue()));
        bundle2.remove("next_page");
        bundle2.putInt("current_page", a2.getValue());
        b.a(this, i.a(a2), bundle2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle == null) {
            ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a.postValue(a(getIntent()));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        boolean z;
        Integer num;
        String string;
        String str;
        if (bundle != null) {
            z = bundle.getBoolean("unbind_success");
            num = Integer.valueOf(bundle.getInt("unbind_type"));
        } else {
            z = false;
            num = null;
        }
        if (z) {
            int value = j.UNBIND_PHONE.getValue();
            if (num != null && num.intValue() == value) {
                string = getString(R.string.dpo);
            } else {
                int value2 = j.UNBIND_EMAIL.getValue();
                if (num != null && num.intValue() == value2) {
                    string = getString(R.string.bmj);
                } else {
                    string = "";
                }
            }
        } else {
            string = getString(R.string.h4m);
        }
        l.b(string, "");
        if (!TextUtils.isEmpty(string)) {
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this);
            if (z) {
                bVar.b(R.raw.icon_tick_fill_small);
                bVar.d(R.attr.ax);
            }
            bVar.a(string);
            bVar.a();
            bVar.b();
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            aVar.a("enter_from", e());
            int value3 = j.UNBIND_PHONE.getValue();
            if (num != null && num.intValue() == value3) {
                str = "phone";
            } else {
                str = "email";
            }
            aVar.a("unlink_type", str);
            r.a("show_unlink_phone_email_success_banner", aVar.f62575a);
        }
        finish();
    }
}
