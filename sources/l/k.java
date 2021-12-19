package l;

import com.bytedance.covode.number.Covode;
import k.f;
import k.g;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

final class k {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f159292d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    String f159293a;

    /* renamed from: b  reason: collision with root package name */
    MultipartBody.Builder f159294b;

    /* renamed from: c  reason: collision with root package name */
    public RequestBody f159295c;

    /* renamed from: e  reason: collision with root package name */
    private final String f159296e;

    /* renamed from: f  reason: collision with root package name */
    private final HttpUrl f159297f;

    /* renamed from: g  reason: collision with root package name */
    private HttpUrl.Builder f159298g;

    /* renamed from: h  reason: collision with root package name */
    private final Request.Builder f159299h;

    /* renamed from: i  reason: collision with root package name */
    private MediaType f159300i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f159301j;

    /* renamed from: k  reason: collision with root package name */
    private FormBody.Builder f159302k;

    static class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private final RequestBody f159303a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaType f159304b;

        static {
            Covode.recordClassIndex(105796);
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return this.f159304b;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f159303a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(g gVar) {
            this.f159303a.writeTo(gVar);
        }

        a(RequestBody requestBody, MediaType mediaType) {
            this.f159303a = requestBody;
            this.f159304b = mediaType;
        }
    }

    static {
        Covode.recordClassIndex(105795);
    }

    /* access modifiers changed from: package-private */
    public final Request a() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.f159298g;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.f159297f.resolve(this.f159293a);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f159297f + ", Relative: " + this.f159293a);
            }
        }
        a aVar = this.f159295c;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f159302k;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f159294b;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f159301j) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f159300i;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f159299h.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.f159299h.url(resolve).method(this.f159296e, aVar).build();
    }

    /* access modifiers changed from: package-private */
    public final void a(Headers headers, RequestBody requestBody) {
        this.f159294b.addPart(headers, requestBody);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.f159300i = parse;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
        }
        this.f159299h.addHeader(str, str2);
    }

    static String a(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                f fVar = new f();
                fVar.a(str, 0, i2);
                f fVar2 = null;
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.e(codePointAt2);
                            while (!fVar2.e()) {
                                int h2 = fVar2.h() & 255;
                                fVar.a(37);
                                char[] cArr = f159292d;
                                fVar.a((int) cArr[(h2 >> 4) & 15]);
                                fVar.a((int) cArr[h2 & 15]);
                            }
                        } else {
                            fVar.e(codePointAt2);
                        }
                    }
                    i2 += Character.charCount(codePointAt2);
                }
                return fVar.r();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.f159302k.addEncoded(str, str2);
        } else {
            this.f159302k.add(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, boolean z) {
        String str3 = this.f159293a;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f159297f.newBuilder(str3);
            this.f159298g = newBuilder;
            if (newBuilder != null) {
                this.f159293a = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f159297f + ", Relative: " + this.f159293a);
            }
        }
        if (z) {
            this.f159298g.addEncodedQueryParameter(str, str2);
        } else {
            this.f159298g.addQueryParameter(str, str2);
        }
    }

    k(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f159296e = str;
        this.f159297f = httpUrl;
        this.f159293a = str2;
        Request.Builder builder = new Request.Builder();
        this.f159299h = builder;
        this.f159300i = mediaType;
        this.f159301j = z;
        if (headers != null) {
            builder.headers(headers);
        }
        if (z2) {
            this.f159302k = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder2 = new MultipartBody.Builder();
            this.f159294b = builder2;
            builder2.setType(MultipartBody.FORM);
        }
    }
}
