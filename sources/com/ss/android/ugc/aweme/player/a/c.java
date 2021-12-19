package com.ss.android.ugc.aweme.player.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f114958a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static List<String> f114959b;

    private c() {
    }

    static {
        Covode.recordClassIndex(73920);
        ArrayList arrayList = new ArrayList();
        f114959b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f114959b;
        if (list == null) {
            l.b();
        }
        list.add("TCP_MISS");
        List<String> list2 = f114959b;
        if (list2 == null) {
            l.b();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f114959b;
        if (list3 == null) {
            l.b();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f114959b;
        if (list4 == null) {
            l.b();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f114959b;
        if (list5 == null) {
            l.b();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f114959b;
        if (list6 == null) {
            l.b();
        }
        list6.add("HIT");
        List<String> list7 = f114959b;
        if (list7 == null) {
            l.b();
        }
        list7.add("MISS");
        List<String> list8 = f114959b;
        if (list8 == null) {
            l.b();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f114959b;
        if (list9 == null) {
            l.b();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f114959b;
        if (list10 == null) {
            l.b();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f114959b;
        if (list11 == null) {
            l.b();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f114959b;
        if (list12 == null) {
            l.b();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f114959b;
        if (list13 == null) {
            l.b();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f114959b;
        if (list == null) {
            l.b();
        }
        for (String str2 : list) {
            if (str == null) {
                l.b();
            }
            if (p.b(str, str2, false)) {
                List<String> list2 = f114959b;
                if (list2 == null) {
                    l.b();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }
}
