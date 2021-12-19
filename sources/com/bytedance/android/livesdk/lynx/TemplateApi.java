package com.bytedance.android.livesdk.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.mime.TypedInput;

public interface TemplateApi {
    static {
        Covode.recordClassIndex(11091);
    }

    @h
    b<TypedInput> getTemplate(@ag String str);
}
