package com.ss.android.ugc.aweme.profile.ui.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.e.a;
import com.ss.android.ugc.aweme.profile.ui.c.c;
import com.ss.android.ugc.aweme.profile.widgets.j;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.a<c.b> {

    /* renamed from: a  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.user.c> f117035a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<j.b> f117036b;

    /* renamed from: c  reason: collision with root package name */
    public final a f117037c;

    /* renamed from: d  reason: collision with root package name */
    public final e f117038d;

    static {
        Covode.recordClassIndex(75573);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c.b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f117035a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c.b bVar, int i2) {
        c.b bVar2 = bVar;
        l.d(bVar2, "");
        com.ss.android.ugc.aweme.user.c cVar = this.f117035a.get(i2);
        if (l.a((Object) cVar.f142345a, (Object) "-1")) {
            bVar2.f117044a.setImageResource(2131232615);
            bVar2.f117045b.setText(R.string.d6q);
            bVar2.f117046c.setVisibility(8);
        } else {
            com.ss.android.ugc.aweme.base.e.b(bVar2.f117044a, cVar.f142349e, -1, -1);
            bVar2.f117045b.setVisibility(0);
            bVar2.f117045b.setText(cVar.a());
            bVar2.f117046c.setText(cVar.f142348d);
        }
        bVar2.f117047d.setVisibility(8);
        bVar2.f117048e.setVisibility(8);
        View view = bVar2.itemView;
        WeakReference<j.b> weakReference = this.f117036b;
        View view2 = bVar2.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        view.setOnClickListener(new j(weakReference, cVar, context, this.f117038d, this.f117037c));
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7065);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoj, viewGroup, false);
        l.b(a3, "");
        c.b bVar = new c.b(a3);
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
        MethodCollector.o(7065);
        return bVar;
    }

    public b(WeakReference<j.b> weakReference, a aVar, e eVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        l.d(eVar, "");
        this.f117036b = weakReference;
        this.f117037c = aVar;
        this.f117038d = eVar;
    }
}
