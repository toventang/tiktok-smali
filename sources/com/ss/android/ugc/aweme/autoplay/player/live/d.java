package com.ss.android.ugc.aweme.autoplay.player.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ek;
import f.a.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d extends FrameLayout implements b.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f67497f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    long f67498a;

    /* renamed from: b  reason: collision with root package name */
    long f67499b = 5000;

    /* renamed from: c  reason: collision with root package name */
    int f67500c;

    /* renamed from: d  reason: collision with root package name */
    int f67501d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67502e = true;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f67503g = h.i.a((h.f.a.a) c.f67511a);

    /* renamed from: h  reason: collision with root package name */
    private ImageView f67504h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f67505i = h.i.a((h.f.a.a) f.f67513a);

    /* renamed from: j  reason: collision with root package name */
    private d f67506j = this;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f67507k = h.i.a((h.f.a.a) i.f67516a);

    /* renamed from: l  reason: collision with root package name */
    private boolean f67508l;

    /* renamed from: m  reason: collision with root package name */
    private int f67509m;
    private com.bytedance.android.livesdkapi.depend.model.c.a n;

    static {
        Covode.recordClassIndex(41560);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public final e getDataProvider() {
        return (e) this.f67503g.getValue();
    }

    public final boolean getEnableReusePlayer() {
        return ((Boolean) this.f67505i.getValue()).booleanValue();
    }

    public final h getStatusDelegate() {
        return (h) this.f67507k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41561);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getFitType() {
        return this.f67509m;
    }

    public final com.bytedance.android.livesdkapi.depend.model.c.a getLivePlayerEntranceParam() {
        return this.n;
    }

    public final ImageView getMCoverView() {
        return this.f67504h;
    }

    public final boolean getMute() {
        return this.f67508l;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this;
    }

    static final class c extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f67511a = new c();

        static {
            Covode.recordClassIndex(41563);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e((byte) 0);
        }
    }

    static final class i extends m implements h.f.a.a<h> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f67516a = new i();

        static {
            Covode.recordClassIndex(41569);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h();
        }
    }

    private final boolean getAttached() {
        return getDataProvider().f67527k;
    }

    private final com.ss.android.ugc.aweme.flowfeed.a.a getContainerStatusProvider() {
        return getDataProvider().f67517a;
    }

    private final Aweme getMAweme() {
        return getDataProvider().f67523g;
    }

    public final com.ss.android.ugc.aweme.live.e.c getMLivePlayHelper() {
        return getDataProvider().f67525i;
    }

    public final boolean getMLiveStarted() {
        return getDataProvider().f67526j;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return getMLiveStarted();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        hashCode();
        a();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        hashCode();
        a();
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67514a;

        static {
            Covode.recordClassIndex(41567);
        }

        g(d dVar) {
            this.f67514a = dVar;
        }

        public final void run() {
            this.f67514a.getStatusDelegate().h();
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.live.e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67515a;

        static {
            Covode.recordClassIndex(41568);
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onPlayerMessage(g.b bVar, Object obj) {
            l.d(bVar, "");
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void firstFrame() {
            d dVar = this.f67515a;
            dVar.hashCode();
            dVar.getStatusDelegate().a();
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playing() {
            d dVar = this.f67515a;
            dVar.hashCode();
            dVar.getStatusDelegate().i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(d dVar) {
            this.f67515a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playPrepared(String str) {
            l.d(str, "");
            d dVar = this.f67515a;
            dVar.hashCode();
            dVar.getStatusDelegate().h();
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playerMediaError(String str) {
            l.d(str, "");
            if (!TextUtils.isEmpty(str)) {
                d dVar = this.f67515a;
                dVar.hashCode();
                dVar.getStatusDelegate().a(str);
            }
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playComplete(String str) {
            l.d(str, "");
            d dVar = this.f67515a;
            dVar.hashCode();
            dVar.hashCode();
            if (System.currentTimeMillis() - dVar.f67498a >= dVar.f67499b) {
                dVar.f67498a = System.currentTimeMillis();
                LiveRoomStruct liveRoomStruct = dVar.getLiveRoomStruct();
                if (liveRoomStruct != null) {
                    ILiveOuterService s = LiveOuterService.s();
                    l.b(s, "");
                    s.d().a(liveRoomStruct.id, new b(dVar));
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void seiUpdate(String str) {
            l.d(str, "");
            e eVar = new e(this.f67515a);
            l.d(str, "");
            l.d(eVar, "");
            ab c2 = ab.a(str).c(ek.a.f142863a);
            ek.b bVar = ek.b.f142864a;
            f.a.e.b.b.a((Object) bVar, "predicate is null");
            f.a.h.a.a(new f.a.e.e.c.h(c2, bVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new ek.c(eVar), ek.d.f142866a);
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onVideoSizeChange(TextureView textureView, int i2, int i3) {
            hashCode();
            d dVar = this.f67515a;
            dVar.hashCode();
            dVar.f67500c = i2;
            dVar.f67501d = i3;
            com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = dVar.getMLivePlayHelper();
            TextureRenderView textureRenderView = null;
            if (mLivePlayHelper != null) {
                textureRenderView = mLivePlayHelper.getTextureView();
            }
            if ((textureRenderView instanceof TextureView) && textureRenderView != null) {
                dVar.getStatusDelegate().a(textureView, i2, i3);
            }
        }
    }

    private final void e() {
        hashCode();
        getStatusDelegate().c();
    }

    public final void b() {
        ImageView imageView = this.f67504h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void c() {
        this.f67502e = true;
        ImageView imageView = this.f67504h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final String getLivePlayerTag() {
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getPlayerTag();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final LiveRoomStruct getLiveRoomStruct() {
        Aweme aweme = getDataProvider().f67523g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    public final Boolean getPlayControllerIsPlaying() {
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            return mLivePlayHelper.getLivePlayControllerIsPlaying();
        }
        return null;
    }

    public final String getStreamData() {
        LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
        if (liveRoomStruct != null) {
            return liveRoomStruct.getMultiStreamData();
        }
        return null;
    }

    static final class f extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f67513a = new f();

        static {
            Covode.recordClassIndex(41566);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            return s.d().a("enable_search_live_card_reuse_player", (Object) false);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        hashCode();
        hashCode();
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.destroy();
        }
        getStatusDelegate().l();
        setMLiveStarted(false);
    }

    public final void d() {
        if (this.f67502e) {
            this.f67502e = false;
            ImageView imageView = this.f67504h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        hashCode();
        getStatusDelegate().e();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hashCode();
        this.f67502e = true;
        setAttached(false);
        getStatusDelegate().k();
        y();
    }

    private final void f() {
        hashCode();
        hashCode();
        hashCode();
        com.ss.android.ugc.aweme.live.e.c a2 = LiveOuterService.s().a(new g(this), new h(this));
        l.b(a2, "");
        setMLivePlayHelper(a2);
        setMLiveStarted(false);
        getStatusDelegate().d();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1524d(this));
    }

    public final void a() {
        hashCode();
        setKeepScreenOn(false);
        getStatusDelegate().b();
        setMLiveStarted(false);
        if (getEnableReusePlayer()) {
            com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = getMLivePlayHelper();
            if (mLivePlayHelper != null) {
                mLivePlayHelper.pauseWithStreamData();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper2 = getMLivePlayHelper();
        if (mLivePlayHelper2 != null) {
            mLivePlayHelper2.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        com.ss.android.ugc.aweme.flowfeed.a.a containerStatusProvider;
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper;
        TVStationRoomStruct tVStationRoomStruct;
        hashCode();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            hashCode();
            if (getAttached() && (containerStatusProvider = getContainerStatusProvider()) != null && containerStatusProvider.c()) {
                com.ss.android.ugc.aweme.flowfeed.a.a containerStatusProvider2 = getContainerStatusProvider();
                if (containerStatusProvider2 == null || containerStatusProvider2.e()) {
                    LiveRoomStruct liveRoomStruct = getLiveRoomStruct();
                    if ((liveRoomStruct == null || !liveRoomStruct.isFinish()) && !getMLiveStarted()) {
                        LiveRoomStruct liveRoomStruct2 = getLiveRoomStruct();
                        if (liveRoomStruct2 == null || (tVStationRoomStruct = liveRoomStruct2.tvStationRoomStruct) == null || !tVStationRoomStruct.isIdle) {
                            LiveRoomStruct liveRoomStruct3 = getLiveRoomStruct();
                            if (liveRoomStruct3 != null) {
                                com.bytedance.android.livesdkapi.depend.model.c.a aVar = this.n;
                                if (!(aVar == null || (mLivePlayHelper = getMLivePlayHelper()) == null)) {
                                    mLivePlayHelper.setLivePlayerEntranceParam(aVar);
                                }
                                if (getEnableReusePlayer()) {
                                    com.ss.android.ugc.aweme.live.e.c mLivePlayHelper2 = getMLivePlayHelper();
                                    if (mLivePlayHelper2 != null) {
                                        mLivePlayHelper2.playWithStreamData(this.f67508l, liveRoomStruct3, this.f67506j);
                                    }
                                } else {
                                    com.ss.android.ugc.aweme.live.e.c mLivePlayHelper3 = getMLivePlayHelper();
                                    if (mLivePlayHelper3 != null) {
                                        mLivePlayHelper3.play(this.f67508l, liveRoomStruct3, this.f67506j);
                                    }
                                }
                            }
                            setMLiveStarted(true);
                            com.ss.android.ugc.aweme.flowfeed.a.b bVar = getDataProvider().f67518b;
                            if (bVar != null) {
                                bVar.a(getMAweme());
                            }
                            getStatusDelegate().g();
                            setKeepScreenOn(true);
                        }
                    }
                }
            }
        }
    }

    public final void setLivePlayerEntranceParam(com.bytedance.android.livesdkapi.depend.model.c.a aVar) {
        this.n = aVar;
    }

    public final void setMCoverView(ImageView imageView) {
        this.f67504h = imageView;
    }

    public static final class b implements com.bytedance.android.livesdkapi.service.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67510a;

        static {
            Covode.recordClassIndex(41562);
        }

        b(d dVar) {
            this.f67510a = dVar;
        }

        @Override // com.bytedance.android.livesdkapi.service.a
        public final void a(boolean z) {
            com.ss.android.ugc.aweme.live.e.c mLivePlayHelper;
            if (!z) {
                this.f67510a.a();
                if (this.f67510a.getEnableReusePlayer() && (mLivePlayHelper = this.f67510a.getMLivePlayHelper()) != null) {
                    mLivePlayHelper.stopWithStreamData();
                }
                this.f67510a.getStatusDelegate().j();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.live.d$d  reason: collision with other inner class name */
    public static final class View$OnAttachStateChangeListenerC1524d implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67512a;

        static {
            Covode.recordClassIndex(41564);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC1524d(d dVar) {
            this.f67512a = dVar;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f67512a.onAttachedToWindow();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f67512a.onDetachedFromWindow();
        }
    }

    private final void setAttached(boolean z) {
        getDataProvider().f67527k = z;
    }

    private final void setMAweme(Aweme aweme) {
        getDataProvider().f67523g = aweme;
    }

    private final void setMLiveStarted(boolean z) {
        getDataProvider().f67526j = z;
    }

    public final void setMLivePlayHelper(com.ss.android.ugc.aweme.live.e.c cVar) {
        getDataProvider().f67525i = cVar;
    }

    public final void setFitType(int i2) {
        if (i2 >= 0 && i2 <= 1) {
            this.f67509m = i2;
        }
    }

    public final void setMute(boolean z) {
        this.f67508l = z;
        com.ss.android.ugc.aweme.live.e.c mLivePlayHelper = getMLivePlayHelper();
        if (mLivePlayHelper != null) {
            mLivePlayHelper.setMute(this.f67508l);
        }
    }

    public final void a(Aweme aweme) {
        l.d(aweme, "");
        this.f67502e = true;
        setMAweme(aweme);
        setTag(aweme);
        this.n = null;
        getStatusDelegate().f();
    }

    static final class e extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(41565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            if (num.intValue() != 1) {
                if (this.this$0.f67502e) {
                    this.this$0.d();
                }
            } else if (!this.this$0.f67502e) {
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.f.a.a<? extends com.ss.android.ugc.aweme.autoplay.player.live.b> r4) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r4, r2)
            java.lang.Object r1 = r4.invoke()
            r3.hashCode()
            if (r1 == 0) goto L_0x0015
            int r0 = r1.hashCode()
            java.lang.Integer.valueOf(r0)
        L_0x0015:
            com.ss.android.ugc.aweme.autoplay.player.live.h r0 = r3.getStatusDelegate()
            if (r1 != 0) goto L_0x001c
            return
        L_0x001c:
            h.f.b.l.d(r1, r2)
            java.util.List r0 = r0.m()
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.player.live.d.a(h.f.a.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.d(context, "");
        MethodCollector.i(2208);
        e();
        f();
        MethodCollector.o(2208);
    }
}
