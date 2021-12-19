package com.ss.android.ugc.aweme.compliance.business.commentfilter.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f76857a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f76858b;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<z> f76859c;

    static {
        Covode.recordClassIndex(47506);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f76857a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.a.a$a  reason: collision with other inner class name */
    public static final class C1759a extends m implements b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1759a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            a aVar = this.this$0;
            aVar.f76859c.invoke();
            r.a("keyword_filter_delete_ck", new d().a("keyword", aVar.f76857a.get(intValue)).f66730a);
            aVar.f76857a.remove(intValue);
            aVar.notifyItemRemoved(intValue);
            aVar.notifyItemRangeChanged(intValue, aVar.getItemCount() - intValue);
            return z.f158842a;
        }
    }

    public a(Context context, h.f.a.a<z> aVar) {
        l.d(context, "");
        l.d(aVar, "");
        this.f76858b = context;
        this.f76859c = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        b bVar2 = bVar;
        l.d(bVar2, "");
        String str = this.f76857a.get(i2);
        l.d(str, "");
        bVar2.f76861b = i2;
        TextView textView = bVar2.f76860a;
        l.b(textView, "");
        textView.setText(str);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5353);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.uj, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3, aVar.f76858b, new C1759a(aVar));
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
        MethodCollector.o(5353);
        return bVar;
    }
}
