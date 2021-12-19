package com.ss.android.ugc.aweme.compliance.privacy.b.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.privacy.b.a.b;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private final b f77331a;

    static {
        Covode.recordClassIndex(47832);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.a$a  reason: collision with other inner class name */
    public static final class C1781a {

        /* renamed from: c  reason: collision with root package name */
        public static final C1781a f77332c = new C1781a(EnumC1782a.NO_STABLE_IDS);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f77333a = true;

        /* renamed from: b  reason: collision with root package name */
        public final EnumC1782a f77334b;

        static {
            Covode.recordClassIndex(47833);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.a$a$a  reason: collision with other inner class name */
        public enum EnumC1782a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

            static {
                Covode.recordClassIndex(47834);
            }
        }

        private C1781a(EnumC1782a aVar) {
            this.f77334b = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2 = 0;
        for (c cVar : this.f77331a.f77340e) {
            i2 += cVar.f77351e;
        }
        return i2;
    }

    public a(List<? extends RecyclerView.a<? extends RecyclerView.ViewHolder>> list) {
        this(C1781a.f77332c, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.f77331a.a(viewHolder).f77349c.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f77331a.a(viewHolder).f77349c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        b bVar = this.f77331a;
        b.a a2 = bVar.a(i2);
        c cVar = a2.f77344a;
        long a3 = cVar.f77348b.a(cVar.f77349c.getItemId(a2.f77345b));
        bVar.a(a2);
        return a3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        b bVar = this.f77331a;
        b.a a2 = bVar.a(i2);
        c cVar = a2.f77344a;
        int a3 = cVar.f77347a.a(cVar.f77349c.getItemViewType(a2.f77345b));
        bVar.a(a2);
        return a3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f77331a;
        for (WeakReference<RecyclerView> weakReference : bVar.f77338c) {
            if (weakReference.get() == recyclerView) {
                return;
            }
        }
        bVar.f77338c.add(new WeakReference<>(recyclerView));
        for (c cVar : bVar.f77340e) {
            cVar.f77349c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        b bVar = this.f77331a;
        c remove = bVar.f77339d.remove(viewHolder);
        if (remove != null) {
            return remove.f77349c.onFailedToRecycleView(viewHolder);
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        b bVar = this.f77331a;
        c remove = bVar.f77339d.remove(viewHolder);
        if (remove != null) {
            remove.f77349c.onViewRecycled(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f77331a;
        int size = bVar.f77338c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = bVar.f77338c.get(size);
            if (weakReference.get() == null) {
                bVar.f77338c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                bVar.f77338c.remove(size);
                break;
            }
            size--;
        }
        for (c cVar : bVar.f77340e) {
            cVar.f77349c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        b bVar = this.f77331a;
        b.a a2 = bVar.a(i2);
        bVar.f77339d.put(viewHolder, a2.f77344a);
        c cVar = a2.f77344a;
        cVar.f77349c.onBindViewHolder(viewHolder, a2.f77345b);
        bVar.a(a2);
    }

    private a(C1781a aVar, List<? extends RecyclerView.a<? extends RecyclerView.ViewHolder>> list) {
        this.f77331a = new b(this, aVar);
        Iterator<? extends RecyclerView.a<? extends RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            RecyclerView.a<RecyclerView.ViewHolder> aVar2 = (RecyclerView.a) it.next();
            b bVar = this.f77331a;
            int size = bVar.f77340e.size();
            if (size < 0 || size > bVar.f77340e.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + bVar.f77340e.size() + ". Given:" + size);
            } else if (!bVar.b() || aVar2.mHasStableIds) {
                int a2 = bVar.a(aVar2);
                if (a2 == -1 || bVar.f77340e.get(a2) == null) {
                    c cVar = new c(aVar2, bVar, bVar.f77337b, bVar.f77341f.a());
                    bVar.f77340e.add(size, cVar);
                    for (WeakReference<RecyclerView> weakReference : bVar.f77338c) {
                        RecyclerView recyclerView = weakReference.get();
                        if (recyclerView != null) {
                            aVar2.onAttachedToRecyclerView(recyclerView);
                        }
                    }
                    if (cVar.f77351e > 0) {
                        bVar.f77336a.notifyItemRangeInserted(bVar.a(cVar), cVar.f77351e);
                    }
                }
            } else {
                throw new IllegalArgumentException("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            }
        }
        super.setHasStableIds(this.f77331a.b());
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5776);
        c a3 = aVar.f77331a.f77337b.a(i2);
        RecyclerView.ViewHolder onCreateViewHolder = a3.f77349c.onCreateViewHolder(viewGroup, a3.f77347a.b(i2));
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(onCreateViewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(onCreateViewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = onCreateViewHolder.getClass().getName();
        MethodCollector.o(5776);
        return onCreateViewHolder;
    }
}
