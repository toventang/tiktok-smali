package com.ss.android.ugc.aweme.feed.adapter;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.a.a;
import h.a.n;
import h.f.b.l;
import h.m.p;

public final class cl {

    /* renamed from: a  reason: collision with root package name */
    static boolean f91791a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f91792b;

    /* renamed from: c  reason: collision with root package name */
    public static int f91793c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final cl f91794d = new cl();

    private cl() {
    }

    static {
        Covode.recordClassIndex(57778);
    }

    public static void a(int i2, float f2, boolean z) {
        try {
            if (cm.f91795a == null) {
                cm.f91795a = Boolean.valueOf(SettingsManager.a().a("widget_container_monitor", true));
            }
            Boolean bool = cm.f91795a;
            if (bool == null) {
                l.b();
            }
            if (bool.booleanValue()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("WidgetContainerMonitor >>>");
                stringBuffer.append("alpha:" + f2 + " , visibility:" + i2 + " \n");
                stringBuffer.append("enterDislikeMode:" + f91791a + " , enterSeekBarMode:" + f91792b + " , doWidgetAlphaAnim:" + f91793c + " , isAnimate:" + z + "\n");
                String stackTraceString = Log.getStackTraceString(new Throwable());
                l.b(stackTraceString, "");
                int i3 = 0;
                for (Object obj : p.c(stackTraceString, new String[]{"\n"})) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    String str = (String) obj;
                    if (i3 < 15) {
                        stringBuffer.append(str + "\n");
                    }
                    i3 = i4;
                }
                a.b(6, "WidgetContainerMonitor", stringBuffer.toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
