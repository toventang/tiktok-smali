package com.ss.android.ugc.aweme.adaptation.analysis;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import java.lang.ref.WeakReference;

public class AnalysisActivityComponent implements f {

    /* renamed from: a  reason: collision with root package name */
    Context f66180a;

    /* renamed from: b  reason: collision with root package name */
    private long f66181b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<b> f66182c;

    static {
        Covode.recordClassIndex(40689);
    }

    private Analysis a() {
        b bVar;
        WeakReference<b> weakReference = this.f66182c;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return null;
        }
        return bVar.f();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f66183a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 40690(0x9ef2, float:5.7019E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.AnonymousClass1.f66183a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.AnonymousClass1.f66183a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(long j2) {
        Analysis a2 = a();
        if (a2 == null || TextUtils.isEmpty(a2.getLabelName())) {
            return null;
        }
        b a3 = new b().a("enter_from", a2.getLabelName()).a("duration", j2);
        if (a2.getExtraMap() != null && !a2.getExtraMap().isEmpty()) {
            a3.a(a2.getExtraMap());
        }
        r.a("stay_time", a3.f149193a);
        return null;
    }

    public AnalysisActivityComponent(Context context, b bVar) {
        this.f66180a = context;
        this.f66182c = new WeakReference<>(bVar);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        int i2 = AnonymousClass1.f66183a[aVar.ordinal()];
        if (i2 == 1) {
            this.f66181b = System.currentTimeMillis();
        } else if (i2 == 2 && this.f66181b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f66181b;
            if (a() != null && currentTimeMillis > a().getMinValidStayDuration()) {
                b.i.b(new a(this, currentTimeMillis), r.a());
            }
            this.f66181b = -1;
        }
    }
}
