package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.f;
import k.i;
import k.l;
import k.q;
import k.y;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http2Codec implements HttpCodec {
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final Interceptor.Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private Http2Stream stream;
    final StreamAllocation streamAllocation;

    class StreamFinishingSource extends l {
        long bytesRead;
        boolean completed;

        static {
            Covode.recordClassIndex(106257);
        }

        @Override // k.aa, java.io.Closeable, k.l, java.lang.AutoCloseable
        public void close() {
            super.close();
            endOfInput(null);
        }

        private void endOfInput(IOException iOException) {
            if (!this.completed) {
                this.completed = true;
                Http2Codec.this.streamAllocation.streamFinished(false, Http2Codec.this, this.bytesRead, iOException);
            }
        }

        StreamFinishingSource(aa aaVar) {
            super(aaVar);
        }

        @Override // k.aa, k.l
        public long read(f fVar, long j2) {
            try {
                long read = this.delegate.read(fVar, j2);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e2) {
                endOfInput(e2);
                throw e2;
            }
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void flushRequest() {
        this.connection.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void cancel() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void finishRequest() {
        this.stream.getSink().close();
    }

    static {
        Covode.recordClassIndex(106256);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (!z || Internal.instance.code(readHttp2HeadersList) != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) {
        this.streamAllocation.eventListener.responseBodyStart(this.streamAllocation.call);
        return new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), q.a(new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) {
        boolean z;
        if (this.stream == null) {
            if (request.body() != null) {
                z = true;
            } else {
                z = false;
            }
            Http2Stream newStream = this.connection.newStream(http2HeadersList(request), z);
            this.stream = newStream;
            newStream.readTimeout().timeout((long) this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.stream.writeTimeout().timeout((long) this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            i encodeUtf8 = i.encodeUtf8(headers.name(i2).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(encodeUtf8.utf8())) {
                arrayList.add(new Header(encodeUtf8, headers.value(i2)));
            }
        }
        return arrayList;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public final y createRequestBody(Request request, long j2) {
        return this.stream.getSink();
    }

    public static Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i2 = 0; i2 < size; i2++) {
            String name = headers.name(i2);
            String value = headers.value(i2);
            if (name.equals(":status")) {
                statusLine = StatusLine.parse("HTTP/1.1 ".concat(String.valueOf(value)));
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        if (statusLine != null) {
            return new Response.Builder().protocol(protocol2).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain2, StreamAllocation streamAllocation2, Http2Connection http2Connection) {
        Protocol protocol2;
        this.chain = chain2;
        this.streamAllocation = streamAllocation2;
        this.connection = http2Connection;
        if (okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol2 = Protocol.HTTP_2;
        }
        this.protocol = protocol2;
    }
}
