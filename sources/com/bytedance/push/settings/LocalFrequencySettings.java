package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.f.c;
import com.bytedance.push.settings.a.a;
import java.util.List;

@a(a = "ttpush_local_setting")
public interface LocalFrequencySettings extends ILocalSettings {
    static {
        Covode.recordClassIndex(25834);
    }

    long a();

    void a(int i2);

    void a(long j2);

    void a(String str);

    void a(List<c> list);

    void a(boolean z);

    String b();

    void b(long j2);

    void b(String str);

    String c();

    void c(String str);

    String d();

    void d(String str);

    String e();

    void e(String str);

    String f();

    void f(String str);

    boolean g();

    int h();

    String i();

    List<c> j();

    long k();
}
