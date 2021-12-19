package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import k.f;
import k.h;
import k.i;
import okhttp3.internal.Util;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    static {
        Covode.recordClassIndex(106180);
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract h source();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    private Charset charset() {
        MediaType contentType = contentType();
        if (contentType != null) {
            return contentType.charset(Util.UTF_8);
        }
        return Util.UTF_8;
    }

    public final InputStream byteStream() {
        return source().f();
    }

    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final h source;

        static {
            Covode.recordClassIndex(106182);
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public final void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        BomAwareReader(h hVar, Charset charset2) {
            this.source = hVar;
            this.charset = charset2;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) {
            MethodCollector.i(970);
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.f(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                int read = reader.read(cArr, i2, i3);
                MethodCollector.o(970);
                return read;
            }
            IOException iOException = new IOException("Stream closed");
            MethodCollector.o(970);
            throw iOException;
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() {
        h source = source();
        try {
            return source.a(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            h source = source();
            try {
                byte[] u = source.u();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == ((long) u.length)) {
                    return u;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + u.length + ") disagree");
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(contentLength)));
        }
    }

    public static ResponseBody create(MediaType mediaType, i iVar) {
        return create(mediaType, (long) iVar.size(), new f().a(iVar));
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        f fVar = new f();
        l.c(str, "");
        l.c(charset, "");
        f a2 = fVar.a(str, 0, str.length(), charset);
        return create(mediaType, a2.f158864b, a2);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new f().a(bArr));
    }

    public static ResponseBody create(final MediaType mediaType, final long j2, final h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        return new ResponseBody() {
            /* class okhttp3.ResponseBody.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106181);
            }

            @Override // okhttp3.ResponseBody
            public final long contentLength() {
                return j2;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.ResponseBody
            public final h source() {
                return hVar;
            }
        };
    }
}
