package com.benchmark.tools;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f6364a;

    /* renamed from: b  reason: collision with root package name */
    protected static ArrayList<Object> f6365b = new ArrayList<>();

    static {
        Covode.recordClassIndex(3055);
    }

    public static void a() {
        if (!f6364a) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("bytebench");
            if (f6380d != null) {
                if (!f6380d.a(arrayList)) {
                    f6364a = false;
                    return;
                }
            } else if (!f6381e.a(arrayList)) {
                f6364a = false;
                return;
            }
            f6364a = true;
        }
    }
}
