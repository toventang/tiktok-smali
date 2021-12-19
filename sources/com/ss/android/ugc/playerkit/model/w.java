package com.ss.android.ugc.playerkit.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f148846a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static List<String> f148847b;

    private w() {
    }

    static {
        Covode.recordClassIndex(98019);
        ArrayList arrayList = new ArrayList();
        f148847b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f148847b;
        if (list == null) {
            l.a();
        }
        list.add("TCP_MISS");
        List<String> list2 = f148847b;
        if (list2 == null) {
            l.a();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f148847b;
        if (list3 == null) {
            l.a();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f148847b;
        if (list4 == null) {
            l.a();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f148847b;
        if (list5 == null) {
            l.a();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f148847b;
        if (list6 == null) {
            l.a();
        }
        list6.add("HIT");
        List<String> list7 = f148847b;
        if (list7 == null) {
            l.a();
        }
        list7.add("MISS");
        List<String> list8 = f148847b;
        if (list8 == null) {
            l.a();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f148847b;
        if (list9 == null) {
            l.a();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f148847b;
        if (list10 == null) {
            l.a();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f148847b;
        if (list11 == null) {
            l.a();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f148847b;
        if (list12 == null) {
            l.a();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f148847b;
        if (list13 == null) {
            l.a();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f148847b;
        if (list == null) {
            l.a();
        }
        for (String str2 : list) {
            if (str == null) {
                l.a();
            }
            if (p.b(str, str2, false)) {
                List<String> list2 = f148847b;
                if (list2 == null) {
                    l.a();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str == null) {
            l.a();
        }
        if (str.length() <= i2) {
            return str;
        }
        String substring = str.substring(0, i2 - 1);
        l.a((Object) substring, "");
        return substring;
    }
}
