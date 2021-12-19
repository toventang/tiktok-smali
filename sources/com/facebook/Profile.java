package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() {
        /* class com.facebook.Profile.AnonymousClass2 */

        static {
            Covode.recordClassIndex(28404);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Profile[] newArray(int i2) {
            return new Profile[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final String f46566a = Profile.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final String f46567b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46568c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46569d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46570e;

    /* renamed from: f  reason: collision with root package name */
    public final String f46571f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f46572g;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(28402);
    }

    public static void a() {
        AccessToken accessToken = b.a().f46926b;
        if (!AccessToken.a()) {
            a(null);
        } else {
            ad.a(accessToken.f46498e, (ad.a) new ad.a() {
                /* class com.facebook.Profile.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28403);
                }

                @Override // com.facebook.internal.ad.a
                public final void a(j jVar) {
                }

                @Override // com.facebook.internal.ad.a
                public final void a(JSONObject jSONObject) {
                    Uri uri;
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        String optString3 = jSONObject.optString("first_name");
                        String optString4 = jSONObject.optString("middle_name");
                        String optString5 = jSONObject.optString("last_name");
                        String optString6 = jSONObject.optString(StringSet.name);
                        if (optString2 != null) {
                            uri = Uri.parse(optString2);
                        } else {
                            uri = null;
                        }
                        Profile.a(new Profile(optString, optString3, optString4, optString5, optString6, uri));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f46567b);
            jSONObject.put("first_name", this.f46568c);
            jSONObject.put("middle_name", this.f46569d);
            jSONObject.put("last_name", this.f46570e);
            jSONObject.put(StringSet.name, this.f46571f);
            Uri uri = this.f46572g;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int hashCode() {
        int hashCode = this.f46567b.hashCode() + 527;
        String str = this.f46568c;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f46569d;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f46570e;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f46571f;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f46572g;
        if (uri != null) {
            return (hashCode * 31) + uri.hashCode();
        }
        return hashCode;
    }

    public static void a(Profile profile) {
        w.a().a(profile, true);
    }

    private Profile(Parcel parcel) {
        Uri parse;
        this.f46567b = parcel.readString();
        this.f46568c = parcel.readString();
        this.f46569d = parcel.readString();
        this.f46570e = parcel.readString();
        this.f46571f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            parse = null;
        } else {
            parse = Uri.parse(readString);
        }
        this.f46572g = parse;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f46567b = jSONObject.optString("id", null);
        this.f46568c = jSONObject.optString("first_name", null);
        this.f46569d = jSONObject.optString("middle_name", null);
        this.f46570e = jSONObject.optString("last_name", null);
        this.f46571f = jSONObject.optString(StringSet.name, null);
        String optString = jSONObject.optString("link_uri", null);
        this.f46572g = optString != null ? Uri.parse(optString) : uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        String str = this.f46567b;
        if (str != null ? str.equals(profile.f46567b) : profile.f46567b == null) {
            String str2 = this.f46568c;
            if (str2 != null ? str2.equals(profile.f46568c) : profile.f46568c == null) {
                String str3 = this.f46569d;
                if (str3 != null ? str3.equals(profile.f46569d) : profile.f46569d == null) {
                    String str4 = this.f46570e;
                    if (str4 != null ? str4.equals(profile.f46570e) : profile.f46570e == null) {
                        String str5 = this.f46571f;
                        if (str5 != null ? str5.equals(profile.f46571f) : profile.f46571f == null) {
                            Uri uri = this.f46572g;
                            Uri uri2 = profile.f46572g;
                            if (uri != null ? !uri.equals(uri2) : uri2 != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* synthetic */ Profile(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String uri;
        parcel.writeString(this.f46567b);
        parcel.writeString(this.f46568c);
        parcel.writeString(this.f46569d);
        parcel.writeString(this.f46570e);
        parcel.writeString(this.f46571f);
        Uri uri2 = this.f46572g;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        parcel.writeString(uri);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        ae.a(str, "id");
        this.f46567b = str;
        this.f46568c = str2;
        this.f46569d = str3;
        this.f46570e = str4;
        this.f46571f = str5;
        this.f46572g = uri;
    }
}
