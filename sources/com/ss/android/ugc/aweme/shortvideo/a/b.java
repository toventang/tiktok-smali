package com.ss.android.ugc.aweme.shortvideo.a;

import android.view.ViewGroup;
import androidx.c.h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final List<Object> f124793c = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    protected h<a<T>> f124794a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public a<T> f124795b;

    static {
        Covode.recordClassIndex(82001);
    }

    public final void b() {
        if (this.f124794a != null) {
            for (int i2 = 0; i2 < this.f124794a.b(); i2++) {
                if (this.f124794a.d(i2) != null) {
                    this.f124794a.d(i2);
                }
            }
        }
    }

    public final void a() {
        if (this.f124794a != null) {
            for (int i2 = 0; i2 < this.f124794a.b(); i2++) {
                if (this.f124794a.d(i2) != null) {
                    this.f124794a.d(i2);
                }
            }
        }
    }

    private a<T> a(int i2) {
        return this.f124794a.a(i2, this.f124795b);
    }

    public final b<T> a(a<T> aVar) {
        int b2 = this.f124794a.b();
        while (this.f124794a.a(b2, null) != null) {
            b2++;
            if (b2 == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        if (b2 == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f124794a.a(b2) == null) {
            this.f124794a.b(b2, aVar);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + b2 + ". Already registered AdapterDelegate is " + this.f124794a.a(b2));
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        a<T> a2 = a(i2);
        if (a2 != null) {
            return a2.a(viewGroup);
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType ".concat(String.valueOf(i2)));
    }

    public final int a(T t, int i2) {
        Objects.requireNonNull(t, "Items datasource is null!");
        int b2 = this.f124794a.b();
        for (int i3 = 0; i3 < b2; i3++) {
            if (this.f124794a.d(i3).a(t, i2)) {
                return this.f124794a.c(i3);
            }
        }
        if (this.f124795b != null) {
            return 2147483646;
        }
        throw new NullPointerException("No AdapterDelegate added that matches position=" + i2 + " delegates=" + this.f124794a + " items=" + ((Object) t));
    }

    public final void a(T t, int i2, RecyclerView.ViewHolder viewHolder) {
        List<Object> list = f124793c;
        a<T> a2 = a(viewHolder.getItemViewType());
        if (a2 != null) {
            a2.a(t, i2, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i2 + " for viewType = " + viewHolder.getItemViewType());
    }
}
