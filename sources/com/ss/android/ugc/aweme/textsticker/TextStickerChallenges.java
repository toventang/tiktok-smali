package com.ss.android.ugc.aweme.textsticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.a.n;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class TextStickerChallenges implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextStickerChallenges> CREATOR = new a();
    public final List<AVChallenge> readTextChallenges;

    static {
        Covode.recordClassIndex(90713);
    }

    public TextStickerChallenges() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.textsticker.TextStickerChallenges */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerChallenges copy$default(TextStickerChallenges textStickerChallenges, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = textStickerChallenges.readTextChallenges;
        }
        return textStickerChallenges.copy(list);
    }

    public final TextStickerChallenges copy(List<AVChallenge> list) {
        l.d(list, "");
        return new TextStickerChallenges(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStickerChallenges) && l.a(this.readTextChallenges, ((TextStickerChallenges) obj).readTextChallenges);
        }
        return true;
    }

    public final int hashCode() {
        List<AVChallenge> list = this.readTextChallenges;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextStickerChallenges(readTextChallenges=" + this.readTextChallenges + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<AVChallenge> list = this.readTextChallenges;
        parcel.writeInt(list.size());
        for (AVChallenge aVChallenge : list) {
            parcel.writeParcelable(aVChallenge, i2);
        }
    }

    public static class a implements Parcelable.Creator<TextStickerChallenges> {
        static {
            Covode.recordClassIndex(90714);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerChallenges[] newArray(int i2) {
            return new TextStickerChallenges[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerChallenges createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(parcel.readParcelable(TextStickerChallenges.class.getClassLoader()));
                readInt--;
            }
            return new TextStickerChallenges(arrayList);
        }
    }

    public final List<String> getReadTextChallengeIds() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous.cid)) {
                String str = previous.cid;
                l.b(str, "");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<AVChallenge> getReadTextChallenges() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous)) {
                arrayList.add(previous);
            }
        }
        return n.h((Iterable) n.k(arrayList));
    }

    public TextStickerChallenges(List<AVChallenge> list) {
        l.d(list, "");
        this.readTextChallenges = list;
    }

    public final void addReadTextChallenge(AVChallenge aVChallenge) {
        l.d(aVChallenge, "");
        this.readTextChallenges.add(aVChallenge);
    }

    public final void removeReadTextChallenge(String str, b<? super AVChallenge, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        for (T t : this.readTextChallenges) {
            if (l.a((Object) t.cid, (Object) str)) {
                if (t != null) {
                    this.readTextChallenges.remove(t);
                    bVar.invoke(t);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStickerChallenges(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? new LinkedList() : list);
    }
}
