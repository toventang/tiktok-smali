package com.ss.android.ugc.aweme.shortvideo.l;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class p {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Activity f128694a;

    /* renamed from: b  reason: collision with root package name */
    public String f128695b = "";

    /* renamed from: c  reason: collision with root package name */
    public Aweme f128696c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.d f128697d;

    /* renamed from: e  reason: collision with root package name */
    public int f128698e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f128699f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public String f128700g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f128701h;

    /* renamed from: i  reason: collision with root package name */
    public int f128702i = 20;

    /* renamed from: j  reason: collision with root package name */
    public float f128703j;

    /* renamed from: k  reason: collision with root package name */
    public float f128704k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f128705l;

    /* renamed from: m  reason: collision with root package name */
    public final Callable<z> f128706m;
    private String o;
    private String p;
    private final String q = AVExternalServiceImpl.a().configService().cacheConfig().cacheDir();
    private final Handler r = new Handler(Looper.getMainLooper());
    private final h.h s = h.i.a((h.f.a.a) new i(this));

    static {
        Covode.recordClassIndex(84360);
    }

    private final com.ss.android.ugc.aweme.music.f e() {
        return (com.ss.android.ugc.aweme.music.f) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84361);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f128715b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ StitchParams f128716c;

        static {
            Covode.recordClassIndex(84367);
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
            this.f128714a.d();
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            h.f.b.l.d(asyncAVService, "");
            this.f128714a.d();
            IRecordService recordService = asyncAVService.uiService().recordService();
            Activity activity = this.f128714a.f128694a;
            if (activity == null) {
                h.f.b.l.b();
            }
            recordService.startStitch(activity, this.f128715b, this.f128716c);
        }

        g(p pVar, Intent intent, StitchParams stitchParams) {
            this.f128714a = pVar;
            this.f128715b = intent;
            this.f128716c = stitchParams;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128720a;

        static {
            Covode.recordClassIndex(84372);
        }

        l(p pVar) {
            this.f128720a = pVar;
        }

        public final void run() {
            if (this.f128720a.f128698e == 0) {
                this.f128720a.b();
            }
        }
    }

    public final void b() {
        b.i.b(new f(this), b.i.f4826c);
    }

    public final void d() {
        try {
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f128697d;
            if (dVar != null) {
                dVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f128697d = null;
    }

    public static final class b implements com.ss.android.ugc.aweme.music.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Music f128708b;

        static {
            Covode.recordClassIndex(84362);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void b() {
            p pVar = this.f128707a;
            pVar.f128698e = 99 - pVar.f128702i;
            b.i.b(this.f128707a.f128706m, b.i.f4826c);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(com.ss.android.ugc.musicprovider.a aVar) {
            h.f.b.l.d(aVar, "");
            this.f128707a.b();
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(int i2) {
            p pVar = this.f128707a;
            pVar.f128698e = ((int) (((float) i2) * pVar.f128704k)) + (99 - this.f128707a.f128702i);
            b.i.b(this.f128707a.f128706m, b.i.f4826c);
        }

        b(p pVar, Music music) {
            this.f128707a = pVar;
            this.f128708b = music;
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(String str, MusicWaveBean musicWaveBean) {
            h.f.b.l.d(str, "");
            p pVar = this.f128707a;
            com.ss.android.ugc.aweme.shortvideo.c a2 = com.ss.android.ugc.aweme.shortvideo.ae.b.a(this.f128708b.convertToMusicModel());
            a2.path = str;
            pVar.f128701h = a2;
            this.f128707a.c();
        }
    }

    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f128711a;

        static {
            Covode.recordClassIndex(84364);
        }

        public d(Aweme aweme) {
            this.f128711a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IPrivacyConfig privacyConfig = AVExternalServiceImpl.a().configService().privacyConfig();
            String aid = this.f128711a.getAid();
            h.f.b.l.b(aid, "");
            return privacyConfig.checkDuetReactPermission(aid, 2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128713a;

        static {
            Covode.recordClassIndex(84366);
        }

        f(p pVar) {
            this.f128713a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Activity activity = this.f128713a.f128694a;
            if (activity == null) {
                return null;
            }
            this.f128713a.d();
            new com.bytedance.tux.g.b(activity).e(R.string.bbv).b();
            return z.f158842a;
        }
    }

    static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128717a;

        static {
            Covode.recordClassIndex(84368);
        }

        h(p pVar) {
            this.f128717a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f128717a.f128697d;
            if (dVar != null) {
                int i2 = 99;
                if (this.f128717a.f128698e < 99) {
                    i2 = this.f128717a.f128698e;
                }
                dVar.setProgress(i2);
            }
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.a<com.ss.android.ugc.aweme.music.f> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(84369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.music.f invoke() {
            Activity activity = this.this$0.f128694a;
            if (activity == null) {
                h.f.b.l.b();
            }
            return new com.ss.android.ugc.aweme.music.f(activity, false, false, false, "stitch", 12);
        }
    }

    static final class j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128718a;

        static {
            Covode.recordClassIndex(84370);
        }

        j(p pVar) {
            this.f128718a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme aweme = this.f128718a.f128696c;
            if (aweme == null) {
                h.f.b.l.a("mAweme");
            }
            return DetailApi.a(aweme.getAid(), "", 0, (String) null);
        }
    }

    public p() {
        a(20);
        this.f128706m = new h(this);
    }

    public final void c() {
        String str;
        if (!in.d() && this.f128694a != null) {
            String uuid = UUID.randomUUID().toString();
            h.f.b.l.b(uuid, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", uuid).a("shoot_way", "stitch");
            Aweme aweme = this.f128696c;
            if (aweme == null) {
                h.f.b.l.a("mAweme");
            }
            r.a("shoot", a2.a("group_id", aweme.getAid()).a("enter_from", this.f128695b).a("enter_method", "click_stitch_button").a("content_source", "shoot").a("content_type", "video").f66730a);
            String str2 = this.f128700g;
            if (str2 == null) {
                h.f.b.l.a("mOutPath");
            }
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f128701h;
            String str3 = null;
            if (cVar != null) {
                str = cVar.getPath();
            } else {
                str = null;
            }
            boolean z = this.f128705l;
            Aweme aweme2 = this.f128696c;
            if (aweme2 == null) {
                h.f.b.l.a("mAweme");
            }
            User author = aweme2.getAuthor();
            Aweme aweme3 = this.f128696c;
            if (aweme3 == null) {
                h.f.b.l.a("mAweme");
            }
            String aid = aweme3.getAid();
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = this.f128701h;
            if (cVar2 != null) {
                str3 = cVar2.getMusicId();
            }
            StitchParams stitchParams = new StitchParams(null, str2, cVar, str, 0, z, str3, author, aid, null, 0, null, null, false, false, 0, 0, 130576, null);
            Intent intent = new Intent();
            intent.putExtra("creation_id", uuid);
            intent.putExtra("shoot_way", "stitch");
            AVExternalServiceImpl.a().asyncServiceWithOutPanel("stitch", new g(this, intent, stitchParams));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.l.p.a():void");
    }

    private final void a(int i2) {
        this.f128702i = i2;
        float f2 = ((float) i2) / 99.0f;
        this.f128704k = f2;
        this.f128703j = 1.0f - f2;
    }

    public final void a(Music music) {
        if (this.f128705l) {
            com.ss.android.ugc.aweme.music.f e2 = e();
            MusicModel convertToMusicModel = music.convertToMusicModel();
            h.f.b.l.b(convertToMusicModel, "");
            e2.a(convertToMusicModel, new b(this, music), false, false);
        }
    }

    static final class k<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128719a;

        static {
            Covode.recordClassIndex(84371);
        }

        k(p pVar) {
            this.f128719a = pVar;
        }

        @Override // b.g
        public final Object then(b.i<Aweme> iVar) {
            h.f.b.l.d(iVar, "");
            if (!iVar.c() && !iVar.b() && iVar.d() != null) {
                p pVar = this.f128719a;
                Aweme d2 = iVar.d();
                h.f.b.l.b(d2, "");
                pVar.f128696c = d2;
            }
            this.f128719a.a();
            return null;
        }
    }

    public final void a(String str) {
        Activity activity = this.f128694a;
        if (activity != null) {
            new com.bytedance.tux.g.b(activity).a(str).b();
            d();
        }
    }

    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128712a;

        static {
            Covode.recordClassIndex(84365);
        }

        public e(p pVar) {
            this.f128712a = pVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            Resources resources;
            Resources resources2;
            h.f.b.l.d(iVar, "");
            String str = null;
            if (iVar.c() || iVar.b()) {
                p pVar = this.f128712a;
                Activity activity = pVar.f128694a;
                if (activity == null || (resources = activity.getResources()) == null || (str = resources.getString(R.string.de9)) == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(str, "");
                pVar.a(str);
            } else if (!((com.ss.android.ugc.aweme.shortvideo.duet.b) iVar.d()).f126497a) {
                String str2 = ((com.ss.android.ugc.aweme.shortvideo.duet.b) iVar.d()).f126500d;
                if (str2.length() == 0) {
                    Activity activity2 = this.f128712a.f128694a;
                    if (activity2 == null || (resources2 = activity2.getResources()) == null || (str = resources2.getString(R.string.g7z)) == null) {
                        h.f.b.l.b();
                    }
                    str2 = str;
                }
                this.f128712a.a(str2);
            } else {
                p pVar2 = this.f128712a;
                Aweme aweme = pVar2.f128696c;
                if (aweme == null) {
                    h.f.b.l.a("mAweme");
                }
                if (!y.d(aweme)) {
                    b.i.b(new j(pVar2), b.i.f4824a).a(new k(pVar2), b.i.f4826c, null);
                } else {
                    pVar2.a();
                }
            }
            return z.f158842a;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.shortvideo.reaction.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f128709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f128710b;

        static {
            Covode.recordClassIndex(84363);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
        public final void a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            super.a(str, str2);
            p pVar = this.f128709a;
            pVar.f128698e = 99 - pVar.f128702i;
            b.i.b(this.f128709a.f128706m, b.i.f4826c);
            if (new File(str2).length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer download file size == 0: " + this.f128709a.f128699f));
                this.f128709a.b();
                return;
            }
            this.f128709a.f128700g = str2;
            if (this.f128710b.getMusic() == null || !this.f128709a.f128705l) {
                this.f128709a.c();
                return;
            }
            p pVar2 = this.f128709a;
            Music music = this.f128710b.getMusic();
            h.f.b.l.b(music, "");
            pVar2.a(music);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
        public final void a(Exception exc, String str, Integer num) {
            super.a(exc, str, num);
            this.f128709a.b();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
        public final void a(int i2, long j2, long j3) {
            super.a(i2, j2, j3);
            if (this.f128709a.f128694a != null) {
                if (i2 > 99) {
                    i2 = 99;
                }
                p pVar = this.f128709a;
                pVar.f128698e = (int) (((float) i2) * pVar.f128703j);
                b.i.b(this.f128709a.f128706m, b.i.f4826c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, Aweme aweme, List list, String str) {
            super(list, str);
            this.f128709a = pVar;
            this.f128710b = aweme;
        }
    }
}
