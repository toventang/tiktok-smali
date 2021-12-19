package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.aa;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.AccessToken.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28378);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new AccessToken[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private static final Date f46492l;

    /* renamed from: m  reason: collision with root package name */
    private static final Date f46493m;
    private static final Date n = new Date();
    private static final c o = c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: a  reason: collision with root package name */
    public final Date f46494a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f46495b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f46496c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f46497d;

    /* renamed from: e  reason: collision with root package name */
    public final String f46498e;

    /* renamed from: f  reason: collision with root package name */
    public final c f46499f;

    /* renamed from: g  reason: collision with root package name */
    public final Date f46500g;

    /* renamed from: h  reason: collision with root package name */
    public final String f46501h;

    /* renamed from: i  reason: collision with root package name */
    public final String f46502i;

    /* renamed from: j  reason: collision with root package name */
    public final Date f46503j;

    /* renamed from: k  reason: collision with root package name */
    public final String f46504k;

    public interface a {
        static {
            Covode.recordClassIndex(28379);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean b() {
        return new Date().after(this.f46494a);
    }

    static {
        Covode.recordClassIndex(28377);
        Date date = new Date(Long.MAX_VALUE);
        f46492l = date;
        f46493m = date;
    }

    public static boolean a() {
        AccessToken accessToken = b.a().f46926b;
        if (accessToken == null || accessToken.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f46498e);
        jSONObject.put("expires_at", this.f46494a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f46495b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f46496c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f46497d));
        jSONObject.put("last_refresh", this.f46500g.getTime());
        jSONObject.put("source", this.f46499f.name());
        jSONObject.put("application_id", this.f46501h);
        jSONObject.put("user_id", this.f46502i);
        jSONObject.put("data_access_expiration_time", this.f46503j.getTime());
        String str = this.f46504k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((((this.f46494a.hashCode() + 527) * 31) + this.f46495b.hashCode()) * 31) + this.f46496c.hashCode()) * 31) + this.f46497d.hashCode()) * 31) + this.f46498e.hashCode()) * 31) + this.f46499f.hashCode()) * 31) + this.f46500g.hashCode()) * 31;
        String str = this.f46501h;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f46502i.hashCode()) * 31) + this.f46503j.hashCode()) * 31;
        String str2 = this.f46504k;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        StringBuilder append = sb.append(" token:");
        if (this.f46498e == null) {
            str = "null";
        } else if (m.a(u.INCLUDE_ACCESS_TOKENS)) {
            str = this.f46498e;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        append.append(str);
        sb.append(" permissions:");
        if (this.f46495b == null) {
            sb.append("null");
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f46495b));
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void a(AccessToken accessToken) {
        b.a().a(accessToken, true);
    }

    AccessToken(Parcel parcel) {
        this.f46494a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f46495b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f46496c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f46497d = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f46498e = parcel.readString();
        this.f46499f = c.valueOf(parcel.readString());
        this.f46500g = new Date(parcel.readLong());
        this.f46501h = parcel.readString();
        this.f46502i = parcel.readString();
        this.f46503j = new Date(parcel.readLong());
        this.f46504k = parcel.readString();
    }

    static AccessToken a(Bundle bundle) {
        c cVar;
        List<String> a2 = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> a3 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List<String> a4 = a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        ae.a(bundle, "bundle");
        String string = bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        if (ad.a(string)) {
            ae.a();
            string = m.f48915a;
        }
        ae.a(bundle, "bundle");
        String string2 = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        JSONObject a5 = aa.a(string2);
        if (a5 == null) {
            r a6 = GraphRequest.a(ad.f(string2));
            if (a6.f49019d != null) {
                a5 = null;
            } else {
                a5 = a6.f49017b;
            }
        }
        try {
            String string3 = a5.getString("id");
            ae.a(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                cVar = (c) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            } else if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                cVar = c.FACEBOOK_APPLICATION_WEB;
            } else {
                cVar = c.WEB_VIEW;
            }
            return new AccessToken(string2, string, string3, a2, a3, a4, cVar, t.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), t.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f46494a.equals(accessToken.f46494a) && this.f46495b.equals(accessToken.f46495b) && this.f46496c.equals(accessToken.f46496c) && this.f46497d.equals(accessToken.f46497d) && this.f46498e.equals(accessToken.f46498e) && this.f46499f == accessToken.f46499f && this.f46500g.equals(accessToken.f46500g) && ((str = this.f46501h) != null ? str.equals(accessToken.f46501h) : accessToken.f46501h == null) && this.f46502i.equals(accessToken.f46502i) && this.f46503j.equals(accessToken.f46503j)) {
            String str2 = this.f46504k;
            String str3 = accessToken.f46504k;
            if (str2 != null ? !str2.equals(str3) : str3 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static List<String> a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f46494a.getTime());
        parcel.writeStringList(new ArrayList(this.f46495b));
        parcel.writeStringList(new ArrayList(this.f46496c));
        parcel.writeStringList(new ArrayList(this.f46497d));
        parcel.writeString(this.f46498e);
        parcel.writeString(this.f46499f.name());
        parcel.writeLong(this.f46500g.getTime());
        parcel.writeString(this.f46501h);
        parcel.writeString(this.f46502i);
        parcel.writeLong(this.f46503j.getTime());
        parcel.writeString(this.f46504k);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, null);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, c cVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        ae.a(str, "accessToken");
        ae.a(str2, "applicationId");
        ae.a(str3, "userId");
        this.f46494a = date == null ? f46493m : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.f46495b = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.f46496c = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f46497d = Collections.unmodifiableSet(hashSet3);
        this.f46498e = str;
        this.f46499f = cVar == null ? o : cVar;
        this.f46500g = date2 == null ? n : date2;
        this.f46501h = str2;
        this.f46502i = str3;
        this.f46503j = (date3 == null || date3.getTime() == 0) ? f46493m : date3;
        this.f46504k = str4;
    }
}
