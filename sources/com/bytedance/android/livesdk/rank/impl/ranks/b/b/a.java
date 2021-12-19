package com.bytedance.android.livesdk.rank.impl.ranks.b.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankListSetting;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshWeeklyRankListSetting;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.android.livesdk.rank.impl.ranks.b.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class a extends com.bytedance.android.livesdk.rank.impl.ranks.b.a {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f20884h;

    /* renamed from: i  reason: collision with root package name */
    public final b f20885i;

    static {
        Covode.recordClassIndex(12366);
    }

    public static final class d extends a.e<z> {
        static {
            Covode.recordClassIndex(12370);
        }

        public d() {
            super(6, z.f158842a);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final String b() {
        return j.WEEKLY_RANK.getRankName();
    }

    public static final class e implements m.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20890a;

        static {
            Covode.recordClassIndex(12371);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.m.a
        public final void a() {
            if (AutoRefreshWeeklyRankListSetting.INSTANCE.getValue()) {
                this.f20890a.f20885i.a(true);
            }
        }

        e(a aVar) {
            this.f20890a = aVar;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.m.a
        public final void a(long j2) {
            int i2 = (int) (j2 / 1000);
            a.e<?> eVar = this.f20890a.f20828a.get(0);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.weekly.WeeklyRankListAdapter.WeeklyCountDownItem");
            T t = eVar.f20868b;
            t.f20865a = i2;
            t.f20866b = false;
            this.f20890a.notifyItemChanged(0);
            if (AutoRefreshRankListSetting.INSTANCE.getConfig().f18750b > 0 && i2 % AutoRefreshRankListSetting.INSTANCE.getConfig().f18750b == 0) {
                this.f20890a.f20885i.a(false);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$a  reason: collision with other inner class name */
    public static final class C0440a extends a.e<a.d> {
        static {
            Covode.recordClassIndex(12367);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0440a(a.d dVar) {
            super(4, dVar);
            l.d(dVar, "");
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final void a(RankPage rankPage) {
        l.d(rankPage, "");
        List<Rank> ranks = rankPage.getRanks();
        int i2 = 0;
        if (!this.f20828a.isEmpty()) {
            this.f20829b.clear();
            this.f20829b.addAll(this.f20828a);
            a.e<?> eVar = this.f20828a.get(0);
            l.b(eVar, "");
            this.f20828a.clear();
            this.f20828a.add(eVar);
        }
        if (ranks.size() > 3) {
            this.f20828a.add(new a.f(ranks.subList(0, Math.min(3, ranks.size()))));
        }
        if (ranks.size() > 3) {
            i2 = 3;
        }
        int size = ranks.size();
        while (i2 < size) {
            this.f20828a.add(new a.C0435a(ranks.get(i2)));
            if (i2 == 19) {
                this.f20828a.add(new d());
            }
            i2++;
        }
        j.d a2 = androidx.recyclerview.widget.j.a(new com.bytedance.android.livesdk.rank.impl.ranks.b.c(this.f20829b, this.f20828a), true);
        l.b(a2, "");
        try {
            a2.a(this);
        } catch (Exception e2) {
            i.b();
            com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
        }
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final LiveTextView f20886a;

        /* renamed from: b  reason: collision with root package name */
        final LiveTextView f20887b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f20888c;

        static {
            Covode.recordClassIndex(12368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20888c = aVar;
            this.f20886a = (LiveTextView) view.findViewById(R.id.exx);
            this.f20887b = (LiveTextView) view.findViewById(R.id.ey1);
        }
    }

    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20889a;

        static {
            Covode.recordClassIndex(12369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20889a = aVar;
            if (!aVar.f20884h) {
                view.findViewById(R.id.ani).setBackgroundColor(y.b((int) R.color.xr));
                p.a((TextView) view.findViewById(R.id.dij), (int) R.color.xs);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 4) {
            View a2 = com.a.a(from, R.layout.bau, viewGroup, false);
            l.b(a2, "");
            return new b(this, a2);
        } else if (i2 != 6) {
            return super.a(viewGroup, i2);
        } else {
            View a3 = com.a.a(from, R.layout.bb6, viewGroup, false);
            l.b(a3, "");
            return new c(this, a3);
        }
    }

    public final void a(RankPage rankPage, m mVar) {
        l.d(rankPage, "");
        this.f20828a.clear();
        if (mVar != null) {
            this.f20828a.add(new C0440a(new a.d()));
            mVar.f20724a = new e(this);
        }
        a(rankPage);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final void a(RecyclerView.ViewHolder viewHolder, a.e<?> eVar) {
        l.d(viewHolder, "");
        l.d(eVar, "");
        if (!(viewHolder instanceof b)) {
            viewHolder = null;
        }
        b bVar = (b) viewHolder;
        if (bVar != null) {
            T t = eVar.f20868b;
            l.d(t, "");
            if (!bVar.f20888c.f20884h) {
                p.a((TextView) bVar.f20886a, (int) R.color.xu);
                p.a((TextView) bVar.f20887b, (int) R.color.xt);
            }
            LiveTextView liveTextView = bVar.f20886a;
            l.b(liveTextView, "");
            int i2 = t.f20865a;
            int i3 = i2 / 86400;
            int i4 = i2 % 86400;
            int i5 = i4 % 3600;
            String a2 = y.a((int) R.string.dt7, Integer.valueOf(i3), Integer.valueOf(i4 / 3600), Integer.valueOf(i5 / 60), Integer.valueOf(i5 % 60));
            l.b(a2, "");
            liveTextView.setText(a2);
            if (t.f20866b) {
                LiveTextView liveTextView2 = bVar.f20886a;
                LiveTextView liveTextView3 = bVar.f20887b;
                l.b(liveTextView3, "");
                liveTextView2.setTextColor(com.bytedance.android.live.design.b.a(liveTextView3.getContext(), (int) R.attr.ama));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(DataChannel dataChannel, boolean z, RankPage rankPage, m mVar, b bVar) {
        super(dataChannel, z);
        l.d(rankPage, "");
        l.d(bVar, "");
        this.f20884h = z;
        this.f20885i = bVar;
        a(rankPage, mVar);
    }
}
