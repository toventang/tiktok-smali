package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.eo;
import com.ss.android.ugc.aweme.publish.f.c;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.f;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.android.ugc.tools.utils.q;
import com.ss.bduploader.BDNetworkRouter;
import com.ss.bduploader.BDNetworkRouterListener;
import com.ss.bduploader.BDUploadResolver;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.uploader.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3024a f118646a = new C3024a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private BDNetworkRouter f118647b;

    static {
        Covode.recordClassIndex(77056);
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.a$a  reason: collision with other inner class name */
    public static final class C3024a {
        static {
            Covode.recordClassIndex(77057);
        }

        private C3024a() {
        }

        public /* synthetic */ C3024a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void b() {
        BDNetworkRouter bDNetworkRouter = this.f118647b;
        if (bDNetworkRouter == null) {
            l.a("mActualNetworkRouter");
        }
        bDNetworkRouter.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void c() {
        BDNetworkRouter bDNetworkRouter = this.f118647b;
        if (bDNetworkRouter == null) {
            l.a("mActualNetworkRouter");
        }
        bDNetworkRouter.stop();
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void d() {
        BDNetworkRouter bDNetworkRouter = this.f118647b;
        if (bDNetworkRouter == null) {
            l.a("mActualNetworkRouter");
        }
        bDNetworkRouter.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void a(int i2) {
        BDNetworkRouter bDNetworkRouter = this.f118647b;
        if (bDNetworkRouter == null) {
            l.a("mActualNetworkRouter");
        }
        bDNetworkRouter.setRouteWeight(i2);
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void a(com.ss.android.ugc.aweme.uploader.a.b bVar) {
        l.d(bVar, "");
        BDNetworkRouter bDNetworkRouter = this.f118647b;
        if (bDNetworkRouter == null) {
            l.a("mActualNetworkRouter");
        }
        bDNetworkRouter.setListener(new b(this, bVar));
    }

    public static final class b implements BDNetworkRouterListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f118648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.uploader.a.b f118649b;

        static {
            Covode.recordClassIndex(77058);
        }

        b(a aVar, com.ss.android.ugc.aweme.uploader.a.b bVar) {
            this.f118648a = aVar;
            this.f118649b = bVar;
        }

        @Override // com.ss.bduploader.BDNetworkRouterListener
        public final int networkRouteCheckNetState(int i2, int i3) {
            return this.f118649b.a();
        }

        @Override // com.ss.bduploader.BDNetworkRouterListener
        public final void onRouteContext(int i2, int i3, String str) {
            if (i2 == 0) {
                com.ss.android.ugc.aweme.uploader.a.b bVar = this.f118649b;
                if (str == null) {
                    str = "";
                }
                bVar.a(5, i3, str);
            } else if (i2 == 1) {
                com.ss.android.ugc.aweme.uploader.a.b bVar2 = this.f118649b;
                if (str == null) {
                    str = "";
                }
                bVar2.a(1, i3, str);
            } else if (i2 != 2) {
                q.b("BDPublishNetworkRouter : ".concat("error vidContextType onSpeedVidContext"));
                com.bytedance.services.apm.api.a.a("BDPublishNetworkRouter : ".concat("error vidContextType onSpeedVidContext"));
            } else {
                com.ss.android.ugc.aweme.uploader.a.b bVar3 = this.f118649b;
                if (str == null) {
                    str = "";
                }
                bVar3.a(3, i3, str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.a.a
    public final void a(d dVar, int i2) {
        l.d(dVar, "");
        g gVar = dVar.f118722a;
        if (gVar != null) {
            l.b(gVar, "");
            c cVar = gVar.F;
            if (cVar != null) {
                l.b(cVar, "");
                BDNetworkRouter bDNetworkRouter = new BDNetworkRouter(i2);
                this.f118647b = bDNetworkRouter;
                bDNetworkRouter.setTopAccessKey(cVar.f118718a);
                BDNetworkRouter bDNetworkRouter2 = this.f118647b;
                if (bDNetworkRouter2 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter2.setTopSecretKey(cVar.f118719b);
                BDNetworkRouter bDNetworkRouter3 = this.f118647b;
                if (bDNetworkRouter3 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter3.setTopSessionToken(cVar.f118720c);
                BDNetworkRouter bDNetworkRouter4 = this.f118647b;
                if (bDNetworkRouter4 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter4.setSpaceName(cVar.f118721d);
                BDNetworkRouter bDNetworkRouter5 = this.f118647b;
                if (bDNetworkRouter5 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter5.setMaxFailTime(gVar.f118757h);
                BDNetworkRouter bDNetworkRouter6 = this.f118647b;
                if (bDNetworkRouter6 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter6.setUploadDomain(gVar.f118752c);
                BDNetworkRouter bDNetworkRouter7 = this.f118647b;
                if (bDNetworkRouter7 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter7.setRWTimeout(gVar.f118753d);
                BDNetworkRouter bDNetworkRouter8 = this.f118647b;
                if (bDNetworkRouter8 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter8.setFileRetryCount(gVar.f118756g);
                BDNetworkRouter bDNetworkRouter9 = this.f118647b;
                if (bDNetworkRouter9 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter9.setTcpOpenTimeOutMilliSec(gVar.o);
                BDNetworkRouter bDNetworkRouter10 = this.f118647b;
                if (bDNetworkRouter10 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter10.setEnableExternDNS(gVar.f118760k);
                BDUploadResolver.setEnableTTNetDNS(gVar.f118762m);
                f fVar = dVar.f118723b;
                if (fVar != null) {
                    BDUploadResolver.setDNSType(fVar.f118743f, fVar.f118744g, fVar.f118745h, fVar.f118746i, fVar.f118747j);
                    BDUploadResolver.setDNSServer(fVar.f118748k, fVar.f118749l);
                }
                BDNetworkRouter bDNetworkRouter11 = this.f118647b;
                if (bDNetworkRouter11 == null) {
                    l.a("mActualNetworkRouter");
                }
                ad adVar = new ad();
                adVar.b();
                adVar.a(gVar);
                bDNetworkRouter11.setServerParameter(adVar.a() + eo.a());
                BDNetworkRouter bDNetworkRouter12 = this.f118647b;
                if (bDNetworkRouter12 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter12.setEnableHttps(gVar.f118759j);
                int a2 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.I);
                int a3 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.J);
                BDNetworkRouter bDNetworkRouter13 = this.f118647b;
                if (bDNetworkRouter13 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter13.setNetworkType(403, a2);
                BDNetworkRouter bDNetworkRouter14 = this.f118647b;
                if (bDNetworkRouter14 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter14.setNetworkType(404, a3);
                if (gVar.r == 1) {
                    BDNetworkRouter bDNetworkRouter15 = this.f118647b;
                    if (bDNetworkRouter15 == null) {
                        l.a("mActualNetworkRouter");
                    }
                    bDNetworkRouter15.setDataTransportProtocol(2);
                    return;
                }
                BDNetworkRouter bDNetworkRouter16 = this.f118647b;
                if (bDNetworkRouter16 == null) {
                    l.a("mActualNetworkRouter");
                }
                bDNetworkRouter16.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
