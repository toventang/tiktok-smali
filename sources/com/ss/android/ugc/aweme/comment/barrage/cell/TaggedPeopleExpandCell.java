package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.barrage.b.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TaggedPeopleExpandCell extends PowerCell<g> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71627a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f71628b;

    static {
        Covode.recordClassIndex(44066);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44067);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f71629a;

        static {
            Covode.recordClassIndex(44068);
        }

        b(g gVar) {
            this.f71629a = gVar;
        }

        public final void onClick(View view) {
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (dataCenter = this.f71629a.f71564c) != null) {
                dataCenter.a("TAGGED_PEOPLE_ACTION", (Object) 4);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jr, viewGroup, false);
        this.f71628b = (TuxTextView) a2.findViewById(R.id.ays);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) gVar2);
        TuxTextView tuxTextView = this.f71628b;
        if (tuxTextView != null) {
            i.a.a.a.a.b.c(tuxTextView);
        }
        String str = "+" + ((gVar2.f71562a - gVar2.f71563b) + 2);
        TuxTextView tuxTextView2 = this.f71628b;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(str);
        }
        this.itemView.setOnClickListener(new b(gVar2));
    }
}
