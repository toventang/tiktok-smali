package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.g;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public final class RequestBuilder {
    private static final char[] q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public String f42420a;

    /* renamed from: b  reason: collision with root package name */
    public String f42421b;

    /* renamed from: c  reason: collision with root package name */
    public String f42422c;

    /* renamed from: d  reason: collision with root package name */
    public String f42423d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f42424e;

    /* renamed from: f  reason: collision with root package name */
    final MultipartTypedOutput f42425f;

    /* renamed from: g  reason: collision with root package name */
    public TypedOutput f42426g;

    /* renamed from: h  reason: collision with root package name */
    public int f42427h;

    /* renamed from: i  reason: collision with root package name */
    public String f42428i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f42429j;

    /* renamed from: k  reason: collision with root package name */
    public int f42430k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f42431l;

    /* renamed from: m  reason: collision with root package name */
    public Object f42432m;
    MultipartBody.Builder n;
    public RequestBody o;
    boolean p;
    private final g r;
    private StringBuilder s;
    private String t;
    private final boolean u;
    private final FormUrlEncodedTypedOutput v;
    private int w;
    private Map<Class<?>, Object> x = new LinkedHashMap();

    /* access modifiers changed from: package-private */
    public static class MimeOverridingTypedOutput implements TypedOutput {
        private final TypedOutput delegate;
        private final String mimeType;

        static {
            Covode.recordClassIndex(25949);
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String fileName() {
            return this.delegate.fileName();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public long length() {
            return this.delegate.length();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public String md5Stub() {
            return this.delegate.md5Stub();
        }

        @Override // com.bytedance.retrofit2.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
            this.delegate.writeTo(outputStream);
        }

        MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private final RequestBody f42433a;

        /* renamed from: b  reason: collision with root package name */
        private final String f42434b;

        static {
            Covode.recordClassIndex(25950);
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f42433a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return MediaType.parse(this.f42434b);
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(g gVar) {
            this.f42433a.writeTo(gVar);
        }

        a(RequestBody requestBody, String str) {
            this.f42433a = requestBody;
            this.f42434b = str;
        }
    }

    static {
        Covode.recordClassIndex(25948);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0091 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r1 != null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.client.Request a() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestBuilder.a():com.bytedance.retrofit2.client.Request");
    }

    /* access modifiers changed from: package-private */
    public final void a(Headers headers, RequestBody requestBody) {
        this.n.addPart(headers, requestBody);
    }

    public final <T> void a(Class<? super T> cls, T t2) {
        this.x.put(cls, cls.cast(t2));
    }

    private static StringBuilder b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.t = str2;
        } else {
            List list = this.f42424e;
            if (list == null) {
                list = new ArrayList(2);
                this.f42424e = list;
            }
            list.add(new b(str, str2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        this.v.addField(str, z, str2.toString(), z);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, boolean z) {
        char c2;
        if (str != null) {
            try {
                StringBuilder sb = this.s;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.s = sb;
                }
                if (sb.length() > 0) {
                    c2 = '&';
                } else {
                    c2 = '?';
                }
                sb.append(c2);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 == null || str2.isEmpty()) {
                    sb.append(str);
                } else {
                    sb.append(str).append('=').append(str2);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e2);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    RequestBuilder(String str, g gVar, String str2, List<b> list, String str3, int i2, int i3, boolean z, int i4, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.f42420a = str;
        this.r = gVar;
        this.f42422c = str2;
        this.t = str3;
        this.f42427h = i2;
        this.w = i3;
        this.f42429j = z;
        this.f42430k = i4;
        this.f42431l = z2;
        this.f42432m = obj;
        this.u = z3;
        this.f42424e = list;
        this.f42428i = str4;
        if (z4) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
            this.v = formUrlEncodedTypedOutput;
            this.f42425f = null;
            this.f42426g = formUrlEncodedTypedOutput;
            this.n = null;
        } else if (z5) {
            this.v = null;
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            this.f42425f = multipartTypedOutput;
            this.f42426g = multipartTypedOutput;
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.n = builder;
            builder.setType(MultipartBody.FORM);
        } else {
            this.v = null;
            this.f42425f = null;
            this.n = null;
        }
    }
}
