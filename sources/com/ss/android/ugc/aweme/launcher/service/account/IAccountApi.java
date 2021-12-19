package com.ss.android.ugc.aweme.launcher.service.account;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.e;
import java.util.Collection;

public interface IAccountApi {
    static {
        Covode.recordClassIndex(68643);
    }

    void a(String str, String str2, String str3);

    void a(Collection<String> collection);

    void a(boolean z, String str);

    boolean a();

    boolean a(String str);

    e b();

    void b(String str);

    String c();

    String d();
}
