package com.ss.android.ugc.aweme.uploader.factory.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.e;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.ttuploader.TTImageInfo;
import com.ss.ttuploader.TTImageUploader;
import com.ss.ttuploader.TTImageUploaderListener;
import h.f.b.l;

public final class a extends AbstractImageUploader {

    /* renamed from: b  reason: collision with root package name */
    private final TTImageUploader f142008b;

    static {
        Covode.recordClassIndex(92806);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final int a() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final int b() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void c() {
        this.f142008b.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void d() {
        this.f142008b.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(boolean z) {
        this.f142008b.setOpenBoe(z);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(AbstractImageUploader.a aVar) {
        l.d(aVar, "");
        this.f142008b.setListener(new C3784a(aVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(String str) {
        l.d(str, "");
        this.f142008b.setServerParameter(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar) {
        super(eVar);
        l.d(eVar, "");
        TTImageUploader tTImageUploader = new TTImageUploader();
        this.f142008b = tTImageUploader;
        tTImageUploader.setSliceSize(eVar.f118731f);
        tTImageUploader.setFileUploadDomain(eVar.f118727b);
        tTImageUploader.setImageUploadDomain(eVar.f118728c);
        tTImageUploader.setSliceTimeout(eVar.f118732g);
        tTImageUploader.setSliceReTryCount(eVar.f118733h);
        tTImageUploader.setFileRetryCount(eVar.f118729d);
        tTImageUploader.setUserKey(eVar.f118726a);
        tTImageUploader.setEnableHttps(eVar.f118735j);
        tTImageUploader.setAuthorization(eVar.f118734i);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void a(String[] strArr) {
        l.d(strArr, "");
        this.f142008b.setFilePath(1, strArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.uploader.factory.b.a$a  reason: collision with other inner class name */
    static final class C3784a implements TTImageUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractImageUploader.a f142009a;

        static {
            Covode.recordClassIndex(92807);
        }

        C3784a(AbstractImageUploader.a aVar) {
            this.f142009a = aVar;
        }

        @Override // com.ss.ttuploader.TTImageUploaderListener
        public final void onNotify(int i2, long j2, TTImageInfo tTImageInfo) {
            String str;
            long j3;
            String str2;
            String str3;
            AbstractImageUploader.a aVar = this.f142009a;
            String str4 = null;
            if (tTImageInfo != null) {
                str = tTImageInfo.mImageToskey;
            } else {
                str = null;
            }
            long j4 = 0;
            if (tTImageInfo != null) {
                j3 = tTImageInfo.mErrcode;
                str2 = tTImageInfo.mExtra;
                str3 = tTImageInfo.mEncryptionImageTosKey;
                j4 = tTImageInfo.mProgress;
            } else {
                j3 = 0;
                str2 = null;
                str3 = null;
            }
            if (tTImageInfo != null) {
                str4 = tTImageInfo.mMetaInfo;
            }
            aVar.a(i2, j2, new AbstractImageUploader.ImageUploadInfo(str, j3, str2, str3, j4, str4));
        }
    }
}
