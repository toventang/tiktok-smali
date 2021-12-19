package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.barrage.b.f;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TaggedPeopleEditCell extends PowerCell<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71624a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71625b;

    static {
        Covode.recordClassIndex(44063);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44064);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jp, viewGroup, false);
        this.f71625b = (SmartImageView) a2.findViewById(R.id.ov);
        l.b(a2, "");
        return a2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71626a;

        static {
            Covode.recordClassIndex(44065);
        }

        b(f fVar) {
            this.f71626a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            d dVar = new d();
            com.ss.android.ugc.aweme.comment.barrage.b bVar = this.f71626a.f71561b;
            String str4 = "";
            if (bVar == null || (str = bVar.enterFrom) == null) {
                str = str4;
            }
            d a2 = dVar.a("enter_from", str);
            com.ss.android.ugc.aweme.comment.barrage.b bVar2 = this.f71626a.f71561b;
            if (bVar2 == null || (str2 = bVar2.awemeId) == null) {
                str2 = str4;
            }
            d a3 = a2.a("group_id", str2);
            com.ss.android.ugc.aweme.comment.barrage.b bVar3 = this.f71626a.f71561b;
            if (!(bVar3 == null || (str3 = bVar3.authorUid) == null)) {
                str4 = str3;
            }
            r.a("click_tagged_user", a3.a("author_id", str4).a("click_type", "click_edit").a("anchor_type", "low_interest").f66730a);
            DataCenter dataCenter = this.f71626a.f71560a;
            if (dataCenter != null) {
                dataCenter.a("TAGGED_PEOPLE_ACTION", (Object) 2);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) fVar2);
        v a2 = com.bytedance.lighten.a.r.a(2131231231).a("TaggedPeopleActionCell");
        a2.E = this.f71625b;
        a2.c();
        this.itemView.setOnClickListener(new b(fVar2));
    }
}
