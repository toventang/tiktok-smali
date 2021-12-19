package com.ss.android.ugc.aweme.base.component;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.am;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public class AnalysisStayTimeFragmentComponent implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f68046a;

    /* renamed from: b  reason: collision with root package name */
    public a f68047b;

    /* renamed from: c  reason: collision with root package name */
    private long f68048c = -1;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<c> f68049d;

    /* renamed from: e  reason: collision with root package name */
    private Fragment f68050e;

    public interface a {
        static {
            Covode.recordClassIndex(41916);
        }

        am a(am amVar);
    }

    static {
        Covode.recordClassIndex(41914);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public final Analysis a() {
        c cVar;
        WeakReference<c> weakReference = this.f68049d;
        if (weakReference == null || (cVar = weakReference.get()) == null) {
            return null;
        }
        return cVar.F();
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.f68050e.getClass().getSimpleName();
        if (this.f68046a) {
            b();
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.f68050e.getClass().getSimpleName();
        if (this.f68046a) {
            this.f68048c = System.currentTimeMillis();
        }
    }

    private void b() {
        if (this.f68048c != -1) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f68048c;
            if (currentTimeMillis > 100) {
                if (a() != null && !TextUtils.isEmpty(a().getLabelName())) {
                    b.i.b(new Callable<Object>() {
                        /* class com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(41915);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            am amVar = new am();
                            amVar.f109498a = String.valueOf(currentTimeMillis);
                            am a2 = amVar.a(AnalysisStayTimeFragmentComponent.this.a().getLabelName());
                            if (AnalysisStayTimeFragmentComponent.this.f68047b != null) {
                                a2 = AnalysisStayTimeFragmentComponent.this.f68047b.a(a2);
                            }
                            a2.f();
                            return null;
                        }
                    }, r.a());
                }
                this.f68050e.getClass().getSimpleName();
            }
            this.f68048c = -1;
        }
    }

    public final void a(boolean z) {
        this.f68050e.getClass().getSimpleName();
        b(!z);
    }

    public final void b(boolean z) {
        this.f68050e.getClass().getSimpleName();
        this.f68046a = z;
        if (z) {
            this.f68048c = System.currentTimeMillis();
        } else {
            b();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f68046a = z;
        this.f68050e = fragment;
        this.f68049d = new WeakReference<>(fragment);
        fragment.getLifecycle().a(this);
    }
}
