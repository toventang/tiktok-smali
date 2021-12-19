package com.ss.android.ugc.aweme.adaptation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.c.a;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.i18n.language.i18n.c;
import com.ss.android.ugc.aweme.setting.bj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import org.greenrobot.eventbus.EventBus;

public class b extends d implements com.ss.android.ugc.aweme.adaptation.analysis.b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f66186a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66187b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f66188c;

    /* renamed from: d  reason: collision with root package name */
    private final String f66189d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f66190e;

    static {
        Covode.recordClassIndex(40693);
    }

    public boolean bu_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean cs_() {
        return true;
    }

    public View d_(int i2) {
        if (this.f66190e == null) {
            this.f66190e = new HashMap();
        }
        View view = (View) this.f66190e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f66190e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public String bt_() {
        return this.f66189d;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        super.onStop();
        this.f66186a = false;
    }

    /* access modifiers changed from: protected */
    public int bv_() {
        return androidx.core.content.b.c(this, R.color.a2);
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        this.f66187b = false;
        super.onResume();
        this.f66186a = true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.analysis.b
    public Analysis f() {
        String bt_ = bt_();
        if (bt_ == null || bt_.length() <= 0) {
            return null;
        }
        return new Analysis().setLabelName(bt_());
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        EventBus a2 = EventBus.a();
        if (bu_() && a2.a(this)) {
            a2.b(this);
        }
        super.onDestroy();
        this.f66188c = true;
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            l.b(window, "");
            window.setStatusBarColor(bv_());
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        a.a(this, bv_());
    }

    public void attachBaseContext(Context context) {
        Context b2 = c.b(context);
        com.google.android.play.core.d.a.a(b2, false);
        super.attachBaseContext(b2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        this.f66187b = true;
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(int i2) {
        super.setContentView(i2);
        if (cs_()) {
            d();
        }
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        if (cs_()) {
            d();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bj.a()) {
            getWindow().addFlags(128);
        }
        e.a("current page: " + getClass().getSimpleName());
        getLifecycle().a(new AnalysisActivityComponent(this, this));
        EventBus a2 = EventBus.a();
        if (!a2.a(this) && bu_()) {
            EventBus.a(a2, this);
        }
    }
}
