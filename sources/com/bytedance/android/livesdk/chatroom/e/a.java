package com.bytedance.android.livesdk.chatroom.e;

import android.util.SparseBooleanArray;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.c.w;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends r<AbstractC0326a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private f.a.b.b f15329a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f15330b;

    /* renamed from: c  reason: collision with root package name */
    private Room f15331c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15332d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$a  reason: collision with other inner class name */
    public interface AbstractC0326a extends bq {
        static {
            Covode.recordClassIndex(8472);
        }

        void a(int i2);

        void a(SparseBooleanArray sparseBooleanArray, boolean z);

        void a(ag agVar);

        void a(com.bytedance.android.livesdk.model.message.c cVar);
    }

    static {
        Covode.recordClassIndex(8471);
    }

    @Override // com.bytedance.ies.a.b, com.bytedance.android.livesdk.chatroom.e.r
    public final void b() {
        super.b();
        DataChannel dataChannel = this.w;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
        f.a.b.b bVar = this.f15329a;
        if (bVar != null) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f15330b;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15333a;

        static {
            Covode.recordClassIndex(8473);
        }

        b(a aVar) {
            this.f15333a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((AbstractC0326a) this.f15333a.y).a(((InRoomBannerManager.a) obj).f7357b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15334a;

        static {
            Covode.recordClassIndex(8474);
        }

        c(a aVar) {
            this.f15334a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f15334a.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(8475);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            int i2;
            boolean booleanValue = bool.booleanValue();
            AbstractC0326a aVar = (AbstractC0326a) this.this$0.y;
            if (aVar != null) {
                if (booleanValue) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                aVar.a(i2);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15335a;

        static {
            Covode.recordClassIndex(8476);
        }

        e(a aVar) {
            this.f15335a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g gVar = (g) obj;
            AbstractC0326a aVar = (AbstractC0326a) this.f15335a.y;
            if (aVar != null) {
                l.b(gVar, "");
                SparseBooleanArray sparseBooleanArray = gVar.f17192a;
                l.b(sparseBooleanArray, "");
                aVar.a(sparseBooleanArray, gVar.f17194c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f15336a;

        static {
            Covode.recordClassIndex(8477);
        }

        f(a aVar) {
            this.f15336a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            w wVar = (w) obj;
            AbstractC0326a aVar = (AbstractC0326a) this.f15336a.y;
            if (aVar != null) {
                Boolean bool = wVar.f15167a;
                l.b(bool, "");
                if (bool.booleanValue()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                aVar.a(i2);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof ag) {
            ag agVar = (ag) iMessage;
            if (agVar.f19131f == 5) {
                ((AbstractC0326a) this.y).a(agVar);
            }
        }
    }

    public final String a(String str) {
        String str2;
        User owner;
        l.d(str, "");
        String c2 = com.bytedance.android.livesdk.ab.e.c();
        long h2 = com.bytedance.android.livesdk.ab.e.h();
        String j2 = com.bytedance.android.livesdk.ab.e.j();
        String k2 = com.bytedance.android.livesdk.ab.e.k();
        String e2 = com.bytedance.android.livesdk.ab.e.e();
        com.bytedance.android.livesdk.model.utils.b bVar = new com.bytedance.android.livesdk.model.utils.b(str);
        Room room = this.f15331c;
        if (room != null) {
            bVar.a("room_id", room.getId());
        }
        bVar.a("mode", "live_room");
        Room room2 = this.f15331c;
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            bVar.a("anchor_id", owner.getId());
        }
        bVar.a("back_up_room_id", com.bytedance.android.livesdk.ab.m.f13595a);
        bVar.a("back_up_anchor_id", com.bytedance.android.livesdk.ab.m.f13596b);
        bVar.a("is_anchor", String.valueOf(this.f15332d));
        bVar.a("enter_from", "");
        bVar.a("source_v3", c2);
        bVar.a("anchor_id", h2);
        bVar.a("log_pb", j2);
        bVar.a("request_id", k2);
        if (this.f15332d) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        bVar.a("event_page", str2);
        bVar.a("event_belong", "live_interact");
        bVar.a("action_type", e2);
        String a2 = bVar.a();
        l.b(a2, "");
        return a2;
    }

    public final void a(AbstractC0326a aVar) {
        boolean z;
        Long l2;
        l.d(aVar, "");
        super.a((bq) aVar);
        this.f15331c = (Room) this.w.b(df.class);
        Boolean bool = (Boolean) this.w.b(ee.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f15332d = z;
        IMessageManager iMessageManager = this.x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
        Room room = this.f15331c;
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        com.bytedance.android.livesdk.util.rxutils.autodispose.z zVar = (com.bytedance.android.livesdk.util.rxutils.autodispose.z) InRoomBannerManager.a(l2).a(t());
        if (zVar != null) {
            zVar.a(new b(this), new c(this));
        }
        this.w.a(this, ba.class, new d(this));
        if (l.a(this.w.b(cp.class), (Object) false)) {
            this.f15329a = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(g.class).a(t())).a(new e(this));
        }
        this.f15330b = ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(w.class).a(t())).a(new f(this));
    }
}
