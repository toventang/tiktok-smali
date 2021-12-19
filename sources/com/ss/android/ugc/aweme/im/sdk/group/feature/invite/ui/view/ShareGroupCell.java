package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.im.core.d.h;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class ShareGroupCell extends PowerCell<b> {
    static {
        Covode.recordClassIndex(65749);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102681a = new a();

        static {
            Covode.recordClassIndex(65750);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
            if (!(a2 instanceof RelationSelectActivity)) {
                a2 = null;
            }
            RelationSelectActivity relationSelectActivity = (RelationSelectActivity) a2;
            if (relationSelectActivity != null) {
                relationSelectActivity.setResult(2098);
                relationSelectActivity.finish();
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.b("member_list");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.d();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5_, viewGroup, false);
        l.b(a2, "");
        e a3 = f.a(b.f102682a);
        Context context = a2.getContext();
        l.b(context, "");
        a2.setBackground(a3.a(context));
        l.b(a2, "");
        return a2;
    }

    static final class b extends m implements h.f.a.b<e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102682a = new b();

        static {
            Covode.recordClassIndex(65751);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 0.5f, system2.getDisplayMetrics())));
            eVar2.f44780f = Integer.valueOf((int) R.attr.ao);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        String str;
        b bVar2 = bVar;
        l.d(bVar2, "");
        h a2 = a.C0745a.a().a(bVar2.f102686a);
        if (a2 != null) {
            e.a.a();
            str = com.ss.android.ugc.aweme.im.sdk.group.a.e.a(a2);
        } else {
            str = null;
        }
        View view = this.itemView;
        l.b(view, "");
        com.ss.android.ugc.aweme.base.e.b((RemoteImageView) view.findViewById(R.id.pf), str, -1, -1);
        this.itemView.setOnClickListener(a.f102681a);
    }
}
