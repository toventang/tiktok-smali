package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a.a;

@a(a = "push_multi_process_config", b = true)
public interface LocalSettings extends ILocalSettings {
    static {
        Covode.recordClassIndex(25837);
    }

    String a();

    void a(String str);

    void a(boolean z);

    String b();

    void b(String str);

    boolean c();
}
