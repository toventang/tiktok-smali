package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.ui.b.d;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.model.Hashtag;
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
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class i extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.b, c> {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f10394a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.cohost.ui.e.a.a f10395b;

    public enum b {
        NORMAL,
        INVITING,
        UNAVAILABLE;

        static {
            Covode.recordClassIndex(5505);
        }
    }

    static {
        Covode.recordClassIndex(5503);
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
            Covode.recordClassIndex(5504);
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
            Covode.recordClassIndex(5517);
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
            int i2 = j.f10417a[this.$holder.f10400c.ordinal()];
            if (i2 == 1) {
                LiveButton e2 = this.$holder.e();
                int i3 = b.a.a().N;
                if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
                    e2.b(R.style.t3);
                    e2.setEnabled(true);
                    e2.setText(h.a(y.a((int) R.string.dyr), String.valueOf(i3)));
                    return;
                }
                e2.b(R.style.sy);
                e2.setEnabled(false);
                e2.setText(h.a(y.a((int) R.string.dxg), Integer.valueOf(i3)));
            } else if (i2 == 2) {
                LiveButton e3 = this.$holder.e();
                e3.b(R.style.sy);
                e3.setEnabled(false);
                e3.setText(y.a((int) R.string.dxf));
            } else if (i2 == 3) {
                LiveButton e4 = this.$holder.e();
                e4.b(R.style.sy);
                e4.setEnabled(true);
                e4.setText(y.a((int) R.string.dxf));
            }
        }
    }

    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h.h f10398a;

        /* renamed from: b  reason: collision with root package name */
        final h.h f10399b;

        /* renamed from: c  reason: collision with root package name */
        public b f10400c = b.NORMAL;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f10401d;

        /* renamed from: e  reason: collision with root package name */
        private final h.h f10402e;

        /* renamed from: f  reason: collision with root package name */
        private final h.h f10403f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f10404g;

        /* renamed from: h  reason: collision with root package name */
        private final h.h f10405h;

        /* renamed from: i  reason: collision with root package name */
        private final h.h f10406i;

        /* renamed from: j  reason: collision with root package name */
        private final h.h f10407j;

        /* renamed from: k  reason: collision with root package name */
        private final h.h f10408k;

        /* renamed from: l  reason: collision with root package name */
        private final h.h f10409l;

        static {
            Covode.recordClassIndex(5506);
        }

        public final VHeadView a() {
            return (VHeadView) this.f10402e.getValue();
        }

        public final LiveTextView b() {
            return (LiveTextView) this.f10403f.getValue();
        }

        public final AppCompatImageView c() {
            return (AppCompatImageView) this.f10404g.getValue();
        }

        public final LiveTextView d() {
            return (LiveTextView) this.f10405h.getValue();
        }

        public final LiveButton e() {
            return (LiveButton) this.f10406i.getValue();
        }

        public final LiveTextView f() {
            return (LiveTextView) this.f10407j.getValue();
        }

        public final LiveTextView g() {
            return (LiveTextView) this.f10408k.getValue();
        }

        public final LiveTextView h() {
            return (LiveTextView) this.f10409l.getValue();
        }

        static final class a extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5507);
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

        static final class b extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5508);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0u);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$c  reason: collision with other inner class name */
        static final class C0182c extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5509);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0182c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0q);
            }
        }

        static final class d extends m implements h.f.a.a<LiveButton> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5510);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveButton invoke() {
                return this.$itemView.findViewById(R.id.xa);
            }
        }

        static final class e extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5511);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.by_);
            }
        }

        static final class f extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5512);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0w);
            }
        }

        static final class g extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5513);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.byb);
            }
        }

        static final class h extends m implements h.f.a.a<VHeadView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5514);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ VHeadView invoke() {
                return this.$itemView.findViewById(R.id.bya);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.i$c$i  reason: collision with other inner class name */
        static final class C0183i extends m implements h.f.a.a<AppCompatImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5515);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0183i(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.$itemView.findViewById(R.id.byc);
            }
        }

        static final class j extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5516);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(View view) {
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
            this.f10400c = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, View view) {
            super(view);
            l.d(view, "");
            this.f10401d = iVar;
            this.f10402e = h.i.a((h.f.a.a) new h(view));
            this.f10398a = h.i.a((h.f.a.a) new g(view));
            this.f10399b = h.i.a((h.f.a.a) new e(view));
            this.f10403f = h.i.a((h.f.a.a) new j(view));
            this.f10404g = h.i.a((h.f.a.a) new C0183i(view));
            this.f10405h = h.i.a((h.f.a.a) new a(view));
            this.f10406i = h.i.a((h.f.a.a) new d(view));
            this.f10407j = h.i.a((h.f.a.a) new C0182c(view));
            this.f10408k = h.i.a((h.f.a.a) new f(view));
            this.f10409l = h.i.a((h.f.a.a) new b(view));
        }
    }

    public static final class g implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f10414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.ui.d.b f10416c;

        static {
            Covode.recordClassIndex(5520);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void a() {
            DataChannel dataChannel = this.f10414a.f10394a;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void b() {
            this.f10414a.b(this.f10415b, this.f10416c);
        }

        g(i iVar, c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
            this.f10414a = iVar;
            this.f10415b = cVar;
            this.f10416c = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Integer, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10413a = new f();

        static {
            Covode.recordClassIndex(5519);
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
        final /* synthetic */ i f10410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.cohost.ui.d.b f10412c;

        static {
            Covode.recordClassIndex(5518);
        }

        e(i iVar, c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
            this.f10410a = iVar;
            this.f10411b = cVar;
            this.f10412c = bVar;
        }

        public final void onClick(View view) {
            Room room;
            User owner;
            i iVar = this.f10410a;
            c cVar = this.f10411b;
            com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar = this.f10412c;
            k b2 = b.a.a().b();
            if (cVar.f10400c == b.NORMAL) {
                if (!b.a.a().ag) {
                    ao.a(y.e(), y.a((int) R.string.dyo), 0);
                } else if (b2 == k.INVITING) {
                    ao.a(y.e(), (int) R.string.e69);
                } else if (b2 == k.DISABLED) {
                    com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
                    l.b(a2, "");
                    if (a2.f14182c) {
                        DataChannelGlobal.f34575d.d(com.bytedance.android.live.liveinteract.platform.common.c.k.class);
                        return;
                    }
                    DataChannel dataChannel = iVar.f10394a;
                    if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (owner = room.getOwner()) == null || owner.getSecret() != 1) {
                        iVar.b(cVar, bVar);
                        return;
                    }
                    View view2 = cVar.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    l.b(context, "");
                    com.bytedance.android.live.liveinteract.cohost.ui.b.d.a(context, new g(iVar, cVar, bVar)).show();
                }
            } else if (cVar.f10400c == b.INVITING && LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
                DataChannel dataChannel2 = iVar.f10394a;
                if (dataChannel2 != null) {
                    dataChannel2.c(com.bytedance.android.live.liveinteract.cohost.a.b.a.class);
                }
                cVar.a(b.NORMAL);
                iVar.a(cVar, bVar);
                com.bytedance.android.live.liveinteract.platform.common.g.h.a(bVar.f10332b, "cancel_icon", "withdraw");
            }
        }
    }

    public i(com.bytedance.android.live.liveinteract.cohost.ui.e.a.a aVar, DataChannel dataChannel) {
        l.d(aVar, "");
        this.f10395b = aVar;
        this.f10394a = dataChannel;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ c a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ba5, viewGroup, false);
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        l.b(a2, "");
        c cVar = new c(this, a2);
        com.bytedance.android.live.core.f.k.a((HSImageView) cVar.f10398a.getValue(), 2131234719);
        com.bytedance.android.live.core.f.k.a((HSImageView) cVar.f10399b.getValue(), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
        return cVar;
    }

    public final void b(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        b.a.a().x = bVar.f10334d;
        b.a.a().y = bVar.f10331a;
        b.a.a().z = bVar.f10333c;
        cVar.a(b.INVITING);
        com.bytedance.android.live.liveinteract.cohost.ui.e.a.a aVar = this.f10395b;
        Room room = bVar.f10331a;
        com.bytedance.android.live.liveinteract.api.m mVar = bVar.f10332b;
        if (mVar == null) {
            mVar = com.bytedance.android.live.liveinteract.api.m.NONE;
        }
        aVar.a(room, mVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        int i2;
        c cVar2 = cVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar2 = bVar;
        l.d(cVar2, "");
        l.d(bVar2, "");
        c(cVar2, bVar2);
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

    /* access modifiers changed from: package-private */
    public final void a(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
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
        cVar.e().setOnClickListener(new e(this, cVar, bVar));
    }

    private final void c(c cVar, com.bytedance.android.live.liveinteract.cohost.ui.d.b bVar) {
        int i2;
        String str;
        int i3;
        User owner = bVar.f10331a.getOwner();
        VHeadView a2 = cVar.a();
        l.b(owner, "");
        com.bytedance.android.livesdk.chatroom.g.g.a(a2, owner.getAvatarThumb(), a2.getWidth(), a2.getHeight(), 2131234424);
        cVar.b().setText(owner.displayId);
        AppCompatImageView c2 = cVar.c();
        if (owner.getAuthenticationInfo() != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c2.setVisibility(i2);
        LiveTextView d2 = cVar.d();
        int userCount = bVar.f10331a.getUserCount();
        boolean z = true;
        if (userCount > 0) {
            d2.setVisibility(0);
            String a3 = aa.a((long) userCount);
            l.b(a3, "");
            Locale locale = Locale.ROOT;
            l.b(locale, "");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a3.toUpperCase(locale);
            l.b(upperCase, "");
            String a4 = com.a.a("%s %s", Arrays.copyOf(new Object[]{upperCase, y.a((int) R.string.eh_)}, 2));
            l.b(a4, "");
            d2.setText(a4);
        } else {
            d2.setVisibility(8);
        }
        if (bVar.f10332b == com.bytedance.android.live.liveinteract.api.m.FOLLOW_INVITE) {
            cVar.f().setVisibility(8);
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar = bVar.f10333c;
            if (hVar == null || hVar.f15621f != 0) {
                z = false;
            }
            com.bytedance.android.livesdk.chatroom.interact.model.h hVar2 = bVar.f10333c;
            if (hVar2 != null) {
                i3 = hVar2.f15621f;
            } else {
                i3 = 0;
            }
            a a5 = f.a(i3);
            if (z || a5 == null) {
                cVar.h().setVisibility(8);
            } else {
                cVar.h().setVisibility(0);
                cVar.h().setText(a5.getReason());
            }
        } else if (bVar.f10332b == com.bytedance.android.live.liveinteract.api.m.RECOMMEND_INVITE) {
            User owner2 = bVar.f10331a.getOwner();
            l.b(owner2, "");
            FollowInfo followInfo = owner2.getFollowInfo();
            l.b(followInfo, "");
            if (com.bytedance.common.utility.m.a(com.bytedance.android.live.liveinteract.match.ui.d.b.a(followInfo.getFollowStatus()))) {
                cVar.f().setVisibility(8);
            } else {
                cVar.f().setVisibility(0);
                LiveTextView f2 = cVar.f();
                User owner3 = bVar.f10331a.getOwner();
                l.b(owner3, "");
                FollowInfo followInfo2 = owner3.getFollowInfo();
                l.b(followInfo2, "");
                f2.setText(com.bytedance.android.live.liveinteract.match.ui.d.b.a(followInfo2.getFollowStatus()));
            }
            cVar.h().setVisibility(8);
        }
        Hashtag hashtag = bVar.f10331a.hashtag;
        String str2 = null;
        if (hashtag != null) {
            str = hashtag.title;
        } else {
            str = null;
        }
        if (com.bytedance.common.utility.m.a(str)) {
            cVar.g().setVisibility(8);
        } else {
            cVar.g().setVisibility(0);
            LiveTextView g2 = cVar.g();
            Hashtag hashtag2 = bVar.f10331a.hashtag;
            if (hashtag2 != null) {
                str2 = hashtag2.title;
            }
            g2.setText(str2);
        }
        a(cVar, bVar);
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
            c(cVar2, bVar2);
        }
    }
}
