package com.ss.android.ugc.gamora.recorder.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class PermissionState implements af {
    private final p onOpenOtherPage;
    private final p tryStartPreviewFromBusiness;

    static {
        Covode.recordClassIndex(97659);
    }

    public PermissionState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PermissionState copy$default(PermissionState permissionState, p pVar, p pVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = permissionState.onOpenOtherPage;
        }
        if ((i2 & 2) != 0) {
            pVar2 = permissionState.tryStartPreviewFromBusiness;
        }
        return permissionState.copy(pVar, pVar2);
    }

    public final p component1() {
        return this.onOpenOtherPage;
    }

    public final p component2() {
        return this.tryStartPreviewFromBusiness;
    }

    public final PermissionState copy(p pVar, p pVar2) {
        return new PermissionState(pVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        return l.a(this.onOpenOtherPage, permissionState.onOpenOtherPage) && l.a(this.tryStartPreviewFromBusiness, permissionState.tryStartPreviewFromBusiness);
    }

    public final int hashCode() {
        p pVar = this.onOpenOtherPage;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.tryStartPreviewFromBusiness;
        if (pVar2 != null) {
            i2 = pVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PermissionState(onOpenOtherPage=" + this.onOpenOtherPage + ", tryStartPreviewFromBusiness=" + this.tryStartPreviewFromBusiness + ")";
    }

    public final p getOnOpenOtherPage() {
        return this.onOpenOtherPage;
    }

    public final p getTryStartPreviewFromBusiness() {
        return this.tryStartPreviewFromBusiness;
    }

    public PermissionState(p pVar, p pVar2) {
        this.onOpenOtherPage = pVar;
        this.tryStartPreviewFromBusiness = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PermissionState(p pVar, p pVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2);
    }
}
