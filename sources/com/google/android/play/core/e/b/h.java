package com.google.android.play.core.e.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.f;
import java.util.List;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f53293a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53294b;

    /* renamed from: c  reason: collision with root package name */
    private final List f53295c;

    /* renamed from: d  reason: collision with root package name */
    private final List f53296d;

    /* renamed from: e  reason: collision with root package name */
    private final List f53297e;

    static {
        Covode.recordClassIndex(32925);
    }

    h(a aVar, long j2, List list, List list2, List list3) {
        this.f53293a = aVar;
        this.f53294b = j2;
        this.f53295c = list;
        this.f53296d = list2;
        this.f53297e = list3;
    }

    public final void run() {
        a aVar = this.f53293a;
        long j2 = this.f53294b;
        List list = this.f53295c;
        List list2 = this.f53296d;
        List list3 = this.f53297e;
        long j3 = j2 / 3;
        long j4 = 0;
        int i2 = 0;
        do {
            j4 = Math.min(j2, j4 + j3);
            aVar.a(2, 0, Long.valueOf(j4), Long.valueOf(j2), null, null, null);
            SystemClock.sleep(a.f53265a);
            f c2 = aVar.c();
            if (c2.b() != 9 && c2.b() != 7 && c2.b() != 6) {
                i2++;
            } else {
                return;
            }
        } while (i2 < 3);
        aVar.f53268d.execute(new i(aVar, list, list2, list3, j2));
    }
}
