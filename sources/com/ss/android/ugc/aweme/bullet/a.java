package com.ss.android.ugc.aweme.bullet;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.c.d;
import com.bytedance.ies.bullet.ui.common.h;
import h.f.b.l;
import java.util.List;

public abstract class a implements h.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1556a f68833b = new C1556a((byte) 0);

    static {
        Covode.recordClassIndex(42400);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(View view, Uri uri, i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.a$a  reason: collision with other inner class name */
    public static final class C1556a {
        static {
            Covode.recordClassIndex(42401);
        }

        private C1556a() {
        }

        public /* synthetic */ C1556a(byte b2) {
            this();
        }
    }
}
