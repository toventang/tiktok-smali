package com.bytedance.geckox.settings.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f30028a;

    static {
        Covode.recordClassIndex(17424);
    }

    public final void a() {
        List<b> list = this.f30028a;
        if (list != null && !list.isEmpty()) {
            com.bytedance.geckox.i.a.a("global settings notify finish");
            Iterator<b> it = this.f30028a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a(GlobalConfigSettings globalConfigSettings) {
        List<b> list = this.f30028a;
        if (!(list == null || list.isEmpty())) {
            com.bytedance.geckox.i.a.a("global settings notify update");
            for (b bVar : this.f30028a) {
                bVar.a(globalConfigSettings);
            }
        }
    }
}
