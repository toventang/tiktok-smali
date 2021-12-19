package com.bytedance.webx.extension.webview.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

public interface TtnetRetrofitApi {
    static {
        Covode.recordClassIndex(28119);
    }

    @h
    @ae
    b<TypedInput> streamRequest(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);
}
