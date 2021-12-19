package com.ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.i18n.musically.cut.n;

final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final n f99903a;

    /* renamed from: b  reason: collision with root package name */
    private final n.b f99904b;

    /* renamed from: c  reason: collision with root package name */
    private final int f99905c;

    static {
        Covode.recordClassIndex(63679);
    }

    p(n nVar, n.b bVar, int i2) {
        this.f99903a = nVar;
        this.f99904b = bVar;
        this.f99905c = i2;
    }

    public final void run() {
        n nVar = this.f99903a;
        n.b bVar = this.f99904b;
        int i2 = this.f99905c;
        bVar.f99898f.setVisibility(4);
        bVar.f99898f.setAlpha(1.0f);
        nVar.notifyItemChanged(i2);
        nVar.f99877a = false;
    }
}
