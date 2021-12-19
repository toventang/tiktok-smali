package com.ss.android.ugc.aweme.settings.a;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.b.a.a.b;
import com.b.a.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.j.i;
import com.bytedance.crash.util.ab;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.logger.a;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123075a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80835);
    }

    /* renamed from: com.ss.android.ugc.aweme.settings.a.a$a  reason: collision with other inner class name */
    public static final class C3188a implements com.b.a.b.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f123076a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f123077b;

        static {
            Covode.recordClassIndex(80836);
        }

        /* renamed from: com.ss.android.ugc.aweme.settings.a.a$a$a  reason: collision with other inner class name */
        static final class RunnableC3189a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final RunnableC3189a f123078a = new RunnableC3189a();

            static {
                Covode.recordClassIndex(80837);
            }

            RunnableC3189a() {
            }

            public final void run() {
                throw new RuntimeException(ab.a(new RuntimeException("SafeView")));
            }
        }

        @Override // com.b.a.b.a
        public final void a(Map<String, String> map) {
            l.d(map, "");
            if (TextUtils.equals(d.s, "local_test")) {
                new Handler(Looper.getMainLooper()).postDelayed(RunnableC3189a.f123078a, 10000);
            }
            String b2 = s.b();
            StackTraceElement stackTraceElement = new StackTraceElement("SafeView", "report", "SafeView", 0);
            String a2 = ab.a(new RuntimeException("SafeView"));
            l.b(a2, "");
            String a3 = a.a(a2);
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            com.bytedance.crash.entity.d a4 = com.bytedance.crash.entity.d.a(stackTraceElement, a3, "SafeView", currentThread.getName(), "EnsureNotNull");
            l.b(a4, "");
            a4.c("activity", b2);
            i.a(a4);
            Throwable th = new Throwable("need run in main thread!!!");
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            if (length > 3) {
                int i2 = length - 3;
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
                System.arraycopy(stackTrace, 3, stackTraceElementArr, 0, i2);
                th.setStackTrace(stackTraceElementArr);
            }
            com.bytedance.services.apm.api.a.a(th, "SafeView");
        }

        @Override // com.b.a.b.a
        public final void a(View view, boolean z) {
            l.d(view, "");
            if (this.f123076a) {
                return;
            }
            if (z) {
                a.b.f109011a.a("cold_boot_main_layout_duration", false);
                return;
            }
            a.b.f109011a.b("cold_boot_main_layout_duration", false);
            this.f123076a = true;
        }

        @Override // com.b.a.b.a
        public final void b(View view, boolean z) {
            l.d(view, "");
            if (this.f123077b) {
                return;
            }
            if (z) {
                a.b.f109011a.a("cold_boot_main_draw_duration", false);
                return;
            }
            a.b.f109011a.b("cold_boot_main_draw_duration", false);
            this.f123077b = true;
        }
    }

    public static void a(boolean z) {
        String.valueOf(z);
        b.f5993a = z;
        if (z) {
            b.f5994b = new C3188a();
            if (!c.f5995a) {
                Context a2 = d.a();
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Application");
                c.a((Application) a2);
            }
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<String> b2 = p.b(str, new String[]{"\n"});
        if (b2.isEmpty()) {
            return "";
        }
        int i2 = 0;
        StringBuilder sb = new StringBuilder();
        for (String str2 : b2) {
            if (1 > i2 || 3 < i2) {
                sb.append(str2 + "\n");
            }
            i2++;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
