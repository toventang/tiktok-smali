package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.common.r;
import java.lang.ref.WeakReference;

public class AnalysisActivityComponent implements f {

    /* renamed from: a  reason: collision with root package name */
    public long f68042a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<c> f68043b;

    /* renamed from: c  reason: collision with root package name */
    Activity f68044c;

    static {
        Covode.recordClassIndex(41912);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68045a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 41913(0xa3b9, float:5.8733E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent.AnonymousClass1.f68045a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent.AnonymousClass1.f68045a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent.AnonymousClass1.<clinit>():void");
        }
    }

    public final void a() {
        if (this.f68042a != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f68042a;
            if (currentTimeMillis > 0) {
                i.b(new a(this, currentTimeMillis), r.a());
            }
            this.f68042a = -1;
        }
    }

    public AnalysisActivityComponent(Activity activity) {
        this.f68044c = activity;
        if (activity instanceof c) {
            this.f68043b = new WeakReference<>(activity);
        }
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        int i2 = AnonymousClass1.f68045a[aVar.ordinal()];
        if (i2 == 1) {
            this.f68042a = System.currentTimeMillis();
        } else if (i2 == 2) {
            a();
        }
    }
}
