package com.ss.android.ugc.trill.language.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.i18n.language.b> f150484a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC4054a f150485b;

    /* renamed from: c  reason: collision with root package name */
    private Context f150486c;

    /* renamed from: com.ss.android.ugc.trill.language.a.a$a  reason: collision with other inner class name */
    public interface AbstractC4054a {
        static {
            Covode.recordClassIndex(98971);
        }

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(98969);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        ArrayList<com.ss.android.ugc.aweme.i18n.language.b> arrayList = this.f150484a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f150489a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f150490b;

        static {
            Covode.recordClassIndex(98972);
        }

        public b(View view) {
            super(view);
            int i2;
            this.f150489a = (TextView) view.findViewById(R.id.f1r);
            this.f150490b = (ImageView) view.findViewById(R.id.c0q);
            TextView textView = this.f150489a;
            Context context = view.getContext();
            if (com.bytedance.ies.dmt.ui.common.b.b(view.getContext())) {
                i2 = R.color.ae;
            } else {
                i2 = R.color.a_;
            }
            textView.setTextColor(androidx.core.content.b.c(context, i2));
        }
    }

    public a(Context context, AbstractC4054a aVar) {
        this.f150486c = context;
        this.f150485b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, final int i2) {
        b bVar2 = bVar;
        if (getItemCount() != 0) {
            com.ss.android.ugc.aweme.i18n.language.b bVar3 = this.f150484a.get(i2);
            bVar2.f150489a.setText(bVar3.a());
            if (bVar3.f99791a) {
                bVar2.f150490b.setVisibility(0);
                bVar2.f150490b.setImageResource(2131233725);
            } else {
                bVar2.f150490b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.trill.language.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98970);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (a.this.f150485b != null) {
                        a.this.f150485b.b(i2);
                    }
                }
            });
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6925);
        b bVar = new b(com.a.a(LayoutInflater.from(aVar.f150486c), R.layout.ayx, viewGroup, false));
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
        MethodCollector.o(6925);
        return bVar;
    }
}
