package com.airbnb.epoxy;

import com.airbnb.epoxy.ac;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class h extends ac {

    /* renamed from: a  reason: collision with root package name */
    static final ac.c f5043a = new ac.c() {
        /* class com.airbnb.epoxy.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2129);
        }

        @Override // com.airbnb.epoxy.ac.c
        public final void a() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.ac.c
        public final void b() {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    static {
        Covode.recordClassIndex(2128);
    }

    h(int i2) {
        super(i2);
        if (!this.notificationsPaused) {
            this.notificationsPaused = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }
}
