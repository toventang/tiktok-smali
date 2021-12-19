package com.ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import h.f.b.ad;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class StickerChallenge implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "record_sticker_challenge_list", b = {"c"})
    private List<AVChallenge> recordStickerChallengeList;
    @c(a = "sticker_list", b = {"a"})
    private List<String> stickerList;
    @c(a = "sticker_to_challenge", b = {"b"})
    private HashMap<String, AVChallenge> stickerToChallenge;

    static {
        Covode.recordClassIndex(67094);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<StickerChallenge> {
        static {
            Covode.recordClassIndex(67095);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerChallenge[] newArray(int i2) {
            return new StickerChallenge[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerChallenge createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StickerChallenge(parcel);
        }
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.recordStickerChallengeList;
    }

    public final List<String> getStickerList() {
        return this.stickerList;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.stickerToChallenge;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        Collection<AVChallenge> values = this.stickerToChallenge.values();
        l.b(values, "");
        return values;
    }

    public StickerChallenge() {
        this.stickerList = new ArrayList();
        this.stickerToChallenge = new HashMap<>();
        this.recordStickerChallengeList = new ArrayList();
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        l.d(list, "");
        this.recordStickerChallengeList = list;
    }

    public final void setStickerList(List<String> list) {
        l.d(list, "");
        this.stickerList = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> hashMap) {
        l.d(hashMap, "");
        this.stickerToChallenge = hashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickerChallenge(Parcel parcel) {
        this();
        l.d(parcel, "");
        parcel.readStringList(this.stickerList);
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
        this.stickerToChallenge = (HashMap) readSerializable;
        ArrayList readArrayList = parcel.readArrayList(AVChallenge.class.getClassLoader());
        Objects.requireNonNull(readArrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        this.recordStickerChallengeList = ad.d(readArrayList);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeStringList(this.stickerList);
        parcel.writeSerializable(this.stickerToChallenge);
        List<AVChallenge> list = this.recordStickerChallengeList;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        parcel.writeList(list);
    }
}
