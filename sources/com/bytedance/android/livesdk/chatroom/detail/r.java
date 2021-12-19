package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.chatroom.detail.f;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePrefetchRoomInfoEveryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePrefetchRoomInfoSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;
import h.m;

public final class r implements com.bytedance.android.livesdk.watch.c {

    /* renamed from: k  reason: collision with root package name */
    public static final h f15293k = i.a(m.SYNCHRONIZED, b.f15305a);

    /* renamed from: l  reason: collision with root package name */
    public static final a f15294l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f15295a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15296b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15297c;

    /* renamed from: d  reason: collision with root package name */
    public EnterRoomConfig f15298d;

    /* renamed from: e  reason: collision with root package name */
    public f f15299e;

    /* renamed from: f  reason: collision with root package name */
    public y f15300f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f15301g;

    /* renamed from: h  reason: collision with root package name */
    public f.a f15302h;

    /* renamed from: i  reason: collision with root package name */
    public int f15303i;

    /* renamed from: j  reason: collision with root package name */
    public int f15304j;

    public static final class a {
        static {
            Covode.recordClassIndex(8458);
        }

        public static r a() {
            return (r) r.f15293k.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<r> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15305a = new b();

        static {
            Covode.recordClassIndex(8459);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            return new r((byte) 0);
        }
    }

    private r() {
        this.f15295a = 1;
        this.f15296b = 2;
    }

    static {
        Covode.recordClassIndex(8457);
    }

    @Override // com.bytedance.android.livesdk.watch.c
    public final void a() {
        int i2 = this.f15297c;
        this.f15303i = i2;
        this.f15304j = i2;
        y yVar = this.f15300f;
        if (yVar != null) {
            yVar.b();
        }
        f fVar = this.f15299e;
        if (fVar != null) {
            fVar.b();
        }
        this.f15300f = null;
        this.f15299e = null;
        this.f15302h = null;
        this.f15301g = null;
    }

    public /* synthetic */ r(byte b2) {
        this();
    }

    public static final class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f15306a;

        static {
            Covode.recordClassIndex(8460);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(r rVar) {
            this.f15306a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.b.a
        public final void a(Room room) {
            b.a aVar = this.f15306a.f15301g;
            if (aVar != null) {
                aVar.a(room);
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.b.a
        public final void a(int i2, String str) {
            b.a aVar = this.f15306a.f15301g;
            if (aVar != null) {
                aVar.a(i2, str);
            }
        }
    }

    public static final class d implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f15307a;

        static {
            Covode.recordClassIndex(8461);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(r rVar) {
            this.f15307a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.f.a
        public final void a(com.bytedance.android.livesdk.chatroom.model.e eVar) {
            l.d(eVar, "");
            f.a aVar = this.f15307a.f15302h;
            if (aVar != null) {
                aVar.a(eVar);
            }
            r rVar = this.f15307a;
            rVar.f15304j = rVar.f15295a;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.f.a
        public final void a(int i2, String str, String str2) {
            f.a aVar = this.f15307a.f15302h;
            if (aVar != null) {
                aVar.a(i2, str, str2);
            }
            r rVar = this.f15307a;
            rVar.f15304j = rVar.f15296b;
        }
    }

    public static final class e implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f15308a;

        static {
            Covode.recordClassIndex(8462);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(r rVar) {
            this.f15308a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.b.a
        public final void a(Room room) {
            b.a aVar = this.f15308a.f15301g;
            if (aVar != null) {
                aVar.a(room);
            }
            r rVar = this.f15308a;
            rVar.f15303i = rVar.f15295a;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.b.a
        public final void a(int i2, String str) {
            b.a aVar = this.f15308a.f15301g;
            if (aVar != null) {
                aVar.a(i2, str);
            }
            r rVar = this.f15308a;
            rVar.f15303i = rVar.f15296b;
        }
    }

    public final boolean a(long j2) {
        boolean z;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig = this.f15298d;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f23299c) == null || roomsData.R != j2) {
            z = false;
        } else {
            z = true;
        }
        this.f15298d = null;
        return z;
    }

    public final void a(f.a aVar) {
        f.b bVar;
        String str;
        f.b bVar2;
        f.b bVar3;
        l.d(aVar, "");
        this.f15302h = aVar;
        int i2 = this.f15304j;
        String str2 = null;
        com.bytedance.android.livesdk.chatroom.model.e eVar = null;
        str2 = null;
        if (i2 == this.f15295a) {
            if (aVar != null) {
                f fVar = this.f15299e;
                if (fVar != null) {
                    eVar = fVar.f15239f;
                }
                aVar.a(eVar);
            }
            this.f15304j = this.f15297c;
        } else if (i2 == this.f15296b) {
            f fVar2 = this.f15299e;
            if (!(fVar2 == null || (bVar = fVar2.f15234a) == null)) {
                int i3 = bVar.f15247a;
                f.a aVar2 = this.f15302h;
                if (aVar2 != null) {
                    f fVar3 = this.f15299e;
                    if (fVar3 == null || (bVar3 = fVar3.f15234a) == null) {
                        str = null;
                    } else {
                        str = bVar3.f15248b;
                    }
                    f fVar4 = this.f15299e;
                    if (!(fVar4 == null || (bVar2 = fVar4.f15234a) == null)) {
                        str2 = bVar2.f15249c;
                    }
                    aVar2.a(i3, str, str2);
                }
            }
            this.f15304j = this.f15297c;
        }
    }

    public final void b(EnterRoomConfig enterRoomConfig) {
        String str = "";
        l.d(enterRoomConfig, str);
        this.f15298d = enterRoomConfig;
        if (!TextUtils.isEmpty(enterRoomConfig.f23299c.Z)) {
            str = enterRoomConfig.f23299c.Z;
        } else if (!TextUtils.isEmpty(enterRoomConfig.f23299c.J)) {
            if (TextUtils.isEmpty(enterRoomConfig.f23299c.L)) {
                str = enterRoomConfig.f23299c.J;
            } else {
                str = enterRoomConfig.f23299c.J + "-" + enterRoomConfig.f23299c.L;
            }
        }
        f fVar = new f(new d(this), enterRoomConfig.f23299c.R, enterRoomConfig.f23298b.f23309a, enterRoomConfig.f23299c.ab, enterRoomConfig.f23299c.z, enterRoomConfig.f23299c.X, str, enterRoomConfig.f23298b.f23314f);
        this.f15299e = fVar;
        fVar.a();
    }

    @Override // com.bytedance.android.livesdk.watch.c
    public final void a(EnterRoomConfig enterRoomConfig) {
        l.d(enterRoomConfig, "");
        if (LivePrefetchRoomInfoSetting.INSTANCE.getValue() == 1 && (enterRoomConfig.f23297a.f23349m || (TextUtils.isEmpty(enterRoomConfig.f23297a.f23340d) && TextUtils.isEmpty(enterRoomConfig.f23297a.f23338b)))) {
            a();
            if (!TextUtils.isEmpty(enterRoomConfig.f23299c.D) && (!l.a((Object) enterRoomConfig.f23299c.D, (Object) "0"))) {
                enterRoomConfig.f23299c.f23324c = true;
                this.f15298d = enterRoomConfig;
                String str = enterRoomConfig.f23299c.D;
                if (str == null) {
                    l.b();
                }
                y yVar = new y(new e(this), Long.parseLong(str), enterRoomConfig.f23299c.f23325d);
                this.f15300f = yVar;
                yVar.a();
            } else if (enterRoomConfig.f23299c.R > 0) {
                b(enterRoomConfig);
            }
        } else if (LivePrefetchRoomInfoEveryTimeSetting.INSTANCE.getValue() == 1) {
            a();
            if (enterRoomConfig.f23299c.R > 0) {
                b(enterRoomConfig);
            }
        }
    }
}
