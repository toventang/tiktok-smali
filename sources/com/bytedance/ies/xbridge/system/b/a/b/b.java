package com.bytedance.ies.xbridge.system.b.a.b;

import android.content.ContentResolver;
import android.provider.CalendarContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.c.e;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36461a = f36461a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f36462b = f36462b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f36463c = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(21866);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(e eVar, ContentResolver contentResolver) {
            MethodCollector.i(2897);
            l.c(eVar, "");
            l.c(contentResolver, "");
            try {
                String str = b.f36462b + "=?";
                String[] strArr = new String[1];
                String str2 = eVar.f36497a;
                if (str2 == null) {
                    l.a("eventID");
                }
                strArr[0] = str2;
                if (contentResolver.delete(CalendarContract.Events.CONTENT_URI, str, strArr) > 0) {
                    MethodCollector.o(2897);
                    return true;
                }
                MethodCollector.o(2897);
                return false;
            } catch (Throwable th) {
                ALog.d(b.f36461a, "deleteCalendar: error occurs here! msg = " + th.getMessage());
                MethodCollector.o(2897);
                return false;
            }
        }
    }

    static {
        Covode.recordClassIndex(21865);
    }
}
