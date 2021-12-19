package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Build;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ax;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

public class MusCountryListActivity extends a {

    /* renamed from: g  reason: collision with root package name */
    public static ax f64078g;

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f64079a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.account.login.model.a> f64080b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.account.login.model.a> f64081c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    EditText f64082d;

    /* renamed from: e  reason: collision with root package name */
    TextView f64083e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f64084f;

    /* renamed from: h  reason: collision with root package name */
    private WaveSideBar f64085h;

    static {
        Covode.recordClassIndex(39498);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.a4);
        ax axVar = f64078g;
        if (axVar != null) {
            axVar.onExit();
        }
    }

    private void a() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.ss.android.ugc.aweme.account.login.model.a> it = this.f64081c.iterator();
        String str = "";
        while (it.hasNext()) {
            String str2 = it.next().f63496b;
            if (!str2.equals(str)) {
                arrayList.add(str2);
                str = str2;
            }
        }
        this.f64085h.setIndexItems((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity.onCreate(android.os.Bundle):void");
    }
}
