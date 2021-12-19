package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final z f139359a;

    /* renamed from: b  reason: collision with root package name */
    private final List f139360b;

    static {
        Covode.recordClassIndex(91104);
    }

    ad(z zVar, List list) {
        this.f139359a = zVar;
        this.f139360b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        z zVar = this.f139359a;
        List<c> list = this.f139360b;
        if (!zVar.f104785a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (c cVar : list) {
                arrayList.add(cVar);
            }
        }
        zVar.f139957c.setVisibility(8);
        zVar.f139963i.a(list);
        zVar.b(list);
        return arrayList;
    }
}
