package com.bytedance.jedi.ext.adapter.internal;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39750a = {new y(ab.a(h.class), "trashStation", "getTrashStation()Landroid/util/SparseArray;")};

    /* renamed from: b  reason: collision with root package name */
    private final h.h f39751b = h.i.a((h.f.a.a) a.f39752a);

    public final SparseArray<List<RecyclerView.ViewHolder>> a() {
        return (SparseArray) this.f39751b.getValue();
    }

    static final class a extends m implements h.f.a.a<SparseArray<List<RecyclerView.ViewHolder>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39752a = new a();

        static {
            Covode.recordClassIndex(24487);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SparseArray<List<RecyclerView.ViewHolder>> invoke() {
            return new SparseArray();
        }
    }

    static {
        Covode.recordClassIndex(24486);
    }
}
