package com.ss.android.ugc.aweme.im.sdk.share.panel.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.g;

public final class a extends IMContact {
    private final boolean hasShownGuide;

    static {
        Covode.recordClassIndex(66264);
    }

    public a() {
        this(false, 1, null);
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getDisplayName() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
    public final String getNickName() {
        return null;
    }

    public final boolean getHasShownGuide() {
        return this.hasShownGuide;
    }

    public a(boolean z) {
        this.hasShownGuide = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
