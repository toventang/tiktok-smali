package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedList;
import java.util.Queue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Queue<a> f110754a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public static final b f110755b = new b();

    private b() {
    }

    public static boolean a() {
        return f110754a.isEmpty();
    }

    static {
        Covode.recordClassIndex(71086);
    }

    public static void b() {
        Queue<a> queue = f110754a;
        if (!queue.isEmpty()) {
            queue.peek().f110671a.invoke();
        }
    }

    public static void c() {
        Queue<a> queue = f110754a;
        queue.remove();
        if (!queue.isEmpty()) {
            queue.peek().f110671a.invoke();
        }
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        Queue<a> queue = f110754a;
        queue.add(aVar);
        if (queue.size() == 1) {
            queue.peek().f110671a.invoke();
        }
    }
}
