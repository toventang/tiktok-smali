package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class d extends RecyclerView.a<u> {

    /* renamed from: a  reason: collision with root package name */
    public int f5032a = 1;

    /* renamed from: b  reason: collision with root package name */
    final e f5033b = new e();

    /* renamed from: c  reason: collision with root package name */
    ViewHolderState f5034c = new ViewHolderState();

    /* renamed from: d  reason: collision with root package name */
    public final GridLayoutManager.c f5035d;

    /* renamed from: e  reason: collision with root package name */
    private final am f5036e = new am();

    static {
        Covode.recordClassIndex(2122);
    }

    /* access modifiers changed from: package-private */
    public abstract List<? extends s<?>> a();

    public void a(View view) {
    }

    /* access modifiers changed from: protected */
    public void a(u uVar, s<?> sVar) {
    }

    /* access modifiers changed from: package-private */
    public void a(u uVar, s<?> sVar, int i2, s<?> sVar2) {
    }

    /* access modifiers changed from: protected */
    public void a(RuntimeException runtimeException) {
    }

    public void b(View view) {
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    public boolean b(int i2) {
        return false;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ u onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* access modifiers changed from: protected */
    public e c() {
        return this.f5033b;
    }

    public final boolean d() {
        if (this.f5032a > 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return a().size();
    }

    public d() {
        AnonymousClass1 r0 = new GridLayoutManager.c() {
            /* class com.airbnb.epoxy.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2123);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                try {
                    s<?> a2 = d.this.a(i2);
                    d.this.getItemCount();
                    return a2.g();
                } catch (IndexOutOfBoundsException e2) {
                    d.this.a(e2);
                    return 1;
                }
            }
        };
        this.f5035d = r0;
        setHasStableIds(true);
        r0.f3772c = true;
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(u uVar) {
        uVar.b();
        uVar.a();
    }

    public final s<?> a(int i2) {
        return (s) a().get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        return ((s) a().get(i2)).f5077a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        am amVar = this.f5036e;
        s<?> a2 = a(i2);
        amVar.f5011a = a2;
        return am.a(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ boolean onFailedToRecycleView(u uVar) {
        u uVar2 = uVar;
        return uVar2.b().c(uVar2.a());
    }

    /* access modifiers changed from: protected */
    public int a(s<?> sVar) {
        int size = a().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sVar == a().get(i2)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(u uVar) {
        uVar.b();
        uVar.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewRecycled(u uVar) {
        u uVar2 = uVar;
        uVar2.b();
        this.f5033b.f5038a.b(uVar2.getItemId());
        s<?> b2 = uVar2.b();
        uVar2.c();
        uVar2.f5103a.b(uVar2.a());
        uVar2.f5103a = null;
        uVar2.f5104b = null;
        a(uVar2, b2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(u uVar, int i2) {
        onBindViewHolder(uVar, i2, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(u uVar, int i2, List<Object> list) {
        s<?> a2 = a(i2);
        s<?> sVar = null;
        if (b()) {
            long itemId = getItemId(i2);
            if (!list.isEmpty()) {
                Iterator<Object> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j jVar = (j) it.next();
                    if (jVar.f5047a == null) {
                        s<?> a3 = jVar.f5048b.a(itemId, null);
                        if (a3 != null) {
                            sVar = a3;
                            break;
                        }
                    } else if (jVar.f5047a.f5077a == itemId) {
                        sVar = jVar.f5047a;
                        break;
                    }
                }
            }
        }
        uVar.a(a2, sVar, list, i2);
        if (list.isEmpty()) {
            uVar.b();
        }
        this.f5033b.f5038a.b(uVar.getItemId(), uVar);
        if (b()) {
            a(uVar, a2, i2, sVar);
        }
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        u uVar = new u(a.a(LayoutInflater.from(viewGroup.getContext()), dVar.f5036e.a(dVar, i2).c(), viewGroup, false));
        try {
            if (uVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(uVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) uVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(uVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = uVar.getClass().getName();
        return uVar;
    }
}
