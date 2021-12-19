package com.ss.android.ugc.aweme.tools.music.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.f.b;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e extends b {
    private List<MusicModel> o;

    static {
        Covode.recordClassIndex(91818);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.tools.music.e.b
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void a(c cVar) {
        if (k.a(this.o)) {
            this.o = new ArrayList();
        }
        if (cVar != null) {
            List<MusicModel> list = this.o;
            if (list == null) {
                l.b();
            }
            list.add(0, b.a.a(cVar));
            notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void a(List<c> list) {
        if (!k.a(list) && k.a(this.o)) {
            if (list == null) {
                l.b();
            }
            for (c cVar : list) {
                List<MusicModel> list2 = this.o;
                if (list2 == null) {
                    l.b();
                }
                list2.add(b.a.a(cVar));
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(List<MusicModel> list, j jVar) {
        super(list, jVar);
        l.d(jVar, "");
        this.o = list;
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(2469);
        l.d(viewGroup, "");
        if (eVar.getItemViewType(i2) == 0) {
            View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dn, viewGroup, false);
            l.b(a3, "");
            viewHolder = new d(a3, eVar);
        } else {
            View a4 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.dl, viewGroup, false);
            l.b(a4, "");
            viewHolder = new f(a4, eVar);
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
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
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
        MethodCollector.o(2469);
        return viewHolder;
    }
}
