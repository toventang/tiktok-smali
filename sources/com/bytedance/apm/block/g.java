package com.bytedance.apm.block;

import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static HashSet<String> f24662a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f24663b = "";

    /* renamed from: c  reason: collision with root package name */
    private static boolean f24664c = true;

    static {
        Covode.recordClassIndex(14500);
    }

    public static String a() {
        if (f24664c) {
            try {
                f24663b = h.a(f24662a, ",");
                f24664c = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return f24663b;
    }

    public static void a(String str) {
        f24664c = true;
        f24662a.add(str);
    }

    public static void b(String str) {
        f24664c = true;
        f24662a.remove(str);
    }
}
