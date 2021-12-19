package com.ss.android.vesdk.runtime;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.h;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.u;

public class d {

    /* renamed from: g  reason: collision with root package name */
    private static d f151440g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f151441a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f151442b;

    /* renamed from: c  reason: collision with root package name */
    private int f151443c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f151444d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f151445e;

    /* renamed from: f  reason: collision with root package name */
    private final int f151446f;

    /* renamed from: h  reason: collision with root package name */
    private int f151447h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f151448i;

    static {
        Covode.recordClassIndex(99579);
    }

    public static d b() {
        MethodCollector.i(79);
        if (f151440g == null) {
            synchronized (d.class) {
                try {
                    if (f151440g == null) {
                        f151440g = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(79);
                    throw th;
                }
            }
        }
        d dVar = f151440g;
        MethodCollector.o(79);
        return dVar;
    }

    public final boolean a() {
        MethodCollector.i(2473);
        if (!this.f151445e) {
            an.a("VEMem", "memory mode disabled");
            MethodCollector.o(2473);
            return false;
        } else if (this.f151442b) {
            an.a("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            MethodCollector.o(2473);
            return false;
        } else {
            double d2 = (double) this.f151443c;
            double nativeGetVirtualMemInfo = VERuntime.nativeGetVirtualMemInfo();
            Double.isNaN(d2);
            double d3 = d2 - nativeGetVirtualMemInfo;
            if (d3 < ((double) this.f151447h)) {
                an.c("VEMem", "In low memory mode: free memory size = " + d3 + " threshold = " + this.f151447h);
                MethodCollector.o(2473);
                return true;
            }
            MethodCollector.o(2473);
            return false;
        }
    }

    private d() {
        String str;
        MethodCollector.i(1831);
        this.f151443c = 4096;
        this.f151446f = 500;
        this.f151447h = 300;
        this.f151448i = true;
        this.f151444d = ((Boolean) u.a().a("ve_enable_upload_virtual_mem_size", (Object) false)).booleanValue();
        this.f151445e = ((Boolean) u.a().a("ve_enable_memory_mode", (Object) false)).booleanValue();
        this.f151447h = ((Integer) u.a().a("ve_low_memory_threshold", (Object) 300)).intValue();
        if (Build.VERSION.SDK_INT < 21) {
            str = Build.CPU_ABI;
        } else {
            str = Build.SUPPORTED_ABIS[0];
        }
        an.a("VEMem", "cpu_abi = ".concat(String.valueOf(str)));
        if (str.equals("armeabi-v7a")) {
            this.f151443c = 3072;
            an.a("VEMem", "set mTotalVirtualSize to 3072MB");
        }
        this.f151442b = VERuntime.nativeIsArm64();
        MethodCollector.o(1831);
    }

    public final void a(int i2) {
        String str;
        MethodCollector.i(2351);
        if (!this.f151444d) {
            an.a("VEMem", "upload mem size is disabled");
            MethodCollector.o(2351);
        } else if (this.f151442b) {
            an.a("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            MethodCollector.o(2351);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            double nativeGetVirtualMemInfo = VERuntime.nativeGetVirtualMemInfo();
            long currentTimeMillis2 = System.currentTimeMillis();
            an.a("VEMem", "get virtual mem size cost " + (currentTimeMillis2 - currentTimeMillis) + "ms");
            if (nativeGetVirtualMemInfo <= 0.0d) {
                MethodCollector.o(2351);
                return;
            }
            if (i2 == 0) {
                str = "te_record_enter_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            } else if (i2 == 1) {
                str = "te_record_leave_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            } else if (i2 == 2) {
                str = "te_edit_enter_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            } else if (i2 == 3) {
                str = "te_edit_leave_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            } else if (i2 == 4) {
                str = "te_composition_enter_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            } else if (i2 != 5) {
                str = "";
            } else {
                str = "te_composition_leave_virtual_memory_size";
                h.a(0, str, nativeGetVirtualMemInfo);
            }
            an.a("VEMem", str + " virtual mem size " + nativeGetVirtualMemInfo + "MB");
            if (this.f151441a && i2 == 0) {
                if (this.f151448i) {
                    double d2 = (double) this.f151443c;
                    Double.isNaN(d2);
                    if (d2 - nativeGetVirtualMemInfo < 500.0d) {
                        RuntimeException runtimeException = new RuntimeException("Not enough virtual memory is available, used " + nativeGetVirtualMemInfo + "MB");
                        MethodCollector.o(2351);
                        throw runtimeException;
                    }
                }
                this.f151448i = false;
            }
            an.a("VEMem", "upload virtual mem size cost " + (System.currentTimeMillis() - currentTimeMillis2));
            MethodCollector.o(2351);
        }
    }
}
