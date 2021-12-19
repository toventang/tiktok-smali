package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c;
import com.ss.android.ugc.aweme.im.service.k.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f102086a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(65325);
    }

    private static List<b> a(Context context, a aVar, b bVar, a aVar2) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(bVar, "");
        l.d(aVar2, "");
        List<q<Context, b, a, b>> actionList = aVar2.getActionList();
        ArrayList arrayList = new ArrayList(n.a((Iterable) actionList, 10));
        Iterator<T> it = actionList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().invoke(context, bVar, aVar));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof e) || !(aVar instanceof c) || !com.ss.android.ugc.aweme.im.service.c.c.a()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((b) obj2).e()) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static void a(e eVar, IMContact iMContact, a aVar, a aVar2) {
        String displayName;
        i coreInfo;
        String str;
        String str2 = "";
        l.d(eVar, str2);
        l.d(aVar, str2);
        l.d(aVar2, str2);
        String bF_ = aVar.bF_();
        l.b(bF_, str2);
        b a2 = b.a.a(bF_);
        h c2 = a2.c();
        if (!(c2 == null || (coreInfo = c2.getCoreInfo()) == null)) {
            if (iMContact != null) {
                str = iMContact.getDisplayName();
            } else {
                str = null;
            }
            coreInfo.setName(str);
        }
        List<b> a3 = a(eVar, aVar, a2, aVar2);
        a.b bVar = new a.b();
        if (!(iMContact == null || (displayName = iMContact.getDisplayName()) == null)) {
            str2 = displayName;
        }
        a.b a4 = bVar.a(aVar2.getTitle(eVar, str2));
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.f()) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) a3, 10));
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().g());
            }
            a4.a(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) a3, 10));
            Iterator<T> it2 = a3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().f());
            }
            a4.b(arrayList2);
        }
        a4.b().show(eVar.getSupportFragmentManager(), "IMSessionLongPressHelper");
    }
}
