package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final PasswordRequestOptions f49766a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f49767b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49768c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49769d;

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new d();

        /* renamed from: a  reason: collision with root package name */
        public final boolean f49770a;

        /* renamed from: b  reason: collision with root package name */
        public final String f49771b;

        /* renamed from: c  reason: collision with root package name */
        public final String f49772c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f49773d;

        /* renamed from: e  reason: collision with root package name */
        private final String f49774e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f49775f;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f49776a;

            /* renamed from: b  reason: collision with root package name */
            public String f49777b;

            /* renamed from: c  reason: collision with root package name */
            public String f49778c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f49779d = true;

            static {
                Covode.recordClassIndex(31082);
            }

            public final GoogleIdTokenRequestOptions a() {
                return new GoogleIdTokenRequestOptions(this.f49776a, this.f49777b, this.f49778c, this.f49779d, null, null);
            }
        }

        static {
            Covode.recordClassIndex(31081);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49770a), this.f49771b, this.f49772c, Boolean.valueOf(this.f49773d), this.f49774e, this.f49775f});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f49770a != googleIdTokenRequestOptions.f49770a || !p.a(this.f49771b, googleIdTokenRequestOptions.f49771b) || !p.a(this.f49772c, googleIdTokenRequestOptions.f49772c) || this.f49773d != googleIdTokenRequestOptions.f49773d || !p.a(this.f49774e, googleIdTokenRequestOptions.f49774e) || !p.a(this.f49775f, googleIdTokenRequestOptions.f49775f)) {
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = b.a(parcel, 20293);
            b.a(parcel, 1, this.f49770a);
            b.a(parcel, 2, this.f49771b);
            b.a(parcel, 3, this.f49772c);
            b.a(parcel, 4, this.f49773d);
            b.a(parcel, 5, this.f49774e);
            b.a(parcel, 6, this.f49775f);
            b.b(parcel, a2);
        }

        GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List<String> list) {
            ArrayList arrayList;
            this.f49770a = z;
            if (z) {
                r.a((Object) str, (Object) "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f49771b = str;
            this.f49772c = str2;
            this.f49773d = z2;
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f49775f = arrayList;
            this.f49774e = str3;
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* renamed from: a  reason: collision with root package name */
        public final boolean f49780a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            boolean f49781a;

            static {
                Covode.recordClassIndex(31084);
            }
        }

        static {
            Covode.recordClassIndex(31083);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f49780a)});
        }

        PasswordRequestOptions(boolean z) {
            this.f49780a = z;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.f49780a == ((PasswordRequestOptions) obj).f49780a) {
                return true;
            }
            return false;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            int a2 = b.a(parcel, 20293);
            b.a(parcel, 1, this.f49780a);
            b.b(parcel, a2);
        }
    }

    static {
        Covode.recordClassIndex(31080);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public PasswordRequestOptions f49782a;

        /* renamed from: b  reason: collision with root package name */
        public String f49783b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f49784c;

        /* renamed from: d  reason: collision with root package name */
        private GoogleIdTokenRequestOptions f49785d;

        static {
            Covode.recordClassIndex(31085);
        }

        public final BeginSignInRequest a() {
            return new BeginSignInRequest(this.f49782a, this.f49785d, this.f49783b, this.f49784c);
        }

        public a() {
            PasswordRequestOptions.a aVar = new PasswordRequestOptions.a();
            aVar.f49781a = false;
            this.f49782a = new PasswordRequestOptions(aVar.f49781a);
            GoogleIdTokenRequestOptions.a aVar2 = new GoogleIdTokenRequestOptions.a();
            aVar2.f49776a = false;
            this.f49785d = aVar2.a();
        }

        public final a a(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f49785d = (GoogleIdTokenRequestOptions) r.a(googleIdTokenRequestOptions);
            return this;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49766a, this.f49767b, this.f49768c, Boolean.valueOf(this.f49769d)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!p.a(this.f49766a, beginSignInRequest.f49766a) || !p.a(this.f49767b, beginSignInRequest.f49767b) || !p.a(this.f49768c, beginSignInRequest.f49768c) || this.f49769d != beginSignInRequest.f49769d) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49766a, i2);
        b.a(parcel, 2, this.f49767b, i2);
        b.a(parcel, 3, this.f49768c);
        b.a(parcel, 4, this.f49769d);
        b.b(parcel, a2);
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        this.f49766a = (PasswordRequestOptions) r.a(passwordRequestOptions);
        this.f49767b = (GoogleIdTokenRequestOptions) r.a(googleIdTokenRequestOptions);
        this.f49768c = str;
        this.f49769d = z;
    }
}
