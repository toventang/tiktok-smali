package com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class OrganizationListState implements af {
    private final a result;

    static {
        Covode.recordClassIndex(96468);
    }

    public OrganizationListState() {
        this(null, 1, null);
    }

    public static /* synthetic */ OrganizationListState copy$default(OrganizationListState organizationListState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = organizationListState.result;
        }
        return organizationListState.copy(aVar);
    }

    public final a component1() {
        return this.result;
    }

    public final OrganizationListState copy(a aVar) {
        return new OrganizationListState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OrganizationListState) && l.a(this.result, ((OrganizationListState) obj).result);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.result;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OrganizationListState(result=" + this.result + ")";
    }

    public final a getResult() {
        return this.result;
    }

    public OrganizationListState(a aVar) {
        this.result = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrganizationListState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : aVar);
    }
}
