package com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist;

import android.content.Context;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.e;
import com.ss.android.ugc.aweme.profile.editprofile.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class c extends e {

    /* renamed from: d  reason: collision with root package name */
    public a f116164d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f116165e;

    static {
        Covode.recordClassIndex(74931);
    }

    @Override // com.bytedance.ies.powerlist.e
    public final void c() {
        a(false);
        Iterator<T> it = this.f116165e.iterator();
        while (it.hasNext()) {
            b().a(new d(it.next().intValue()));
        }
    }

    public c(List<Integer> list) {
        l.d(list, "");
        this.f116165e = list;
    }

    private final void a(Context context) {
        a aVar = new a(context, (byte) 0);
        this.f116164d = aVar;
        String a2 = y.a((int) R.string.cbc);
        if (a2 == null) {
            a2 = "";
        }
        aVar.setChunkText(a2);
    }

    public final void a(boolean z) {
        Context context = this.f34288b;
        if (context == null) {
            return;
        }
        if ((!this.f116165e.isEmpty()) || z) {
            a(context);
            a aVar = this.f116164d;
            if (aVar == null) {
                l.a("headerView");
            }
            d_(aVar);
        }
    }
}
