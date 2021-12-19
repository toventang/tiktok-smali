package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.w;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.g;
import k.q;
import okhttp3.RequestBody;

public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public Object extraInfo;
    public final List<b> headers;
    public final int maxLength;
    public final String method;
    public s metrics;
    public final int priorityLevel;
    private int queryFilterPriority;
    public final RequestBody requestBody;
    public final int requestPriorityLevel;
    public final boolean responseStreaming;
    public String serviceType;
    public Map<Class<?>, Object> tags;
    public final String url;

    static {
        Covode.recordClassIndex(26007);
    }

    public final Object getExtraInfo() {
        return this.extraInfo;
    }

    public final List<b> getHeaders() {
        return this.headers;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final String getMethod() {
        return this.method;
    }

    public final s getMetrics() {
        return this.metrics;
    }

    public final int getPriorityLevel() {
        return this.priorityLevel;
    }

    public final int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public final RequestBody getRequestBody() {
        return this.requestBody;
    }

    public final int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public final boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f42458a;

        /* renamed from: b  reason: collision with root package name */
        String f42459b;

        /* renamed from: c  reason: collision with root package name */
        public List<b> f42460c;

        /* renamed from: d  reason: collision with root package name */
        TypedOutput f42461d;

        /* renamed from: e  reason: collision with root package name */
        RequestBody f42462e;

        /* renamed from: f  reason: collision with root package name */
        int f42463f;

        /* renamed from: g  reason: collision with root package name */
        public int f42464g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f42465h;

        /* renamed from: i  reason: collision with root package name */
        public int f42466i;

        /* renamed from: j  reason: collision with root package name */
        boolean f42467j;

        /* renamed from: k  reason: collision with root package name */
        public Object f42468k;

        /* renamed from: l  reason: collision with root package name */
        public String f42469l;

        /* renamed from: m  reason: collision with root package name */
        s f42470m;
        Map<Class<?>, Object> n;

        static {
            Covode.recordClassIndex(26008);
        }

        public a() {
            this.f42458a = "GET";
        }

        public final Request a() {
            if (this.f42459b != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final a a(String str) {
            Objects.requireNonNull(str, "url == null");
            this.f42459b = str;
            return this;
        }

        a(Request request) {
            this.f42458a = request.method;
            this.f42459b = request.url;
            LinkedList linkedList = new LinkedList();
            this.f42460c = linkedList;
            linkedList.addAll(request.headers);
            this.f42461d = request.body;
            this.f42462e = request.requestBody;
            this.f42463f = request.priorityLevel;
            this.f42464g = request.requestPriorityLevel;
            this.f42465h = request.responseStreaming;
            this.f42466i = request.maxLength;
            this.f42467j = request.addCommonParam;
            this.f42468k = request.extraInfo;
            this.f42469l = request.serviceType;
            this.f42470m = request.metrics;
            this.n = request.tags;
        }

        public final <T> a a(Class<? super T> cls, T t) {
            Objects.requireNonNull(cls, "type == null");
            if (this.n == null) {
                this.n = new HashMap();
            }
            if (t == null) {
                this.n.remove(cls);
            } else {
                this.n.put(cls, cls.cast(t));
            }
            return this;
        }

        public final a a(String str, TypedOutput typedOutput) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput;
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (typedOutput != null) {
                    formUrlEncodedTypedOutput = typedOutput;
                    if (!w.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                } else {
                    formUrlEncodedTypedOutput = typedOutput;
                    if (w.a(str)) {
                        FormUrlEncodedTypedOutput formUrlEncodedTypedOutput2 = new FormUrlEncodedTypedOutput();
                        formUrlEncodedTypedOutput2.addField("body", "null");
                        formUrlEncodedTypedOutput = formUrlEncodedTypedOutput2;
                    }
                }
                this.f42458a = str;
                this.f42461d = formUrlEncodedTypedOutput;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public final TypedOutput getBody() {
        RequestBody requestBody2 = this.requestBody;
        if (requestBody2 != null) {
            return new TypedOutput(requestBody2) {
                /* class com.bytedance.retrofit2.w.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ RequestBody f42634a;

                static {
                    Covode.recordClassIndex(26096);
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String fileName() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String md5Stub() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final long length() {
                    try {
                        return this.f42634a.contentLength();
                    } catch (Throwable unused) {
                        return -1;
                    }
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String mimeType() {
                    if (this.f42634a.contentType() != null) {
                        return this.f42634a.contentType().toString();
                    }
                    return "";
                }

                {
                    this.f42634a = r1;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final void writeTo(OutputStream outputStream) {
                    g a2 = q.a(q.a(outputStream));
                    this.f42634a.writeTo(a2);
                    a2.flush();
                    a2.close();
                }
            };
        }
        return this.body;
    }

    public final String getHost() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getHost();
    }

    public final String getPath() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getPath();
    }

    public final void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public final void setMetrics(s sVar) {
        this.metrics = sVar;
    }

    public final void setQueryFilterPriority(int i2) {
        this.queryFilterPriority = i2;
    }

    public final <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }

    private static URI createUriWithOutQuery(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static URI safeCreateUri(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return createUriWithOutQuery(str);
            }
        }
    }

    public final b getFirstHeader(String str) {
        List<b> list;
        if (!(str == null || (list = this.headers) == null)) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f42471a)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public final List<b> headers(String str) {
        List<b> list;
        ArrayList arrayList = null;
        if (!(str == null || (list = this.headers) == null)) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f42471a)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    Request(a aVar) {
        Objects.requireNonNull(aVar.f42459b, "URL must not be null.");
        this.url = aVar.f42459b;
        Objects.requireNonNull(aVar.f42458a, "Method must not be null.");
        this.method = aVar.f42458a;
        if (aVar.f42460c == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(aVar.f42460c));
        }
        this.body = aVar.f42461d;
        this.requestBody = aVar.f42462e;
        this.priorityLevel = aVar.f42463f;
        this.requestPriorityLevel = aVar.f42464g;
        this.responseStreaming = aVar.f42465h;
        this.maxLength = aVar.f42466i;
        this.addCommonParam = aVar.f42467j;
        this.extraInfo = aVar.f42468k;
        this.serviceType = aVar.f42469l;
        this.metrics = aVar.f42470m;
        this.tags = aVar.n;
    }

    public Request(String str, String str2, List<b> list, TypedOutput typedOutput, int i2, boolean z, int i3, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i2, 3, z, i3, z2, obj, "", null);
    }

    public Request(String str, String str2, List<b> list, TypedOutput typedOutput, RequestBody requestBody2, int i2, int i3, boolean z, int i4, boolean z2, Object obj, String str3, Map<Class<?>, Object> map) {
        Objects.requireNonNull(str, "Method must not be null.");
        Objects.requireNonNull(str2, "URL must not be null.");
        this.method = str;
        this.url = str2;
        if (list == null) {
            this.headers = Collections.emptyList();
        } else {
            this.headers = Collections.unmodifiableList(new ArrayList(list));
        }
        this.body = typedOutput;
        this.requestBody = requestBody2;
        this.priorityLevel = i2;
        this.requestPriorityLevel = i3;
        this.responseStreaming = z;
        this.maxLength = i4;
        this.addCommonParam = z2;
        this.extraInfo = obj;
        this.serviceType = str3;
        this.tags = map;
    }
}
