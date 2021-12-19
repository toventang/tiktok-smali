package com.ss.android.ugc.aweme.opensdkservice;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import java.util.ArrayList;

public interface IOpenPlatformService {
    static {
        Covode.recordClassIndex(73718);
    }

    void a();

    void a(Intent intent, HandleMediaListener handleMediaListener);

    void a(Fragment fragment, ArrayList<String> arrayList);

    void a(EditConfig.Builder builder, String str);

    void a(String str, String str2, String str3, String str4);

    boolean a(Intent intent);
}
