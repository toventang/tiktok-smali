package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.emojichoose.m;
import com.ss.android.ugc.aweme.emoji.h.b;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f89454a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(56213);
    }

    public static final int a(m mVar, int i2) {
        l.d(mVar, "");
        f b2 = mVar.b(i2);
        if (b2 instanceof b) {
            return 2;
        }
        if (!(b2 instanceof com.ss.android.ugc.aweme.emoji.d.b)) {
            return 1;
        }
        if (mVar.d(i2) <= 0) {
            return 3;
        }
        return 4;
    }
}
