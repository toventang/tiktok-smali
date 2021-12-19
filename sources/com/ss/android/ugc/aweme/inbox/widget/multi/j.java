package com.ss.android.ugc.aweme.inbox.widget.multi;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.a.c;
import com.ss.android.ugc.aweme.inbox.widget.multi.a.d;
import com.ss.android.ugc.aweme.inbox.widget.multi.a.e;
import com.ss.android.ugc.aweme.inbox.widget.multi.a.f;
import com.ss.android.ugc.aweme.inbox.widget.multi.a.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class j extends t<k, RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<b> f104490b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f104491c;

    /* renamed from: d  reason: collision with root package name */
    private final h f104492d;

    static {
        Covode.recordClassIndex(66906);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    static final class a extends m implements h.f.a.a<MultiViewModel> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(66907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MultiViewModel invoke() {
            return MultiViewModel.a.a(this.this$0.f104491c);
        }
    }

    public /* synthetic */ j(Fragment fragment) {
        this(fragment, new l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) ((k) a(i2)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return ((k) a(i2)).f104493j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (viewHolder instanceof f) {
            ((f) viewHolder).bJ_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        if (viewHolder instanceof f) {
            ((f) viewHolder).b();
        }
    }

    private static View a(int i2, ViewGroup viewGroup) {
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Fragment fragment, l lVar) {
        super(lVar);
        l.d(fragment, "");
        l.d(lVar, "");
        this.f104491c = fragment;
        setHasStableIds(true);
        this.f104492d = i.a((h.f.a.a) new a(this));
        this.f104490b = new SparseArray<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        Object obj = null;
        if (!(viewHolder instanceof f)) {
            viewHolder = null;
        }
        f fVar = (f) viewHolder;
        if (fVar != null) {
            Object a2 = a(i2);
            l.b(a2, "");
            l.d(a2, "");
            if (a2 instanceof k) {
                obj = a2;
            }
            k kVar = (k) obj;
            if (kVar != null) {
                fVar.f104437g = (T) ((k) a2);
                fVar.a(kVar);
                return;
            }
            View view = fVar.itemView;
            l.b(view, "");
            view.setVisibility(8);
            com.ss.android.ugc.aweme.common.f.c("MultiBaseVH", "MultiBaseVH innerOnBind data type is not match!");
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        f aVar;
        MethodCollector.i(1652);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 0) {
            aVar = new com.ss.android.ugc.aweme.inbox.widget.multi.a.a(a((int) R.layout.k8, viewGroup));
        } else if (i2 == 1) {
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup.getContext();
            l.b(context, "");
            aVar = new c(b2.a(context));
        } else if (i2 == 2) {
            aVar = new e(a((int) R.layout.kk, viewGroup), jVar.f104491c);
        } else if (i2 != 13) {
            aVar = new g(a((int) R.layout.la, viewGroup));
        } else {
            aVar = new d(a((int) R.layout.k6, viewGroup));
        }
        MultiViewModel multiViewModel = (MultiViewModel) jVar.f104492d.getValue();
        l.d(multiViewModel, "");
        aVar.f104438h = multiViewModel;
        Fragment fragment = jVar.f104491c;
        l.d(fragment, "");
        aVar.f104439i = fragment;
        b bVar = jVar.f104490b.get(i2);
        if (bVar != null) {
            aVar.a(bVar);
        }
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(1652);
        return aVar;
    }
}
