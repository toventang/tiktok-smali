package com.bytedance.ies.ugc.appcontext;

import com.bytedance.covode.number.Covode;

public interface AppBuildConfig {
    static {
        Covode.recordClassIndex(20738);
    }

    String a();

    String b();

    String c();
}
