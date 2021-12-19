package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.RecordInvoker;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements RecordInvoker.OnCherEffectParmaCallback {

    /* renamed from: a  reason: collision with root package name */
    private final u f130187a;

    static {
        Covode.recordClassIndex(85397);
    }

    y(u uVar) {
        this.f130187a = uVar;
    }

    @Override // com.ss.android.medialib.RecordInvoker.OnCherEffectParmaCallback
    public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f130187a.b(strArr, dArr, zArr);
    }
}
