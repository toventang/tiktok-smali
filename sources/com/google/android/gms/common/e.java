package com.google.android.gms.common;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class e extends j {
    private final int zzas;

    static {
        Covode.recordClassIndex(31355);
    }

    public final int getConnectionStatusCode() {
        return this.zzas;
    }

    public e(int i2, String str, Intent intent) {
        super(str, intent);
        this.zzas = i2;
    }
}
