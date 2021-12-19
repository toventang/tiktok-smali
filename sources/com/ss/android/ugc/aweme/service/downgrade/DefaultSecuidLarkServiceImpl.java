package com.ss.android.ugc.aweme.service.downgrade;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ISecUidDependService;
import h.f.b.l;

public final class DefaultSecuidLarkServiceImpl implements ISecUidDependService {
    static {
        Covode.recordClassIndex(79381);
    }

    @Override // com.ss.android.ugc.aweme.utils.ISecUidDependService
    public final void checkLarkEmail(String str, ISecUidDependService.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.utils.ISecUidDependService
    public final void reportToChat(String str, String str2, String str3, String str4, String str5, String str6) {
    }
}
