package com.ss.android.ugc.aweme.ay;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.lighten.a.c.i;
import com.bytedance.lighten.a.g;
import com.facebook.net.a;
import com.facebook.net.d;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class o extends b {

    /* renamed from: e  reason: collision with root package name */
    public volatile Call f67826e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Request f67827f;

    static {
        Covode.recordClassIndex(41748);
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a() {
        if (this.f67826e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f67826e.cancel();
        } else {
            this.f67771a.execute(new Runnable() {
                /* class com.ss.android.ugc.aweme.ay.o.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(41750);
                }

                public final void run() {
                    o.this.f67826e.cancel();
                }
            });
        }
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a(g gVar) {
        gVar.f39844a = System.currentTimeMillis();
        this.f67773c = (d) gVar.f39854k;
        Uri uri = gVar.f39851h;
        Request.Builder builder = new Request.Builder();
        if (gVar.f39848e > 0) {
            builder.header("Range", "bytes=" + gVar.f39848e + "-");
        }
        String a2 = e.a(this.f67774d.a(uri.toString()));
        if (m.a(a2)) {
            a2 = uri.toString();
        }
        this.f67827f = builder.cacheControl(new CacheControl.Builder().noStore().build()).url(a2).get().build();
        this.f67826e = a.a().newCall(this.f67827f);
    }

    @Override // com.bytedance.lighten.a.c.m
    public final void a(final g gVar, final i iVar) {
        if (this.f67826e != null && gVar != null) {
            final Request request = this.f67826e.request();
            this.f67826e.enqueue(new Callback() {
                /* class com.ss.android.ugc.aweme.ay.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41749);
                }

                @Override // okhttp3.Callback
                public final void onFailure(Call call, IOException iOException) {
                    o.this.a(null, gVar, call, iOException, iVar);
                }

                @Override // okhttp3.Callback
                public final void onResponse(Call call, Response response) {
                    gVar.f39845b = System.currentTimeMillis();
                    gVar.f39846c = System.currentTimeMillis();
                    ResponseBody body = response.body();
                    try {
                        if (!response.isSuccessful()) {
                            o.this.a(response, gVar, call, new IOException("Unexpected HTTP code ".concat(String.valueOf(response))), iVar);
                            if (body != null) {
                                try {
                                    body.close();
                                } catch (Exception e2) {
                                    com.facebook.common.e.a.b("OkHttpNetworkFetchProducer", "Exception when closing response body", e2);
                                }
                            }
                        } else {
                            Pair<InputStream, Long> a2 = o.this.f67774d.a(body.byteStream(), response.request().url().toString(), body.contentLength());
                            long longValue = ((Long) a2.second).longValue();
                            if (longValue < 0 || (gVar.f39848e > 0 && response.code() != 206)) {
                                longValue = 0;
                            }
                            gVar.f39853j = new p(this, gVar, response, longValue, request);
                            iVar.a((InputStream) a2.first, (int) longValue);
                            try {
                                body.close();
                            } catch (Exception e3) {
                                com.facebook.common.e.a.b("OkHttpNetworkFetchProducer", "Exception when closing response body", e3);
                            }
                        }
                    } catch (Exception e4) {
                        o.this.a(response, gVar, call, e4, iVar);
                        if (body != null) {
                            try {
                                body.close();
                            } catch (Exception e5) {
                                com.facebook.common.e.a.b("OkHttpNetworkFetchProducer", "Exception when closing response body", e5);
                            }
                        }
                    } catch (Throwable th) {
                        if (body != null) {
                            try {
                                body.close();
                            } catch (Exception e6) {
                                com.facebook.common.e.a.b("OkHttpNetworkFetchProducer", "Exception when closing response body", e6);
                            }
                        }
                        throw th;
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if ("Socket closed".equals(r20.getMessage()) == false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(okhttp3.Response r17, com.bytedance.lighten.a.g r18, okhttp3.Call r19, java.lang.Exception r20, com.bytedance.lighten.a.c.i r21) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ay.o.a(okhttp3.Response, com.bytedance.lighten.a.g, okhttp3.Call, java.lang.Exception, com.bytedance.lighten.a.c.i):void");
    }
}
