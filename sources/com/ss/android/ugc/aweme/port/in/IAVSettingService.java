package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.b;
import java.util.Locale;

public interface IAVSettingService {
    static {
        Covode.recordClassIndex(74485);
    }

    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    b getCurrentI18nItem(Context context);

    String getRegion();

    boolean getSaveAtPost();

    String getSysLanguage();

    boolean isKorean();
}
