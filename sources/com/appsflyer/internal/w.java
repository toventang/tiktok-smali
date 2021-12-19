package com.appsflyer.internal;

import com.a;
import com.bytedance.covode.number.Covode;

public final class w {

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f304;

    /* renamed from: ι  reason: contains not printable characters */
    public String f305;

    static {
        Covode.recordClassIndex(2774);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m205() {
        return this.f304;
    }

    enum e {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: Ι  reason: contains not printable characters */
        private int f309;

        public final String toString() {
            return String.valueOf(this.f309);
        }

        static {
            Covode.recordClassIndex(2775);
        }

        private e(int i2) {
            this.f309 = i2;
        }
    }

    public final String toString() {
        return a.a("%s,%s", new Object[]{this.f305, Boolean.valueOf(this.f304)});
    }

    w(String str, boolean z) {
        this.f305 = str;
        this.f304 = z;
    }
}
