package com.ss.android.ugc.aweme.draft.model;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class f {
    static {
        Covode.recordClassIndex(51878);
    }

    public static final Map<String, String> a(DraftLoadResult draftLoadResult) {
        l.d(draftLoadResult, "");
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", draftLoadResult.getCreationId());
        hashMap.put("error_code", String.valueOf(draftLoadResult.getErrorCode()));
        hashMap.put("draft_type", String.valueOf(draftLoadResult.getDraftType()));
        hashMap.put("save_draft_time", draftLoadResult.getSaveDraftTime());
        hashMap.put("save_draft_app_version", String.valueOf(draftLoadResult.getSaveDraftAppVersion()));
        if (!draftLoadResult.getCheckResult().isSuc()) {
            hashMap.put("check_result", draftLoadResult.getCheckResult().toString());
        }
        hashMap.put("is_story", String.valueOf(draftLoadResult.isStoryDraft() ? 1 : 0));
        return hashMap;
    }

    public static final Map<String, String> a(DraftSaveResult draftSaveResult) {
        l.d(draftSaveResult, "");
        HashMap hashMap = new HashMap();
        hashMap.put("creation_id", draftSaveResult.getCreationId());
        hashMap.put("error_code", String.valueOf(draftSaveResult.getErrorCode()));
        hashMap.put("draft_type", String.valueOf(draftSaveResult.getDraftType()));
        hashMap.put("save_draft_from", String.valueOf(draftSaveResult.getDraftFrom()));
        if (!draftSaveResult.getCheckResult().isSuc()) {
            hashMap.put("check_result", draftSaveResult.getCheckResult().toString());
        }
        if (!draftSaveResult.getSaveFileResult().isSuc()) {
            hashMap.put("save_file_result", draftSaveResult.getSaveFileResult().toString());
        }
        if (!draftSaveResult.getSaveDBResult().isSuc()) {
            hashMap.put("save_db_result", draftSaveResult.getSaveDBResult().toString());
        }
        hashMap.put("save_draft_time", draftSaveResult.getSaveDraftTime());
        hashMap.put("save_draft_app_version", String.valueOf(draftSaveResult.getSaveDraftAppVersion()));
        if (draftSaveResult.getCodeException() != null) {
            String stackTraceString = Log.getStackTraceString(draftSaveResult.getCodeException());
            l.b(stackTraceString, "");
            hashMap.put("code_exception", stackTraceString);
        }
        hashMap.put("is_story", String.valueOf(draftSaveResult.isStoryDraft() ? 1 : 0));
        return hashMap;
    }
}
