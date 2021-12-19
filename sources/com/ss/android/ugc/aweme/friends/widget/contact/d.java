package com.ss.android.ugc.aweme.friends.widget.contact;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.friends.widget.contact.a.a;
import com.ss.android.ugc.aweme.friends.widget.contact.a.c;
import com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class d extends t<a, a<?>> {

    /* renamed from: b  reason: collision with root package name */
    b<? super RecyclerView, z> f97321b;

    /* renamed from: c  reason: collision with root package name */
    b<? super RecyclerView, z> f97322c;

    /* renamed from: d  reason: collision with root package name */
    public u<Boolean> f97323d;

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<com.ss.android.ugc.aweme.inbox.widget.b> f97324e;

    /* renamed from: f  reason: collision with root package name */
    private final Fragment f97325f;

    /* renamed from: g  reason: collision with root package name */
    private final ContactVM f97326g;

    static {
        Covode.recordClassIndex(61829);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return ((a) a(i2)).f97312a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        b<? super RecyclerView, z> bVar = this.f97321b;
        if (bVar != null) {
            bVar.invoke(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        b<? super RecyclerView, z> bVar = this.f97322c;
        if (bVar != null) {
            bVar.invoke(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        a aVar = (a) viewHolder;
        l.d(aVar, "");
        aVar.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        a aVar = (a) viewHolder;
        l.d(aVar, "");
        aVar.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        int hashCode;
        a aVar = (a) a(i2);
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            String socialName = eVar.f97327b.getSocialName();
            if (socialName != null) {
                hashCode = socialName.hashCode();
            } else {
                hashCode = eVar.f97327b.hashCode();
            }
        } else {
            hashCode = aVar.hashCode();
        }
        return (long) hashCode;
    }

    public /* synthetic */ d(Fragment fragment, ContactVM contactVM) {
        this(fragment, contactVM, new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Object obj;
        a aVar = (a) viewHolder;
        l.d(aVar, "");
        Object a2 = a(i2);
        l.b(a2, "");
        l.d(a2, "");
        if (!(a2 instanceof a)) {
            obj = null;
        } else {
            obj = a2;
        }
        a aVar2 = (a) obj;
        if (aVar2 != null) {
            aVar.f97315c = i2;
            aVar.f97314b = (T) ((a) a2);
            aVar.a(aVar2);
            return;
        }
        View view = aVar.itemView;
        l.b(view, "");
        view.setVisibility(8);
        f.c("ContactBaseVH", "MultiBaseVH innerOnBind data type is not match!");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Fragment fragment, ContactVM contactVM, b bVar) {
        super(bVar);
        l.d(fragment, "");
        l.d(contactVM, "");
        l.d(bVar, "");
        this.f97325f = fragment;
        this.f97326g = contactVM;
        this.f97324e = new SparseArray<>();
        setHasStableIds(true);
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        a cVar;
        MethodCollector.i(11518);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 1) {
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            e requireActivity = dVar.f97325f.requireActivity();
            l.b(requireActivity, "");
            com.ss.android.ugc.aweme.friends.invite.a b2 = aVar.b((Context) requireActivity);
            b2.a(dVar.f97325f);
            u<Boolean> uVar = dVar.f97323d;
            if (uVar != null) {
                b2.getOnLoading().observe(dVar.f97325f, uVar);
            }
            cVar = new c(b2);
        } else if (i2 != 2) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2q, viewGroup, false);
            l.b(a2, "");
            cVar = new com.ss.android.ugc.aweme.friends.widget.contact.a.d(a2);
        } else {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2h, viewGroup, false);
            l.b(a3, "");
            cVar = new com.ss.android.ugc.aweme.friends.widget.contact.a.b(a3);
        }
        ContactVM contactVM = dVar.f97326g;
        l.d(contactVM, "");
        cVar.f97313a = contactVM;
        com.ss.android.ugc.aweme.inbox.widget.b bVar = dVar.f97324e.get(i2);
        if (bVar != null) {
            cVar.a(bVar);
        }
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(11518);
        return cVar;
    }
}
