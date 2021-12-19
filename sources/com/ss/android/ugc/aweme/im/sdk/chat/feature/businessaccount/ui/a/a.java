package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class a extends RecyclerView.a<View$OnClickListenerC2471a> {

    /* renamed from: a  reason: collision with root package name */
    public b f100411a;

    /* renamed from: b  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b> f100412b = z.INSTANCE;

    public interface b {
        static {
            Covode.recordClassIndex(64146);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(64144);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ View$OnClickListenerC2471a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f100412b.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.a.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2471a extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final a f100413a;

        static {
            Covode.recordClassIndex(64145);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f100413a.f100411a;
            if (bVar != null) {
                bVar.a(getAdapterPosition());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public View$OnClickListenerC2471a(a aVar, View view) {
            super(view);
            l.d(aVar, "");
            l.d(view, "");
            this.f100413a = aVar;
            view.setOnClickListener(this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(View$OnClickListenerC2471a aVar, int i2) {
        View$OnClickListenerC2471a aVar2 = aVar;
        l.d(aVar2, "");
        int i3 = this.f100412b.get(i2).f100385b;
        int i4 = R.string.a9;
        if (i3 == 1) {
            i4 = R.string.h45;
        } else if (i3 == 2) {
            i4 = R.string.ff0;
        } else if (i3 == 3) {
            i4 = R.string.vd;
        }
        View view = aVar2.itemView;
        l.b(view, "");
        ((TuxTextView) view.findViewById(R.id.f64)).setText(i4);
        String str = this.f100412b.get(i2).f100387d;
        if (str == null) {
            str = "";
        }
        l.d(str, "");
        View view2 = aVar2.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.evv);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
        String str2 = this.f100412b.get(i2).f100386c;
        if (str2 == null) {
            str2 = "";
        }
        l.d(str2, "");
        View view3 = aVar2.itemView;
        l.b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.f1a);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(str2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4501);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8j, viewGroup, false);
        l.b(a3, "");
        View$OnClickListenerC2471a aVar2 = new View$OnClickListenerC2471a(aVar, a3);
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
        MethodCollector.o(4501);
        return aVar2;
    }
}
