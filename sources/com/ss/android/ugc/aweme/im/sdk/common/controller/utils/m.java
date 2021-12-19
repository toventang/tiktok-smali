package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.iescore.b.f;
import com.ss.android.ugc.aweme.im.service.c;
import h.f.b.l;
import java.util.Iterator;

public final class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final m f102425a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(65570);
    }

    @Override // com.ss.android.ugc.aweme.im.service.c
    public final void a(String str) {
        l.d(str, "");
        Iterator<T> it = f.b().iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }
}
