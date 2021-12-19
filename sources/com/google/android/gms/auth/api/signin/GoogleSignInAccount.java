package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.system.b.a.b.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public static e f49796a = g.f50507a;

    /* renamed from: b  reason: collision with root package name */
    public String f49797b;

    /* renamed from: c  reason: collision with root package name */
    public String f49798c;

    /* renamed from: d  reason: collision with root package name */
    public String f49799d;

    /* renamed from: e  reason: collision with root package name */
    public String f49800e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f49801f;

    /* renamed from: g  reason: collision with root package name */
    public String f49802g;

    /* renamed from: h  reason: collision with root package name */
    public String f49803h;

    /* renamed from: i  reason: collision with root package name */
    public String f49804i;

    /* renamed from: j  reason: collision with root package name */
    public String f49805j;

    /* renamed from: k  reason: collision with root package name */
    private final int f49806k;

    /* renamed from: l  reason: collision with root package name */
    private long f49807l;

    /* renamed from: m  reason: collision with root package name */
    private List<Scope> f49808m;
    private Set<Scope> n = new HashSet();

    public final Account a() {
        if (this.f49799d == null) {
            return null;
        }
        return new Account(this.f49799d, a.f36455d);
    }

    public final Set<Scope> b() {
        HashSet hashSet = new HashSet(this.f49808m);
        hashSet.addAll(this.n);
        return hashSet;
    }

    static {
        Covode.recordClassIndex(31096);
    }

    public int hashCode() {
        return ((this.f49803h.hashCode() + 527) * 31) + b().hashCode();
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f49797b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.f49798c;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.f49799d;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.f49800e;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.f49804i;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.f49805j;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.f49801f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.f49802g;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.f49807l);
            jSONObject.put("obfuscatedIdentifier", this.f49803h);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f49808m;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.f49843a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f49958a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f49803h.equals(this.f49803h) || !googleSignInAccount.b().equals(b())) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f49806k);
        b.a(parcel, 2, this.f49797b);
        b.a(parcel, 3, this.f49798c);
        b.a(parcel, 4, this.f49799d);
        b.a(parcel, 5, this.f49800e);
        b.a(parcel, 6, this.f49801f, i2);
        b.a(parcel, 7, this.f49802g);
        b.a(parcel, 8, this.f49807l);
        b.a(parcel, 9, this.f49803h);
        b.b(parcel, 10, this.f49808m);
        b.a(parcel, 11, this.f49804i);
        b.a(parcel, 12, this.f49805j);
        b.b(parcel, a2);
    }

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f49806k = i2;
        this.f49797b = str;
        this.f49798c = str2;
        this.f49799d = str3;
        this.f49800e = str4;
        this.f49801f = uri;
        this.f49802g = str5;
        this.f49807l = j2;
        this.f49803h = str6;
        this.f49808m = list;
        this.f49804i = str7;
        this.f49805j = str8;
    }
}
