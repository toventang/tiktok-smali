package com.bytedance.retrofit2.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.s;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.bs.c;
import com.ss.android.ugc.aweme.feed.api.e;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.logger.a;
import java.util.List;

public final class b implements a.AbstractC1036a {

    /* renamed from: a  reason: collision with root package name */
    public final int f42452a;

    /* renamed from: b  reason: collision with root package name */
    public s f42453b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f42454c;

    /* renamed from: d  reason: collision with root package name */
    private final Request f42455d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.retrofit2.b f42456e;

    /* renamed from: f  reason: collision with root package name */
    private int f42457f;

    static {
        Covode.recordClassIndex(26006);
    }

    @Override // com.bytedance.retrofit2.c.a.AbstractC1036a
    public final Request a() {
        return this.f42455d;
    }

    @Override // com.bytedance.retrofit2.c.a.AbstractC1036a
    public final com.bytedance.retrofit2.b b() {
        return this.f42456e;
    }

    @Override // com.bytedance.retrofit2.c.a.AbstractC1036a
    public final s c() {
        return this.f42453b;
    }

    @Override // com.bytedance.retrofit2.c.a.AbstractC1036a
    public final u a(Request request) {
        s sVar;
        String str;
        s sVar2 = this.f42453b;
        if (!(sVar2 instanceof com.ss.android.ugc.aweme.bs.b)) {
            sVar = new com.ss.android.ugc.aweme.bs.b(sVar2.f42596g, sVar2.f42597h);
            sVar.f42590a = sVar2.f42590a;
            sVar.f42595f = sVar2.f42595f;
            sVar.f42596g = sVar2.f42596g;
            sVar.f42597h = sVar2.f42597h;
            sVar.f42598i = sVar2.f42598i;
            sVar.f42600k = sVar2.f42600k;
            sVar.f42601l = sVar2.f42601l;
            sVar.f42602m = sVar2.f42602m;
            sVar.n = sVar2.n;
            sVar.o = sVar2.o;
            sVar.q = sVar2.q;
            sVar.r = sVar2.r;
            sVar.s = sVar2.s;
            sVar.t = sVar2.t;
            sVar.u = sVar2.u;
            sVar.v = sVar2.v;
            sVar.w = sVar2.w;
            sVar.z = sVar2.z;
            sVar.A = sVar2.A;
            sVar.B = sVar2.B;
            sVar.D = sVar2.D;
            sVar.E = sVar2.E;
            sVar.F = sVar2.F;
            sVar.G = sVar2.G;
            sVar.H = sVar2.H;
            sVar.I = sVar2.I;
            sVar.J = sVar2.J;
            sVar.K = sVar2.K;
            sVar.M = sVar2.M;
            this.f42453b = sVar;
        } else {
            sVar = sVar2;
        }
        if (this.f42452a < this.f42454c.size()) {
            int i2 = this.f42457f + 1;
            this.f42457f = i2;
            if (i2 > 1) {
                for (a aVar : this.f42454c) {
                    if (aVar instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) aVar).resetExecuted();
                    }
                }
            }
            b bVar = new b(this.f42454c, this.f42452a + 1, request, this.f42456e, this.f42453b);
            a aVar2 = this.f42454c.get(this.f42452a);
            request.getUrl();
            u intercept = aVar2.intercept(bVar);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + aVar2 + " returned null");
            } else if (intercept.f42629a != null) {
                if (Integer.valueOf(this.f42452a).intValue() == 0 && intercept.f42629a != null && (intercept.f42629a.f42478f instanceof com.bytedance.frameworks.baselib.network.http.a)) {
                    com.bytedance.frameworks.baselib.network.http.a aVar3 = (com.bytedance.frameworks.baselib.network.http.a) intercept.f42629a.f42478f;
                    if (aVar3.f28920h > 0 && (sVar instanceof com.ss.android.ugc.aweme.bs.b)) {
                        com.ss.android.ugc.aweme.bs.b bVar2 = (com.ss.android.ugc.aweme.bs.b) sVar;
                        bVar2.U = System.currentTimeMillis();
                        bVar2.V = SystemClock.uptimeMillis() - bVar2.Z;
                        com.bytedance.retrofit2.client.b a2 = intercept.f42629a.a("x-tt-logid");
                        if (a2 == null || a2.f42472b == null) {
                            str = "";
                        } else {
                            str = a2.f42472b;
                        }
                        c.a(request, str, aVar3, bVar2);
                        if (request != null && a.b.f109011a.f109002c && e.a(request)) {
                            long j2 = aVar3.f28916d - aVar3.f28915c;
                            long j3 = aVar3.f28917e - aVar3.f28916d;
                            long j4 = aVar3.f28918f - aVar3.f28917e;
                            long j5 = aVar3.f28920h - aVar3.f28918f;
                            long j6 = bVar2.V;
                            long j7 = bVar2.U - bVar2.f42596g;
                            a.b.f109011a.b("feed_api_to_net_api", aVar3.f28915c, false);
                            a.b.f109011a.a("feed_net_api_to_interceptors", j2);
                            a.b.f109011a.a("feed_interceptors_pre_duration", j3);
                            a.b.f109011a.a("feed_network_to_response", j4);
                            a.b.f109011a.a("feed_read_response_duration", j5);
                            a.b.f109011a.a("feed_interceptors_post_duration", j6);
                            a.b.f109011a.a("feed_net_api_total", j7);
                            y.a(bVar2);
                            if (aVar3.f28922j > 0) {
                                a.b.f109011a.a("feed_cronet_dns_duration", aVar3.f28922j);
                            }
                            if (aVar3.f28923k > 0) {
                                a.b.f109011a.a("feed_cronet_connect_duration", aVar3.f28923k);
                            }
                            if (aVar3.f28924l > 0) {
                                a.b.f109011a.a("feed_cronet_ssl_duration", aVar3.f28924l);
                            }
                            if (aVar3.f28925m > 0) {
                                a.b.f109011a.a("feed_cronet_send_duration", aVar3.f28925m);
                            }
                            if (aVar3.q > 0) {
                                a.b.f109011a.a("feed_cronet_timing_waiting", aVar3.q);
                            }
                            if (aVar3.o > 0) {
                                a.b.f109011a.a("feed_cronet_receive_duration", aVar3.o);
                            }
                            if (aVar3.r > 0) {
                                a.b.f109011a.a("feed_cronet_total", aVar3.r);
                            }
                        }
                    }
                }
                return intercept;
            } else {
                throw new IllegalStateException("interceptor " + aVar2 + " returned a ssResponse with no body");
            }
        } else {
            throw new AssertionError();
        }
    }

    public b(List<a> list, int i2, Request request, com.bytedance.retrofit2.b bVar, s sVar) {
        this.f42454c = list;
        this.f42452a = i2;
        this.f42455d = request;
        this.f42456e = bVar;
        this.f42453b = sVar;
    }
}
