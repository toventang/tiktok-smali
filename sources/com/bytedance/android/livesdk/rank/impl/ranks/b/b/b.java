package com.bytedance.android.livesdk.rank.impl.ranks.b.b;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.f;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.android.livesdk.rank.impl.g;
import com.bytedance.android.livesdk.rank.impl.h;
import com.bytedance.android.livesdk.rank.impl.ranks.a.c;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class b extends com.bytedance.android.livesdk.rank.impl.ranks.b.b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f20892i = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    private HashMap f20893j;

    static {
        Covode.recordClassIndex(12372);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final View a(int i2) {
        if (this.f20893j == null) {
            this.f20893j = new HashMap();
        }
        View view = (View) this.f20893j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20893j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final void g() {
        HashMap hashMap = this.f20893j;
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
            Covode.recordClassIndex(12373);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final String e() {
        return j.WEEKLY_RANK.getRankName();
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

    static final /* synthetic */ class c extends h.f.b.j implements h.f.a.b<RankPage, z> {
        static {
            Covode.recordClassIndex(12375);
        }

        c(b bVar) {
            super(1, bVar, b.class, "resetData", "resetData(Lcom/bytedance/android/livesdk/rank/impl/api/model/RankPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(RankPage rankPage) {
            RankPage rankPage2 = rankPage;
            l.d(rankPage2, "");
            ((b) this.receiver).b(rankPage2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class d extends h.f.b.j implements h.f.a.b<RankPage, z> {
        static {
            Covode.recordClassIndex(12376);
        }

        d(b bVar) {
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

    public final void b(RankPage rankPage) {
        this.f20879f = rankPage;
        m mVar = new m(((long) rankPage.getCountdown()) * 1000);
        mVar.start();
        m mVar2 = this.f20880g;
        if (mVar2 != null) {
            mVar2.cancel();
        }
        this.f20880g = mVar;
        c().c().put(Integer.valueOf(rankPage.getRankType()), mVar);
        com.bytedance.android.livesdk.rank.impl.ranks.b.a aVar = this.f20876c;
        if (!(aVar instanceof a)) {
            aVar = null;
        }
        a aVar2 = (a) aVar;
        if (aVar2 != null) {
            aVar2.a(rankPage, mVar);
        }
        f();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0442b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20894a;

        static {
            Covode.recordClassIndex(12374);
        }

        View$OnClickListenerC0442b(b bVar) {
            this.f20894a = bVar;
        }

        public final void onClick(View view) {
            if (this.f20894a.c().f() == com.bytedance.android.livesdk.rank.impl.api.model.d.ANCHOR.getValue()) {
                DataChannel dataChannel = this.f20894a.f20877d;
                if (dataChannel != null) {
                    dataChannel.b(h.class, Integer.valueOf(com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()));
                }
            } else {
                DataChannel dataChannel2 = this.f20894a.f20877d;
                if (dataChannel2 != null) {
                    dataChannel2.b(h.class, Integer.valueOf(com.bytedance.android.livesdk.rank.impl.api.model.d.ANCHOR.getValue()));
                }
            }
            this.f20894a.a(b.a.a("livesdk_switch_rank_area_click").a(this.f20894a.f20877d)).b();
        }
    }

    public final void a(boolean z) {
        h.f.a.b<? super RankPage, z> dVar;
        RankPage rankPage = this.f20879f;
        if (rankPage != null) {
            c.a c2 = c();
            int rankType = rankPage.getRankType();
            if (z) {
                dVar = new c(this);
            } else {
                dVar = new d(this);
            }
            c2.a(rankType, this, dVar);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final void onViewCreated(View view, Bundle bundle) {
        WeeklyRankRegionInfo weeklyRankRegionInfo;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.c8t);
        l.b(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ((ConstraintLayout) a(R.id.c8t)).setOnClickListener(new View$OnClickListenerC0442b(this));
        DataChannel dataChannel = this.f20877d;
        Object obj = null;
        if (dataChannel != null && (weeklyRankRegionInfo = (WeeklyRankRegionInfo) dataChannel.b(g.class)) != null && weeklyRankRegionInfo.getRegionStatus() == com.bytedance.android.livesdk.rank.impl.api.model.c.VIEWER1_ANCHOR2.getValue()) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.c8t);
            l.b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            if (weeklyRankRegionInfo.getCurrentType() == com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) a(R.id.c1s);
                l.b(liveAutoRtlImageView, "");
                liveAutoRtlImageView.setVisibility(8);
                LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) a(R.id.c1t);
                l.b(liveAutoRtlImageView2, "");
                liveAutoRtlImageView2.setVisibility(0);
                ((LiveTextView) a(R.id.f8o)).setText(R.string.e7d);
                DataChannel dataChannel2 = this.f20877d;
                if (dataChannel2 != null) {
                    obj = dataChannel2.b(f.class);
                }
                if (l.a(obj, (Object) false)) {
                    a(b.a.a("livesdk_switch_rank_area_show").a(this.f20877d)).b();
                    return;
                }
                return;
            }
            LiveAutoRtlImageView liveAutoRtlImageView3 = (LiveAutoRtlImageView) a(R.id.c1s);
            l.b(liveAutoRtlImageView3, "");
            liveAutoRtlImageView3.setVisibility(0);
            LiveAutoRtlImageView liveAutoRtlImageView4 = (LiveAutoRtlImageView) a(R.id.c1t);
            l.b(liveAutoRtlImageView4, "");
            liveAutoRtlImageView4.setVisibility(8);
            ((LiveTextView) a(R.id.f8o)).setText(R.string.e7c);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.b
    public final void a(Rank rank, List<Rank> list) {
        String str;
        l.d(rank, "");
        l.d(list, "");
        b().invoke();
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        l.b(fVar, "");
        fVar.a().a(new Event("weekly_rank_jump_other_room", 37888, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.L = j.WEEKLY_RANK.getRankName();
        enterRoomConfig.f23299c.J = "live_detail";
        enterRoomConfig.f23299c.ab = "click";
        WeeklyRankRegionInfo g2 = c().g();
        if (g2 != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
            if (g2.getCurrentType() == com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                str = "user_live_area";
            } else {
                str = "anchor_live_area";
            }
            roomsData.aG = str;
        }
        enterRoomConfig.f23298b.f23310b = String.valueOf(rank.getUser().getId());
        if (!list.isEmpty()) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.getRoomId() > 0) {
                    arrayList.add(t);
                }
            }
            ArrayList<Rank> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
            for (Rank rank2 : arrayList2) {
                arrayList3.add(Long.valueOf(rank2.getRoomId()));
            }
            roomsData2.H = n.f((Collection<Long>) arrayList3);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f23299c;
            com.bytedance.android.livesdkapi.session.f fVar2 = f.a.f23366a;
            l.b(fVar2, "");
            EnterRoomLinkSession a2 = fVar2.a();
            l.b(a2, "");
            roomsData3.A = k.b(a2.f23354b);
        }
        EnterRoomLinkSession.a(enterRoomConfig).a(new Event("weekly_rank_jump_to_live", 5120, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        com.bytedance.android.livesdk.an.a.a().a(new e(rank.getRoomId(), enterRoomConfig));
    }
}
