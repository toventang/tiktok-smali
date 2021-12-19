package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class fl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzw f51622a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fg f51623b;

    static {
        Covode.recordClassIndex(32233);
    }

    public final void run() {
        this.f51623b.f51608a.k();
        if (this.f51622a.f52088c.a() == null) {
            jo joVar = this.f51623b.f51608a;
            zzw zzw = this.f51622a;
            zzn a2 = joVar.a(zzw.f52086a);
            if (a2 != null) {
                joVar.b(zzw, a2);
                return;
            }
            return;
        }
        jo joVar2 = this.f51623b.f51608a;
        zzw zzw2 = this.f51622a;
        zzn a3 = joVar2.a(zzw2.f52086a);
        if (a3 != null) {
            joVar2.a(zzw2, a3);
        }
    }

    fl(fg fgVar, zzw zzw) {
        this.f51623b = fgVar;
        this.f51622a = zzw;
    }
}
