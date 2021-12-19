package com.bytedance.geckox.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import java.util.Map;

public interface IGeckoRegister {
    static {
        Covode.recordClassIndex(17421);
    }

    Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams();

    String registerRootDir(Context context);
}
