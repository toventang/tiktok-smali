package com.ss.android.common.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;

public interface INetWorkInject {
    static {
        Covode.recordClassIndex(36655);
    }

    Context a();

    NetworkUtils.b b();

    String c();
}
