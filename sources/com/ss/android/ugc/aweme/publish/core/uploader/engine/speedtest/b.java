package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.eo;
import com.ss.android.ugc.aweme.publish.f.c;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.f;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.bduploader.BDNetworkSpeedTest;
import com.ss.bduploader.BDNetworkSpeedTestListener;
import com.ss.bduploader.BDUploadResolver;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.uploader.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118650a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private BDNetworkSpeedTest f118651b;

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void d() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77060);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void a() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f118651b;
        if (bDNetworkSpeedTest == null) {
            l.a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void b() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f118651b;
        if (bDNetworkSpeedTest == null) {
            l.a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.stop();
    }

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void c() {
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f118651b;
        if (bDNetworkSpeedTest == null) {
            l.a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.close();
    }

    static {
        Covode.recordClassIndex(77059);
        com.ss.android.ugc.aweme.publish.core.uploader.a.a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.b$b  reason: collision with other inner class name */
    public static final class C3025b implements BDNetworkSpeedTestListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.uploader.b.b f118652a;

        static {
            Covode.recordClassIndex(77061);
        }

        C3025b(com.ss.android.ugc.aweme.uploader.b.b bVar) {
            this.f118652a = bVar;
        }

        @Override // com.ss.bduploader.BDNetworkSpeedTestListener
        public final int speedTestCheckNetState(int i2, int i3) {
            return this.f118652a.a();
        }

        @Override // com.ss.bduploader.BDNetworkSpeedTestListener
        public final void onSpeedTestContext(int i2, int i3, String str) {
            if (i2 == 0) {
                com.ss.android.ugc.aweme.uploader.b.b bVar = this.f118652a;
                if (str == null) {
                    str = "";
                }
                bVar.a(0, i3, str);
            } else if (i2 == 1) {
                com.ss.android.ugc.aweme.uploader.b.b bVar2 = this.f118652a;
                if (str == null) {
                    str = "";
                }
                bVar2.a(2, i3, str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void a(com.ss.android.ugc.aweme.uploader.b.b bVar) {
        l.d(bVar, "");
        BDNetworkSpeedTest bDNetworkSpeedTest = this.f118651b;
        if (bDNetworkSpeedTest == null) {
            l.a("mActualSpeedTest");
        }
        bDNetworkSpeedTest.setListener(new C3025b(bVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.b.a
    public final void a(d dVar) {
        l.d(dVar, "");
        g gVar = dVar.f118722a;
        if (gVar != null) {
            l.b(gVar, "");
            c cVar = gVar.F;
            if (cVar != null) {
                l.b(cVar, "");
                BDNetworkSpeedTest bDNetworkSpeedTest = new BDNetworkSpeedTest();
                this.f118651b = bDNetworkSpeedTest;
                bDNetworkSpeedTest.setTopAccessKey(cVar.f118718a);
                BDNetworkSpeedTest bDNetworkSpeedTest2 = this.f118651b;
                if (bDNetworkSpeedTest2 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest2.setTopSecretKey(cVar.f118719b);
                BDNetworkSpeedTest bDNetworkSpeedTest3 = this.f118651b;
                if (bDNetworkSpeedTest3 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest3.setTopSessionToken(cVar.f118720c);
                BDNetworkSpeedTest bDNetworkSpeedTest4 = this.f118651b;
                if (bDNetworkSpeedTest4 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest4.setSpaceName(cVar.f118721d);
                BDNetworkSpeedTest bDNetworkSpeedTest5 = this.f118651b;
                if (bDNetworkSpeedTest5 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest5.setMaxFailTime(gVar.f118757h);
                BDNetworkSpeedTest bDNetworkSpeedTest6 = this.f118651b;
                if (bDNetworkSpeedTest6 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest6.setUploadDomain(gVar.f118752c);
                BDNetworkSpeedTest bDNetworkSpeedTest7 = this.f118651b;
                if (bDNetworkSpeedTest7 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest7.setRWTimeout(gVar.f118753d);
                BDNetworkSpeedTest bDNetworkSpeedTest8 = this.f118651b;
                if (bDNetworkSpeedTest8 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest8.setFileRetryCount(gVar.f118756g);
                BDNetworkSpeedTest bDNetworkSpeedTest9 = this.f118651b;
                if (bDNetworkSpeedTest9 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest9.setTcpOpenTimeOutMilliSec(gVar.o);
                BDNetworkSpeedTest bDNetworkSpeedTest10 = this.f118651b;
                if (bDNetworkSpeedTest10 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest10.setEnableExternDNS(gVar.f118760k);
                BDUploadResolver.setEnableTTNetDNS(gVar.f118762m);
                f fVar = dVar.f118723b;
                if (fVar != null) {
                    BDUploadResolver.setDNSType(fVar.f118743f, fVar.f118744g, fVar.f118745h, fVar.f118746i, fVar.f118747j);
                    BDUploadResolver.setDNSServer(fVar.f118748k, fVar.f118749l);
                }
                BDNetworkSpeedTest bDNetworkSpeedTest11 = this.f118651b;
                if (bDNetworkSpeedTest11 == null) {
                    l.a("mActualSpeedTest");
                }
                ad adVar = new ad();
                adVar.b();
                adVar.a(gVar);
                bDNetworkSpeedTest11.setServerParameter(adVar.a() + eo.a());
                BDNetworkSpeedTest bDNetworkSpeedTest12 = this.f118651b;
                if (bDNetworkSpeedTest12 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest12.setEnableHttps(gVar.f118759j);
                int a2 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.I);
                int a3 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.J);
                BDNetworkSpeedTest bDNetworkSpeedTest13 = this.f118651b;
                if (bDNetworkSpeedTest13 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest13.setNetworkType(403, a2);
                BDNetworkSpeedTest bDNetworkSpeedTest14 = this.f118651b;
                if (bDNetworkSpeedTest14 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest14.setNetworkType(404, a3);
                if (gVar.r == 1) {
                    BDNetworkSpeedTest bDNetworkSpeedTest15 = this.f118651b;
                    if (bDNetworkSpeedTest15 == null) {
                        l.a("mActualSpeedTest");
                    }
                    bDNetworkSpeedTest15.setDataTransportProtocol(2);
                    return;
                }
                BDNetworkSpeedTest bDNetworkSpeedTest16 = this.f118651b;
                if (bDNetworkSpeedTest16 == null) {
                    l.a("mActualSpeedTest");
                }
                bDNetworkSpeedTest16.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }
}
