package com.ss.android.ugc.aweme;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.widget.o;
import com.ss.android.ugc.aweme.services.IToolsProfileService;

public final class di implements IToolsProfileService {
    static {
        Covode.recordClassIndex(49859);
    }

    @Override // com.ss.android.ugc.aweme.services.IToolsProfileService
    public final Fragment getSelectMyVideoFragment() {
        new ProfileServiceImpl();
        return new o();
    }
}
