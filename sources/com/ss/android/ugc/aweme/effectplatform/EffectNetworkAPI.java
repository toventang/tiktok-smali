package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

public interface EffectNetworkAPI {
    static {
        Covode.recordClassIndex(55982);
    }

    @h
    @ae
    b<TypedInput> doGet(@a boolean z, @o int i2, @ag String str, @aa(a = true) Map<String, String> map);

    @t
    @ae
    b<TypedInput> doPost(@a boolean z, @o int i2, @ag String str, @com.bytedance.retrofit2.b.b Map<String, Object> map);
}
