package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

final class fr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzao f51641a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f51642b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fg f51643c;

    static {
        Covode.recordClassIndex(32239);
    }

    public final void run() {
        fg fgVar = this.f51643c;
        zzao zzao = this.f51641a;
        zzn zzn = this.f51642b;
        if (!(!"_cmp".equals(zzao.f52061a) || zzao.f52062b == null || zzao.f52062b.f52060a.size() == 0)) {
            String d2 = zzao.f52062b.d("_cis");
            if (!TextUtils.isEmpty(d2) && (("referrer broadcast".equals(d2) || "referrer API".equals(d2)) && fgVar.f51608a.f51940b.f51600e.d(zzn.f52073a, p.S))) {
                fgVar.f51608a.q().f51474i.a("Event has been filtered ", zzao.toString());
                zzao = new zzao("_cmpx", zzao.f52062b, zzao.f52063c, zzao.f52064d);
            }
        }
        this.f51643c.f51608a.k();
        this.f51643c.f51608a.a(zzao, this.f51642b);
    }

    fr(fg fgVar, zzao zzao, zzn zzn) {
        this.f51643c = fgVar;
        this.f51641a = zzao;
        this.f51642b = zzn;
    }
}
