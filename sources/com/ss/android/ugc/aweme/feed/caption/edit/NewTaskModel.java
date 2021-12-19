package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class NewTaskModel extends BaseResponse {
    @c(a = "candidates")
    private final List<TaskCandidate> candidates;

    static {
        Covode.recordClassIndex(58868);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.caption.edit.NewTaskModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewTaskModel copy$default(NewTaskModel newTaskModel, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = newTaskModel.candidates;
        }
        return newTaskModel.copy(list);
    }

    public final List<TaskCandidate> component1() {
        return this.candidates;
    }

    public final NewTaskModel copy(List<TaskCandidate> list) {
        return new NewTaskModel(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NewTaskModel) && l.a(this.candidates, ((NewTaskModel) obj).candidates);
        }
        return true;
    }

    public final int hashCode() {
        List<TaskCandidate> list = this.candidates;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NewTaskModel(candidates=" + this.candidates + ")";
    }

    public final List<TaskCandidate> getCandidates() {
        return this.candidates;
    }

    public NewTaskModel(List<TaskCandidate> list) {
        this.candidates = list;
    }
}
