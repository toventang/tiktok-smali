package com.ss.android.ugc.aweme.search.l;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<RecyclerView.ViewHolder> f121396a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public int f121397b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f121398c;

    static {
        Covode.recordClassIndex(79094);
    }

    public abstract RecyclerView.ViewHolder a();

    public final RecyclerView.ViewHolder b() {
        return this.f121396a.poll();
    }

    public h(Handler handler) {
        this.f121398c = handler;
    }

    public final void a(final int i2) {
        if (this.f121397b < i2) {
            this.f121398c.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.search.l.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79095);
                }

                public final void run() {
                    AtomicInteger atomicInteger;
                    int i2 = 0;
                    i2 = 1;
                    try {
                        if (atomicInteger.compareAndSet(i2, i2)) {
                            int i3 = i2 - h.this.f121397b;
                            for (int i4 = 0; i4 < i3 && i.f121401f.get() != 2; i4++) {
                                if (i.f121401f.get() == i2) {
                                    h.this.f121396a.offer(h.this.a());
                                    h.this.f121397b += i2;
                                }
                            }
                        }
                        i.f121401f.compareAndSet(i2, i2);
                    } finally {
                        i.f121401f.compareAndSet(i2, i2);
                    }
                }
            });
        }
    }
}
