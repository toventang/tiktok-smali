package com.bytedance.frameworks.baselib.network.http.cronet.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import java.io.IOException;

public final class c extends IOException {
    private a requestInfo;
    private int statusCode;
    private String traceCode;

    static {
        Covode.recordClassIndex(17018);
    }

    public final a getRequestInfo() {
        return this.requestInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getTraceCode() {
        return this.traceCode;
    }

    public final String getRequestLog() {
        return this.requestInfo.y;
    }

    public c(Exception exc, a aVar, String str) {
        super(exc.getMessage(), exc.getCause());
        this.requestInfo = aVar;
        this.traceCode = str;
        if (exc instanceof com.bytedance.frameworks.baselib.network.http.b.c) {
            this.statusCode = ((com.bytedance.frameworks.baselib.network.http.b.c) exc).getStatusCode();
        }
    }
}
