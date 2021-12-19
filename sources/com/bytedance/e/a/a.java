package com.bytedance.e.a;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f28645a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f28646b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f28647c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile String f28648d = "ttboringssl";

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f28649e = "ttcrypto";

    /* renamed from: f  reason: collision with root package name */
    private static Lock f28650f = new ReentrantLock();

    static {
        Covode.recordClassIndex(16832);
    }

    public static boolean a() {
        try {
            f28650f.lock();
            if (f28647c != null) {
                boolean a2 = f28647c.a();
                f28650f.unlock();
                return a2;
            }
            if (!f28646b) {
                a(f28649e);
                f28646b = true;
            }
            if (!f28645a) {
                a(f28648d);
                f28645a = true;
            }
            f28650f.unlock();
            if (!f28645a || !f28646b) {
                return false;
            }
            return true;
        } catch (Error unused) {
        } catch (Throwable th) {
            f28650f.unlock();
            throw th;
        }
    }

    private static void a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}
