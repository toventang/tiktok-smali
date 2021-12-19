package com.ss.android.ugc.aweme.kids.commonfeed.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class d extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.kids.commonfeed.report.a.a> f106005a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Context f106006b;

    static {
        Covode.recordClassIndex(67817);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f106005a.size();
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TuxTextCell f106007a;

        static {
            Covode.recordClassIndex(67818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.di1);
            l.b(findViewById, "");
            this.f106007a = (TuxTextCell) findViewById;
        }
    }

    public d(Context context) {
        l.d(context, "");
        this.f106006b = context;
    }

    static final class c extends m implements h.f.a.b<ImageView, z> {
        final /* synthetic */ v $builder;

        static {
            Covode.recordClassIndex(67820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v vVar) {
            super(1);
            this.$builder = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ImageView imageView) {
            ImageView imageView2 = imageView;
            l.d(imageView2, "");
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            imageView2.setLayoutParams(layoutParams);
            v vVar = this.$builder;
            vVar.F = imageView2;
            vVar.c();
            return z.f158842a;
        }
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.d f106008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.report.a.a f106009b;

        static {
            Covode.recordClassIndex(67819);
        }

        b(c.d dVar, com.ss.android.ugc.aweme.kids.commonfeed.report.a.a aVar) {
            this.f106008a = dVar;
            this.f106009b = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            l.d(compoundButton, "");
            h.f.a.b<? super Boolean, z> bVar = this.f106009b.f106160a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f106008a.g()));
            }
            if (this.f106008a.g()) {
                f.a("choose_report_reason", new com.ss.android.ugc.aweme.app.f.c().a("object_type", "video").a("reason_id", String.valueOf(this.f106009b.f106164e)).a());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0047  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.kids.commonfeed.b.d.a r6, int r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.b.d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7695);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(dVar.f106006b), R.layout.ad8, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(a3);
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
        MethodCollector.o(7695);
        return aVar;
    }
}
