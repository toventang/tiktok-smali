package com.ss.android.ugc.aweme.uploader.factory.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import h.f.b.l;

public final class b extends AbstractVideoUploader {

    /* renamed from: a  reason: collision with root package name */
    private final TTVideoUploader f142010a;

    static {
        Covode.recordClassIndex(92808);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void a() {
        this.f142010a.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void b() {
        this.f142010a.close();
    }

    public static final class a implements TTVideoUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractVideoUploader.b f142011a;

        static {
            Covode.recordClassIndex(92809);
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public final String getStringFromExtern(int i2) {
            return null;
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public final void onLog(int i2, int i3, String str) {
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public final void onUploadVideoStage(int i2, long j2) {
        }

        a(AbstractVideoUploader.b bVar) {
            this.f142011a = bVar;
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public final int videoUploadCheckNetState(int i2, int i3) {
            return this.f142011a.a();
        }

        @Override // com.ss.ttuploader.TTVideoUploaderListener
        public final void onNotify(int i2, long j2, TTVideoInfo tTVideoInfo) {
            String str;
            long j3;
            String str2;
            AbstractVideoUploader.b bVar = this.f142011a;
            String str3 = null;
            if (tTVideoInfo != null) {
                str3 = tTVideoInfo.mTosKey;
                str = tTVideoInfo.mVideoId;
                j3 = tTVideoInfo.mErrcode;
                str2 = tTVideoInfo.mExtra;
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
        this.f142010a.setListener(new a(bVar));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void a(String str) {
        l.d(str, "");
        this.f142010a.setPathName(str);
    }

    public b(g gVar, AbstractVideoUploader.a aVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        this.f142010a = tTVideoUploader;
        tTVideoUploader.setMaxFailTime(gVar.f118757h);
        tTVideoUploader.setEnableLogCallBack(gVar.u);
        tTVideoUploader.setSliceSize(gVar.f118755f);
        tTVideoUploader.setFileUploadDomain(gVar.f118751b);
        tTVideoUploader.setVideoUploadDomain(gVar.f118752c);
        tTVideoUploader.setSliceTimeout(gVar.f118753d);
        tTVideoUploader.setEnableHttps(gVar.f118759j);
        tTVideoUploader.setFileRetryCount(1);
        int i2 = c.f142012a[aVar.ordinal()];
        if (i2 == 1) {
            tTVideoUploader.setUserKey(gVar.A);
            tTVideoUploader.setAuthorization(gVar.B);
        } else if (i2 != 2) {
            tTVideoUploader.setUserKey(gVar.f118750a);
            tTVideoUploader.setAuthorization(gVar.f118758i);
        } else {
            tTVideoUploader.setUserKey(gVar.y);
            tTVideoUploader.setAuthorization(gVar.z);
        }
        tTVideoUploader.setSocketNum(1);
    }
}
