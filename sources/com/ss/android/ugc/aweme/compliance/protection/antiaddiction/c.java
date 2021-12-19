package com.ss.android.ugc.aweme.compliance.protection.antiaddiction;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class c implements WeakHandler.IHandler, al {

    /* renamed from: b  reason: collision with root package name */
    private static Integer f77925b;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f77926c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f77927a;

    /* renamed from: d  reason: collision with root package name */
    private final o f77928d = new o();

    /* renamed from: e  reason: collision with root package name */
    private final WeakHandler f77929e = new WeakHandler(this);

    static {
        Covode.recordClassIndex(48306);
    }

    public static int c() {
        if (f77926c == null) {
            f77926c = 5000;
        }
        return f77926c.intValue();
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        WeakHandler weakHandler = this.f77929e;
        if (f77925b == null) {
            f77925b = 30000;
        }
        weakHandler.sendEmptyMessageDelayed(100004, (long) f77925b.intValue());
    }

    public c() {
        ArrayList<d> arrayList = new ArrayList<>();
        this.f77927a = arrayList;
        arrayList.clear();
        a(new a());
        a(new b());
        a(new com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.c());
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        this.f77929e.removeMessages(100004);
        if (!this.f77929e.hasMessages(100003)) {
            this.f77929e.sendEmptyMessageDelayed(100003, (long) c());
        }
        if (!this.f77928d.f53699a) {
            this.f77928d.b();
        }
    }

    private void a(d dVar) {
        if (!this.f77927a.contains(dVar)) {
            this.f77927a.add(dVar);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f77929e.sendEmptyMessageDelayed(100003, (long) c());
                final long a2 = this.f77928d.a(TimeUnit.MILLISECONDS);
                com.ss.android.b.a.a.a.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.compliance.protection.antiaddiction.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(48307);
                    }

                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator<d> it = c.this.f77927a.iterator();
                        while (it.hasNext()) {
                            it.next().a(currentTimeMillis, a2);
                        }
                    }
                });
                return;
            case 100004:
                this.f77929e.removeMessages(100003);
                this.f77928d.d();
                b.a().f77916f = "";
                b.a().f77915e = false;
                Iterator<d> it = this.f77927a.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next instanceof b) {
                        ((b) next).f77922a.f77906c = 0;
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
