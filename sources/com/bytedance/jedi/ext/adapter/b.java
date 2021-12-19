package com.bytedance.jedi.ext.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.Widget;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(24437);
    }

    public static final Object a(Object obj) {
        while (true) {
            l.c(obj, "");
            if ((obj instanceof Fragment) || (obj instanceof e)) {
                return obj;
            }
            if (obj instanceof Widget) {
                return ((Widget) obj).j().b();
            }
            if (obj instanceof JediViewHolder) {
                obj = ((JediViewHolder) obj).k();
            } else {
                throw new IllegalStateException();
            }
        }
        return obj;
    }

    public static final e b(Object obj) {
        while (true) {
            l.c(obj, "");
            if (obj instanceof Fragment) {
                e requireActivity = ((Fragment) obj).requireActivity();
                l.a((Object) requireActivity, "");
                return requireActivity;
            } else if (obj instanceof e) {
                return (e) obj;
            } else {
                if (obj instanceof Widget) {
                    obj = ((Widget) obj).j().b();
                } else if (obj instanceof JediViewHolder) {
                    obj = ((JediViewHolder) obj).k();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
