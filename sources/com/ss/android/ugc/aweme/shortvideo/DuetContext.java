package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class DuetContext implements Parcelable {
    public static final Parcelable.Creator<DuetContext> CREATOR = new b();
    public static final int w = 1;
    public static final int x = 2;
    public static final String y = "horizontal";
    public static final a z = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f124720a;

    /* renamed from: b  reason: collision with root package name */
    public String f124721b;

    /* renamed from: c  reason: collision with root package name */
    public String f124722c;

    /* renamed from: d  reason: collision with root package name */
    public String f124723d;

    /* renamed from: e  reason: collision with root package name */
    public float f124724e;

    /* renamed from: f  reason: collision with root package name */
    public float f124725f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f124726g;

    /* renamed from: h  reason: collision with root package name */
    public int f124727h;

    /* renamed from: i  reason: collision with root package name */
    public int f124728i;

    /* renamed from: j  reason: collision with root package name */
    public String f124729j;

    /* renamed from: k  reason: collision with root package name */
    public String f124730k;

    /* renamed from: l  reason: collision with root package name */
    public List<EmbaddedWindowInfo> f124731l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f124732m;
    public int n;
    public String o;
    public int p;
    public Effect q;
    public String r;
    public boolean s;
    public boolean t;
    public int u;
    public String v;

    public DuetContext(byte b2) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetContext)) {
            return false;
        }
        DuetContext duetContext = (DuetContext) obj;
        return l.a(this.f124720a, duetContext.f124720a) && l.a(this.f124721b, duetContext.f124721b) && l.a(this.f124722c, duetContext.f124722c) && l.a(this.f124723d, duetContext.f124723d) && Float.compare(this.f124724e, duetContext.f124724e) == 0 && Float.compare(this.f124725f, duetContext.f124725f) == 0 && this.f124726g == duetContext.f124726g && this.f124727h == duetContext.f124727h && this.f124728i == duetContext.f124728i && l.a(this.f124729j, duetContext.f124729j) && l.a(this.f124730k, duetContext.f124730k) && l.a(this.f124731l, duetContext.f124731l) && this.f124732m == duetContext.f124732m && this.n == duetContext.n && l.a(this.o, duetContext.o) && this.p == duetContext.p && l.a(this.q, duetContext.q) && l.a(this.r, duetContext.r) && this.s == duetContext.s && this.t == duetContext.t && this.u == duetContext.u && l.a(this.v, duetContext.v);
    }

    public final int hashCode() {
        String str = this.f124720a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124721b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f124722c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f124723d;
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f124724e)) * 31) + Float.floatToIntBits(this.f124725f)) * 31;
        boolean z2 = this.f124726g;
        int i3 = 1;
        if (z2) {
            z2 = true;
        }
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = z2 ? 1 : 0;
        int i7 = (((((hashCode4 + i4) * 31) + this.f124727h) * 31) + this.f124728i) * 31;
        String str5 = this.f124729j;
        int hashCode5 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f124730k;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<EmbaddedWindowInfo> list = this.f124731l;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z3 = this.f124732m;
        if (z3) {
            z3 = true;
        }
        int i8 = z3 ? 1 : 0;
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        int i11 = (((hashCode7 + i8) * 31) + this.n) * 31;
        String str7 = this.o;
        int hashCode8 = (((i11 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31;
        Effect effect = this.q;
        int hashCode9 = (hashCode8 + (effect != null ? effect.hashCode() : 0)) * 31;
        String str8 = this.r;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z4 = this.s;
        if (z4) {
            z4 = true;
        }
        int i12 = z4 ? 1 : 0;
        int i13 = z4 ? 1 : 0;
        int i14 = z4 ? 1 : 0;
        int i15 = (hashCode10 + i12) * 31;
        if (!this.t) {
            i3 = 0;
        }
        int i16 = (((i15 + i3) * 31) + this.u) * 31;
        String str9 = this.v;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return i16 + i2;
    }

    public final String toString() {
        return "DuetContext(duetFromChallengeName=" + this.f124720a + ", duetFromAwemeId=" + this.f124721b + ", duetVideoPath=" + this.f124722c + ", duetAudioPath=" + this.f124723d + ", veSuggestHumanVolume=" + this.f124724e + ", veSuggestVideoVolume=" + this.f124725f + ", successEnableAEC=" + this.f124726g + ", duetVideoWidth=" + this.f124727h + ", duetVideoHeight=" + this.f124728i + ", duetLayout=" + this.f124729j + ", duetLayoutInfoJson=" + this.f124730k + ", windowInfoList=" + this.f124731l + ", micDefaultState=" + this.f124732m + ", isFromDuetSticker=" + this.n + ", duetLayoutMode=" + this.o + ", layoutDirection=" + this.p + ", defaultDuetLayout=" + this.q + ", duetOriginId=" + this.r + ", isDuetSing=" + this.s + ", isDuetUpload=" + this.t + ", duetUploadType=" + this.u + ", chorusMethod=" + this.v + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f124720a);
        parcel.writeString(this.f124721b);
        parcel.writeString(this.f124722c);
        parcel.writeString(this.f124723d);
        parcel.writeFloat(this.f124724e);
        parcel.writeFloat(this.f124725f);
        parcel.writeInt(this.f124726g ? 1 : 0);
        parcel.writeInt(this.f124727h);
        parcel.writeInt(this.f124728i);
        parcel.writeString(this.f124729j);
        parcel.writeString(this.f124730k);
        List<EmbaddedWindowInfo> list = this.f124731l;
        parcel.writeInt(list.size());
        for (EmbaddedWindowInfo embaddedWindowInfo : list) {
            parcel.writeParcelable(embaddedWindowInfo, i2);
        }
        parcel.writeInt(this.f124732m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeParcelable(this.q, i2);
        parcel.writeString(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81962);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b implements Parcelable.Creator<DuetContext> {
        static {
            Covode.recordClassIndex(81963);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetContext[] newArray(int i2) {
            return new DuetContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(parcel.readParcelable(DuetContext.class.getClassLoader()));
                readInt3--;
            }
            return new DuetContext(readString, readString2, readString3, readString4, readFloat, readFloat2, z, readInt, readInt2, readString5, readString6, arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), (Effect) parcel.readParcelable(DuetContext.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }
    }

    static {
        Covode.recordClassIndex(81961);
    }

    private /* synthetic */ DuetContext() {
        this(null, null, null, null, 1.0f, 1.0f, false, 0, 0, null, null, new ArrayList(), false, 0, "", 0, null, null, false, false, 0, null);
    }

    public DuetContext(String str, String str2, String str3, String str4, float f2, float f3, boolean z2, int i2, int i3, String str5, String str6, List<EmbaddedWindowInfo> list, boolean z3, int i4, String str7, int i5, Effect effect, String str8, boolean z4, boolean z5, int i6, String str9) {
        l.d(list, "");
        l.d(str7, "");
        this.f124720a = str;
        this.f124721b = str2;
        this.f124722c = str3;
        this.f124723d = str4;
        this.f124724e = f2;
        this.f124725f = f3;
        this.f124726g = z2;
        this.f124727h = i2;
        this.f124728i = i3;
        this.f124729j = str5;
        this.f124730k = str6;
        this.f124731l = list;
        this.f124732m = z3;
        this.n = i4;
        this.o = str7;
        this.p = i5;
        this.q = effect;
        this.r = str8;
        this.s = z4;
        this.t = z5;
        this.u = i6;
        this.v = str9;
    }
}
