package com.ss.android.ugc.aweme.account.login.ui;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class b extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1436b f64108a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.account.login.model.a> f64109b;

    /* renamed from: c  reason: collision with root package name */
    private int f64110c = R.layout.gk;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.b$b  reason: collision with other inner class name */
    public interface AbstractC1436b {
        static {
            Covode.recordClassIndex(39507);
        }

        void a(com.ss.android.ugc.aweme.account.login.model.a aVar);
    }

    static {
        Covode.recordClassIndex(39504);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f64109b.size();
    }

    public b(List<com.ss.android.ugc.aweme.account.login.model.a> list) {
        this.f64109b = list;
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f64113a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f64114b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f64115c;

        static {
            Covode.recordClassIndex(39506);
        }

        public a(View view) {
            super(view);
            this.f64113a = (TextView) view.findViewById(R.id.f0j);
            this.f64114b = (TextView) view.findViewById(R.id.f3c);
            this.f64115c = (TextView) view.findViewById(R.id.ex1);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        final com.ss.android.ugc.aweme.account.login.model.a aVar3 = this.f64109b.get(i2);
        if (i2 == 0 || !TextUtils.equals(this.f64109b.get(i2 - 1).f63496b, aVar3.f63496b)) {
            aVar2.f64113a.setVisibility(0);
            aVar2.f64113a.setText(aVar3.f63496b);
        } else {
            aVar2.f64113a.setVisibility(8);
        }
        if (aVar3.f63496b.isEmpty()) {
            aVar2.f64113a.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aVar3.f63499e)) {
            aVar2.f64114b.setText(aVar3.f63499e);
        } else {
            aVar2.f64114b.setText(aVar3.f63495a);
        }
        aVar2.f64115c.setText(aVar3.f63498d);
        aVar2.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.account.login.ui.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(39505);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (b.this.f64108a != null) {
                    b.this.f64108a.a(aVar3);
                }
            }
        });
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9109);
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(bVar.f64110c, (ViewGroup) null));
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
        MethodCollector.o(9109);
        return aVar;
    }
}
