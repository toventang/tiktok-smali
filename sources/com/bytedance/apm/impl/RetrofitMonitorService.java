package com.bytedance.apm.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface RetrofitMonitorService {
    static {
        Covode.recordClassIndex(14610);
    }

    @h
    b<TypedInput> fetch(@ag String str, @aa Map<String, String> map, @a boolean z);

    @t
    b<TypedInput> report(@ag String str, @com.bytedance.retrofit2.b.b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @a boolean z);
}
