package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFrameCheckService;
import com.ss.android.ugc.aweme.tools.extract.ab;

final /* synthetic */ class cn implements ab.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f125142a;

    static {
        Covode.recordClassIndex(82192);
    }

    cn(Context context) {
        this.f125142a = context;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.ab.a
    public final void a(String str) {
        Context context = this.f125142a;
        if (str == null) {
            str = "";
        }
        ((IFrameCheckService) ServiceManager.get().getService(IFrameCheckService.class)).a(context, str);
    }
}
