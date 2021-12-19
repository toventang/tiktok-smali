package com.bytedance.android.monitor.c;

import android.app.Application;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.h.b;
import com.bytedance.android.monitor.l.c;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23426a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f23427b;

    static {
        Covode.recordClassIndex(13945);
    }

    public static void a(boolean z, boolean z2) {
        f23426a = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(c.a(application, "monitor_data_switch"), "is_debug");
            if (z) {
                c.b(file);
            } else {
                c.a(file);
                return;
            }
        } else if (!z) {
            return;
        }
        b.f23519a = true;
    }

    public static void b(boolean z, boolean z2) {
        f23427b = z;
        Application application = HybridMonitor.getInstance().getApplication();
        if (z2 && application != null) {
            File file = new File(c.a(application, "monitor_data_switch"), "is_output_file");
            if (z) {
                c.b(file);
            } else {
                c.a(file);
            }
        }
    }
}
