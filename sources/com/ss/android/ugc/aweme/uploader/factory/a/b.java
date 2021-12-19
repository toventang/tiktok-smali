package com.ss.android.ugc.aweme.uploader.factory.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.c;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.android.ugc.aweme.uploader.d;
import com.ss.android.ugc.aweme.uploader.e;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import h.f.b.l;

public final class b extends AbstractVideoUploader {

    /* renamed from: a  reason: collision with root package name */
    private final BDVideoUploader f142004a;

    static {
        Covode.recordClassIndex(92802);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void a() {
        this.f142004a.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void b() {
        this.f142004a.close();
    }

    public static final class a implements BDVideoUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractVideoUploader.b f142005a;

        static {
            Covode.recordClassIndex(92803);
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final String getStringFromExtern(int i2) {
            return null;
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onLog(int i2, int i3, String str) {
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onUploadVideoStage(int i2, long j2) {
        }

        a(AbstractVideoUploader.b bVar) {
            this.f142005a = bVar;
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final int videoUploadCheckNetState(int i2, int i3) {
            return this.f142005a.a();
        }

        @Override // com.ss.bduploader.BDVideoUploaderListener
        public final void onNotify(int i2, long j2, BDVideoInfo bDVideoInfo) {
            String str;
            long j3;
            String str2;
            AbstractVideoUploader.b bVar = this.f142005a;
            String str3 = null;
            if (bDVideoInfo != null) {
                str3 = bDVideoInfo.mTosKey;
                str = bDVideoInfo.mVideoId;
                j3 = bDVideoInfo.mErrorCode;
                str2 = bDVideoInfo.mErrorMsg;
            } else {
                str = null;
                j3 = 0;
                str2 = null;
            }
            bVar.a(i2, j2, new AbstractVideoUploader.VideoUploadInfo(str3, str, j3, str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void a(AbstractVideoUploader.b bVar) {
        l.d(bVar, "");
        this.f142004a.setListener(new a(bVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void a(String str) {
        l.d(str, "");
        this.f142004a.setPathName(str);
    }

    public b(g gVar, AbstractVideoUploader.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        l.d(gVar, "");
        l.d(aVar, "");
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        this.f142004a = bDVideoUploader;
        int i2 = c.f142006a[aVar.ordinal()];
        String str10 = null;
        if (i2 == 1) {
            c cVar = gVar.G;
            if (cVar != null) {
                str = cVar.f118718a;
            } else {
                str = null;
            }
            bDVideoUploader.setTopAccessKey(str);
            c cVar2 = gVar.G;
            if (cVar2 != null) {
                str2 = cVar2.f118719b;
            } else {
                str2 = null;
            }
            bDVideoUploader.setTopSecretKey(str2);
            c cVar3 = gVar.G;
            if (cVar3 != null) {
                str3 = cVar3.f118720c;
            } else {
                str3 = null;
            }
            bDVideoUploader.setTopSessionToken(str3);
            c cVar4 = gVar.G;
            bDVideoUploader.setSpaceName(cVar4 != null ? cVar4.f118721d : str10);
        } else if (i2 != 2) {
            c cVar5 = gVar.F;
            if (cVar5 != null) {
                str7 = cVar5.f118718a;
            } else {
                str7 = null;
            }
            bDVideoUploader.setTopAccessKey(str7);
            c cVar6 = gVar.F;
            if (cVar6 != null) {
                str8 = cVar6.f118719b;
            } else {
                str8 = null;
            }
            bDVideoUploader.setTopSecretKey(str8);
            c cVar7 = gVar.F;
            if (cVar7 != null) {
                str9 = cVar7.f118720c;
            } else {
                str9 = null;
            }
            bDVideoUploader.setTopSessionToken(str9);
            c cVar8 = gVar.F;
            bDVideoUploader.setSpaceName(cVar8 != null ? cVar8.f118721d : str10);
        } else {
            c cVar9 = gVar.H;
            if (cVar9 != null) {
                str4 = cVar9.f118718a;
            } else {
                str4 = null;
            }
            bDVideoUploader.setTopAccessKey(str4);
            c cVar10 = gVar.H;
            if (cVar10 != null) {
                str5 = cVar10.f118719b;
            } else {
                str5 = null;
            }
            bDVideoUploader.setTopSecretKey(str5);
            c cVar11 = gVar.H;
            if (cVar11 != null) {
                str6 = cVar11.f118720c;
            } else {
                str6 = null;
            }
            bDVideoUploader.setTopSessionToken(str6);
            c cVar12 = gVar.H;
            bDVideoUploader.setSpaceName(cVar12 != null ? cVar12.f118721d : str10);
        }
        bDVideoUploader.setUploadDomain(gVar.f118752c);
        bDVideoUploader.setNetworkType(403, e.a());
        bDVideoUploader.setNetworkType(404, d.a());
        bDVideoUploader.setMaxFailTime(gVar.f118757h);
        bDVideoUploader.setEnableLogCallBack(gVar.u);
        bDVideoUploader.setSliceSize(gVar.f118755f);
        bDVideoUploader.setEnableHttps(gVar.f118759j);
        bDVideoUploader.setFileRetryCount(1);
        ad adVar = new ad();
        adVar.b();
        adVar.a(gVar);
        bDVideoUploader.setServerParameter(adVar.a());
    }
}
