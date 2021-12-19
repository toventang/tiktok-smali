package com.ss.android.ugc.aweme.shoutouts.player;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.t;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.et;
import f.a.ae;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class ShoutoutsPlayViewModel extends JediViewModel<ShoutoutsPlayState> {

    /* renamed from: a  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.shoutouts.model.b> f133269a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    int f133270b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final b f133271c = new b(this);

    static {
        Covode.recordClassIndex(87161);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ ShoutoutsPlayState d() {
        return new ShoutoutsPlayState(0, null, 3, null);
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayViewModel f133273a;

        static {
            Covode.recordClassIndex(87163);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
            this.f133273a = shoutoutsPlayViewModel;
        }

        static final class c extends m implements h.f.a.b<ShoutoutsPlayState, ShoutoutsPlayState> {
            final /* synthetic */ int $progress;

            static {
                Covode.recordClassIndex(87166);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(int i2) {
                super(1);
                this.$progress = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                l.d(shoutoutsPlayState2, "");
                return shoutoutsPlayState2.copy(this.$progress, a.DOWNLOADING);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            this.f133273a.c(a.f133274a);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            super.onSuccessed(downloadInfo);
            this.f133273a.c(d.f133276a);
        }

        static final class a extends m implements h.f.a.b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f133274a = new a();

            static {
                Covode.recordClassIndex(87164);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                l.d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, a.CANCEL, 1, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel$b$b  reason: collision with other inner class name */
        static final class C3452b extends m implements h.f.a.b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3452b f133275a = new C3452b();

            static {
                Covode.recordClassIndex(87165);
            }

            C3452b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                l.d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, a.FAIL, 1, null);
            }
        }

        static final class d extends m implements h.f.a.b<ShoutoutsPlayState, ShoutoutsPlayState> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f133276a = new d();

            static {
                Covode.recordClassIndex(87167);
            }

            d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
                ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
                l.d(shoutoutsPlayState2, "");
                return ShoutoutsPlayState.copy$default(shoutoutsPlayState2, 0, a.SUCCESS, 1, null);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            l.d(downloadInfo, "");
            this.f133273a.c(new c((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f)));
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            this.f133273a.c(C3452b.f133275a);
        }
    }

    public static final class c implements ae<com.ss.android.ugc.aweme.shoutouts.model.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsPlayViewModel f133277a;

        static {
            Covode.recordClassIndex(87168);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
            this.f133277a = shoutoutsPlayViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.shoutouts.model.c cVar) {
            com.ss.android.ugc.aweme.shoutouts.model.c cVar2 = cVar;
            l.d(cVar2, "");
            if (cVar2.f133206a == 0) {
                this.f133277a.f133269a.setValue(cVar2.f133208c);
            }
        }
    }

    static final class a extends m implements h.f.a.b<ShoutoutsPlayState, ShoutoutsPlayState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133272a = new a();

        static {
            Covode.recordClassIndex(87162);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
            ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
            l.d(shoutoutsPlayState2, "");
            return shoutoutsPlayState2.copy(0, a.PREPARED);
        }
    }

    public final void a(Context context, Video video) {
        String str;
        UrlModel downloadAddr;
        List<String> urlList;
        l.d(context, "");
        if (video == null || (downloadAddr = video.getDownloadAddr()) == null || (urlList = downloadAddr.getUrlList()) == null) {
            str = null;
        } else {
            str = (String) n.h((List) urlList);
        }
        String str2 = et.a(str) + '_' + System.currentTimeMillis() + ".mp4";
        Uri b2 = e.b(context, str2, "video/mp4");
        com.ss.android.ugc.aweme.download.component_api.a a2 = DownloadServiceManager.INSTANCE.getDownloadService().with(str).e().a();
        a2.f83081f = b2.toString();
        a2.f83078c = str2;
        a2.a(this.f133271c.hashCode(), this.f133271c, h.SUB);
        this.f133270b = a2.f();
    }
}
