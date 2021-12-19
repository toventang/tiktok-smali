package com.bytedance.ies.im.core.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.c.f;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.h;
import com.bytedance.im.core.d.au;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static volatile int f34146a;

    /* renamed from: b  reason: collision with root package name */
    static volatile long f34147b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Long f34148c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f34149d = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(20336);
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(20338);
        }

        b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == 19970116) {
                Object obj = message.obj;
                if (!(obj instanceof au)) {
                    obj = null;
                }
                au auVar = (au) obj;
                if (auVar != null) {
                    long j2 = auVar.f37843c - auVar.f37842b;
                    long j3 = auVar.f37845e - auVar.f37844d;
                    long j4 = auVar.f37844d - (((j2 - j3) / 2) + auVar.f37842b);
                    g.f34146a++;
                    long j5 = g.f34147b + j4;
                    g.f34147b = j5;
                    g.f34148c = Long.valueOf(j5 / ((long) g.f34146a));
                    com.bytedance.ies.im.core.api.a.b().b("TimeSyncService", "sync Client timestamp " + g.f34146a + " cmd:" + auVar.f37841a + ",(" + j2 + ',' + j3 + "),singleDelta:" + j4 + ",avg:" + g.f34148c);
                }
            }
        }
    }

    static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34150a;

        static {
            Covode.recordClassIndex(20337);
        }

        a(b bVar) {
            this.f34150a = bVar;
        }

        @Override // com.bytedance.im.core.a.h
        public final void a(au auVar) {
            if (this.f34150a.hasMessages(19970116)) {
                com.bytedance.ies.im.core.api.a.b().b("TimeSyncService", "already has this message in process,we shouldn't do it again!cmd:" + auVar.f37841a);
                return;
            }
            b bVar = this.f34150a;
            Message obtain = Message.obtain();
            obtain.what = 19970116;
            obtain.obj = auVar;
            bVar.sendMessageDelayed(obtain, 5000);
        }
    }

    public static void a(d dVar) {
        l.d(dVar, "");
        if (!f.a()) {
            com.bytedance.ies.im.core.api.a.b().b("TimeSyncService", "syncTimeInit fail!");
            return;
        }
        com.bytedance.ies.im.core.api.a.b().b("TimeSyncService", "syncTimeInit success!");
        dVar.f37569i = new a(new b(Looper.getMainLooper()));
    }
}
