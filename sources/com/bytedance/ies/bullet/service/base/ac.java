package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface ac {

    public static class a implements ac {
        static {
            Covode.recordClassIndex(19306);
        }

        @Override // com.bytedance.ies.bullet.service.base.ac
        public final void a(Uri uri) {
            l.c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.ac
        public final void a(Uri uri, Uri uri2) {
            l.c(uri, "");
            l.c(uri2, "");
        }
    }

    static {
        Covode.recordClassIndex(19305);
    }

    void a(Uri uri);

    void a(Uri uri, Uri uri2);
}
