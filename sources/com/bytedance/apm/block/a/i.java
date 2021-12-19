package com.bytedance.apm.block.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.p.b.c;
import java.util.HashSet;
import java.util.Set;

public final class i {

    /* renamed from: f  reason: collision with root package name */
    private static StringBuilder f24628f = new StringBuilder();

    /* renamed from: a  reason: collision with root package name */
    public Set<Integer> f24629a = a();

    /* renamed from: b  reason: collision with root package name */
    private Set<Integer> f24630b = a();

    /* renamed from: c  reason: collision with root package name */
    private Set<Integer> f24631c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private int f24632d = 30;

    /* renamed from: e  reason: collision with root package name */
    private final String f24633e = ",";

    /* renamed from: g  reason: collision with root package name */
    private final int f24634g = 450;

    /* renamed from: h  reason: collision with root package name */
    private Handler f24635h = new Handler(Looper.getMainLooper());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f24638a = new i();

        static {
            Covode.recordClassIndex(14489);
        }
    }

    static {
        Covode.recordClassIndex(14487);
    }

    private static Set<Integer> a() {
        String string;
        HashSet hashSet = new HashSet();
        if (com.bytedance.b.k.a.f26313g == null) {
            string = "";
        } else {
            k.a(com.bytedance.b.k.a.f26313g);
            string = k.f24640a.getString("evil_method_SPUtils_key", null);
        }
        if (string == null) {
            return hashSet;
        }
        String[] split = string.split(",");
        try {
            for (String str : split) {
                hashSet.add(Integer.valueOf(str));
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    public final void a(int i2) {
        if (!c.f41757f || this.f24630b.contains(Integer.valueOf(i2))) {
            return;
        }
        if (this.f24631c.size() <= this.f24632d) {
            this.f24631c.add(Integer.valueOf(i2));
            return;
        }
        this.f24630b.addAll(this.f24631c);
        for (Integer num : this.f24631c) {
            f24628f.append(num).append(",");
        }
        if (f24628f.length() > this.f24634g) {
            String sb = f24628f.toString();
            if (!(sb == null || com.bytedance.b.k.a.f26313g == null)) {
                k.a(com.bytedance.b.k.a.f26313g);
                String string = k.f24640a.getString("evil_method_SPUtils_key", null);
                if (string != null) {
                    sb = string.concat(sb);
                }
                if (com.bytedance.b.k.a.f26313g != null) {
                    k.a(com.bytedance.b.k.a.f26313g);
                    k.f24640a.edit().putString("evil_method_SPUtils_key", sb).apply();
                }
            }
            f24628f.setLength(0);
        }
        final HashSet hashSet = new HashSet(this.f24631c);
        this.f24635h.post(new Runnable() {
            /* class com.bytedance.apm.block.a.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14488);
            }

            public final void run() {
                i.this.f24629a.addAll(hashSet);
            }
        });
        this.f24631c.clear();
    }
}
