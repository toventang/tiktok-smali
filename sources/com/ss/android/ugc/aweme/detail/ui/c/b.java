package com.ss.android.ugc.aweme.detail.ui.c;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.b.h;
import h.f.b.l;

public final class b extends a {
    private SparseArray t;

    static {
        Covode.recordClassIndex(49741);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.detail.ui.c.a
    public final View a(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.detail.ui.c.a
    public final void e() {
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.detail.ui.c.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.detail.ui.z
    public final void onDestroy() {
        String str;
        super.onDestroy();
        com.ss.android.ugc.aweme.feed.param.b bVar = this.f79991j;
        l.b(bVar, "");
        String eventType = bVar.getEventType();
        l.b(eventType, "");
        com.ss.android.ugc.aweme.detail.h.b bVar2 = this.f79992k;
        l.b(bVar2, "");
        Aweme bL = bVar2.bL();
        if (bL == null || (str = bL.getAid()) == null) {
            str = "";
        }
        l.d(eventType, "");
        l.d(str, "");
        r.a("westwindow_play_end", new d().a("enter_from", eventType).a("enter_method", h.f136850a).a("last_group_id", str).f66730a);
        h.f136850a = "system";
    }
}
