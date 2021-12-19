package com.ss.android.ugc.aweme.kids.setting.items.language.a;

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
import h.f.b.l;
import java.util.ArrayList;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.kids.setting.items.language.c.b> f107040a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2747a f107041b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f107042c;

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2747a {
        static {
            Covode.recordClassIndex(68466);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(68465);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        ArrayList<com.ss.android.ugc.aweme.kids.setting.items.language.c.b> arrayList = this.f107040a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f107047b;

        static {
            Covode.recordClassIndex(68468);
        }

        c(a aVar, int i2) {
            this.f107046a = aVar;
            this.f107047b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC2747a aVar = this.f107046a.f107041b;
            if (aVar != null) {
                aVar.a(this.f107047b);
            }
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f107044a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f107045b;

        static {
            Covode.recordClassIndex(68467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.f1r);
            l.b(findViewById, "");
            this.f107044a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.c0q);
            l.b(findViewById2, "");
            this.f107045b = (ImageView) findViewById2;
            this.f107044a.setTextColor(androidx.core.content.b.c(view.getContext(), R.color.ae));
        }
    }

    public a(Context context, AbstractC2747a aVar) {
        l.d(context, "");
        this.f107042c = context;
        this.f107041b = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        if (getItemCount() != 0) {
            ArrayList<com.ss.android.ugc.aweme.kids.setting.items.language.c.b> arrayList = this.f107040a;
            if (arrayList == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.kids.setting.items.language.c.b bVar3 = arrayList.get(i2);
            l.b(bVar3, "");
            com.ss.android.ugc.aweme.kids.setting.items.language.c.b bVar4 = bVar3;
            TextView textView = bVar2.f107044a;
            String e2 = bVar4.f107058a.e();
            l.b(e2, "");
            textView.setText(e2);
            if (bVar4.f107059b) {
                bVar2.f107045b.setVisibility(0);
                bVar2.f107045b.setImageResource(2131232954);
            } else {
                bVar2.f107045b.setVisibility(8);
            }
            bVar2.itemView.setOnClickListener(new c(this, i2));
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4983);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(aVar.f107042c), R.layout.ac7, viewGroup, false);
        l.b(a3, "");
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
        MethodCollector.o(4983);
        return bVar;
    }
}
