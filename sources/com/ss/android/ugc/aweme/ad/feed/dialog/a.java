package com.ss.android.ugc.aweme.ad.feed.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.model.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a extends RecyclerView.a<C1470a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f65820a;

    /* renamed from: b  reason: collision with root package name */
    public final q<String, String, Integer, z> f65821b;

    static {
        Covode.recordClassIndex(40499);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C1470a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f65820a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.dialog.a$a  reason: collision with other inner class name */
    public static final class C1470a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(40500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1470a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f65823b;

        static {
            Covode.recordClassIndex(40501);
        }

        b(a aVar, int i2) {
            this.f65822a = aVar;
            this.f65823b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            q<String, String, Integer, z> qVar = this.f65822a.f65821b;
            String toast = this.f65822a.f65820a.get(this.f65823b).getToast();
            String str = "";
            if (toast == null) {
                toast = str;
            }
            String key = this.f65822a.f65820a.get(this.f65823b).getKey();
            if (key != null) {
                str = key;
            }
            qVar.invoke(toast, str, Integer.valueOf(this.f65823b));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<d> list, q<? super String, ? super String, ? super Integer, z> qVar) {
        l.d(list, "");
        l.d(qVar, "");
        this.f65820a = list;
        this.f65821b = qVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1470a aVar, int i2) {
        C1470a aVar2 = aVar;
        l.d(aVar2, "");
        View view = aVar2.itemView;
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(this.f65820a.get(i2).getReason());
            textView.setOnClickListener(new b(this, i2));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3863);
        l.d(viewGroup, "");
        TextView textView = (TextView) com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.x9, viewGroup, false).findViewById(R.id.amy);
        l.b(textView, "");
        C1470a aVar = new C1470a(textView);
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
        MethodCollector.o(3863);
        return aVar;
    }
}
