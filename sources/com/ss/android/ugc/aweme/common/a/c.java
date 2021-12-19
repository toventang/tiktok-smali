package com.ss.android.ugc.aweme.common.a;

import android.view.ViewGroup;
import androidx.c.h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class c<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final List<Object> f76350c = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    protected h<b<T>> f76351a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public b<T> f76352b;

    static {
        Covode.recordClassIndex(47120);
    }

    public final void b() {
        if (this.f76351a != null) {
            for (int i2 = 0; i2 < this.f76351a.b(); i2++) {
                if (this.f76351a.d(i2) != null) {
                    this.f76351a.d(i2);
                }
            }
        }
    }

    public final void a() {
        if (this.f76351a != null) {
            for (int i2 = 0; i2 < this.f76351a.b(); i2++) {
                if (this.f76351a.d(i2) != null) {
                    this.f76351a.d(i2);
                }
            }
        }
    }

    private b<T> a(int i2) {
        return this.f76351a.a(i2, this.f76352b);
    }

    public final boolean b(RecyclerView.ViewHolder viewHolder) {
        if (a(viewHolder.getItemViewType()) != null) {
            return false;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        if (a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        if (a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    public final c<T> a(b<T> bVar) {
        int b2 = this.f76351a.b();
        while (this.f76351a.a(b2, null) != null) {
            b2++;
            if (b2 == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        Objects.requireNonNull(bVar, "AdapterDelegate is null!");
        if (b2 == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f76351a.a(b2) == null) {
            this.f76351a.b(b2, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + b2 + ". Already registered AdapterDelegate is " + this.f76351a.a(b2));
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        if (a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        b<T> a2 = a(i2);
        if (a2 != null) {
            return a2.a(viewGroup);
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType ".concat(String.valueOf(i2)));
    }

    public final int a(T t, int i2) {
        Objects.requireNonNull(t, "Items datasource is null!");
        int b2 = this.f76351a.b();
        for (int i3 = 0; i3 < b2; i3++) {
            if (this.f76351a.d(i3).a(t, i2)) {
                return this.f76351a.c(i3);
            }
        }
        if (this.f76352b != null) {
            return 2147483646;
        }
        throw new NullPointerException("No AdapterDelegate added that matches position=" + i2 + " delegates=" + this.f76351a + " items=" + ((Object) t));
    }

    public final void a(T t, int i2, RecyclerView.ViewHolder viewHolder) {
        a(t, i2, viewHolder, f76350c);
    }

    public final void a(T t, int i2, RecyclerView.ViewHolder viewHolder, List list) {
        b<T> a2 = a(viewHolder.getItemViewType());
        if (a2 != null) {
            if (list == null) {
                list = f76350c;
            }
            a2.a(t, i2, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i2 + " for viewType = " + viewHolder.getItemViewType());
    }
}
