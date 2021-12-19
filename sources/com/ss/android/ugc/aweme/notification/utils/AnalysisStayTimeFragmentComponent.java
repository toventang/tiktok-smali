package com.ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import java.lang.ref.WeakReference;

public class AnalysisStayTimeFragmentComponent implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f113844a = true;

    /* renamed from: b  reason: collision with root package name */
    private long f113845b = -1;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<c> f113846c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f113847d;

    static {
        Covode.recordClassIndex(73211);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    private Analysis b() {
        c cVar;
        WeakReference<c> weakReference = this.f113846c;
        if (weakReference == null || (cVar = weakReference.get()) == null) {
            return null;
        }
        return cVar.F();
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.f113847d.getClass().getSimpleName();
        if (this.f113844a) {
            a();
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.f113847d.getClass().getSimpleName();
        if (this.f113844a) {
            this.f113845b = System.currentTimeMillis();
        }
    }

    private void a() {
        if (this.f113845b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f113845b;
            if (currentTimeMillis > 100 && b() != null && !TextUtils.isEmpty(b().getLabelName())) {
                r.a("stay_time", new d().a("duration", String.valueOf(currentTimeMillis)).a("enter_from", b().getLabelName()).f66730a);
                this.f113847d.getClass().getSimpleName();
            }
            this.f113845b = -1;
        }
    }

    public final void a(boolean z) {
        this.f113847d.getClass().getSimpleName();
        b(!z);
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment) {
        this.f113847d = fragment;
        if (fragment instanceof c) {
            this.f113846c = new WeakReference<>(fragment);
        }
        fragment.getLifecycle().a(this);
    }

    private void b(boolean z) {
        this.f113847d.getClass().getSimpleName();
        this.f113844a = z;
        if (z) {
            this.f113845b = System.currentTimeMillis();
        } else {
            a();
        }
    }
}
