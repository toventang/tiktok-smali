package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k.aa;
import k.f;
import k.g;
import k.h;
import k.i;
import k.k;
import k.l;
import k.q;
import k.y;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

public final class Cache implements Closeable, Flushable {
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    static {
        Covode.recordClassIndex(106112);
    }

    /* access modifiers changed from: package-private */
    public final class CacheRequestImpl implements CacheRequest {
        private y body;
        private y cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        static {
            Covode.recordClassIndex(106115);
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final y body() {
            return this.body;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            MethodCollector.i(3241);
            synchronized (Cache.this) {
                try {
                    if (!this.done) {
                        this.done = true;
                        Cache.this.writeAbortCount++;
                        Util.closeQuietly(this.cacheOut);
                        try {
                            this.editor.abort();
                            MethodCollector.o(3241);
                        } catch (IOException unused) {
                            MethodCollector.o(3241);
                        }
                    }
                } finally {
                    MethodCollector.o(3241);
                }
            }
        }

        CacheRequestImpl(final DiskLruCache.Editor editor2) {
            this.editor = editor2;
            this.cacheOut = editor2.newSink(1);
            this.body = new k(this.cacheOut, Cache.this) {
                /* class okhttp3.Cache.CacheRequestImpl.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(106116);
                }

                @Override // k.y, java.io.Closeable, k.k, java.lang.AutoCloseable
                public void close() {
                    MethodCollector.i(915);
                    synchronized (Cache.this) {
                        try {
                            if (!CacheRequestImpl.this.done) {
                                CacheRequestImpl.this.done = true;
                                Cache.this.writeSuccessCount++;
                                super.close();
                                editor2.commit();
                                MethodCollector.o(915);
                            }
                        } finally {
                            MethodCollector.o(915);
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public static class CacheResponseBody extends ResponseBody {
        private final h bodySource;
        private final String contentLength;
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        static {
            Covode.recordClassIndex(106117);
        }

        @Override // okhttp3.ResponseBody
        public h source() {
            return this.bodySource;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                String str = this.contentLength;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        CacheResponseBody(final DiskLruCache.Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = q.a(new l(snapshot2.getSource(1)) {
                /* class okhttp3.Cache.CacheResponseBody.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(106118);
                }

                @Override // k.aa, java.io.Closeable, k.l, java.lang.AutoCloseable
                public void close() {
                    snapshot2.close();
                    super.close();
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.cache.flush();
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final long size() {
        return this.cache.size();
    }

    public final Iterator<String> urls() {
        return new Iterator<String>() {
            /* class okhttp3.Cache.AnonymousClass2 */
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            static {
                Covode.recordClassIndex(106114);
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = q.a(next.getSource(0)).s();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            {
                this.delegate = Cache.this.cache.snapshots();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static final class Entry {
        private static final String RECEIVED_MILLIS = (Platform.get().getPrefix() + "-Received-Millis");
        private static final String SENT_MILLIS = (Platform.get().getPrefix() + "-Sent-Millis");
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        static {
            Covode.recordClassIndex(106119);
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private List<Certificate> readCertificateList(h hVar) {
            int readInt = Cache.readInt(hVar);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 < readInt; i2++) {
                    String s = hVar.s();
                    f fVar = new f();
                    fVar.a(i.decodeBase64(s));
                    arrayList.add(instance.generateCertificate(fVar.f()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        Entry(aa aaVar) {
            long j2;
            TlsVersion tlsVersion;
            try {
                h a2 = q.a(aaVar);
                this.url = a2.s();
                this.requestMethod = a2.s();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(a2);
                for (int i2 = 0; i2 < readInt; i2++) {
                    builder.addLenient(a2.s());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(a2.s());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(a2);
                for (int i3 = 0; i3 < readInt2; i3++) {
                    builder2.addLenient(a2.s());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                long j3 = 0;
                if (str2 != null) {
                    j2 = Long.parseLong(str2);
                } else {
                    j2 = 0;
                }
                this.sentRequestMillis = j2;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : j3;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String s = a2.s();
                    if (s.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(a2.s());
                        List<Certificate> readCertificateList = readCertificateList(a2);
                        List<Certificate> readCertificateList2 = readCertificateList(a2);
                        if (!a2.e()) {
                            tlsVersion = TlsVersion.forJavaName(a2.s());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                aaVar.close();
            }
        }

        public final void writeTo(DiskLruCache.Editor editor) {
            g a2 = q.a(editor.newSink(0));
            a2.a(this.url).a(10);
            a2.a(this.requestMethod).a(10);
            a2.b((long) this.varyHeaders.size()).a(10);
            int size = this.varyHeaders.size();
            for (int i2 = 0; i2 < size; i2++) {
                a2.a(this.varyHeaders.name(i2)).a(": ").a(this.varyHeaders.value(i2)).a(10);
            }
            a2.a(new StatusLine(this.protocol, this.code, this.message).toString()).a(10);
            a2.b((long) (this.responseHeaders.size() + 2)).a(10);
            int size2 = this.responseHeaders.size();
            for (int i3 = 0; i3 < size2; i3++) {
                a2.a(this.responseHeaders.name(i3)).a(": ").a(this.responseHeaders.value(i3)).a(10);
            }
            a2.a(SENT_MILLIS).a(": ").b(this.sentRequestMillis).a(10);
            a2.a(RECEIVED_MILLIS).a(": ").b(this.receivedResponseMillis).a(10);
            if (isHttps()) {
                a2.a(10);
                a2.a(this.handshake.cipherSuite().javaName()).a(10);
                writeCertList(a2, this.handshake.peerCertificates());
                writeCertList(a2, this.handshake.localCertificates());
                a2.a(this.handshake.tlsVersion().javaName()).a(10);
            }
            a2.close();
        }

        private void writeCertList(g gVar, List<Certificate> list) {
            try {
                gVar.b((long) list.size()).a(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    gVar.a(i.of(list.get(i2).getEncoded()).base64()).a(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            if (!this.url.equals(request.url().toString()) || !this.requestMethod.equals(request.method()) || !HttpHeaders.varyMatches(response, this.varyHeaders, request)) {
                return false;
            }
            return true;
        }
    }

    public final synchronized int hitCount() {
        int i2;
        MethodCollector.i(201);
        i2 = this.hitCount;
        MethodCollector.o(201);
        return i2;
    }

    public final synchronized int networkCount() {
        int i2;
        MethodCollector.i(200);
        i2 = this.networkCount;
        MethodCollector.o(200);
        return i2;
    }

    public final synchronized int requestCount() {
        int i2;
        MethodCollector.i(202);
        i2 = this.requestCount;
        MethodCollector.o(202);
        return i2;
    }

    public final synchronized int writeAbortCount() {
        int i2;
        MethodCollector.i(196);
        i2 = this.writeAbortCount;
        MethodCollector.o(196);
        return i2;
    }

    public final synchronized int writeSuccessCount() {
        int i2;
        MethodCollector.i(197);
        i2 = this.writeSuccessCount;
        MethodCollector.o(197);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void trackConditionalCacheHit() {
        MethodCollector.i(199);
        this.hitCount++;
        MethodCollector.o(199);
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void remove(Request request) {
        this.cache.remove(key(request.url()));
    }

    public static String key(HttpUrl httpUrl) {
        return i.encodeUtf8(httpUrl.toString()).md5().hex();
    }

    /* access modifiers changed from: package-private */
    public final Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void trackResponse(CacheStrategy cacheStrategy) {
        MethodCollector.i(198);
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
            MethodCollector.o(198);
            return;
        }
        if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
        MethodCollector.o(198);
    }

    static int readInt(h hVar) {
        try {
            long o = hVar.o();
            String s = hVar.s();
            if (o >= 0 && o <= 2147483647L && s.isEmpty()) {
                return (int) o;
            }
            throw new IOException("expected an int but was \"" + o + s + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public Cache(File file, long j2) {
        this(file, j2, FileSystem.SYSTEM);
    }

    /* access modifiers changed from: package-private */
    public final void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            }
        } catch (IOException unused2) {
            editor = null;
            abortQuietly(editor);
        }
    }

    Cache(File file, long j2, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            /* class okhttp3.Cache.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106113);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, 201105, 2, j2);
    }
}
