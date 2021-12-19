package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends b<com.bytedance.android.livesdk.chatroom.model.b.e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f11666e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final LiveButton f11667a;
    @com.bytedance.android.live.liveinteract.api.c.c(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11668b;

    /* renamed from: c  reason: collision with root package name */
    public final DataChannel f11669c;

    /* renamed from: d  reason: collision with root package name */
    public final h f11670d;

    /* renamed from: f  reason: collision with root package name */
    private final VHeadView f11671f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveTextView f11672g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveTextView f11673h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f11674i;

    /* renamed from: j  reason: collision with root package name */
    private final ImageView f11675j;

    /* renamed from: k  reason: collision with root package name */
    private final ImageView f11676k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveButton f11677l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveButton f11678m;
    private final ImageView n;
    private final ImageView o;

    static {
        Covode.recordClassIndex(6357);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6358);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a a() {
        if (this.f11668b == null) {
            com.bytedance.android.live.liveinteract.api.c.e.f10014a.b(this);
        }
        return this.f11668b;
    }

    public final boolean b() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a a2 = a();
        if (a2 != null) {
            return a2.f11294d;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (b()) {
            this.f11675j.setBackground(y.c(2131234547));
        } else {
            this.f11675j.setBackground(y.c(2131234549));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a a2;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a a3 = a();
        if ((a3 != null && a3.f11302l == 0) || ((a2 = a()) != null && a2.f11295e == 0)) {
            this.f11674i.setBackground(y.c(2131234605));
        } else if (b()) {
            this.f11674i.setBackground(y.c(2131234607));
        } else {
            this.f11674i.setBackground(y.c(2131234604));
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11688b;

        static {
            Covode.recordClassIndex(6364);
        }

        g(j jVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11687a = jVar;
            this.f11688b = eVar;
        }

        public final void onClick(View view) {
            h hVar = this.f11687a.f11670d;
            if (hVar != null) {
                hVar.b(this.f11688b);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11684b;

        static {
            Covode.recordClassIndex(6362);
        }

        e(j jVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11683a = jVar;
            this.f11684b = eVar;
        }

        public final void onClick(View view) {
            h hVar = this.f11683a.f11670d;
            if (hVar != null) {
                User user = this.f11684b.f15722c;
                l.b(user, "");
                hVar.a(user);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11682b;

        static {
            Covode.recordClassIndex(6361);
        }

        d(j jVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11681a = jVar;
            this.f11682b = eVar;
        }

        public final void onClick(View view) {
            boolean z;
            h hVar = this.f11681a.f11670d;
            if (hVar != null) {
                User user = this.f11682b.f15722c;
                l.b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                l.b(followInfo, "");
                if (followInfo.getFollowStatus() != 1) {
                    FollowInfo followInfo2 = user.getFollowInfo();
                    l.b(followInfo2, "");
                    if (followInfo2.getFollowStatus() != 2) {
                        z = false;
                        hVar.a(z, this.f11682b);
                    }
                }
                z = true;
                hVar.a(z, this.f11682b);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11686b;

        static {
            Covode.recordClassIndex(6363);
        }

        f(j jVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11685a = jVar;
            this.f11686b = eVar;
        }

        public final void onClick(View view) {
            h hVar = this.f11685a.f11670d;
            if (hVar != null) {
                User user = this.f11686b.f15722c;
                l.b(user, "");
                long id = user.getId();
                User user2 = this.f11686b.f15722c;
                l.b(user2, "");
                String secUid = user2.getSecUid();
                l.b(secUid, "");
                String a2 = this.f11686b.a();
                l.b(a2, "");
                hVar.a(id, secUid, a2);
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11690b;

        static {
            Covode.recordClassIndex(6365);
        }

        h(j jVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11689a = jVar;
            this.f11690b = eVar;
        }

        public final void onClick(View view) {
            this.f11689a.f11667a.setEnabled(false);
            this.f11689a.f11667a.setText(y.a((int) R.string.dso));
            h hVar = this.f11689a.f11670d;
            if (hVar != null) {
                hVar.a(this.f11690b);
            }
        }
    }

    private static boolean a(User user) {
        long j2;
        l.d(user, "");
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        if (id == j2) {
            return true;
        }
        return false;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11680a;

        static {
            Covode.recordClassIndex(6360);
        }

        c(j jVar) {
            this.f11680a = jVar;
        }

        public final void onClick(View view) {
            if (this.f11680a.b()) {
                com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.f14015i;
                l.b(bVar, "");
                Integer b2 = bVar.b();
                if (b2 != null && b2.intValue() == 1) {
                    ao.a(y.e(), (int) R.string.dwt);
                    com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.f14015i;
                    l.b(bVar2, "");
                    bVar2.b(0);
                } else {
                    ao.a(y.e(), (int) R.string.e3n);
                    com.bytedance.android.livesdk.ap.b<Integer> bVar3 = com.bytedance.android.livesdk.ap.a.f14015i;
                    l.b(bVar3, "");
                    bVar3.b(1);
                }
                com.bytedance.android.livesdk.an.a.a().a(new r(2));
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f11679a;

        static {
            Covode.recordClassIndex(6359);
        }

        b(j jVar) {
            this.f11679a = jVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a a2;
            int i2;
            j jVar = this.f11679a;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a a3 = jVar.a();
            if ((a3 == null || a3.f11302l != 0) && ((a2 = jVar.a()) == null || a2.f11295e != 0)) {
                boolean z = !jVar.b();
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a a4 = jVar.a();
                if (a4 != null) {
                    a4.f11294d = z;
                }
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a a5 = jVar.a();
                if (a5 != null) {
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    a5.f11295e = i2;
                }
                DataChannel dataChannel = jVar.f11669c;
                if (dataChannel != null) {
                    dataChannel.c(com.bytedance.android.live.liveinteract.multilive.c.c.class, Boolean.valueOf(z));
                }
                if (z) {
                    com.bytedance.android.livesdk.an.a.a().a(new r(40));
                    com.bytedance.android.live.liveinteract.multilive.b.a.a("on", "icon", 1);
                } else {
                    com.bytedance.android.livesdk.an.a.a().a(new r(41));
                    com.bytedance.android.live.liveinteract.multilive.b.a.a("off", "icon", 1);
                    ao.a(y.e(), (int) R.string.epa);
                }
                jVar.c();
                jVar.d();
                return;
            }
            ao.a(y.e(), (int) R.string.dxh);
            com.bytedance.android.live.liveinteract.multilive.b.a.a("off", "icon", 0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.b
    public final /* synthetic */ void a(com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
        int i2;
        com.bytedance.android.livesdk.chatroom.model.b.e eVar2 = eVar;
        l.d(eVar2, "");
        User user = eVar2.f15722c;
        VHeadView vHeadView = this.f11671f;
        com.bytedance.android.livesdk.chatroom.g.g.a(vHeadView, user.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2131234424);
        this.f11672g.setText(user.displayId);
        l.b(user, "");
        if (a(user)) {
            this.f11673h.setText(y.a((int) R.string.e5t));
            this.f11673h.setVisibility(0);
        } else {
            FollowInfo followInfo = user.getFollowInfo();
            l.b(followInfo, "");
            if (followInfo.getFollowStatus() != 2 || eVar2.f15730k == 1) {
                this.f11673h.setVisibility(8);
            } else {
                this.f11673h.setText(y.a((int) R.string.e3j));
                this.f11673h.setVisibility(0);
            }
        }
        this.f11674i.setVisibility(8);
        this.f11675j.setVisibility(8);
        this.f11676k.setVisibility(8);
        this.f11667a.setVisibility(8);
        this.f11667a.setEnabled(true);
        this.f11677l.setVisibility(8);
        this.f11677l.setEnabled(true);
        this.o.setVisibility(8);
        this.f11678m.setVisibility(8);
        this.f11678m.b(R.style.sy);
        this.n.setVisibility(8);
        User user2 = eVar2.f15722c;
        l.b(user2, "");
        if (a(user2)) {
            i2 = 0;
        } else {
            i2 = eVar2.f15730k;
        }
        com.bytedance.android.live.core.c.a.a(6, "MultiLiveLinkPanelUserInfo", "type = ".concat(String.valueOf(i2)));
        if (i2 == 0) {
            if (MultiLiveLinkPanelStyle.INSTANCE.getValue() == 2) {
                this.f11674i.setVisibility(0);
            }
            this.f11675j.setVisibility(0);
            this.f11676k.setVisibility(0);
            c();
            d();
            this.f11674i.setOnClickListener(new b(this));
            this.f11675j.setOnClickListener(new c(this));
        } else if (i2 == 1) {
            this.f11678m.setVisibility(0);
            this.n.setVisibility(0);
            User user3 = eVar2.f15722c;
            l.b(user3, "");
            FollowInfo followInfo2 = user3.getFollowInfo();
            l.b(followInfo2, "");
            long followStatus = followInfo2.getFollowStatus();
            if (followStatus == 0) {
                this.f11678m.setText(y.a((int) R.string.e34));
            } else if (followStatus == 1) {
                this.f11678m.b(R.style.t3);
                this.f11678m.setText(y.a((int) R.string.e3a));
            } else if (followStatus == 2) {
                this.f11678m.b(R.style.t3);
                this.f11678m.setText(y.a((int) R.string.e3j));
            } else if (followStatus == 3) {
                this.f11678m.setText(y.a((int) R.string.e34));
            }
            this.f11678m.setOnClickListener(new d(this, eVar2));
            this.n.setOnClickListener(new e(this, eVar2));
        } else if (i2 == 2) {
            this.f11677l.setVisibility(0);
            this.f11677l.setText(y.a((int) R.string.dul));
            this.f11677l.setOnClickListener(new f(this, eVar2));
            this.o.setVisibility(0);
            this.o.setOnClickListener(new g(this, eVar2));
        } else if (i2 == 3) {
            this.f11667a.setVisibility(0);
            this.f11667a.setOnClickListener(new h(this, eVar2));
            if (eVar2.f15726g != 3) {
                this.f11667a.setText(y.a((int) R.string.e68));
                this.f11667a.setEnabled(true);
                return;
            }
            this.f11667a.setText(y.a((int) R.string.dso));
            this.f11667a.setEnabled(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view, DataChannel dataChannel, h hVar) {
        super(view);
        l.d(view, "");
        this.f11669c = dataChannel;
        this.f11670d = hVar;
        View findViewById = view.findViewById(R.id.byo);
        l.b(findViewById, "");
        this.f11671f = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.f_b);
        l.b(findViewById2, "");
        this.f11672g = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f5r);
        l.b(findViewById3, "");
        this.f11673h = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bxv);
        l.b(findViewById4, "");
        this.f11674i = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bxu);
        l.b(findViewById5, "");
        this.f11675j = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bxt);
        l.b(findViewById6, "");
        this.f11676k = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.xn);
        l.b(findViewById7, "");
        this.f11677l = (LiveButton) findViewById7;
        View findViewById8 = view.findViewById(R.id.yf);
        l.b(findViewById8, "");
        this.f11678m = (LiveButton) findViewById8;
        View findViewById9 = view.findViewById(R.id.bxs);
        l.b(findViewById9, "");
        this.n = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.bi2);
        l.b(findViewById10, "");
        this.o = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.yt);
        l.b(findViewById11, "");
        this.f11667a = (LiveButton) findViewById11;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }
}
