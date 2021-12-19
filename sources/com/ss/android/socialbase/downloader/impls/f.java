package com.ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.g.g;
import com.ss.android.socialbase.downloader.g.h;
import com.ss.android.socialbase.downloader.k.a;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public final class f implements h {
    static {
        Covode.recordClassIndex(37438);
    }

    @Override // com.ss.android.socialbase.downloader.g.h
    public final g a(String str, List<HttpHeader> list) {
        OkHttpClient m2 = c.m();
        if (m2 != null) {
            Request.Builder head = new Request.Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    head.addHeader(httpHeader.f60856a, com.ss.android.socialbase.downloader.k.g.d(httpHeader.f60857b));
                }
            }
            final Call newCall = m2.newCall(head.build());
            final Response execute = newCall.execute();
            if (execute != null) {
                if (a.a(2097152)) {
                    execute.close();
                }
                return new g() {
                    /* class com.ss.android.socialbase.downloader.impls.f.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37439);
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final int a() {
                        return execute.code();
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final void b() {
                        Call call = newCall;
                        if (call != null && !call.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.g.g
                    public final String a(String str) {
                        return execute.header(str);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
