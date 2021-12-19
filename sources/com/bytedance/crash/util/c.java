package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, a> f27983a = new HashMap<>();

    static {
        Covode.recordClassIndex(16374);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        File f27984a;

        /* renamed from: b  reason: collision with root package name */
        public int f27985b;

        /* renamed from: c  reason: collision with root package name */
        int f27986c;

        /* renamed from: d  reason: collision with root package name */
        int f27987d;

        /* renamed from: e  reason: collision with root package name */
        public int f27988e = 1;

        static {
            Covode.recordClassIndex(16375);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            try {
                j.a(this.f27984a, this.f27985b + "\n" + this.f27986c + "\n" + this.f27987d + "\n" + this.f27988e, false);
            } catch (IOException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            this.f27986c = 0;
            this.f27987d = 0;
            this.f27988e = 1;
            this.f27985b = 2;
        }

        a(File file) {
            this.f27984a = file;
            try {
                if (file.exists()) {
                    JSONArray a2 = j.a(file, -1);
                    this.f27985b = Integer.parseInt(a2.optString(0));
                    this.f27986c = Integer.parseInt(a2.optString(1));
                    this.f27987d = Integer.parseInt(a2.optString(2));
                    this.f27988e = Integer.parseInt(a2.optString(3));
                }
            } catch (IOException unused) {
            }
        }
    }

    public static a a(String str) {
        HashMap<String, a> hashMap = f27983a;
        a aVar = hashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(new File(r.c(m.f27724a), str));
        hashMap.put(str, aVar2);
        return aVar2;
    }

    public static void a(boolean z, String str, int i2) {
        a a2 = a(str);
        if (2 != a2.f27985b) {
            a2.a(2);
        }
        if (a2.f27988e == 1) {
            if (z) {
                a2.f27986c++;
                if (i2 <= a2.f27986c) {
                    a2.f27987d = 0;
                }
            } else {
                a2.f27987d++;
                if (i2 <= a2.f27987d) {
                    a2.f27986c = 0;
                    a2.f27988e = 0;
                }
            }
            a2.a();
        }
    }
}
