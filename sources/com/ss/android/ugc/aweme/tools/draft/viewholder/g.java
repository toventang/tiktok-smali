package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.d.l;
import com.zhiliaoapp.musically.R;

public final class g extends a<l> {

    /* renamed from: a  reason: collision with root package name */
    public Context f139925a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.f.a f139926b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f139927c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f139928d;

    /* renamed from: e  reason: collision with root package name */
    private l f139929e;

    static {
        Covode.recordClassIndex(91439);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f139930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f139931b;

        static {
            Covode.recordClassIndex(91440);
        }

        a(g gVar, l lVar) {
            this.f139930a = gVar;
            this.f139931b = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.b.l.d(view, "");
            this.f139930a.f139926b.a(view, this.f139930a.f139925a, this.f139931b.f139510d);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.a
    public final /* synthetic */ void a(l lVar) {
        TextView textView;
        l lVar2 = lVar;
        h.f.b.l.d(lVar2, "");
        this.f139929e = lVar2;
        if (lVar2 == null) {
            h.f.b.l.a("mData");
        }
        int i2 = 4;
        if (lVar2.f139477b) {
            textView = this.f139928d;
            if (textView == null) {
                h.f.b.l.a("mNext");
            }
        } else {
            textView = this.f139928d;
            if (textView == null) {
                h.f.b.l.a("mNext");
            }
            l lVar3 = this.f139929e;
            if (lVar3 == null) {
                h.f.b.l.a("mData");
            }
            if (!lVar3.f139476a) {
                i2 = 0;
            }
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f139927c;
        if (textView2 == null) {
            h.f.b.l.a("mMusicName");
        }
        textView2.setText(lVar2.f139509c);
        TextView textView3 = this.f139928d;
        if (textView3 == null) {
            h.f.b.l.a("mNext");
        }
        textView3.setOnClickListener(new a(this, lVar2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, com.ss.android.ugc.aweme.tools.draft.f.a aVar) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        this.f139926b = aVar;
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.f139925a = context;
        View c2 = v.c(view, (int) R.id.f37);
        h.f.b.l.b(c2, "");
        this.f139927c = (TextView) c2;
        View c3 = v.c(view, (int) R.id.ev_);
        h.f.b.l.b(c3, "");
        this.f139928d = (TextView) c3;
    }
}
