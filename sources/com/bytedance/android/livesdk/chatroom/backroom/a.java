package com.bytedance.android.livesdk.chatroom.backroom;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public final class a implements com.bytedance.android.livesdk.watch.chatroom.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0320a f14995a = new C0320a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f14996b = i.a((h.f.a.a) b.f15001a);

    /* renamed from: c  reason: collision with root package name */
    private final List<com.bytedance.android.livesdk.chatroom.backroom.b.a> f14997c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.bytedance.android.livesdk.chatroom.backroom.e.b> f14998d;

    static {
        Covode.recordClassIndex(8326);
    }

    private final Stack<EnterRoomConfig> d() {
        return (Stack) this.f14996b.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.a$a  reason: collision with other inner class name */
    public static final class C0320a {
        static {
            Covode.recordClassIndex(8327);
        }

        private C0320a() {
        }

        public /* synthetic */ C0320a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Stack<EnterRoomConfig>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15001a = new b();

        static {
            Covode.recordClassIndex(8328);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Stack<EnterRoomConfig> invoke() {
            return new Stack();
        }
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.a
    public final int c() {
        return d().size();
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.a
    public final EnterRoomConfig b() {
        Stack<EnterRoomConfig> d2 = d();
        if (!(!d2.isEmpty()) || d2 == null) {
            return null;
        }
        return d2.pop();
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.a
    public final EnterRoomConfig a() {
        Stack<EnterRoomConfig> d2 = d();
        if (!(!d2.isEmpty()) || d2 == null) {
            return null;
        }
        return d2.peek();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.chatroom.backroom.b.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.chatroom.backroom.e.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends com.bytedance.android.livesdk.chatroom.backroom.b.a> list, List<? extends com.bytedance.android.livesdk.chatroom.backroom.e.b> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f14997c = list;
        this.f14998d = list2;
    }

    private final EnterRoomConfig a(EnterRoomConfig enterRoomConfig, StackContext stackContext) {
        Iterator<T> it = this.f14998d.iterator();
        while (it.hasNext()) {
            it.next().a(enterRoomConfig, stackContext);
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.watch.chatroom.a
    public final void a(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        EnterRoomConfig enterRoomConfig3;
        String str;
        String str2;
        int i2;
        String str3;
        long j2;
        l.d(stackContext, "");
        String str4 = null;
        if (enterRoomConfig != null) {
            Iterator<T> it = this.f14997c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a(enterRoomConfig, enterRoomConfig2, stackContext)) {
                        break;
                    }
                } else {
                    enterRoomConfig3 = enterRoomConfig;
                    break;
                }
            }
            enterRoomConfig3 = null;
        } else {
            enterRoomConfig3 = null;
        }
        if (enterRoomConfig3 == null) {
            com.bytedance.android.live.core.c.a.a(4, "LiveBackRoomStack", "abort push to stack, filtered by at least one of " + this.f14997c);
            return;
        }
        l.d(enterRoomConfig, "");
        EnterRoomConfig enterRoomConfig4 = new EnterRoomConfig();
        enterRoomConfig4.f23299c.R = enterRoomConfig.f23299c.R;
        enterRoomConfig4.f23299c.D = enterRoomConfig.f23299c.D;
        enterRoomConfig4.f23299c.J = enterRoomConfig.f23299c.J;
        enterRoomConfig4.f23299c.L = enterRoomConfig.f23299c.L;
        enterRoomConfig4.f23299c.X = enterRoomConfig.f23299c.X;
        enterRoomConfig4.f23299c.o = enterRoomConfig.f23299c.o;
        enterRoomConfig4.f23299c.f23333l = enterRoomConfig.f23299c.f23333l;
        enterRoomConfig4.f23299c.f23334m = enterRoomConfig.f23299c.f23334m;
        enterRoomConfig4.f23299c.f23325d = enterRoomConfig.f23299c.f23325d;
        enterRoomConfig4.f23299c.A = enterRoomConfig.f23299c.A;
        enterRoomConfig4.f23299c.O = enterRoomConfig.f23299c.O;
        enterRoomConfig4.f23299c.P = enterRoomConfig.f23299c.P;
        enterRoomConfig4.f23299c.Q = enterRoomConfig.f23299c.Q;
        enterRoomConfig4.f23299c.U = enterRoomConfig.f23299c.U;
        enterRoomConfig4.f23299c.ac = enterRoomConfig.f23299c.ac;
        enterRoomConfig4.f23299c.W = enterRoomConfig.f23299c.W;
        enterRoomConfig4.f23299c.Z = enterRoomConfig.f23299c.Z;
        enterRoomConfig4.f23299c.S = enterRoomConfig.f23299c.S;
        enterRoomConfig4.f23299c.y = enterRoomConfig.f23299c.y;
        enterRoomConfig4.f23299c.ad = enterRoomConfig.f23299c.ad;
        enterRoomConfig4.f23299c.z = enterRoomConfig.f23299c.z;
        enterRoomConfig4.f23299c.ay = enterRoomConfig.f23299c.ay;
        enterRoomConfig4.f23299c.H = enterRoomConfig.f23299c.H;
        enterRoomConfig4.f23299c.V = enterRoomConfig.f23299c.V;
        enterRoomConfig4.f23299c.I = enterRoomConfig.f23299c.I;
        enterRoomConfig4.f23299c.ag = enterRoomConfig.f23299c.ag;
        enterRoomConfig4.f23299c.ah = enterRoomConfig.f23299c.ah;
        enterRoomConfig4.f23299c.al = enterRoomConfig.f23299c.al;
        enterRoomConfig4.f23299c.ak = enterRoomConfig.f23299c.ak;
        enterRoomConfig4.f23299c.aj = enterRoomConfig.f23299c.aj;
        enterRoomConfig4.f23299c.an = enterRoomConfig.f23299c.an;
        enterRoomConfig4.f23299c.ao = enterRoomConfig.f23299c.ao;
        EnterRoomConfig.GuestUser guestUser = enterRoomConfig4.f23299c.au;
        if (guestUser != null) {
            EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.f23299c.au;
            if (guestUser2 != null) {
                j2 = guestUser2.f23305a;
            } else {
                j2 = 0;
            }
            guestUser.f23305a = j2;
        }
        EnterRoomConfig.GuestUser guestUser3 = enterRoomConfig4.f23299c.au;
        if (guestUser3 != null) {
            EnterRoomConfig.GuestUser guestUser4 = enterRoomConfig.f23299c.au;
            if (guestUser4 != null) {
                str3 = guestUser4.f23306b;
            } else {
                str3 = null;
            }
            guestUser3.f23306b = str3;
        }
        EnterRoomConfig.GuestUser guestUser5 = enterRoomConfig4.f23299c.au;
        boolean z = false;
        if (guestUser5 != null) {
            EnterRoomConfig.GuestUser guestUser6 = enterRoomConfig.f23299c.au;
            if (guestUser6 != null) {
                i2 = guestUser6.f23307c;
            } else {
                i2 = 0;
            }
            guestUser5.f23307c = i2;
        }
        EnterRoomConfig.GuestUser guestUser7 = enterRoomConfig4.f23299c.au;
        if (guestUser7 != null) {
            EnterRoomConfig.GuestUser guestUser8 = enterRoomConfig.f23299c.au;
            if (guestUser8 != null) {
                str2 = guestUser8.f23308d;
            } else {
                str2 = null;
            }
            guestUser7.f23308d = str2;
        }
        enterRoomConfig4.f23297a.f23338b = enterRoomConfig.f23297a.f23338b;
        enterRoomConfig4.f23297a.f23339c = enterRoomConfig.f23297a.f23339c;
        enterRoomConfig4.f23297a.f23340d = enterRoomConfig.f23297a.f23340d;
        enterRoomConfig4.f23297a.f23342f = enterRoomConfig.f23297a.f23342f;
        enterRoomConfig4.f23297a.f23343g = enterRoomConfig.f23297a.f23343g;
        enterRoomConfig4.f23297a.f23344h = enterRoomConfig.f23297a.f23344h;
        enterRoomConfig4.f23297a.f23345i = enterRoomConfig.f23297a.f23345i;
        enterRoomConfig4.f23297a.f23346j = enterRoomConfig.f23297a.f23346j;
        enterRoomConfig4.f23297a.f23347k = enterRoomConfig.f23297a.f23347k;
        enterRoomConfig4.f23297a.f23348l = enterRoomConfig.f23297a.f23348l;
        enterRoomConfig4.f23297a.f23349m = enterRoomConfig.f23297a.f23349m;
        enterRoomConfig4.f23298b.f23310b = enterRoomConfig.f23298b.f23310b;
        enterRoomConfig4.f23298b.f23309a = enterRoomConfig.f23298b.f23309a;
        enterRoomConfig4.f23298b.f23315g = enterRoomConfig.f23298b.f23315g;
        enterRoomConfig4.f23298b.f23319k = enterRoomConfig.f23298b.f23319k;
        EnterRoomConfig a2 = a(enterRoomConfig3, stackContext);
        if (enterRoomConfig2 != null) {
            str = com.bytedance.android.livesdk.chatroom.backroom.f.a.a(enterRoomConfig2);
        } else {
            str = null;
        }
        if (n.a((Iterable) ((List) com.bytedance.android.livesdk.chatroom.backroom.f.b.f15027b.getValue()), (Object) str)) {
            d().clear();
            d().push(a2);
        } else {
            if (enterRoomConfig2 != null) {
                str4 = com.bytedance.android.livesdk.chatroom.backroom.f.a.a(enterRoomConfig2);
            }
            if (com.bytedance.android.livesdk.chatroom.backroom.f.b.b().contains("jump_source_all") || n.a((Iterable) com.bytedance.android.livesdk.chatroom.backroom.f.b.b(), (Object) str4)) {
                d().push(a2);
            }
        }
        StringBuilder append = new StringBuilder("pushToStack: ").append(a2).append(", success: ");
        if ((!d().isEmpty()) && l.a(d().peek(), a2)) {
            z = true;
        }
        com.bytedance.android.live.core.c.a.a(4, "LiveBackRoomStack", append.append(z).toString());
    }
}
