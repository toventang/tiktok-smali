package com.ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

final /* synthetic */ class e implements ISuperEntrancePrivacyService {

    /* renamed from: a  reason: collision with root package name */
    static final ISuperEntrancePrivacyService f104734a = new e();

    static {
        Covode.recordClassIndex(67140);
    }

    private e() {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService
    public final boolean hasPrivacyPermission(Context context) {
        return AVServiceProxyImpl.lambda$superEntrancePrivacyService$2$AVServiceProxyImpl(context);
    }
}
