package com.ss.android.ugc.aweme.services.draft;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.m;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.List;
import java.util.concurrent.ExecutorService;

public interface IDraftService {

    public interface DraftCopyListener {
        static {
            Covode.recordClassIndex(79599);
        }

        void onDraftCopyFailed(DraftFileSaveResult draftFileSaveResult);

        void onDraftCopySuccess();
    }

    public interface DraftListener {
        static {
            Covode.recordClassIndex(79600);
        }

        void onDraftCheckedChanged(c cVar, boolean z);

        void onDraftClean();

        void onDraftDelete(c cVar);

        void onDraftUpdate(c cVar);
    }

    public static class DraftListenerAdapter implements DraftListener {
        static {
            Covode.recordClassIndex(79601);
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftCheckedChanged(c cVar, boolean z) {
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftClean() {
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftDelete(c cVar) {
        }

        @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public void onDraftUpdate(c cVar) {
        }
    }

    public interface DraftSaveListener {
        static {
            Covode.recordClassIndex(79602);
        }

        void onDraftSaveFailed(DraftSaveResult draftSaveResult);

        void onDraftSaveSuccess();
    }

    static {
        Covode.recordClassIndex(79598);
    }

    String calculateDraftDir(c cVar);

    void delete(c cVar);

    void enterDraftBox(Activity activity);

    void enterDraftBoxWithArgs(Activity activity, Bundle bundle);

    ExecutorService getDraftExecutor();

    void notifyDraftCheckedChanged(c cVar, boolean z);

    void notifyDraftClean();

    void notifyDraftDelete(c cVar);

    void notifyDraftUpdate(c cVar);

    List<c> queryAllDraftList(boolean z);

    c queryDraft(String str);

    c queryDraftWithUserId(String str);

    List<c> queryList();

    List<c> queryListWithFilter(boolean z, m mVar);

    int queryMyDraftCount();

    int queryMyDraftCount(m mVar);

    void registerDraftListener(DraftListener draftListener);

    DraftDBSaveResult save(c cVar);

    void unregisterDraftListener(DraftListener draftListener);
}
