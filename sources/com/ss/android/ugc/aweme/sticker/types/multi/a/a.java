package com.ss.android.ugc.aweme.sticker.types.multi.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.c;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> implements com.ss.android.ugc.aweme.sticker.panel.a.a {

    /* renamed from: a  reason: collision with root package name */
    public List<Effect> f136143a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public h f136144b;

    /* renamed from: c  reason: collision with root package name */
    public int f136145c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f136146d;

    /* renamed from: e  reason: collision with root package name */
    protected final g f136147e;

    /* renamed from: f  reason: collision with root package name */
    protected final o f136148f;

    /* renamed from: g  reason: collision with root package name */
    protected final b<Effect> f136149g;

    /* renamed from: h  reason: collision with root package name */
    protected final k f136150h;

    /* renamed from: i  reason: collision with root package name */
    private String f136151i;

    static {
        Covode.recordClassIndex(88925);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<Effect> list = this.f136143a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        Effect effect;
        if (i2 < 0 || i2 >= getItemCount()) {
            effect = null;
        } else {
            effect = this.f136143a.get(i2);
        }
        p<c, Integer> a2 = this.f136149g.a(effect);
        ((com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a) viewHolder).a(effect, a2.getFirst(), a2.getSecond(), i2, -1);
        h hVar = this.f136144b;
        if (hVar != null && effect != null) {
            hVar.a(effect, this.f136151i, "click_main_panel", i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.a.a
    public final boolean a(Effect effect, int i2, int i3) {
        int i4 = this.f136145c;
        boolean z = false;
        if (i4 < 0 || !com.ss.android.ugc.aweme.sticker.p.g.b(this.f136143a.get(i4))) {
            if (this.f136145c == i3) {
                z = true;
            }
            if (!this.f136146d && z) {
                this.f136146d = true;
            }
            return z;
        }
        boolean z2 = !com.ss.android.ugc.aweme.sticker.p.g.b(this.f136143a.get(i3));
        if (this.f136146d || !z2) {
            return false;
        }
        this.f136146d = true;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        Object h2 = n.h((List) list);
        if (h2 instanceof Effect) {
            p<c, Integer> a2 = this.f136149g.a((Effect) h2);
            ((com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a) viewHolder).b(h2, a2.getFirst(), a2.getSecond());
            return;
        }
        super.onBindViewHolder(viewHolder, i2, list);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10443);
        k kVar = aVar.f136150h;
        Context context = viewGroup.getContext();
        l.d(kVar, "");
        l.d(context, "");
        p a3 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context, 54.0f, 54.0f, -2.0f, -2.0f, -2.0f, 58.0f, null, null, 384);
        b bVar = new b((View) a3.getFirst(), (com.ss.android.ugc.tools.view.widget.c.b) a3.getSecond(), aVar.f136148f, aVar.f136147e, aVar.f136149g);
        bVar.f135051a = aVar;
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(10443);
        return bVar;
    }

    public a(o oVar, g gVar, b<Effect> bVar, k kVar) {
        this.f136148f = oVar;
        this.f136149g = bVar;
        this.f136147e = gVar;
        this.f136150h = kVar;
    }
}
