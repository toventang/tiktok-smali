package com.ss.android.ugc.aweme.i18n.language.a;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class e extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    Context f99773a;

    /* renamed from: b  reason: collision with root package name */
    Dialog f99774b;

    /* renamed from: c  reason: collision with root package name */
    private List<b> f99775c;

    static {
        Covode.recordClassIndex(63616);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f99775c.size();
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f99776a;

        static {
            Covode.recordClassIndex(63617);
        }

        a(View view) {
            super(view);
            this.f99776a = (TextView) view.findViewById(R.id.c4_);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        b bVar = this.f99775c.get(i2);
        aVar2.f99776a.setText(bVar.e());
        aVar2.itemView.setOnClickListener(new f(this, bVar));
    }

    public e(Context context, List<b> list, Dialog dialog) {
        this.f99773a = context;
        this.f99775c = list;
        this.f99774b = dialog;
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7157);
        a aVar = new a(com.a.a(LayoutInflater.from(eVar.f99773a), R.layout.me, viewGroup, false));
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
        MethodCollector.o(7157);
        return aVar;
    }
}
