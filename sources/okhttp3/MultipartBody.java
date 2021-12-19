package okhttp3;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k.f;
import k.g;
import k.i;
import okhttp3.Headers;
import okhttp3.internal.Util;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {e.f153515b, 10};
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    private final i boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;

    public static final class Part {
        final RequestBody body;
        final Headers headers;

        static {
            Covode.recordClassIndex(106162);
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part create(Headers headers2, RequestBody requestBody) {
            Objects.requireNonNull(requestBody, "body == null");
            if (headers2 != null) {
                if (headers2.get("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                } else if (headers2.get("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
            }
            return new Part(headers2, requestBody);
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            Objects.requireNonNull(str, "name == null");
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
        }
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final MediaType type() {
        return this.originalType;
    }

    public final String boundary() {
        return this.boundary.utf8();
    }

    public final int size() {
        return this.parts.size();
    }

    public static final class Builder {
        private final i boundary;
        private final List<Part> parts;
        private MediaType type;

        static {
            Covode.recordClassIndex(106161);
        }

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = i.encodeUtf8(str);
        }

        public final Builder addPart(Part part) {
            Objects.requireNonNull(part, "part == null");
            this.parts.add(part);
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public final Builder setType(MediaType mediaType) {
            Objects.requireNonNull(mediaType, "type == null");
            if (mediaType.type().equals("multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException("multipart != ".concat(String.valueOf(mediaType)));
        }

        public final Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        long j2 = this.contentLength;
        if (j2 != -1) {
            return j2;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    static {
        Covode.recordClassIndex(106160);
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(g gVar) {
        writeOrCountBytes(gVar, false);
    }

    public final Part part(int i2) {
        return this.parts.get(i2);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: k.f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: k.f */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: k.f */
    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(g gVar, boolean z) {
        f fVar;
        if (z) {
            gVar = new f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.parts.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Part part = this.parts.get(i2);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            gVar.a(DASHDASH);
            gVar.a(this.boundary);
            gVar.a(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gVar.a(headers.name(i3)).a(COLONSPACE).a(headers.value(i3)).a(CRLF);
                }
            }
            MediaType contentType2 = requestBody.contentType();
            if (contentType2 != null) {
                gVar.a("Content-Type: ").a(contentType2.toString()).a(CRLF);
            }
            long contentLength2 = requestBody.contentLength();
            if (contentLength2 != -1) {
                gVar.a("Content-Length: ").b(contentLength2).a(CRLF);
            } else if (z) {
                fVar.v();
                return -1;
            }
            byte[] bArr = CRLF;
            gVar.a(bArr);
            if (z) {
                j2 += contentLength2;
            } else {
                requestBody.writeTo(gVar);
            }
            gVar.a(bArr);
        }
        byte[] bArr2 = DASHDASH;
        gVar.a(bArr2);
        gVar.a(this.boundary);
        gVar.a(bArr2);
        gVar.a(CRLF);
        if (!z) {
            return j2;
        }
        long j3 = j2 + fVar.f158864b;
        fVar.v();
        return j3;
    }

    MultipartBody(i iVar, MediaType mediaType, List<Part> list) {
        this.boundary = iVar;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + iVar.utf8());
        this.parts = Util.immutableList(list);
    }
}
