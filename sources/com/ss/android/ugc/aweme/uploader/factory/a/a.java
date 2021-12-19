package com.ss.android.ugc.aweme.uploader.factory.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.aweme.uploader.d;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageInfo;
import com.ss.bduploader.BDImageUploader;
import com.ss.bduploader.BDImageUploaderListener;
import h.f.b.l;

public final class a extends AbstractImageUploader {

    /* renamed from: b  reason: collision with root package name */
    private final BDImageUploader f142002b;

    static {
        Covode.recordClassIndex(92800);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final int a() {
        return 6;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final int b() {
        return 7;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void c() {
        this.f142002b.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void d() {
        this.f142002b.close();
    }

    /* renamed from: com.ss.android.ugc.aweme.uploader.factory.a.a$a  reason: collision with other inner class name */
    public static final class C3783a implements BDImageUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractImageUploader.a f142003a;

        static {
            Covode.recordClassIndex(92801);
        }

        @Override // com.ss.bduploader.BDImageUploaderListener
        public final void onLog(int i2, int i3, String str) {
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        C3783a(AbstractImageUploader.a aVar) {
            this.f142003a = aVar;
        }

        @Override // com.ss.bduploader.BDImageUploaderListener
        public final int imageUploadCheckNetState(int i2, int i3) {
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = a();
            }
            if (j.f107226e) {
                return 1;
            }
            return 0;
        }

        @Override // com.ss.bduploader.BDImageUploaderListener
        public final void onNotify(int i2, long j2, BDImageInfo bDImageInfo) {
            String str;
            long j3;
            String str2;
            String str3;
            AbstractImageUploader.a aVar = this.f142003a;
            String str4 = null;
            if (bDImageInfo != null) {
                str = bDImageInfo.mImageTosKey;
            } else {
                str = null;
            }
            long j4 = 0;
            if (bDImageInfo != null) {
                j3 = bDImageInfo.mErrorCode;
                str2 = bDImageInfo.mErrorMsg;
                str3 = bDImageInfo.mEncryptionMeta;
                j4 = bDImageInfo.mProgress;
            } else {
                j3 = 0;
                str2 = null;
                str3 = null;
            }
            if (bDImageInfo != null) {
                str4 = bDImageInfo.mMetaInfo;
            }
            aVar.a(i2, j2, new AbstractImageUploader.ImageUploadInfo(str, j3, str2, str3, j4, str4));
        }
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(boolean z) {
        this.f142002b.setOpenBoe(z);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(AbstractImageUploader.a aVar) {
        l.d(aVar, "");
        this.f142002b.setListener(new C3783a(aVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(String str) {
        l.d(str, "");
        this.f142002b.setServerParameter(str);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(String[] strArr) {
        l.d(strArr, "");
        this.f142002b.setFilePath(1, strArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar) {
        super(eVar);
        l.d(eVar, "");
        BDImageUploader bDImageUploader = new BDImageUploader();
        this.f142002b = bDImageUploader;
        bDImageUploader.setUploadDomain(eVar.f118728c);
        bDImageUploader.setNetworkType(403, com.ss.android.ugc.aweme.uploader.e.a());
        bDImageUploader.setNetworkType(404, d.a());
        bDImageUploader.setSliceSize(eVar.f118731f);
        bDImageUploader.setFileRetryCount(eVar.f118729d);
        bDImageUploader.setEnableHttps(eVar.f118735j);
        bDImageUploader.setTopAccessKey(eVar.f118737l.f118718a);
        bDImageUploader.setTopSecretKey(eVar.f118737l.f118719b);
        bDImageUploader.setTopSessionToken(eVar.f118737l.f118720c);
        bDImageUploader.setSpaceName(eVar.f118737l.f118721d);
    }
}
