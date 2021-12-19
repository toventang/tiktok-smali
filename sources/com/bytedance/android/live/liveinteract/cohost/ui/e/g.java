package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.ui.b.d;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class g extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.b, c> {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f10372a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.cohost.ui.e.a.a f10373b;

    public enum b {
        NORMAL,
        INVITING,
        UNAVAILABLE;

        static {
            Covode.recordClassIndex(5488);
        }
    }

    static {
        Covode.recordClassIndex(5486);
    }

    /* JADX WARN: Init of enum IS_LINKING can be incorrect */
    /* JADX WARN: Init of enum INVITATION_DENIED can be incorrect */
    /* JADX WARN: Init of enum PERMISSION_DENIED can be incorrect */
    /* JADX WARN: Init of enum LOW_CLIENT_VERSION can be incorrect */
    public enum a {
        IS_LINKING(r2),
        INVITATION_DENIED(r2),
        PERMISSION_DENIED(r2),
        LOW_CLIENT_VERSION(r2);
        
        private final String reason;

        public final String getReason() {
            return this.reason;
        }

        static {
            Covode.recordClassIndex(5487);
            l.b(y.a((int) R.string.dz7), "");
            l.b(y.a((int) R.string.ept), "");
            l.b(y.a((int) R.string.egs), "");
            l.b(y.a((int) R.string.ept), "");
        }

        private a(String str) {
            this.reason = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ c $holder;

        static {
            Covode.recordClassIndex(5498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.$holder = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            int i2 = h.f10393a[this.$holder.f10378c.ordinal()];
            if (i2 == 1) {
                LiveButton f2 = this.$holder.f();
                f2.setEnabled(false);
                int i3 = b.a.a().N;
                f2.setText(h.a(y.a((int) R.string.dxg), Integer.valueOf(i3)));
            } else if (i2 == 2) {
                LiveButton f3 = this.$holder.f();
                f3.setEnabled(false);
                f3.setText(y.a((int) R.string.dxf));
            } else if (i2 == 3) {
                LiveButton f4 = this.$holder.f();
                f4.setEnabled(true);
                f4.setText(y.a((int) R.string.dxf));
            }
        }
    }

    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h.h f10376a;

        /* renamed from: b  reason: collision with root package name */
        final h.h f10377b;

        /* renamed from: c  reason: collision with root package name */
        public b f10378c = b.NORMAL;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f10379d;

        /* renamed from: e  reason: collision with root package name */
        private final h.h f10380e;

        /* renamed from: f  reason: collision with root package name */
        private final h.h f10381f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f10382g;

        /* renamed from: h  reason: collision with root package name */
        private final h.h f10383h;

        /* renamed from: i  reason: collision with root package name */
        private final h.h f10384i;

        /* renamed from: j  reason: collision with root package name */
        private final h.h f10385j;

        static {
            Covode.recordClassIndex(5489);
        }

        public final VHeadView a() {
            return (VHeadView) this.f10380e.getValue();
        }

        public final LiveTextView b() {
            return (LiveTextView) this.f10381f.getValue();
        }

        public final AppCompatImageView c() {
            return (AppCompatImageView) this.f10382g.getValue();
        }

        public final LiveTextView d() {
            return (LiveTextView) this.f10383h.getValue();
        }

        public final LiveTextView e() {
            return (LiveTextView) this.f10384i.getValue();
        }

        public final LiveButton f() {
            return (LiveButton) this.f10385j.getValue();
        }

        static final class a extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5490);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0t);
            }
        }

        static final class b extends m implements h.f.a.a<LiveButton> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5491);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveButton invoke() {
                return this.$itemView.findViewById(R.id.xa);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$c  reason: collision with other inner class name */
        static final class C0179c extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5492);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0179c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.by_);
            }
        }

        static final class d extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5493);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0r);
            }
        }

        static final class e extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5494);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.byb);
            }
        }

        static final class f extends m implements h.f.a.a<VHeadView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5495);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ VHeadView invoke() {
                return this.$itemView.findViewById(R.id.bya);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$c$g  reason: collision with other inner class name */
        static final class C0180g extends m implements h.f.a.a<AppCompatImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5496);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0180g(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.$itemView.findViewById(R.id.byc);
            }
        }

        static final class h extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5497);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0x);
            }
        }

        public final void a(b bVar) {
            l.d(bVar, "");
            this.f10378c = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar, View view) {
            super(view);
            l.d(view, "");
            this.f10379d = gVar;
            this.f10380e = i.a((h.f.a.a) new f(view));
            this.f10376a = i.a((h.f.a.a) new e(view));
            this.f10377b = i.a((h.f.a.a) new C0179c(view));
            this.f10381f = i.a((h.f.a.a) new h(view));
            this.f10382g = i.a((h.f.a.a) new C0180g(view));
            this.f10383h = i.a((h.f.a.a) new d(view));
            this.f10384i = i.a((h.f.a.a) new a(view));
            this.f10385j = i.a((h.f.a.a) new b(view));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.g$g  reason: collision with other inner class name */
    public static final class C0181g implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.ui.d.b f10392c;

        static {
            Covode.recordClassIndex(5501);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void a() {
            DataChannel dataChannel = this.f10390a.f10372a;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void b() {
            this.f10390a.a(this.f10391b, this.f10392c);
        }

        C0181g(g gVar, c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
            this.f10390a = gVar;
            this.f10391b = cVar;
            this.f10392c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Integer, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10389a = new f();

        static {
            Covode.recordClassIndex(5500);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(Integer num) {
            return a(num.intValue());
        }

        public static a a(int i2) {
            if (i2 == 1) {
                return a.IS_LINKING;
            }
            if (i2 == 2) {
                return a.INVITATION_DENIED;
            }
            if (i2 == 3) {
                return a.PERMISSION_DENIED;
            }
            if (i2 != 4) {
                return null;
            }
            return a.LOW_CLIENT_VERSION;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.ui.d.b f10388c;

        static {
            Covode.recordClassIndex(5499);
        }

        e(g gVar, c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
            this.f10386a = gVar;
            this.f10387b = cVar;
            this.f10388c = bVar;
        }

        public final void onClick(View view) {
            Room room;
            User owner;
            g gVar = this.f10386a;
            c cVar = this.f10387b;
            com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar = this.f10388c;
            k b2 = b.a.a().b();
            if (cVar.f10378c != b.NORMAL) {
                return;
            }
            if (b2 == k.INVITING) {
                ao.a(y.e(), (int) R.string.e69);
            } else if (b2 == k.DISABLED) {
                com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                l.b(a2, "");
                if (a2.f14182c) {
                    DataChannelGlobal.f34575d.d(com.bytedance.android.live.liveinteract.platform.common.c.k.class);
                    return;
                }
                DataChannel dataChannel = gVar.f10372a;
                if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (owner = room.getOwner()) == null || owner.getSecret() != 1) {
                    gVar.a(cVar, bVar);
                    return;
                }
                View view2 = cVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l.b(context, "");
                com.bytedance.android.live.liveinteract.cohost.ui.b.d.a(context, new C0181g(gVar, cVar, bVar)).show();
            }
        }
    }

    public g(com.bytedance.android.live.liveinteract.cohost.ui.e.a.a aVar, DataChannel dataChannel) {
        l.d(aVar, "");
        this.f10373b = aVar;
        this.f10372a = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ c a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ba4, viewGroup, false);
        l.b(a2, "");
        c cVar = new c(this, a2);
        com.bytedance.android.live.core.f.k.a((HSImageView) cVar.f10376a.getValue(), 2131234719);
        com.bytedance.android.live.core.f.k.a((HSImageView) cVar.f10377b.getValue(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
        return cVar;
    }

    private final void c(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        d dVar = new d(cVar);
        com.bytedance.android.livesdk.chatroom.interact.model.h hVar = bVar.f10333c;
        if (hVar == null || hVar.f15621f != 0) {
            cVar.a(b.UNAVAILABLE);
        } else if (b.a.a().b() == k.INVITING && b.a.a().N >= 0 && bVar.f10331a.getOwnerUserId() == b.a.a().f9941f) {
            cVar.a(b.INVITING);
        } else {
            cVar.a(b.NORMAL);
        }
        dVar.a();
        cVar.f().setOnClickListener(new e(this, cVar, bVar));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        int i2;
        c cVar2 = cVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar2 = bVar;
        l.d(cVar2, "");
        l.d(bVar2, "");
        b(cVar2, bVar2);
        String str = bVar2.f10334d;
        Room room = bVar2.f10331a;
        com.bytedance.android.live.liveinteract.api.m mVar = bVar2.f10332b;
        if (mVar != null) {
            i2 = mVar.getType();
        } else {
            i2 = 0;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.h.a(str, room, i2, bVar2.f10333c);
    }

    private final void b(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        int i2;
        int i3;
        User owner = bVar.f10331a.getOwner();
        VHeadView a2 = cVar.a();
        l.b(owner, "");
        com.bytedance.android.livesdk.chatroom.g.g.a(a2, owner.getAvatarThumb(), a2.getWidth(), a2.getHeight(), 2131234424);
        cVar.b().setText(owner.displayId);
        cVar.d().setText(owner.getNickName());
        AppCompatImageView c2 = cVar.c();
        if (owner.getAuthenticationInfo() != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c2.setVisibility(i2);
        LiveTextView e2 = cVar.e();
        com.bytedance.android.livesdk.chatroom.interact.model.h hVar = bVar.f10333c;
        if (hVar == null || hVar.f15621f != 0) {
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar2 = bVar.f10333c;
            if (hVar2 != null) {
                i3 = hVar2.f15621f;
            } else {
                i3 = 0;
            }
            a a3 = f.a(i3);
            if (a3 != null) {
                e2.setVisibility(0);
                e2.setText(a3.getReason());
            }
        } else {
            int userCount = bVar.f10331a.getUserCount();
            if (userCount > 0) {
                e2.setVisibility(0);
                String a4 = aa.a((long) userCount);
                l.b(a4, "");
                Locale locale = Locale.ROOT;
                l.b(locale, "");
                Objects.requireNonNull(a4, "null cannot be cast to non-null type java.lang.String");
                String upperCase = a4.toUpperCase(locale);
                l.b(upperCase, "");
                String a5 = com.a.a("%s %s", Arrays.copyOf(new Object[]{upperCase, y.a((int) R.string.eh_)}, 2));
                l.b(a5, "");
                e2.setText(a5);
            } else {
                e2.setVisibility(8);
            }
        }
        c(cVar, bVar);
    }

    public final void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        b.a.a().x = bVar.f10334d;
        cVar.a(b.INVITING);
        com.bytedance.android.live.liveinteract.cohost.ui.e.a.a aVar = this.f10373b;
        Room room = bVar.f10331a;
        com.bytedance.android.live.liveinteract.api.m mVar = bVar.f10332b;
        if (mVar == null) {
            mVar = com.bytedance.android.live.liveinteract.api.m.NONE;
        }
        aVar.a(room, mVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, java.util.List] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar, List list) {
        c cVar2 = cVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar2 = bVar;
        l.d(cVar2, "");
        l.d(bVar2, "");
        l.d(list, "");
        if (list.size() <= 0) {
            super.a(cVar2, bVar2, list);
        } else {
            b(cVar2, bVar2);
        }
    }
}
