package com.bytedance.android.monitorV2;

import android.util.LruCache;
import com.bytedance.android.monitorV2.h.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f23841a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f23842b;

    /* renamed from: c  reason: collision with root package name */
    private static final LruCache<String, String> f23843c;

    private d() {
    }

    static {
        Covode.recordClassIndex(14111);
        d dVar = new d();
        f23841a = dVar;
        int maxMemory = ((int) Runtime.getRuntime().maxMemory()) / 1024;
        f23842b = maxMemory;
        f23843c = new a(dVar, maxMemory / 8);
    }

    public static final class a extends LruCache<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f23844a;

        static {
            Covode.recordClassIndex(14112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, int i2) {
            super(i2);
            this.f23844a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* synthetic */ int sizeOf(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int i2 = 0;
            if (str3 == null) {
                return 0;
            }
            int length = str3.length();
            if (str4 != null) {
                i2 = str4.length();
            }
            return length + i2;
        }
    }

    public static String a(String str, List<b> list) {
        l.c(str, "");
        if (list == null || list.isEmpty()) {
            return "";
        }
        String str2 = f23843c.get(str);
        if (str2 != null) {
            System.out.println((Object) "hit cache: ".concat(String.valueOf(str2)));
            return str2;
        }
        l.c(str, "");
        l.c(list, "");
        for (T t : list) {
            if (t.f23939b.containsMatchIn(str)) {
                System.out.print((Object) (t.f23939b + " match " + t.f23938a));
                f23843c.put(str, t.f23938a);
                return t.f23938a;
            }
        }
        return "";
    }
}
