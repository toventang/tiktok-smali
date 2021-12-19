package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class InputItemDTO implements Parcelable {
    public static final Parcelable.Creator<InputItemDTO> CREATOR = new a();
    @c(a = "default_value")

    /* renamed from: a  reason: collision with root package name */
    public final String f84307a;
    @c(a = "empty")

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f84308b;
    @c(a = "hint")

    /* renamed from: c  reason: collision with root package name */
    public final String f84309c;
    @c(a = "key")

    /* renamed from: d  reason: collision with root package name */
    public final String f84310d;
    @c(a = "max_length")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f84311e;
    @c(a = "max_line")

    /* renamed from: f  reason: collision with root package name */
    public final Integer f84312f;
    @c(a = "title")

    /* renamed from: g  reason: collision with root package name */
    public final String f84313g;
    @c(a = StringSet.type)

    /* renamed from: h  reason: collision with root package name */
    public final Integer f84314h;
    @c(a = "rules")

    /* renamed from: i  reason: collision with root package name */
    public final List<Rule> f84315i;
    @c(a = "input_hint_message")

    /* renamed from: j  reason: collision with root package name */
    public final String f84316j;

    static {
        Covode.recordClassIndex(52568);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemDTO)) {
            return false;
        }
        InputItemDTO inputItemDTO = (InputItemDTO) obj;
        return l.a(this.f84307a, inputItemDTO.f84307a) && l.a(this.f84308b, inputItemDTO.f84308b) && l.a(this.f84309c, inputItemDTO.f84309c) && l.a(this.f84310d, inputItemDTO.f84310d) && l.a(this.f84311e, inputItemDTO.f84311e) && l.a(this.f84312f, inputItemDTO.f84312f) && l.a(this.f84313g, inputItemDTO.f84313g) && l.a(this.f84314h, inputItemDTO.f84314h) && l.a(this.f84315i, inputItemDTO.f84315i) && l.a(this.f84316j, inputItemDTO.f84316j);
    }

    public final int hashCode() {
        String str = this.f84307a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f84308b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.f84309c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84310d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f84311e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f84312f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f84313g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num3 = this.f84314h;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<Rule> list = this.f84315i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f84316j;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "InputItemDTO(defaultValue=" + this.f84307a + ", needClear=" + this.f84308b + ", hint=" + this.f84309c + ", key=" + this.f84310d + ", maxLength=" + this.f84311e + ", maxLines=" + this.f84312f + ", title=" + this.f84313g + ", type=" + this.f84314h + ", rules=" + this.f84315i + ", inputHintMessage=" + this.f84316j + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84307a);
        Boolean bool = this.f84308b;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84309c);
        parcel.writeString(this.f84310d);
        Integer num = this.f84311e;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f84312f;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84313g);
        Integer num3 = this.f84314h;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<Rule> list = this.f84315i;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Rule rule : list) {
                rule.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84316j);
    }

    public static class a implements Parcelable.Creator<InputItemDTO> {
        static {
            Covode.recordClassIndex(52569);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InputItemDTO[] newArray(int i2) {
            return new InputItemDTO[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InputItemDTO createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new InputItemDTO(readString, bool, readString2, readString3, valueOf, valueOf2, readString4, valueOf3, arrayList, parcel.readString());
        }
    }

    public InputItemDTO(String str, Boolean bool, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, List<Rule> list, String str5) {
        this.f84307a = str;
        this.f84308b = bool;
        this.f84309c = str2;
        this.f84310d = str3;
        this.f84311e = num;
        this.f84312f = num2;
        this.f84313g = str4;
        this.f84314h = num3;
        this.f84315i = list;
        this.f84316j = str5;
    }
}
