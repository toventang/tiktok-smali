package com.ss.android.ugc.aweme.geofencing.a;

import android.content.Context;
import android.content.DialogInterface;
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
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class a extends RecyclerView.a<C2413a> {

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.geofencing.c.a> f99014a;

    /* renamed from: b  reason: collision with root package name */
    final Context f99015b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f99016c;

    static {
        Covode.recordClassIndex(62958);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C2413a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public final List<com.ss.android.ugc.aweme.geofencing.c.a> a() {
        return n.k(this.f99014a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f99014a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a.a$a  reason: collision with other inner class name */
    public static final class C2413a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f99017a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f99018b;

        static {
            Covode.recordClassIndex(62959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2413a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.ba7);
            l.b(findViewById, "");
            this.f99017a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ba3);
            l.b(findViewById2, "");
            this.f99018b = (ImageView) findViewById2;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99022a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.geofencing.c.a f99023b;

        static {
            Covode.recordClassIndex(62962);
        }

        d(a aVar, com.ss.android.ugc.aweme.geofencing.c.a aVar2) {
            this.f99022a = aVar;
            this.f99023b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f99022a;
            com.ss.android.ugc.aweme.geofencing.c.a aVar2 = this.f99023b;
            a.C0731a aVar3 = new a.C0731a(aVar.f99015b);
            aVar3.f33402b = aVar.f99015b.getString(R.string.gd9, aVar2.getTranslation());
            aVar3.a(R.string.gd_, (DialogInterface.OnClickListener) new b(aVar, aVar2), false).b(R.string.gd8, (DialogInterface.OnClickListener) c.f99021a, false).a().c();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f99021a = new c();

        static {
            Covode.recordClassIndex(62961);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.geofencing.c.a f99020b;

        static {
            Covode.recordClassIndex(62960);
        }

        b(a aVar, com.ss.android.ugc.aweme.geofencing.c.a aVar2) {
            this.f99019a = aVar;
            this.f99020b = aVar2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f99019a.f99014a.remove(this.f99020b);
            this.f99019a.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C2413a aVar, int i2) {
        C2413a aVar2 = aVar;
        l.d(aVar2, "");
        com.ss.android.ugc.aweme.geofencing.c.a aVar3 = this.f99014a.get(i2);
        aVar2.f99017a.setText(aVar3.getTranslation());
        if (this.f99016c) {
            aVar2.f99018b.setVisibility(8);
        } else {
            aVar2.f99018b.setOnClickListener(new d(this, aVar3));
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11590);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_l, viewGroup, false);
        l.b(a3, "");
        C2413a aVar = new C2413a(a3);
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
        MethodCollector.o(11590);
        return aVar;
    }

    public a(Context context, boolean z, List<com.ss.android.ugc.aweme.geofencing.c.a> list) {
        l.d(context, "");
        l.d(list, "");
        this.f99015b = context;
        this.f99016c = z;
        this.f99014a = n.g((Collection) list);
    }
}
