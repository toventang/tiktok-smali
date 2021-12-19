package com.ss.android.ugc.aweme.bullet.b;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.a.e;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.b.c;
import com.bytedance.ies.bullet.ui.common.c.d;
import h.f.b.l;
import java.util.List;

public abstract class a implements c {
    static {
        Covode.recordClassIndex(42416);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public void a(View view, Uri uri, i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.c
    public void a(q qVar) {
        l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.b.c
    public void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    public com.bytedance.ies.bullet.kit.web.a.d c() {
        return null;
    }

    public e d() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.c
    public com.bytedance.ies.bullet.ui.common.b.a b() {
        return new com.bytedance.ies.bullet.ui.common.c();
    }

    @Override // com.bytedance.ies.bullet.ui.common.b.c
    public b b(Context context) {
        l.d(context, "");
        l.c(context, "");
        return null;
    }
}
