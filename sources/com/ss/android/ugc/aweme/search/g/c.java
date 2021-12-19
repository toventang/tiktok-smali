package com.ss.android.ugc.aweme.search.g;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "collapsed")
    private String collapsed;
    @com.google.gson.a.c(a = "option_list")
    private List<g> optionStructList;
    @com.google.gson.a.c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(78900);
    }

    public final String getCollapsed() {
        return this.collapsed;
    }

    public final List<g> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final g getDefaultOption() {
        List<g> list = this.optionStructList;
        if (list != null) {
            return (g) n.h((List) list);
        }
        return null;
    }

    public final boolean isEmpty() {
        List<g> list = this.optionStructList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<g> getOptionStuct() {
        List<g> list = this.optionStructList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setFilterOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final g getSelectOption() {
        List<g> list = this.optionStructList;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isSelected()) {
                t = next;
                break;
            }
        }
        return t;
    }

    public final void reset() {
        boolean z;
        List<g> list = this.optionStructList;
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                boolean z2 = true;
                if (t2 != null) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t2.setSelected(z);
                    if (i2 != 0) {
                        z2 = false;
                    }
                    t2.setDefaultOption(z2);
                }
                i2 = i3;
            }
        }
    }

    public final void setCollapsed(String str) {
        this.collapsed = str;
    }

    public final void setOptionStructList(List<g> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void selectOption(g gVar) {
        List<g> list;
        if (!(gVar == null || (list = this.optionStructList) == null)) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setSelected(l.a((Object) t2, (Object) gVar));
                }
                i2 = i3;
            }
        }
    }
}
