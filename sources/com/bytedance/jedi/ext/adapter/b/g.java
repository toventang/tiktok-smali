package com.bytedance.jedi.ext.adapter.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.b.e;
import h.f.a.b;
import h.f.a.m;
import h.z;

public interface g<VH extends e<?>> {

    public static final class a {
        static {
            Covode.recordClassIndex(24452);
        }
    }

    static {
        Covode.recordClassIndex(24451);
    }

    g<VH> a(b<? super ViewGroup, ? extends VH> bVar);

    g<VH> a(b<? super Integer, Boolean> bVar, m<? super Integer, ? super RecyclerView, z> mVar, b<? super ViewGroup, ? extends VH> bVar2);
}
