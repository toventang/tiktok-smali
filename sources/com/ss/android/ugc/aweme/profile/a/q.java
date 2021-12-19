package com.ss.android.ugc.aweme.profile.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class q extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public b f115892a;

    /* renamed from: b  reason: collision with root package name */
    public final List<LiveEventStruct> f115893b;

    public interface b {
        static {
            Covode.recordClassIndex(74745);
        }

        void a(LiveEventStruct liveEventStruct);
    }

    static {
        Covode.recordClassIndex(74743);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f115893b.size();
    }

    public q(List<LiveEventStruct> list) {
        l.d(list, "");
        this.f115893b = list;
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final View f115894a;

        /* renamed from: b  reason: collision with root package name */
        final TuxTextView f115895b;

        /* renamed from: c  reason: collision with root package name */
        final TuxTextView f115896c;

        /* renamed from: d  reason: collision with root package name */
        public final View f115897d;

        static {
            Covode.recordClassIndex(74744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.bsg);
            l.b(findViewById, "");
            this.f115894a = findViewById;
            View findViewById2 = view.findViewById(R.id.cd2);
            l.b(findViewById2, "");
            this.f115895b = (TuxTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cd1);
            l.b(findViewById3, "");
            this.f115896c = (TuxTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.anj);
            l.b(findViewById4, "");
            this.f115897d = findViewById4;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f115898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f115899b;

        static {
            Covode.recordClassIndex(74746);
        }

        c(q qVar, int i2) {
            this.f115898a = qVar;
            this.f115899b = i2;
        }

        public final void onClick(View view) {
            b bVar;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (bVar = this.f115898a.f115892a) != null) {
                bVar.a(this.f115898a.f115893b.get(this.f115899b));
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8459);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aow, viewGroup, false);
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
        MethodCollector.o(8459);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        String str = "";
        l.d(aVar2, str);
        LiveEventStruct liveEventStruct = this.f115893b.get(i2);
        l.d(liveEventStruct, str);
        aVar2.f115895b.setText(liveEventStruct.getTitle());
        TuxTextView tuxTextView = aVar2.f115896c;
        long startTime = liveEventStruct.getStartTime();
        long millis = TimeUnit.SECONDS.toMillis(startTime);
        if (startTime != 0) {
            if (bo.b(millis)) {
                str = BDDateFormat.a(aa.a.c(), millis);
            } else if (bo.a(millis)) {
                str = BDDateFormat.a(aa.a.d(), millis);
            } else if (bo.c(millis)) {
                str = BDDateFormat.a(aa.a.e(), millis);
            } else if (!aa.a.f(millis)) {
                str = BDDateFormat.a(aa.a.a(), millis);
            } else {
                str = BDDateFormat.a((BDDateFormat) aa.f142597h.getValue(), millis);
            }
        }
        tuxTextView.setText(str);
        if (i2 == getItemCount() - 1) {
            aVar2.f115897d.setVisibility(4);
        }
        aVar2.itemView.setOnClickListener(new c(this, i2));
    }
}
