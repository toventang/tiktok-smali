package com.ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFrameCheckService;
import com.ss.android.ugc.aweme.tools.extract.ab;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements ab.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f140142a;

    static {
        Covode.recordClassIndex(91570);
    }

    j(Context context) {
        this.f140142a = context;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.ab.a
    public final void a(String str) {
        Context context = this.f140142a;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).a(context, str);
    }
}
