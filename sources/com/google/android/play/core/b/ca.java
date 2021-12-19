package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ca extends IInterface {
    static {
        Covode.recordClassIndex(32836);
    }

    void a(String str, Bundle bundle, Bundle bundle2, cc ccVar);

    void a(String str, Bundle bundle, cc ccVar);

    void a(String str, List<Bundle> list, Bundle bundle, cc ccVar);

    void b(String str, Bundle bundle, Bundle bundle2, cc ccVar);

    void b(String str, Bundle bundle, cc ccVar);

    void c(String str, Bundle bundle, Bundle bundle2, cc ccVar);

    void d(String str, Bundle bundle, Bundle bundle2, cc ccVar);
}
