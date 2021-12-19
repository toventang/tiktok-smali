package com.bytedance.android.livesdk.rank.impl.g;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.rank.impl.f.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e extends j.a.a.c<com.bytedance.android.livesdk.rank.api.model.b, b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20749b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f20750a;

    static {
        Covode.recordClassIndex(12284);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12285);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$e  reason: collision with other inner class name */
    public static final class C0429e implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b f20762b;

        static {
            Covode.recordClassIndex(12298);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final com.bytedance.android.livesdk.rank.api.model.b c() {
            return this.f20762b;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final void b() {
            this.f20761a.b().setVisibility(0);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$e$a */
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0429e f20763a;

            static {
                Covode.recordClassIndex(12299);
            }

            a(C0429e eVar) {
                this.f20763a = eVar;
            }

            public final void run() {
                Animatable animatable = this.f20763a.f20761a.f20755e;
                if (animatable != null && animatable.isRunning()) {
                    Animatable animatable2 = this.f20763a.f20761a.f20755e;
                    if (animatable2 != null) {
                        animatable2.stop();
                    }
                    this.f20763a.f20761a.b().setVisibility(8);
                }
            }
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final void a() {
            try {
                Animatable animatable = this.f20761a.f20755e;
                if (animatable == null || !(!animatable.isRunning())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Animatable animatable2 = this.f20761a.f20755e;
                if (animatable2 != null) {
                    animatable2.start();
                }
                this.f20761a.b().postDelayed(new a(this), 1240);
            } catch (IllegalStateException unused) {
            }
        }

        C0429e(b bVar, com.bytedance.android.livesdk.rank.api.model.b bVar2) {
            this.f20761a = bVar;
            this.f20762b = bVar2;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ b $holder;
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b $item;

        static {
            Covode.recordClassIndex(12294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, com.bytedance.android.livesdk.rank.api.model.b bVar2) {
            super(0);
            this.$holder = bVar;
            this.$item = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            int i2;
            HSImageView b2 = this.$holder.b();
            if (com.bytedance.android.livesdk.rank.impl.f.c.a(this.$item) || !com.bytedance.android.livesdk.rank.impl.f.c.a()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            b2.setVisibility(i2);
            b2.setOnClickListener(new a(this));
            com.facebook.drawee.a.a.e a2 = com.facebook.drawee.a.a.c.b().a(HSAnimImageView.f9268i.a("tiktok_live_interaction_resource", "ttlive_rank_follow_anim.webp"));
            a2.f47319g = new b(this);
            b2.setController(a2.e());
        }

        public static final class b extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f20760a;

            static {
                Covode.recordClassIndex(12296);
            }

            b(c cVar) {
                this.f20760a = cVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                l.d(str, "");
                this.f20760a.$holder.f20755e = animatable;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f20759a;

            static {
                Covode.recordClassIndex(12295);
            }

            a(c cVar) {
                this.f20759a = cVar;
            }

            public final void onClick(View view) {
                com.bytedance.android.livesdk.rank.impl.f.c.a(this.f20759a.$item.f20593a.getId());
            }
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ b $holder;
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b $item;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(12297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, com.bytedance.android.livesdk.rank.api.model.b bVar, b bVar2) {
            super(0);
            this.this$0 = eVar;
            this.$item = bVar;
            this.$holder = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Room room;
            long j2 = 0;
            if (this.$item.f20595c > 0) {
                DataChannel dataChannel = this.this$0.f20750a;
                if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null)) {
                    j2 = room.getOwnerUserId();
                }
                this.$holder.a().setText(com.bytedance.android.livesdk.rank.impl.d.b.a().a(j2, this.$item.f20595c));
                return;
            }
            this.$holder.a().setText("");
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f20751a;

        /* renamed from: b  reason: collision with root package name */
        final h f20752b;

        /* renamed from: c  reason: collision with root package name */
        final h f20753c;

        /* renamed from: d  reason: collision with root package name */
        final h f20754d;

        /* renamed from: e  reason: collision with root package name */
        public Animatable f20755e;

        /* renamed from: f  reason: collision with root package name */
        private final h f20756f;

        /* renamed from: g  reason: collision with root package name */
        private final h f20757g;

        /* renamed from: h  reason: collision with root package name */
        private final h f20758h;

        static {
            Covode.recordClassIndex(12286);
        }

        public final LiveTextView a() {
            return (LiveTextView) this.f20756f.getValue();
        }

        public final HSImageView b() {
            return (HSImageView) this.f20757g.getValue();
        }

        public final HSImageView c() {
            return (HSImageView) this.f20758h.getValue();
        }

        static final class a extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12287);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.b7n);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$b  reason: collision with other inner class name */
        static final class C0427b extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12288);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0427b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f5g);
            }
        }

        static final class c extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12289);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f9c);
            }
        }

        static final class d extends m implements h.f.a.a<ImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12290);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ImageView invoke() {
                return this.$itemView.findViewById(R.id.c2r);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.e$b$e  reason: collision with other inner class name */
        static final class C0428e extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12291);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0428e(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.bu_);
            }
        }

        static final class f extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12292);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.bu1);
            }
        }

        static final class g extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12293);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f_b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            this.f20751a = i.a((h.f.a.a) new C0427b(view));
            this.f20752b = i.a((h.f.a.a) new d(view));
            this.f20753c = i.a((h.f.a.a) new g(view));
            this.f20756f = i.a((h.f.a.a) new c(view));
            this.f20757g = i.a((h.f.a.a) new a(view));
            this.f20754d = i.a((h.f.a.a) new f(view));
            this.f20758h = i.a((h.f.a.a) new C0428e(view));
        }
    }

    public e(DataChannel dataChannel) {
        this.f20750a = dataChannel;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b f20764a;

        static {
            Covode.recordClassIndex(12300);
        }

        f(com.bytedance.android.livesdk.rank.api.model.b bVar) {
            this.f20764a = bVar;
        }

        public final void onClick(View view) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f20764a.f20593a.getId());
            userProfileEvent.mRankInfo = com.bytedance.android.livesdk.rank.impl.f.l.a(this.f20764a);
            userProfileEvent.mReportType = "report_user";
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ b a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b_9, viewGroup, false);
        l.b(a2, "");
        return new b(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(b bVar, com.bytedance.android.livesdk.rank.api.model.b bVar2) {
        T t;
        b bVar3 = bVar;
        com.bytedance.android.livesdk.rank.api.model.b bVar4 = bVar2;
        l.d(bVar3, "");
        l.d(bVar4, "");
        c cVar = new c(bVar3, bVar4);
        d dVar = new d(this, bVar4, bVar3);
        com.bytedance.android.livesdk.rank.impl.f.c.a((LiveTextView) bVar3.f20751a.getValue(), bVar4, (Boolean) true);
        com.bytedance.android.livesdk.rank.impl.f.c.a((HSImageView) bVar3.f20754d.getValue(), (ImageView) bVar3.f20752b.getValue(), bVar4);
        cVar.a();
        LiveTextView liveTextView = (LiveTextView) bVar3.f20753c.getValue();
        String str = bVar4.f20593a.displayId;
        if (str == null) {
            str = "";
        }
        liveTextView.setText(str);
        dVar.a();
        if (bVar4.f20593a.getBadgeImageList() == null || bVar4.f20593a.getBadgeImageList().size() == 0) {
            bVar3.c().setVisibility(8);
        } else {
            List<ImageModel> badgeImageList = bVar4.f20593a.getBadgeImageList();
            l.b(badgeImageList, "");
            Iterator<T> it = badgeImageList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                l.b(t2, "");
                if (t2.getImageType() == 30) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                k.a(bVar3.c(), (ImageModel) t3);
                bVar3.c().setVisibility(0);
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("show_entrance", "active_user_rank");
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    String idStr = room.getIdStr();
                    l.b(idStr, "");
                    hashMap.put("room_id", idStr);
                    hashMap.put("enter_method", com.bytedance.android.livesdk.ab.e.d());
                    hashMap.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
                    hashMap.put("action_type", com.bytedance.android.livesdk.ab.e.e());
                    hashMap.put("request_id", com.bytedance.android.livesdk.ab.e.k());
                    hashMap.put("video_id", com.bytedance.android.livesdk.ab.e.f());
                    b.a.a("livesdk_privilege_badge_show").a().a((Map<String, String>) hashMap).b();
                }
            }
        }
        com.bytedance.android.livesdk.rank.impl.f.c.a(new C0429e(bVar3, bVar4));
        bVar3.itemView.setOnClickListener(new f(bVar4));
        if (bVar4.f20596d != 0) {
            long id = bVar4.f20593a.getId();
            int i2 = bVar4.f20596d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("to_user_id", String.valueOf(id));
            linkedHashMap.put("show_user_position", "top_active_user_rank");
            linkedHashMap.put("rank_position", "active_user_rank_detail");
            linkedHashMap.put("age_level", String.valueOf(i2));
            b.a.a("l1_audience_show").a((Map<String, String>) linkedHashMap).a().b();
        }
    }
}
