package com.ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ReviewItemStruct implements Parcelable {
    public static final Parcelable.Creator<ReviewItemStruct> CREATOR = new a();
    @c(a = "review")

    /* renamed from: a  reason: collision with root package name */
    public final MainReview f87055a;
    @c(a = "sku_specification")

    /* renamed from: b  reason: collision with root package name */
    public final String f87056b;
    @c(a = "sku_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f87057c;
    @c(a = "digg_count")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f87058d;
    @c(a = "is_digged")

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f87059e;
    @c(a = "is_owner")

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f87060f;
    @c(a = "review_user")

    /* renamed from: g  reason: collision with root package name */
    public final User f87061g;
    @c(a = "review_tags")

    /* renamed from: h  reason: collision with root package name */
    public final List<ReviewTags> f87062h;
    @c(a = "is_anonymous")

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f87063i;

    static {
        Covode.recordClassIndex(54618);
    }

    /* access modifiers changed from: private */
    public static ReviewItemStruct a(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List<ReviewTags> list, Boolean bool3) {
        l.d(mainReview, "");
        l.d(str2, "");
        return new ReviewItemStruct(mainReview, str, str2, num, bool, bool2, user, list, bool3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewItemStruct)) {
            return false;
        }
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        return l.a(this.f87055a, reviewItemStruct.f87055a) && l.a(this.f87056b, reviewItemStruct.f87056b) && l.a(this.f87057c, reviewItemStruct.f87057c) && l.a(this.f87058d, reviewItemStruct.f87058d) && l.a(this.f87059e, reviewItemStruct.f87059e) && l.a(this.f87060f, reviewItemStruct.f87060f) && l.a(this.f87061g, reviewItemStruct.f87061g) && l.a(this.f87062h, reviewItemStruct.f87062h) && l.a(this.f87063i, reviewItemStruct.f87063i);
    }

    public final int hashCode() {
        MainReview mainReview = this.f87055a;
        int i2 = 0;
        int hashCode = (mainReview != null ? mainReview.hashCode() : 0) * 31;
        String str = this.f87056b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f87057c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f87058d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f87059e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f87060f;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        User user = this.f87061g;
        int hashCode7 = (hashCode6 + (user != null ? user.hashCode() : 0)) * 31;
        List<ReviewTags> list = this.f87062h;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool3 = this.f87063i;
        if (bool3 != null) {
            i2 = bool3.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "ReviewItemStruct(review=" + this.f87055a + ", specification=" + this.f87056b + ", skuId=" + this.f87057c + ", diggCount=" + this.f87058d + ", isDigged=" + this.f87059e + ", isOwner=" + this.f87060f + ", user=" + this.f87061g + ", tags=" + this.f87062h + ", isAnonymous=" + this.f87063i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        this.f87055a.writeToParcel(parcel, 0);
        parcel.writeString(this.f87056b);
        parcel.writeString(this.f87057c);
        Integer num = this.f87058d;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f87059e;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f87060f;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        User user = this.f87061g;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<ReviewTags> list = this.f87062h;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewTags reviewTags : list) {
                reviewTags.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool3 = this.f87063i;
        if (bool3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final class AppendReview implements Parcelable {
        public static final Parcelable.Creator<AppendReview> CREATOR = new a();
        @c(a = "text")

        /* renamed from: a  reason: collision with root package name */
        public final String f87064a;
        @c(a = "images")

        /* renamed from: b  reason: collision with root package name */
        public final List<Image> f87065b;
        @c(a = "days_from_purchase")

        /* renamed from: c  reason: collision with root package name */
        public final String f87066c;
        @c(a = "reply_append_review")

        /* renamed from: d  reason: collision with root package name */
        public final String f87067d;

        static {
            Covode.recordClassIndex(54619);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppendReview)) {
                return false;
            }
            AppendReview appendReview = (AppendReview) obj;
            return l.a(this.f87064a, appendReview.f87064a) && l.a(this.f87065b, appendReview.f87065b) && l.a(this.f87066c, appendReview.f87066c) && l.a(this.f87067d, appendReview.f87067d);
        }

        public final int hashCode() {
            String str = this.f87064a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<Image> list = this.f87065b;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.f87066c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f87067d;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "AppendReview(text=" + this.f87064a + ", images=" + this.f87065b + ", daysForPruchase=" + this.f87066c + ", reply=" + this.f87067d + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f87064a);
            List<Image> list = this.f87065b;
            parcel.writeInt(list.size());
            for (Image image : list) {
                image.writeToParcel(parcel, 0);
            }
            parcel.writeString(this.f87066c);
            parcel.writeString(this.f87067d);
        }

        public static class a implements Parcelable.Creator<AppendReview> {
            static {
                Covode.recordClassIndex(54620);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AppendReview[] newArray(int i2) {
                return new AppendReview[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AppendReview createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Image.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                return new AppendReview(readString, arrayList, parcel.readString(), parcel.readString());
            }
        }

        private /* synthetic */ AppendReview() {
            this("", z.INSTANCE, "", null);
        }

        public AppendReview(String str, List<Image> list, String str2, String str3) {
            l.d(str, "");
            l.d(list, "");
            l.d(str2, "");
            this.f87064a = str;
            this.f87065b = list;
            this.f87066c = str2;
            this.f87067d = str3;
        }
    }

    public static final class MainReview implements Parcelable {
        public static final Parcelable.Creator<MainReview> CREATOR = new a();
        @c(a = "review_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f87068a;
        @c(a = "rating")

        /* renamed from: b  reason: collision with root package name */
        public final String f87069b;
        @c(a = "display_text")

        /* renamed from: c  reason: collision with root package name */
        public final String f87070c;
        @c(a = "images")

        /* renamed from: d  reason: collision with root package name */
        public final List<Image> f87071d;
        @c(a = "review_timestamp")

        /* renamed from: e  reason: collision with root package name */
        public final String f87072e;
        @c(a = "append_review")

        /* renamed from: f  reason: collision with root package name */
        public final AppendReview f87073f;
        @c(a = "reply_main_review")

        /* renamed from: g  reason: collision with root package name */
        public final String f87074g;
        @c(a = "has_origin_text")

        /* renamed from: h  reason: collision with root package name */
        public final boolean f87075h;

        static {
            Covode.recordClassIndex(54621);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainReview)) {
                return false;
            }
            MainReview mainReview = (MainReview) obj;
            return l.a(this.f87068a, mainReview.f87068a) && l.a(this.f87069b, mainReview.f87069b) && l.a(this.f87070c, mainReview.f87070c) && l.a(this.f87071d, mainReview.f87071d) && l.a(this.f87072e, mainReview.f87072e) && l.a(this.f87073f, mainReview.f87073f) && l.a(this.f87074g, mainReview.f87074g) && this.f87075h == mainReview.f87075h;
        }

        public final int hashCode() {
            String str = this.f87068a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87069b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f87070c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<Image> list = this.f87071d;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            String str4 = this.f87072e;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            AppendReview appendReview = this.f87073f;
            int hashCode6 = (hashCode5 + (appendReview != null ? appendReview.hashCode() : 0)) * 31;
            String str5 = this.f87074g;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            int i3 = (hashCode6 + i2) * 31;
            boolean z = this.f87075h;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            return i3 + i4;
        }

        public final String toString() {
            return "MainReview(reviewId=" + this.f87068a + ", rating=" + this.f87069b + ", text=" + this.f87070c + ", images=" + this.f87071d + ", reviewTimeStamp=" + this.f87072e + ", appendReview=" + this.f87073f + ", reply=" + this.f87074g + ", hasOriginText=" + this.f87075h + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f87068a);
            parcel.writeString(this.f87069b);
            parcel.writeString(this.f87070c);
            List<Image> list = this.f87071d;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Image image : list) {
                    image.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f87072e);
            AppendReview appendReview = this.f87073f;
            if (appendReview != null) {
                parcel.writeInt(1);
                appendReview.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f87074g);
            parcel.writeInt(this.f87075h ? 1 : 0);
        }

        public static class a implements Parcelable.Creator<MainReview> {
            static {
                Covode.recordClassIndex(54622);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MainReview[] newArray(int i2) {
                return new MainReview[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MainReview createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                l.d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                AppendReview appendReview = null;
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Image.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    appendReview = AppendReview.CREATOR.createFromParcel(parcel);
                }
                return new MainReview(readString, readString2, readString3, arrayList, readString4, appendReview, parcel.readString(), parcel.readInt() != 0);
            }
        }

        public /* synthetic */ MainReview() {
            this("", "0", null, null, "0", null, null, false);
        }

        public final boolean b() {
            List<Image> list = this.f87071d;
            if (list == null || !(!list.isEmpty())) {
                return false;
            }
            return true;
        }

        public final boolean a() {
            if (hl.a(this.f87070c) || b()) {
                return true;
            }
            return false;
        }

        public MainReview(String str, String str2, String str3, List<Image> list, String str4, AppendReview appendReview, String str5, boolean z) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str4, "");
            this.f87068a = str;
            this.f87069b = str2;
            this.f87070c = str3;
            this.f87071d = list;
            this.f87072e = str4;
            this.f87073f = appendReview;
            this.f87074g = str5;
            this.f87075h = z;
        }
    }

    public static final class User implements Parcelable {
        public static final Parcelable.Creator<User> CREATOR = new a();
        @c(a = "user_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f87076a;
        @c(a = StringSet.name)

        /* renamed from: b  reason: collision with root package name */
        public final String f87077b;
        @c(a = "avatar")

        /* renamed from: c  reason: collision with root package name */
        public final Image f87078c;
        @c(a = "link")

        /* renamed from: d  reason: collision with root package name */
        public final String f87079d;

        static {
            Covode.recordClassIndex(54623);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return l.a(this.f87076a, user.f87076a) && l.a(this.f87077b, user.f87077b) && l.a(this.f87078c, user.f87078c) && l.a(this.f87079d, user.f87079d);
        }

        public final int hashCode() {
            String str = this.f87076a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f87077b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Image image = this.f87078c;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
            String str3 = this.f87079d;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "User(id=" + this.f87076a + ", name=" + this.f87077b + ", avatar=" + this.f87078c + ", link=" + this.f87079d + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f87076a);
            parcel.writeString(this.f87077b);
            Image image = this.f87078c;
            if (image != null) {
                parcel.writeInt(1);
                image.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f87079d);
        }

        public static class a implements Parcelable.Creator<User> {
            static {
                Covode.recordClassIndex(54624);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ User[] newArray(int i2) {
                return new User[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ User createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new User(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }
        }

        private /* synthetic */ User() {
            this(null, null, null, null);
        }

        public User(String str, String str2, Image image, String str3) {
            this.f87076a = str;
            this.f87077b = str2;
            this.f87078c = image;
            this.f87079d = str3;
        }
    }

    public static class a implements Parcelable.Creator<ReviewItemStruct> {
        static {
            Covode.recordClassIndex(54625);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewItemStruct[] newArray(int i2) {
            return new ReviewItemStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewItemStruct createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            ArrayList arrayList;
            l.d(parcel, "");
            MainReview createFromParcel = MainReview.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool3 = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool2 = null;
            }
            User createFromParcel2 = parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewTags.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool3 = Boolean.valueOf(z);
            }
            return new ReviewItemStruct(createFromParcel, readString, readString2, valueOf, bool, bool2, createFromParcel2, arrayList, bool3);
        }
    }

    private /* synthetic */ ReviewItemStruct() {
        this(new MainReview(), null, "", null, null, null, null, null, null);
    }

    public ReviewItemStruct(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List<ReviewTags> list, Boolean bool3) {
        l.d(mainReview, "");
        l.d(str2, "");
        this.f87055a = mainReview;
        this.f87056b = str;
        this.f87057c = str2;
        this.f87058d = num;
        this.f87059e = bool;
        this.f87060f = bool2;
        this.f87061g = user;
        this.f87062h = list;
        this.f87063i = bool3;
    }
}
