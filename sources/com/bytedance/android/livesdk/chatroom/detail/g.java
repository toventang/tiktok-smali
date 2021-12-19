package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.chatroom.ui.bq;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.d.o;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15250d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Context f15251a;

    /* renamed from: b  reason: collision with root package name */
    public EnterRoomConfig.GuestUser f15252b;

    /* renamed from: c  reason: collision with root package name */
    public Room f15253c;

    static {
        Covode.recordClassIndex(8441);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8442);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements bq.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f15255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Room f15256b;

        static {
            Covode.recordClassIndex(8444);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.bq.b
        public final void a() {
            g gVar = this.f15255a;
            Room room = this.f15256b;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
            f fVar = f.a.f23366a;
            l.b(fVar, "");
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, "");
            roomsData.au = a2.f23354b.f23299c.au;
            o.a(room, "", enterRoomConfig);
            enterRoomConfig.f23299c.J = "live_detail";
            enterRoomConfig.f23299c.L = "guest_connection_distribution";
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            f fVar2 = f.a.f23366a;
            l.b(fVar2, "");
            fVar2.a(enterRoomLinkSession);
            j jVar = (j) com.bytedance.android.live.t.a.a(j.class);
            if (jVar != null) {
                Context context = gVar.f15251a;
                if (context == null) {
                    l.a("context");
                }
                jVar.b(context, enterRoomConfig);
            }
        }

        c(g gVar, Room room) {
            this.f15255a = gVar;
            this.f15256b = room;
        }
    }

    public static final class b implements z<d<Room>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f15254a;

        static {
            Covode.recordClassIndex(8443);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(g gVar) {
            this.f15254a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(d<Room> dVar) {
            Room room;
            Long l2;
            d<Room> dVar2 = dVar;
            l.d(dVar2, "");
            if (dVar2.data != null && ((room = (Room) dVar2.data) == null || room.getId() != 0)) {
                Room room2 = (Room) dVar2.data;
                Long l3 = null;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getId());
                } else {
                    l2 = null;
                }
                Room room3 = this.f15254a.f15253c;
                if (room3 != null) {
                    l3 = Long.valueOf(room3.getId());
                }
                if (!l.a(l2, l3)) {
                    g gVar = this.f15254a;
                    Room room4 = (Room) dVar2.data;
                    Context context = gVar.f15251a;
                    if (context == null) {
                        l.a("context");
                    }
                    Context context2 = gVar.f15251a;
                    if (context2 == null) {
                        l.a("context");
                    }
                    Object[] objArr = new Object[1];
                    EnterRoomConfig.GuestUser guestUser = gVar.f15252b;
                    if (guestUser == null) {
                        l.a("guestUser");
                    }
                    objArr[0] = guestUser.f23306b;
                    String string = context2.getString(R.string.ed5, objArr);
                    Context context3 = gVar.f15251a;
                    if (context3 == null) {
                        l.a("context");
                    }
                    String string2 = context3.getString(R.string.e92);
                    c cVar = new c(gVar, room4);
                    l.d(context, "");
                    bq bqVar = new bq(context);
                    bqVar.f15982a = cVar;
                    bqVar.f15983b = string;
                    bqVar.f15984c = string2;
                    bqVar.show();
                    return;
                }
            }
            Context context4 = this.f15254a.f15251a;
            if (context4 == null) {
                l.a("context");
            }
            Object[] objArr2 = new Object[1];
            EnterRoomConfig.GuestUser guestUser2 = this.f15254a.f15252b;
            if (guestUser2 == null) {
                l.a("guestUser");
            }
            objArr2[0] = guestUser2.f23306b;
            ao.a(y.e(), context4.getString(R.string.e9n, objArr2), 0);
        }
    }
}
