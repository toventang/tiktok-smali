package com.bytedance.helios.sdk;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends CopyOnWriteArrayList<c> {
    static {
        Covode.recordClassIndex(17893);
    }

    public final c last() {
        if (!isEmpty()) {
            return (c) get(size() - 1);
        }
        return null;
    }

    private boolean a(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((c) it.next()).f30800a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof c) {
            return super.contains(obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (obj instanceof Activity) {
            return a(obj.toString());
        }
        return false;
    }

    public final void remove(Activity activity) {
        for (int size = size() - 1; size >= 0; size--) {
            if (TextUtils.equals(activity.toString(), ((c) get(size)).f30800a)) {
                remove(size);
                return;
            }
        }
    }

    public final void add(Activity activity, i.a aVar) {
        String obj = activity.toString();
        Iterator it = iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (TextUtils.equals(obj, cVar.f30800a)) {
                if (aVar == i.a.ON_CREATE || aVar == i.a.ON_START || aVar == i.a.ON_RESUME) {
                    remove(cVar);
                    cVar.f30801b = aVar;
                    add(cVar);
                    return;
                }
                cVar.f30801b = aVar;
                return;
            }
        }
        add(new c(activity, aVar));
        if (size() > 10) {
            remove(0);
        }
    }
}
