package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class fj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final fg f51615a;

    /* renamed from: b  reason: collision with root package name */
    private final zzn f51616b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f51617c;

    static {
        Covode.recordClassIndex(32231);
    }

    fj(fg fgVar, zzn zzn, Bundle bundle) {
        this.f51615a = fgVar;
        this.f51616b = zzn;
        this.f51617c = bundle;
    }

    public final void run() {
        fg fgVar = this.f51615a;
        zzn zzn = this.f51616b;
        fgVar.f51608a.d().a(zzn.f52073a, this.f51617c);
    }
}
