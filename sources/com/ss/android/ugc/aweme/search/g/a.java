package com.ss.android.ugc.aweme.search.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a implements Serializable {
    @c(a = "option_list")
    private List<h> optionStructList;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(78898);
    }

    public final List<h> getActivitySelectOption() {
        return this.optionStructList;
    }

    public final List<h> getOptionStructList() {
        return this.optionStructList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isEmpty() {
        List<h> list = this.optionStructList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<h> getOptionStuct() {
        List<h> list = this.optionStructList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setActivityOptionStruct(this);
            }
        }
        return this.optionStructList;
    }

    public final boolean isDefault() {
        List<h> list = this.optionStructList;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                return false;
            }
        }
        return true;
    }

    public final void reset() {
        List<h> list = this.optionStructList;
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setSelected(false);
                }
                i2 = i3;
            }
        }
    }

    public final List<h> getDefaultOptionStruct() {
        ArrayList arrayList = new ArrayList();
        List<h> list = this.optionStructList;
        if (list != null) {
            for (T t : list) {
                h hVar = new h();
                hVar.setDescription(t.getDescription());
                hVar.setActivityOptionStruct(t.getActivityOptionStruct());
                hVar.setSelected(false);
                hVar.setLogInfo(t.getLogInfo());
                hVar.setName(t.getName());
                hVar.setRequestKey(t.getRequestKey());
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public final void setOptionStructList(List<h> list) {
        this.optionStructList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setLastOptionData(List<h> list) {
        String str;
        h hVar;
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                String requestKey = t2.getRequestKey();
                List<h> list2 = this.optionStructList;
                if (list2 == null || (hVar = list2.get(i2)) == null) {
                    str = null;
                } else {
                    str = hVar.getRequestKey();
                }
                if (p.a(requestKey, str, false)) {
                    List<h> list3 = this.optionStructList;
                    if (list3 == null) {
                        l.b();
                    }
                    list3.get(i2).setSelected(t2.isSelected());
                }
                i2 = i3;
            }
        }
    }

    public final void selectOption(h hVar, boolean z) {
        List<h> list;
        if (!(hVar == null || (list = this.optionStructList) == null)) {
            for (T t : list) {
                if (p.a(t.getRequestKey(), hVar.getRequestKey(), false)) {
                    t.setSelected(z);
                    return;
                }
            }
        }
    }
}
