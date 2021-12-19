package com.ss.android.ugc.aweme.share.gif;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f123526a;

    /* renamed from: b  reason: collision with root package name */
    private final int f123527b;

    static {
        Covode.recordClassIndex(81093);
    }

    e(b bVar, int i2) {
        this.f123526a = bVar;
        this.f123527b = i2;
    }

    public final void run() {
        b bVar = this.f123526a;
        int i2 = this.f123527b;
        if (bVar.f123511b != null) {
            bVar.f123511b.setProgress(i2);
        }
    }
}
