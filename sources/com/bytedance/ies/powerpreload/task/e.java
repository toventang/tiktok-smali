package com.bytedance.ies.powerpreload.task;

import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, TaskTraceMetric> f34549a = new LruCache<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final e f34550b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20669);
    }

    public static final TaskTraceMetric a(String str) {
        return f34549a.remove(str);
    }

    public static final String a(Intent intent) {
        l.c(intent, "");
        return a(intent, "PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }

    public static final String a(Bundle bundle) {
        l.c(bundle, "");
        return bundle.getString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
