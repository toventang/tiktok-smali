package com.ss.android.ugc.aweme.tools.music.a.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.music.a.e;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.utils.u;
import h.a.n;
import h.c.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.c.c f140334e;

    static {
        Covode.recordClassIndex(91683);
    }

    @Override // com.ss.android.ugc.aweme.tools.music.a.b.a
    public final void e() {
        if (this.f140334e.f69586a.isEmpty()) {
            a("");
        } else {
            super.e();
        }
    }

    public c(com.ss.android.ugc.aweme.c.c cVar) {
        l.d(cVar, "");
        this.f140334e = cVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.tools.music.a.b.a
    public final Object a(d<? super String> dVar) {
        return u.a(a(), a(e.a(n.g((Collection) this.f140334e.f69586a), b())));
    }

    private final List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : list) {
            if (i.a((String) t)) {
                try {
                    Bitmap a2 = h.a(t, (BitmapFactory.Options) null);
                    if (a2 != null) {
                        String absolutePath = a(e.a(a2), i2).getAbsolutePath();
                        l.b(absolutePath, "");
                        arrayList.add(absolutePath);
                    }
                } catch (Exception e2) {
                    q.a("resizePicturesForAI fail err: ".concat(String.valueOf(e2)));
                }
            }
            i2++;
        }
        return arrayList;
    }
}
