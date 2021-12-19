package com.bytedance.ies.bullet.ui.common.b;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.c.d;
import com.bytedance.ies.bullet.ui.common.h;
import java.util.List;

public interface c extends h.b {
    static {
        Covode.recordClassIndex(19745);
    }

    ViewGroup a();

    ViewGroup a(Context context);

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    void a(Uri uri);

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    void a(Uri uri, Throwable th);

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    void a(View view, Uri uri, i iVar);

    void a(q qVar);

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z);

    b b(Context context);

    a b();
}
