package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g;
import com.ss.android.ugc.aweme.comment.c.c;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.r;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import h.f.b.l;

public final class bb implements j {

    /* renamed from: a  reason: collision with root package name */
    public final ag f91673a;

    /* renamed from: b  reason: collision with root package name */
    public final c f91674b;

    /* renamed from: c  reason: collision with root package name */
    public final r f91675c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.challenge.d.c f91676d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.j.j f91677e;

    /* renamed from: f  reason: collision with root package name */
    public final a f91678f;

    /* renamed from: g  reason: collision with root package name */
    public final ae f91679g;

    /* renamed from: h  reason: collision with root package name */
    public final e f91680h;

    /* renamed from: i  reason: collision with root package name */
    public final FollowStatusEvent f91681i;

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.android.live.base.a.a f91682j;

    /* renamed from: k  reason: collision with root package name */
    public final g f91683k;

    /* renamed from: l  reason: collision with root package name */
    public final InteractionTagInfoEvent f91684l;

    static {
        Covode.recordClassIndex(57731);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return l.a(this.f91673a, bbVar.f91673a) && l.a(this.f91674b, bbVar.f91674b) && l.a(this.f91675c, bbVar.f91675c) && l.a(this.f91676d, bbVar.f91676d) && l.a(this.f91677e, bbVar.f91677e) && l.a(this.f91678f, bbVar.f91678f) && l.a(this.f91679g, bbVar.f91679g) && l.a(this.f91680h, bbVar.f91680h) && l.a(this.f91681i, bbVar.f91681i) && l.a(this.f91682j, bbVar.f91682j) && l.a(this.f91683k, bbVar.f91683k) && l.a(this.f91684l, bbVar.f91684l);
    }

    public final int hashCode() {
        ag agVar = this.f91673a;
        int i2 = 0;
        int hashCode = (agVar != null ? agVar.hashCode() : 0) * 31;
        c cVar = this.f91674b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        r rVar = this.f91675c;
        int hashCode3 = (hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.challenge.d.c cVar2 = this.f91676d;
        int hashCode4 = (hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.shortvideo.j.j jVar = this.f91677e;
        int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        a aVar = this.f91678f;
        int hashCode6 = (hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ae aeVar = this.f91679g;
        int hashCode7 = (hashCode6 + (aeVar != null ? aeVar.hashCode() : 0)) * 31;
        e eVar = this.f91680h;
        int hashCode8 = (hashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        FollowStatusEvent followStatusEvent = this.f91681i;
        int hashCode9 = (hashCode8 + (followStatusEvent != null ? followStatusEvent.hashCode() : 0)) * 31;
        com.bytedance.android.live.base.a.a aVar2 = this.f91682j;
        int hashCode10 = (hashCode9 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        g gVar = this.f91683k;
        int hashCode11 = (hashCode10 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        InteractionTagInfoEvent interactionTagInfoEvent = this.f91684l;
        if (interactionTagInfoEvent != null) {
            i2 = interactionTagInfoEvent.hashCode();
        }
        return hashCode11 + i2;
    }

    public final String toString() {
        return "VideoEventDispatchState(videoEvent=" + this.f91673a + ", commentEvent=" + this.f91674b + ", diggEvent=" + this.f91675c + ", profileFollowEvent=" + this.f91676d + ", playerEvent=" + this.f91677e + ", onAwesomeSplashEvent=" + this.f91678f + ", shareEndEvent=" + this.f91679g + ", playProgressEvent=" + this.f91680h + ", followStatus=" + this.f91681i + ", roomStatusEvent=" + this.f91682j + ", topViewLiveEndEvent=" + this.f91683k + ", interactionTagInfoEvent=" + this.f91684l + ")";
    }

    public /* synthetic */ bb() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    private bb(ag agVar, c cVar, r rVar, com.ss.android.ugc.aweme.challenge.d.c cVar2, com.ss.android.ugc.aweme.shortvideo.j.j jVar, a aVar, ae aeVar, e eVar, FollowStatusEvent followStatusEvent, com.bytedance.android.live.base.a.a aVar2, g gVar, InteractionTagInfoEvent interactionTagInfoEvent) {
        this.f91673a = agVar;
        this.f91674b = cVar;
        this.f91675c = rVar;
        this.f91676d = cVar2;
        this.f91677e = jVar;
        this.f91678f = aVar;
        this.f91679g = aeVar;
        this.f91680h = eVar;
        this.f91681i = followStatusEvent;
        this.f91682j = aVar2;
        this.f91683k = gVar;
        this.f91684l = interactionTagInfoEvent;
    }

    public static /* synthetic */ bb a(bb bbVar, ag agVar, c cVar, r rVar, com.ss.android.ugc.aweme.challenge.d.c cVar2, com.ss.android.ugc.aweme.shortvideo.j.j jVar, a aVar, ae aeVar, e eVar, FollowStatusEvent followStatusEvent, com.bytedance.android.live.base.a.a aVar2, g gVar, InteractionTagInfoEvent interactionTagInfoEvent, int i2) {
        InteractionTagInfoEvent interactionTagInfoEvent2 = interactionTagInfoEvent;
        g gVar2 = gVar;
        com.ss.android.ugc.aweme.challenge.d.c cVar3 = cVar2;
        r rVar2 = rVar;
        c cVar4 = cVar;
        ag agVar2 = agVar;
        com.ss.android.ugc.aweme.shortvideo.j.j jVar2 = jVar;
        a aVar3 = aVar;
        ae aeVar2 = aeVar;
        e eVar2 = eVar;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        com.bytedance.android.live.base.a.a aVar4 = aVar2;
        if ((i2 & 1) != 0) {
            agVar2 = bbVar.f91673a;
        }
        if ((i2 & 2) != 0) {
            cVar4 = bbVar.f91674b;
        }
        if ((i2 & 4) != 0) {
            rVar2 = bbVar.f91675c;
        }
        if ((i2 & 8) != 0) {
            cVar3 = bbVar.f91676d;
        }
        if ((i2 & 16) != 0) {
            jVar2 = bbVar.f91677e;
        }
        if ((i2 & 32) != 0) {
            aVar3 = bbVar.f91678f;
        }
        if ((i2 & 64) != 0) {
            aeVar2 = bbVar.f91679g;
        }
        if ((i2 & 128) != 0) {
            eVar2 = bbVar.f91680h;
        }
        if ((i2 & 256) != 0) {
            followStatusEvent2 = bbVar.f91681i;
        }
        if ((i2 & 512) != 0) {
            aVar4 = bbVar.f91682j;
        }
        if ((i2 & 1024) != 0) {
            gVar2 = bbVar.f91683k;
        }
        if ((i2 & 2048) != 0) {
            interactionTagInfoEvent2 = bbVar.f91684l;
        }
        return new bb(agVar2, cVar4, rVar2, cVar3, jVar2, aVar3, aeVar2, eVar2, followStatusEvent2, aVar4, gVar2, interactionTagInfoEvent2);
    }
}
