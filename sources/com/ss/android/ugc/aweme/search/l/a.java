package com.ss.android.ugc.aweme.search.l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.d.d;
import h.f.b.l;

public final class a extends LayoutInflater {
    static {
        Covode.recordClassIndex(79064);
    }

    public a(Context context) {
        super(context);
    }

    public final LayoutInflater cloneInContext(Context context) {
        return LayoutInflater.from(getContext()).cloneInContext(context);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i2, ViewGroup viewGroup, boolean z) {
        Context context = getContext();
        l.d(context, "");
        if (n.a(context) != null) {
            d a2 = n.a(context);
            if (a2 == null) {
                l.b();
            }
            View a3 = a2.getInflater().a(i2);
            if (a3 != null) {
                return a3;
            }
        }
        return com.a.a(LayoutInflater.from(context), i2, viewGroup, z);
    }
}
