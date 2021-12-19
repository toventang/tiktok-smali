package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;

public final class f implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public b f15234a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHandler f15235b;

    /* renamed from: c  reason: collision with root package name */
    public long f15236c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<com.bytedance.android.livesdkapi.h.a> f15237d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f15238e = false;

    /* renamed from: f  reason: collision with root package name */
    public e f15239f;

    /* renamed from: g  reason: collision with root package name */
    private final a f15240g;

    /* renamed from: h  reason: collision with root package name */
    private final long f15241h;

    /* renamed from: i  reason: collision with root package name */
    private final String f15242i;

    /* renamed from: j  reason: collision with root package name */
    private final String f15243j;

    /* renamed from: k  reason: collision with root package name */
    private final String f15244k;

    /* renamed from: l  reason: collision with root package name */
    private final String f15245l;

    /* renamed from: m  reason: collision with root package name */
    private final String f15246m;
    private final String n;
    private boolean o = false;

    public interface a {
        static {
            Covode.recordClassIndex(8439);
        }

        void a(int i2, String str, String str2);

        void a(e eVar);
    }

    static {
        Covode.recordClassIndex(8438);
    }

    public final void b() {
        this.f15238e = false;
        this.o = true;
        this.f15239f = null;
        this.f15235b.removeCallbacksAndMessages(null);
        com.bytedance.android.live.core.c.a.a(4, "PreFetchRoomInfoManager", "EnterRoomController stop roomid :" + this.f15241h);
        this.f15237d.clear();
    }

    public final void a() {
        com.bytedance.android.live.core.c.a.a(4, "PreFetchRoomInfoManager", "EnterRoomController try to start roomid :" + this.f15241h);
        if (!this.f15238e) {
            com.bytedance.android.live.core.c.a.a(4, "PreFetchRoomInfoManager", "EnterRoomController start roomid :" + this.f15241h);
            this.o = false;
            this.f15238e = true;
            this.f15236c = System.currentTimeMillis();
            com.bytedance.android.livesdk.chatroom.b.f.f14958a.a(this.f15235b, this.f15241h, this.f15242i, this.f15243j, this.f15244k, this.f15246m, this.n);
            this.f15237d.clear();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        Room room;
        com.bytedance.android.livesdk.model.a.b bVar;
        com.bytedance.android.live.core.c.a.a(4, "PreFetchRoomInfoManager", "handleMsg roomid :" + this.f15241h);
        if (message.what != 32 || this.o) {
            if (message.what == 4 && this.f15238e) {
                if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                    com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) message.obj;
                    a(aVar.getErrorCode(), aVar.getErrorMsg(), aVar.getPrompt());
                } else if (message.obj instanceof Exception) {
                    a(0, message.obj.toString(), null);
                } else {
                    com.bytedance.android.live.core.c.a.a(4, "PreFetchRoomInfoManager", "handleMsg success roomid :" + this.f15241h);
                    if (!(message.obj instanceof e) || ((e) message.obj).f15757a == null || !Room.isValid(((e) message.obj).f15757a)) {
                        if (!(message.obj instanceof e)) {
                            str = "response unexpected";
                        } else if (((e) message.obj).f15757a == null) {
                            str = "room is null";
                        } else {
                            str = "invalid room data";
                        }
                        a(0, str, null);
                        return;
                    }
                    e eVar = (e) message.obj;
                    this.f15239f = eVar;
                    this.f15238e = false;
                    this.f15240g.a(eVar);
                    if (eVar != null && (room = eVar.f15757a) != null && room.multiLiveUserSettings != null && room.multiLiveUserSettings.f18940a != null && (bVar = room.multiLiveUserSettings.f18940a.f18939a) != null) {
                        com.bytedance.android.livesdk.chatroom.model.c.a aVar2 = d.a().w;
                        if (aVar2 == null) {
                            aVar2 = new com.bytedance.android.livesdk.chatroom.model.c.a((byte) 0);
                        }
                        int i2 = bVar.f18938a;
                        if (i2 == 1) {
                            aVar2.f15742c = 3;
                            aVar2.f15743d = 4;
                            d.a().w = aVar2;
                        } else if (i2 == 2) {
                            aVar2.f15742c = 3;
                            aVar2.f15743d = 3;
                            d.a().w = aVar2;
                        } else if (i2 == 3) {
                            aVar2.f15742c = 4;
                            aVar2.f15743d = 4;
                            d.a().w = aVar2;
                        }
                    }
                }
            }
        } else if (message.obj instanceof Throwable) {
            a(0, "finish_abnormal fail", null);
        } else {
            a();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f15247a;

        /* renamed from: b  reason: collision with root package name */
        public String f15248b;

        /* renamed from: c  reason: collision with root package name */
        public String f15249c;

        static {
            Covode.recordClassIndex(8440);
        }

        public b(int i2, String str, String str2) {
            this.f15247a = i2;
            this.f15248b = str;
            this.f15249c = str2;
        }
    }

    private void a(int i2, String str, String str2) {
        this.f15234a = new b(i2, str, str2);
        this.f15238e = false;
        this.f15240g.a(i2, str, str2);
    }

    public f(a aVar, long j2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15240g = aVar;
        this.f15241h = j2;
        this.f15242i = str;
        this.f15243j = str2;
        this.f15235b = new WeakHandler(Looper.getMainLooper(), this);
        this.f15244k = str3;
        this.f15245l = str4;
        this.f15246m = str5;
        this.n = str6;
    }
}
