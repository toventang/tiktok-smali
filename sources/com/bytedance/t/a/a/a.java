package com.bytedance.t.a.a;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Message, Object> f44108a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<StackTraceElement[]> f44109b = new ThreadLocal<>();

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
    }

    public static StackTraceElement[] a() {
        StackTraceElement[] stackTraceElementArr = f44109b.get();
        f44109b.set(null);
        return stackTraceElementArr;
    }

    static {
        Covode.recordClassIndex(27030);
    }
}
