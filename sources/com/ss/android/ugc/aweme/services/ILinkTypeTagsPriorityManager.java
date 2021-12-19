package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface ILinkTypeTagsPriorityManager {
    static {
        Covode.recordClassIndex(79467);
    }

    boolean shouldShowAnchor(Aweme aweme);

    boolean shouldShowCommerce(Aweme aweme, boolean z, int i2);

    boolean shouldShowMovie(Aweme aweme, boolean z, int i2);

    boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i2);

    boolean shouldShowSticker(Aweme aweme, boolean z, int i2);

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79468);
        }

        public static /* synthetic */ boolean shouldShowCommerce$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    aweme = null;
                }
                if ((i3 & 2) != 0) {
                    z = false;
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowCommerce(aweme, z, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowCommerce");
        }

        public static /* synthetic */ boolean shouldShowMovie$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    aweme = null;
                }
                if ((i3 & 2) != 0) {
                    z = false;
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowMovie(aweme, z, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowMovie");
        }

        public static /* synthetic */ boolean shouldShowOpenPlatform$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    aweme = null;
                }
                if ((i3 & 2) != 0) {
                    z = false;
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowOpenPlatform(aweme, z, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowOpenPlatform");
        }

        public static /* synthetic */ boolean shouldShowSticker$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    aweme = null;
                }
                if ((i3 & 2) != 0) {
                    z = false;
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowSticker(aweme, z, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowSticker");
        }
    }
}
