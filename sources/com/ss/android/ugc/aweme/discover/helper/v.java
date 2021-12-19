package com.ss.android.ugc.aweme.discover.helper;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.k.d;
import com.ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import com.ss.android.ugc.aweme.discover.ui.Dialog.d;
import com.ss.android.ugc.aweme.discover.ui.a.b;
import com.ss.android.ugc.aweme.discover.ui.a.b.a.a;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class v implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final v f81190a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(50458);
    }

    public static void a(i.a aVar) {
        a aVar2;
        String schema;
        d b2;
        l.d(aVar, "");
        Fragment fragment = aVar.f81121b;
        List<? extends Object> list = null;
        if (!(fragment instanceof b)) {
            fragment = null;
        }
        b bVar = (b) fragment;
        if (bVar != null) {
            Map<String, String> map = aVar.f81123d;
            boolean z = aVar.f81124e;
            boolean z2 = aVar.f81125f;
            com.ss.android.ugc.aweme.discover.ui.a.a.a.a a2 = bVar.a();
            if (z) {
                aVar2 = com.ss.android.ugc.aweme.discover.ui.a.b.a.b.f82221b.a(aVar.f81122c);
            } else {
                aVar2 = null;
            }
            a2.f82192a = aVar2;
            if (!z2 && (b2 = d.a.b(aVar.f81120a)) != null) {
                d.b bVar2 = b2.o;
                if (bVar2 != null) {
                    bVar2.f82120b = c.a(b2.getActivity(), bVar.a().f82192a, bVar.f82209k);
                    bVar2.f82128j = c.a(bVar.a().f82192a);
                }
                b2.c();
            }
            com.ss.android.ugc.aweme.discover.ui.a.a.a.a a3 = bVar.a();
            d.a a4 = com.ss.android.ugc.aweme.discover.k.d.a(aVar.f81122c);
            if (!(a4 == null || (schema = a4.getSchema()) == null || schema.length() == 0)) {
                list = n.c(new SearchUserFeedback(schema));
            }
            a3.f82193b = list;
            bVar.f82206d = map;
            bVar.d();
        }
    }
}
