package com.ss.android.ugc.aweme.dsp.playerservice.plugin.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.b.b;
import com.ss.android.ugc.aweme.dsp.playerservice.c.a;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;

public final class c implements j, m {

    /* renamed from: a  reason: collision with root package name */
    public d f83587a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f83588b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.b.c f83589c;

    static {
        Covode.recordClassIndex(52166);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83587a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((j) this);
        if (b.f83581c.getAndIncrement() <= 0) {
            b.a();
            ActivityStack.addAppBackGroundListener(b.f83584f);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        v().b(this);
        if (b.f83581c.decrementAndGet() <= 0) {
            b.f83582d.removeCallbacks(b.f83583e);
            ActivityStack.removeAppBackGroundListener(b.f83584f);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83587a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        this.f83589c = cVar;
        this.f83588b = false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        String a2;
        boolean z;
        String str;
        DspStruct c2;
        Aweme aweme;
        Dsp dsp;
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83589c;
        if (cVar != null && (a2 = cVar.a()) != null) {
            int h2 = v().h();
            int minDuration = b.f83580b.getCopyrightRestrictions().getMinDuration() * 1000;
            if (minDuration < 0) {
                minDuration = 30000;
            }
            if (h2 > minDuration) {
                z = true;
            } else {
                z = false;
            }
            boolean a3 = b.a(a2);
            if (z && !this.f83588b && !a3) {
                this.f83588b = true;
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = this.f83589c;
                if (cVar2 == null || (c2 = cVar2.c()) == null || (aweme = c2.getAweme()) == null || (dsp = aweme.getDsp()) == null) {
                    str = null;
                } else {
                    str = dsp.getFullClipId();
                }
                l.d(a2, "");
                if (b.f83579a.f83370a.add(a2)) {
                    if (str != null) {
                        b.f83579a.f83371b.add(str);
                    }
                    b bVar = b.f83579a;
                    l.d(a2, "");
                    bVar.f83373d = a2;
                    b.d();
                    com.ss.android.ugc.d.a.c.a(new a());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }
}
