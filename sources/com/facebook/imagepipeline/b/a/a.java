package com.facebook.imagepipeline.b.a;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.n.al;
import com.facebook.imagepipeline.n.c;
import com.facebook.imagepipeline.n.k;
import com.facebook.imagepipeline.n.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class a extends c<C1179a> {
    private final CacheControl mCacheControl;
    private final Call.Factory mCallFactory;
    public Executor mCancellationExecutor;

    static {
        Covode.recordClassIndex(28909);
    }

    public a(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* renamed from: com.facebook.imagepipeline.b.a.a$a  reason: collision with other inner class name */
    public static class C1179a extends t {

        /* renamed from: a  reason: collision with root package name */
        public long f47705a;

        /* renamed from: b  reason: collision with root package name */
        public long f47706b;

        /* renamed from: c  reason: collision with root package name */
        public long f47707c;

        static {
            Covode.recordClassIndex(28913);
        }

        public C1179a(k<e> kVar, al alVar) {
            super(kVar, alVar);
        }
    }

    public a(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    @Override // com.facebook.imagepipeline.n.ag
    public C1179a createFetchState(k<e> kVar, al alVar) {
        return new C1179a(kVar, alVar);
    }

    public void onFetchCompletion(C1179a aVar, int i2) {
        aVar.f47707c = SystemClock.elapsedRealtime();
    }

    public Map<String, String> getExtraMap(C1179a aVar, int i2) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f47706b - aVar.f47705a));
        hashMap.put("fetch_time", Long.toString(aVar.f47707c - aVar.f47706b));
        hashMap.put("total_time", Long.toString(aVar.f47707c - aVar.f47705a));
        hashMap.put("image_size", Integer.toString(i2));
        return hashMap;
    }

    public void fetch(C1179a aVar, ag.a aVar2) {
        aVar.f47705a = System.currentTimeMillis();
        try {
            Request.Builder builder = new Request.Builder().url(aVar.c().toString()).get();
            CacheControl cacheControl = this.mCacheControl;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            com.facebook.imagepipeline.common.a aVar3 = aVar.f48390e.a().mBytesRange;
            if (aVar3 != null) {
                builder.addHeader("Range", com.a.a(null, "bytes=%s-%s", new Object[]{com.facebook.imagepipeline.common.a.a(aVar3.f47732a), com.facebook.imagepipeline.common.a.a(aVar3.f47733b)}));
            }
            fetchWithRequest(aVar, aVar2, builder.build());
        } catch (Exception e2) {
            aVar2.a(e2);
        }
    }

    public void handleException(Call call, Exception exc, ag.a aVar) {
        if (call.isCanceled()) {
            aVar.a();
        } else {
            aVar.a(exc);
        }
    }

    public a(Call.Factory factory, Executor executor, boolean z) {
        CacheControl cacheControl;
        this.mCallFactory = factory;
        this.mCancellationExecutor = executor;
        if (z) {
            cacheControl = new CacheControl.Builder().noStore().build();
        } else {
            cacheControl = null;
        }
        this.mCacheControl = cacheControl;
    }

    /* access modifiers changed from: protected */
    public void fetchWithRequest(final C1179a aVar, final ag.a aVar2, Request request) {
        final Call newCall = this.mCallFactory.newCall(request);
        aVar.f48390e.a(new com.facebook.imagepipeline.n.e() {
            /* class com.facebook.imagepipeline.b.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28910);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    newCall.cancel();
                } else {
                    a.this.mCancellationExecutor.execute(new Runnable() {
                        /* class com.facebook.imagepipeline.b.a.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(28911);
                        }

                        public final void run() {
                            newCall.cancel();
                        }
                    });
                }
            }
        });
        newCall.enqueue(new Callback() {
            /* class com.facebook.imagepipeline.b.a.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(28912);
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                a.this.handleException(call, iOException, aVar2);
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                aVar.f47706b = System.currentTimeMillis();
                ResponseBody body = response.body();
                try {
                    if (!response.isSuccessful()) {
                        a.this.handleException(call, new IOException("Unexpected HTTP code ".concat(String.valueOf(response))), aVar2);
                        return;
                    }
                    com.facebook.imagepipeline.common.a a2 = com.facebook.imagepipeline.common.a.a(response.header("Content-Range"));
                    if (!(a2 == null || (a2.f47732a == 0 && a2.f47733b == Integer.MAX_VALUE))) {
                        aVar.f48393h = a2;
                        aVar.f48392g = 8;
                    }
                    long contentLength = body.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    aVar2.a(body.byteStream(), (int) contentLength);
                    body.close();
                } catch (Exception e2) {
                    a.this.handleException(call, e2, aVar2);
                } finally {
                    body.close();
                }
            }
        });
    }
}
