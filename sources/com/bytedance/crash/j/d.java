package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentLinkedQueue<d> f27660a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f27661b = false;

    /* renamed from: c  reason: collision with root package name */
    public static LinkedList<a> f27662c = new LinkedList<>();

    public abstract void a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f27665a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f27666b;

        /* renamed from: c  reason: collision with root package name */
        public final CrashType f27667c;

        static {
            Covode.recordClassIndex(16226);
        }

        public final long a() {
            return (long) this.f27665a.optInt("app_start_time", -1);
        }

        a(JSONObject jSONObject, CrashType crashType) {
            this.f27667c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f27665a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f27665a = jSONObject;
            }
            this.f27666b = jSONObject.optJSONObject("header");
        }
    }

    static {
        Covode.recordClassIndex(16223);
    }

    static void b() {
        f27661b = true;
        ConcurrentLinkedQueue<d> concurrentLinkedQueue = f27660a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<d> it = f27660a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: com.bytedance.crash.j.d$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 16225(0x3f61, float:2.2736E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.crash.CrashType[] r0 = com.bytedance.crash.CrashType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.crash.j.d.AnonymousClass2.f27664a = r2
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.crash.j.d.AnonymousClass2.f27664a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.crash.j.d.AnonymousClass2.f27664a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.d.AnonymousClass2.<clinit>():void");
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        f27662c.add(new a(jSONObject, crashType));
        ConcurrentLinkedQueue<d> concurrentLinkedQueue = f27660a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            Iterator<d> it = f27660a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
