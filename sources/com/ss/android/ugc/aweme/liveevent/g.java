package com.ss.android.ugc.aweme.liveevent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxRadio;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.utils.aa;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends com.ss.android.ugc.aweme.q.a.a<j, a> {

    /* renamed from: d  reason: collision with root package name */
    private final String f108666d;

    static {
        Covode.recordClassIndex(69639);
    }

    public final class a extends com.ss.android.ugc.aweme.q.a.a<j, a>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        public final SmartImageView f108667b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f108668c;

        /* renamed from: d  reason: collision with root package name */
        public final TextView f108669d;

        /* renamed from: e  reason: collision with root package name */
        public final TuxRadio f108670e;

        /* renamed from: f  reason: collision with root package name */
        public final View f108671f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f108672g;

        static {
            Covode.recordClassIndex(69640);
        }

        /* renamed from: com.ss.android.ugc.aweme.liveevent.g$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2786a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f108673a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f108674b;

            static {
                Covode.recordClassIndex(69641);
            }

            View$OnClickListenerC2786a(a aVar, j jVar) {
                this.f108673a = aVar;
                this.f108674b = jVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TuxRadio tuxRadio = this.f108673a.f108670e;
                l.b(tuxRadio, "");
                tuxRadio.setChecked(true);
                this.f108674b.f108690d = true;
                bl blVar = this.f108673a.f108672g.f118917b;
                if (blVar != null) {
                    blVar.a(this.f108674b);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view) {
            super(gVar, view);
            l.d(view, "");
            this.f108672g = gVar;
            this.f108667b = (SmartImageView) view.findViewById(R.id.biy);
            this.f108668c = (TextView) view.findViewById(R.id.euw);
            this.f108669d = (TextView) view.findViewById(R.id.eyc);
            this.f108670e = (TuxRadio) view.findViewById(R.id.a57);
            this.f108671f = view.findViewById(R.id.ca6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(bl blVar, String str) {
        super(blVar);
        l.d(str, "");
        this.f108666d = str;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9d, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        a aVar = (a) viewHolder;
        j jVar = (j) obj;
        l.d(aVar, "");
        l.d(jVar, "");
        l.d(jVar, "");
        v a2 = r.a(2131232687);
        a2.E = aVar.f108667b;
        a2.c();
        TextView textView = aVar.f108668c;
        l.b(textView, "");
        textView.setText(jVar.f108689c);
        TextView textView2 = aVar.f108669d;
        l.b(textView2, "");
        textView2.setText(aa.a.d(jVar.f108688b));
        TuxRadio tuxRadio = aVar.f108670e;
        l.b(tuxRadio, "");
        tuxRadio.setChecked(jVar.f108690d);
        if (jVar.f108691e) {
            View view = aVar.f108671f;
            l.b(view, "");
            view.setVisibility(8);
        }
        aVar.itemView.setOnClickListener(new a.View$OnClickListenerC2786a(aVar, jVar));
    }
}
