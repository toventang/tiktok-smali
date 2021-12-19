package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import k.f;
import k.h;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;

public final class Response implements Closeable {
    final ResponseBody body;
    private volatile CacheControl cacheControl;
    final Response cacheResponse;
    final int code;
    final Handshake handshake;
    final Headers headers;
    final String message;
    final Response networkResponse;
    final Response priorResponse;
    final Protocol protocol;
    final long receivedResponseAtMillis;
    final Request request;
    final long sentRequestAtMillis;

    static {
        Covode.recordClassIndex(106178);
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public static class Builder {
        ResponseBody body;
        Response cacheResponse;
        int code;
        Handshake handshake;
        Headers.Builder headers;
        String message;
        Response networkResponse;
        Response priorResponse;
        Protocol protocol;
        long receivedResponseAtMillis;
        Request request;
        long sentRequestAtMillis;

        static {
            Covode.recordClassIndex(106179);
        }

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Response build() {
            if (this.request == null) {
                throw new IllegalStateException("request == null");
            } else if (this.protocol == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.code < 0) {
                throw new IllegalStateException("code < 0: " + this.code);
            } else if (this.message != null) {
                return new Response(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Builder code(int i2) {
            this.code = i2;
            return this;
        }

        public Builder handshake(Handshake handshake2) {
            this.handshake = handshake2;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder receivedResponseAtMillis(long j2) {
            this.receivedResponseAtMillis = j2;
            return this;
        }

        public Builder request(Request request2) {
            this.request = request2;
            return this;
        }

        public Builder sentRequestAtMillis(long j2) {
            this.sentRequestAtMillis = j2;
            return this;
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        private void checkPriorResponse(Response response) {
            if (response.body != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        Builder(Response response) {
            this.code = -1;
            this.request = response.request;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.handshake = response.handshake;
            this.headers = response.headers.newBuilder();
            this.body = response.body;
            this.networkResponse = response.networkResponse;
            this.cacheResponse = response.cacheResponse;
            this.priorResponse = response.priorResponse;
            this.sentRequestAtMillis = response.sentRequestAtMillis;
            this.receivedResponseAtMillis = response.receivedResponseAtMillis;
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.body != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (response.networkResponse != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (response.cacheResponse != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (response.priorResponse != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl2 = this.cacheControl;
        if (cacheControl2 != null) {
            return cacheControl2;
        }
        CacheControl parse = CacheControl.parse(this.headers);
        this.cacheControl = parse;
        return parse;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final boolean isSuccessful() {
        int i2 = this.code;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    public final List<Challenge> challenges() {
        String str;
        int i2 = this.code;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers(), str);
    }

    public final boolean isRedirect() {
        int i2 = this.code;
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final String header(String str) {
        return header(str, null);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
        this.sentRequestAtMillis = builder.sentRequestAtMillis;
        this.receivedResponseAtMillis = builder.receivedResponseAtMillis;
    }

    public final ResponseBody peekBody(long j2) {
        h source = this.body.source();
        source.e(j2);
        f w = source.a().clone();
        if (w.f158864b > j2) {
            f fVar = new f();
            fVar.write(w, j2);
            w.v();
            w = fVar;
        }
        return ResponseBody.create(this.body.contentType(), w.f158864b, w);
    }

    public final String header(String str, String str2) {
        String str3 = this.headers.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }
}
