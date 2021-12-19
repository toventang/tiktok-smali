package com.bytedance.android.livesdk.newvideogift.a;

import android.content.Context;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.e;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTTplayerUseHardcoreSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.live.alphaplayer.c.d;
import com.ss.android.ugc.aweme.live.alphaplayer.d.a;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.engine.ShortVideoAudioPushManager;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.s.c;

public final class g extends a<g> {

    /* renamed from: a  reason: collision with root package name */
    private aj f19902a;

    /* renamed from: h  reason: collision with root package name */
    private long f19903h;

    /* renamed from: i  reason: collision with root package name */
    private AudioDeviceModule.AudioRenderSink f19904i;

    /* renamed from: j  reason: collision with root package name */
    private bb f19905j = new bb() {
        /* class com.bytedance.android.livesdk.newvideogift.a.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11779);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2, int i3) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar) {
            if (g.this.f108249e != null) {
                g.this.f108249e.a();
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar) {
            if (g.this.f108251g != null) {
                g.this.f108251g.a();
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar) {
            if (g.this.f108248d != null) {
                g.this.f108248d.a();
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(c cVar) {
            if (g.this.f108250f != null) {
                g.this.f108250f.a(cVar.f153260a, cVar.f153261b, cVar.f153263d);
            }
        }
    };

    static {
        Covode.recordClassIndex(11778);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final String j() {
        return "TTEnginePlayerImpl";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final int i() {
        return this.f19902a.s();
    }

    private static LiveCore m() {
        com.bytedance.android.live.broadcast.api.d.a aVar = (com.bytedance.android.live.broadcast.api.d.a) DataChannelGlobal.f34575d.b(e.class);
        if (aVar == null) {
            return null;
        }
        return aVar.e();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final d h() {
        return new d(this.f19902a.u(), this.f19902a.v(), this.f19902a.x);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "prepareAsync() called with player : [" + this.f19902a + "]");
        this.f108249e.a();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void c() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "start() called with player : [" + this.f19902a + "]");
        this.f19902a.k();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void d() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "pause() called with player : [" + this.f19902a + "]");
        this.f19902a.l();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void e() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "stop() called with player : [" + this.f19902a + "]");
        this.f19902a.m();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void g() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "release() called with player : [" + this.f19902a + "]");
        this.f19902a.n();
    }

    private void l() {
        if (m() != null) {
            m().getADM().startPlayer();
            AudioDeviceModule.AudioRenderSink createRenderSink = m().getADM().createRenderSink();
            this.f19904i = createRenderSink;
            createRenderSink.setQuirks(0);
            long audioLongAddress = ShortVideoAudioPushManager.getAudioLongAddress(this.f19904i, m().getBuilder().getAudioSampleHZ(), m().getBuilder().getAudioChannel());
            if (audioLongAddress < 0) {
                audioLongAddress &= 4294967295L;
            }
            this.f19903h = audioLongAddress;
            return;
        }
        this.f19903h = 0;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "initMediaPlayer() called");
        l();
        aj ajVar = new aj(this.f108247c, 0);
        this.f19902a = ajVar;
        if (!ajVar.p()) {
            this.f19902a.f(4, 1);
            this.f19902a.f(216, 1);
            this.f19902a.f(610, 0);
            this.f19902a.a(this.f19905j);
            if (LiveGiftTTplayerUseHardcoreSetting.INSTANCE.getValue() == 1) {
                this.f19902a.f(7, 1);
                com.bytedance.android.live.core.c.a.a(3, "PlayerType", "PlayerType HARDCODE");
                return;
            }
            com.bytedance.android.live.core.c.a.a(3, "PlayerType", "PlayerType SOFT DECODE");
            return;
        }
        throw new Exception("create ttVideoEngine failure");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(boolean z) {
        this.f19902a.h(z);
    }

    public g(Context context) {
        super(context);
        this.f108247c = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(Surface surface) {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "setSurface() called with player : [" + this.f19902a + "]");
        this.f19902a.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(String str) {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTEngine", "setDataSource() called with player : [" + this.f19902a + "]");
        this.f19902a.f(str);
        l();
        long j2 = this.f19903h;
        if (j2 != 0) {
            this.f19902a.c(440, j2);
            this.f19902a.f(430, 2);
        }
    }
}
