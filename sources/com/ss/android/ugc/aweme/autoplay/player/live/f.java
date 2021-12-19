package com.ss.android.ugc.aweme.autoplay.player.live;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.ak;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.k.s;
import com.ss.android.ugc.aweme.search.k.t;
import h.f.b.l;

public final class f implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67530b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e f67531a;

    /* renamed from: c  reason: collision with root package name */
    private long f67532c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f67533d;

    /* renamed from: e  reason: collision with root package name */
    private long f67534e;

    static {
        Covode.recordClassIndex(41571);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(View view, int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void e() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void h() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void j() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void k() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41572);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void d() {
        this.f67533d = 0;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void l() {
        this.f67533d = 0;
    }

    private final LiveRoomStruct m() {
        Aweme aweme = this.f67531a.f67523g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void g() {
        this.f67532c = System.currentTimeMillis();
        this.f67534e = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a() {
        this.f67533d = System.currentTimeMillis();
        if (this.f67532c >= 0) {
            this.f67532c = -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void b() {
        r rVar;
        Object obj;
        User user;
        Long l2;
        LiveRoomStruct m2 = m();
        if (m2 == null || !m2.isFinish()) {
            if (this.f67531a.f67526j && this.f67533d > 0) {
                if (this.f67531a.f67528l != null) {
                    System.currentTimeMillis();
                }
                if (this.f67534e > 0 && (rVar = this.f67531a.f67524h) != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c cVar = (c) new t().r(rVar.f121272g).p(rVar.f121273h);
                    LiveRoomStruct m3 = m();
                    Integer num = null;
                    if (m3 != null) {
                        obj = Long.valueOf(m3.ownerUserId);
                    } else {
                        LiveRoomStruct m4 = m();
                        if (m4 == null || (user = m4.owner) == null) {
                            obj = null;
                        } else {
                            obj = user.getUid();
                        }
                    }
                    ak akVar = (ak) cVar.e(String.valueOf(obj));
                    LiveRoomStruct m5 = m();
                    if (m5 != null) {
                        l2 = Long.valueOf(m5.id);
                    } else {
                        l2 = null;
                    }
                    t tVar = (t) akVar.s(String.valueOf(l2)).q("click").n(rVar.f121275j);
                    tVar.c("duration", String.valueOf(Long.valueOf(currentTimeMillis - this.f67534e)));
                    c b2 = tVar.a(rVar.f121274i).b(rVar.f121271f);
                    String str = rVar.o;
                    l.d(str, "");
                    b2.c(s.q, str);
                    t tVar2 = (t) b2.f(rVar.f121269d).g(rVar.n);
                    Aweme aweme = this.f67531a.f67523g;
                    if (aweme != null) {
                        num = Integer.valueOf(aweme.getFollowStatus());
                    }
                    tVar2.c("follow_status", String.valueOf(num));
                    tVar2.f();
                }
            }
            this.f67533d = 0;
        }
    }

    public f(e eVar) {
        l.d(eVar, "");
        this.f67531a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.live.b
    public final void a(String str) {
        l.d(str, "");
        this.f67533d = 0;
    }
}
