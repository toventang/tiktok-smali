package com.bytedance.ies.powerlist.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(20475);
    }

    public static final List<Fragment> a(i iVar) {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : iVar.f()) {
            l.a((Object) fragment, "");
            arrayList.add(fragment);
            try {
                i childFragmentManager = fragment.getChildFragmentManager();
                l.a((Object) childFragmentManager, "");
                arrayList.addAll(a(childFragmentManager));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public static final boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return false;
        }
        Iterator<View> a2 = x.a(viewGroup).a();
        while (a2.hasNext()) {
            View next = a2.next();
            if (a(next, view2)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
