package com.ss.android.ugc.aweme.feed.e;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;

public class d {

    /* renamed from: b  reason: collision with root package name */
    protected Activity f92897b;

    /* renamed from: c  reason: collision with root package name */
    protected Fragment f92898c;

    /* renamed from: d  reason: collision with root package name */
    public String f92899d;

    /* renamed from: e  reason: collision with root package name */
    public int f92900e;

    /* renamed from: f  reason: collision with root package name */
    protected String f92901f;

    /* renamed from: g  reason: collision with root package name */
    public String f92902g = "click";

    /* renamed from: h  reason: collision with root package name */
    public boolean f92903h;

    /* renamed from: i  reason: collision with root package name */
    public String f92904i;

    /* renamed from: j  reason: collision with root package name */
    public String f92905j;

    static {
        Covode.recordClassIndex(58932);
    }

    public void b() {
        this.f92897b = null;
    }

    public Activity c() {
        return this.f92897b;
    }

    public Context d() {
        return this.f92897b;
    }

    public Fragment e() {
        return this.f92898c;
    }

    public String f() {
        return this.f92901f;
    }

    public String j() {
        return this.f92899d;
    }

    public final boolean h() {
        b bVar = (b) e();
        if (bVar != null) {
            return bVar.ab_();
        }
        Activity activity = this.f92897b;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final i i() {
        Fragment e2 = e();
        if (e2 != null) {
            return e2.getChildFragmentManager();
        }
        Activity activity = this.f92897b;
        if (activity instanceof e) {
            return ((e) activity).getSupportFragmentManager();
        }
        return null;
    }

    public void b(String str) {
        this.f92901f = str;
    }

    public void a(Activity activity, Fragment fragment) {
        this.f92897b = activity;
        this.f92898c = fragment;
    }

    public d(String str, int i2) {
        this.f92899d = str;
        this.f92900e = i2;
    }
}
