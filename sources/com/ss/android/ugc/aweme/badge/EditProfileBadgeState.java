package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class EditProfileBadgeState implements af {
    private final k result;

    static {
        Covode.recordClassIndex(41782);
    }

    public EditProfileBadgeState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditProfileBadgeState copy$default(EditProfileBadgeState editProfileBadgeState, k kVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = editProfileBadgeState.result;
        }
        return editProfileBadgeState.copy(kVar);
    }

    public final k component1() {
        return this.result;
    }

    public final EditProfileBadgeState copy(k kVar) {
        return new EditProfileBadgeState(kVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EditProfileBadgeState) && l.a(this.result, ((EditProfileBadgeState) obj).result);
        }
        return true;
    }

    public final int hashCode() {
        k kVar = this.result;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EditProfileBadgeState(result=" + this.result + ")";
    }

    public final k getResult() {
        return this.result;
    }

    public EditProfileBadgeState(k kVar) {
        this.result = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditProfileBadgeState(k kVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar);
    }
}
