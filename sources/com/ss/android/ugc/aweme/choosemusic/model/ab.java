package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.List;

final /* synthetic */ class ab implements IAVInfoService.IGetInfoCallback {

    /* renamed from: a  reason: collision with root package name */
    private final IAVInfoService.IGetInfoCallback f70605a;

    /* renamed from: b  reason: collision with root package name */
    private final List f70606b;

    static {
        Covode.recordClassIndex(43544);
    }

    ab(IAVInfoService.IGetInfoCallback iGetInfoCallback, List list) {
        this.f70605a = iGetInfoCallback;
        this.f70606b = list;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Object obj) {
        List list = (List) obj;
        this.f70605a.finish(list);
        a.a(2, "Local Sound filter result", u.a(list));
    }
}
