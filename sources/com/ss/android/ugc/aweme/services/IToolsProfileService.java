package com.ss.android.ugc.aweme.services;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public interface IToolsProfileService {
    static {
        Covode.recordClassIndex(79482);
    }

    Fragment getSelectMyVideoFragment();
}
