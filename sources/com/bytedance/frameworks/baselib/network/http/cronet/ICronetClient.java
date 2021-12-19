package com.bytedance.frameworks.baselib.network.http.cronet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.Executor;

public interface ICronetClient {

    public interface ICronetBootFailureChecker {
        static {
            Covode.recordClassIndex(17006);
        }

        boolean isCronetBootFailureExpected();
    }

    static {
        Covode.recordClassIndex(17005);
    }

    String getCronetVersion();

    void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map);

    boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection);

    HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor);

    void setCronetBootFailureChecker(ICronetBootFailureChecker iCronetBootFailureChecker);

    void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5);
}
