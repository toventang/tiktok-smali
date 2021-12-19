package com.ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class ShareFromWebHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final VideoInfoApi f113848a;

    /* renamed from: b  reason: collision with root package name */
    public static final ShareFromWebHelper f113849b = new ShareFromWebHelper();

    /* renamed from: c  reason: collision with root package name */
    private static final String f113850c;

    public interface VideoInfoApi {
        static {
            Covode.recordClassIndex(73213);
        }

        @f(a = "/tiktok/v1/tt4d/share/video/info/")
        i<b> getVideoInfo(@t(a = "video_id") String str);
    }

    public static final class a {
        @com.google.gson.a.c(a = "cdn_url")

        /* renamed from: a  reason: collision with root package name */
        public final String f113851a;

        static {
            Covode.recordClassIndex(73214);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f113851a, ((a) obj).f113851a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f113851a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ShareVideoInfo(cdnUrl=" + this.f113851a + ")";
        }
    }

    public static final class b {
        @com.google.gson.a.c(a = "status_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f113852a;
        @com.google.gson.a.c(a = "video_info")

        /* renamed from: b  reason: collision with root package name */
        public final a f113853b;

        static {
            Covode.recordClassIndex(73215);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f113852a == bVar.f113852a && l.a(this.f113853b, bVar.f113853b);
        }

        public final int hashCode() {
            int i2 = this.f113852a * 31;
            a aVar = this.f113853b;
            return i2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "ShareVideoInfoResponse(statusCode=" + this.f113852a + ", videoInfo=" + this.f113853b + ")";
        }
    }

    private ShareFromWebHelper() {
    }

    static {
        Covode.recordClassIndex(73212);
        String str = "https://" + com.bytedance.ies.ugc.appcontext.d.f34604k.f34586a;
        f113850c = str;
        f113848a = (VideoInfoApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(VideoInfoApi.class);
    }

    public static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f113854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.view.d f113855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f113856c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f113857d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f113858e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f113859f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f113860g;

        static {
            Covode.recordClassIndex(73216);
        }

        public c(String str, com.ss.android.ugc.aweme.shortvideo.view.d dVar, String str2, String str3, String str4, String str5, Context context) {
            this.f113854a = str;
            this.f113855b = dVar;
            this.f113856c = str2;
            this.f113857d = str3;
            this.f113858e = str4;
            this.f113859f = str5;
            this.f113860g = context;
        }

        public static final class a extends r {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f113861a;

            static {
                Covode.recordClassIndex(73217);
            }

            a(c cVar) {
                this.f113861a = cVar;
            }

            @Override // com.ss.android.ugc.aweme.notification.utils.r
            public final void a(String str, String str2) {
                l.d(str, "");
                l.d(str2, "");
                super.a(str, str2);
                this.f113861a.f113855b.dismiss();
                final EditConfig.Builder mediaInfo = new EditConfig.Builder().mediaInfo(new VideoMedia(str2));
                mediaInfo.shootWay(this.f113861a.f113856c);
                mediaInfo.shareID(this.f113861a.f113857d);
                mediaInfo.channel(this.f113861a.f113858e);
                mediaInfo.hashtag(this.f113861a.f113859f);
                AVExternalServiceImpl.a().asyncService(this.f113861a.f113860g, "upload", new SimpleServiceLoadCallback(this) {
                    /* class com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f113862a;

                    static {
                        Covode.recordClassIndex(73218);
                    }

                    {
                        this.f113862a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j2) {
                        l.d(asyncAVService, "");
                        asyncAVService.uiService().editService().startEdit(this.f113862a.f113861a.f113860g, mediaInfo.build());
                    }
                });
            }

            @Override // com.ss.android.ugc.aweme.notification.utils.r
            public final void a(int i2, long j2, long j3) {
                super.a(i2, j2, j3);
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f113861a.f113855b;
                l.b(dVar, "");
                if (i2 >= 100) {
                    i2 = 100;
                }
                dVar.setProgress(i2);
            }

            @Override // com.ss.android.ugc.aweme.notification.utils.r
            public final void a(Exception exc, String str, Integer num) {
                super.a(exc, str, num);
                this.f113861a.f113855b.dismiss();
                ShareFromWebHelper.a(this.f113861a.f113860g);
            }
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            b bVar = (b) iVar.d();
            if (bVar == null) {
                this.f113855b.dismiss();
                ShareFromWebHelper.a(this.f113860g);
                return null;
            } else if (bVar.f113852a == 0) {
                String str = bVar.f113853b.f113851a;
                String cacheDir = AVExternalServiceImpl.a().configService().cacheConfig().cacheDir();
                String a2 = l.a(this.f113854a, (Object) ".mp4");
                d dVar = new d(new a(this));
                com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                with.f83078c = a2;
                with.f83081f = cacheDir;
                com.ss.android.ugc.aweme.download.component_api.a a3 = with.a(3).a(DownloadServiceManager.INSTANCE.isAutoRemoveListener());
                a3.D = dVar;
                a3.f();
                return null;
            } else {
                this.f113855b.dismiss();
                ShareFromWebHelper.a(this.f113860g);
                return null;
            }
        }
    }

    public static final class d extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f113864a;

        static {
            Covode.recordClassIndex(73219);
        }

        d(r rVar) {
            this.f113864a = rVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            int i2;
            long j2;
            long j3;
            super.onProgress(downloadInfo);
            r rVar = this.f113864a;
            if (rVar != null) {
                if (downloadInfo != null) {
                    i2 = downloadInfo.getDownloadProcess();
                    j2 = downloadInfo.getCurBytes();
                    j3 = downloadInfo.getTotalBytes();
                } else {
                    i2 = 0;
                    j2 = 0;
                    j3 = 100;
                }
                rVar.a(i2, j2, j3);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r6 == null) goto L_0x0014;
         */
        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r6) {
            /*
                r5 = this;
                super.onSuccessed(r6)
                com.ss.android.ugc.aweme.notification.utils.r r3 = r5.f113864a
                if (r3 == 0) goto L_0x0017
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0011
                java.lang.String r2 = r6.getUrl()
                if (r2 != 0) goto L_0x0018
            L_0x0011:
                r2 = r0
                if (r6 != 0) goto L_0x0018
            L_0x0014:
                r3.a(r2, r0)
            L_0x0017:
                return
            L_0x0018:
                java.lang.String r4 = r6.getSavePath()
                if (r4 == 0) goto L_0x0042
                r1 = 0
                java.lang.String r0 = "/"
                boolean r1 = h.m.p.c(r4, r0, r1)
                r0 = 1
                if (r1 != r0) goto L_0x0042
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            L_0x0042:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = r6.getSavePath()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = java.io.File.separator
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper.d.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            r rVar = this.f113864a;
            if (rVar != null) {
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                    num = Integer.valueOf(baseException.getErrorCode());
                } else {
                    str = null;
                }
                rVar.a(baseException, str, num);
            }
        }
    }

    public static void a(Context context) {
        l.d(context, "");
        new com.bytedance.tux.g.b((Activity) context).a(context.getResources().getString(R.string.fti)).b();
    }
}
