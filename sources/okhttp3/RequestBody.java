package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Objects;
import k.aa;
import k.g;
import k.i;
import k.q;
import okhttp3.internal.Util;

public abstract class RequestBody {
    static {
        Covode.recordClassIndex(106174);
    }

    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(g gVar);

    public static RequestBody create(final MediaType mediaType, final i iVar) {
        return new RequestBody() {
            /* class okhttp3.RequestBody.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106175);
            }

            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final long contentLength() {
                return (long) iVar.size();
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(g gVar) {
                gVar.a(iVar);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        Objects.requireNonNull(file, "file == null");
        return new RequestBody() {
            /* class okhttp3.RequestBody.AnonymousClass3 */

            static {
                Covode.recordClassIndex(106177);
            }

            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final long contentLength() {
                return file.length();
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(g gVar) {
                aa aaVar = null;
                try {
                    aaVar = q.c(file);
                    gVar.a(aaVar);
                } finally {
                    Util.closeQuietly(aaVar);
                }
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i2, final int i3) {
        Objects.requireNonNull(bArr, "content == null");
        Util.checkOffsetAndCount((long) bArr.length, (long) i2, (long) i3);
        return new RequestBody() {
            /* class okhttp3.RequestBody.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106176);
            }

            @Override // okhttp3.RequestBody
            public final long contentLength() {
                return (long) i3;
            }

            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(g gVar) {
                gVar.a(bArr, i2, i3);
            }
        };
    }
}
