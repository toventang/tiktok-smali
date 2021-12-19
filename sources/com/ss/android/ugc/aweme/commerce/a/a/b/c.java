package com.ss.android.ugc.aweme.commerce.a.a.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f73342a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, ArrayList<a>> f73343b = new HashMap<>();

    static {
        Covode.recordClassIndex(45154);
    }

    private c() {
    }

    public final boolean a(String str, long j2) {
        ArrayList<a> arrayList = this.f73343b.get(str);
        if (arrayList != null && !arrayList.isEmpty()) {
            long max = Math.max(j2, arrayList.get(0).f73344a);
            Iterator<a> it = arrayList.iterator();
            loop0:
            while (true) {
                long j3 = 0;
                boolean z = true;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    a next = it.next();
                    if (max <= next.f73344a) {
                        if (next.f73345b >= 0.5f) {
                            if (z) {
                                max = next.f73344a;
                                z = false;
                            }
                            j3 += next.f73344a - max;
                            max = next.f73344a;
                            if (j3 >= 2000000000) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f73344a;

        /* renamed from: b  reason: collision with root package name */
        final float f73345b;

        /* renamed from: c  reason: collision with root package name */
        public final String f73346c;

        static {
            Covode.recordClassIndex(45155);
        }

        public a(long j2, float f2, String str) {
            this.f73344a = j2;
            this.f73345b = f2;
            this.f73346c = str;
        }
    }
}
