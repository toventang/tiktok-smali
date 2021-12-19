package l;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.util.Objects;
import k.f;
import k.l;
import k.q;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

final class h<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final n<T, ?> f159251a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f159252b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f159253c;

    /* renamed from: d  reason: collision with root package name */
    private Call f159254d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f159255e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f159256f;

    static {
        Covode.recordClassIndex(105770);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final MediaType f159262a;

        /* renamed from: b  reason: collision with root package name */
        private final long f159263b;

        static {
            Covode.recordClassIndex(105774);
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f159263b;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f159262a;
        }

        @Override // okhttp3.ResponseBody
        public final k.h source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        b(MediaType mediaType, long j2) {
            this.f159262a = mediaType;
            this.f159263b = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        IOException f159259a;

        /* renamed from: b  reason: collision with root package name */
        private final ResponseBody f159260b;

        static {
            Covode.recordClassIndex(105772);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, okhttp3.ResponseBody
        public final void close() {
            this.f159260b.close();
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f159260b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f159260b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final k.h source() {
            return q.a(new l(this.f159260b.source()) {
                /* class l.h.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(105773);
                }

                @Override // k.aa, k.l
                public final long read(f fVar, long j2) {
                    try {
                        return super.read(fVar, j2);
                    } catch (IOException e2) {
                        a.this.f159259a = e2;
                        throw e2;
                    }
                }
            });
        }

        a(ResponseBody responseBody) {
            this.f159260b = responseBody;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public h<T> clone() {
        return new h<>(this.f159251a, this.f159252b);
    }

    private Call f() {
        Call newCall = this.f159251a.f159327c.newCall(this.f159251a.a(this.f159252b));
        Objects.requireNonNull(newCall, "Call.Factory returned null.");
        return newCall;
    }

    @Override // l.b
    public final boolean b() {
        MethodCollector.i(5644);
        boolean z = true;
        if (this.f159253c) {
            MethodCollector.o(5644);
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f159254d;
                if (call == null || !call.isCanceled()) {
                    z = false;
                }
            } finally {
                MethodCollector.o(5644);
            }
        }
        return z;
    }

    @Override // l.b
    public final l<T> a() {
        Call call;
        MethodCollector.i(5597);
        synchronized (this) {
            try {
                if (!this.f159256f) {
                    this.f159256f = true;
                    Throwable th = this.f159255e;
                    if (th == null) {
                        call = this.f159254d;
                        if (call == null) {
                            try {
                                call = f();
                                this.f159254d = call;
                            } catch (IOException | RuntimeException e2) {
                                this.f159255e = e2;
                                MethodCollector.o(5597);
                                throw e2;
                            }
                        }
                    } else if (th instanceof IOException) {
                        IOException iOException = (IOException) th;
                        MethodCollector.o(5597);
                        throw iOException;
                    } else {
                        RuntimeException runtimeException = (RuntimeException) th;
                        MethodCollector.o(5597);
                        throw runtimeException;
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.o(5597);
                    throw illegalStateException;
                }
            } catch (Throwable th2) {
                MethodCollector.o(5597);
                throw th2;
            }
        }
        if (this.f159253c) {
            call.cancel();
        }
        l<T> a2 = a(call.execute());
        MethodCollector.o(5597);
        return a2;
    }

    @Override // l.b
    public final synchronized Request d() {
        MethodCollector.i(5592);
        Call call = this.f159254d;
        if (call != null) {
            Request request = call.request();
            MethodCollector.o(5592);
            return request;
        }
        Throwable th = this.f159255e;
        if (th == null) {
            try {
                Call f2 = f();
                this.f159254d = f2;
                Request request2 = f2.request();
                MethodCollector.o(5592);
                return request2;
            } catch (RuntimeException e2) {
                this.f159255e = e2;
                MethodCollector.o(5592);
                throw e2;
            } catch (IOException e3) {
                this.f159255e = e3;
                RuntimeException runtimeException = new RuntimeException("Unable to create request.", e3);
                MethodCollector.o(5592);
                throw runtimeException;
            }
        } else if (th instanceof IOException) {
            RuntimeException runtimeException2 = new RuntimeException("Unable to create request.", this.f159255e);
            MethodCollector.o(5592);
            throw runtimeException2;
        } else {
            RuntimeException runtimeException3 = (RuntimeException) th;
            MethodCollector.o(5592);
            throw runtimeException3;
        }
    }

    /* access modifiers changed from: package-private */
    public final l<T> a(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new b(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                ResponseBody a2 = o.a(body);
                o.a(a2, "body == null");
                o.a(build, "rawResponse == null");
                if (!build.isSuccessful()) {
                    return new l<>(build, null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return l.a(null, build);
        } else {
            a aVar = new a(body);
            try {
                return l.a(this.f159251a.f159329e.a(aVar), build);
            } catch (RuntimeException e2) {
                if (aVar.f159259a != null) {
                    throw aVar.f159259a;
                }
                throw e2;
            }
        }
    }

    @Override // l.b
    public final void a(final d<T> dVar) {
        Call call;
        Throwable th;
        MethodCollector.i(5596);
        o.a(dVar, "callback == null");
        synchronized (this) {
            try {
                if (!this.f159256f) {
                    this.f159256f = true;
                    call = this.f159254d;
                    th = this.f159255e;
                    if (call == null && th == null) {
                        try {
                            Call f2 = f();
                            this.f159254d = f2;
                            call = f2;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f159255e = th;
                        }
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    MethodCollector.o(5596);
                    throw illegalStateException;
                }
            } catch (Throwable th3) {
                MethodCollector.o(5596);
                throw th3;
            }
        }
        if (th != null) {
            dVar.a(this, th);
            MethodCollector.o(5596);
            return;
        }
        if (this.f159253c) {
            call.cancel();
        }
        call.enqueue(new Callback() {
            /* class l.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(105771);
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                try {
                    dVar.a(h.this, iOException);
                } catch (Throwable unused) {
                }
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                try {
                    try {
                        dVar.a(h.this, h.this.a(response));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
        });
        MethodCollector.o(5596);
    }

    h(n<T, ?> nVar, Object[] objArr) {
        this.f159251a = nVar;
        this.f159252b = objArr;
    }
}
