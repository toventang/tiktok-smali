package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class TextStickerTextPair implements Parcelable {
    public static final Parcelable.Creator<TextStickerTextPair> CREATOR = new a();
    @c(a = "first", b = {"a"})

    /* renamed from: a  reason: collision with root package name */
    public final String f88415a;
    @c(a = "second", b = {"b"})

    /* renamed from: b  reason: collision with root package name */
    public final List<InteractTextStructWrap> f88416b;

    static {
        Covode.recordClassIndex(55632);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextPair)) {
            return false;
        }
        TextStickerTextPair textStickerTextPair = (TextStickerTextPair) obj;
        return l.a(this.f88415a, textStickerTextPair.f88415a) && l.a(this.f88416b, textStickerTextPair.f88416b);
    }

    public final int hashCode() {
        String str = this.f88415a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<InteractTextStructWrap> list = this.f88416b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f88415a);
        List<InteractTextStructWrap> list = this.f88416b;
        parcel.writeInt(list.size());
        for (InteractTextStructWrap interactTextStructWrap : list) {
            interactTextStructWrap.writeToParcel(parcel, 0);
        }
    }

    public static class a implements Parcelable.Creator<TextStickerTextPair> {
        static {
            Covode.recordClassIndex(55633);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerTextPair[] newArray(int i2) {
            return new TextStickerTextPair[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerTextPair createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(InteractTextStructWrap.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new TextStickerTextPair(readString, arrayList);
        }
    }

    public /* synthetic */ TextStickerTextPair() {
        this("", new ArrayList());
    }

    public final String toString() {
        return "(" + this.f88415a + ", " + this.f88416b + ')';
    }

    public TextStickerTextPair(String str, List<InteractTextStructWrap> list) {
        l.d(str, "");
        l.d(list, "");
        this.f88415a = str;
        this.f88416b = list;
    }
}
