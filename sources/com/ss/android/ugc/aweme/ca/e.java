package com.ss.android.ugc.aweme.ca;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.boost.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.dd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f69601a;

    /* renamed from: b  reason: collision with root package name */
    public static int f69602b;

    /* renamed from: c  reason: collision with root package name */
    public static HashMap<String, HashSet<Integer>> f69603c = new HashMap<>();

    static {
        Covode.recordClassIndex(42936);
    }

    public static HashSet<Integer> a(String str) {
        try {
            HashSet<Integer> hashSet = f69603c.get(str);
            if (hashSet != null) {
                return hashSet;
            }
        } catch (Throwable unused) {
        }
        return new HashSet<>();
    }

    public static void a(HashSet<Integer> hashSet) {
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            try {
                if (dd.f89768d) {
                    Jato.bindBigCore(next.intValue());
                }
                g.a(next.intValue(), -20);
            } catch (Throwable unused) {
            }
        }
    }

    public static HashSet<Integer> b(String str) {
        HashSet<Integer> value;
        HashSet<Integer> hashSet = new HashSet<>();
        try {
            for (Map.Entry<String, HashSet<Integer>> entry : f69603c.entrySet()) {
                if (entry.getKey().startsWith(str) && (value = entry.getValue()) != null) {
                    hashSet.addAll(value);
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public static void b(HashSet<Integer> hashSet) {
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            try {
                if (dd.f89771g) {
                    Jato.bindLittleCore(next.intValue());
                }
                g.a(next.intValue(), 19);
            } catch (Throwable unused) {
            }
        }
    }
}
