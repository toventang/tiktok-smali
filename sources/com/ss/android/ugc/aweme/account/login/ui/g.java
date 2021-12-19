package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class g extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public b f64122a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.account.login.model.a> f64123b;

    /* renamed from: c  reason: collision with root package name */
    private int f64124c = R.layout.gk;

    /* renamed from: d  reason: collision with root package name */
    private Context f64125d;

    public interface b {
        static {
            Covode.recordClassIndex(39514);
        }

        void a(com.ss.android.ugc.aweme.account.login.model.a aVar);
    }

    static {
        Covode.recordClassIndex(39512);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f64123b.size();
    }

    public g(List<com.ss.android.ugc.aweme.account.login.model.a> list) {
        this.f64123b = list;
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f64126a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f64127b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f64128c;

        static {
            Covode.recordClassIndex(39513);
        }

        a(View view) {
            super(view);
            this.f64126a = (TextView) view.findViewById(R.id.f0j);
            this.f64127b = (TextView) view.findViewById(R.id.f3c);
            this.f64128c = (TextView) view.findViewById(R.id.ex1);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        com.ss.android.ugc.aweme.account.login.model.a aVar3 = this.f64123b.get(i2);
        if (i2 == 0 || !TextUtils.equals(this.f64123b.get(i2 - 1).f63496b, aVar3.f63496b)) {
            aVar2.f64126a.setVisibility(0);
            aVar2.f64126a.setText(aVar3.f63496b);
        } else {
            aVar2.f64126a.setVisibility(8);
        }
        if (!TextUtils.isEmpty(aVar3.f63499e)) {
            aVar2.f64127b.setText(aVar3.f63499e);
        } else {
            Context context = this.f64125d;
            if (context != null && !TextUtils.isEmpty(context.getResources().getString(aVar3.f63495a))) {
                aVar2.f64127b.setText(this.f64125d.getResources().getString(aVar3.f63495a));
            }
        }
        aVar2.f64128c.setText(aVar3.f63498d);
        aVar2.itemView.setOnClickListener(new h(this, aVar3));
    }

    private static RecyclerView.ViewHolder a(g gVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9067);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(gVar.f64124c, (ViewGroup) null);
        gVar.f64125d = viewGroup.getContext();
        a aVar = new a(inflate);
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
        MethodCollector.o(9067);
        return aVar;
    }
}
