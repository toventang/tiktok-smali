package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.barrage.b.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TaggedPeopleFoldCell extends PowerCell<h> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71630a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71631b;

    static {
        Covode.recordClassIndex(44069);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44070);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f71632a;

        static {
            Covode.recordClassIndex(44071);
        }

        b(h hVar) {
            this.f71632a = hVar;
        }

        public final void onClick(View view) {
            DataCenter dataCenter;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (dataCenter = this.f71632a.f71565a) != null) {
                dataCenter.a("TAGGED_PEOPLE_ACTION", (Object) 3);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jp, viewGroup, false);
        this.f71631b = (SmartImageView) a2.findViewById(R.id.ov);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) hVar2);
        v a2 = r.a(2131231232).a("TaggedPeopleActionCell");
        a2.E = this.f71631b;
        a2.c();
        this.itemView.setOnClickListener(new b(hVar2));
    }
}
