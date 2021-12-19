package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class m extends ArrayList<ai> {
    static {
        Covode.recordClassIndex(23135);
    }

    public m() {
    }

    public m(Collection<? extends ai> collection) {
        super(collection);
    }

    public final boolean update(ai aiVar) {
        int indexOf = indexOf(aiVar);
        if (indexOf < 0) {
            return false;
        }
        set(indexOf, aiVar);
        return true;
    }

    private static boolean a(ai aiVar) {
        if (aiVar == null || aiVar.isDeleted() || aiVar.getSvrStatus() != 0) {
            return false;
        }
        return true;
    }

    public final boolean add(ai aiVar) {
        int indexOf = indexOf(aiVar);
        if (indexOf < 0) {
            super.add((-indexOf) - 1, aiVar);
        } else {
            set(indexOf, aiVar);
        }
        return true;
    }

    public final void addList(List<ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (ai aiVar : list) {
                if (a(aiVar)) {
                    add(aiVar);
                }
            }
        }
    }

    public final void appendList(List<ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (ai aiVar : list) {
                if (a(aiVar)) {
                    int indexOf = indexOf(aiVar);
                    if (indexOf < 0) {
                        super.add((Object) aiVar);
                    } else {
                        set(indexOf, aiVar);
                    }
                }
            }
        }
    }

    public final void updateList(List<ai> list) {
        if (!(list == null || list.isEmpty())) {
            for (ai aiVar : list) {
                if (a(aiVar)) {
                    update(aiVar);
                }
            }
        }
    }
}
