package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public interface bv extends IInterface {
    static {
        Covode.recordClassIndex(31688);
    }

    Bundle a(Bundle bundle);
}
