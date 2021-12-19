package com.ss.android.ugc.aweme.feed.adapter;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final SparseArray<LinkedList<View>> f91804a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Aweme, a> f91805b = new HashMap<>();

    static {
        Covode.recordClassIndex(57787);
    }

    public final void a() {
        for (a aVar : this.f91805b.values()) {
            if (!(aVar == null || aVar.f91806a == null)) {
                a(aVar.f91806a);
            }
        }
        this.f91805b.clear();
    }

    static boolean a(View view) {
        aj ajVar;
        if (view == null || (ajVar = (aj) view.getTag(R.id.b1q)) == null) {
            return false;
        }
        ajVar.c();
        return true;
    }

    protected static class a {

        /* renamed from: a  reason: collision with root package name */
        View f91806a;

        /* renamed from: b  reason: collision with root package name */
        int f91807b;

        static {
            Covode.recordClassIndex(57788);
        }

        a(View view, int i2) {
            this.f91806a = view;
            this.f91807b = i2;
        }
    }

    public final void a(int i2, View view) {
        if (i2 == 0) {
            LinkedList<View> linkedList = this.f91804a.get(i2);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.f91804a.put(i2, linkedList);
            }
            if (linkedList.size() <= 0) {
                linkedList.push(view);
            }
        }
    }
}
