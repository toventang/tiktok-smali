package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public interface b extends IInterface {
    static {
        Covode.recordClassIndex(31666);
    }

    int a();

    void a(String str, String str2, Bundle bundle, long j2);
}
