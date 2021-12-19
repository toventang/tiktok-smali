package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class bw extends bs implements bx {
    static {
        Covode.recordClassIndex(32831);
    }

    public bw() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.b.bs
    public final boolean a(int i2, Parcel parcel) {
        if (i2 == 2) {
            a((Bundle) bt.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            b((Bundle) bt.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
