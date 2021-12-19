package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class af implements com.bytedance.android.livesdkapi.host.j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f108436a = new a((byte) 0);

    static {
        Covode.recordClassIndex(69484);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69485);
        }

        private a() {
        }

        public static boolean a() {
            if (com.bytedance.l.a.a() == null) {
                return true;
            }
            Integer num = (Integer) com.bytedance.l.a.a().a("live_mt_remove_traffic_dialog", (Object) 0);
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f108440a = new d();

        static {
            Covode.recordClassIndex(69488);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            com.bytedance.android.live.core.c.a.a("userid_watchLive", th);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f108437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f108438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f108439c;

        static {
            Covode.recordClassIndex(69487);
        }

        c(af afVar, EnterRoomConfig enterRoomConfig, Context context) {
            this.f108437a = afVar;
            this.f108438b = enterRoomConfig;
            this.f108439c = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            User user = (User) obj;
            l.d(user, "");
            long liveRoomId = user.getLiveRoomId();
            if (liveRoomId > 0) {
                this.f108438b.f23299c.R = liveRoomId;
                this.f108438b.f23298b.f23319k = liveRoomId;
                this.f108437a.a(this.f108439c, this.f108438b);
                return;
            }
            String string = y.e().getString(R.string.gsh);
            l.b(string, "");
            ao.a(this.f108439c, string, 0);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.live.deeplink.c, z> {
        final /* synthetic */ EnterRoomConfig $config;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $uniqueId;
        final /* synthetic */ af this$0;

        static {
            Covode.recordClassIndex(69486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(af afVar, EnterRoomConfig enterRoomConfig, String str, Context context) {
            super(1);
            this.this$0 = afVar;
            this.$config = enterRoomConfig;
            this.$uniqueId = str;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.live.deeplink.c cVar) {
            com.ss.android.ugc.aweme.live.deeplink.c cVar2 = cVar;
            if (cVar2 != null) {
                EnterRoomConfig.RoomsData roomsData = this.$config.f23299c;
                String str = cVar2.f108354c;
                if (str == null) {
                    str = "0";
                }
                roomsData.R = Long.parseLong(str);
                this.$config.f23299c.f23325d = cVar2.f108353b;
                this.$config.f23298b.f23310b = cVar2.f108352a;
                this.$config.f23299c.D = cVar2.f108352a;
                EnterRoomConfig.GuestUser guestUser = this.$config.f23299c.au;
                if (guestUser != null) {
                    long j2 = 0;
                    if (guestUser.f23305a == 0) {
                        try {
                            EnterRoomConfig.GuestUser guestUser2 = this.$config.f23299c.au;
                            if (guestUser2 != null) {
                                String str2 = cVar2.f108352a;
                                if (str2 != null) {
                                    j2 = Long.parseLong(str2);
                                }
                                guestUser2.f23305a = j2;
                            }
                        } catch (NumberFormatException unused) {
                            EnterRoomConfig.GuestUser guestUser3 = this.$config.f23299c.au;
                            if (guestUser3 != null) {
                                guestUser3.f23305a = -1;
                            }
                        }
                        EnterRoomConfig.GuestUser guestUser4 = this.$config.f23299c.au;
                        if (guestUser4 != null) {
                            guestUser4.f23306b = this.$uniqueId;
                        }
                    }
                }
                this.this$0.a(this.$context, this.$config);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f108443a = new f();

        static {
            Covode.recordClassIndex(69490);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final g f108444a = new g();

        static {
            Covode.recordClassIndex(69491);
        }

        g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f108445a = new h();

        static {
            Covode.recordClassIndex(69492);
        }

        h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f108450a = new j();

        static {
            Covode.recordClassIndex(69494);
        }

        j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static EnterRoomConfig a(Room room, EnterRoomConfig enterRoomConfig) {
        enterRoomConfig.f23299c.Y = room.getId();
        return enterRoomConfig;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f108441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f108442b;

        static {
            Covode.recordClassIndex(69489);
        }

        e(Context context, EnterRoomConfig enterRoomConfig) {
            this.f108441a = context;
            this.f108442b = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).a(this.f108441a);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            com.bytedance.android.live.base.a b2 = com.bytedance.l.a.b(com.ss.android.ugc.aweme.live.g.class);
            l.b(b2, "");
            ((com.ss.android.ugc.aweme.live.g) b2).b().a(this.f108441a, this.f108442b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f108446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EnterRoomLinkSession f108447b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Room f108448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f108449d;

        static {
            Covode.recordClassIndex(69493);
        }

        i(af afVar, EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
            this.f108446a = afVar;
            this.f108447b = enterRoomLinkSession;
            this.f108448c = room;
            this.f108449d = enterRoomConfig;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            l.d(dialogInterface, "");
            EnterRoomLinkSession enterRoomLinkSession = this.f108447b;
            l.b(enterRoomLinkSession, "");
            Room room = this.f108448c;
            long j2 = this.f108449d.f23299c.R;
            EnterRoomConfig a2 = af.a(room, this.f108449d);
            com.bytedance.android.livesdk.event.e eVar = new com.bytedance.android.livesdk.event.e(j2);
            enterRoomLinkSession.a(new Event("live_scheme_jump_to_other_room", 772, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
            eVar.f17190d = a2;
            if (l.a((Object) "true", (Object) a2.f23299c.f23330i)) {
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.f(eVar));
            } else {
                if (ReturnBackSettingsSetting.INSTANCE.getValue().a()) {
                    if (!((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoom() || !a2.f23299c.ag) {
                        str = "jump_source_live_banner";
                    } else {
                        str = "jump_source_mic_room";
                    }
                    a2.f23299c.av = str;
                }
                com.bytedance.android.livesdk.an.a.a().a(eVar);
            }
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.j
    public final void b(Context context, EnterRoomConfig enterRoomConfig) {
        l.d(context, "");
        l.d(enterRoomConfig, "");
        f.a.f23366a.a(new EnterRoomLinkSession(enterRoomConfig));
        enterRoomConfig.f23299c.aa = "inner_jump";
        if (com.bytedance.common.utility.l.b(context) || ((com.bytedance.l.a.a.f) com.bytedance.l.a.b(com.bytedance.l.a.a.f.class)).b(context) || !(context instanceof Activity) || !a.a()) {
            com.bytedance.android.live.base.a b2 = com.bytedance.l.a.b(com.ss.android.ugc.aweme.live.g.class);
            l.b(b2, "");
            ((com.ss.android.ugc.aweme.live.g) b2).b().a(context, enterRoomConfig);
            return;
        }
        new a.C0731a(context).b(R.string.h_m).a(R.string.asg, (DialogInterface.OnClickListener) new e(context, enterRoomConfig), false).b(R.string.a9e, (DialogInterface.OnClickListener) f.f108443a, false).a().c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022f, code lost:
        if (h.f.b.l.a(r1, com.bytedance.android.livesdk.chatroom.f.c.f15496a) == false) goto L_0x0246;
     */
    @Override // com.bytedance.android.livesdkapi.host.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r13, com.bytedance.android.livesdkapi.session.EnterRoomConfig r14) {
        /*
        // Method dump skipped, instructions count: 641
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.af.a(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    /* access modifiers changed from: package-private */
    public static final class k implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f108451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f108452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EnterRoomConfig f108453c;

        static {
            Covode.recordClassIndex(69495);
        }

        k(af afVar, Context context, EnterRoomConfig enterRoomConfig) {
            this.f108451a = afVar;
            this.f108452b = context;
            this.f108453c = enterRoomConfig;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                this.f108451a.a(this.f108452b, this.f108453c);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.j
    public final void a(Context context, EnterRoomConfig enterRoomConfig, long j2) {
        l.d(context, "");
        l.d(enterRoomConfig, "");
        u.a().b().b(j2).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, enterRoomConfig, context), d.f108440a);
    }

    @Override // com.bytedance.android.livesdkapi.host.j
    public final void a(Context context, EnterRoomConfig enterRoomConfig, String str) {
        l.d(context, "");
        l.d(enterRoomConfig, "");
        l.d(str, "");
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        com.ss.android.ugc.aweme.story.live.b f2 = s.f();
        l.b(f2, "");
        f2.c().a(str, new b(this, enterRoomConfig, str, context));
    }
}
