package com.ss.android.ugc.aweme.homepage.story.icon;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a implements IStoryDraftService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99420a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IStoryDraftService f99421b;

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void checkIfStoryDraftExisted(b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        this.f99421b.checkIfStoryDraftExisted(bVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final String getDraftDirPath(c cVar) {
        l.d(cVar, "");
        return this.f99421b.getDraftDirPath(cVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final List<c> queryDraftList() {
        return this.f99421b.queryDraftList();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void queryDraftList(b<? super List<? extends c>, z> bVar) {
        l.d(bVar, "");
        this.f99421b.queryDraftList(bVar);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void restoreScheduleInfoFromDraft(b<? super List<ScheduleInfo>, z> bVar) {
        l.d(bVar, "");
        this.f99421b.restoreScheduleInfoFromDraft(bVar);
    }

    static {
        Covode.recordClassIndex(63335);
    }

    private a() {
        IStoryDraftService a2 = StoryDraftServiceImpl.a();
        l.b(a2, "");
        this.f99421b = a2;
    }
}
