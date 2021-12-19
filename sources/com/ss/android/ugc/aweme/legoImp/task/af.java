package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final af f107958a = new af();

    private af() {
    }

    static {
        Covode.recordClassIndex(69186);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107959a = new a();

        static {
            Covode.recordClassIndex(69187);
        }

        a() {
        }

        public final void run() {
            int i2 = 1;
            do {
                g.c().execute(AnonymousClass1.f107960a);
                i2++;
            } while (i2 <= 3);
        }
    }
}
