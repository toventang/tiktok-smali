package com.bytedance.android.livesdk.qa;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class as extends v implements com.bytedance.android.live.s.c, com.bytedance.android.live.s.g {

    /* renamed from: a  reason: collision with root package name */
    public af f20379a;

    /* renamed from: b  reason: collision with root package name */
    public User f20380b;

    /* renamed from: c  reason: collision with root package name */
    public bj f20381c;

    /* renamed from: d  reason: collision with root package name */
    public Room f20382d;

    /* renamed from: e  reason: collision with root package name */
    public String f20383e = "";

    /* renamed from: f  reason: collision with root package name */
    private HashMap f20384f;

    static {
        Covode.recordClassIndex(12034);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f20384f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.s.c
    public final void a(com.bytedance.android.live.s.a.c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(Exception exc) {
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f20384f == null) {
            this.f20384f = new HashMap();
        }
        View view = (View) this.f20384f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f20384f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
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

    public static final class a implements com.bytedance.android.live.s.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Room f20385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ as f20386b;

        static {
            Covode.recordClassIndex(12035);
        }

        @Override // com.bytedance.android.live.s.f
        public final void a() {
            this.f20386b.b(false);
        }

        a(Room room, as asVar) {
            this.f20385a = room;
            this.f20386b = asVar;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b61);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20395a;

        static {
            Covode.recordClassIndex(12043);
        }

        h(as asVar) {
            this.f20395a = asVar;
        }

        public final void onClick(View view) {
            this.f20395a.dismiss();
        }
    }

    static final class c extends m implements h.f.a.b<z, z> {
        final /* synthetic */ as this$0;

        static {
            Covode.recordClassIndex(12038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(as asVar) {
            super(1);
            this.this$0 = asVar;
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

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20391a;

        static {
            Covode.recordClassIndex(12039);
        }

        d(as asVar) {
            this.f20391a = asVar;
        }

        public final void onClick(View view) {
            b.a.a("livesdk_anchor_qa_more_click_module").a("action_type", "report_question").b();
            this.f20391a.b(false);
            this.f20391a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final j f20398a = new j();

        static {
            Covode.recordClassIndex(12045);
        }

        j() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String prompt;
            Throwable th = (Throwable) obj;
            if (!(th instanceof com.bytedance.android.live.a.a.b.a)) {
                th = null;
            }
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (aVar != null && (prompt = aVar.getPrompt()) != null && prompt.length() > 0) {
                p.a(prompt);
            }
        }
    }

    public final void b(boolean z) {
        bj bjVar = this.f20381c;
        if (bjVar != null) {
            ((QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class)).deleteQuestion(bjVar.f19332a).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new i(this, z), j.f20398a);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20393a;

        static {
            Covode.recordClassIndex(12041);
        }

        f(as asVar) {
            this.f20393a = asVar;
        }

        public final void onClick(View view) {
            boolean z;
            User user;
            ba userAttr;
            as asVar = this.f20393a;
            b.a.a("livesdk_anchor_qa_more_click_module").a("action_type", "mute_account").b();
            bj bjVar = asVar.f20381c;
            if (bjVar == null || (user = bjVar.f19336e) == null || (userAttr = user.getUserAttr()) == null || !userAttr.f19029a) {
                z = true;
            } else {
                z = false;
            }
            Room room = asVar.f20382d;
            if (room != null) {
                long id = room.getId();
                User user2 = asVar.f20380b;
                if (user2 != null) {
                    ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new b(user2, id, asVar, z));
                }
            }
            this.f20393a.dismiss();
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20394a;

        static {
            Covode.recordClassIndex(12042);
        }

        g(as asVar) {
            this.f20394a = asVar;
        }

        public final void onClick(View view) {
            User user;
            Dialog ensureKickOutDialog;
            as asVar = this.f20394a;
            b.a.a("livesdk_anchor_qa_more_click_module").a("action_type", "block_account").b();
            asVar.dismiss();
            Room room = asVar.f20382d;
            if (!(room == null || (user = asVar.f20380b) == null || (ensureKickOutDialog = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getEnsureKickOutDialog(asVar.getContext(), room.getId(), room.getOwnerUserId(), user.getId(), new a(room, asVar))) == null)) {
                ensureKickOutDialog.show();
            }
            this.f20394a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f20397b;

        static {
            Covode.recordClassIndex(12044);
        }

        i(as asVar, boolean z) {
            this.f20396a = asVar;
            this.f20397b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            User user;
            if (this.f20397b) {
                DataChannel dataChannel = this.f20396a.p;
                if (dataChannel != null) {
                    bj bjVar = this.f20396a.f20381c;
                    if (bjVar == null || (user = bjVar.f19336e) == null) {
                        j2 = -1;
                    } else {
                        j2 = user.getId();
                    }
                    dataChannel.c(ac.class, Long.valueOf(j2));
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = this.f20396a.p;
            if (dataChannel2 != null) {
                af afVar = this.f20396a.f20379a;
                if (afVar == null) {
                    bj bjVar2 = this.f20396a.f20381c;
                    if (bjVar2 == null) {
                        l.b();
                    }
                    afVar = new af(bjVar2, 6);
                }
                dataChannel2.b(an.class, afVar);
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        String str;
        bj bjVar;
        bj bjVar2;
        af afVar;
        super.onCreate(bundle);
        DataChannel dataChannel = this.p;
        User user = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f20382d = room;
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 == null || (str = (String) dataChannel2.b(au.class)) == null) {
            str = "";
        }
        this.f20383e = str;
        if (l.a((Object) "qa_board", (Object) str)) {
            DataChannel dataChannel3 = this.p;
            if (dataChannel3 != null) {
                afVar = (af) dataChannel3.b(ag.class);
            } else {
                afVar = null;
            }
            this.f20379a = afVar;
        }
        af afVar2 = this.f20379a;
        if (afVar2 != null) {
            bjVar = afVar2.f20351a;
        } else {
            bjVar = null;
        }
        this.f20381c = bjVar;
        if (bjVar == null) {
            DataChannel dataChannel4 = this.p;
            if (dataChannel4 != null) {
                bjVar2 = (bj) dataChannel4.b(ad.class);
            } else {
                bjVar2 = null;
            }
            this.f20381c = bjVar2;
        }
        bj bjVar3 = this.f20381c;
        if (bjVar3 != null) {
            user = bjVar3.f19336e;
        }
        this.f20380b = user;
        DataChannel dataChannel5 = this.p;
        if (dataChannel5 != null) {
            dataChannel5.a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.a.class, (h.f.a.b) new c(this));
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f20392a;

        static {
            Covode.recordClassIndex(12040);
        }

        e(as asVar) {
            this.f20392a = asVar;
        }

        public final void onClick(View view) {
            bj bjVar;
            as asVar = this.f20392a;
            b.a.a("livesdk_anchor_qa_more_click_module").a("action_type", "report_question").b();
            String a2 = com.bytedance.android.livesdk.ab.e.a();
            String d2 = com.bytedance.android.livesdk.ab.e.d();
            Room room = asVar.f20382d;
            if (!(room == null || (bjVar = asVar.f20381c) == null)) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                User user = bjVar.f19336e;
                l.b(user, "");
                long id2 = user.getId();
                User user2 = bjVar.f19336e;
                l.b(user2, "");
                com.bytedance.android.livesdkapi.model.d dVar = new com.bytedance.android.livesdkapi.model.d(id, ownerUserId, id2, user2.getSecUid(), asVar.f20383e, bjVar.f19332a, bjVar.f19333b, room.getRequestId(), a2, d2, "report_question", "3");
                dVar.s = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                if (l.a((Object) dVar.f23281h, (Object) "qa_board")) {
                    double b2 = (double) y.b();
                    Double.isNaN(b2);
                    dVar.f23278e = (int) y.e((int) (b2 * 0.73d));
                }
                ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(asVar.getContext(), dVar);
            }
            this.f20392a.b(false);
            this.f20392a.dismiss();
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ User f20387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ as f20389c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f20390d;

        static {
            Covode.recordClassIndex(12036);
        }

        b(User user, long j2, as asVar, boolean z) {
            this.f20387a = user;
            this.f20388b = j2;
            this.f20389c = asVar;
            this.f20390d = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long l2;
            Long l3;
            final String str;
            Long l4;
            Long l5;
            String str2;
            final com.bytedance.android.live.broadcast.model.j jVar = (com.bytedance.android.live.broadcast.model.j) obj;
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            String str3 = null;
            if (b2 != null) {
                l2 = Long.valueOf(b2.c());
            } else {
                l2 = null;
            }
            Room room = this.f20389c.f20382d;
            if (room != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l3 = null;
            }
            if (l.a(l2, l3)) {
                str = "anchor";
            } else {
                str = "admin";
            }
            if (l.a((Object) this.f20389c.f20383e, (Object) "qa_board")) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_mute_click").a(this.f20389c.p).a("default_mute_set", jVar.f7925a);
                User user = this.f20389c.f20380b;
                if (user != null) {
                    l4 = Long.valueOf(user.getId());
                } else {
                    l4 = null;
                }
                com.bytedance.android.livesdk.ab.b a3 = a2.a("to_user_id", String.valueOf(l4)).a("entry_point", "QnA");
                Room room2 = this.f20389c.f20382d;
                if (room2 != null) {
                    l5 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l5 = null;
                }
                com.bytedance.android.livesdk.ab.b a4 = a3.a("anchor_id", (Number) l5);
                Room room3 = this.f20389c.f20382d;
                if (room3 != null) {
                    str3 = String.valueOf(room3.getId());
                }
                com.bytedance.android.livesdk.ab.b a5 = a4.a("room_id", str3).a("admin_type", str);
                if (this.f20390d) {
                    str2 = "set";
                } else {
                    str2 = "cancel";
                }
                a5.a("action_type", str2).b();
            }
            if (!this.f20390d) {
                ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).unmuteUser(this.f20387a, this.f20388b, this.f20389c);
            } else if (l.a((Object) this.f20389c.f20383e, (Object) "qa_board")) {
                androidx.fragment.app.d muteConfirmDialog = ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getMuteConfirmDialog(new h.f.a.b<com.bytedance.android.live.broadcast.model.j, z>(this) {
                    /* class com.bytedance.android.livesdk.qa.as.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(12037);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.j jVar) {
                        Long l2;
                        com.bytedance.android.live.broadcast.model.j jVar2 = jVar;
                        l.d(jVar2, "");
                        ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).muteUser(this.this$0.f20387a, this.this$0.f20388b, jVar2, this.this$0.f20389c);
                        this.this$0.f20389c.b(true);
                        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_mute_set").a(this.this$0.f20389c.p).a("admin_type", str).a("default_mute_set", jVar.f7925a).a("mute_duration", jVar2.f7925a).a("to_user_id", String.valueOf(this.this$0.f20387a.getId())).a("entry_point", "QnA");
                        Room room = this.this$0.f20389c.f20382d;
                        String str = null;
                        if (room != null) {
                            l2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l2 = null;
                        }
                        com.bytedance.android.livesdk.ab.b a3 = a2.a("anchor_id", (Number) l2);
                        Room room2 = this.this$0.f20389c.f20382d;
                        if (room2 != null) {
                            str = String.valueOf(room2.getId());
                        }
                        a3.a("room_id", str).b();
                        return z.f158842a;
                    }
                });
                if (muteConfirmDialog != null) {
                    muteConfirmDialog.show(this.f20389c.getFragmentManager(), "ReportQuestionAnchorDialog");
                }
            } else {
                User user2 = this.f20387a;
                long j2 = this.f20388b;
                l.b(jVar, "");
                ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).muteUser(user2, j2, jVar, this.f20389c);
                this.f20389c.b(true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        User user;
        Boolean bool;
        Boolean bool2;
        Long l2;
        ba userAttr;
        ba userAttr2;
        String a2;
        ba userAttr3;
        Boolean bool3;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (bool3 = (Boolean) dataChannel.b(ao.class)) == null) {
            z = false;
        } else {
            z = bool3.booleanValue();
        }
        if (z) {
            ((LiveTextView) a_(R.id.dks)).setOnClickListener(new d(this));
        } else {
            LiveTextView liveTextView = (LiveTextView) a_(R.id.dks);
            l.b(liveTextView, "");
            liveTextView.setVisibility(8);
        }
        String a3 = com.bytedance.android.livesdk.ac.g.a(this.f20380b);
        LiveTextView liveTextView2 = (LiveTextView) a_(R.id.crr);
        if (liveTextView2 != null) {
            User user2 = this.f20380b;
            if (user2 == null || (userAttr3 = user2.getUserAttr()) == null || !userAttr3.f19029a) {
                a2 = y.a((int) R.string.eb9, a3);
            } else {
                a2 = y.a((int) R.string.ebk, a3);
            }
            liveTextView2.setText(a2);
        }
        LiveTextView liveTextView3 = (LiveTextView) a_(R.id.tx);
        if (liveTextView3 != null) {
            liveTextView3.setText(y.a((int) R.string.eb3, a3));
        }
        DataChannel dataChannel2 = this.p;
        Long l3 = null;
        if (dataChannel2 != null) {
            user = (User) dataChannel2.b(dn.class);
            if (!(user == null || (userAttr2 = user.getUserAttr()) == null)) {
                bool = Boolean.valueOf(userAttr2.f19030b);
            }
            bool = null;
        } else {
            user = null;
            bool = null;
        }
        if (p.a(bool)) {
            User user3 = this.f20380b;
            if (user3 == null || (userAttr = user3.getUserAttr()) == null) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(userAttr.f19030b);
            }
            if (p.a(bool2)) {
                p.a(a_(R.id.crr));
                p.a(a_(R.id.tx));
                User user4 = this.f20380b;
                if (user4 != null) {
                    l2 = Long.valueOf(user4.getId());
                } else {
                    l2 = null;
                }
                if (user != null) {
                    l3 = Long.valueOf(user.getId());
                }
                if (!l.a(l2, l3)) {
                    p.a(a_(R.id.dks));
                }
            }
        }
        ((LiveTextView) a_(R.id.dlz)).setOnClickListener(new e(this));
        ((LiveTextView) a_(R.id.crr)).setOnClickListener(new f(this));
        ((LiveTextView) a_(R.id.tx)).setOnClickListener(new g(this));
        ((LiveTextView) a_(R.id.a1p)).setOnClickListener(new h(this));
    }
}
