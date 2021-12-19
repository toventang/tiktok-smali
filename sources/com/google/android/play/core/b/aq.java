package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface aq extends IInterface {
    static {
        Covode.recordClassIndex(32798);
    }

    void a(String str, int i2, Bundle bundle, as asVar);

    void a(String str, int i2, as asVar);

    void a(String str, List<Bundle> list, Bundle bundle, as asVar);
}
