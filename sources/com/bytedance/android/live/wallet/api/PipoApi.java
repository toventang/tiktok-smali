package com.bytedance.android.live.wallet.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

public interface PipoApi {
    static {
        Covode.recordClassIndex(7243);
    }

    @h
    b<TypedInput> get(@ag String str);

    @t
    @g
    b<TypedInput> post(@ag String str, @f Map<String, String> map);
}
