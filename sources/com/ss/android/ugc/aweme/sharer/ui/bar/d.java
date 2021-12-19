package com.ss.android.ugc.aweme.sharer.ui.bar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class d extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends com.ss.android.ugc.aweme.sharer.b> f124637a;

    /* renamed from: b  reason: collision with root package name */
    public final f f124638b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f124639c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f124640d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f124641e;

    /* renamed from: f  reason: collision with root package name */
    private final int f124642f;

    static {
        Covode.recordClassIndex(81900);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f124637a.size();
    }

    public final void a(List<? extends com.ss.android.ugc.aweme.sharer.b> list) {
        l.d(list, "");
        this.f124637a = list;
        notifyDataSetChanged();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f124645a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f124646b;

        static {
            Covode.recordClassIndex(81902);
        }

        b(d dVar, int i2) {
            this.f124645a = dVar;
            this.f124646b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200)) {
                this.f124645a.f124638b.a_((com.ss.android.ugc.aweme.sharer.b) this.f124645a.f124637a.get(this.f124646b));
            }
        }
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final RemoteImageView f124643a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f124644b;

        static {
            Covode.recordClassIndex(81901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.e0m);
            l.b(findViewById, "");
            this.f124643a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.e0n);
            l.b(findViewById2, "");
            this.f124644b = (TextView) findViewById2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        if (r15 == (r13.f124637a.size() - 1)) goto L_0x00b2;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.sharer.ui.bar.d.a r14, int r15) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sharer.ui.bar.d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        int color;
        MethodCollector.i(13358);
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ahi, viewGroup, false);
        l.b(a2, "");
        a aVar = new a(a2);
        if (dVar.f124641e) {
            aVar.f124644b.setVisibility(8);
        } else {
            a2.getLayoutParams().width = dVar.f124639c.getResources().getDimensionPixelOffset(R.dimen.s_);
        }
        if (dVar.f124640d) {
            int dimensionPixelOffset = dVar.f124639c.getResources().getDimensionPixelOffset(R.dimen.s9);
            aVar.f124643a.getLayoutParams().height = dimensionPixelOffset;
            aVar.f124643a.getLayoutParams().width = dimensionPixelOffset;
        }
        TextView textView = aVar.f124644b;
        Integer valueOf = Integer.valueOf(dVar.f124642f);
        boolean z = true;
        if (valueOf.intValue() == 0 || valueOf == null) {
            color = viewGroup.getResources().getColor(R.color.a3);
        } else {
            color = valueOf.intValue();
        }
        textView.setTextColor(color);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.o(13358);
        return aVar;
    }

    public /* synthetic */ d(Context context, f fVar, boolean z, boolean z2) {
        this(context, fVar, z, z2, 0);
    }

    public d(Context context, f fVar, boolean z, boolean z2, int i2) {
        l.d(context, "");
        l.d(fVar, "");
        this.f124639c = context;
        this.f124638b = fVar;
        this.f124640d = z;
        this.f124641e = z2;
        this.f124642f = i2;
        this.f124637a = z.INSTANCE;
    }
}
