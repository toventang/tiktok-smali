package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.ah;
import com.ss.android.ugc.aweme.journey.r;
import com.ss.android.ugc.aweme.journey.ui.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashSet;
import java.util.List;

public final class j extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public List<ah> f105120a;

    /* renamed from: b  reason: collision with root package name */
    public final b<Integer, z> f105121b;

    /* renamed from: c  reason: collision with root package name */
    public final r f105122c;

    /* renamed from: d  reason: collision with root package name */
    public final int f105123d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet<com.ss.android.ugc.aweme.interest.b> f105124e;

    /* renamed from: f  reason: collision with root package name */
    public final int f105125f;

    static {
        Covode.recordClassIndex(67405);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<ah> list = this.f105120a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final int f105126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f105127b;

        /* renamed from: c  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.journey.ui.a f105128c;

        /* renamed from: d  reason: collision with root package name */
        private final c f105129d;

        /* renamed from: e  reason: collision with root package name */
        private final c f105130e;

        static {
            Covode.recordClassIndex(67406);
        }

        public final void a(boolean z) {
            View view = this.itemView;
            l.b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bqq);
            l.b(linearLayout, "");
            linearLayout.setSelected(z);
            if (z) {
                View view2 = this.itemView;
                l.b(view2, "");
                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.bqq);
                l.b(linearLayout2, "");
                linearLayout2.setBackground(this.f105130e);
                View view3 = this.itemView;
                l.b(view3, "");
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.bqq);
                l.b(linearLayout3, "");
                View view4 = this.itemView;
                l.b(view4, "");
                ((TuxTextView) linearLayout3.findViewById(R.id.text)).setTextColor(view4.getResources().getColor(R.color.a9));
                return;
            }
            View view5 = this.itemView;
            l.b(view5, "");
            LinearLayout linearLayout4 = (LinearLayout) view5.findViewById(R.id.bqq);
            l.b(linearLayout4, "");
            linearLayout4.setBackground(this.f105129d);
            View view6 = this.itemView;
            l.b(view6, "");
            LinearLayout linearLayout5 = (LinearLayout) view6.findViewById(R.id.bqq);
            l.b(linearLayout5, "");
            View view7 = this.itemView;
            l.b(view7, "");
            Context context = view7.getContext();
            l.b(context, "");
            ((TuxTextView) linearLayout5.findViewById(R.id.text)).setTextColor(context.getResources().getColor(R.color.bx));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, View view) {
            super(view);
            l.d(view, "");
            this.f105127b = jVar;
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.journey.ui.a a2 = com.ss.android.ugc.aweme.journey.ui.b.a(context);
            this.f105128c = a2;
            c cVar = new c(view.getResources().getColor(R.color.f159928l), a2);
            this.f105129d = cVar;
            this.f105130e = new c(view.getResources().getColor(R.color.bh), a2);
            View view2 = this.itemView;
            l.b(view2, "");
            this.f105126a = (int) n.b(view2.getContext(), 28.0f);
            View view3 = this.itemView;
            l.b(view3, "");
            Context context2 = view3.getContext();
            l.b(context2, "");
            cVar.a(context2.getResources().getColor(R.color.b6));
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.journey.step.interestselector.j.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f105131a;

                static {
                    Covode.recordClassIndex(67407);
                }

                {
                    this.f105131a = r1;
                }

                public final void onClick(View view) {
                    ah ahVar;
                    String str;
                    ClickAgent.onClick(view);
                    int adapterPosition = this.f105131a.getAdapterPosition();
                    View view2 = this.f105131a.itemView;
                    String str2 = "";
                    l.b(view2, str2);
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bqq);
                    l.b(linearLayout, str2);
                    boolean isSelected = linearLayout.isSelected();
                    int i2 = this.f105131a.f105127b.f105123d;
                    List<ah> list = this.f105131a.f105127b.f105120a;
                    if (!(list == null || (ahVar = list.get(adapterPosition)) == null || (str = ahVar.f104832a) == null)) {
                        str2 = str;
                    }
                    com.ss.android.ugc.aweme.interest.b bVar = new com.ss.android.ugc.aweme.interest.b(i2, str2, adapterPosition);
                    if (isSelected) {
                        this.f105131a.f105127b.f105124e.remove(bVar);
                    } else {
                        this.f105131a.f105127b.f105124e.add(bVar);
                    }
                    this.f105131a.a(!isSelected);
                    this.f105131a.f105127b.f105121b.invoke(Integer.valueOf(this.f105131a.f105127b.f105124e.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        ah ahVar;
        ah ahVar2;
        String str;
        String str2 = "";
        l.d(viewHolder, str2);
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            int adapterPosition = aVar.getAdapterPosition();
            List<ah> list = aVar.f105127b.f105120a;
            String str3 = null;
            if (list != null) {
                ahVar = list.get(adapterPosition);
            } else {
                ahVar = null;
            }
            View view = aVar.itemView;
            l.b(view, str2);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
            l.b(tuxTextView, str2);
            if (ahVar != null) {
                str3 = ahVar.f104833b;
            }
            tuxTextView.setText(str3);
            int i3 = aVar.f105127b.f105123d;
            List<ah> list2 = aVar.f105127b.f105120a;
            if (!(list2 == null || (ahVar2 = list2.get(adapterPosition)) == null || (str = ahVar2.f104832a) == null)) {
                str2 = str;
            }
            aVar.a(aVar.f105127b.f105124e.contains(new com.ss.android.ugc.aweme.interest.b(i3, str2, adapterPosition)));
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6254);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abq, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(jVar, a3);
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
        MethodCollector.o(6254);
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<ah> list, b<? super Integer, z> bVar, r rVar, int i2, HashSet<com.ss.android.ugc.aweme.interest.b> hashSet, int i3) {
        l.d(bVar, "");
        l.d(hashSet, "");
        this.f105120a = list;
        this.f105121b = bVar;
        this.f105122c = rVar;
        this.f105123d = i2;
        this.f105124e = hashSet;
        this.f105125f = i3;
    }
}
