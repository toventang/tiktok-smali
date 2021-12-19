package com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<b> {

    /* renamed from: f  reason: collision with root package name */
    public static final C3731a f140909f = new C3731a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<MvThemeData> f140910a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.mvtemplate.a f140911b;

    /* renamed from: c  reason: collision with root package name */
    public c f140912c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f140913d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f140914e = true;

    public interface c {
        static {
            Covode.recordClassIndex(92020);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(92017);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$a  reason: collision with other inner class name */
    public static final class C3731a {
        static {
            Covode.recordClassIndex(92018);
        }

        private C3731a() {
        }

        public /* synthetic */ C3731a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f140910a.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 == 0 || i2 == getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f140918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f140919c;

        static {
            Covode.recordClassIndex(92021);
        }

        d(c cVar, b bVar, int i2) {
            this.f140917a = cVar;
            this.f140918b = bVar;
            this.f140919c = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(view, "");
            this.f140917a.a(this.f140919c - 1);
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final SimpleDraweeView f140915a;

        /* renamed from: b  reason: collision with root package name */
        public final View f140916b;

        static {
            Covode.recordClassIndex(92019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.bvr);
            l.b(findViewById, "");
            this.f140915a = (SimpleDraweeView) findViewById;
            View findViewById2 = view.findViewById(R.id.ci9);
            l.b(findViewById2, "");
            this.f140916b = findViewById2;
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6820);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aag, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3);
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
        MethodCollector.o(6820);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        com.ss.android.ugc.aweme.tools.mvtemplate.a aVar;
        b bVar2 = bVar;
        l.d(bVar2, "");
        if (this.f140913d && getItemCount() - i2 <= 5 && (aVar = this.f140911b) != null) {
            aVar.a();
        }
        int i3 = 0;
        if (i2 == 0) {
            Context context = bVar2.f140915a.getContext();
            l.b(context, "");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((dh.b(context) / 2) - (b.a(context) / 2), 0);
            View view = bVar2.itemView;
            l.b(view, "");
            view.setLayoutParams(layoutParams);
        } else if (i2 == getItemCount() - 1) {
            Context context2 = bVar2.f140915a.getContext();
            l.b(context2, "");
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams((dh.b(context2) / 2) - (b.a(context2) / 2), -1);
            View view2 = bVar2.itemView;
            l.b(view2, "");
            view2.setLayoutParams(layoutParams2);
            bVar2.f140915a.setVisibility(8);
            View view3 = bVar2.f140916b;
            if (!this.f140914e) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        } else {
            bVar2.f140915a.setImageURI(this.f140910a.get(i2 - 1).g());
            c cVar = this.f140912c;
            if (cVar != null) {
                bVar2.f140915a.setOnClickListener(new d(cVar, bVar2, i2));
            }
        }
    }
}
