package com.ss.android.ugc.aweme.commercialize.b.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.commercialize.b.a.f;
import com.ss.android.ugc.aweme.common.a.b;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class e extends b<List<? extends AnchorPublishStruct>> {

    /* renamed from: a  reason: collision with root package name */
    public final m f73713a;

    static {
        Covode.recordClassIndex(45351);
    }

    public e(m mVar) {
        l.d(mVar, "");
        this.f73713a = mVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ae_, viewGroup, false);
        l.b(a2, "");
        return new f(a2, this.f73713a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ boolean a(List<? extends AnchorPublishStruct> list, int i2) {
        l.d(list, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.ss.android.ugc.aweme.common.a.b
    public final /* synthetic */ void a(List<? extends AnchorPublishStruct> list, int i2, RecyclerView.ViewHolder viewHolder, List list2) {
        int i3;
        List<? extends AnchorPublishStruct> list3 = list;
        l.d(list3, "");
        l.d(viewHolder, "");
        l.d(list2, "");
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) list3.get(i2);
        boolean z = viewHolder instanceof f;
        if (z) {
            f fVar = (f) viewHolder;
            l.d(anchorPublishStruct, "");
            if (anchorPublishStruct.type == ab.ANCHOR_SHOP_LINK.getTYPE()) {
                anchorPublishStruct.extensionMisc.getExtensionDataRepo().getI18nStarAtlasClosed().observe(fVar.f73721h, new f.a(fVar));
            }
            TextView textView = fVar.f73718e;
            int i4 = 0;
            if (anchorPublishStruct.isBeta) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
            fVar.f73718e.setText(R.string.f160028g);
            TextView textView2 = fVar.f73719f;
            if (!anchorPublishStruct.isNew) {
                i4 = 8;
            }
            textView2.setVisibility(i4);
            fVar.f73719f.setText(R.string.deq);
            String str = anchorPublishStruct.subtitle;
            if (str != null) {
                fVar.f73717d.setText(str);
            }
            com.ss.android.ugc.aweme.base.e.a(fVar.f73714a, anchorPublishStruct.icon);
            if (anchorPublishStruct.type == 40) {
                fVar.f73715b.setMaxEms(20);
            }
            fVar.f73715b.setText(anchorPublishStruct.title);
            if (anchorPublishStruct.enable) {
                TextView textView3 = fVar.f73715b;
                View view = fVar.itemView;
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                textView3.setTextColor(context.getResources().getColor(R.color.a2));
            } else {
                TextView textView4 = fVar.f73715b;
                View view2 = fVar.itemView;
                l.b(view2, "");
                Context context2 = view2.getContext();
                l.b(context2, "");
                textView4.setTextColor(context2.getResources().getColor(R.color.c3));
            }
            fVar.itemView.setOnClickListener(new f.b(anchorPublishStruct));
        }
        if (i2 == list3.size() - 1) {
            if (!z) {
                viewHolder = null;
            }
            f fVar2 = (f) viewHolder;
            if (fVar2 != null) {
                fVar2.f73720g.setVisibility(8);
            }
        }
    }
}
