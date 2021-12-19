package com.ss.android.ugc.aweme.ay;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.common.e.c;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.framework.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f67791a = new d();

    /* renamed from: b  reason: collision with root package name */
    public String f67792b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private int f67793c = 5;

    static {
        Covode.recordClassIndex(41733);
    }

    private d() {
    }

    @Override // com.facebook.common.e.c
    public final void a(int i2) {
        this.f67793c = i2;
    }

    @Override // com.facebook.common.e.c
    public final boolean b(int i2) {
        if (this.f67793c <= i2) {
            return true;
        }
        return false;
    }

    private static boolean a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    private static boolean a(Throwable th) {
        if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return true;
        }
        return false;
    }

    private static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    @Override // com.facebook.common.e.c
    public final void b(String str, String str2) {
        f(str, str2);
    }

    @Override // com.facebook.common.e.c
    public final void c(String str, String str2) {
        f(str, str2);
    }

    @Override // com.facebook.common.e.c
    public final void e(String str, String str2) {
        f(str, str2);
    }

    @Override // com.facebook.common.e.c
    public final void a(String str, String str2) {
        f(str, str2);
    }

    private static void f(String str, String str2) {
        if (!a(str)) {
            a(str2);
        }
    }

    @Override // com.facebook.common.e.c
    public final void d(String str, String str2) {
        if (str2 != null) {
            if (str2.contains("init FrescoTTNetFetcher")) {
                a.a("init FrescoTTNetFetcher " + Log.getStackTraceString(new Throwable()));
            }
            if (str2.contains("Fresco has already been initialized!")) {
                a.a("Fresco has already been initialized! " + Log.getStackTraceString(new Throwable()));
            }
        }
        f(str, str2);
    }

    @Override // com.facebook.common.e.c
    public final void d(String str, String str2, Throwable th) {
        e(str, str2, th);
    }

    private static void e(String str, String str2, Throwable th) {
        if (!a(str) && !a(str2)) {
            a(th);
        }
    }

    @Override // com.facebook.common.e.c
    public final void c(String str, String str2, Throwable th) {
        e(str, str2, th);
        if (str2 != null && str2.contains("Malformed escape pair")) {
            a.a("ImageEncryptUtils failed:".concat(String.valueOf(str2)));
        }
    }

    @Override // com.facebook.common.e.c
    public final void a(String str, String str2, Throwable th) {
        e(str, str2, th);
    }

    @Override // com.facebook.common.e.c
    public final void b(String str, String str2, Throwable th) {
        e(str, str2, th);
        if (th instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!a(str2)) {
                    jSONObject.put("errorField", str2);
                }
                jSONObject.put("errorDesc", b(th));
                jSONObject.put("status", 1);
                o.a("aweme_image_error_log", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
