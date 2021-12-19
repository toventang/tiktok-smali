package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;

final /* synthetic */ class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f54477a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f54478b;

    static {
        Covode.recordClassIndex(33812);
    }

    p(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f54477a = z;
        this.f54478b = pendingResult;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        int i2;
        try {
            boolean z = this.f54477a;
            BroadcastReceiver.PendingResult pendingResult = this.f54478b;
            if (z) {
                if (hVar.b()) {
                    i2 = ((Integer) hVar.d()).intValue();
                } else {
                    i2 = 500;
                }
                pendingResult.setResultCode(i2);
            }
            pendingResult.finish();
        } catch (Throwable unused) {
            getClass().getName();
        }
    }
}
