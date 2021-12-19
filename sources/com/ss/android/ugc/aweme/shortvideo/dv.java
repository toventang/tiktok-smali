package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

public final class dv {

    /* renamed from: a  reason: collision with root package name */
    public static String f126642a;

    /* renamed from: b  reason: collision with root package name */
    public static String f126643b;

    /* renamed from: c  reason: collision with root package name */
    public static String f126644c;

    /* renamed from: d  reason: collision with root package name */
    public static String f126645d;

    /* renamed from: e  reason: collision with root package name */
    public static String f126646e;

    static {
        Covode.recordClassIndex(83069);
    }

    public static String a() {
        if (a(f126642a)) {
            return f126642a;
        }
        return "";
    }

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        for (char c2 : str.toCharArray()) {
            if (!Character.isDigit(c2)) {
                return false;
            }
        }
        return true;
    }
}
