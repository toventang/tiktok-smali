package com.bytedance.x.c;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a {
    static {
        Covode.recordClassIndex(28212);
    }

    public static final <T> List<T> a(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(t);
        return list;
    }

    public static final <T> Set<T> a(Set<T> set, T t) {
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(t);
        return set;
    }
}
