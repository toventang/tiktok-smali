package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.g;

public class d extends b {
    static {
        Covode.recordClassIndex(16187);
    }

    public boolean c() {
        return false;
    }

    private d() {
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public static d a(StackTraceElement stackTraceElement, String str, String str2, String str3, String str4) {
        d dVar = new d();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        dVar.a("event_type", (Object) "exception");
        dVar.a("log_type", (Object) "core_exception_monitor");
        dVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        dVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        dVar.a("class_ref", (Object) className);
        dVar.a("method", (Object) methodName);
        dVar.a("line_num", Integer.valueOf(lineNumber));
        dVar.a("stack", (Object) str);
        dVar.a("exception_type", (Object) 1);
        dVar.a("ensure_type", (Object) str4);
        dVar.a("is_core", (Object) 0);
        dVar.a("message", (Object) str2);
        dVar.a("process_name", (Object) b.c(m.f27724a));
        dVar.a("crash_thread_name", (Object) str3);
        e.a(dVar.f27557a);
        return dVar;
    }

    public static d a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        d dVar = new d();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        dVar.a("event_type", (Object) "exception");
        dVar.a("log_type", (Object) str5);
        dVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        dVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        dVar.a("class_ref", (Object) className);
        dVar.a("method", (Object) methodName);
        dVar.a("line_num", Integer.valueOf(lineNumber));
        dVar.a("stack", (Object) str);
        dVar.a("crash_md5", (Object) g.a(str));
        dVar.a("exception_type", (Object) 1);
        dVar.a("ensure_type", (Object) str4);
        dVar.a("is_core", Integer.valueOf(z ? 1 : 0));
        dVar.a("message", (Object) str2);
        dVar.a("process_name", (Object) b.c(m.f27724a));
        dVar.a("crash_thread_name", (Object) str3);
        e.a(dVar.f27557a);
        return dVar;
    }
}
