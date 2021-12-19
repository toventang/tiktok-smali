package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public abstract class Widget implements ag, au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f67006a;

    /* renamed from: b  reason: collision with root package name */
    public Context f67007b;

    /* renamed from: c  reason: collision with root package name */
    protected View f67008c;

    /* renamed from: d  reason: collision with root package name */
    public View f67009d;

    /* renamed from: e  reason: collision with root package name */
    public DataCenter f67010e;

    /* renamed from: f  reason: collision with root package name */
    public a f67011f;

    /* renamed from: g  reason: collision with root package name */
    boolean f67012g;

    /* renamed from: h  reason: collision with root package name */
    private af f67013h;

    protected interface a {
        static {
            Covode.recordClassIndex(41299);
        }

        m a();

        void a(Intent intent, int i2);

        Activity b();
    }

    static {
        Covode.recordClassIndex(41298);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, Intent intent) {
    }

    public void a(View view) {
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 0;
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
    }

    @v(a = i.a.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
    }

    public boolean ae_() {
        return this.f67006a;
    }

    /* access modifiers changed from: protected */
    public m af_() {
        return this.f67011f.a();
    }

    public final Activity d() {
        return this.f67011f.b();
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        if (this.f67013h == null) {
            this.f67013h = new af();
        }
        return this.f67013h;
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.f67006a = true;
        this.f67012g = false;
        a(this.f67009d);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f67006a = false;
        this.f67012g = true;
        af afVar = this.f67013h;
        if (afVar != null) {
            afVar.a();
        }
    }

    public final void a(Intent intent, int i2) {
        this.f67011f.a(intent, i2);
    }
}
