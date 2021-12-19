package com.ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class b implements Serializable {
    @c(a = "template_items")
    private final List<c> templateItems;

    static {
        Covode.recordClassIndex(72097);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.mvtheme.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b copy$default(b bVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bVar.templateItems;
        }
        return bVar.copy(list);
    }

    public final List<c> component1() {
        return this.templateItems;
    }

    public final b copy(List<c> list) {
        l.d(list, "");
        return new b(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.templateItems, ((b) obj).templateItems);
        }
        return true;
    }

    public final int hashCode() {
        List<c> list = this.templateItems;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BirthdayBlessMvParam(templateItems=" + this.templateItems + ")";
    }

    public final List<c> getTemplateItems() {
        return this.templateItems;
    }

    public final int getTemplateCount() {
        return this.templateItems.size();
    }

    public b(List<c> list) {
        l.d(list, "");
        this.templateItems = list;
    }

    public final c getCurrentTemplate(String str) {
        T t;
        Iterator<T> it = this.templateItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.getEffectId(), (Object) str)) {
                break;
            }
        }
        return t;
    }

    public final c getNextTemplate(String str) {
        int i2;
        List<c> list = this.templateItems;
        ListIterator<c> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (l.a((Object) listIterator.previous().getEffectId(), (Object) str)) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        c cVar = (c) n.b((List) this.templateItems, i2 + 1);
        if (cVar == null) {
            return (c) n.h((List) this.templateItems);
        }
        return cVar;
    }
}
