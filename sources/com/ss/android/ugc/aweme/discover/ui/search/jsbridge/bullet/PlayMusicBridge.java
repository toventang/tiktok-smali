package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import h.f.b.l;
import h.h;
import h.i;
import h.p;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PlayMusicBridge extends BaseBridgeMethod implements au, com.ss.android.ugc.aweme.autoplay.player.video.f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82687b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f82688c;

    /* renamed from: d  reason: collision with root package name */
    private final h f82689d;

    /* renamed from: e  reason: collision with root package name */
    private final h f82690e = i.a((h.f.a.a) new f(this));

    /* renamed from: f  reason: collision with root package name */
    private final String f82691f = "playMusic";

    public final class b implements u<p<? extends Integer, ? extends Long>> {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f82692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PlayMusicBridge f82693b;

        /* renamed from: c  reason: collision with root package name */
        private final Music f82694c;

        static {
            Covode.recordClassIndex(51504);
        }

        public static final class a implements com.bytedance.ies.bullet.c.c.a.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f82695a;

            /* renamed from: b  reason: collision with root package name */
            private final String f82696b = "playMusicStart";

            /* renamed from: c  reason: collision with root package name */
            private final Object f82697c;

            static {
                Covode.recordClassIndex(51505);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return this.f82696b;
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final Object b() {
                return this.f82697c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f82695a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", bVar.f82692a);
                this.f82697c = jSONObject;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.PlayMusicBridge$b$b  reason: collision with other inner class name */
        public static final class C1944b implements com.bytedance.ies.bullet.c.c.a.p {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f82698a;

            /* renamed from: b  reason: collision with root package name */
            private final String f82699b = "playMusicEnd";

            /* renamed from: c  reason: collision with root package name */
            private final Object f82700c;

            static {
                Covode.recordClassIndex(51506);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final String a() {
                return this.f82699b;
            }

            @Override // com.bytedance.ies.bullet.c.c.a.p
            public final Object b() {
                return this.f82700c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1944b(b bVar) {
                this.f82698a = bVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_extra", bVar.f82692a);
                this.f82700c = jSONObject;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(p<? extends Integer, ? extends Long> pVar) {
            com.bytedance.ies.bullet.c.c.i b2;
            com.bytedance.ies.bullet.c.e.a.c<com.bytedance.ies.bullet.c.c.i> l2;
            com.bytedance.ies.bullet.c.c.i b3;
            p<? extends Integer, ? extends Long> pVar2 = pVar;
            if (pVar2 == null) {
                return;
            }
            if (((Number) pVar2.getSecond()).longValue() != this.f82694c.getId()) {
                com.bytedance.ies.bullet.c.e.a.c<com.bytedance.ies.bullet.c.c.i> l3 = this.f82693b.l();
                if (!(l3 == null || (b2 = l3.b()) == null)) {
                    b2.onEvent(new C1944b(this));
                }
                MusicPlayHelper n = this.f82693b.n();
                if (n != null) {
                    n.a(this);
                }
            } else if (((Number) pVar2.getFirst()).intValue() == 2 && (l2 = this.f82693b.l()) != null && (b3 = l2.b()) != null) {
                b3.onEvent(new a(this));
            }
        }

        public b(PlayMusicBridge playMusicBridge, Music music, JSONObject jSONObject) {
            l.d(music, "");
            l.d(jSONObject, "");
            this.f82693b = playMusicBridge;
            this.f82694c = music;
            this.f82692a = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(51502);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    public final com.bytedance.ies.bullet.c.e.a.c<Context> k() {
        return (com.bytedance.ies.bullet.c.e.a.c) this.f82688c.getValue();
    }

    public final com.bytedance.ies.bullet.c.e.a.c<com.bytedance.ies.bullet.c.c.i> l() {
        return (com.bytedance.ies.bullet.c.e.a.c) this.f82689d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        return false;
    }

    public final MusicPlayHelper n() {
        return (MusicPlayHelper) this.f82690e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onRenderFirstFrame(o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.autoplay.player.video.f
    public final void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, com.ss.android.ugc.playerkit.model.l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51503);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends com.google.gson.b.a<Music> {
        static {
            Covode.recordClassIndex(51507);
        }

        c() {
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82691f;
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.c.e.a.c<? extends Context>> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(51508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.c.e.a.c<? extends Context> invoke() {
            return this.$contextProviderFactory.b(Context.class);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.ies.bullet.c.e.a.c<? extends com.bytedance.ies.bullet.c.c.i>> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(51509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.bullet.c.e.a.c<? extends com.bytedance.ies.bullet.c.c.i> invoke() {
            return this.$contextProviderFactory.b(com.bytedance.ies.bullet.c.c.i.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.video.f, com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        MusicPlayHelper n = n();
        if (n != null) {
            n.a();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<MusicPlayHelper> {
        final /* synthetic */ PlayMusicBridge this$0;

        static {
            Covode.recordClassIndex(51510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PlayMusicBridge playMusicBridge) {
            super(0);
            this.this$0 = playMusicBridge;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusicPlayHelper invoke() {
            Context context;
            com.bytedance.ies.bullet.c.e.a.c<Context> k2 = this.this$0.k();
            if (k2 != null) {
                context = k2.b();
            } else {
                context = null;
            }
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                return ae.a(eVar, (ad.b) null).a(MusicPlayHelper.class);
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayMusicBridge(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f82688c = h.i.a((h.f.a.a) new d(bVar));
        this.f82689d = h.i.a((h.f.a.a) new e(bVar));
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Context context;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("music");
            JSONObject optJSONObject = jSONObject.optJSONObject("music_extra");
            if (!(optString == null || optJSONObject == null)) {
                Type type = new c().type;
                GsonProvider c2 = GsonHolder.c();
                l.b(c2, "");
                Object a2 = c2.b().a(optString, type);
                l.b(a2, "");
                Music music = (Music) a2;
                music.setId(optJSONObject.optLong("id"));
                MusicPlayHelper n = n();
                if (n != null) {
                    if (n.a(music.getId()) || n.b(music.getId())) {
                        com.ss.android.ugc.aweme.autoplay.e.a.b(this);
                        n.a();
                    } else {
                        com.bytedance.ies.bullet.c.e.a.c<Context> k2 = k();
                        androidx.fragment.app.e eVar = null;
                        if (k2 != null) {
                            context = k2.b();
                        } else {
                            context = null;
                        }
                        if (context instanceof androidx.fragment.app.e) {
                            eVar = context;
                        }
                        androidx.fragment.app.e eVar2 = eVar;
                        if (eVar2 != null) {
                            com.ss.android.ugc.aweme.autoplay.e.a.a(this);
                            com.ss.android.ugc.aweme.autoplay.e.a.c(this);
                            com.ss.android.ugc.aweme.autoplay.e.a.d(this);
                            n.a(eVar2, new b(this, music, optJSONObject));
                            n.a(eVar2, music, "", 0, true, true, "");
                        }
                    }
                }
            }
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "ShowEasterEggMethod");
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
