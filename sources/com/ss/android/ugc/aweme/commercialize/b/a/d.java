package com.ss.android.ugc.aweme.commercialize.b.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.b.c;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import java.util.Map;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final TextView f73708a;

    static {
        Covode.recordClassIndex(45349);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.f19);
        l.b(findViewById, "");
        this.f73708a = (TextView) findViewById;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f73709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f73710b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WikipediaInfo f73711c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f73712d;

        static {
            Covode.recordClassIndex(45350);
        }

        a(d dVar, b bVar, WikipediaInfo wikipediaInfo, Map map) {
            this.f73709a = dVar;
            this.f73710b = bVar;
            this.f73711c = wikipediaInfo;
            this.f73712d = map;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73710b.invoke(this.f73711c);
            View view2 = this.f73709a.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            c.a(context, this.f73711c, this.f73712d);
        }
    }
}
