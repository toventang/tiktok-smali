package com.airbnb.epoxy;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<PoolReference> f4966a = new ArrayList<>(5);

    static {
        Covode.recordClassIndex(2083);
    }

    static i a(Context context) {
        while (!(context instanceof m)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            l.a((Object) context, "");
        }
        return ((m) context).getLifecycle();
    }
}
