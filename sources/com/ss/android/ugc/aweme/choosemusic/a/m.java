package com.ss.android.ugc.aweme.choosemusic.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.ao;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class m extends f<ao> {

    /* renamed from: a  reason: collision with root package name */
    public int f70320a = 0;

    /* renamed from: b  reason: collision with root package name */
    final k f70321b;

    static {
        Covode.recordClassIndex(43373);
    }

    public m(k kVar) {
        l.d(kVar, "");
        this.f70321b = kVar;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f70322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f70323b;

        static {
            Covode.recordClassIndex(43374);
        }

        a(m mVar, int i2) {
            this.f70322a = mVar;
            this.f70323b = i2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m mVar = this.f70322a;
            Object obj = mVar.e().get(this.f70323b);
            l.b(obj, "");
            mVar.notifyDataSetChanged();
            mVar.f70321b.a((ao) obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            l.b();
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3h, viewGroup, false);
        l.b(a2, "");
        return new n(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof n) {
            n nVar = (n) viewHolder;
            Object obj = e().get(i2);
            l.b(obj, "");
            ao aoVar = (ao) obj;
            boolean e2 = CommerceMediaServiceImpl.f().e();
            l.d(aoVar, "");
            TextView textView = nVar.f70324a;
            View view = nVar.itemView;
            l.b(view, "");
            textView.setText(view.getContext().getString(aoVar.f70639b));
            if (aoVar.f70638a == e2) {
                nVar.f70324a.setAlpha(1.0f);
                nVar.f70325b.setVisibility(0);
            } else {
                nVar.f70324a.setAlpha(0.5f);
                nVar.f70325b.setVisibility(8);
            }
            viewHolder.itemView.setOnClickListener(new a(this, i2));
        }
    }
}
