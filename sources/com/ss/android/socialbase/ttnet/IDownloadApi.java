package com.ss.android.socialbase.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.i;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

public interface IDownloadApi {
    static {
        Covode.recordClassIndex(37573);
    }

    @h
    @ae
    b<TypedInput> get(@a boolean z, @ag String str, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);

    @ae
    @i
    b<Void> head(@a boolean z, @ag String str, @l List<com.bytedance.retrofit2.client.b> list, @d Object obj);
}
