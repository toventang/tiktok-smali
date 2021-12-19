package com.bytedance.nita.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41667a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(25496);
    }

    @Override // com.bytedance.nita.f.b
    public final View a(Context context, ViewGroup viewGroup, int i2) {
        l.c(context, "");
        l.c(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(context), i2, viewGroup, false);
        l.a((Object) a2, "");
        return a2;
    }
}
