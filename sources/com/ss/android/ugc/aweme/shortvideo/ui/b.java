package com.ss.android.ugc.aweme.shortvideo.ui;

import b.i;
import com.bytedance.covode.number.Covode;
import h.z;
import java.util.concurrent.Callable;

public final class b implements com.ss.android.ugc.aweme.shortvideo.ui.task.a {
    static {
        Covode.recordClassIndex(86106);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        i.b(a.f131451a, i.f4824a);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131451a = new a();

        static {
            Covode.recordClassIndex(86107);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!a.f131247a) {
                a.a();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - a.f131248b.getLong("last_mob_time", 0) >= 259200000) {
                    a.f131248b.storeLong("last_mob_time", currentTimeMillis);
                    a.a();
                }
            }
            return z.f158842a;
        }
    }
}
