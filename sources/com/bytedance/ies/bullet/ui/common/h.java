package com.bytedance.ies.bullet.ui.common;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.k;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.service.f.a.b.q;
import java.util.List;

public interface h extends k, d.a, com.bytedance.ies.bullet.c.e.a {

    public interface b {
        static {
            Covode.recordClassIndex(19774);
        }

        void a(Uri uri);

        void a(Uri uri, Throwable th);

        void a(View view, Uri uri, i iVar);

        void a(i iVar, Uri uri, q qVar);

        void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, i iVar, boolean z);
    }

    static {
        Covode.recordClassIndex(19772);
    }

    void a(Uri uri, Bundle bundle, b bVar);

    void a(View view, int i2, int i3, int i4, int i5, int i6);

    void onEvent(p pVar);

    public static final class a {
        static {
            Covode.recordClassIndex(19773);
        }

        public static /* synthetic */ void a(h hVar, Uri uri, Bundle bundle, b bVar, int i2) {
            if ((i2 & 2) != 0) {
                bundle = null;
            }
            if ((i2 & 4) != 0) {
                bVar = null;
            }
            hVar.a(uri, bundle, bVar);
        }
    }
}
