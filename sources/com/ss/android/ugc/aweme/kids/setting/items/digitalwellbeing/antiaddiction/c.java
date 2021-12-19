package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class c implements WeakHandler.IHandler, al {

    /* renamed from: b  reason: collision with root package name */
    private static Integer f106911b;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f106912c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<d> f106913a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private o f106914d = new o();

    /* renamed from: e  reason: collision with root package name */
    private WeakHandler f106915e = new WeakHandler(this);

    static {
        Covode.recordClassIndex(68381);
    }

    public static int c() {
        if (f106912c == null) {
            f106912c = 5000;
        }
        return f106912c.intValue();
    }

    public c() {
        this.f106913a.clear();
        a aVar = new a();
        if (!this.f106913a.contains(aVar)) {
            this.f106913a.add(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        this.f106915e.removeMessages(100004);
        if (!this.f106915e.hasMessages(100003)) {
            this.f106915e.sendEmptyMessageDelayed(100003, (long) c());
        }
        if (!this.f106914d.f53699a) {
            this.f106914d.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        int i2;
        WeakHandler weakHandler = this.f106915e;
        if (f106911b == null) {
            if (a.b()) {
                i2 = 20000;
            } else {
                i2 = 30000;
            }
            f106911b = Integer.valueOf(i2);
        }
        weakHandler.sendEmptyMessageDelayed(100004, (long) f106911b.intValue());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 100003:
                this.f106915e.sendEmptyMessageDelayed(100003, (long) c());
                final long a2 = this.f106914d.a(TimeUnit.MILLISECONDS);
                com.ss.android.b.a.a.a.a(new Runnable() {
                    /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(68382);
                    }

                    public final void run() {
                        System.currentTimeMillis();
                        Iterator<d> it = c.this.f106913a.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                    }
                });
                return;
            case 100004:
                this.f106915e.removeMessages(100003);
                this.f106914d.d();
                a.a().f106891b = "";
                a.a().f106890a = false;
                return;
            default:
                return;
        }
    }
}
