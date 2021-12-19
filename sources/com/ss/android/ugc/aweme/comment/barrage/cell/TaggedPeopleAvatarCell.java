package com.ss.android.ugc.aweme.comment.barrage.cell;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.barrage.b.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Set;

public final class TaggedPeopleAvatarCell extends PowerCell<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71619a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SmartImageView f71620b;

    /* renamed from: j  reason: collision with root package name */
    private e f71621j;

    static {
        Covode.recordClassIndex(44060);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44061);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
        e eVar = this.f71621j;
        if (eVar != null && !eVar.f71559c.contains(eVar.f71557a.getUid())) {
            Set<String> set = eVar.f71559c;
            String uid = eVar.f71557a.getUid();
            String str = "";
            l.b(uid, str);
            set.add(uid);
            d a2 = new d().a("enter_from", eVar.f71558b.enterFrom);
            String str2 = eVar.f71558b.awemeId;
            if (str2 == null) {
                str2 = str;
            }
            d a3 = a2.a("group_id", str2);
            String str3 = eVar.f71558b.authorUid;
            if (str3 == null) {
                str3 = str;
            }
            d a4 = a3.a("author_id", str3);
            String uid2 = eVar.f71557a.getUid();
            if (uid2 != null) {
                str = uid2;
            }
            r.a("show_tagged_user", a4.a("to_user_id", str).a("anchor_type", "low_interest").f66730a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jq, viewGroup, false);
        this.f71620b = (SmartImageView) a2.findViewById(R.id.ov);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        super.a((com.bytedance.ies.powerlist.b.a) eVar2);
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(eVar2.f71557a.getAvatarThumb())).a("TaggedPeopleAvatarCell");
        a2.E = this.f71620b;
        e.a aVar = new e.a();
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a3 = aVar.a();
        l.b(a3, "");
        a2.w = a3;
        a2.f39907c = true;
        a2.c();
        SmartImageView smartImageView = this.f71620b;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new b(this, eVar2));
        }
        this.f71621j = eVar2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaggedPeopleAvatarCell f71622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.comment.barrage.b.e f71623b;

        static {
            Covode.recordClassIndex(44062);
        }

        b(TaggedPeopleAvatarCell taggedPeopleAvatarCell, com.ss.android.ugc.aweme.comment.barrage.b.e eVar) {
            this.f71622a = taggedPeopleAvatarCell;
            this.f71623b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TaggedPeopleAvatarCell taggedPeopleAvatarCell = this.f71622a;
            User user = this.f71623b.f71557a;
            com.ss.android.ugc.aweme.comment.barrage.b.e eVar = this.f71623b;
            View view2 = taggedPeopleAvatarCell.itemView;
            String str = "";
            l.b(view2, str);
            SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
            com.ss.android.ugc.aweme.comment.barrage.b bVar = eVar.f71558b;
            q f2 = new q().g(bVar.aweme);
            String str2 = bVar.enterFrom;
            if (str2 == null) {
                str2 = str;
            }
            q qVar = (q) f2.o(str2).a("tag");
            qVar.q = user.getUid();
            qVar.f109594e = bVar.awemeId;
            qVar.p = bVar.authorUid;
            qVar.f();
            d a2 = new d().a("enter_from", eVar.f71558b.enterFrom);
            String str3 = eVar.f71558b.awemeId;
            if (str3 == null) {
                str3 = str;
            }
            d a3 = a2.a("group_id", str3);
            String str4 = eVar.f71558b.authorUid;
            if (str4 == null) {
                str4 = str;
            }
            d a4 = a3.a("author_id", str4);
            String uid = eVar.f71557a.getUid();
            if (uid != null) {
                str = uid;
            }
            r.a("click_tagged_user", a4.a("to_user_id", str).a("click_type", "click_head").a("anchor_type", "low_interest").f66730a);
        }
    }
}
