package com.bytedance.android.livesdk.usercard;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.s.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.cw;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class x extends v implements View.OnClickListener, com.bytedance.android.live.s.a, com.bytedance.android.live.s.c, g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21886c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Room f21887a;

    /* renamed from: b  reason: collision with root package name */
    public User f21888b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21889d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f21890e;

    static {
        Covode.recordClassIndex(12885);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f21890e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.s.a
    public final void a(com.bytedance.android.live.s.a.b bVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.c
    public final void a(com.bytedance.android.live.s.a.c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f21890e == null) {
            this.f21890e = new HashMap();
        }
        View view = (View) this.f21890e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f21890e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.s.a
    public final void b(Exception exc) {
    }

    @Override // com.bytedance.android.live.s.c
    public final void c() {
    }

    @Override // com.bytedance.android.live.s.c
    public final void k_() {
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12886);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        boolean z;
        int i2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("arg_msg_is_vertical");
        } else {
            z = true;
        }
        this.f21889d = z;
        if (this.f21889d) {
            i2 = R.layout.b7r;
        } else {
            i2 = R.layout.b7s;
        }
        v.b bVar = new v.b(i2);
        bVar.f22374a = 0;
        if (this.f21889d) {
            bVar.f22380g = 80;
            bVar.f22381h = -1;
            bVar.f22382i = -2;
            bVar.f22375b = R.style.a2f;
        } else {
            bVar.f22380g = 5;
            bVar.f22381h = y.d(R.dimen.wl);
            bVar.f22382i = -1;
            bVar.f22375b = R.style.a2g;
        }
        return bVar;
    }

    static final class c extends m implements h.f.a.b<z, z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(12888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(1);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    public static final /* synthetic */ User a(x xVar) {
        User user = xVar.f21888b;
        if (user == null) {
            l.a("mUser");
        }
        return user;
    }

    public static final /* synthetic */ Room b(x xVar) {
        Room room = xVar.f21887a;
        if (room == null) {
            l.a("mRoom");
        }
        return room;
    }

    static final class b extends m implements h.f.a.b<j, z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(12887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(1);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).muteUser(x.a(this.this$0), x.b(this.this$0).getId(), jVar2, this.this$0);
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new e(this.this$0, jVar2));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(boolean z) {
        int i2;
        if (this.o) {
            LiveTextView liveTextView = (LiveTextView) a_(R.id.crm);
            if (z) {
                i2 = R.string.gt3;
            } else {
                i2 = R.string.gt4;
            }
            liveTextView.setText(i2);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f21891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Room f21892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f21893c;

        static {
            Covode.recordClassIndex(12889);
        }

        d(x xVar, Room room, boolean z) {
            this.f21891a = xVar;
            this.f21892b = room;
            this.f21893c = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            j jVar = (j) obj;
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            if (b2 == null || b2.c() != this.f21892b.getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_mute_click").a(this.f21891a.p).a("default_mute_set", jVar.f7925a).a("to_user_id", String.valueOf(x.a(this.f21891a).getId())).a("entry_point", "profile_card").a("anchor_id", this.f21892b.getOwnerUserId()).a("room_id", this.f21892b.getId()).a("admin_type", str);
            if (this.f21893c) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            a2.a("action_type", str2).b();
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f21894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f21895b;

        static {
            Covode.recordClassIndex(12890);
        }

        e(x xVar, j jVar) {
            this.f21894a = xVar;
            this.f21895b = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            j jVar = (j) obj;
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            if (b2 == null || b2.c() != x.b(this.f21894a).getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            b.a.a("livesdk_mute_set").a(this.f21894a.p).a("admin_type", str).a("default_mute_set", jVar.f7925a).a("mute_duration", this.f21895b.f7925a).a("to_user_id", String.valueOf(x.a(this.f21894a).getId())).a("entry_point", "profile_card").a("anchor_id", x.b(this.f21894a).getOwnerUserId()).a("room_id", x.b(this.f21894a).getId()).b();
        }
    }

    public final void onClick(View view) {
        String str;
        boolean z;
        long j2;
        String str2;
        String str3;
        com.bytedance.android.livesdkapi.model.d dVar;
        String string;
        String str4 = "";
        l.d(view, str4);
        String a2 = com.bytedance.android.livesdk.ab.e.a();
        String d2 = com.bytedance.android.livesdk.ab.e.d();
        int id = view.getId();
        long j3 = 0;
        if (id == R.id.dlk) {
            boolean z2 = com.bytedance.android.livesdk.b.a.d.a().f14191l;
            if (getArguments() != null) {
                Bundle arguments = getArguments();
                if (arguments == null || (str2 = arguments.getString("arg_msg_report_type")) == null) {
                    str2 = "report_anchor";
                }
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    j2 = arguments2.getLong("arg_msg_id");
                } else {
                    j2 = 0;
                }
                Bundle arguments3 = getArguments();
                if (!(arguments3 == null || (string = arguments3.getString("arg_msg_content")) == null)) {
                    str4 = string;
                }
            } else {
                j2 = 0;
                str2 = "report_anchor";
            }
            if (l.a((Object) str2, (Object) "report_anchor")) {
                str3 = "anchor_profile";
            } else {
                str3 = "user_profile";
            }
            if (j2 == 0 || TextUtils.isEmpty(str4)) {
                Room room = this.f21887a;
                if (room == null) {
                    l.a("mRoom");
                }
                long id2 = room.getId();
                Room room2 = this.f21887a;
                if (room2 == null) {
                    l.a("mRoom");
                }
                long ownerUserId = room2.getOwnerUserId();
                User user = this.f21888b;
                if (user == null) {
                    l.a("mUser");
                }
                long id3 = user.getId();
                User user2 = this.f21888b;
                if (user2 == null) {
                    l.a("mUser");
                }
                String secUid = user2.getSecUid();
                Room room3 = this.f21887a;
                if (room3 == null) {
                    l.a("mRoom");
                }
                dVar = new com.bytedance.android.livesdkapi.model.d(id2, ownerUserId, id3, secUid, str3, a2, d2, "click", str2, room3.getRequestId());
            } else {
                Room room4 = this.f21887a;
                if (room4 == null) {
                    l.a("mRoom");
                }
                long id4 = room4.getId();
                Room room5 = this.f21887a;
                if (room5 == null) {
                    l.a("mRoom");
                }
                long ownerUserId2 = room5.getOwnerUserId();
                User user3 = this.f21888b;
                if (user3 == null) {
                    l.a("mUser");
                }
                long id5 = user3.getId();
                User user4 = this.f21888b;
                if (user4 == null) {
                    l.a("mUser");
                }
                String secUid2 = user4.getSecUid();
                Room room6 = this.f21887a;
                if (room6 == null) {
                    l.a("mRoom");
                }
                dVar = new com.bytedance.android.livesdkapi.model.d(id4, ownerUserId2, id5, secUid2, str3, j2, str4, room6.getRequestId(), a2, d2, str2, "1");
            }
            dVar.s = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
            dVar.r = z2;
            dVar.f23286m = this.f21889d;
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(getContext(), dVar);
            dismiss();
            return;
        }
        boolean z3 = false;
        if (id == R.id.ckh) {
            dismiss();
            User user5 = this.f21888b;
            if (user5 == null) {
                l.a("mUser");
            }
            ba userAttr = user5.getUserAttr();
            if (userAttr == null || !userAttr.f19030b) {
                z = true;
            } else {
                z = false;
            }
            com.bytedance.android.live.s.e eVar = (com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class);
            User user6 = this.f21888b;
            if (user6 == null) {
                l.a("mUser");
            }
            Room room7 = this.f21887a;
            if (room7 == null) {
                l.a("mRoom");
            }
            User owner = room7.getOwner();
            if (owner != null) {
                j3 = owner.getId();
            }
            Room room8 = this.f21887a;
            if (room8 == null) {
                l.a("mRoom");
            }
            eVar.updateAdmin(this, z, user6, j3, room8.getId(), "profile_card");
        } else if (id == R.id.c3v) {
            dismiss();
            com.bytedance.android.live.s.e eVar2 = (com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class);
            Context context = getContext();
            Room room9 = this.f21887a;
            if (room9 == null) {
                l.a("mRoom");
            }
            long id6 = room9.getId();
            Room room10 = this.f21887a;
            if (room10 == null) {
                l.a("mRoom");
            }
            long ownerUserId3 = room10.getOwnerUserId();
            User user7 = this.f21888b;
            if (user7 == null) {
                l.a("mUser");
            }
            Dialog ensureKickOutDialog = eVar2.getEnsureKickOutDialog(context, id6, ownerUserId3, user7.getId(), null);
            if (ensureKickOutDialog != null) {
                ensureKickOutDialog.show();
            }
            Room room11 = this.f21887a;
            if (room11 == null) {
                l.a("mRoom");
            }
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("blocked_list_click").a();
            User user8 = this.f21888b;
            if (user8 == null) {
                l.a("mUser");
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("user_id", String.valueOf(user8.getId()));
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            if (b2 == null || b2.c() != room11.getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            a4.a("admin_type", str).b("relation").c("click").b();
        } else if (id == R.id.crm) {
            dismiss();
            User user9 = this.f21888b;
            if (user9 == null) {
                l.a("mUser");
            }
            ba userAttr2 = user9.getUserAttr();
            if (userAttr2 == null || !userAttr2.f19029a) {
                z3 = true;
                Context context2 = getContext();
                if (!(context2 instanceof androidx.fragment.app.e)) {
                    context2 = null;
                }
                androidx.fragment.app.e eVar3 = (androidx.fragment.app.e) context2;
                if (eVar3 != null) {
                    i supportFragmentManager = eVar3.getSupportFragmentManager();
                    androidx.fragment.app.d muteConfirmDialog = ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getMuteConfirmDialog(new b(this));
                    if (muteConfirmDialog != null) {
                        muteConfirmDialog.show(supportFragmentManager, getClass().getSimpleName());
                    }
                }
            } else {
                com.bytedance.android.live.s.e eVar4 = (com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class);
                User user10 = this.f21888b;
                if (user10 == null) {
                    l.a("mUser");
                }
                Room room12 = this.f21887a;
                if (room12 == null) {
                    l.a("mRoom");
                }
                eVar4.unmuteUser(user10, room12.getId(), this);
            }
            Room room13 = this.f21887a;
            if (room13 == null) {
                l.a("mRoom");
            }
            ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new d(this, room13, z3));
        } else if (id == R.id.a1p) {
            dismiss();
            k.a(getContext());
        }
    }

    @Override // com.bytedance.android.live.s.a
    public final void a(boolean z, long j2) {
        LiveTextView liveTextView;
        int i2;
        User user = this.f21888b;
        if (user == null) {
            l.a("mUser");
        }
        if (user.getUserAttr() == null) {
            User user2 = this.f21888b;
            if (user2 == null) {
                l.a("mUser");
            }
            user2.setUserAttr(new ba());
        }
        User user3 = this.f21888b;
        if (user3 == null) {
            l.a("mUser");
        }
        ba userAttr = user3.getUserAttr();
        l.b(userAttr, "");
        userAttr.f19030b = z;
        if (this.o && (liveTextView = (LiveTextView) a_(R.id.ckh)) != null) {
            if (z) {
                i2 = R.string.eb7;
            } else {
                i2 = R.string.eb6;
            }
            liveTextView.setText(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        User user;
        Boolean bool;
        LiveTextView liveTextView;
        int i2;
        int i3;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null && (room = (Room) dataChannel.b(df.class)) != null) {
            this.f21887a = room;
            DataChannel dataChannel2 = this.p;
            if (dataChannel2 != null && (user = (User) dataChannel2.b(cw.class)) != null) {
                this.f21888b = user;
                LiveTextView liveTextView2 = (LiveTextView) a_(R.id.a1p);
                if (liveTextView2 != null) {
                    liveTextView2.setOnClickListener(this);
                }
                ((LiveTextView) a_(R.id.dlk)).setOnClickListener(this);
                ((LiveTextView) a_(R.id.crm)).setOnClickListener(this);
                LiveTextView liveTextView3 = (LiveTextView) a_(R.id.c3v);
                if (liveTextView3 != null) {
                    liveTextView3.setOnClickListener(this);
                }
                LiveTextView liveTextView4 = (LiveTextView) a_(R.id.ckh);
                if (liveTextView4 != null) {
                    liveTextView4.setOnClickListener(this);
                }
                User user2 = this.f21888b;
                if (user2 == null) {
                    l.a("mUser");
                }
                ba userAttr = user2.getUserAttr();
                if (userAttr != null) {
                    LiveTextView liveTextView5 = (LiveTextView) a_(R.id.ckh);
                    if (liveTextView5 != null) {
                        if (userAttr.f19030b) {
                            i3 = R.string.eb7;
                        } else {
                            i3 = R.string.eb6;
                        }
                        liveTextView5.setText(i3);
                    }
                    LiveTextView liveTextView6 = (LiveTextView) a_(R.id.crm);
                    if (userAttr.f19029a) {
                        i2 = R.string.gt3;
                    } else {
                        i2 = R.string.gt4;
                    }
                    liveTextView6.setText(i2);
                }
                DataChannel dataChannel3 = this.p;
                if (dataChannel3 != null) {
                    bool = (Boolean) dataChannel3.b(ee.class);
                } else {
                    bool = null;
                }
                if (p.a(bool) && (liveTextView = (LiveTextView) a_(R.id.ckh)) != null) {
                    p.b(liveTextView);
                }
                DataChannel dataChannel4 = this.p;
                if (dataChannel4 != null) {
                    dataChannel4.a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new c(this));
                }
            }
        }
    }
}
