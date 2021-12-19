package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import h.f.b.l;

public final class ReactionContext implements Parcelable {
    public static final Parcelable.Creator<ReactionContext> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ReactionParams f124739a;

    static {
        Covode.recordClassIndex(81973);
    }

    public ReactionContext(byte b2) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ReactionContext) && l.a(this.f124739a, ((ReactionContext) obj).f124739a);
        }
        return true;
    }

    public final int hashCode() {
        ReactionParams reactionParams = this.f124739a;
        if (reactionParams != null) {
            return reactionParams.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReactionContext(reactionParams=" + this.f124739a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.f124739a, i2);
    }

    public static class a implements Parcelable.Creator<ReactionContext> {
        static {
            Covode.recordClassIndex(81974);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionContext[] newArray(int i2) {
            return new ReactionContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ReactionContext((ReactionParams) parcel.readParcelable(ReactionContext.class.getClassLoader()));
        }
    }

    private /* synthetic */ ReactionContext() {
        this((ReactionParams) null);
    }

    public ReactionContext(ReactionParams reactionParams) {
        this.f124739a = reactionParams;
    }
}
