package com.ss.android.ugc.aweme.contentlanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.i18n.language.b> f78143a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1815a f78144b;

    /* renamed from: c  reason: collision with root package name */
    private Context f78145c;

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.a$a  reason: collision with other inner class name */
    public interface AbstractC1815a {
        static {
            Covode.recordClassIndex(48454);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(48452);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        ArrayList<com.ss.android.ugc.aweme.i18n.language.b> arrayList = this.f78143a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TuxTextView f78155a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f78156b;

        static {
            Covode.recordClassIndex(48455);
        }

        public b(View view) {
            super(view);
            int i2;
            this.f78155a = (TuxTextView) view.findViewById(R.id.f1r);
            this.f78156b = (ImageView) view.findViewById(R.id.c0q);
            TuxTextView tuxTextView = this.f78155a;
            Context context = view.getContext();
            if (com.bytedance.ies.dmt.ui.common.b.b(view.getContext())) {
                i2 = R.color.ae;
            } else {
                i2 = R.color.a_;
            }
            tuxTextView.setTextColor(androidx.core.content.b.c(context, i2));
        }
    }

    public a(Context context, AbstractC1815a aVar) {
        this.f78145c = context;
        this.f78144b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, final int i2) {
        b bVar2 = bVar;
        if (getItemCount() != 0) {
            com.ss.android.ugc.aweme.i18n.language.b bVar3 = this.f78143a.get(i2);
            bVar2.f78155a.setText(bVar3.a());
            if (bVar3.f99791a) {
                bVar2.f78156b.setVisibility(0);
                bVar2.f78156b.setImageResource(2131232329);
            } else {
                bVar2.f78156b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.contentlanguage.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48453);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (a.this.f78144b != null) {
                        a.this.f78144b.a(i2);
                    }
                }
            });
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4435);
        b bVar = new b(com.a.a(LayoutInflater.from(aVar.f78145c), R.layout.a_r, viewGroup, false));
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
        MethodCollector.o(4435);
        return bVar;
    }
}
