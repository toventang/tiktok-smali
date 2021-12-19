package com.ss.android.ugc.aweme.ug;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.ss.android.ugc.aweme.ug.dynamicresource.l;

public interface IUgCommonService {
    static {
        Covode.recordClassIndex(92620);
    }

    c a();

    String a(h hVar);

    void a(Context context);

    void a(Context context, int i2, int i3, Intent intent);

    void a(Intent intent);

    void a(a aVar);

    void a(a aVar, boolean z);

    void a(boolean z);

    d b();

    void b(Context context);

    void b(a aVar);

    l c();

    void c(a aVar);

    void d();

    void d(a aVar);

    long e();

    SQLiteDatabase f();

    boolean g();

    e h();

    boolean i();
}
