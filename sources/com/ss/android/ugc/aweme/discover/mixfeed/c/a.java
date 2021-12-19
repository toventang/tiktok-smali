package com.ss.android.ugc.aweme.discover.mixfeed.c;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.adapter.ah;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> implements com.ss.android.ugc.aweme.e.a {

    /* renamed from: a  reason: collision with root package name */
    public List<Music> f81648a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private r f81649b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.mixfeed.b.a f81650c;

    static {
        Covode.recordClassIndex(50739);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f81648a.size();
    }

    @Override // com.ss.android.ugc.aweme.e.a
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.b.a aVar, r rVar) {
        this.f81650c = aVar;
        this.f81649b = rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2 = "";
        l.d(viewHolder, str2);
        Music music = this.f81648a.get(i2);
        if (viewHolder instanceof ah) {
            ah ahVar = (ah) viewHolder;
            ahVar.f80336i = this.f81650c;
            r rVar = this.f81649b;
            if (rVar == null) {
                rVar = r.a.a();
            }
            ahVar.a(rVar);
            ahVar.b("general_search");
            music.setSoundsListType(3);
            r rVar2 = this.f81649b;
            if (!(rVar2 == null || (str = rVar2.f121271f) == null)) {
                str2 = str;
            }
            ahVar.a(music, str2);
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3648);
        l.d(viewGroup, "");
        ah a3 = ah.a.a(viewGroup, null);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
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
        MethodCollector.o(3648);
        return a3;
    }
}
