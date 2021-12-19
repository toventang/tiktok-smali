package com.ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.discover.b.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.flowfeed.utils.c;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.shortvideo.ak;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.i;
import com.ss.android.ugc.playerkit.videoview.j;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.b.l;
import h.f.b.m;
import java.util.Arrays;
import org.json.JSONObject;

public final class SearchPlayerCore extends KeepSurfaceTextureView implements b.d, OnUIPlayListener {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67544b = new a((byte) 0);
    private com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a A;
    private final h.h B;
    private final h.h C;
    private final h.h D;

    /* renamed from: a  reason: collision with root package name */
    public int f67545a;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.n.b f67546g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f67547h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f67548i;

    /* renamed from: j  reason: collision with root package name */
    private OnUIPlayListener f67549j;

    /* renamed from: k  reason: collision with root package name */
    private f f67550k;

    /* renamed from: l  reason: collision with root package name */
    private b.d f67551l;

    /* renamed from: m  reason: collision with root package name */
    private b.d f67552m;
    private String n;
    private final h.h o;
    private boolean p;
    private final h.h q;
    private final h.h r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private final h.h y;
    private long z;

    static {
        Covode.recordClassIndex(41581);
    }

    public SearchPlayerCore(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final IAdSceneService getAdSceneService() {
        return (IAdSceneService) this.B.getValue();
    }

    private final com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c getSearchAdVideoPlayerDepend() {
        return (com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c) this.C.getValue();
    }

    private final f.AnonymousClass1 getSearchAdVideoPlayerSceneCallBack() {
        return (f.AnonymousClass1) this.D.getValue();
    }

    public final c getDataProvider() {
        return (c) this.o.getValue();
    }

    public final com.ss.android.ugc.aweme.newfollow.c.c getMPlayVideoHelper() {
        return (com.ss.android.ugc.aweme.newfollow.c.c) this.r.getValue();
    }

    public final i getSurfaceHolder() {
        return (i) this.q.getValue();
    }

    public final k getVideoSurfaceLifecycleListener() {
        return (k) this.y.getValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41582);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long getCurrentPosition() {
        return this.z;
    }

    public final boolean getFillHeight() {
        return this.s;
    }

    public final int getFitType() {
        return this.t;
    }

    public final boolean getMEverFullScreen() {
        return this.f67547h;
    }

    public final boolean getMIsContainerPaused() {
        return this.f67548i;
    }

    public final b.d getMPlayerMobListener() {
        return this.f67552m;
    }

    public final b.d getMPlayerViewListener() {
        return this.f67551l;
    }

    public final com.ss.android.ugc.aweme.discover.n.b getMSearchAdViewCallBack() {
        return this.f67546g;
    }

    public final f getMVideoMobListener() {
        return this.f67550k;
    }

    public final OnUIPlayListener getMVideoViewListener() {
        return this.f67549j;
    }

    public final boolean getMute() {
        return this.v;
    }

    public final boolean getRepeat() {
        return this.u;
    }

    public final String getSourceId() {
        return this.n;
    }

    static final class b extends m implements h.f.a.a<IAdSceneService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67553a = new b();

        static {
            Covode.recordClassIndex(41583);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAdSceneService invoke() {
            return AdSceneServiceImpl.f();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.newfollow.c.c> {
        final /* synthetic */ SearchPlayerCore this$0;

        static {
            Covode.recordClassIndex(41585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.this$0 = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.newfollow.c.c invoke() {
            SearchPlayerCore searchPlayerCore = this.this$0;
            return new com.ss.android.ugc.aweme.newfollow.c.c(searchPlayerCore, searchPlayerCore);
        }
    }

    static final class e extends m implements h.f.a.a<com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f67554a = new e();

        static {
            Covode.recordClassIndex(41586);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c invoke() {
            return new com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c();
        }
    }

    static final class f extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ SearchPlayerCore this$0;

        static {
            Covode.recordClassIndex(41587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.this$0 = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b(this) {
                /* class com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f67555a;

                static {
                    Covode.recordClassIndex(41588);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final int a() {
                    return (int) this.f67555a.this$0.getMPlayVideoHelper().c();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final void b() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.a();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final void c() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.b();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final void d() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.c();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final void e() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.d();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final void g() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        mSearchAdViewCallBack.f();
                    }
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.b
                public final Boolean f() {
                    com.ss.android.ugc.aweme.discover.n.b mSearchAdViewCallBack = this.f67555a.this$0.getMSearchAdViewCallBack();
                    if (mSearchAdViewCallBack != null) {
                        return mSearchAdViewCallBack.e();
                    }
                    return null;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f67555a = r1;
                }
            };
        }
    }

    static final class h extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ SearchPlayerCore this$0;

        static {
            Covode.recordClassIndex(41590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.this$0 = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new k(this) {
                /* class com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f67556a;

                static {
                    Covode.recordClassIndex(41591);
                }

                @Override // com.ss.android.ugc.playerkit.videoview.k
                public final void aB_() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f67556a = r1;
                }

                @Override // com.ss.android.ugc.playerkit.videoview.k
                public final void b(int i2, int i3) {
                    this.f67556a.this$0.a(i2, i3);
                }

                @Override // com.ss.android.ugc.playerkit.videoview.k
                public final void a(int i2, int i3) {
                    this.f67556a.this$0.getDataProvider().f67577c = false;
                    this.f67556a.this$0.a(i2, i3);
                }
            };
        }
    }

    private final com.ss.android.ugc.aweme.flowfeed.a.a getMContainerStatusProvider() {
        return getDataProvider().f67583i;
    }

    private final boolean getMIsAttached() {
        return getDataProvider().f67576b;
    }

    private final com.ss.android.ugc.aweme.flowfeed.a.b getMPlayVideoObserver() {
        return getDataProvider().f67582h;
    }

    public final Aweme getMAweme() {
        return getDataProvider().f67578d;
    }

    public final com.ss.android.ugc.aweme.video.i getMPlayer() {
        return getDataProvider().o;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return getDataProvider().f67575a;
    }

    static final class c extends m implements h.f.a.a<c> {
        final /* synthetic */ SearchPlayerCore this$0;

        static {
            Covode.recordClassIndex(41584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.this$0 = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c();
            cVar.f67580f = this.this$0.getMPlayVideoHelper();
            return cVar;
        }
    }

    static final class g extends m implements h.f.a.a<j> {
        final /* synthetic */ SearchPlayerCore this$0;

        static {
            Covode.recordClassIndex(41589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchPlayerCore searchPlayerCore) {
            super(0);
            this.this$0 = searchPlayerCore;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            j a2 = j.a(this.this$0);
            a2.a(this.this$0.getVideoSurfaceLifecycleListener());
            return a2;
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final com.ss.android.ugc.aweme.feed.d.a getMPlayStateHelper() {
        return (com.ss.android.ugc.aweme.feed.d.a) getDataProvider().f67581g.getValue();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMIsAttached(true);
        hashCode();
    }

    public final void b() {
        if (this.v) {
            getMPlayVideoHelper().g();
        } else {
            getMPlayVideoHelper().h();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        if (com.ss.android.ugc.aweme.discover.b.j.d()) {
            return this.p;
        }
        com.ss.android.ugc.aweme.video.i iVar = getMPlayVideoHelper().f112580a;
        if (iVar == null || !iVar.o()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView
    public final void onDetachedFromWindow() {
        if (getDataProvider().n) {
            super.onDetachedFromWindow();
            setMIsAttached(false);
            e eVar = getDataProvider().f67586l;
            if (eVar != null) {
                eVar.g();
            }
            hashCode();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        a();
        b.d dVar = this.f67551l;
        if (dVar != null) {
            dVar.y();
        }
        b.d dVar2 = this.f67552m;
        if (dVar2 != null) {
            dVar2.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        if (getDataProvider().f67579e) {
            getDataProvider().f67579e = false;
            return;
        }
        y();
        b.d dVar = this.f67551l;
        if (dVar != null) {
            dVar.z();
        }
        b.d dVar2 = this.f67552m;
        if (dVar2 != null) {
            dVar2.z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (android.text.TextUtils.equals(r2, r1.getSourceId()) != false) goto L_0x0039;
     */
    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.getMAweme()
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 != 0) goto L_0x0015
            h.f.b.l.b()
        L_0x0015:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.q()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r3.n
            com.ss.android.ugc.aweme.video.i r0 = r3.getMPlayer()
            if (r0 != 0) goto L_0x0026
            h.f.b.l.b()
        L_0x0026:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.q()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            java.lang.String r0 = r1.getSourceId()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0040
        L_0x0039:
            com.ss.android.ugc.aweme.newfollow.c.c r0 = r3.getMPlayVideoHelper()
            r0.d()
        L_0x0040:
            com.ss.android.ugc.aweme.autoplay.player.b$d r0 = r3.f67551l
            if (r0 == 0) goto L_0x0047
            r0.B()
        L_0x0047:
            com.ss.android.ugc.aweme.autoplay.player.b$d r0 = r3.f67552m
            if (r0 == 0) goto L_0x004e
            r0.B()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.B():void");
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        long j2;
        String str;
        com.ss.android.ugc.playerkit.simapicommon.a.i b2;
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        if (getMAweme() != null) {
            this.z = getMPlayVideoHelper().c();
            y();
            if (!(getMPlayer() == null || getMAweme() == null || (b2 = ac.b(getMAweme())) == null)) {
                s.b().i(b2);
            }
            String str2 = null;
            if (getMPlayer() != null) {
                c.a.f80840a.a(getMPlayer());
                getMPlayVideoHelper().a();
                setMPlayer(null);
            }
            c dataProvider = getDataProvider();
            com.ss.android.ugc.aweme.flowfeed.utils.b a2 = getDataProvider().a();
            if (a2 != null) {
                j2 = a2.f96174d;
            } else {
                j2 = -1;
            }
            dataProvider.B = j2;
            if (getMAweme() != null) {
                com.ss.android.ugc.aweme.flowfeed.utils.c cVar = c.a.f96181a;
                com.ss.android.ugc.aweme.flowfeed.a.a mContainerStatusProvider = getMContainerStatusProvider();
                if (mContainerStatusProvider != null) {
                    str = mContainerStatusProvider.d();
                } else {
                    str = null;
                }
                Aweme mAweme = getMAweme();
                if (mAweme == null) {
                    l.b();
                }
                String a3 = com.ss.android.ugc.aweme.flowfeed.utils.b.a(str, mAweme.getAid());
                if (!cVar.f96180a.isEmpty()) {
                    cVar.f96180a.remove(a3);
                }
                com.ss.android.ugc.aweme.flowfeed.a.a mContainerStatusProvider2 = getMContainerStatusProvider();
                if (mContainerStatusProvider2 != null) {
                    str2 = mContainerStatusProvider2.d();
                }
                Aweme mAweme2 = getMAweme();
                if (mAweme2 == null) {
                    l.b();
                }
                com.ss.android.ugc.aweme.flowfeed.utils.b.a(str2, mAweme2.getAid());
                Log.getStackTraceString(new Throwable());
            }
        }
        b.d dVar = this.f67551l;
        if (dVar != null) {
            dVar.A();
        }
        b.d dVar2 = this.f67552m;
        if (dVar2 != null) {
            dVar2.A();
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.A();
        }
    }

    public final void a() {
        if (getMAweme() != null) {
            if (getMPlayer() != null) {
                com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
                if (mPlayer == null) {
                    l.b();
                }
                if (mPlayer.q() != null) {
                    String str = this.n;
                    com.ss.android.ugc.aweme.video.i mPlayer2 = getMPlayer();
                    if (mPlayer2 == null) {
                        l.b();
                    }
                    VideoUrlModel q2 = mPlayer2.q();
                    l.b(q2, "");
                    if (!TextUtils.equals(str, q2.getSourceId())) {
                        return;
                    }
                }
            }
            if (com.ss.android.ugc.aweme.commercialize.n.b.c() != null) {
                com.ss.android.ugc.aweme.commercialize.n.b.a(null);
                com.ss.android.ugc.aweme.commercialize.n.b.f74917a = true;
            }
            this.f67545a = (int) getMPlayVideoHelper().c();
            if (com.ss.android.ugc.aweme.discover.b.j.d()) {
                getMPlayVideoHelper().d();
                onPausePlay(this.n);
            } else {
                getMPlayVideoHelper().e();
            }
            s.a().d();
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a aVar = this.A;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021d, code lost:
        if (r2 != null) goto L_0x013b;
     */
    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
        // Method dump skipped, instructions count: 554
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore.x():void");
    }

    public final void setCurrentPosition(long j2) {
        this.z = j2;
    }

    public final void setFillHeight(boolean z2) {
        this.s = z2;
    }

    public final void setMEverFullScreen(boolean z2) {
        this.f67547h = z2;
    }

    public final void setMIsContainerPaused(boolean z2) {
        this.f67548i = z2;
    }

    public final void setMPlayerMobListener(b.d dVar) {
        this.f67552m = dVar;
    }

    public final void setMPlayerViewListener(b.d dVar) {
        this.f67551l = dVar;
    }

    public final void setMSearchAdViewCallBack(com.ss.android.ugc.aweme.discover.n.b bVar) {
        this.f67546g = bVar;
    }

    public final void setMVideoMobListener(f fVar) {
        this.f67550k = fVar;
    }

    public final void setMVideoViewListener(OnUIPlayListener onUIPlayListener) {
        this.f67549j = onUIPlayListener;
    }

    public final void setMute(boolean z2) {
        this.v = z2;
    }

    public final void setRepeat(boolean z2) {
        this.u = z2;
    }

    public final void setSourceId(String str) {
        this.n = str;
    }

    private final void setMIsAttached(boolean z2) {
        getDataProvider().f67576b = z2;
    }

    private final void setMPlayVideoObserver(com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        getDataProvider().f67582h = bVar;
    }

    private final void setMPlayer(com.ss.android.ugc.aweme.video.i iVar) {
        getDataProvider().o = iVar;
    }

    public final void setMAweme(Aweme aweme) {
        getDataProvider().f67578d = aweme;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        OnUIPlayListener onUIPlayListener = this.f67549j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f2);
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.onPlayProgressChange(f2);
        }
    }

    public final void setContainerStatusProvider(com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        l.d(aVar, "");
        getDataProvider().f67583i = aVar;
    }

    public final void setFitType(int i2) {
        if (i2 >= 0 && i2 <= 1) {
            this.t = i2;
            a(this.w, this.x);
        }
    }

    public final void setVideoUiListener(f fVar) {
        l.d(fVar, "");
        getDataProvider().q = fVar;
    }

    private final boolean a(String str) {
        String str2;
        if (getMAweme() == null) {
            return false;
        }
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            str2 = mAweme.getAid();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z2) {
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f67549j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z2);
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.onBuffering(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z2) {
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f67549j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z2);
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.onDecoderBuffering(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f67549j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(lVar);
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.onRetryOnError(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        e eVar;
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompleted(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayCompleted(str);
            }
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a aVar = this.A;
            if (aVar != null) {
                aVar.a();
            }
            if (!this.u && (eVar = getDataProvider().f67586l) != null) {
                eVar.e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayCompletedFirstTime(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayCompletedFirstTime(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
        l.d(lVar, "");
        if (a(lVar.f148746a)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed(lVar);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayFailed(lVar);
            }
            this.p = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            com.ss.android.ugc.aweme.video.i mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                Integer.valueOf(mPlayer2.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayPrepare(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayPrepare(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayStop(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayStop(str);
            }
            this.p = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlaying(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlaying(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f92885a = 1;
            }
            this.n = str;
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPreparePlay(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPreparePlay(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        l.d(oVar, "");
        String id = oVar.getId();
        if (a(id)) {
            ak.INSTANCE.setVideoId(id);
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            com.ss.android.ugc.aweme.video.i mPlayer2 = getMPlayer();
            if (mPlayer2 != null) {
                mPlayer2.E();
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderFirstFrame(oVar);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onRenderFirstFrame(oVar);
            }
            this.p = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f92885a = 2;
            }
            setKeepScreenOn(true);
            this.n = str;
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onResumePlay(str);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onResumePlay(str);
            }
            this.p = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        if (a(str)) {
            com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper == null || mPlayStateHelper.f92885a != 3) {
                com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
                if (mPlayer != null) {
                    Integer.valueOf(mPlayer.hashCode());
                }
                Aweme mAweme = getMAweme();
                if (mAweme != null) {
                    mAweme.getDesc();
                }
                com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper2 = getMPlayStateHelper();
                if (mPlayStateHelper2 != null) {
                    mPlayStateHelper2.f92885a = 3;
                }
                setKeepScreenOn(false);
                getMPlayVideoObserver();
                OnUIPlayListener onUIPlayListener = this.f67549j;
                if (onUIPlayListener != null) {
                    onUIPlayListener.onPausePlay(str);
                }
                f fVar = this.f67550k;
                if (fVar != null) {
                    fVar.onPausePlay(str);
                }
                this.p = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        Integer num;
        l.d(nVar, "");
        if (!this.f67548i && a(nVar.f148789a)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            com.ss.android.ugc.aweme.player.e.a();
            com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper = getMPlayStateHelper();
            if (mPlayStateHelper != null) {
                mPlayStateHelper.f92885a = 2;
            }
            if (getMAweme() != null) {
                StringBuilder sb = new StringBuilder("Player(");
                com.ss.android.ugc.aweme.video.i mPlayer2 = getMPlayer();
                String str = null;
                if (mPlayer2 != null) {
                    num = Integer.valueOf(mPlayer2.hashCode());
                } else {
                    num = null;
                }
                String sb2 = sb.append(num).append(") onRenderReady: preload, sourceId=%s, duration=%d").toString();
                Object[] objArr = new Object[2];
                Aweme mAweme = getMAweme();
                if (mAweme != null) {
                    str = mAweme.getAid();
                }
                objArr[0] = str;
                objArr[1] = Long.valueOf(nVar.f148791c);
                l.b(com.a.a(sb2, Arrays.copyOf(objArr, 2)), "");
            }
            setKeepScreenOn(true);
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderReady(nVar);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onRenderReady(nVar);
            }
            this.p = true;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a aVar = this.A;
            if (aVar != null) {
                aVar.a(nVar);
            }
        }
    }

    public final void a(Aweme aweme) {
        setVisibility(0);
        getMPlayVideoHelper().a(aweme);
        setMAweme(aweme);
        com.ss.android.ugc.aweme.feed.d.a mPlayStateHelper = getMPlayStateHelper();
        if (mPlayStateHelper != null) {
            mPlayStateHelper.f92885a = 0;
        }
        this.f67547h = false;
        this.f67545a = 0;
        AwemeRawAd awemeRawAd = null;
        this.A = null;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && getAdSceneService() != null) {
            this.A = getAdSceneService().e();
            getSearchAdVideoPlayerDepend().f34651b = getSearchAdVideoPlayerSceneCallBack();
            getSearchAdVideoPlayerDepend().f34653c = aweme;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.c searchAdVideoPlayerDepend = getSearchAdVideoPlayerDepend();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            searchAdVideoPlayerDepend.f34652a = awemeRawAd;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.c.a.a aVar = this.A;
            if (aVar != null) {
                aVar.a(getSearchAdVideoPlayerDepend());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, com.ss.android.ugc.playerkit.model.l lVar) {
        com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
        if (mPlayer != null) {
            Integer.valueOf(mPlayer.hashCode());
        }
        OnUIPlayListener onUIPlayListener = this.f67549j;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, lVar);
        }
        f fVar = this.f67550k;
        if (fVar != null) {
            fVar.onPlayFailed(str, lVar);
        }
        this.p = false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            this.p = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onBufferedTimeMs(str, j2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onBufferedTimeMs(str, j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onBuffering(str, z2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onBuffering(str, z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onCompleteLoaded(str, z2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onCompleteLoaded(str, z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onDecoderBuffering(str, z2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onDecoderBuffering(str, z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRetryOnError(str, lVar);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onRetryOnError(str, lVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekEnd(str, z2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onSeekEnd(str, z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onRenderFirstFrame(str, oVar);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onRenderFirstFrame(str, oVar);
            }
            this.p = true;
        }
    }

    public final void a(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            this.w = i2;
            this.x = i3;
            if (this.s) {
                a(i2, i3, this.t);
                return;
            }
            Aweme mAweme = getMAweme();
            if (mAweme != null && mAweme.getVideo() != null) {
                Aweme mAweme2 = getMAweme();
                if (mAweme2 == null) {
                    l.b();
                }
                Video video = mAweme2.getVideo();
                if (video == null) {
                    l.b();
                }
                int width = video.getWidth();
                Aweme mAweme3 = getMAweme();
                if (mAweme3 == null) {
                    l.b();
                }
                Video video2 = mAweme3.getVideo();
                if (video2 == null) {
                    l.b();
                }
                int height = video2.getHeight();
                if (width > 0 && height > 0) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(1.0f, (((float) height) / ((float) width)) / (((float) i3) / ((float) i2)), (float) (i2 / 2), (float) (i3 / 2));
                    setTransform(matrix);
                }
            }
        }
    }

    private /* synthetic */ SearchPlayerCore(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayProgressChange(str, j2, j3);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onPlayProgressChange(str, j2, j3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekStart(str, i2, f2);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onSeekStart(str, i2, f2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
        if (a(str)) {
            com.ss.android.ugc.aweme.video.i mPlayer = getMPlayer();
            if (mPlayer != null) {
                Integer.valueOf(mPlayer.hashCode());
            }
            OnUIPlayListener onUIPlayListener = this.f67549j;
            if (onUIPlayListener != null) {
                onUIPlayListener.onVideoSizeChanged(str, i2, i3);
            }
            f fVar = this.f67550k;
            if (fVar != null) {
                fVar.onVideoSizeChanged(str, i2, i3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchPlayerCore(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.o = h.i.a((h.f.a.a) new c(this));
        this.q = h.i.a((h.f.a.a) new g(this));
        this.r = h.i.a((h.f.a.a) new d(this));
        this.s = true;
        this.u = true;
        this.y = h.i.a((h.f.a.a) new h(this));
        this.B = h.i.a((h.f.a.a) b.f67553a);
        this.C = h.i.a((h.f.a.a) e.f67554a);
        this.D = h.i.a((h.f.a.a) new f(this));
    }

    private final void a(int i2, int i3, int i4) {
        float f2;
        Aweme mAweme = getMAweme();
        if (mAweme != null && mAweme.getVideo() != null && i2 > 0 && i3 > 0) {
            Aweme mAweme2 = getMAweme();
            if (mAweme2 == null) {
                l.b();
            }
            Video video = mAweme2.getVideo();
            if (video == null) {
                l.b();
            }
            int width = video.getWidth();
            Aweme mAweme3 = getMAweme();
            if (mAweme3 == null) {
                l.b();
            }
            Video video2 = mAweme3.getVideo();
            if (video2 == null) {
                l.b();
            }
            int height = video2.getHeight();
            if (width > 0 && height > 0) {
                float f3 = ((float) height) / ((float) width);
                if (i4 == 0) {
                    com.ss.android.ugc.aweme.newfollow.c.g.a(i2, i3, this, f3);
                    return;
                }
                float f4 = ((float) i3) / ((float) i2);
                float f5 = 1.0f;
                if (f4 > f3) {
                    f2 = f3 / f4;
                } else {
                    f5 = f3 / f4;
                    f2 = 1.0f;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f5, f2, (float) (i2 / 2), (float) (i3 / 2));
                setTransform(matrix);
            }
        }
    }
}
