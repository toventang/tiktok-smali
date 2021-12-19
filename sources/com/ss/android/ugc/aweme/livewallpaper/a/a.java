package com.ss.android.ugc.aweme.livewallpaper.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<b> implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int f108732c = (i.a()[0] / 3);

    /* renamed from: d  reason: collision with root package name */
    private static final int f108733d = ((int) (((float) i.a()[0]) * 0.44f));

    /* renamed from: a  reason: collision with root package name */
    public List<LiveWallPaperBean> f108734a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public AbstractC2788a f108735b;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2788a {
        static {
            Covode.recordClassIndex(69662);
        }

        void a(LiveWallPaperBean liveWallPaperBean);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f108734a.size();
    }

    static {
        Covode.recordClassIndex(69661);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC2788a aVar = this.f108735b;
        if (aVar != null) {
            aVar.a((LiveWallPaperBean) view.getTag());
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f108736a;

        static {
            Covode.recordClassIndex(69663);
        }

        public b(View view) {
            super(view);
            this.f108736a = (RemoteImageView) view.findViewById(R.id.ekr);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        LiveWallPaperBean liveWallPaperBean;
        b bVar2 = bVar;
        if (i2 < this.f108734a.size() && i2 >= 0 && (liveWallPaperBean = this.f108734a.get(i2)) != null) {
            if (TextUtils.isEmpty(liveWallPaperBean.getThumbnailPath())) {
                e.a(bVar2.f108736a, liveWallPaperBean.getThumbnailUrlModel(), f108732c, f108733d);
            } else {
                e.b(bVar2.f108736a, "file://" + liveWallPaperBean.getThumbnailPath(), f108732c, f108733d);
            }
            bVar2.itemView.setTag(liveWallPaperBean);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9668);
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bkk, viewGroup, false);
        a3.setOnClickListener(aVar);
        b bVar = new b(a3);
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
        MethodCollector.o(9668);
        return bVar;
    }
}
