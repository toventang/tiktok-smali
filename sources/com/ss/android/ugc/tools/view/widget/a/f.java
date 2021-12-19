package com.ss.android.ugc.tools.view.widget.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;

public abstract class f extends e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f150349a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.a<RecyclerView.ViewHolder> f150350b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f150351c;

    static {
        Covode.recordClassIndex(98895);
    }

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    public abstract void a(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f150350b.getItemCount() + a();
    }

    public final int a() {
        int itemCount = this.f150350b.getItemCount();
        if ((!this.f150351c || itemCount != 0) && this.f150349a) {
            return 1;
        }
        return 0;
    }

    private f(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        l.d(aVar, "");
        this.f150350b = aVar;
        this.f150351c = true;
        aVar.registerAdapterDataObserver(new RecyclerView.c(this) {
            /* class com.ss.android.ugc.tools.view.widget.a.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f150352a;

            static {
                Covode.recordClassIndex(98896);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                this.f150352a.notifyDataSetChanged();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f150352a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                f fVar = this.f150352a;
                fVar.notifyItemRangeChanged(i2 + fVar.a(), i3);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                f fVar = this.f150352a;
                fVar.notifyItemRangeInserted(i2 + fVar.a(), i3);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                f fVar = this.f150352a;
                fVar.notifyItemRangeRemoved(i2 + fVar.a(), i3);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                f fVar = this.f150352a;
                fVar.notifyItemMoved(i2 + fVar.a(), i3 + this.f150352a.a());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, Object obj) {
                f fVar = this.f150352a;
                fVar.notifyItemRangeChanged(i2 + fVar.a(), i3, obj);
            }
        });
        this.f150349a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (!this.f150349a || i2 != 0) {
            return this.f150350b.getItemViewType(i2 - a());
        }
        return -2147483646;
    }

    public /* synthetic */ f(RecyclerView.a aVar, byte b2) {
        this(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (getItemViewType(i2) == -2147483646) {
            a(viewHolder);
        } else {
            this.f150350b.onBindViewHolder(viewHolder, i2 - a());
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.a.e
    public final int a(int i2, GridLayoutManager gridLayoutManager) {
        l.d(gridLayoutManager, "");
        if (getItemViewType(i2) == -2147483646) {
            return gridLayoutManager.f3760b;
        }
        RecyclerView.a<RecyclerView.ViewHolder> aVar = this.f150350b;
        if (aVar instanceof e) {
            return ((e) aVar).a(i2 - a(), gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (getItemViewType(i2) == -2147483646) {
            onBindViewHolder(viewHolder, i2);
        } else {
            this.f150350b.onBindViewHolder(viewHolder, i2 - a(), list);
        }
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        l.d(viewGroup, "");
        if (-2147483646 == i2) {
            viewHolder = fVar.a(viewGroup);
        } else {
            viewHolder = fVar.f150350b.onCreateViewHolder(viewGroup, i2);
            l.b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
