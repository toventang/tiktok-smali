package com.ss.android.ugc.aweme.commercialize.utils;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.views.form.a;
import com.ss.android.ugc.aweme.commercialize.views.form.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static int f75578a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final al f75579b = new al();

    private al() {
    }

    static {
        Covode.recordClassIndex(46623);
    }

    public static final void a(i iVar, ViewGroup viewGroup, int i2, boolean z) {
        l.d(iVar, "");
        l.d(viewGroup, "");
        a.C1734a.a(iVar, viewGroup, i2, z);
    }

    public static final void a(Aweme aweme, b bVar, i iVar, ViewGroup viewGroup, int i2) {
        l.d(aweme, "");
        l.d(iVar, "");
        l.d(viewGroup, "");
        Bundle c2 = d.c(aweme);
        l.b(c2, "");
        a a2 = a.C1734a.a(c2);
        a2.f76168c = bVar;
        a.C1734a.a(iVar, viewGroup, i2, a2);
    }
}
