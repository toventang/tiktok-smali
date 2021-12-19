package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.shortvideo.a.a;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import com.ss.android.ugc.aweme.shortvideo.publish.w;
import com.ss.android.ugc.aweme.shortvideo.ui.bi;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;

public final class bj extends a<List<? extends v>> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f131498a;

    static {
        Covode.recordClassIndex(86136);
    }

    public bj(boolean z) {
        this.f131498a = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.a.a
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ah8, viewGroup, false);
        l.b(a2, "");
        return new bi.a(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.shortvideo.a.a
    public final /* synthetic */ boolean a(List<? extends v> list, int i2) {
        List<? extends v> list2 = list;
        l.d(list2, "");
        if (((v) list2.get(i2)).f129894f == w.SAVE_LOCAL_OPTIONS) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.shortvideo.a.a
    public final /* synthetic */ void a(List<? extends v> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends v> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        v vVar = (v) list3.get(i2);
        if (viewHolder instanceof bi.a) {
            bi.a aVar = (bi.a) viewHolder;
            boolean z = true;
            if (!this.f131498a || i2 == list3.size() - 1) {
                z = false;
            }
            l.d(vVar, "");
            aVar.f131492a.setLeftIcon(vVar.f129897i);
            aVar.f131492a.setLeftText(vVar.f129895g);
            aVar.f131492a.setRightText(vVar.f129889a);
            if (!z) {
                aVar.f131493b.setVisibility(8);
            }
            aVar.itemView.setOnClickListener(new bi.a.View$OnClickListenerC3419a(aVar, vVar));
            if (vVar.f129893e != null) {
                m<? super View, ? super CommonItemView, z> mVar = vVar.f129893e;
                if (mVar == null) {
                    l.b();
                }
                View view = aVar.itemView;
                l.b(view, "");
                mVar.invoke(view, aVar.f131492a);
            }
        }
    }
}
