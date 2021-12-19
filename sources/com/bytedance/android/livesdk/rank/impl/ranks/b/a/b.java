package com.bytedance.android.livesdk.rank.impl.ranks.b.a;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class b extends com.bytedance.android.livesdk.rank.impl.ranks.b.b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f20860i = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private HashMap f20861j;

    static {
        Covode.recordClassIndex(12351);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final View a(int i2) {
        if (this.f20861j == null) {
            this.f20861j = new HashMap();
        }
        View view = (View) this.f20861j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20861j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final void g() {
        HashMap hashMap = this.f20861j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12352);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final String e() {
        return j.HOURLY_RANK.getRankName();
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final com.bytedance.android.livesdk.rank.impl.ranks.b.a d() {
        DataChannel dataChannel = this.f20877d;
        boolean z = this.f20878e;
        RankPage rankPage = this.f20879f;
        if (rankPage == null) {
            l.b();
        }
        return new a(dataChannel, z, rankPage, this.f20880g, this);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.b$b  reason: collision with other inner class name */
    static final /* synthetic */ class C0439b extends h.f.b.j implements h.f.a.b<RankPage, z> {
        static {
            Covode.recordClassIndex(12353);
        }

        C0439b(b bVar) {
            super(1, bVar, b.class, "updateData", "updateData(Lcom/bytedance/android/livesdk/rank/impl/api/model/RankPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(RankPage rankPage) {
            RankPage rankPage2 = rankPage;
            l.d(rankPage2, "");
            ((com.bytedance.android.livesdk.rank.impl.ranks.b.b) this.receiver).a(rankPage2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final void a(Rank rank, List<Rank> list) {
        l.d(rank, "");
        l.d(list, "");
        b().invoke();
        f fVar = f.a.f23366a;
        l.b(fVar, "");
        fVar.a().a(new Event("hourly_rank_jump_other_room", 36608, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (rank.getRoomId() == it.next().getRoomId()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        boolean z2 = !z;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.L = j.HOURLY_RANK.getRankName();
        enterRoomConfig.f23299c.J = "live_detail";
        enterRoomConfig.f23299c.ab = "click";
        enterRoomConfig.f23299c.K = z2;
        enterRoomConfig.f23298b.f23310b = String.valueOf(rank.getUser().getId());
        if (z2) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(rank.getRoomId()));
            roomsData.H = n.f((Collection<Long>) arrayList);
        } else if (!list.isEmpty()) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().getRoomId()));
            }
            roomsData2.H = n.f((Collection<Long>) arrayList2);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f23299c;
            f fVar2 = f.a.f23366a;
            l.b(fVar2, "");
            EnterRoomLinkSession a2 = fVar2.a();
            l.b(a2, "");
            roomsData3.A = k.b(a2.f23354b);
        }
        EnterRoomLinkSession.a(enterRoomConfig).a(new Event("hourly_rank_jump_to_live", 3840, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        com.bytedance.android.livesdk.an.a.a().a(new e(rank.getRoomId(), enterRoomConfig));
    }
}
