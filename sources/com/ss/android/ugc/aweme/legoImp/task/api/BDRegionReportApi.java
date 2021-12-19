package com.ss.android.ugc.aweme.legoImp.task.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.c.h.a.q;
import java.util.Map;

public interface BDRegionReportApi {
    static {
        Covode.recordClassIndex(69204);
    }

    @t
    q<String> doPost(@ag String str, @aa Map<String, String> map, @m Map<String, String> map2, @b TypedOutput typedOutput);
}
