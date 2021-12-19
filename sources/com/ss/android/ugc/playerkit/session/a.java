package com.ss.android.ugc.playerkit.session;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.f.a.a.a.a.c;
import java.util.LinkedList;
import java.util.Queue;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f148854a = new a();

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, String> f148855b = new LruCache<>(100);

    /* renamed from: c  reason: collision with root package name */
    private volatile Session f148856c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Session> f148857d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private LruCache<String, c> f148858e = new LruCache<>(100);

    /* renamed from: f  reason: collision with root package name */
    private LruCache<String, String> f148859f = new LruCache<>(100);

    /* renamed from: g  reason: collision with root package name */
    private LruCache<String, String> f148860g = new LruCache<>(100);

    static {
        Covode.recordClassIndex(98023);
    }

    public final synchronized Session a() {
        MethodCollector.i(7964);
        if (this.f148856c != null) {
            Session session = this.f148856c;
            MethodCollector.o(7964);
            return session;
        }
        Session session2 = Session.DEFAULT;
        MethodCollector.o(7964);
        return session2;
    }

    private a() {
    }

    public final synchronized Session a(String str) {
        Session session;
        MethodCollector.i(7915);
        this.f148856c = b(str);
        if (this.f148856c == null) {
            this.f148856c = d(str);
        }
        session = this.f148856c;
        MethodCollector.o(7915);
        return session;
    }

    public final synchronized Session b(String str) {
        MethodCollector.i(7966);
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f148857d.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    Session session = sessionArr[length];
                    MethodCollector.o(7966);
                    return session;
                }
            }
        }
        MethodCollector.o(7966);
        return null;
    }

    public final synchronized Session c(String str) {
        MethodCollector.i(7968);
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f148857d.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].sourceId)) {
                    Session session = sessionArr[length];
                    MethodCollector.o(7968);
                    return session;
                }
            }
        }
        MethodCollector.o(7968);
        return null;
    }

    public final synchronized Session d(String str) {
        MethodCollector.i(7973);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7973);
            return null;
        }
        Session instance = Session.instance();
        instance.key = str;
        instance.uri = str;
        if (this.f148857d.size() + 1 > 5) {
            this.f148857d.poll();
        }
        this.f148857d.offer(instance);
        MethodCollector.o(7973);
        return instance;
    }

    public final synchronized c e(String str) {
        MethodCollector.i(8069);
        if (!TextUtils.isEmpty(str)) {
            c cVar = this.f148858e.get(str);
            MethodCollector.o(8069);
            return cVar;
        }
        MethodCollector.o(8069);
        return null;
    }

    public final synchronized String f(String str) {
        MethodCollector.i(8163);
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f148859f.get(str);
            MethodCollector.o(8163);
            return str2;
        }
        MethodCollector.o(8163);
        return null;
    }

    public final synchronized String g(String str) {
        MethodCollector.i(8224);
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f148860g.get(str);
            MethodCollector.o(8224);
            return str2;
        }
        MethodCollector.o(8224);
        return "";
    }

    public final synchronized void c(String str, String str2) {
        MethodCollector.i(8168);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f148860g.put(str, str2);
        }
        MethodCollector.o(8168);
    }

    public final synchronized void a(String str, c cVar) {
        MethodCollector.i(7976);
        if (!TextUtils.isEmpty(str)) {
            this.f148858e.put(str, cVar);
        }
        MethodCollector.o(7976);
    }

    public final synchronized void b(String str, String str2) {
        MethodCollector.i(8158);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(8158);
        } else if (TextUtils.isEmpty(str2)) {
            this.f148859f.remove(str);
            MethodCollector.o(8158);
        } else {
            this.f148859f.put(str, str2);
            MethodCollector.o(8158);
        }
    }

    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f148855b.put(str, str2);
        }
    }
}
