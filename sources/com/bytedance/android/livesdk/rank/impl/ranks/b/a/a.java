package com.bytedance.android.livesdk.rank.impl.ranks.b.a;

import android.graphics.Color;
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
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.android.livesdk.rank.impl.ranks.b.a;
import com.bytedance.android.livesdk.rank.impl.ranks.b.a.b;
import com.bytedance.android.livesdk.rank.impl.view.StarHostView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i.c;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class a extends com.bytedance.android.livesdk.rank.impl.ranks.b.a {

    /* renamed from: h  reason: collision with root package name */
    public boolean f20834h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f20835i;

    /* renamed from: j  reason: collision with root package name */
    public final b f20836j;

    static {
        Covode.recordClassIndex(12339);
    }

    public final class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final LiveTextView f20845a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveTextView f20846b;

        /* renamed from: c  reason: collision with root package name */
        final StarHostView f20847c;

        /* renamed from: d  reason: collision with root package name */
        final StarHostView f20848d;

        /* renamed from: e  reason: collision with root package name */
        final StarHostView f20849e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f20850f;

        static {
            Covode.recordClassIndex(12346);
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(12349);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                a();
                return z.f158842a;
            }

            public final void a() {
                String str;
                String str2;
                LiveTextView liveTextView = this.this$0.f20845a;
                if (this.this$0.f20850f.f20835i) {
                    str = "#161823";
                } else {
                    str = "#E6FFFFFF";
                }
                liveTextView.setTextColor(Color.parseColor(str));
                LiveTextView liveTextView2 = this.this$0.f20846b;
                if (this.this$0.f20850f.f20835i) {
                    str2 = "#80161823";
                } else {
                    str2 = "#B3FFFFFF";
                }
                liveTextView2.setTextColor(Color.parseColor(str2));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$g$a  reason: collision with other inner class name */
        static final class C0437a extends m implements h.f.a.m<View, Rank, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(12347);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0437a(g gVar) {
                super(2);
                this.this$0 = gVar;
            }

            public final void a(View view, final Rank rank) {
                l.d(view, "");
                view.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.bytedance.android.livesdk.rank.impl.ranks.b.a.a.g.C0437a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C0437a f20851a;

                    static {
                        Covode.recordClassIndex(12348);
                    }

                    {
                        this.f20851a = r1;
                    }

                    public final void onClick(View view) {
                        if (rank != null) {
                            this.f20851a.this$0.f20850f.a().invoke(rank);
                        }
                    }
                });
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(View view, Rank rank) {
                a(view, rank);
                return z.f158842a;
            }
        }

        static final class c extends m implements h.f.a.m<StarHostView, Integer, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(12350);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(g gVar) {
                super(2);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(StarHostView starHostView, Integer num) {
                a(starHostView, num.intValue());
                return z.f158842a;
            }

            public final void a(StarHostView starHostView, int i2) {
                l.d(starHostView, "");
                if (this.this$0.f20850f.f20835i) {
                    if (i2 == 1) {
                        starHostView.setBackgroundResource(2131234251);
                    } else if (i2 != 2) {
                        starHostView.setBackgroundResource(2131234255);
                    } else {
                        starHostView.setBackgroundResource(2131234253);
                    }
                } else if (i2 == 1) {
                    starHostView.setBackgroundResource(2131234252);
                } else if (i2 != 2) {
                    starHostView.setBackgroundResource(2131234256);
                } else {
                    starHostView.setBackgroundResource(2131234254);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20850f = aVar;
            this.f20845a = (LiveTextView) view.findViewById(R.id.f7p);
            this.f20846b = (LiveTextView) view.findViewById(R.id.f7o);
            this.f20847c = (StarHostView) view.findViewById(R.id.e9g);
            this.f20848d = (StarHostView) view.findViewById(R.id.e9h);
            this.f20849e = (StarHostView) view.findViewById(R.id.e9i);
        }
    }

    public static final class e extends a.e<z> {
        static {
            Covode.recordClassIndex(12344);
        }

        public e() {
            super(5, z.f158842a);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final String b() {
        return j.HOURLY_RANK.getRankName();
    }

    public static final class b extends a.e<a.d> {
        static {
            Covode.recordClassIndex(12341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a.d dVar) {
            super(3, dVar);
            l.d(dVar, "");
        }
    }

    public static final class f extends a.e<List<? extends Rank>> {
        static {
            Covode.recordClassIndex(12345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List<Rank> list) {
            super(7, list);
            l.d(list, "");
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final void a(RankPage rankPage) {
        l.d(rankPage, "");
        b(rankPage);
        int size = this.f20829b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (!(this.f20829b.get(i2) instanceof b)) {
                i2++;
            } else if (i2 != -1) {
                this.f20828a.add(this.f20829b.get(i2));
            }
        }
        c(rankPage);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$a  reason: collision with other inner class name */
    public static final class C0436a implements m.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f20838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RankPage f20839c;

        static {
            Covode.recordClassIndex(12340);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.m.a
        public final void a() {
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.m.a
        public final void a(long j2) {
            boolean z;
            b bVar;
            RankPage rankPage;
            int i2 = (int) (j2 / 1000);
            a.e<?> eVar = this.f20838b.f20828a.get(this.f20837a);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.hourly.HourlyRankListAdapter.HourlyCountDownItem");
            T t = eVar.f20868b;
            t.f20865a = i2;
            if (i2 <= 180) {
                z = true;
            } else {
                z = false;
            }
            t.f20866b = z;
            this.f20838b.notifyItemChanged(this.f20837a);
            if (AutoRefreshRankListSetting.INSTANCE.getConfig().f18749a > 0 && i2 % AutoRefreshRankListSetting.INSTANCE.getConfig().f18749a == 0 && (rankPage = (bVar = this.f20838b.f20836j).f20879f) != null) {
                bVar.c().a(rankPage.getRankType(), bVar, new b.C0439b(bVar));
            }
        }

        C0436a(int i2, a aVar, RankPage rankPage) {
            this.f20837a = i2;
            this.f20838b = aVar;
            this.f20839c = rankPage;
        }
    }

    private final void c(RankPage rankPage) {
        List<Rank> ranks = rankPage.getRanks();
        int i2 = 0;
        if (ranks.size() > 3 && !this.f20834h) {
            this.f20828a.add(new a.f(ranks.subList(0, Math.min(3, ranks.size()))));
        }
        if (ranks.size() > 3 && !this.f20834h) {
            i2 = 3;
        }
        int size = ranks.size();
        while (i2 < size) {
            this.f20828a.add(new a.C0435a(ranks.get(i2)));
            if (i2 == 9) {
                this.f20828a.add(new e());
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

    private final void b(RankPage rankPage) {
        this.f20829b.clear();
        this.f20829b.addAll(this.f20828a);
        this.f20828a.clear();
        List<RankPage> subPages = rankPage.getSubPages();
        boolean z = false;
        List<Rank> list = null;
        if (subPages != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : subPages) {
                if (t.getRankType() == com.bytedance.android.livesdk.rank.api.j.HOURLY_STAR_HOST_RANK.getType()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                c.a aVar = h.i.c.Default;
                l.d(arrayList2, "");
                l.d(aVar, "");
                if (!arrayList2.isEmpty()) {
                    list = ((RankPage) n.b((Iterable) arrayList2, aVar.nextInt(arrayList2.size()))).getRanks();
                    if (list != null) {
                        z = true;
                    }
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
        }
        this.f20834h = z;
        if (z && list != null) {
            this.f20828a.add(new f(n.d((Iterable) list, 3)));
        }
    }

    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final LiveTextView f20840a;

        /* renamed from: b  reason: collision with root package name */
        final LiveTextView f20841b;

        /* renamed from: c  reason: collision with root package name */
        public final View f20842c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f20843d;

        static {
            Covode.recordClassIndex(12342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20843d = aVar;
            this.f20842c = view;
            this.f20840a = (LiveTextView) view.findViewById(R.id.exx);
            this.f20841b = (LiveTextView) view.findViewById(R.id.ey1);
        }
    }

    public final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20844a;

        static {
            Covode.recordClassIndex(12343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20844a = aVar;
            if (!aVar.f20835i) {
                view.findViewById(R.id.ani).setBackgroundColor(y.b((int) R.color.xr));
                p.a((TextView) view.findViewById(R.id.dij), (int) R.color.xs);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        int i3;
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 3) {
            if (this.f20834h) {
                i3 = R.layout.ba0;
            } else {
                i3 = R.layout.bau;
            }
            View a2 = com.a.a(from, i3, viewGroup, false);
            l.b(a2, "");
            return new c(this, a2);
        } else if (i2 == 5) {
            View a3 = com.a.a(from, R.layout.ba1, viewGroup, false);
            l.b(a3, "");
            return new d(this, a3);
        } else if (i2 != 7) {
            return super.a(viewGroup, i2);
        } else {
            View a4 = com.a.a(from, R.layout.ba2, viewGroup, false);
            l.b(a4, "");
            return new g(this, a4);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.b.a
    public final void a(RecyclerView.ViewHolder viewHolder, a.e<?> eVar) {
        Rank rank;
        Rank rank2;
        String valueOf;
        String valueOf2;
        l.d(viewHolder, "");
        l.d(eVar, "");
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            T t = eVar.f20868b;
            l.d(t, "");
            if (cVar.f20843d.f20835i) {
                cVar.f20840a.setTextColor(Color.parseColor("#161823"));
                cVar.f20841b.setTextColor(Color.parseColor("#80161823"));
                if (cVar.f20843d.f20834h) {
                    ((LiveTextView) cVar.f20842c.findViewById(R.id.f9u)).setTextColor(Color.parseColor("#161823"));
                }
            } else {
                cVar.f20840a.setTextColor(Color.parseColor("#E6FFFFFF"));
                cVar.f20841b.setTextColor(Color.parseColor("#BFFFFFFF"));
                if (cVar.f20843d.f20834h) {
                    ((LiveTextView) cVar.f20842c.findViewById(R.id.f9u)).setTextColor(Color.parseColor("#E6FFFFFF"));
                }
            }
            LiveTextView liveTextView = cVar.f20840a;
            l.b(liveTextView, "");
            int i2 = t.f20865a % 3600;
            int i3 = i2 / 60;
            int i4 = i2 % 60;
            StringBuilder sb = new StringBuilder();
            if (i3 < 10) {
                valueOf = "0".concat(String.valueOf(i3));
            } else {
                valueOf = String.valueOf(i3);
            }
            StringBuilder append = sb.append(valueOf).append(":");
            if (i4 < 10) {
                valueOf2 = "0".concat(String.valueOf(i4));
            } else {
                valueOf2 = String.valueOf(i4);
            }
            liveTextView.setText(append.append(valueOf2).toString());
            if (t.f20866b) {
                LiveTextView liveTextView2 = cVar.f20840a;
                LiveTextView liveTextView3 = cVar.f20841b;
                l.b(liveTextView3, "");
                liveTextView2.setTextColor(com.bytedance.android.live.design.b.a(liveTextView3.getContext(), (int) R.attr.ama));
            }
        } else if (viewHolder instanceof g) {
            g gVar = (g) viewHolder;
            T t2 = eVar.f20868b;
            l.d(t2, "");
            g.C0437a aVar = new g.C0437a(gVar);
            g.b bVar = new g.b(gVar);
            g.c cVar2 = new g.c(gVar);
            bVar.a();
            Rank rank3 = null;
            if (!t2.isEmpty()) {
                rank = (Rank) t2.get(0);
            } else {
                rank = null;
            }
            gVar.f20847c.a(com.bytedance.android.livesdk.rank.impl.f.b.a(rank, 1, gVar.f20850f.f20835i));
            StarHostView starHostView = gVar.f20847c;
            l.b(starHostView, "");
            aVar.a(starHostView, rank);
            StarHostView starHostView2 = gVar.f20847c;
            l.b(starHostView2, "");
            cVar2.a(starHostView2, 1);
            if (t2.size() > 1) {
                rank2 = (Rank) t2.get(1);
            } else {
                rank2 = null;
            }
            gVar.f20848d.a(com.bytedance.android.livesdk.rank.impl.f.b.a(rank2, 2, gVar.f20850f.f20835i));
            StarHostView starHostView3 = gVar.f20848d;
            l.b(starHostView3, "");
            aVar.a(starHostView3, rank2);
            StarHostView starHostView4 = gVar.f20848d;
            l.b(starHostView4, "");
            cVar2.a(starHostView4, 2);
            if (t2.size() > 2) {
                rank3 = (Rank) t2.get(2);
            }
            gVar.f20849e.a(com.bytedance.android.livesdk.rank.impl.f.b.a(rank3, 3, gVar.f20850f.f20835i));
            StarHostView starHostView5 = gVar.f20849e;
            l.b(starHostView5, "");
            aVar.a(starHostView5, rank3);
            StarHostView starHostView6 = gVar.f20849e;
            l.b(starHostView6, "");
            cVar2.a(starHostView6, 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(DataChannel dataChannel, boolean z, RankPage rankPage, com.bytedance.android.livesdk.rank.impl.f.m mVar, b bVar) {
        super(dataChannel, z);
        l.d(rankPage, "");
        l.d(bVar, "");
        this.f20835i = z;
        this.f20836j = bVar;
        b(rankPage);
        if (mVar != null) {
            int size = this.f20828a.size();
            this.f20828a.add(new b(new a.d()));
            mVar.f20724a = new C0436a(size, this, rankPage);
            c(rankPage);
        }
    }
}
