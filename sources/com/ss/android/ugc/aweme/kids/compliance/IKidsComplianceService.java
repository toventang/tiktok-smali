package com.ss.android.ugc.aweme.kids.compliance;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.common.response.KMReportReason;
import java.util.List;

public interface IKidsComplianceService {
    static {
        Covode.recordClassIndex(67982);
    }

    List<String> a();

    KMReportReason b();
}
