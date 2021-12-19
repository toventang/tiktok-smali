package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public static final Scope f49816a = new Scope("profile");

    /* renamed from: b  reason: collision with root package name */
    public static final Scope f49817b = new Scope("email");

    /* renamed from: c  reason: collision with root package name */
    public static final Scope f49818c = new Scope("openid");

    /* renamed from: d  reason: collision with root package name */
    public static final Scope f49819d;

    /* renamed from: e  reason: collision with root package name */
    public static final Scope f49820e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f  reason: collision with root package name */
    public static final GoogleSignInOptions f49821f = new a().a().b().c();

    /* renamed from: g  reason: collision with root package name */
    public static final GoogleSignInOptions f49822g;
    private static Comparator<Scope> s = new e();

    /* renamed from: h  reason: collision with root package name */
    final ArrayList<Scope> f49823h;

    /* renamed from: i  reason: collision with root package name */
    public Account f49824i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f49825j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f49826k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f49827l;

    /* renamed from: m  reason: collision with root package name */
    public String f49828m;
    String n;
    public ArrayList<GoogleSignInOptionsExtensionParcelable> o;
    public String p;
    private final int q;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> r;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Set<Scope> f49829a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public boolean f49830b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f49831c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f49832d;

        /* renamed from: e  reason: collision with root package name */
        public String f49833e;

        /* renamed from: f  reason: collision with root package name */
        public String f49834f;

        /* renamed from: g  reason: collision with root package name */
        private Account f49835g;

        /* renamed from: h  reason: collision with root package name */
        private String f49836h;

        /* renamed from: i  reason: collision with root package name */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f49837i = new HashMap();

        static {
            Covode.recordClassIndex(31101);
        }

        public final a a() {
            this.f49829a.add(GoogleSignInOptions.f49818c);
            return this;
        }

        public final a b() {
            this.f49829a.add(GoogleSignInOptions.f49816a);
            return this;
        }

        public a() {
        }

        public final GoogleSignInOptions c() {
            if (this.f49829a.contains(GoogleSignInOptions.f49820e) && this.f49829a.contains(GoogleSignInOptions.f49819d)) {
                this.f49829a.remove(GoogleSignInOptions.f49819d);
            }
            if (this.f49832d && (this.f49835g == null || !this.f49829a.isEmpty())) {
                a();
            }
            return new GoogleSignInOptions(new ArrayList(this.f49829a), this.f49835g, this.f49832d, this.f49830b, this.f49831c, this.f49833e, this.f49836h, this.f49837i, this.f49834f);
        }

        public final String a(String str) {
            boolean z;
            r.a(str);
            String str2 = this.f49833e;
            if (str2 == null || str2.equals(str)) {
                z = true;
            } else {
                z = false;
            }
            r.b(z, "two different server client ids provided");
            return str;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            r.a(googleSignInOptions);
            this.f49829a = new HashSet(googleSignInOptions.f49823h);
            this.f49830b = googleSignInOptions.f49826k;
            this.f49831c = googleSignInOptions.f49827l;
            this.f49832d = googleSignInOptions.f49825j;
            this.f49833e = googleSignInOptions.f49828m;
            this.f49835g = googleSignInOptions.f49824i;
            this.f49836h = googleSignInOptions.n;
            this.f49837i = GoogleSignInOptions.b(googleSignInOptions.o);
            this.f49834f = googleSignInOptions.p;
        }

        public final a a(Scope scope, Scope... scopeArr) {
            this.f49829a.add(scope);
            this.f49829a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    public final ArrayList<Scope> a() {
        return new ArrayList<>(this.f49823h);
    }

    static {
        Covode.recordClassIndex(31100);
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f49819d = scope;
        f49822g = new a().a(scope, new Scope[0]).c();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f49823h, s);
            ArrayList<Scope> arrayList = this.f49823h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Scope scope = arrayList.get(i2);
                i2++;
                jSONArray.put(scope.f49958a);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f49824i;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f49825j);
            jSONObject.put("forceCodeForRefreshToken", this.f49827l);
            jSONObject.put("serverAuthRequested", this.f49826k);
            if (!TextUtils.isEmpty(this.f49828m)) {
                jSONObject.put("serverClientId", this.f49828m);
            }
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("hostedDomain", this.n);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f49823h;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Scope scope = arrayList2.get(i2);
            i2++;
            arrayList.add(scope.f49958a);
        }
        Collections.sort(arrayList);
        return new com.google.android.gms.auth.api.signin.internal.a().a(arrayList).a(this.f49824i).a(this.f49828m).a(this.f49827l).a(this.f49825j).a(this.f49826k).a(this.p).f49857a;
    }

    /* access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f49844a), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4.f49824i == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r4.f49828m) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.q);
        b.b(parcel, 2, a());
        b.a(parcel, 3, this.f49824i, i2);
        b.a(parcel, 4, this.f49825j);
        b.a(parcel, 5, this.f49826k);
        b.a(parcel, 6, this.f49827l);
        b.a(parcel, 7, this.f49828m);
        b.a(parcel, 8, this.n);
        b.b(parcel, 9, this.o);
        b.a(parcel, 10, this.p);
        b.b(parcel, a2);
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i2, arrayList, account, z, z2, z3, str, str2, b(arrayList2), str3);
    }

    public GoogleSignInOptions(int i2, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.q = i2;
        this.f49823h = arrayList;
        this.f49824i = account;
        this.f49825j = z;
        this.f49826k = z2;
        this.f49827l = z3;
        this.f49828m = str;
        this.n = str2;
        this.o = new ArrayList<>(map.values());
        this.r = map;
        this.p = str3;
    }
}
