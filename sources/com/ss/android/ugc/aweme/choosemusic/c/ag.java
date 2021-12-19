package com.ss.android.ugc.aweme.choosemusic.c;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.music.a.b;
import java.util.HashMap;

final /* synthetic */ class ag implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final af f70429a;

    static {
        Covode.recordClassIndex(43435);
    }

    ag(af afVar) {
        this.f70429a = afVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        af afVar = this.f70429a;
        if (b.a() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "change_music_page");
            hashMap.put("category_name", afVar.n);
            r.a("click_ad_sticker", hashMap);
            if (!CommerceServiceImpl.a().a(afVar.getContext(), afVar.p.f74851b.f74854c, false)) {
                CommerceServiceImpl.a().a(afVar.getContext(), afVar.p.f74851b.f74855d, afVar.p.f74851b.f74856e);
            }
        }
    }
}
