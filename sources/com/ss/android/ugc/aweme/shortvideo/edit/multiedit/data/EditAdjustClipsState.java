package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import h.p;
import java.io.Serializable;

public final class EditAdjustClipsState implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditAdjustClipsState> CREATOR = new a();
    @c(a = "lastEditBoundary", b = {"a"})
    private final p<Long, Long> lastEditBoundary;
    @c(a = "viewBoundary", b = {"b"})
    private final p<Long, Long> viewBoundary;

    static {
        Covode.recordClassIndex(83872);
    }

    public EditAdjustClipsState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditAdjustClipsState copy$default(EditAdjustClipsState editAdjustClipsState, p pVar, p pVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editAdjustClipsState.lastEditBoundary;
        }
        if ((i2 & 2) != 0) {
            pVar2 = editAdjustClipsState.viewBoundary;
        }
        return editAdjustClipsState.copy(pVar, pVar2);
    }

    public final p<Long, Long> component1() {
        return this.lastEditBoundary;
    }

    public final p<Long, Long> component2() {
        return this.viewBoundary;
    }

    public final EditAdjustClipsState copy(p<Long, Long> pVar, p<Long, Long> pVar2) {
        return new EditAdjustClipsState(pVar, pVar2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsState)) {
            return false;
        }
        EditAdjustClipsState editAdjustClipsState = (EditAdjustClipsState) obj;
        return l.a(this.lastEditBoundary, editAdjustClipsState.lastEditBoundary) && l.a(this.viewBoundary, editAdjustClipsState.viewBoundary);
    }

    public final int hashCode() {
        p<Long, Long> pVar = this.lastEditBoundary;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p<Long, Long> pVar2 = this.viewBoundary;
        if (pVar2 != null) {
            i2 = pVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditAdjustClipsState(lastEditBoundary=" + this.lastEditBoundary + ", viewBoundary=" + this.viewBoundary + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeSerializable(this.lastEditBoundary);
        parcel.writeSerializable(this.viewBoundary);
    }

    public final p<Long, Long> getLastEditBoundary() {
        return this.lastEditBoundary;
    }

    public final p<Long, Long> getViewBoundary() {
        return this.viewBoundary;
    }

    public static class a implements Parcelable.Creator<EditAdjustClipsState> {
        static {
            Covode.recordClassIndex(83873);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditAdjustClipsState[] newArray(int i2) {
            return new EditAdjustClipsState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditAdjustClipsState createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EditAdjustClipsState((p) parcel.readSerializable(), (p) parcel.readSerializable());
        }
    }

    public EditAdjustClipsState(p<Long, Long> pVar, p<Long, Long> pVar2) {
        this.lastEditBoundary = pVar;
        this.viewBoundary = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAdjustClipsState(p pVar, p pVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2);
    }
}
