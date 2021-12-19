package com.bytedance.crash.runtime.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.a.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f27874a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f27875b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<CrashType, b> f27876c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private a f27877d;

    /* renamed from: e  reason: collision with root package name */
    private d f27878e;

    static {
        Covode.recordClassIndex(16316);
    }

    public static e a() {
        if (f27874a == null) {
            Context context = m.f27724a;
            if (context != null) {
                f27874a = new e(context);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f27874a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.a.e$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.a.e.AnonymousClass2.<clinit>():void");
        }
    }

    private e(Context context) {
        this.f27875b = context;
        try {
            this.f27877d = a.a();
            this.f27878e = new d(context);
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
        }
    }

    public final b a(List<b> list) {
        if (list.isEmpty()) {
            return null;
        }
        b bVar = new b();
        JSONArray jSONArray = new JSONArray();
        for (b bVar2 : list) {
            jSONArray.put(bVar2.f27557a);
        }
        bVar.a("data", (Object) jSONArray);
        Header a2 = Header.a(this.f27875b);
        Header.addRuntimeHeader(a2.f27553a);
        a2.c();
        a2.d();
        a2.e();
        Header.a(a2);
        bVar.a(a2);
        return bVar;
    }

    private b a(CrashType crashType) {
        b bVar = this.f27876c.get(crashType);
        if (bVar != null) {
            return bVar;
        }
        switch (AnonymousClass2.f27880a[crashType.ordinal()]) {
            case 1:
                bVar = new f(this.f27875b, this.f27877d, this.f27878e, false);
                break;
            case 2:
                bVar = new f(this.f27875b, this.f27877d, this.f27878e, true);
                break;
            case 3:
                bVar = new g(this.f27875b, this.f27877d, this.f27878e);
                break;
            case 4:
                bVar = new c(CrashType.ANR, this.f27875b, this.f27877d, this.f27878e);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                bVar = new c(CrashType.DART, this.f27875b, this.f27877d, this.f27878e);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                bVar = new c(CrashType.GAME, this.f27875b, this.f27877d, this.f27878e);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                bVar = new c(CrashType.CUSTOM_JAVA, this.f27875b, this.f27877d, this.f27878e);
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                bVar = new b(CrashType.ENSURE, this.f27875b, this.f27877d, this.f27878e) {
                    /* class com.bytedance.crash.runtime.a.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16317);
                    }
                };
                break;
            default:
                return bVar;
        }
        this.f27876c.put(crashType, bVar);
        return bVar;
    }

    public final b a(CrashType crashType, b bVar) {
        return a(crashType, bVar, null, false);
    }

    public final b a(CrashType crashType, b bVar, b.a aVar, boolean z) {
        b a2;
        if (crashType == null || (a2 = a(crashType)) == null) {
            return bVar;
        }
        return a2.a(bVar, aVar, z);
    }
}
