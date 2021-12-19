package com.bytedance.android.livesdk.olddialog.giftpanellist.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;

public final class c extends a {
    static {
        Covode.recordClassIndex(11833);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.livesdk.olddialog.giftpanellist.a.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public c(Context context, a.AbstractC0407a aVar) {
        super(context, aVar, false);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.a.a
    public final b a(ViewGroup viewGroup, int i2) {
        b a2 = super.a(viewGroup, i2);
        a2.itemView.setLayoutParams(new ViewGroup.LayoutParams((int) n.b(this.f20024c, 93.0f), (int) n.b(this.f20024c, 110.0f)));
        return a2;
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10429);
        b a3 = cVar.a(viewGroup, i2);
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
        MethodCollector.o(10429);
        return a3;
    }
}
