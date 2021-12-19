package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.b;

public final class LinkTypeTagsPriorityManagerImpl implements ILinkTypeTagsPriorityManager {
    static {
        Covode.recordClassIndex(79510);
    }

    public static ILinkTypeTagsPriorityManager createILinkTypeTagsPriorityManagerbyMonsterPlugin(boolean z) {
        Object a2 = b.a(ILinkTypeTagsPriorityManager.class, z);
        if (a2 != null) {
            return (ILinkTypeTagsPriorityManager) a2;
        }
        return new LinkTypeTagsPriorityManagerImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowAnchor(Aweme aweme) {
        if (aweme == null || com.ss.android.ugc.aweme.commercialize.e.a.b.i(aweme)) {
            return false;
        }
        ac a2 = bh.a(aweme);
        if (a2 == null || !a2.showOnFeed()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowCommerce(Aweme aweme, boolean z, int i2) {
        return com.ss.android.ugc.aweme.commercialize.link.b.a("shopping_cart", aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowMovie(Aweme aweme, boolean z, int i2) {
        return com.ss.android.ugc.aweme.commercialize.link.b.a("movie", aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i2) {
        return com.ss.android.ugc.aweme.commercialize.link.b.a("open_platform", aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager
    public final boolean shouldShowSticker(Aweme aweme, boolean z, int i2) {
        return com.ss.android.ugc.aweme.commercialize.link.b.a("sticker", aweme, z);
    }
}
