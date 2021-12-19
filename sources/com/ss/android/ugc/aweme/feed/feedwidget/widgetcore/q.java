package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    static Map<a, Runnable> f93152a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    static Set<a> f93153b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    static Set<a> f93154c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public static final q f93155d = new q();

    private q() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93156a = new a();

        static {
            Covode.recordClassIndex(59095);
        }

        a() {
        }

        public final void run() {
            q.f93152a.clear();
            q.f93153b.clear();
            q.f93154c.clear();
        }
    }

    static {
        Covode.recordClassIndex(59094);
    }

    public static boolean b(a aVar) {
        l.d(aVar, "");
        return f93153b.contains(aVar);
    }

    public static boolean c(a aVar) {
        l.d(aVar, "");
        return f93154c.contains(aVar);
    }

    public static void d(a aVar) {
        l.d(aVar, "");
        f93154c.add(aVar);
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        Runnable remove = f93152a.remove(aVar);
        if (remove != null) {
            remove.run();
        }
        f93153b.add(aVar);
        f93154c.remove(aVar);
    }
}
