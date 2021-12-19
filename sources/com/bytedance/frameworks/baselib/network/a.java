package com.bytedance.frameworks.baselib.network;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile EnumC0618a f28818a = EnumC0618a.NormalStart;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f28819b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLong f28820c = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLong f28821d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLong f28822e = new AtomicLong(0);

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLong f28823f = new AtomicLong(0);

    /* renamed from: g  reason: collision with root package name */
    private static final String f28824g = a.class.getSimpleName();

    /* renamed from: com.bytedance.frameworks.baselib.network.a$a  reason: collision with other inner class name */
    public enum EnumC0618a {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2);
        
        final int state;

        public final int getValue() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(16945);
        }

        private EnumC0618a(int i2) {
            this.state = i2;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 16944(0x4230, float:2.3744E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.frameworks.baselib.network.a$a[] r0 = com.bytedance.frameworks.baselib.network.a.EnumC0618a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.frameworks.baselib.network.a.AnonymousClass1.f28825a = r2
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.a.EnumC0618a.ColdStart     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.frameworks.baselib.network.a.AnonymousClass1.f28825a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.a.EnumC0618a.HotStart     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.frameworks.baselib.network.a.AnonymousClass1.f28825a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.frameworks.baselib.network.a$a r0 = com.bytedance.frameworks.baselib.network.a.EnumC0618a.WarmStart     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.a.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(16943);
    }

    public static void a(JSONObject jSONObject) {
        boolean z;
        AtomicBoolean atomicBoolean = f28819b;
        if (jSONObject.optInt("request_tag_enabled") > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        f28821d.set((long) jSONObject.optInt("cold_start_seconds"));
        f28822e.set((long) jSONObject.optInt("hot_start_seconds"));
        f28823f.set((long) jSONObject.optInt("warm_start_seconds"));
        Logger.debug();
    }

    public static boolean a(long j2, long j3) {
        if ((System.currentTimeMillis() / 1000) - j2 > j3) {
            return true;
        }
        return false;
    }
}
