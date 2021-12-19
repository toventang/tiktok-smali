package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class CustomStickerInfo implements Parcelable {
    public static final Parcelable.Creator<CustomStickerInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f104670a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104671b;

    /* renamed from: c  reason: collision with root package name */
    public final int f104672c;

    /* renamed from: d  reason: collision with root package name */
    public final int f104673d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f104674e;

    /* renamed from: f  reason: collision with root package name */
    private final h f104675f = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(67075);
    }

    public final HashMap<String, String> a() {
        return (HashMap) this.f104675f.getValue();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerInfo)) {
            return false;
        }
        CustomStickerInfo customStickerInfo = (CustomStickerInfo) obj;
        return l.a(this.f104670a, customStickerInfo.f104670a) && l.a(this.f104671b, customStickerInfo.f104671b) && this.f104672c == customStickerInfo.f104672c && this.f104673d == customStickerInfo.f104673d && this.f104674e == customStickerInfo.f104674e;
    }

    public final int hashCode() {
        String str = this.f104670a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104671b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (((((hashCode + i2) * 31) + this.f104672c) * 31) + this.f104673d) * 31;
        boolean z = this.f104674e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "CustomStickerInfo(stickerId=" + this.f104670a + ", path=" + this.f104671b + ", width=" + this.f104672c + ", height=" + this.f104673d + ", cutout=" + this.f104674e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f104670a);
        parcel.writeString(this.f104671b);
        parcel.writeInt(this.f104672c);
        parcel.writeInt(this.f104673d);
        parcel.writeInt(this.f104674e ? 1 : 0);
    }

    public static class a implements Parcelable.Creator<CustomStickerInfo> {
        static {
            Covode.recordClassIndex(67076);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustomStickerInfo[] newArray(int i2) {
            return new CustomStickerInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomStickerInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CustomStickerInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    static final class b extends m implements h.f.a.a<HashMap<String, String>> {
        final /* synthetic */ CustomStickerInfo this$0;

        static {
            Covode.recordClassIndex(67077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CustomStickerInfo customStickerInfo) {
            super(0);
            this.this$0 = customStickerInfo;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            String str = this.this$0.f104670a;
            if (str == null) {
                str = "";
            }
            hashMap.put("stickerId", str);
            hashMap.put("path", this.this$0.f104671b);
            hashMap.put("width", String.valueOf(this.this$0.f104672c));
            hashMap.put("height", String.valueOf(this.this$0.f104673d));
            hashMap.put("cutout", String.valueOf(this.this$0.f104674e));
            return hashMap;
        }
    }

    public CustomStickerInfo(String str, String str2, int i2, int i3, boolean z) {
        l.d(str2, "");
        this.f104670a = str;
        this.f104671b = str2;
        this.f104672c = i2;
        this.f104673d = i3;
        this.f104674e = z;
    }
}
