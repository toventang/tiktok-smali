package com.ss.android.ugc.aweme.autoplay.b;

import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.r;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final g f67310a;

    /* renamed from: b  reason: collision with root package name */
    public final r f67311b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Aweme> f67312c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<Long> f67313d;

    /* renamed from: e  reason: collision with root package name */
    public final List<RoomInfo> f67314e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f67315f;

    static {
        Covode.recordClassIndex(41459);
    }

    public h() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f67310a, hVar.f67310a) && l.a(this.f67311b, hVar.f67311b) && l.a(this.f67312c, hVar.f67312c) && l.a(this.f67313d, hVar.f67313d) && l.a(this.f67314e, hVar.f67314e) && l.a(this.f67315f, hVar.f67315f);
    }

    public final int hashCode() {
        g gVar = this.f67310a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        r rVar = this.f67311b;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        List<Aweme> list = this.f67312c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ArrayList<Long> arrayList = this.f67313d;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        List<RoomInfo> list2 = this.f67314e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l2 = this.f67315f;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "TopLiveData(cardInfo=" + this.f67310a + ", mobParam=" + this.f67311b + ", roomList=" + this.f67312c + ", roomIdList=" + this.f67313d + ", roomInfoList=" + this.f67314e + ", startCursor=" + this.f67315f + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, List list, Long l2, int i2) {
        this(null, (i2 & 2) != 0 ? null : rVar, (i2 & 4) != 0 ? null : list, null, null, (i2 & 32) == 0 ? l2 : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, r rVar, List<? extends Aweme> list, ArrayList<Long> arrayList, List<? extends RoomInfo> list2, Long l2) {
        this.f67310a = gVar;
        this.f67311b = rVar;
        this.f67312c = list;
        this.f67313d = arrayList;
        this.f67314e = list2;
        this.f67315f = l2;
    }
}
