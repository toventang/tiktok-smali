package com.ss.android.ugc.aweme.publish;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final IDraftService.OnGetRecoverDraftCallback f118837a;

    static {
        Covode.recordClassIndex(77196);
    }

    q(IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.f118837a = onGetRecoverDraftCallback;
    }

    @Override // b.g
    public final Object then(i iVar) {
        IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback = this.f118837a;
        c cVar = (c) iVar.d();
        if (cVar != null) {
            onGetRecoverDraftCallback.onSuccess(cVar);
            return null;
        }
        onGetRecoverDraftCallback.onFail();
        return null;
    }
}
