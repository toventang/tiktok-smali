package com.ss.android.ugc.aweme.common.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class f<T> extends h {
    static final String n = f.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    public List<T> f76354l;

    /* renamed from: m  reason: collision with root package name */
    protected int f76355m;

    public List<T> e() {
        return this.f76354l;
    }

    public f() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(47123);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public int c() {
        List<T> list = this.f76354l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void f() {
        List<T> list = this.f76354l;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    public void b_(List<T> list) {
        this.f76354l = list;
        notifyDataSetChanged();
    }

    public f(byte b2) {
        registerAdapterDataObserver(new RecyclerView.c() {
            /* class com.ss.android.ugc.aweme.common.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(47124);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                f fVar = f.this;
                fVar.f76355m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                f fVar = f.this;
                fVar.f76355m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                f fVar = f.this;
                fVar.f76355m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                f fVar = f.this;
                fVar.f76355m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                f fVar = f.this;
                fVar.f76355m = fVar.getItemCount();
            }
        });
    }

    public final void d(List<T> list) {
        this.f76354l = list;
        notifyItemRangeInserted(0, getItemCount() - this.f76355m);
    }

    public void a(T t) {
        if (this.f76354l == null) {
            this.f76354l = new ArrayList();
        }
        this.f76354l.add(0, t);
        notifyItemInserted(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void b(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f76355m = getItemCount();
    }

    public void c(List<T> list) {
        if (!b.a((Collection) list)) {
            if (this.f76354l == null) {
                this.f76354l = new ArrayList();
            }
            this.f76354l.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void b(List<T> list) {
        this.f76354l = list;
        if (this.v) {
            notifyItemRangeInserted(this.f76355m - 1, getItemCount() - this.f76355m);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f76355m, getItemCount() - this.f76355m);
    }
}
