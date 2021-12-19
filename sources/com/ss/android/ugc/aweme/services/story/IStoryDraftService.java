package com.ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import h.f.a.b;
import h.z;
import java.util.List;

public interface IStoryDraftService {
    static {
        Covode.recordClassIndex(79820);
    }

    void checkIfStoryDraftExisted(b<? super Boolean, z> bVar);

    String getDraftDirPath(c cVar);

    List<c> queryDraftList();

    void queryDraftList(b<? super List<? extends c>, z> bVar);

    void restoreScheduleInfoFromDraft(b<? super List<ScheduleInfo>, z> bVar);
}
