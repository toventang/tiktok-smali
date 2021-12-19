package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface bj {
    static {
        Covode.recordClassIndex(31253);
    }

    <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t);

    void a();

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean a(p pVar);

    <A extends a.b, T extends d.a<? extends p, A>> T b(T t);

    void b();

    boolean d();

    void e();

    void f();
}
