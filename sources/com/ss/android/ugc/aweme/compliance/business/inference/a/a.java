package com.ss.android.ugc.aweme.compliance.business.inference.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.inference.model.LabelData;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public final b f76937a;

    /* renamed from: b  reason: collision with root package name */
    private Context f76938b;

    /* renamed from: c  reason: collision with root package name */
    private List<LabelData> f76939c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private String f76940d;

    /* renamed from: e  reason: collision with root package name */
    private String f76941e;

    /* renamed from: f  reason: collision with root package name */
    private String f76942f;

    /* renamed from: g  reason: collision with root package name */
    private String f76943g;

    /* renamed from: h  reason: collision with root package name */
    private String f76944h;

    /* renamed from: i  reason: collision with root package name */
    private String f76945i;

    public interface b {
        static {
            Covode.recordClassIndex(47556);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(47554);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f76939c.size();
    }

    public final void a(List<LabelData> list) {
        l.d(list, "");
        this.f76939c = list;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f76950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f76951b;

        static {
            Covode.recordClassIndex(47557);
        }

        c(a aVar, int i2) {
            this.f76950a = aVar;
            this.f76951b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76950a.f76937a.a(this.f76951b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        int labelType = this.f76939c.get(i2).getLabelType();
        if (labelType == 0) {
            return 0;
        }
        if (labelType != 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.inference.a.a$a  reason: collision with other inner class name */
    public final class C1764a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TuxTextView f76946a;

        /* renamed from: b  reason: collision with root package name */
        public final TuxTextView f76947b;

        /* renamed from: c  reason: collision with root package name */
        public final RelativeLayout f76948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f76949d;

        static {
            Covode.recordClassIndex(47555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1764a(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f76949d = aVar;
            View findViewById = view.findViewById(R.id.eu);
            l.b(findViewById, "");
            this.f76946a = (TuxTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.es);
            l.b(findViewById2, "");
            this.f76947b = (TuxTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.et);
            l.b(findViewById3, "");
            this.f76948c = (RelativeLayout) findViewById3;
        }
    }

    public a(Context context, b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        this.f76937a = bVar;
        this.f76938b = context;
        String string = this.f76938b.getString(R.string.fqf);
        l.b(string, "");
        this.f76940d = string;
        String string2 = this.f76938b.getString(R.string.fqo);
        l.b(string2, "");
        this.f76941e = string2;
        String string3 = this.f76938b.getString(R.string.fqs);
        l.b(string3, "");
        this.f76942f = string3;
        String string4 = this.f76938b.getString(R.string.fqk);
        l.b(string4, "");
        this.f76943g = string4;
        String string5 = this.f76938b.getString(R.string.fqm);
        l.b(string5, "");
        this.f76944h = string5;
        String string6 = this.f76938b.getString(R.string.fqn);
        l.b(string6, "");
        this.f76945i = string6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.inference.a.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5752);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9q, viewGroup, false);
        l.b(a3, "");
        C1764a aVar2 = new C1764a(aVar, a3);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(5752);
        return aVar2;
    }
}
