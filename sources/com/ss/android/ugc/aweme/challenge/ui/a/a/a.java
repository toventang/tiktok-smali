package com.ss.android.ugc.aweme.challenge.ui.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.challenge.ui.a.a.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Aweme> f70044a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final b.AbstractC1588b f70045b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f70046c = true;

    static {
        Covode.recordClassIndex(43211);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f70044a.size();
    }

    public a(b.AbstractC1588b bVar) {
        l.d(bVar, "");
        this.f70045b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        Aweme aweme = this.f70044a.get(i2);
        if (aweme != null && aweme.getVideo() != null) {
            AnimatedImageView animatedImageView = bVar2.f70048a;
            Video video = aweme.getVideo();
            l.b(video, "");
            e.a(animatedImageView, video.getCover());
            bVar2.f70049b = aweme;
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12967);
        l.d(viewGroup, "");
        b.AbstractC1588b bVar = aVar.f70045b;
        l.d(viewGroup, "");
        l.d(bVar, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.n7, viewGroup, false);
        l.b(a3, "");
        b bVar2 = new b(a3, bVar);
        try {
            if (bVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar2.getClass().getName();
        MethodCollector.o(12967);
        return bVar2;
    }
}
