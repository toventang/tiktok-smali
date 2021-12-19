package com.ss.android.ugc.aweme.kids.discovery.list;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.discovery.c.c;
import com.ss.android.ugc.aweme.kids.discovery.list.c;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106500b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.kids.discovery.c.a> f106501a = new ArrayList();

    static {
        Covode.recordClassIndex(68050);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return 2147483644;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68051);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f106501a.size();
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3582);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.acs, viewGroup, false);
        l.b(a3, "");
        c cVar = new c(a3);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(3582);
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        String str3;
        c cVar;
        c cVar2;
        MethodCollector.i(3892);
        l.d(viewHolder, "");
        com.ss.android.ugc.aweme.kids.discovery.c.a aVar = this.f106501a.get(i2);
        c cVar3 = (c) viewHolder;
        if (aVar != null) {
            View view = cVar3.itemView;
            l.b(view, "");
            int i3 = 0;
            o.a(view.findViewById(R.id.dqe), 0);
            c cVar4 = aVar.f106428b;
            if (cVar3.f106504a == null) {
                cVar3.f106504a = new a(cVar3.f106505b);
                a aVar2 = cVar3.f106504a;
                if (aVar2 == null) {
                    l.a("mAdapter");
                }
                aVar2.f106493d = aVar;
                View view2 = new View(cVar3.f106505b);
                view2.setLayoutParams(new ViewGroup.LayoutParams((int) n.b(cVar3.f106505b, 14.0f), -1));
                a aVar3 = cVar3.f106504a;
                if (aVar3 == null) {
                    l.a("mAdapter");
                }
                aVar3.a(view2);
                View view3 = cVar3.itemView;
                l.b(view3, "");
                RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.drj);
                l.b(recyclerView, "");
                a aVar4 = cVar3.f106504a;
                if (aVar4 == null) {
                    l.a("mAdapter");
                }
                recyclerView.setAdapter(aVar4);
            }
            if (cVar4 != null) {
                View view4 = cVar3.itemView;
                l.b(view4, "");
                ImageView imageView = (ImageView) view4.findViewById(R.id.amo);
                l.b(imageView, "");
                imageView.setVisibility(8);
                if (hk.a(cVar4.f106436d)) {
                    String str4 = cVar4.f106436d;
                    if (str4 == null) {
                        l.b();
                    }
                    v a2 = r.a(str4);
                    View view5 = cVar3.itemView;
                    l.b(view5, "");
                    a2.E = (SmartImageView) view5.findViewById(R.id.c2f);
                    a2.c();
                } else {
                    View view6 = cVar3.itemView;
                    l.b(view6, "");
                    ((SmartImageView) view6.findViewById(R.id.c2f)).setImageResource(2131232968);
                }
                if (!TextUtils.isEmpty(cVar4.f106437e)) {
                    View view7 = cVar3.itemView;
                    l.b(view7, "");
                    TuxTextView tuxTextView = (TuxTextView) view7.findViewById(R.id.f_3);
                    l.b(tuxTextView, "");
                    tuxTextView.setText(cVar4.f106437e);
                    View view8 = cVar3.itemView;
                    l.b(view8, "");
                    TuxTextView tuxTextView2 = (TuxTextView) view8.findViewById(R.id.f_3);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                } else {
                    View view9 = cVar3.itemView;
                    l.b(view9, "");
                    TuxTextView tuxTextView3 = (TuxTextView) view9.findViewById(R.id.f_3);
                    l.b(tuxTextView3, "");
                    tuxTextView3.setVisibility(8);
                }
                View view10 = cVar3.itemView;
                l.b(view10, "");
                TuxTextView tuxTextView4 = (TuxTextView) view10.findViewById(R.id.f9l);
                l.b(tuxTextView4, "");
                tuxTextView4.setText(cVar4.f106434b);
                a aVar5 = cVar3.f106504a;
                if (aVar5 == null) {
                    l.a("mAdapter");
                }
                aVar5.f106496g = cVar4.f106433a;
                a aVar6 = cVar3.f106504a;
                if (aVar6 == null) {
                    l.a("mAdapter");
                }
                aVar6.f106495f = 0;
                a aVar7 = cVar3.f106504a;
                if (aVar7 == null) {
                    l.a("mAdapter");
                }
                aVar7.f106497h = cVar4.f106434b;
                a aVar8 = cVar3.f106504a;
                if (aVar8 == null) {
                    l.a("mAdapter");
                }
                aVar8.f106498i = cVar4.f106435c;
                View view11 = cVar3.itemView;
                l.b(view11, "");
                TuxTextView tuxTextView5 = (TuxTextView) view11.findViewById(R.id.f6u);
                l.b(tuxTextView5, "");
                if (aVar.f106428b.f106435c != 1) {
                    i3 = 8;
                }
                tuxTextView5.setVisibility(i3);
                View view12 = cVar3.itemView;
                l.b(view12, "");
                ((TuxTextView) view12.findViewById(R.id.f6u)).setOnClickListener(new c.b(cVar3, cVar4));
            }
            a aVar9 = cVar3.f106504a;
            if (aVar9 == null) {
                l.a("mAdapter");
            }
            IReportAwemeManager iReportAwemeManager = c.f106502d;
            List<? extends Aweme> list = aVar.f106427a;
            if (list == null) {
                list = z.INSTANCE;
            }
            aVar9.b_(iReportAwemeManager.a(list));
        }
        cVar3.f106506c = true;
        if (cVar3.f106504a != null) {
            a aVar10 = cVar3.f106504a;
            if (aVar10 == null) {
                l.a("mAdapter");
            }
            aVar10.f106494e = true;
        }
        if (aVar == null || (cVar2 = aVar.f106428b) == null || cVar2.f106435c != 1) {
            str = "show_trending_content";
            str2 = "trending_content_id";
        } else {
            str = "show_category";
            str2 = "category_id";
        }
        com.ss.android.ugc.aweme.app.f.c a3 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "discovery").a("order", Integer.valueOf(i2));
        if (aVar == null || (cVar = aVar.f106428b) == null) {
            str3 = null;
        } else {
            str3 = cVar.f106433a;
        }
        f.a(str, a3.a(str2, str3).a());
        MethodCollector.o(3892);
    }
}
