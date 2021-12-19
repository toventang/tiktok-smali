package com.bytedance.android.live.liveinteract.cohost.a.d;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.liveinteract.cohost.a.a.a;
import com.bytedance.android.live.liveinteract.cohost.a.b.k;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.platform.common.g.p;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.ab;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class a extends a.AbstractC0156a {

    /* renamed from: a  reason: collision with root package name */
    private f.a.b.b f10090a;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.live.liveinteract.platform.a.c f10091b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f10092c;

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10095a = new c();

        static {
            Covode.recordClassIndex(5287);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5284);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.AbstractC0156a
    public final void a() {
        f.a.b.b bVar = this.f10090a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.AbstractC0156a
    public final void b() {
        ((z) com.bytedance.android.live.liveinteract.platform.common.api.a.a(4, true).a(f())).a(C0161a.f10093a, b.f10094a);
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10100a;

        static {
            Covode.recordClassIndex(5290);
        }

        f(a aVar) {
            this.f10100a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10100a.a((Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.a$a  reason: collision with other inner class name */
    static final class C0161a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0161a f10093a = new C0161a();

        static {
            Covode.recordClassIndex(5285);
        }

        C0161a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cj, (Object) true);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10094a = new b();

        static {
            Covode.recordClassIndex(5286);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cj, (Object) true);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f10099b;

        static {
            Covode.recordClassIndex(5289);
        }

        e(a aVar, int i2) {
            this.f10098a = aVar;
            this.f10099b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue();
            com.bytedance.android.live.core.c.a.a(4, "receive_count_down", "sec = ".concat(String.valueOf(longValue)));
            a.b bVar = (a.b) this.f10098a.f10031h;
            if (bVar != null) {
                bVar.a(this.f10099b, (int) longValue);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.AbstractC0156a
    public final void a(int i2) {
        com.bytedance.android.live.core.c.a.a(4, "receive_count_down", "time = ".concat(String.valueOf(i2)));
        this.f10090a = ((z) com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b((long) (i2 + 1)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(this.f10031h.f10033a.e()))).a(new e(this, i2), new f(this));
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f10097b;

        static {
            Covode.recordClassIndex(5288);
        }

        d(a aVar, HashMap hashMap) {
            this.f10096a = aVar;
            this.f10097b = hashMap;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            long j3;
            String str;
            int i2;
            Throwable th = (Throwable) obj;
            HashMap hashMap = this.f10097b;
            long id = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getId();
            if (hashMap.get("channel_id") != null) {
                j2 = ((Long) hashMap.get("channel_id")).longValue();
            } else {
                j2 = 0;
            }
            if (hashMap.get("inviter_uid") != null) {
                j3 = ((Long) hashMap.get("inviter_uid")).longValue();
            } else {
                j3 = 0;
            }
            if (hashMap.get("inviter_sec_uid") != null) {
                str = hashMap.get("inviter_sec_uid").toString();
            } else {
                str = "";
            }
            com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
            long id2 = a2.getId();
            String secUid = a2.getSecUid();
            if (hashMap.get("vendor") != null) {
                i2 = ((Integer) hashMap.get("vendor")).intValue();
            } else {
                i2 = 0;
            }
            p.a(id, j2, j3, str, id2, secUid, String.valueOf(p.f11998a), i2, p.a.FAILED_REPLY.mIssueCategory, p.a.FAILED_REPLY.mIssueContent, p.a(th), th.toString());
            this.f10096a.a(th);
        }
    }

    public a(a.b bVar, DataChannel dataChannel) {
        super(bVar);
        this.f10092c = dataChannel;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.AbstractC0156a
    public final void a(int i2, long j2, long j3, long j4) {
        String str;
        com.bytedance.android.live.liveinteract.platform.a.b a2;
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> b2;
        com.bytedance.android.livesdk.util.rxutils.autodispose.ac acVar;
        long j5 = 0;
        if (this.f10032i.f9940e == 0) {
            com.bytedance.android.live.liveinteract.cohost.c.b.a();
            a.b bVar = (a.b) this.f10031h;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (this.f10032i.w && !TextUtils.isEmpty(this.f10032i.v)) {
                com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply", "start Interact when reply click agree");
                this.f10032i.f9938c = true;
                DataChannel dataChannel = this.f10092c;
                if (dataChannel != null) {
                    dataChannel.c(t.class, new com.bytedance.android.livesdk.chatroom.c.p(4));
                }
            }
            if (com.bytedance.android.live.liveinteract.cohost.a.c.a.b()) {
                com.bytedance.android.live.liveinteract.cohost.a.c.a.a(a.b.EXIT);
            }
        }
        if (this.f10032i.f9941f != 0) {
            j4 = this.f10032i.f9941f;
        }
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Reply", "channelId:" + j2 + "; roomId:" + j3 + "; replyStatus:" + i2 + "; guestUserId:" + j4);
        DataChannel dataChannel2 = this.f10092c;
        if (dataChannel2 != null) {
            dataChannel2.c(k.class, Integer.valueOf(i2));
        }
        com.bytedance.android.live.liveinteract.api.a.b a3 = b.a.a();
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", Long.valueOf(a3.f9940e));
        hashMap.put("inviter_uid", Long.valueOf(a3.f9941f));
        hashMap.put("inviter_sec_uid", a3.f9942g);
        hashMap.put("vendor", Integer.valueOf(a3.d().getValue()));
        com.bytedance.android.live.liveinteract.api.a.b a4 = b.a.a();
        HashMap hashMap2 = new HashMap();
        if (a4.q) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        hashMap2.put("role_type", str);
        hashMap2.put("channel_id", Long.valueOf(a4.f9940e));
        hashMap2.put("guest_user_id", Long.valueOf(a4.f9941f));
        if (a4.L != null) {
            String str2 = a4.L;
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("link_mic_id", str2);
        }
        if (a4.w) {
            j5 = 1;
        }
        hashMap2.put("rtc_join_channel_advance", Long.valueOf(j5));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("reply_status", Integer.valueOf(i2));
        hashMap3.putAll(hashMap2);
        com.bytedance.android.live.liveinteract.platform.a.c cVar = this.f10091b;
        if (!(cVar == null || (a2 = cVar.a()) == null || (b2 = a2.b(hashMap3)) == null || (acVar = (com.bytedance.android.livesdk.util.rxutils.autodispose.ac) b2.a(f())) == null)) {
            acVar.a(c.f10095a, new d(this, hashMap));
        }
        a.b bVar2 = (a.b) this.f10031h;
        if (bVar2 != null) {
            bVar2.a();
        }
    }
}
