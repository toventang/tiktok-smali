package com.ss.android.ttvecamera.k;

import com.bytedance.covode.number.Covode;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public a f61793a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f61794b;

    static {
        Covode.recordClassIndex(37978);
    }

    public final void a() {
        if (!this.f61794b) {
            this.f61794b = true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.k.b$b  reason: collision with other inner class name */
    public enum EnumC1343b {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU;

        static {
            Covode.recordClassIndex(37980);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public EnumC1343b f61795a;

        /* renamed from: b  reason: collision with root package name */
        public int f61796b;

        static {
            Covode.recordClassIndex(37979);
        }

        public a(EnumC1343b bVar) {
            this.f61795a = bVar;
        }

        public a(EnumC1343b bVar, int i2) {
            this.f61795a = bVar;
            this.f61796b = i2;
        }
    }

    public final void a(a aVar) {
        this.f61794b = false;
        this.f61793a = aVar;
    }
}
