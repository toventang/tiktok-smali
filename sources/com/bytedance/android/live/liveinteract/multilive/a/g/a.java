package com.bytedance.android.live.liveinteract.multilive.a.g;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.multilive.c.i;
import com.bytedance.android.live.liveinteract.multilive.c.j;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.bytedance.android.live.liveinteract.a.b.a.b<e> {
    @d(a = "DATA_CHANNEL")

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f11555a;
    @com.bytedance.android.live.liveinteract.api.c.c(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11556b;

    /* renamed from: c  reason: collision with root package name */
    private final VHeadView f11557c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveTextView f11558d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveTextView f11559e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f11560f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f11561g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageView f11562h;

    static {
        Covode.recordClassIndex(6253);
    }

    public final DataChannel a() {
        DataChannel dataChannel = this.f11555a;
        if (dataChannel == null) {
            l.a("dataChannel");
        }
        return dataChannel;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a b() {
        if (this.f11556b == null) {
            com.bytedance.android.live.liveinteract.api.c.e.f10014a.b(this);
        }
        return this.f11556b;
    }

    public final void c() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = b();
        if (b2 != null) {
            if (b2.f11293c) {
                this.f11561g.setBackground(y.c(2131234506));
            } else {
                this.f11561g.setBackground(y.c(2131234505));
            }
        }
    }

    public final void d() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = b();
        if (b2 != null) {
            if (b2.f11294d) {
                this.f11560f.setBackground(y.c(2131234607));
            } else {
                this.f11560f.setBackground(y.c(2131234604));
            }
        }
    }

    public final void e() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = b();
        if (b2 != null) {
            if (b2.f11294d) {
                this.f11562h.setBackground(y.c(2131234547));
            } else {
                this.f11562h.setBackground(y.c(2131234549));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.g.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0228a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11563a;

        static {
            Covode.recordClassIndex(6254);
        }

        View$OnClickListenerC0228a(a aVar) {
            this.f11563a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = this.f11563a.b();
            if (b2 != null) {
                b2.f11294d = !b2.f11294d;
                this.f11563a.d();
                this.f11563a.e();
                this.f11563a.a().c(j.class, Boolean.valueOf(b2.f11294d));
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11564a;

        static {
            Covode.recordClassIndex(6255);
        }

        b(a aVar) {
            this.f11564a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = this.f11564a.b();
            if (b2 != null) {
                b2.f11293c = !b2.f11293c;
                this.f11564a.c();
                this.f11564a.a().c(i.class, Boolean.valueOf(b2.f11293c));
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11565a;

        static {
            Covode.recordClassIndex(6256);
        }

        c(a aVar) {
            this.f11565a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2 = this.f11565a.b();
            if (b2 != null && b2.f11294d) {
                if (b2.f11296f) {
                    ao.a(y.e(), (int) R.string.e3n);
                } else {
                    ao.a(y.e(), (int) R.string.dwt);
                }
                b2.f11296f = !b2.f11296f;
                this.f11565a.a().c(com.bytedance.android.live.liveinteract.multilive.c.e.class);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.byo);
        l.b(findViewById, "");
        this.f11557c = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.f_b);
        l.b(findViewById2, "");
        this.f11558d = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f5r);
        l.b(findViewById3, "");
        this.f11559e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bxx);
        l.b(findViewById4, "");
        this.f11560f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bxw);
        l.b(findViewById5, "");
        this.f11561g = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bxy);
        l.b(findViewById6, "");
        this.f11562h = (ImageView) findViewById6;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.liveinteract.a.b.a.b
    public final /* synthetic */ void a(e eVar) {
        String str;
        boolean z;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a b2;
        long j2;
        e eVar2 = eVar;
        l.d(eVar2, "");
        User user = eVar2.f15722c;
        VHeadView vHeadView = this.f11557c;
        g.a(vHeadView, user.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), 2131234424);
        this.f11558d.setText(user.displayId);
        if (eVar2.f15724e == 2) {
            l.b(user, "");
            l.d(user, "");
            long id = user.getId();
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
            }
            if (id == j2) {
                str = y.a((int) R.string.e5s);
                l.b(str, "");
            } else {
                FollowInfo followInfo = user.getFollowInfo();
                if (followInfo != null && followInfo.getFollowStatus() == 2) {
                    str = y.a((int) R.string.e3h);
                    l.b(str, "");
                }
                str = "";
            }
        } else {
            if (eVar2.f15724e == 1) {
                if (eVar2.f15727h > 0) {
                    str = y.a((int) R.string.gs1, Integer.valueOf(eVar2.f15727h));
                    l.b(str, "");
                } else {
                    int a2 = an.a((int) ((System.currentTimeMillis() / 1000) - eVar2.f15723d));
                    str = y.a(R.plurals.gi, a2, Integer.valueOf(a2));
                    l.b(str, "");
                }
            }
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f11559e.setVisibility(8);
        } else {
            this.f11559e.setVisibility(0);
            this.f11559e.setText(str);
        }
        User user2 = eVar2.f15722c;
        l.b(user2, "");
        long id2 = user2.getId();
        f b3 = u.a().b();
        l.b(b3, "");
        if (id2 == b3.c()) {
            com.bytedance.android.live.liveinteract.api.a.c a3 = com.bytedance.android.live.liveinteract.api.a.c.a();
            l.b(a3, "");
            T t = a3.n;
            if (t != null && t.intValue() == 2 && (b2 = b()) != null && b2.f11303m) {
                this.f11560f.setVisibility(0);
                this.f11561g.setVisibility(0);
                this.f11562h.setVisibility(0);
                d();
                e();
                this.f11560f.setOnClickListener(new View$OnClickListenerC0228a(this));
                c();
                this.f11561g.setOnClickListener(new b(this));
                this.f11562h.setOnClickListener(new c(this));
                return;
            }
        }
        this.f11560f.setVisibility(8);
        this.f11561g.setVisibility(8);
        this.f11562h.setVisibility(8);
    }
}
