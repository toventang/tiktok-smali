package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f27774a;

    static {
        Covode.recordClassIndex(16273);
    }

    public final boolean a() {
        Map<String, String> map = this.f27774a;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(this.f27774a.get("process_name")) || TextUtils.isEmpty(this.f27774a.get("crash_thread_name")) || TextUtils.isEmpty(this.f27774a.get("pid")) || TextUtils.isEmpty(this.f27774a.get("tid")) || TextUtils.isEmpty(this.f27774a.get("start_time")) || TextUtils.isEmpty(this.f27774a.get("crash_time")) || TextUtils.isEmpty(this.f27774a.get("signal_line"))) {
            return false;
        }
        return true;
    }

    public b(File file) {
        String doGetCrashHeader;
        MethodCollector.i(10455);
        File b2 = r.b(file);
        if (!b2.exists() || b2.length() == 0) {
            MethodCollector.o(10455);
            return;
        }
        String absolutePath = b2.getAbsolutePath();
        if (NativeImpl.f27758a && (doGetCrashHeader = NativeImpl.doGetCrashHeader(absolutePath)) != null) {
            String[] split = doGetCrashHeader.split("\n");
            this.f27774a = new HashMap();
            for (String str : split) {
                String[] split2 = str.split("=");
                if (split2.length == 2) {
                    this.f27774a.put(split2[0], split2[1]);
                }
            }
            MethodCollector.o(10455);
            return;
        }
        MethodCollector.o(10455);
    }
}
