package com.bytedance.android.livesdk.chatroom.ui.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.ui.b.e;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d extends RecyclerView.a<e> {

    /* renamed from: a  reason: collision with root package name */
    final List<av> f15931a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public b<? super av, z> f15932b;

    static {
        Covode.recordClassIndex(8813);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ e onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f15931a.size();
    }

    public d(b<? super av, z> bVar) {
        l.d(bVar, "");
        this.f15932b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(e eVar, int i2) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        av avVar = this.f15931a.get(i2);
        b<? super av, z> bVar = this.f15932b;
        l.d(avVar, "");
        l.d(bVar, "");
        HSImageView hSImageView = eVar2.f15933a;
        ImageModel imageModel = avVar.f18999a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (imageModel != null && !com.bytedance.common.utility.collection.b.a((Collection) imageModel.getUrls())) {
            p.a(hSImageView, imageModel, -1, -1, false, 0, scaleType, null);
        }
        eVar2.itemView.setOnClickListener(new e.a(bVar, avVar));
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12732);
        l.d(viewGroup, "");
        View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.be7, viewGroup, false);
        l.b(a3, "");
        e eVar = new e(a3);
        try {
            if (eVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(eVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = eVar.getClass().getName();
        MethodCollector.o(12732);
        return eVar;
    }
}
