package com.ss.android.ugc.aweme.commercialize.egg.impl.service;

import android.text.TextUtils;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.egg.c.a;
import com.ss.android.ugc.aweme.commercialize.egg.d.a;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.feed.model.EditHint;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CommerceEggServiceImpl implements ICommerceEggService {
    static {
        Covode.recordClassIndex(45592);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final a b() {
        return com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.f74018a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final void a() {
        com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73969d = null;
        com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73968c = null;
    }

    public static ICommerceEggService c() {
        MethodCollector.i(8990);
        Object a2 = b.a(ICommerceEggService.class, false);
        if (a2 != null) {
            ICommerceEggService iCommerceEggService = (ICommerceEggService) a2;
            MethodCollector.o(8990);
            return iCommerceEggService;
        }
        if (b.ap == null) {
            synchronized (ICommerceEggService.class) {
                try {
                    if (b.ap == null) {
                        b.ap = new CommerceEggServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8990);
                    throw th;
                }
            }
        }
        CommerceEggServiceImpl commerceEggServiceImpl = (CommerceEggServiceImpl) b.ap;
        MethodCollector.o(8990);
        return commerceEggServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final com.ss.android.ugc.aweme.commercialize.egg.e.a a(ViewStub viewStub) {
        l.d(viewStub, "");
        return new com.ss.android.ugc.aweme.commercialize.egg.impl.view.a(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final void a(com.ss.android.ugc.aweme.commercialize.egg.b.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.commercialize.egg.impl.c.a.f74015a.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final String a(String str) {
        boolean z;
        List<? extends EditHint> list;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (list = com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73969d) == null) {
            return null;
        }
        for (EditHint editHint : list) {
            if (TextUtils.equals(str, editHint.getLanguage())) {
                return editHint.getHint();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, String str) {
        l.d(str, "");
        if (aVar != null && !TextUtils.isEmpty(aVar.f73934b) && !TextUtils.isEmpty(aVar.f73933a)) {
            int hashCode = str.hashCode();
            if (hashCode != -906336856) {
                if (hashCode == 3321751 && str.equals("like")) {
                    if (aVar == null) {
                        aVar = null;
                    } else if (aVar.f73939g) {
                        com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.a(aVar);
                    }
                    com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73966a = aVar;
                }
            } else if (str.equals("search")) {
                if (aVar == null) {
                    aVar = null;
                } else if (aVar.f73939g) {
                    com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.a(aVar);
                }
                com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73967b = aVar;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService
    public final void a(String str, String str2, ItemCommentEggGroup itemCommentEggGroup) {
        List<EditHint> list;
        if (itemCommentEggGroup != null) {
            List<ItemCommentEggData> commentEggData = itemCommentEggGroup.getCommentEggData();
            if (commentEggData != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<ItemCommentEggData> it = commentEggData.iterator();
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (com.ss.android.ugc.aweme.commercialize.egg.impl.a.a(t)) {
                        a.C1663a aVar = new a.C1663a();
                        l.b(t, "");
                        aVar.f73946a = t;
                        aVar.f73947b = true;
                        com.ss.android.ugc.aweme.commercialize.egg.d.a a2 = aVar.a(str).b(str2).a();
                        arrayList.add(a2);
                        com.ss.android.ugc.aweme.commercialize.egg.impl.e.a.a(a2);
                    }
                }
                com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73968c = arrayList;
            }
            list = itemCommentEggGroup.getEditintist();
        } else {
            list = null;
        }
        com.ss.android.ugc.aweme.commercialize.egg.impl.a.f73969d = list;
    }
}
