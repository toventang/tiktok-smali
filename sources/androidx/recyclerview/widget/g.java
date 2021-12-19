package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

public final class g extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private final h f4025a;

    static {
        Covode.recordClassIndex(1566);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4026c = new a(true, b.NO_STABLE_IDS);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4027a;

        /* renamed from: b  reason: collision with root package name */
        public final b f4028b;

        /* renamed from: androidx.recyclerview.widget.g$a$a  reason: collision with other inner class name */
        public static final class C0060a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f4029a = a.f4026c.f4027a;

            /* renamed from: b  reason: collision with root package name */
            public b f4030b = a.f4026c.f4028b;

            static {
                Covode.recordClassIndex(1568);
            }

            public final a a() {
                return new a(this.f4029a, this.f4030b);
            }
        }

        static {
            Covode.recordClassIndex(1567);
        }

        public enum b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

            static {
                Covode.recordClassIndex(1569);
            }
        }

        a(boolean z, b bVar) {
            this.f4027a = z;
            this.f4028b = bVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2 = 0;
        for (v vVar : this.f4025a.f4035d) {
            i2 += vVar.f4214e;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.a.EnumC0056a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    public final boolean a(RecyclerView.a<? extends RecyclerView.ViewHolder> aVar) {
        return this.f4025a.a((RecyclerView.a<RecyclerView.ViewHolder>) aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setStateRestorationPolicy(RecyclerView.a.EnumC0056a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public g(RecyclerView.a<? extends RecyclerView.ViewHolder>... aVarArr) {
        this(a.f4026c, aVarArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.f4025a.a(viewHolder).f4212c.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f4025a.a(viewHolder).f4212c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        h hVar = this.f4025a;
        h.a a2 = hVar.a(i2);
        v vVar = a2.f4040a;
        long a3 = vVar.f4211b.a(vVar.f4212c.getItemId(a2.f4041b));
        hVar.a(a2);
        return a3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        h hVar = this.f4025a;
        h.a a2 = hVar.a(i2);
        v vVar = a2.f4040a;
        int a3 = vVar.f4210a.a(vVar.f4212c.getItemViewType(a2.f4041b));
        hVar.a(a2);
        return a3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        h hVar = this.f4025a;
        for (WeakReference<RecyclerView> weakReference : hVar.f4033b) {
            if (weakReference.get() == recyclerView) {
                return;
            }
        }
        hVar.f4033b.add(new WeakReference<>(recyclerView));
        for (v vVar : hVar.f4035d) {
            vVar.f4212c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        h hVar = this.f4025a;
        v vVar = hVar.f4034c.get(viewHolder);
        if (vVar != null) {
            boolean onFailedToRecycleView = vVar.f4212c.onFailedToRecycleView(viewHolder);
            hVar.f4034c.remove(viewHolder);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        h hVar = this.f4025a;
        v vVar = hVar.f4034c.get(viewHolder);
        if (vVar != null) {
            vVar.f4212c.onViewRecycled(viewHolder);
            hVar.f4034c.remove(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        h hVar = this.f4025a;
        int size = hVar.f4033b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = hVar.f4033b.get(size);
            if (weakReference.get() == null) {
                hVar.f4033b.remove(size);
            } else if (weakReference.get() == recyclerView) {
                hVar.f4033b.remove(size);
                break;
            }
            size--;
        }
        for (v vVar : hVar.f4035d) {
            vVar.f4212c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    private g(a aVar, RecyclerView.a<? extends RecyclerView.ViewHolder>... aVarArr) {
        this(aVar, Arrays.asList(aVarArr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        h hVar = this.f4025a;
        h.a a2 = hVar.a(i2);
        hVar.f4034c.put(viewHolder, a2.f4040a);
        v vVar = a2.f4040a;
        vVar.f4212c.bindViewHolder(viewHolder, a2.f4041b);
        hVar.a(a2);
    }

    public g(a aVar, List<? extends RecyclerView.a<? extends RecyclerView.ViewHolder>> list) {
        this.f4025a = new h(this, aVar);
        for (RecyclerView.a<? extends RecyclerView.ViewHolder> aVar2 : list) {
            a(aVar2);
        }
        super.setHasStableIds(this.f4025a.c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int findRelativeAdapterPositionIn(RecyclerView.a<? extends RecyclerView.ViewHolder> aVar, RecyclerView.ViewHolder viewHolder, int i2) {
        h hVar = this.f4025a;
        v vVar = hVar.f4034c.get(viewHolder);
        if (vVar == null) {
            return -1;
        }
        int a2 = i2 - hVar.a(vVar);
        int itemCount = vVar.f4212c.getItemCount();
        if (a2 >= 0 && a2 < itemCount) {
            return vVar.f4212c.findRelativeAdapterPositionIn(aVar, viewHolder, a2);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + a2 + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + aVar);
    }

    private static RecyclerView.ViewHolder a(g gVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        v a3 = gVar.f4025a.f4032a.a(i2);
        RecyclerView.ViewHolder onCreateViewHolder = a3.f4212c.onCreateViewHolder(viewGroup, a3.f4210a.b(i2));
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
        return onCreateViewHolder;
    }
}
