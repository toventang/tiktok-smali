package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final String f49708a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49709b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f49710c;

    /* renamed from: d  reason: collision with root package name */
    public final List<IdToken> f49711d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49712e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49713f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49714g;

    /* renamed from: h  reason: collision with root package name */
    public final String f49715h;

    static {
        Covode.recordClassIndex(31057);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49708a, this.f49709b, this.f49710c, this.f49712e, this.f49713f});
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f49716a;

        /* renamed from: b  reason: collision with root package name */
        public String f49717b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f49718c;

        /* renamed from: d  reason: collision with root package name */
        public List<IdToken> f49719d;

        /* renamed from: e  reason: collision with root package name */
        public String f49720e;

        /* renamed from: f  reason: collision with root package name */
        public String f49721f;

        /* renamed from: g  reason: collision with root package name */
        public String f49722g;

        /* renamed from: h  reason: collision with root package name */
        public String f49723h;

        static {
            Covode.recordClassIndex(31058);
        }

        public a(String str) {
            this.f49716a = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (!TextUtils.equals(this.f49708a, credential.f49708a) || !TextUtils.equals(this.f49709b, credential.f49709b) || !p.a(this.f49710c, credential.f49710c) || !TextUtils.equals(this.f49712e, credential.f49712e) || !TextUtils.equals(this.f49713f, credential.f49713f)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49708a);
        b.a(parcel, 2, this.f49709b);
        b.a(parcel, 3, this.f49710c, i2);
        b.b(parcel, 4, this.f49711d);
        b.a(parcel, 5, this.f49712e);
        b.a(parcel, 6, this.f49713f);
        b.a(parcel, 9, this.f49714g);
        b.a(parcel, 10, this.f49715h);
        b.b(parcel, a2);
    }

    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> unmodifiableList;
        String trim = ((String) r.a((Object) str, (Object) "credential identifier cannot be null")).trim();
        r.a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f49709b = str2;
                this.f49710c = uri;
                if (list == null) {
                    unmodifiableList = Collections.emptyList();
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                this.f49711d = unmodifiableList;
                this.f49708a = trim;
                this.f49712e = str3;
                this.f49713f = str4;
                this.f49714g = str5;
                this.f49715h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }
}
