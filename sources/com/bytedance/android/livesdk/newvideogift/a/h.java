package com.bytedance.android.livesdk.newvideogift.a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.d;
import com.ss.android.ugc.aweme.live.alphaplayer.d.a;
import com.ss.ttm.player.m;
import com.ss.ttm.player.r;

public final class h extends a<h> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f19907a;

    /* renamed from: h  reason: collision with root package name */
    private m f19908h;

    /* renamed from: i  reason: collision with root package name */
    private m.g f19909i = new m.g() {
        /* class com.bytedance.android.livesdk.newvideogift.a.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11781);
        }

        @Override // com.ss.ttm.player.m.g
        public final void a(m mVar) {
            if (h.this.f108249e != null) {
                h.this.f108249e.a();
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private m.c f19910j = new m.c() {
        /* class com.bytedance.android.livesdk.newvideogift.a.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(11782);
        }

        @Override // com.ss.ttm.player.m.c
        public final boolean a(m mVar, int i2, int i3) {
            if (h.this.f108250f == null) {
                return false;
            }
            h.this.f108250f.a(i2, i3, "TTMediaPlayer on error");
            return false;
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private m.b f19911k = new m.b() {
        /* class com.bytedance.android.livesdk.newvideogift.a.h.AnonymousClass3 */

        static {
            Covode.recordClassIndex(11783);
        }

        @Override // com.ss.ttm.player.m.b
        public final void a(m mVar) {
            if (h.this.f108248d != null) {
                h.this.f108248d.a();
            }
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private m.e f19912l = new m.e() {
        /* class com.bytedance.android.livesdk.newvideogift.a.h.AnonymousClass4 */

        static {
            Covode.recordClassIndex(11784);
        }

        @Override // com.ss.ttm.player.m.e
        public final boolean a(m mVar, int i2, int i3) {
            if (i2 != 3 || h.this.f108251g == null) {
                return false;
            }
            h.this.f108251g.a();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(11780);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final String j() {
        return "TTGiftPlayerImpl";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final int i() {
        return this.f19908h.k();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final boolean k() {
        return this.f19908h.p();
    }

    private m l() {
        r.a(2, false);
        r.a(1, true);
        r.a(11, true);
        return f.a(this.f19907a);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final d h() {
        return new d(this.f19908h.m(), this.f19908h.l(), this.f19908h.n());
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "prepareAsync() called with player : [" + this.f19908h + "]");
        this.f19908h.b(false);
        super.b();
        this.f19908h.j();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void c() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "start() called with player : [" + this.f19908h + "]");
        this.f19908h.f();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void d() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "pause() called with player : [" + this.f19908h + "]");
        this.f19908h.g();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void e() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "stop() called with player : [" + this.f19908h + "]");
        this.f19908h.i();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void f() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "reset() called with player : [" + this.f19908h + "]");
        this.f19908h.h();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void g() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "release() called with player : [" + this.f19908h + "]");
        this.f19908h.d();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a() {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "initMediaPlayer() called");
        if (com.bytedance.android.livesdk.h.a.Player.isInstalled()) {
            m l2 = l();
            if (l2 != null || ((l2 = l()) != null && !l2.a())) {
                this.f19908h = l2;
                l2.a(36, 1);
                this.f19908h.a(this.f19909i);
                this.f19908h.a(this.f19910j);
                this.f19908h.a(this.f19911k);
                this.f19908h.a(this.f19912l);
                this.f19908h.a(59, 1);
                return;
            }
            throw new Exception("create ttplayer failure");
        }
        throw new IllegalStateException("ttm plugin not installed");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(boolean z) {
        this.f19908h.a(z);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void b(boolean z) {
        super.b(z);
        this.f19908h.q();
    }

    public h(Context context) {
        super(context);
        this.f19907a = context;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(Surface surface) {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "setSurface() called with player : [" + this.f19908h + "]");
        this.f19908h.a(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.d.c, com.ss.android.ugc.aweme.live.alphaplayer.d.a
    public final void a(String str) {
        com.bytedance.android.live.core.c.a.a(3, "Alpha-TTPlayer", "setDataSource() called with player : [" + this.f19908h + "]");
        super.a(str);
        if (this.f19908h.p()) {
            this.f19908h.i();
        }
        this.f19908h.h();
        this.f19908h.a(this.f19907a, Uri.parse(str));
    }
}
