package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

public final class Request {
    final RequestBody body;
    private volatile CacheControl cacheControl;
    final Headers headers;
    final String method;
    final Map<Class<?>, Object> tags;
    final HttpUrl url;

    static {
        Covode.recordClassIndex(106172);
    }

    public final RequestBody body() {
        return this.body;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String method() {
        return this.method;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public static class Builder {
        RequestBody body;
        Headers.Builder headers;
        String method;
        Map<Class<?>, Object> tags;
        HttpUrl url;

        static {
            Covode.recordClassIndex(106173);
        }

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder() {
            this.tags = Collections.emptyMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method(a.f28513c, requestBody);
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "url == null");
            this.url = httpUrl;
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method(a.f28514d, requestBody);
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.isEmpty()) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public Builder url(URL url2) {
            Objects.requireNonNull(url2, "url == null");
            return url(HttpUrl.get(url2.toString()));
        }

        Builder(Request request) {
            Map<Class<?>, Object> linkedHashMap;
            this.tags = Collections.emptyMap();
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            if (request.tags.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(request.tags);
            }
            this.tags = linkedHashMap;
            this.headers = request.headers.newBuilder();
        }

        public Builder url(String str) {
            String str2 = str;
            Objects.requireNonNull(str2, "url == null");
            if (str2.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str2.substring(3);
            } else if (str2.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str2.substring(4);
            }
            return url(HttpUrl.get(str2));
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            Objects.requireNonNull(cls, "type == null");
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                this.tags.put(cls, cls.cast(t));
            }
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (requestBody != null) {
                    if (!HttpMethod.permitsRequestBody(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                } else if (HttpMethod.requiresRequestBody(str)) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
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

    public final String toString() {
        return "Request{method=" + this.method + ", url=" + this.url + ", tags=" + this.tags + '}';
    }

    public final String header(String str) {
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tags = Util.immutableMap(builder.tags);
    }
}
