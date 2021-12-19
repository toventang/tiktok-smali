package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.a.a;
import com.bytedance.ies.android.base.runtime.a.b;
import com.bytedance.ies.android.base.runtime.a.c;
import com.bytedance.ies.android.base.runtime.a.e;

public interface INetworkDepend {
    static {
        Covode.recordClassIndex(18662);
    }

    a requestForStream(e eVar, c cVar);

    b requestForString(e eVar, c cVar);
}
