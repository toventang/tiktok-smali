package com.ss.android.ugc.aweme.services.external;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import java.util.List;
import java.util.concurrent.ExecutorService;

public interface IAVDraftService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79621);
    }

    void deleteDraft(int i2, c cVar);

    List<c> draftList(boolean z);

    ExecutorService executor();

    String getDBCreationTime();

    String getDBEventAsJSON();

    String getReadableDBPath();

    void loadAwemeDraftThumbCover(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback);

    c queryDraft(int i2, String str);

    int queryDraftListCount(boolean z);

    List<Integer> queryUserDraftCounts(boolean z);

    void registerListener(IDraftService.DraftListener draftListener);

    Dialog restoreDialog(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

    DraftDBSaveResult saveDraft(c cVar);

    void saveDraftForLocalFile(String str, Intent intent, IDraftService.DraftSaveListener draftSaveListener);

    Fragment showDetailDraft(c cVar);

    void unregisterListener(IDraftService.DraftListener draftListener);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79622);
        }
    }

    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79623);
        }

        public static /* synthetic */ int queryDraftListCount$default(IAVDraftService iAVDraftService, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = true;
                }
                return iAVDraftService.queryDraftListCount(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryDraftListCount");
        }

        public static /* synthetic */ List queryUserDraftCounts$default(IAVDraftService iAVDraftService, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = true;
                }
                return iAVDraftService.queryUserDraftCounts(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserDraftCounts");
        }
    }
}
