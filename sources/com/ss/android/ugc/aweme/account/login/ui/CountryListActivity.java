package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryListActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f64071a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.account.login.model.a> f64072b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.account.login.model.a> f64073c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    EditText f64074d;

    /* renamed from: e  reason: collision with root package name */
    TextView f64075e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f64076f;

    /* renamed from: g  reason: collision with root package name */
    private WaveSideBar f64077g;

    static {
        Covode.recordClassIndex(39497);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.a2, 0);
        com.ss.android.ugc.aweme.account.login.model.a.a(this);
        ArrayList<com.ss.android.ugc.aweme.account.login.model.a> arrayList = new ArrayList(com.ss.android.ugc.aweme.account.login.model.a.f63493h);
        List asList = Arrays.asList("CN", "HK", "MO", "TW");
        com.ss.android.ugc.aweme.account.login.model.a[] aVarArr = new com.ss.android.ugc.aweme.account.login.model.a[asList.size()];
        for (com.ss.android.ugc.aweme.account.login.model.a aVar : arrayList) {
            int indexOf = asList.indexOf(aVar.f63497c);
            if (indexOf >= 0) {
                int i2 = aVar.f63495a;
                String str = aVar.f63496b;
                String str2 = aVar.f63497c;
                String str3 = aVar.f63498d;
                String str4 = aVar.f63499e;
                l.d(str, "");
                l.d(str2, "");
                l.d(str3, "");
                l.d(str4, "");
                com.ss.android.ugc.aweme.account.login.model.a aVar2 = new com.ss.android.ugc.aweme.account.login.model.a(i2, str, str2, str3, str4);
                aVar2.a("#");
                aVarArr[indexOf] = aVar2;
            }
        }
        arrayList.addAll(0, Arrays.asList(aVarArr));
        this.f64073c.addAll(arrayList);
        this.f64072b.addAll(arrayList);
        setContentView(R.layout.fg);
        this.f64074d = (EditText) findViewById(R.id.duo);
        this.f64075e = (TextView) findViewById(R.id.dvn);
        this.f64076f = (ImageView) findViewById(R.id.qb);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dr8);
        this.f64071a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        b bVar = new b(this.f64072b);
        this.f64071a.setAdapter(bVar);
        bVar.f64108a = new c(this);
        WaveSideBar waveSideBar = (WaveSideBar) findViewById(R.id.e46);
        this.f64077g = waveSideBar;
        waveSideBar.setPosition(gb.a() ? 1 : 0);
        this.f64077g.setOnSelectIndexItemListener(new d(this));
        e.a(this, this.f64074d);
        this.f64075e.setOnClickListener(new e(this, bVar));
        this.f64076f.setOnClickListener(new f(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
