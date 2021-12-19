package com.ss.android.ugc.aweme.request_combine.task;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ae;

public final class FetchCombineSettingsTask extends BaseFetchCombineSettingsTask implements a {
    static {
        Covode.recordClassIndex(78604);
    }

    @Override // com.ss.android.ugc.aweme.lego.n, com.ss.android.ugc.aweme.request_combine.task.BaseFetchCombineSettingsTask
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.lego.n, com.ss.android.ugc.aweme.request_combine.task.BaseFetchCombineSettingsTask
    public final String h() {
        return "FetchCombineSettingsTask";
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }
}
