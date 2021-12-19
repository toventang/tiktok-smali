package com.bytedance.android.live.wallet.f.b;

import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.a;
import java.util.List;

public interface b extends c, a {
    static {
        Covode.recordClassIndex(7305);
    }

    void a(DiamondPackageExtra diamondPackageExtra, List<c> list);

    void a(Exception exc, int i2);

    void l();

    void m();
}
