package com.facebook.a;

import android.preference.PreferenceManager;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;
import com.facebook.m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ReentrantReadWriteLock f46592a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    public static String f46593b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f46594c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final String f46595d = b.class.getSimpleName();

    b() {
    }

    static {
        Covode.recordClassIndex(28415);
    }

    public static String a() {
        if (!f46594c) {
            b();
        }
        f46592a.readLock().lock();
        try {
            return f46593b;
        } finally {
            f46592a.readLock().unlock();
        }
    }

    public static void b() {
        if (!f46594c) {
            f46592a.writeLock().lock();
            try {
                if (!f46594c) {
                    ae.a();
                    f46593b = PreferenceManager.getDefaultSharedPreferences(m.f48921g).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f46594c = true;
                }
            } finally {
                f46592a.writeLock().unlock();
            }
        }
    }
}
