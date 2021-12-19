package com.ss.android.ugc.aweme.shoutouts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.port.in.at;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.ab.n;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.aa;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.cj;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutVideoDownloader;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class e implements IShoutOutsService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f133163a = true;

    /* renamed from: b  reason: collision with root package name */
    private boolean f133164b = true;

    /* renamed from: c  reason: collision with root package name */
    private int f133165c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f133166d;

    static {
        Covode.recordClassIndex(87084);
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final int getAuthorCount() {
        return this.f133165c;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInFollowingTab() {
        return this.f133164b;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInMainTab() {
        return this.f133163a;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getUseShoutoutAuthor() {
        return this.f133166d;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final i getShoutOutSettingsModel() {
        return h.a();
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f133171a;

        static {
            Covode.recordClassIndex(87086);
        }

        b(e eVar) {
            this.f133171a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            MethodCollector.i(12976);
            synchronized (this.f133171a) {
                try {
                    i.c(f.a());
                } catch (Throwable th) {
                    MethodCollector.o(12976);
                    throw th;
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(12976);
            return zVar;
        }
    }

    public static final class a implements IDraftService.DraftSaveListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f133167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f133168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f133169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f133170d;

        static {
            Covode.recordClassIndex(87085);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveSuccess() {
            com.ss.android.ugc.aweme.port.internal.c c2 = g.a().c();
            com.ss.android.ugc.aweme.draft.model.c cVar = this.f133168b;
            l.b(cVar, "");
            c2.a(cVar, true);
            at.a a2 = com.ss.android.ugc.aweme.port.in.c.D.d().a();
            com.ss.android.ugc.aweme.draft.model.c cVar2 = this.f133168b;
            l.b(cVar2, "");
            a2.b(cVar2);
            if (this.f133169c != null) {
                new com.ss.android.ugc.aweme.shortvideo.publish.z(this.f133169c, new aa(this.f133169c, this.f133170d)).a(this.f133168b);
            }
            this.f133167a.a(this.f133169c, this.f133170d);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
        public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
            l.d(draftSaveResult, "");
            this.f133167a.a(this.f133169c, this.f133170d);
        }

        a(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar, androidx.fragment.app.e eVar2, VideoPublishEditModel videoPublishEditModel) {
            this.f133167a = eVar;
            this.f133168b = cVar;
            this.f133169c = eVar2;
            this.f133170d = videoPublishEditModel;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setAuthorCount(int i2) {
        this.f133165c = i2;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInFollowingTab(boolean z) {
        this.f133164b = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInMainTab(boolean z) {
        this.f133163a = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setUseShoutoutAuthor(boolean z) {
        this.f133166d = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean isShoutoutPostDialog(Object obj) {
        if (obj != null && (obj instanceof VideoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.mShoutOutsData == null || !(!l.a((Object) videoPublishEditModel.mShoutOutsData.getShoutOutsMode(), (Object) d.MODE_POST))) {
                return false;
            }
            return true;
        }
        return false;
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f133172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133173b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ShoutoutVideoDownloadListener f133174c;

        static {
            Covode.recordClassIndex(87087);
        }

        c(androidx.fragment.app.e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener) {
            this.f133172a = eVar;
            this.f133173b = str;
            this.f133174c = shoutoutVideoDownloadListener;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            if (!this.f133172a.isFinishing()) {
                ShoutOutVideoDownloader shoutOutVideoDownloader = new ShoutOutVideoDownloader(this.f133173b, f.a(), String.valueOf(System.currentTimeMillis()) + "shoutout.mp4", this.f133174c, this.f133172a);
                shoutOutVideoDownloader.f133106f.getLifecycle().a(shoutOutVideoDownloader);
                shoutOutVideoDownloader.f133101a = Downloader.with(com.ss.android.ugc.aweme.df.b.a()).url(shoutOutVideoDownloader.f133102b).name(shoutOutVideoDownloader.f133104d).savePath(shoutOutVideoDownloader.f133103c).retryCount(3).subThreadListener(new ShoutOutVideoDownloader.b(shoutOutVideoDownloader)).download();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivity(Activity activity, Intent intent) {
        l.d(activity, "");
        l.d(intent, "");
        q.a("SHOUTOUTTOOLSstartShoutoutsPublishActivity");
        intent.setClass(activity, ShoutOutsPublishActivity.class);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void publishShoutOuts(androidx.fragment.app.e eVar, Object obj) {
        l.d(eVar, "");
        l.d(obj, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if ((cVar == null || cVar.isCommerceMusic()) && com.ss.android.ugc.aweme.port.in.c.u.b()) {
            cr.a().d();
            cr a2 = cr.a();
            l.b(a2, "");
            a2.f125301g = false;
            cr a3 = cr.a();
            l.b(a3, "");
            a3.f125302h = false;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            com.ss.android.ugc.aweme.draft.model.c a4 = cj.a(videoPublishEditModel);
            StringBuilder sb = new StringBuilder("[handleSaveDraftBeforePublishNew]: creation id = ");
            l.b(a4, "");
            k.a(sb.append(a4.f()).toString());
            cr.a().q = a4.r();
            n.a(new m.c(a4, 1, videoPublishEditModel, new a(this, a4, eVar, videoPublishEditModel)));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromNative(Activity activity, d dVar) {
        l.d(activity, "");
        l.d(dVar, "");
        Intent intent = new Intent(activity, ShoutOutsPublishActivity.class);
        if (!TextUtils.isEmpty(dVar.getProductId()) && dVar.getPrice() != null) {
            g price = dVar.getPrice();
            if (price == null) {
                l.b();
            }
            if (price.getMoneyDes() != null) {
                q.a("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromNative");
                intent.putExtra("shout_out_from_dl", true);
                if (TextUtils.isEmpty(dVar.getCoverUrl())) {
                    dVar.setReviewed(1);
                }
                intent.putExtra("shout_out_data", dVar);
                com.ss.android.ugc.tools.d.a.c.a(activity, intent);
            }
        }
    }

    public final void a(androidx.fragment.app.e eVar, VideoPublishEditModel videoPublishEditModel) {
        setInMainTab(true);
        setInFollowingTab(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        videoPublishEditModel.setSaveModel(g.a().o().m().a(videoPublishEditModel, 1, true, com.ss.android.ugc.aweme.publish.f.b.f118717a));
        com.ss.android.ugc.aweme.tools.b.g.a(com.ss.android.ugc.aweme.shortvideo.q.a(videoPublishEditModel), com.ss.android.ugc.aweme.shortvideo.q.b(videoPublishEditModel), com.ss.android.ugc.aweme.tools.b.e.PUBLISH, com.ss.android.ugc.aweme.tools.b.e.SEND_REQUEST);
        videoPublishEditModel.userClickPublishTime = uptimeMillis;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        Intent intent = eVar.getIntent();
        if (intent == null) {
            l.b();
        }
        bundle.putInt("extra_stick_point_type", intent.getIntExtra("extra_stick_point_type", 0));
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", 0);
        com.ss.android.ugc.aweme.framework.a.a.a("VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle)));
        r.a("av_video_memory", new d().a("log", "VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle))).f66730a);
        Publish.PublishBundle = bundle;
        n.a(new m.b(eVar, bundle, null));
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromDL(Activity activity, Uri uri) {
        a aVar;
        l.d(activity, "");
        l.d(uri, "");
        Intent intent = new Intent(activity, ShoutOutsPublishActivity.class);
        String queryParameter = uri.getQueryParameter("product_id");
        String queryParameter2 = uri.getQueryParameter("data");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            q.b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL pid data empty ");
            return;
        }
        try {
            d dVar = (d) new f().a(queryParameter2, d.class);
            if (dVar != null) {
                dVar.setProductId(queryParameter);
                if (dVar != null) {
                    g price = dVar.getPrice();
                    if (price != null) {
                        aVar = price.getBuyerMoneyDes();
                    } else {
                        aVar = null;
                    }
                    dVar.setBuyerMoneyDes(aVar);
                    g price2 = dVar.getPrice();
                    if (price2 != null) {
                        price2.setBuyerMoneyDes(null);
                    }
                    intent.putExtra("shout_out_from_dl", true);
                    intent.putExtra("shout_out_data", dVar);
                    intent.putExtra("route_uri", uri.toString());
                    com.ss.android.ugc.tools.d.a.c.a(activity, intent);
                    return;
                }
            }
            q.b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL null shoutOutsData ");
        } catch (Exception e2) {
            q.b("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL" + e2.toString());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startDownLoadVideo(androidx.fragment.app.e eVar, String str, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener) {
        l.d(eVar, "");
        l.d(str, "");
        l.d(shoutoutVideoDownloadListener, "");
        if (com.ss.android.ugc.aweme.port.in.c.a()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.c0q).a();
            q.a("SHOUTOUTTOOLSstartDownLoadVideo isRecording");
            return;
        }
        b.i.b(new b(this), b.i.f4824a).a(new c(eVar, str, shoutoutVideoDownloadListener), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishSyncActivity(Activity activity, String str, String str2, String str3) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        if (com.ss.android.ugc.aweme.port.in.c.a()) {
            Context applicationContext = activity.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.c0q).a();
            q.a("SHOUTOUTTOOLSstartShoutoutsPublishSyncActivity isRecording ");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_enter_from_shoutout_sync", true);
        intent.putExtra("extra_shoutout_video_path", str);
        intent.putExtra("extra_shoutout_pid", str2);
        intent.putExtra("extra_shoutout_music_id", str3);
        intent.setClass(activity, VideoPublishActivity.class);
        com.ss.android.ugc.tools.d.a.c.a(activity, intent);
    }
}
