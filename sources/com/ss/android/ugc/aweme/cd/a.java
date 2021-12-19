package com.ss.android.ugc.aweme.cd;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public abstract class a<PARAM_TYPE, SUB> {

    /* renamed from: b  reason: collision with root package name */
    protected WeakHashMap<View, WeakReference<PARAM_TYPE>> f69809b = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(43039);
    }

    public final void a(View view) {
        this.f69809b.remove(view);
    }

    private PARAM_TYPE c(View view) {
        WeakReference<PARAM_TYPE> weakReference = this.f69809b.get(view);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final PARAM_TYPE b(View view) {
        PARAM_TYPE c2 = c(view);
        int i2 = 0;
        while (view.getId() != 16908290) {
            if (i2 <= 30) {
                c2 = c(view);
                if (c2 != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                i2++;
            } else {
                return null;
            }
        }
        return c2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.cd.a<PARAM_TYPE, SUB> */
    /* JADX WARN: Multi-variable type inference failed */
    public final SUB a(View view, PARAM_TYPE param_type) {
        this.f69809b.put(view, new WeakReference<>(param_type));
        return this;
    }
}
