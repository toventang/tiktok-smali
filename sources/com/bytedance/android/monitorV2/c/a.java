package com.bytedance.android.monitorV2.c;

import android.app.Application;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.l.d;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23839a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f23840b;

    static {
        Covode.recordClassIndex(14110);
    }

    public static void a(boolean z, boolean z2) {
        f23839a = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(d.a(application, "monitor_data_switch"), "is_debug");
            if (z) {
                d.b(file);
            } else {
                d.a(file);
                return;
            }
        } else if (!z) {
            return;
        }
        b.f23998a = true;
    }

    public static void b(boolean z, boolean z2) {
        f23840b = z;
        Application application = HybridMultiMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(d.a(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                d.b(file);
            } else {
                d.a(file);
            }
        }
    }
}
