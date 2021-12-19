package com.google.android.gms.common;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class j extends Exception {
    private final Intent mIntent;

    static {
        Covode.recordClassIndex(31439);
    }

    public Intent getIntent() {
        return new Intent(this.mIntent);
    }

    public j(String str, Intent intent) {
        super(str);
        this.mIntent = intent;
    }
}
