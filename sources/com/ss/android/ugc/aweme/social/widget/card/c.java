package com.ss.android.ugc.aweme.social.widget.card;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class c extends RecyclerView.c {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<RecyclerView> f133769a;

    /* renamed from: b  reason: collision with root package name */
    private final b f133770b;

    static {
        Covode.recordClassIndex(87503);
    }

    public static final class b extends i {
        static {
            Covode.recordClassIndex(87505);
        }

        b() {
        }

        @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
        public final boolean a(RecyclerView.ViewHolder viewHolder) {
            this.f3832k = 250;
            return super.a(viewHolder);
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f133771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f133772b;

        static {
            Covode.recordClassIndex(87504);
        }

        a(RecyclerView recyclerView, int i2) {
            this.f133771a = recyclerView;
            this.f133772b = i2;
        }

        public final void run() {
            RecyclerView recyclerView = this.f133771a;
            l.b(recyclerView, "");
            RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f3832k = 0;
            }
            this.f133771a.b(this.f133772b);
        }
    }

    public c(WeakReference<RecyclerView> weakReference) {
        l.d(weakReference, "");
        this.f133769a = weakReference;
        b bVar = new b();
        this.f133770b = bVar;
        RecyclerView recyclerView = weakReference.get();
        if (recyclerView != null) {
            recyclerView.setItemAnimator(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c
    public final void b(int i2, int i3) {
        super.b(i2, i3);
        RecyclerView recyclerView = this.f133769a.get();
        if (recyclerView != null) {
            recyclerView.post(new a(recyclerView, i2));
        }
    }
}
