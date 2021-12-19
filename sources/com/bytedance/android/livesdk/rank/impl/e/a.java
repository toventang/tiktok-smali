package com.bytedance.android.livesdk.rank.impl.e;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.rank.api.model.g;
import com.bytedance.android.livesdk.rank.api.model.h;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.b.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements b.AbstractC0416b {

    /* renamed from: a  reason: collision with root package name */
    public b.c f20668a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.android.livesdk.rank.impl.widget.a f20669b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f20670c;

    /* renamed from: d  reason: collision with root package name */
    private String f20671d = "";

    static {
        Covode.recordClassIndex(12219);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.AbstractC0416b
    public final String c() {
        return this.f20671d;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.AbstractC0416b
    public final void b() {
        f.a.b.b bVar = this.f20670c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.AbstractC0416b
    public final void a() {
        try {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                boolean z = true;
                if (!(id == 0 || ownerUserId == 0)) {
                    f b2 = u.a().b();
                    l.b(b2, "");
                    if (b2.c() != ownerUserId) {
                        z = false;
                    }
                    this.f20670c = ((RankApi) e.a().a(RankApi.class)).getOnlineRankList(id, ownerUserId).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new C0417a(this, z), new b(this));
                    return;
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.b.b.AbstractC0416b
    public final void a(b.c cVar) {
        l.d(cVar, "");
        this.f20668a = cVar;
    }

    public a(com.bytedance.android.livesdk.rank.impl.widget.a aVar) {
        l.d(aVar, "");
        this.f20669b = aVar;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20674a;

        static {
            Covode.recordClassIndex(12221);
        }

        b(a aVar) {
            this.f20674a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.c cVar = this.f20674a.f20668a;
            if (cVar != null) {
                cVar.g();
            }
            b.c cVar2 = this.f20674a.f20668a;
            if (cVar2 != null) {
                cVar2.e();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.a$a  reason: collision with other inner class name */
    static final class C0417a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f20673b;

        static {
            Covode.recordClassIndex(12220);
        }

        C0417a(a aVar, boolean z) {
            this.f20672a = aVar;
            this.f20673b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            b.c cVar;
            b.c cVar2;
            d dVar = (d) obj;
            if (dVar != null) {
                try {
                    g gVar = (g) dVar.data;
                    if (!(gVar == null || gVar.f20601a == null)) {
                        b.c cVar3 = this.f20672a.f20668a;
                        if (cVar3 != null) {
                            cVar3.g();
                        }
                        com.bytedance.android.livesdk.rank.impl.d.b.a().f20664d = ((g) dVar.data).f20601a;
                        com.bytedance.android.livesdk.rank.impl.d.b a2 = com.bytedance.android.livesdk.rank.impl.d.b.a();
                        h hVar = ((g) dVar.data).f20602b;
                        if (hVar != null) {
                            j2 = hVar.f20608b;
                        } else {
                            j2 = 0;
                        }
                        a2.f20666f = j2;
                        List<h> list = ((g) dVar.data).f20601a;
                        String str = "";
                        l.b(list, str);
                        List<T> g2 = n.g((Iterable) list);
                        ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
                        for (T t : g2) {
                            arrayList.add(com.bytedance.android.livesdk.rank.impl.f.a.a(t));
                        }
                        List<com.bytedance.android.livesdk.rank.api.model.b> d2 = n.d((Iterable) arrayList, 99);
                        if (d2.isEmpty()) {
                            if (this.f20673b && (cVar2 = this.f20672a.f20668a) != null) {
                                cVar2.d();
                            }
                        } else if (this.f20672a.f20669b == com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
                            b.c cVar4 = this.f20672a.f20668a;
                            if (cVar4 != null) {
                                String str2 = ((g) dVar.data).f20603c;
                                l.b(str2, str);
                                cVar4.a(d2, str2);
                            }
                        } else {
                            b.c cVar5 = this.f20672a.f20668a;
                            if (cVar5 != null) {
                                cVar5.a(d2);
                            }
                        }
                        if (!(this.f20673b || (cVar = this.f20672a.f20668a) == null)) {
                            h hVar2 = ((g) dVar.data).f20602b;
                            l.b(hVar2, str);
                            com.bytedance.android.livesdk.rank.api.model.b a3 = com.bytedance.android.livesdk.rank.impl.f.a.a(hVar2);
                            String str3 = ((g) dVar.data).f20603c;
                            if (str3 != null) {
                                str = str3;
                            }
                            cVar.a(a3, str);
                            return;
                        }
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    b.c cVar6 = this.f20672a.f20668a;
                    if (cVar6 != null) {
                        cVar6.e();
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
