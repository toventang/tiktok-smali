package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public interface m {
    static {
        Covode.recordClassIndex(106484);
    }

    q a(EventBus eventBus);

    boolean a();

    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final Looper f159814a;

        static {
            Covode.recordClassIndex(106485);
        }

        @Override // org.greenrobot.eventbus.m
        public final boolean a() {
            if (this.f159814a == Looper.myLooper()) {
                return true;
            }
            return false;
        }

        public a(Looper looper) {
            this.f159814a = looper;
        }

        @Override // org.greenrobot.eventbus.m
        public final q a(EventBus eventBus) {
            return new h(eventBus, this.f159814a);
        }
    }
}
