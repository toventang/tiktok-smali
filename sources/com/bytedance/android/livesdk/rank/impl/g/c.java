package com.bytedance.android.livesdk.rank.impl.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.j;
import com.bytedance.android.livesdk.rank.impl.f.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class c extends j.a.a.c<com.bytedance.android.livesdk.rank.api.model.a, a> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.livesdk.rank.impl.widget.a f20731a;

    /* renamed from: b  reason: collision with root package name */
    public final DataChannel f20732b;

    static {
        Covode.recordClassIndex(12265);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.a $item;

        static {
            Covode.recordClassIndex(12270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.android.livesdk.rank.api.model.a aVar) {
            super(0);
            this.$item = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.$item.f20590a.getId());
            userProfileEvent.mClickUserPosition = "top_active_user_rank";
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mRankInfo = l.a(this.$item);
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$c  reason: collision with other inner class name */
    static final class C0423c extends m implements h.f.a.a<z> {
        final /* synthetic */ a $holder;
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.a $item;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0423c(c cVar, a aVar, com.bytedance.android.livesdk.rank.api.model.a aVar2) {
            super(0);
            this.this$0 = cVar;
            this.$holder = aVar;
            this.$item = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            int i2;
            LiveTextView b2 = this.$holder.b();
            if (this.this$0.f20731a != com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE || this.$item.f20591b <= 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            b2.setVisibility(i2);
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ a $holder;
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.a $item;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(12272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, a aVar, com.bytedance.android.livesdk.rank.api.model.a aVar2) {
            super(0);
            this.this$0 = cVar;
            this.$holder = aVar;
            this.$item = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            long j2;
            try {
                if (this.$holder.b().getVisibility() == 0) {
                    Room room = (Room) this.this$0.f20732b.b(df.class);
                    if (room != null) {
                        j2 = room.getOwnerUserId();
                    } else {
                        j2 = 0;
                    }
                    this.$holder.b().setText(com.bytedance.android.livesdk.rank.impl.d.b.a().a(j2, this.$item.f20591b));
                    if (this.$item.f20591b > 0) {
                        int i2 = this.$item.f20592c;
                        if (i2 == 1) {
                            this.$holder.b().setBackgroundResource(R.drawable.btg);
                        } else if (i2 == 2) {
                            this.$holder.b().setBackgroundResource(R.drawable.bth);
                        } else if (i2 == 3) {
                            this.$holder.b().setBackgroundResource(R.drawable.bti);
                        }
                    } else {
                        this.$holder.b().setBackgroundResource(R.drawable.btf);
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20733a;

        /* renamed from: b  reason: collision with root package name */
        private final h f20734b;

        /* renamed from: c  reason: collision with root package name */
        private final h f20735c;

        /* renamed from: d  reason: collision with root package name */
        private final h f20736d;

        static {
            Covode.recordClassIndex(12266);
        }

        public final ImageView a() {
            return (ImageView) this.f20734b.getValue();
        }

        public final LiveTextView b() {
            return (LiveTextView) this.f20735c.getValue();
        }

        public final HSImageView c() {
            return (HSImageView) this.f20736d.getValue();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a$a  reason: collision with other inner class name */
        static final class C0421a extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12267);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0421a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.btx);
            }
        }

        static final class b extends m implements h.f.a.a<ImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12268);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ImageView invoke() {
                return this.$itemView.findViewById(R.id.btw);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.c$a$c  reason: collision with other inner class name */
        static final class C0422c extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12269);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0422c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.evl);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view) {
            super(view);
            h.f.b.l.d(view, "");
            this.f20733a = cVar;
            this.f20734b = i.a((h.f.a.a) new b(view));
            this.f20735c = i.a((h.f.a.a) new C0422c(view));
            this.f20736d = i.a((h.f.a.a) new C0421a(view));
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20737a;

        static {
            Covode.recordClassIndex(12273);
        }

        e(b bVar) {
            this.f20737a = bVar;
        }

        public final void onClick(View view) {
            this.f20737a.a();
        }
    }

    public c(com.bytedance.android.livesdk.rank.impl.widget.a aVar, DataChannel dataChannel) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(dataChannel, "");
        this.f20731a = aVar;
        this.f20732b = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bdt, viewGroup, false);
        h.f.b.l.b(a2, "");
        return new a(this, a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(a aVar, com.bytedance.android.livesdk.rank.api.model.a aVar2) {
        a aVar3 = aVar;
        com.bytedance.android.livesdk.rank.api.model.a aVar4 = aVar2;
        h.f.b.l.d(aVar3, "");
        h.f.b.l.d(aVar4, "");
        b bVar = new b(aVar4);
        C0423c cVar = new C0423c(this, aVar3, aVar4);
        d dVar = new d(this, aVar3, aVar4);
        g.a(aVar3.a(), aVar4.f20590a.getAvatarThumb(), aVar3.a().getWidth(), aVar3.a().getHeight(), 2131234726);
        aVar3.c().setVisibility(8);
        j a2 = com.bytedance.android.livesdk.d.a.a(aVar4.f20590a);
        if (a2 != null) {
            aVar3.c().setVisibility(0);
            k.a(aVar3.c(), a2.f19085a);
        }
        aVar3.a().setOnClickListener(new e(bVar));
        cVar.a();
        dVar.a();
    }
}
