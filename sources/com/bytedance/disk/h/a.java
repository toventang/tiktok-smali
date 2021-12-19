package com.bytedance.disk.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.disk.e.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c f28615a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f28616b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f28617c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f28618d = true;

    static {
        Covode.recordClassIndex(16812);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f28617c) {
            String concat = "DM-".concat(String.valueOf(str));
            c cVar = f28615a;
            if (cVar != null) {
                cVar.a(5, concat, com.a.a(str2, objArr), null);
            } else {
                com.a.a(str2, objArr);
            }
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (f28616b) {
            String concat = "DM-".concat(String.valueOf(str));
            c cVar = f28615a;
            if (cVar != null) {
                cVar.a(3, concat, com.a.a(str2, objArr), null);
            } else {
                com.a.a(str2, objArr);
            }
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        if (f28618d) {
            String concat = "DM-".concat(String.valueOf(str));
            c cVar = f28615a;
            if (cVar != null) {
                cVar.a(6, concat, com.a.a(str2, objArr), th);
            } else {
                com.a.a(str2, objArr);
            }
        }
    }
}
