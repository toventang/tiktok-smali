package com.ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.main.replace.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class d {
    public static final a o = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Activity f109292a;

    /* renamed from: b  reason: collision with root package name */
    String f109293b = "";

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.d f109294c;

    /* renamed from: d  reason: collision with root package name */
    public int f109295d;

    /* renamed from: e  reason: collision with root package name */
    final List<String> f109296e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public String f109297f;

    /* renamed from: g  reason: collision with root package name */
    public String f109298g;

    /* renamed from: h  reason: collision with root package name */
    public String f109299h;

    /* renamed from: i  reason: collision with root package name */
    public final String f109300i = AVExternalServiceImpl.a().configService().cacheConfig().cacheDir();

    /* renamed from: j  reason: collision with root package name */
    final Handler f109301j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    public int f109302k = 20;

    /* renamed from: l  reason: collision with root package name */
    float f109303l;

    /* renamed from: m  reason: collision with root package name */
    public final Callable<z> f109304m = new f(this);
    public final IRecordService.UICallback n = new g(this);

    static {
        Covode.recordClassIndex(70003);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70004);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109313b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f109314c;

        static {
            Covode.recordClassIndex(70009);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            this.f109312a.a(true);
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f109315a;

            static {
                Covode.recordClassIndex(70010);
            }

            a(e eVar) {
                this.f109315a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f109315a.f109312a.a(false);
                this.f109315a.f109312a.f109294c = com.ss.android.ugc.aweme.shortvideo.view.d.a(d.a(this.f109315a.f109312a), d.a(this.f109315a.f109312a).getResources().getString(R.string.fyd));
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f109315a.f109312a.f109294c;
                if (dVar == null) {
                    return null;
                }
                dVar.setIndeterminate(true);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            i.b(new a(this), i.f4826c);
            String str = this.f109312a.f109297f;
            if (str == null) {
                l.a("mOutPath");
            }
            String str2 = this.f109312a.f109298g;
            if (str2 == null) {
                l.a("mTempMp4Path");
            }
            String str3 = this.f109312a.f109299h;
            if (str3 == null) {
                l.a("mTempWavPath");
            }
            ChangeBanMusicConfig changeBanMusicConfig = new ChangeBanMusicConfig(str, str2, str3, this.f109313b);
            changeBanMusicConfig.setOutputDir(this.f109312a.f109300i);
            asyncAVService.uiService().recordService().startChangeBanMusic(this.f109314c, d.a(this.f109312a), changeBanMusicConfig, this.f109312a.n);
        }

        e(d dVar, String str, Aweme aweme) {
            this.f109312a = dVar;
            this.f109313b = str;
            this.f109314c = aweme;
        }
    }

    public static final class g implements IRecordService.UICallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109317a;

        static {
            Covode.recordClassIndex(70012);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void preFail(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void preSuccess() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final boolean checkIsCanceled() {
            return IRecordService.UICallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void postFail() {
            this.f109317a.b();
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void postSuccess() {
            this.f109317a.a(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(d dVar) {
            this.f109317a = dVar;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109318a;

        static {
            Covode.recordClassIndex(70013);
        }

        h(d dVar) {
            this.f109318a = dVar;
        }

        public final void run() {
            if (this.f109318a.f109295d == 0) {
                this.f109318a.b();
            }
        }
    }

    public final void b() {
        i.b(new CallableC2801d(this), i.f4826c);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109308b;

        static {
            Covode.recordClassIndex(70006);
        }

        c(d dVar, String str) {
            this.f109307a = dVar;
            this.f109308b = str;
        }

        public final void run() {
            try {
                final Aweme a2 = DetailApi.a(this.f109308b, "", 0, (String) null);
                com.ss.android.b.a.a.a.b(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.main.replace.d.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f109309a;

                    static {
                        Covode.recordClassIndex(70007);
                    }

                    {
                        this.f109309a = r1;
                    }

                    public final void run() {
                        Aweme aweme;
                        if (d.a(this.f109309a.f109307a) == null || (aweme = a2) == null) {
                            this.f109309a.f109307a.a(true);
                        } else if (aweme.getAuthor() == null) {
                            this.f109309a.f109307a.a(true);
                        } else {
                            Aweme aweme2 = a2;
                            if (aweme2 == null) {
                                this.f109309a.f109307a.a(true);
                                return;
                            }
                            if (aweme2.getStatus() != null) {
                                AwemeStatus status = a2.getStatus();
                                l.b(status, "");
                                if (status.isPrivate()) {
                                    this.f109309a.f109307a.a(true);
                                    return;
                                }
                            }
                            if (a2.getStatus() != null) {
                                AwemeStatus status2 = a2.getStatus();
                                l.b(status2, "");
                                if (status2.isDelete()) {
                                    this.f109309a.f109307a.a(true);
                                    return;
                                }
                            }
                            d dVar = this.f109309a.f109307a;
                            Aweme aweme3 = a2;
                            Video video = aweme3.getVideo();
                            l.b(video, "");
                            VideoUrlModel playAddrH264 = video.getPlayAddrH264();
                            if (playAddrH264 == null || playAddrH264.getUrlList().isEmpty()) {
                                dVar.a(true);
                                return;
                            }
                            List<String> list = dVar.f109296e;
                            List<String> a2 = n.a(playAddrH264.getUrlList().get(0));
                            ArrayList arrayList = new ArrayList();
                            for (String str : a2) {
                                String a3 = com.ss.android.ugc.aweme.app.e.a.a(aweme3, str);
                                if (a3 != null) {
                                    arrayList.add(a3);
                                }
                            }
                            list.addAll(arrayList);
                            String b2 = com.bytedance.common.utility.d.b(playAddrH264.getBitRatedRatioUri());
                            dVar.f109297f = dVar.f109300i + b2 + ".mp4";
                            dVar.f109298g = dVar.f109300i + "temp_" + b2 + ".mp4";
                            dVar.f109299h = dVar.f109300i + "temp_" + b2 + ".wav";
                            String str2 = dVar.f109297f;
                            if (str2 == null) {
                                l.a("mOutPath");
                            }
                            if (!com.ss.android.ugc.aweme.video.e.b(str2)) {
                                com.ss.android.ugc.aweme.video.e.a(dVar.f109300i, false);
                                dVar.f109295d = 0;
                                String str3 = dVar.f109300i;
                                String str4 = b2 + ".mp4";
                                String aid = aweme3.getAid();
                                List<String> list2 = dVar.f109296e;
                                b bVar = new b(dVar, aweme3, dVar.f109296e, "replace_music");
                                l.d(list2, "");
                                String str5 = (str3 == null || !p.c(str3, "/", false)) ? str3 + File.separator + str4 : str3 + str4;
                                if (!LocalVideoPlayerManager.a().a(aid, str5, new c.a(bVar, str5, list2, str3, str4))) {
                                    c.a(list2, str3, str4, bVar);
                                }
                            } else {
                                dVar.f109302k = 99;
                                dVar.f109303l = 1.0f;
                                dVar.a(aweme3);
                            }
                            dVar.f109301j.postDelayed(new h(dVar), 60000);
                        }
                    }
                });
            } catch (Exception unused) {
                this.f109307a.b();
            }
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109316a;

        static {
            Covode.recordClassIndex(70011);
        }

        f(d dVar) {
            this.f109316a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f109316a.f109294c;
            if (dVar != null) {
                int i2 = 99;
                if (this.f109316a.f109295d < 99) {
                    i2 = this.f109316a.f109295d;
                }
                dVar.setProgress(i2);
            }
            return z.f158842a;
        }
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$d  reason: collision with other inner class name */
    public static final class CallableC2801d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109311a;

        static {
            Covode.recordClassIndex(70008);
        }

        CallableC2801d(d dVar) {
            this.f109311a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (d.a(this.f109311a) != null) {
                this.f109311a.a(true);
                new com.bytedance.tux.g.b(d.a(this.f109311a)).e(R.string.bbv).b();
            }
            return z.f158842a;
        }
    }

    public static final /* synthetic */ Activity a(d dVar) {
        Activity activity = dVar.f109292a;
        if (activity == null) {
            l.a("mContext");
        }
        return activity;
    }

    public final void a(Aweme aweme) {
        if (this.f109292a == null) {
            l.a("mContext");
            return;
        }
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        AVExternalServiceImpl.a().asyncServiceWithOutPanel("replace_music", new e(this, uuid, aweme));
    }

    public final void a(boolean z) {
        if (z) {
            try {
                if (this.f109292a == null) {
                    l.a("mContext");
                } else {
                    Activity activity = this.f109292a;
                    if (activity == null) {
                        l.a("mContext");
                    }
                    activity.finish();
                }
            } catch (Exception unused) {
            }
        }
        com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f109294c;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f109294c = null;
    }

    public static final class b extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f109305d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Aweme f109306e;

        static {
            Covode.recordClassIndex(70005);
        }

        @Override // com.ss.android.ugc.aweme.main.replace.a
        public final void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            super.a(str, str2);
            d dVar = this.f109305d;
            dVar.f109295d = 99 - dVar.f109302k;
            i.b(this.f109305d.f109304m, i.f4826c);
            if (new File(str2).length() == 0) {
                this.f109305d.b();
                return;
            }
            this.f109305d.f109297f = str2;
            this.f109305d.a(this.f109306e);
        }

        @Override // com.ss.android.ugc.aweme.main.replace.a
        public final void a(Exception exc, String str, Integer num) {
            super.a(exc, str, num);
            this.f109305d.b();
        }

        @Override // com.ss.android.ugc.aweme.main.replace.a
        public final void a(int i2, long j2, long j3) {
            super.a(i2, j2, j3);
            if (d.a(this.f109305d) != null && i2 >= this.f109305d.f109295d) {
                this.f109305d.f109295d = i2;
                i.b(this.f109305d.f109304m, i.f4826c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Aweme aweme, List list, String str) {
            super(list, str);
            this.f109305d = dVar;
            this.f109306e = aweme;
        }
    }
}
