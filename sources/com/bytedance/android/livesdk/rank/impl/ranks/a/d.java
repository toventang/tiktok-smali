package com.bytedance.android.livesdk.rank.impl.ranks.a;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.android.livesdk.rank.impl.g;
import com.bytedance.android.livesdk.rank.impl.ranks.a.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import f.a.d.f;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public c.b f20807a;

    /* renamed from: b  reason: collision with root package name */
    final Map<Integer, m> f20808b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final long f20809c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20810d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f20811e;

    /* renamed from: f  reason: collision with root package name */
    private WeeklyRankRegionInfo f20812f;

    /* renamed from: g  reason: collision with root package name */
    private final long f20813g;

    /* renamed from: h  reason: collision with root package name */
    private final DataChannel f20814h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<Integer> f20815i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.d$d  reason: collision with other inner class name */
    public static final class C0434d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0434d f20822a = new C0434d();

        static {
            Covode.recordClassIndex(12327);
        }

        C0434d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12323);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final void d() {
        this.f20810d = false;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final Map<Integer, m> c() {
        return this.f20808b;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final boolean e() {
        return this.f20810d;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final int f() {
        return this.f20811e;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final WeeklyRankRegionInfo g() {
        return this.f20812f;
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final void a() {
        for (Map.Entry<Integer, m> entry : this.f20808b.entrySet()) {
            entry.getValue().cancel();
        }
        this.f20808b.clear();
        this.f20807a = null;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final void b() {
        c.b bVar = this.f20807a;
        if (bVar != null) {
            bVar.a();
        }
        if (y.e() != null) {
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = h();
            }
            if (!j.f107229h) {
                c.b bVar2 = this.f20807a;
                if (bVar2 != null) {
                    bVar2.b();
                }
                c.b bVar3 = this.f20807a;
                if (bVar3 != null) {
                    bVar3.c();
                    return;
                }
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        t<R> a2 = ((RankApi) e.a().a(RankApi.class)).getRankList(this.f20813g, this.f20809c, n.a(this.f20815i, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62), this.f20811e).a(new com.bytedance.android.livesdk.util.rxutils.f());
        c.b bVar4 = this.f20807a;
        Objects.requireNonNull(bVar4, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.dialog.RankFragment");
        a2.a(i.a((b) bVar4, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new a(this, uptimeMillis), new b(this));
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final void a(c.b bVar) {
        l.d(bVar, "");
        this.f20807a = bVar;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20818a;

        static {
            Covode.recordClassIndex(12325);
        }

        b(d dVar) {
            this.f20818a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.b bVar = this.f20818a.f20807a;
            if (bVar != null) {
                bVar.b();
            }
            c.b bVar2 = this.f20818a.f20807a;
            if (bVar2 != null) {
                bVar2.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f20820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f20821c;

        static {
            Covode.recordClassIndex(12326);
        }

        c(d dVar, int i2, h.f.a.b bVar) {
            this.f20819a = dVar;
            this.f20820b = i2;
            this.f20821c = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar.statusCode == 0 && (!((RankResponse) dVar.data).getPages().isEmpty()) && ((RankResponse) dVar.data).getPages().get(0).getRankType() == (i2 = this.f20820b)) {
                com.bytedance.android.livesdk.rank.impl.c.a.a(i2, ((RankResponse) dVar.data).getPages().get(0).getOwnerRank().getRank());
                this.f20819a.a(((RankResponse) dVar.data).getPages().get(0));
                this.f20821c.invoke(((RankResponse) dVar.data).getPages().get(0));
            }
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20816a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20817b;

        static {
            Covode.recordClassIndex(12324);
        }

        a(d dVar, long j2) {
            this.f20816a = dVar;
            this.f20817b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            long j2 = this.f20816a.f20809c;
            long j3 = this.f20817b;
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "room_id", j2);
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            com.bytedance.android.live.core.d.a.a(jSONObject, "user_id", b2.c());
            com.bytedance.android.live.core.d.c.a("ttlive_hourly_rank_list_duration", 0, SystemClock.uptimeMillis() - j3, jSONObject);
            c.b bVar = this.f20816a.f20807a;
            if (bVar != null) {
                bVar.b();
            }
            if (dVar.statusCode == 0) {
                RankResponse rankResponse = (RankResponse) dVar.data;
                if (rankResponse.getShowIndex() < rankResponse.getPages().size()) {
                    for (RankPage rankPage : rankResponse.getPages()) {
                        com.bytedance.android.livesdk.rank.impl.c.a.a(rankPage.getRankType(), rankPage.getOwnerRank().getRank());
                    }
                    Iterator<T> it = ((RankResponse) dVar.data).getPages().iterator();
                    while (it.hasNext()) {
                        this.f20816a.a((RankPage) it.next());
                    }
                    d dVar2 = this.f20816a;
                    for (RankPage rankPage2 : rankResponse.getPages()) {
                        Map<Integer, m> map = dVar2.f20808b;
                        Integer valueOf = Integer.valueOf(rankPage2.getRankType());
                        m mVar = new m(((long) rankPage2.getCountdown()) * 1000);
                        mVar.start();
                        map.put(valueOf, mVar);
                    }
                    c.b bVar2 = this.f20816a.f20807a;
                    if (bVar2 != null) {
                        l.b(rankResponse, "");
                        bVar2.a(rankResponse);
                        return;
                    }
                    return;
                }
                c.b bVar3 = this.f20816a.f20807a;
                if (bVar3 != null) {
                    bVar3.d();
                }
            }
        }
    }

    public final void a(RankPage rankPage) {
        WeeklyRankRegionInfo regionInfo;
        if (rankPage.getRankType() == com.bytedance.android.livesdk.rank.api.j.WEEKLY_RANK.getType() && (regionInfo = rankPage.getRegionInfo()) != null) {
            this.f20811e = regionInfo.getCurrentType();
            this.f20812f = regionInfo;
            DataChannel dataChannel = this.f20814h;
            if (dataChannel != null) {
                dataChannel.a(g.class, regionInfo);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.a.c.a
    public final void a(int i2, Fragment fragment, h.f.a.b<? super RankPage, z> bVar) {
        l.d(fragment, "");
        l.d(bVar, "");
        ((RankApi) e.a().a(RankApi.class)).getRankList(this.f20813g, this.f20809c, String.valueOf(i2), this.f20811e).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(i.a(fragment, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new c(this, i2, bVar), C0434d.f20822a);
    }

    public d(long j2, long j3, DataChannel dataChannel, ArrayList<Integer> arrayList, int i2) {
        l.d(arrayList, "");
        this.f20813g = j2;
        this.f20809c = j3;
        this.f20814h = dataChannel;
        this.f20815i = arrayList;
        this.f20811e = i2;
    }
}
