package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.be.h;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class az implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77872a;

    static {
        Covode.recordClassIndex(48260);
    }

    az(a aVar) {
        this.f77872a = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        a aVar = this.f77872a;
        aVar.getContext();
        if (!a.e()) {
            aVar.c(R.string.de7);
        } else if (!((h) aVar.f77838m.f79368m).f68599c && !aVar.i()) {
            aVar.c(R.string.bc9);
        } else if (aVar.f77828c != null && aVar.f77829d != null) {
            aVar.f77838m.a(new ao(aVar));
            c cVar = aVar.f77829d;
            int i2 = 3;
            Object[] objArr = new Object[3];
            objArr[0] = "item_download";
            objArr[1] = Integer.valueOf(((h) aVar.f77838m.f79368m).f68599c ? 0 : 3);
            objArr[2] = aVar.f77828c.getAid();
            cVar.a(objArr);
            if (aVar.f77828c != null) {
                IAwemeService b2 = AwemeService.b();
                Aweme aweme = aVar.f77828c;
                if (((h) aVar.f77838m.f79368m).f68599c) {
                    i2 = 0;
                }
                b2.c(aweme, i2);
            }
        }
    }
}
