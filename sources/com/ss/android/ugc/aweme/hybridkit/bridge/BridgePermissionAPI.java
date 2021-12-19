package com.ss.android.ugc.aweme.hybridkit.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

public interface BridgePermissionAPI {
    static {
        Covode.recordClassIndex(63580);
    }

    @t
    b<String> doPost(@ag String str, @m Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput);
}
