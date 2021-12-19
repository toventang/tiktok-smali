package com.ss.android.ugc.aweme.emoji.emojichoose.a;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.b.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public int f89201a;

    /* renamed from: b  reason: collision with root package name */
    public int f89202b;

    /* renamed from: c  reason: collision with root package name */
    public int f89203c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f89204d = new ArrayList();

    static {
        Covode.recordClassIndex(56078);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f89204d.size();
    }

    public static class a extends d<a> {

        /* renamed from: a  reason: collision with root package name */
        private ImageView f89205a;

        /* renamed from: b  reason: collision with root package name */
        private int f89206b;

        /* renamed from: c  reason: collision with root package name */
        private int f89207c;

        static {
            Covode.recordClassIndex(56079);
        }

        a(View view) {
            super(view);
            Resources resources = view.getResources();
            this.f89205a = (ImageView) view.findViewById(R.id.by7);
            this.f89206b = resources.getDimensionPixelSize(R.dimen.je);
            this.f89207c = resources.getDimensionPixelSize(R.dimen.jf);
        }

        public final void a(a aVar) {
            int i2;
            super.a((Object) aVar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f89205a.getLayoutParams();
            if (aVar.f89199b == R.drawable.a7f) {
                i2 = this.f89207c;
            } else {
                i2 = this.f89206b;
            }
            layoutParams.height = i2;
            layoutParams.width = i2;
            this.f89205a.setLayoutParams(layoutParams);
            this.f89205a.setSelected(aVar.f89198a);
            this.f89205a.setImageResource(aVar.f89199b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        aVar.a(this.f89204d.get(i2));
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2787);
        a aVar = new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yk, viewGroup, false));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(2787);
        return aVar;
    }
}
