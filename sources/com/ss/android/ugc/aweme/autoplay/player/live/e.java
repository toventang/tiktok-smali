package com.ss.android.ugc.aweme.autoplay.player.live;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.flowfeed.a.a;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import com.ss.android.ugc.aweme.live.e.c;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;

public final class e implements b.AbstractC1522b {

    /* renamed from: a  reason: collision with root package name */
    public a f67517a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.b f67518b;

    /* renamed from: c  reason: collision with root package name */
    public g f67519c;

    /* renamed from: d  reason: collision with root package name */
    public i f67520d;

    /* renamed from: e  reason: collision with root package name */
    public b.c f67521e;

    /* renamed from: f  reason: collision with root package name */
    public int f67522f;

    /* renamed from: g  reason: collision with root package name */
    public Aweme f67523g;

    /* renamed from: h  reason: collision with root package name */
    public r f67524h;

    /* renamed from: i  reason: collision with root package name */
    public c f67525i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f67526j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f67527k;

    /* renamed from: l  reason: collision with root package name */
    public c f67528l;

    /* renamed from: m  reason: collision with root package name */
    public a f67529m;

    static {
        Covode.recordClassIndex(41570);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.AbstractC1522b
    public final Aweme a() {
        return this.f67523g;
    }

    public final LiveRoomStruct b() {
        Aweme aweme = this.f67523g;
        if (aweme != null) {
            return aweme.getNewLiveRoomData();
        }
        return null;
    }

    private e() {
        this.f67517a = null;
        this.f67518b = null;
        this.f67519c = null;
        this.f67520d = null;
        this.f67521e = null;
        this.f67522f = -1;
        this.f67523g = null;
        this.f67524h = null;
        this.f67525i = null;
        this.f67526j = false;
        this.f67527k = false;
        this.f67528l = null;
        this.f67529m = null;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar = this.f67517a;
        int i11 = 0;
        if (aVar != null) {
            i2 = aVar.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = i2 * 31;
        com.ss.android.ugc.aweme.flowfeed.a.b bVar = this.f67518b;
        if (bVar != null) {
            i3 = bVar.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        g gVar = this.f67519c;
        if (gVar != null) {
            i4 = gVar.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        i iVar = this.f67520d;
        if (iVar != null) {
            i5 = iVar.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        b.c cVar = this.f67521e;
        if (cVar != null) {
            i6 = cVar.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (((i15 + i6) * 31) + this.f67522f) * 31;
        Aweme aweme = this.f67523g;
        if (aweme != null) {
            i7 = aweme.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        r rVar = this.f67524h;
        if (rVar != null) {
            i8 = rVar.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        c cVar2 = this.f67525i;
        if (cVar2 != null) {
            i9 = cVar2.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 31;
        boolean z = this.f67526j;
        int i20 = 1;
        if (z) {
            z = true;
        }
        int i21 = z ? 1 : 0;
        int i22 = z ? 1 : 0;
        int i23 = z ? 1 : 0;
        int i24 = (i19 + i21) * 31;
        if (!this.f67527k) {
            i20 = 0;
        }
        int i25 = (i24 + i20) * 31;
        c cVar3 = this.f67528l;
        if (cVar3 != null) {
            i10 = cVar3.hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 31;
        a aVar2 = this.f67529m;
        if (aVar2 != null) {
            i11 = aVar2.hashCode();
        }
        return i26 + i11;
    }

    public final String toString() {
        return "SearchLiveDataProvider(containerStatusProvider=" + this.f67517a + ", mPlayVideoObserver=" + this.f67518b + ", mScrollStateManager=" + this.f67519c + ", mScrollStateObserver=" + this.f67520d + ", searchMediaLiveHelper=" + this.f67521e + ", rank=" + this.f67522f + ", aweme=" + this.f67523g + ", itemMobParam=" + this.f67524h + ", mLivePlayHelper=" + this.f67525i + ", mLiveStarted=" + this.f67526j + ", mAttached=" + this.f67527k + ", mobListener=" + this.f67528l + ", defaultSearchLivePlayListener=" + this.f67529m + ")";
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.a(this.f67517a, eVar.f67517a) || !l.a(this.f67518b, eVar.f67518b) || !l.a(this.f67519c, eVar.f67519c) || !l.a(this.f67520d, eVar.f67520d) || !l.a(this.f67521e, eVar.f67521e) || this.f67522f != eVar.f67522f || !l.a(this.f67523g, eVar.f67523g) || !l.a(this.f67524h, eVar.f67524h) || !l.a(this.f67525i, eVar.f67525i) || this.f67526j != eVar.f67526j || this.f67527k != eVar.f67527k || !l.a(this.f67528l, eVar.f67528l) || !l.a(this.f67529m, eVar.f67529m)) {
            return false;
        }
        return true;
    }
}
