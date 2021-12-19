package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.c;
import java.util.ArrayList;
import java.util.List;

public interface af extends c {
    static {
        Covode.recordClassIndex(19309);
    }

    Uri a(Uri uri, Bundle bundle, List<String> list, List<? extends g> list2);

    d a(String str, List<String> list);

    ae b();

    public static final class a {
        static {
            Covode.recordClassIndex(19310);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.bullet.service.base.af */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Uri a(af afVar, Uri uri, Bundle bundle, List list, int i2) {
            if ((i2 & 2) != 0) {
                bundle = new Bundle();
            }
            if ((i2 & 4) != 0) {
                list = new ArrayList();
            }
            return afVar.a(uri, bundle, list, null);
        }
    }
}
