package com.ss.android.ugc.aweme.compliance.privacy.settings.account.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class b extends RecyclerView.a<h> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<c.a> f77464a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Class<? extends c>, Integer> f77465b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<c> f77466c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final Context f77467d;

    /* renamed from: e  reason: collision with root package name */
    private int f77468e;

    static {
        Covode.recordClassIndex(47920);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ h onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f77466c.size();
    }

    public final void a() {
        int size = this.f77466c.size();
        for (int i2 = 0; i2 < size; i2++) {
            notifyItemChanged(i2, null);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewAttachedToWindow(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        super.onViewAttachedToWindow(hVar2);
    }

    public b(Context context) {
        l.d(context, "");
        this.f77467d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        c cVar = this.f77466c.get(i2);
        l.b(cVar, "");
        return b(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewDetachedFromWindow(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        super.onViewDetachedFromWindow(hVar2);
        if (hVar2 instanceof g) {
            ((g) hVar2).a();
        }
    }

    private int b(c cVar) {
        l.d(cVar, "");
        Class<?> cls = cVar.getClass();
        if (!this.f77465b.containsKey(cls)) {
            this.f77465b.put(cls, Integer.valueOf(this.f77468e));
            this.f77468e++;
        }
        Integer num = this.f77465b.get(cls);
        if (num == null) {
            l.b();
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        l.d(cVar, "");
        this.f77466c.add(cVar);
        if (this.f77464a.get(b(cVar)) == null) {
            this.f77464a.put(b(cVar), cVar.a());
        }
    }

    public static /* synthetic */ void a(b bVar, c cVar) {
        l.d(cVar, "");
        int indexOf = bVar.f77466c.indexOf(cVar);
        if (indexOf >= 0 && indexOf < bVar.f77466c.size()) {
            bVar.notifyItemChanged(indexOf, null);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(h hVar, int i2) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        this.f77466c.get(i2).a(hVar2, i2);
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        l.d(viewGroup, "");
        h a3 = bVar.f77464a.get(i2).a(bVar.f77467d, viewGroup);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        return a3;
    }
}
