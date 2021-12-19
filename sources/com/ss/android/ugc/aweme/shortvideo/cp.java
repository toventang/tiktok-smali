package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

public final class cp {

    /* renamed from: a  reason: collision with root package name */
    private int f125285a = -1;

    static {
        Covode.recordClassIndex(82266);
    }

    public final int a(int i2, int i3) {
        int i4 = 98;
        if (i2 == 0) {
            i4 = Math.min((int) (((float) i3) * 0.59f), 59);
        } else if (i2 == 2) {
            i4 = 60;
        } else if (i2 == 1) {
            i4 = Math.min((int) ((((float) i3) * 0.37f) + 61.0f), 98);
        } else if (i2 != 4) {
            if (i2 == 3) {
                i4 = 99;
            } else {
                i4 = 100;
            }
        }
        if (i4 < this.f125285a) {
            q.b("Error publish progress. step:" + i2 + " sdkProgress:" + i3 + " calculateProgress:" + i4 + " lastProgress" + this.f125285a);
            i4 = this.f125285a;
        }
        this.f125285a = i4;
        return i4;
    }
}
