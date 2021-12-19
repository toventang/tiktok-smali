package okhttp3.internal.http1;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.ab;
import k.f;
import k.g;
import k.h;
import k.m;
import k.q;
import k.y;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http1Codec implements HttpCodec {
    final OkHttpClient client;
    private long headerLimit = 262144;
    final g sink;
    final h source;
    int state;
    final StreamAllocation streamAllocation;

    /* renamed from: okhttp3.internal.http1.Http1Codec$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106241);
        }
    }

    static {
        Covode.recordClassIndex(106240);
    }

    /* access modifiers changed from: package-private */
    public abstract class AbstractSource implements aa {
        protected long bytesRead;
        protected boolean closed;
        protected final m timeout;

        static {
            Covode.recordClassIndex(106242);
        }

        @Override // k.aa
        public ab timeout() {
            return this.timeout;
        }

        private AbstractSource() {
            this.timeout = new m(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        /* synthetic */ AbstractSource(Http1Codec http1Codec, AnonymousClass1 r2) {
            this();
        }

        @Override // k.aa
        public long read(f fVar, long j2) {
            try {
                long read = Http1Codec.this.source.read(fVar, j2);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e2) {
                endOfInput(false, e2);
                throw e2;
            }
        }

        /* access modifiers changed from: protected */
        public final void endOfInput(boolean z, IOException iOException) {
            if (Http1Codec.this.state != 6) {
                if (Http1Codec.this.state == 5) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 6;
                    if (Http1Codec.this.streamAllocation != null) {
                        Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class ChunkedSink implements y {
        private boolean closed;
        private final m timeout;

        static {
            Covode.recordClassIndex(106243);
        }

        @Override // k.y
        public final ab timeout() {
            return this.timeout;
        }

        @Override // k.y, java.io.Flushable
        public final synchronized void flush() {
            MethodCollector.i(433);
            if (this.closed) {
                MethodCollector.o(433);
                return;
            }
            Http1Codec.this.sink.flush();
            MethodCollector.o(433);
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.i(439);
            if (this.closed) {
                MethodCollector.o(439);
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.a("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
            MethodCollector.o(439);
        }

        ChunkedSink() {
            this.timeout = new m(Http1Codec.this.sink.timeout());
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                Http1Codec.this.sink.c(j2);
                Http1Codec.this.sink.a("\r\n");
                Http1Codec.this.sink.write(fVar, j2);
                Http1Codec.this.sink.a("\r\n");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class FixedLengthSink implements y {
        private long bytesRemaining;
        private boolean closed;
        private final m timeout;

        static {
            Covode.recordClassIndex(106245);
        }

        @Override // k.y
        public final ab timeout() {
            return this.timeout;
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        FixedLengthSink(long j2) {
            this.timeout = new m(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j2;
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            if (!this.closed) {
                Util.checkOffsetAndCount(fVar.f158864b, 0, j2);
                if (j2 <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(fVar, j2);
                    this.bytesRemaining -= j2;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j2);
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        static {
            Covode.recordClassIndex(106244);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.s();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.p();
                String trim = Http1Codec.this.source.s().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        ChunkedSource(HttpUrl httpUrl) {
            super(Http1Codec.this, null);
            this.url = httpUrl;
        }

        @Override // k.aa, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j3 = this.bytesRemainingInChunk;
                if (j3 == 0 || j3 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(fVar, Math.min(j2, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        static {
            Covode.recordClassIndex(106246);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        FixedLengthSource(long j2) {
            super(Http1Codec.this, null);
            this.bytesRemaining = j2;
            if (j2 == 0) {
                endOfInput(true, null);
            }
        }

        @Override // k.aa, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (!this.closed) {
                long j3 = this.bytesRemaining;
                if (j3 == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j3, j2));
                if (read != -1) {
                    long j4 = this.bytesRemaining - read;
                    this.bytesRemaining = j4;
                    if (j4 == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        static {
            Covode.recordClassIndex(106247);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        UnknownLengthSource() {
            super(Http1Codec.this, null);
        }

        @Override // k.aa, okhttp3.internal.http1.Http1Codec.AbstractSource
        public long read(f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(fVar, j2);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    private String readHeaderLine() {
        String i2 = this.source.i(this.headerLimit);
        this.headerLimit -= (long) i2.length();
        return i2;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    public final y newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public final aa newUnknownLengthSource() {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.state);
    }

    /* access modifiers changed from: package-private */
    public final void detachTimeout(m mVar) {
        ab abVar = mVar.f158879a;
        mVar.a(ab.NONE);
        abVar.clearDeadline();
        abVar.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    public final aa newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public final y newFixedLengthSink(long j2) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j2);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public final aa newFixedLengthSource(long j2) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j2);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, q.a(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, q.a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, q.a(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1, q.a(newUnknownLengthSource()));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.state);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final y createRequestBody(Request request, long j2) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j2 != -1) {
            return newFixedLengthSink(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void writeRequest(Headers headers, String str) {
        if (this.state == 0) {
            this.sink.a(str).a("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.sink.a(headers.name(i2)).a(": ").a(headers.value(i2)).a("\r\n");
            }
            this.sink.a("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, h hVar, g gVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = hVar;
        this.sink = gVar;
    }
}
