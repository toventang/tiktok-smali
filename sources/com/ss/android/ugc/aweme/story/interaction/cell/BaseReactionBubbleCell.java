package com.ss.android.ugc.aweme.story.interaction.cell;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.e;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.interaction.b.e;
import com.ss.android.ugc.aweme.story.interaction.b.g;
import h.f.b.l;

public abstract class BaseReactionBubbleCell<T extends e> extends PowerCell<T> {
    static {
        Covode.recordClassIndex(90200);
    }

    public static com.bytedance.lighten.a.e a() {
        e.a aVar = new e.a();
        aVar.f39827a = true;
        com.bytedance.lighten.a.e a2 = aVar.a();
        l.b(a2, "");
        return a2;
    }

    public final void a(User user, g gVar) {
        l.d(user, "");
        if (gVar != null) {
            q f2 = new q().g(gVar.f137853a);
            String str = gVar.f137854b;
            if (str == null) {
                str = "";
            }
            q qVar = (q) f2.o(str).a("click_head");
            qVar.Y = "story_detail";
            qVar.Z = "bullet";
            qVar.V = gVar.f137856d;
            qVar.W = gVar.f137857e;
            qVar.b_(gVar.f137858f).f();
        }
        View view = this.itemView;
        l.b(view, "");
        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/" + user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
    }
}
