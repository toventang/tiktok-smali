package com.ss.android.ugc.aweme.services.beauty;

import com.bytedance.covode.number.Covode;

public interface IBeautyValueChangeService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79584);
    }

    BeautyAbSetting getAbSetting();

    float getComposerValue(String str, String str2, String str3, float f2);

    String getSelectedChildResId(String str, String str2, String str3);

    int saveComposerValue(String str, String str2, String str3, float f2);

    int saveSelectedChildResId(String str, String str2, String str3);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79585);
        }
    }
}
