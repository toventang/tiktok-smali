package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import java.util.List;
import k.n;
import k.q;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.Version;

public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    static {
        Covode.recordClassIndex(106226);
    }

    public BridgeInterceptor(CookieJar cookieJar2) {
        this.cookieJar = cookieJar2;
    }

    private String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            Cookie cookie = list.get(i2);
            sb.append(cookie.name()).append('=').append(cookie.value());
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        boolean z = false;
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.hostHeader(request.url(), false));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            z = true;
            newBuilder.header("Accept-Encoding", "gzip");
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header("Cookie", cookieHeader(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent());
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z && "gzip".equalsIgnoreCase(proceed.header("Content-Encoding")) && HttpHeaders.hasBody(proceed)) {
            n nVar = new n(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(proceed.header("Content-Type"), -1, q.a(nVar)));
        }
        return request2.build();
    }
}
