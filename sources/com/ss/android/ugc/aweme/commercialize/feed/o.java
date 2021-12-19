package com.ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.x.b.c;
import com.bytedance.x.b.g;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f74258a;

    static {
        Covode.recordClassIndex(45823);
    }

    o(h hVar) {
        this.f74258a = hVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h hVar = this.f74258a;
        c a2 = br.a(hVar.o, "AdChoices");
        if (!(a2 == null || b.a((Collection) a2.clickList))) {
            bs.a(a2);
            for (g gVar : a2.clickList) {
                if (!TextUtils.isEmpty(gVar.clickThrough)) {
                    w.a(hVar.ae, hVar.o, gVar.clickThrough, (String) null);
                    return;
                }
            }
        }
    }
}
