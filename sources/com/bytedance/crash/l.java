package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public class l {

    /* renamed from: a  reason: collision with root package name */
    static a f27722a;

    /* renamed from: b  reason: collision with root package name */
    private static l f27723b;

    public interface a {
        static {
            Covode.recordClassIndex(16254);
        }
    }

    static {
        Covode.recordClassIndex(16253);
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "";
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2) {
    }

    /* access modifiers changed from: protected */
    public void b(String str, String str2) {
    }

    l() {
        f27723b = this;
    }

    public static String b() {
        l lVar = f27723b;
        if (lVar == null) {
            return "";
        }
        return lVar.a();
    }

    public static void c(String str, String str2) {
        l lVar = f27723b;
        if (lVar != null) {
            lVar.b(str, str2);
        }
    }

    public static void d(String str, String str2) {
        l lVar = f27723b;
        if (lVar != null) {
            lVar.a(str, str2);
        }
    }
}
