package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.video.hashtag.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class c extends RecyclerView.a<b> implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f127638a;

    /* renamed from: b  reason: collision with root package name */
    private final j f127639b;

    static {
        Covode.recordClassIndex(83680);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f127638a.size();
    }

    public c(List<b> list, j jVar) {
        l.d(list, "");
        l.d(jVar, "");
        this.f127638a = list;
        this.f127639b = jVar;
    }

    @Override // com.ss.android.ugc.aweme.cz.a.j
    public final void a(View view, int i2) {
        l.d(view, "");
        j jVar = this.f127639b;
        if (jVar != null) {
            jVar.a(view, i2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        b bVar3 = this.f127638a.get(i2);
        l.d(bVar3, "");
        TuxTextView tuxTextView = bVar2.f127633a;
        if (tuxTextView != null) {
            tuxTextView.setText("# " + bVar3.f143397a.challengeName);
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4150);
        l.d(viewGroup, "");
        l.d(viewGroup, "");
        View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dh, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3, cVar);
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
        MethodCollector.o(4150);
        return bVar;
    }
}
