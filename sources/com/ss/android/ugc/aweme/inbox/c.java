package com.ss.android.ugc.aweme.inbox;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import f.a.b.b;
import f.a.d.f;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final g f104081a;

    /* renamed from: b  reason: collision with root package name */
    private final a f104082b;

    public static final class a extends RecyclerView.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f104083d = new a();

        /* renamed from: e  reason: collision with root package name */
        public static final C2649a f104084e = new C2649a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public a f104085a = f104083d;

        /* renamed from: b  reason: collision with root package name */
        final f.a.b.a f104086b;

        /* renamed from: c  reason: collision with root package name */
        public final c f104087c;

        /* renamed from: f  reason: collision with root package name */
        private f.a.l.c<a> f104088f;

        /* renamed from: com.ss.android.ugc.aweme.inbox.c$a$a  reason: collision with other inner class name */
        public static final class C2649a {
            static {
                Covode.recordClassIndex(66657);
            }

            private C2649a() {
            }

            public /* synthetic */ C2649a(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(66655);
        }

        public a(c cVar) {
            l.d(cVar, "");
            this.f104087c = cVar;
            f.a.l.c<a> cVar2 = new f.a.l.c<>();
            l.b(cVar2, "");
            this.f104088f = cVar2;
            f.a.b.a aVar = new f.a.b.a();
            this.f104086b = aVar;
            b d2 = this.f104088f.d(500, TimeUnit.MILLISECONDS).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
                /* class com.ss.android.ugc.aweme.inbox.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f104090a;

                static {
                    Covode.recordClassIndex(66656);
                }

                {
                    this.f104090a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    a aVar = (a) obj;
                    if (!l.a(aVar, a.f104083d)) {
                        if (aVar.f104009a == b.CHANGE) {
                            this.f104090a.f104087c.notifyItemRangeChanged(aVar.f104010b, aVar.f104011c);
                        } else {
                            this.f104090a.f104087c.notifyItemRangeInserted(aVar.f104010b, aVar.f104011c);
                        }
                        this.f104090a.f104085a = a.f104083d;
                    }
                }
            });
            l.b(d2, "");
            f.a.j.a.a(d2, aVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            this.f104087c.notifyItemRangeRemoved(i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3) {
            a aVar = this.f104085a;
            int min = Math.min(i2, aVar.f104010b);
            a a2 = a.a(b.CHANGE, min, Math.max(aVar.f104010b + aVar.f104011c, i2 + i3) - min);
            this.f104085a = a2;
            this.f104088f.onNext(a2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            b bVar;
            a aVar = this.f104085a;
            int min = Math.min(i2, aVar.f104010b);
            int max = Math.max(aVar.f104010b + aVar.f104011c, i2 + i3);
            if (aVar.f104009a == b.CHANGE) {
                bVar = b.CHANGE;
            } else {
                bVar = b.INSERT;
            }
            a a2 = a.a(bVar, min, max - min);
            this.f104085a = a2;
            this.f104088f.onNext(a2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            super.a(i2, i3, i4);
            this.f104087c.notifyItemMoved(i2, i3);
        }
    }

    static {
        Covode.recordClassIndex(66654);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f104081a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return this.f104081a.getItemId(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f104081a.getItemViewType(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setHasStableIds(boolean z) {
        this.f104081a.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f104081a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        return this.f104081a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f104081a.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f104081a.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        this.f104081a.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void registerAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        this.f104081a.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(RecyclerView.c cVar) {
        l.d(cVar, "");
        this.f104081a.unregisterAdapterDataObserver(cVar);
    }

    public c(g gVar) {
        l.d(gVar, "");
        this.f104081a = gVar;
        a aVar = new a(this);
        this.f104082b = aVar;
        gVar.registerAdapterDataObserver(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        this.f104081a.onDetachedFromRecyclerView(recyclerView);
        this.f104082b.f104086b.dispose();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        this.f104081a.onBindViewHolder(viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        this.f104081a.onBindViewHolder(viewHolder, i2, list);
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1498);
        l.d(viewGroup, "");
        RecyclerView.ViewHolder onCreateViewHolder = cVar.f104081a.onCreateViewHolder(viewGroup, i2);
        l.b(onCreateViewHolder, "");
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
        MethodCollector.o(1498);
        return onCreateViewHolder;
    }
}
