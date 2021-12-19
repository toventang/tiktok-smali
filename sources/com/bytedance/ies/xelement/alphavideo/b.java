package com.bytedance.ies.xelement.alphavideo;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.live.alphaplayer.c.d;
import com.ss.android.ugc.aweme.live.alphaplayer.d.a;
import com.ss.ttm.player.m;
import com.ss.ttm.player.r;

public class b extends a<b> {

    /* renamed from: a  reason: collision with root package name */
    public m f36646a;

    /* renamed from: h  reason: collision with root package name */
    private Context f36647h;

    /* renamed from: i  reason: collision with root package name */
    private m.g f36648i = new m.g() {
        /* class com.bytedance.ies.xelement.alphavideo.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22011);
        }

        @Override // com.ss.ttm.player.m.g
        public final void a(m mVar) {
            if (b.this.f108249e != null) {
                LLog.a(4, "x-alpha-video", "Prepare success with player : [" + b.this.f36646a + "]");
                b.this.f108249e.a();
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private m.c f36649j = new m.c() {
        /* class com.bytedance.ies.xelement.alphavideo.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(22012);
        }

        @Override // com.ss.ttm.player.m.c
        public final boolean a(m mVar, int i2, int i3) {
            if (b.this.f108250f == null) {
                return false;
            }
            b.this.f108250f.a(i2, i3, "TTMediaPlayer on error");
            return false;
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private m.b f36650k = new m.b() {
        /* class com.bytedance.ies.xelement.alphavideo.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(22013);
        }

        @Override // com.ss.ttm.player.m.b
        public final void a(m mVar) {
            if (b.this.f108248d != null) {
                b.this.f108248d.a();
            }
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private m.e f36651l = new m.e() {
        /* class com.bytedance.ies.xelement.alphavideo.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(22014);
        }

        @Override // com.ss.ttm.player.m.e
        public final boolean a(m mVar, int i2, int i3) {
            if (i2 != 3 || b.this.f108251g == null) {
                return false;
            }
            b.this.f108251g.a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(22010);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final String j() {
        return b.class.getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final boolean k() {
        return this.f36646a.p();
    }

    private m l() {
        r.a(2, true);
        r.a(1, true);
        r.a(11, true);
        return e.a(this.f36647h);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final d h() {
        return new d(this.f36646a.m(), this.f36646a.l(), this.f36646a.n());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final int i() {
        m mVar = this.f36646a;
        if (mVar != null) {
            return mVar.k();
        }
        LLog.a(6, "x-alpha-video", "player is null when getCurrentPosition");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a() {
        m l2 = l();
        if (l2 != null || ((l2 = l()) != null && !l2.a())) {
            this.f36646a = l2;
            l2.a(36, 1);
            this.f36646a.a(this.f36648i);
            this.f36646a.a(this.f36649j);
            this.f36646a.a(this.f36650k);
            this.f36646a.a(this.f36651l);
            return;
        }
        throw new Exception("create ttplayer failure");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b() {
        super.b();
        LLog.a(4, "x-alpha-video", "prepareAsync() called with player : [" + this.f36646a + "]");
        this.f36646a.j();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void c() {
        LLog.a(4, "x-alpha-video", "start() called with player : [" + this.f36646a + "]");
        this.f36646a.f();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void d() {
        LLog.a(4, "x-alpha-video", "pause() called with player : [" + this.f36646a + "]");
        this.f36646a.g();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void e() {
        LLog.a(4, "x-alpha-video", "stop() called with player : [" + this.f36646a + "]");
        this.f36646a.i();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void f() {
        LLog.a(4, "x-alpha-video", "reset() called with player : [" + this.f36646a + "]");
        this.f36646a.h();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void g() {
        LLog.a(4, "x-alpha-video", "release() called with player : [" + this.f36646a + "]");
        this.f36646a.d();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(Surface surface) {
        this.f36646a.a(surface);
    }

    public b(Context context) {
        super(context);
        this.f36647h = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(String str) {
        super.a(str);
        LLog.a(4, "x-alpha-video", "setDataSource() called with player : [" + this.f36646a + "]");
        if (this.f36646a.p()) {
            this.f36646a.i();
        }
        this.f36646a.h();
        this.f36646a.a(this.f36647h, Uri.parse(str));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b(boolean z) {
        super.b(z);
        LLog.a(4, "x-alpha-video", "setScreenOnWhilePlaying(" + z + ") called with player : [" + this.f36646a + "]");
        this.f36646a.q();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(boolean z) {
        LLog.a(4, "x-alpha-video", "setLooping(" + z + ") called with player : [" + this.f36646a + "]");
        this.f36646a.a(z);
    }
}
