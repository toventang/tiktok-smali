package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public interface pb extends IInterface {
    static {
        Covode.recordClassIndex(32061);
    }

    void a(Bundle bundle);
}
