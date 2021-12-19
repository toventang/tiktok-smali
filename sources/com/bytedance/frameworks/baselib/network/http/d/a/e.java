package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;
import okhttp3.Request;
import okhttp3.Response;

public interface e {
    static {
        Covode.recordClassIndex(17076);
    }

    void a(Request request, Exception exc);

    void a(Request request, Response response);
}
