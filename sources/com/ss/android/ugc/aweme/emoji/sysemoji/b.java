package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
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
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public i f89355a;

    /* renamed from: b  reason: collision with root package name */
    public int f89356b;

    /* renamed from: c  reason: collision with root package name */
    private final h f89357c = i.a((h.f.a.a) c.f89362a);

    /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$b  reason: collision with other inner class name */
    public static final class C2162b extends RecyclerView.ViewHolder {

        /* renamed from: b  reason: collision with root package name */
        public static final a f89360b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        final TextView f89361a;

        static {
            Covode.recordClassIndex(56153);
        }

        /* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.b$b$a */
        public static final class a {
            static {
                Covode.recordClassIndex(56154);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2162b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.avi);
            l.b(findViewById, "");
            this.f89361a = (TextView) findViewById;
        }
    }

    static {
        Covode.recordClassIndex(56151);
    }

    public final List<a> a() {
        return (List) this.f89357c.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    static final class c extends m implements h.f.a.a<List<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89362a = new c();

        static {
            Covode.recordClassIndex(56155);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<a> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return a().size();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f89358a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f89359b = false;

        static {
            Covode.recordClassIndex(56152);
        }

        public a(String str) {
            l.d(str, "");
            this.f89358a = str;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof C2162b) {
            C2162b bVar = (C2162b) viewHolder;
            a aVar = a().get(i2);
            l.d(aVar, "");
            bVar.f89361a.setText(aVar.f89358a);
            if (aVar.f89359b) {
                bVar.f89361a.setBackgroundResource(R.drawable.blr);
            } else {
                bVar.f89361a.setBackgroundResource(R.drawable.blq);
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3026);
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        l.d(context, "");
        View a3 = com.a.a(LayoutInflater.from(context), R.layout.z8, null, false);
        l.b(a3, "");
        C2162b bVar = new C2162b(a3);
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
        MethodCollector.o(3026);
        return bVar;
    }
}
