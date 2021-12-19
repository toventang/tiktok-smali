package com.bytedance.ies.powerlist;

import android.app.Application;
import com.bytedance.covode.number.Covode;

public interface IPowerContext {
    static {
        Covode.recordClassIndex(20441);
    }

    Application getApplication();
}
