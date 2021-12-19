package com.bytedance.android.livesdk.rank.impl.ranks.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.view.SinglePrimaryTopView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: g  reason: collision with root package name */
    public static final c f20827g = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e<?>> f20828a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e<?>> f20829b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f20830c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super Rank, z> f20831d;

    /* renamed from: e  reason: collision with root package name */
    public final DataChannel f20832e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20833f;

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public int f20865a = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f20866b = false;

        static {
            Covode.recordClassIndex(12335);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f20865a == dVar.f20865a && this.f20866b == dVar.f20866b;
        }

        public final int hashCode() {
            int i2 = this.f20865a * 31;
            boolean z = this.f20866b;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "CountDownData(countdown=" + this.f20865a + ", highlight=" + this.f20866b + ")";
        }
    }

    static {
        Covode.recordClassIndex(12330);
    }

    public abstract void a(RecyclerView.ViewHolder viewHolder, e<?> eVar);

    public abstract void a(RankPage rankPage);

    public abstract String b();

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(12334);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f20828a.size();
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.b<? super com.bytedance.android.livesdk.rank.impl.api.model.Rank, h.z>, h.f.a.b<com.bytedance.android.livesdk.rank.impl.api.model.Rank, h.z> */
    public final h.f.a.b<Rank, z> a() {
        h.f.a.b bVar = this.f20831d;
        if (bVar == null) {
            l.a("itemClickListener");
        }
        return bVar;
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20853a;

        /* renamed from: b  reason: collision with root package name */
        private final LiveTextView f20854b;

        /* renamed from: c  reason: collision with root package name */
        private final LiveTextView f20855c;

        /* renamed from: d  reason: collision with root package name */
        private final LiveTextView f20856d;

        /* renamed from: e  reason: collision with root package name */
        private final ImageView f20857e;

        /* renamed from: f  reason: collision with root package name */
        private final HSImageView f20858f;

        /* renamed from: g  reason: collision with root package name */
        private final HSImageView f20859g;

        static {
            Covode.recordClassIndex(12332);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$b$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC0438a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Rank f20862a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f20863b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f20864c;

            static {
                Covode.recordClassIndex(12333);
            }

            View$OnClickListenerC0438a(Rank rank, b bVar, boolean z) {
                this.f20862a = rank;
                this.f20863b = bVar;
                this.f20864c = z;
            }

            public final void onClick(View view) {
                this.f20863b.f20853a.a().invoke(this.f20862a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20853a = aVar;
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.fdm);
            l.b(liveTextView, "");
            this.f20854b = liveTextView;
            LiveTextView liveTextView2 = (LiveTextView) view.findViewById(R.id.dh4);
            l.b(liveTextView2, "");
            this.f20855c = liveTextView2;
            LiveTextView liveTextView3 = (LiveTextView) view.findViewById(R.id.eks);
            l.b(liveTextView3, "");
            this.f20856d = liveTextView3;
            ImageView imageView = (ImageView) view.findViewById(R.id.fcu);
            l.b(imageView, "");
            this.f20857e = imageView;
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.bzi);
            l.b(hSImageView, "");
            this.f20858f = hSImageView;
            HSImageView hSImageView2 = (HSImageView) view.findViewById(R.id.bu1);
            l.b(hSImageView2, "");
            this.f20859g = hSImageView2;
        }

        public final void a(Rank rank, boolean z) {
            int i2;
            long j2;
            String scoreDescription;
            Room room;
            l.d(rank, "");
            a aVar = this.f20853a;
            aVar.f20830c = Math.max(aVar.f20830c, rank.getRank());
            this.f20853a.a(rank);
            this.itemView.setOnClickListener(new View$OnClickListenerC0438a(rank, this, z));
            LiveTextView liveTextView = this.f20855c;
            int rank2 = rank.getRank();
            if (rank2 == 1) {
                i2 = R.color.xo;
            } else if (rank2 == 2) {
                i2 = R.color.xp;
            } else if (rank2 != 3) {
                i2 = R.color.x5;
            } else {
                i2 = R.color.xq;
            }
            liveTextView.setTextColor(y.b(i2));
            liveTextView.setText(String.valueOf(rank.getRank()));
            this.f20854b.setText(rank.getUser().displayId);
            DataChannel dataChannel = this.f20853a.f20832e;
            if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
                j2 = 0;
            } else {
                j2 = room.getOwnerUserId();
            }
            LiveTextView liveTextView2 = this.f20856d;
            if (l.a((Object) this.f20853a.b(), (Object) j.HOURLY_RANK.getRankName())) {
                scoreDescription = com.bytedance.android.livesdk.rank.impl.d.b.a().a(j2, rank.getScore(), rank.getScoreDescription());
            } else {
                scoreDescription = rank.getScoreDescription();
            }
            liveTextView2.setText(scoreDescription);
            if (!this.f20853a.f20833f) {
                p.a((TextView) this.f20854b, (int) R.color.xu);
                p.a((TextView) this.f20856d, (int) R.color.xt);
            }
            if (z) {
                com.bytedance.android.livesdk.chatroom.g.g.a(this.f20857e, rank.getUser().getAvatarThumb(), this.f20857e.getWidth(), this.f20857e.getHeight(), 2131234726);
                if (rank.getRoomId() > 0) {
                    k.a(this.f20859g, 2131234838);
                    k.a(this.f20858f, "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
                    return;
                }
                this.f20859g.setImageDrawable(null);
                this.f20858f.setImageDrawable(null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$a  reason: collision with other inner class name */
    public static final class C0435a extends e<Rank> {
        static {
            Covode.recordClassIndex(12331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0435a(Rank rank) {
            super(2, rank);
            l.d(rank, "");
        }
    }

    public static final class f extends e<List<? extends Rank>> {
        static {
            Covode.recordClassIndex(12337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List<Rank> list) {
            super(1, list);
            l.d(list, "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        return this.f20828a.get(i2).f20867a;
    }

    public final void a(Rank rank) {
        WeeklyRankRegionInfo weeklyRankRegionInfo;
        String str;
        if (rank.getRoomId() > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "live_detail");
            hashMap.put("enter_method", b());
            hashMap.put("anchor_id", String.valueOf(rank.getUser().getId()));
            hashMap.put("room_id", String.valueOf(rank.getRoomId()));
            hashMap.put("action_type", "draw");
            hashMap.put("is_return", "0");
            DataChannel dataChannel = this.f20832e;
            if (!(dataChannel == null || (weeklyRankRegionInfo = (WeeklyRankRegionInfo) dataChannel.b(com.bytedance.android.livesdk.rank.impl.g.class)) == null)) {
                if (weeklyRankRegionInfo.getCurrentType() == com.bytedance.android.livesdk.rank.impl.api.model.d.VIEWER.getValue()) {
                    str = "user_live_area";
                } else {
                    str = "anchor_live_area";
                }
                hashMap.put("rank_area", str);
            }
            b.a.a("livesdk_live_show").a(this.f20832e).a((Map<String, String>) hashMap).b();
        }
    }

    public static class e<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f20867a;

        /* renamed from: b  reason: collision with root package name */
        public final T f20868b;

        static {
            Covode.recordClassIndex(12336);
        }

        public e(int i2, T t) {
            this.f20867a = i2;
            this.f20868b = t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        a(viewHolder, i2, true);
    }

    public a(DataChannel dataChannel, boolean z) {
        this.f20832e = dataChannel;
        this.f20833f = z;
    }

    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_y, viewGroup, false);
        l.b(a2, "");
        return new b(this, a2);
    }

    public final class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f20869a;

        /* renamed from: b  reason: collision with root package name */
        private final SinglePrimaryTopView f20870b;

        /* renamed from: c  reason: collision with root package name */
        private final SinglePrimaryTopView f20871c;

        /* renamed from: d  reason: collision with root package name */
        private final SinglePrimaryTopView f20872d;

        static {
            Covode.recordClassIndex(12338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f20869a = aVar;
            SinglePrimaryTopView singlePrimaryTopView = (SinglePrimaryTopView) view.findViewById(R.id.eso);
            l.b(singlePrimaryTopView, "");
            this.f20870b = singlePrimaryTopView;
            SinglePrimaryTopView singlePrimaryTopView2 = (SinglePrimaryTopView) view.findViewById(R.id.esp);
            l.b(singlePrimaryTopView2, "");
            this.f20871c = singlePrimaryTopView2;
            SinglePrimaryTopView singlePrimaryTopView3 = (SinglePrimaryTopView) view.findViewById(R.id.esq);
            l.b(singlePrimaryTopView3, "");
            this.f20872d = singlePrimaryTopView3;
        }

        public final void a(List<Rank> list, boolean z) {
            int i2;
            int i3;
            int i4;
            l.d(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f20869a.a((Rank) it.next());
            }
            SinglePrimaryTopView singlePrimaryTopView = this.f20870b;
            if (this.f20869a.f20833f) {
                i2 = 2131234384;
            } else {
                i2 = 2131234385;
            }
            singlePrimaryTopView.setBackground(y.c(i2));
            SinglePrimaryTopView singlePrimaryTopView2 = this.f20871c;
            if (this.f20869a.f20833f) {
                i3 = 2131234386;
            } else {
                i3 = 2131234387;
            }
            singlePrimaryTopView2.setBackground(y.c(i3));
            SinglePrimaryTopView singlePrimaryTopView3 = this.f20872d;
            if (this.f20869a.f20833f) {
                i4 = 2131234388;
            } else {
                i4 = 2131234389;
            }
            singlePrimaryTopView3.setBackground(y.c(i4));
            this.f20870b.a(this.f20869a.b(), this.f20869a.f20832e, list.get(0), true, this.f20869a.f20833f, this.f20869a.a(), z);
            this.f20871c.a(this.f20869a.b(), this.f20869a.f20832e, list.get(1), false, this.f20869a.f20833f, this.f20869a.a(), z);
            this.f20872d.a(this.f20869a.b(), this.f20869a.f20832e, list.get(2), false, this.f20869a.f20833f, this.f20869a.a(), z);
            if (this.f20869a.f20833f && list.get(0).getComboBadge() != null && list.get(0).getComboCount() > 1) {
                ViewGroup.LayoutParams layoutParams = this.f20871c.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = null;
                if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                    layoutParams = null;
                }
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 16;
                }
                ViewGroup.LayoutParams layoutParams4 = this.f20872d.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    layoutParams2 = layoutParams4;
                }
                LinearLayout.LayoutParams layoutParams5 = layoutParams2;
                if (layoutParams5 != null) {
                    layoutParams5.gravity = 16;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (!(!list.isEmpty()) || !l.a(list.get(0), (Object) "ket_not_change_avatar")) {
            a(viewHolder, i2, true);
        } else {
            a(viewHolder, i2, false);
        }
    }

    private final void a(RecyclerView.ViewHolder viewHolder, int i2, boolean z) {
        RecyclerView.ViewHolder viewHolder2;
        e<?> eVar = this.f20828a.get(i2);
        b bVar = null;
        if (!(viewHolder instanceof g)) {
            viewHolder2 = null;
        } else {
            viewHolder2 = viewHolder;
        }
        g gVar = (g) viewHolder2;
        if (gVar != null) {
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.BaseRankListAdapter.TopItem");
            gVar.a(eVar.f20868b, z);
            return;
        }
        if (viewHolder instanceof b) {
            bVar = viewHolder;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.BaseRankListAdapter.CommonItem");
            bVar2.a(eVar.f20868b, z);
            return;
        }
        l.b(eVar, "");
        a(viewHolder, eVar);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        boolean z = true;
        if (i2 != 1) {
            viewHolder = aVar.a(viewGroup, i2);
        } else {
            View a2 = com.a.a(from, R.layout.b_z, viewGroup, false);
            l.b(a2, "");
            viewHolder = new g(aVar, a2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
