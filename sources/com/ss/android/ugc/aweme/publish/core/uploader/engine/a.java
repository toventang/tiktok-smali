package com.ss.android.ugc.aweme.publish.core.uploader.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.eo;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.publish.f.f;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.android.ugc.aweme.uploader.g;
import com.ss.android.ugc.tools.utils.q;
import com.ss.bduploader.BDExternalFileReader;
import com.ss.bduploader.BDUploadResolver;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.uploader.b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3023a f118642a = new C3023a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private BDVideoUploader f118643c;

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.a$a  reason: collision with other inner class name */
    public static final class C3023a {
        static {
            Covode.recordClassIndex(77051);
        }

        private C3023a() {
        }

        public /* synthetic */ C3023a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a() {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setPrivateVideo(true);
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void b() {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.cancelUpload();
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void c() {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void d() {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void e() {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.allowMergeUpload();
    }

    static {
        Covode.recordClassIndex(77050);
        com.ss.android.ugc.aweme.publish.core.uploader.a.a.a();
    }

    public static final class b implements BDExternalFileReader {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.uploader.a f118644a;

        static {
            Covode.recordClassIndex(77052);
        }

        @Override // com.ss.bduploader.BDExternalFileReader
        public final void cancel() {
        }

        b(com.ss.android.ugc.aweme.uploader.a aVar) {
            this.f118644a = aVar;
        }

        @Override // com.ss.bduploader.BDExternalFileReader
        public final long getValue(int i2) {
            if (i2 == 0) {
                return this.f118644a.a(0);
            }
            if (i2 != 2) {
                return -1;
            }
            return this.f118644a.a(1);
        }

        @Override // com.ss.bduploader.BDExternalFileReader
        public final long getCrc32ByOffset(long j2, int i2) {
            return this.f118644a.a(j2, i2);
        }

        @Override // com.ss.bduploader.BDExternalFileReader
        public final int readSlice(int i2, byte[] bArr, int i3) {
            com.ss.android.ugc.aweme.uploader.a aVar = this.f118644a;
            if (bArr == null) {
                bArr = new byte[0];
            }
            return aVar.a(i2, bArr, i3);
        }

        @Override // com.ss.bduploader.BDExternalFileReader
        public final int readSliceByOffset(long j2, byte[] bArr, int i2, int i3) {
            return this.f118644a.a(j2, bArr, i2, i3);
        }
    }

    public static final class c implements BDVideoUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.uploader.c f118645a;

        static {
            Covode.recordClassIndex(77053);
        }

        c(com.ss.android.ugc.aweme.uploader.c cVar) {
            this.f118645a = cVar;
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final String getStringFromExtern(int i2) {
            String b2 = this.f118645a.b();
            if (b2 == null) {
                return "";
            }
            return b2;
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onUploadVideoStage(int i2, long j2) {
            this.f118645a.a(i2);
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final int videoUploadCheckNetState(int i2, int i3) {
            return this.f118645a.a();
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onLog(int i2, int i3, String str) {
            if (i2 == 100) {
                this.f118645a.a(101, i3, str);
            } else if (i2 == 101) {
                this.f118645a.a(100, i3, str);
            }
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onNotify(int i2, long j2, BDVideoInfo bDVideoInfo) {
            g gVar;
            long j3;
            if (bDVideoInfo == null) {
                Long l2 = -2147483648L;
                if (l2 != null) {
                    j3 = l2.longValue();
                } else {
                    j3 = 0;
                }
                gVar = new g((String) null, (String) null, (String) null, 0, j3, (String) null, (String) null, (String) null, 479);
            } else {
                gVar = new g(bDVideoInfo.mVideoId, bDVideoInfo.mCoverUri, bDVideoInfo.mTosKey, bDVideoInfo.mLog, bDVideoInfo.mProgress, bDVideoInfo.mErrorCode, bDVideoInfo.mErrorMsg, bDVideoInfo.mVideoMediaInfo, bDVideoInfo.mEncryptionMeta);
            }
            if (i2 == 0) {
                this.f118645a.a(1, j2, gVar);
            } else if (i2 == 1) {
                this.f118645a.a(3, j2, gVar);
            } else if (i2 == 2) {
                this.f118645a.a(2, j2, gVar);
            } else if (i2 == 3) {
                this.f118645a.a(4, j2, gVar);
            } else if (i2 == 121 && SettingsManager.a().a("enable_deal_uploader_user_cancel", true)) {
                this.f118645a.a(4, j2, gVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(float f2) {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setPoster(f2);
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void b(int i2) {
        if (i2 > 0) {
            BDVideoUploader bDVideoUploader = this.f118643c;
            if (bDVideoUploader == null) {
                l.a("mActualUploader");
            }
            bDVideoUploader.setSpeedTestThresh(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void c(int i2) {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setSocketNum(i2);
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void d(int i2) {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setSliceSize(i2);
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void e(int i2) {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setPreUploadEncryptionMode(i2);
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(int i2) {
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setScenesTag(String.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(com.ss.android.ugc.aweme.uploader.a aVar) {
        l.d(aVar, "");
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setExternFileReader(new b(aVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(com.ss.android.ugc.aweme.uploader.c cVar) {
        l.d(cVar, "");
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setListener(new c(cVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.publish.f.g gVar = dVar.f118722a;
        if (gVar != null) {
            l.b(gVar, "");
            com.ss.android.ugc.aweme.publish.f.c cVar = gVar.F;
            if (cVar != null) {
                l.b(cVar, "");
                BDVideoUploader bDVideoUploader = new BDVideoUploader();
                this.f118643c = bDVideoUploader;
                bDVideoUploader.setTopAccessKey(cVar.f118718a);
                BDVideoUploader bDVideoUploader2 = this.f118643c;
                if (bDVideoUploader2 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader2.setTopSecretKey(cVar.f118719b);
                BDVideoUploader bDVideoUploader3 = this.f118643c;
                if (bDVideoUploader3 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader3.setTopSessionToken(cVar.f118720c);
                BDVideoUploader bDVideoUploader4 = this.f118643c;
                if (bDVideoUploader4 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader4.setSpaceName(cVar.f118721d);
                BDVideoUploader bDVideoUploader5 = this.f118643c;
                if (bDVideoUploader5 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader5.setEnableLogCallBack(gVar.u);
                BDVideoUploader bDVideoUploader6 = this.f118643c;
                if (bDVideoUploader6 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader6.setMaxFailTime(gVar.f118757h);
                q.a("UploadSmartSlice", "default slice size = " + gVar.f118755f);
                BDVideoUploader bDVideoUploader7 = this.f118643c;
                if (bDVideoUploader7 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader7.setSliceSize(gVar.f118755f);
                BDVideoUploader bDVideoUploader8 = this.f118643c;
                if (bDVideoUploader8 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader8.setUploadDomain(gVar.f118752c);
                BDVideoUploader bDVideoUploader9 = this.f118643c;
                if (bDVideoUploader9 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader9.setRWTimeout(gVar.f118753d);
                BDVideoUploader bDVideoUploader10 = this.f118643c;
                if (bDVideoUploader10 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader10.setSliceReTryCount(gVar.f118754e);
                BDVideoUploader bDVideoUploader11 = this.f118643c;
                if (bDVideoUploader11 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader11.setFileRetryCount(gVar.f118756g);
                BDVideoUploader bDVideoUploader12 = this.f118643c;
                if (bDVideoUploader12 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader12.setSocketNum(1);
                BDVideoUploader bDVideoUploader13 = this.f118643c;
                if (bDVideoUploader13 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader13.setAliveMaxFailTime(gVar.f118761l);
                BDVideoUploader bDVideoUploader14 = this.f118643c;
                if (bDVideoUploader14 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader14.setTcpOpenTimeOutMilliSec(gVar.o);
                BDVideoUploader bDVideoUploader15 = this.f118643c;
                if (bDVideoUploader15 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader15.setResponseTimeOut(com.bytedance.ies.abmock.b.a().a(true, "tt_uploader_response_time_out", 0));
                BDVideoUploader bDVideoUploader16 = this.f118643c;
                if (bDVideoUploader16 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader16.setEnableExternDNS(gVar.f118760k);
                int a2 = com.bytedance.ies.abmock.b.a().a(true, "tool_upload_sdk_max_speed_thres", 0);
                if (a2 > 0) {
                    BDVideoUploader bDVideoUploader17 = this.f118643c;
                    if (bDVideoUploader17 == null) {
                        l.a("mActualUploader");
                    }
                    bDVideoUploader17.setMaxUploadSpeedThresh(a2);
                }
                BDUploadResolver.setEnableTTNetDNS(gVar.f118762m);
                f fVar = dVar.f118723b;
                if (fVar != null) {
                    BDUploadResolver.setDNSType(fVar.f118743f, fVar.f118744g, fVar.f118745h, fVar.f118746i, fVar.f118747j);
                    BDUploadResolver.setDNSServer(fVar.f118748k, fVar.f118749l);
                }
                BDVideoUploader bDVideoUploader18 = this.f118643c;
                if (bDVideoUploader18 == null) {
                    l.a("mActualUploader");
                }
                ad adVar = new ad();
                adVar.b();
                adVar.a(gVar);
                bDVideoUploader18.setServerParameter(adVar.a() + eo.a());
                BDVideoUploader bDVideoUploader19 = this.f118643c;
                if (bDVideoUploader19 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader19.setEnableHttps(gVar.f118759j);
                boolean n = com.ss.android.ugc.aweme.port.in.g.a().w().n();
                BDVideoUploader bDVideoUploader20 = this.f118643c;
                if (bDVideoUploader20 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader20.setOpenBoe(n);
                q.a("BDVideoUploader enableBoe:".concat(String.valueOf(n)));
                int a3 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.I);
                int a4 = com.ss.android.ugc.aweme.publish.core.uploader.a.a.a(gVar.J);
                q.a("AbstractPublishUploader", "mainNetworkType=" + a3 + ", backupNetworkType=" + a4);
                BDVideoUploader bDVideoUploader21 = this.f118643c;
                if (bDVideoUploader21 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader21.setNetworkType(403, a3);
                BDVideoUploader bDVideoUploader22 = this.f118643c;
                if (bDVideoUploader22 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader22.setNetworkType(404, a4);
                if (gVar.r == 1) {
                    BDVideoUploader bDVideoUploader23 = this.f118643c;
                    if (bDVideoUploader23 == null) {
                        l.a("mActualUploader");
                    }
                    bDVideoUploader23.setDataTransportProtocol(2);
                    return;
                }
                BDVideoUploader bDVideoUploader24 = this.f118643c;
                if (bDVideoUploader24 == null) {
                    l.a("mActualUploader");
                }
                bDVideoUploader24.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }

    @Override // com.ss.android.ugc.aweme.uploader.b
    public final void a(String str) {
        l.d(str, "");
        BDVideoUploader bDVideoUploader = this.f118643c;
        if (bDVideoUploader == null) {
            l.a("mActualUploader");
        }
        bDVideoUploader.setTraceId(str);
    }
}
