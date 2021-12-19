package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator<LoginClient>() {
        /* class com.facebook.login.LoginClient.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29433);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LoginClient[] newArray(int i2) {
            return new LoginClient[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    LoginMethodHandler[] f48799a;

    /* renamed from: b  reason: collision with root package name */
    int f48800b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f48801c;

    /* renamed from: d  reason: collision with root package name */
    public b f48802d;

    /* renamed from: e  reason: collision with root package name */
    public a f48803e;

    /* renamed from: f  reason: collision with root package name */
    boolean f48804f;

    /* renamed from: g  reason: collision with root package name */
    public Request f48805g;

    /* renamed from: h  reason: collision with root package name */
    Map<String, String> f48806h;

    /* renamed from: i  reason: collision with root package name */
    Map<String, String> f48807i;

    /* renamed from: j  reason: collision with root package name */
    int f48808j;

    /* renamed from: k  reason: collision with root package name */
    int f48809k;

    /* renamed from: l  reason: collision with root package name */
    private f f48810l;

    interface a {
        static {
            Covode.recordClassIndex(29439);
        }

        void a();

        void b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(29440);
        }

        void a(Result result);
    }

    public int describeContents() {
        return 0;
    }

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() {
            /* class com.facebook.login.LoginClient.Request.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29435);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Request[] newArray(int i2) {
                return new Request[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Request createFromParcel(Parcel parcel) {
                return new Request(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final d f48811a;

        /* renamed from: b  reason: collision with root package name */
        public Set<String> f48812b;

        /* renamed from: c  reason: collision with root package name */
        public final b f48813c;

        /* renamed from: d  reason: collision with root package name */
        public final String f48814d;

        /* renamed from: e  reason: collision with root package name */
        public final String f48815e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f48816f;

        /* renamed from: g  reason: collision with root package name */
        public String f48817g;

        /* renamed from: h  reason: collision with root package name */
        public String f48818h;

        /* renamed from: i  reason: collision with root package name */
        public String f48819i;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(29434);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            for (String str : this.f48812b) {
                if (LoginManager.a(str)) {
                    return true;
                }
            }
            return false;
        }

        private Request(Parcel parcel) {
            d dVar;
            boolean z;
            String readString = parcel.readString();
            b bVar = null;
            if (readString != null) {
                dVar = d.valueOf(readString);
            } else {
                dVar = null;
            }
            this.f48811a = dVar;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f48812b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f48813c = readString2 != null ? b.valueOf(readString2) : bVar;
            this.f48814d = parcel.readString();
            this.f48815e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f48816f = z;
            this.f48817g = parcel.readString();
            this.f48818h = parcel.readString();
            this.f48819i = parcel.readString();
        }

        /* synthetic */ Request(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            String str;
            d dVar = this.f48811a;
            String str2 = null;
            if (dVar != null) {
                str = dVar.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f48812b));
            b bVar = this.f48813c;
            if (bVar != null) {
                str2 = bVar.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f48814d);
            parcel.writeString(this.f48815e);
            parcel.writeByte(this.f48816f ? (byte) 1 : 0);
            parcel.writeString(this.f48817g);
            parcel.writeString(this.f48818h);
            parcel.writeString(this.f48819i);
        }

        Request(d dVar, Set<String> set, b bVar, String str, String str2, String str3) {
            this.f48811a = dVar;
            this.f48812b = set == null ? new HashSet<>() : set;
            this.f48813c = bVar;
            this.f48818h = str;
            this.f48814d = str2;
            this.f48815e = str3;
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
            /* class com.facebook.login.LoginClient.Result.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29437);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Result[] newArray(int i2) {
                return new Result[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Result createFromParcel(Parcel parcel) {
                return new Result(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        final a f48820a;

        /* renamed from: b  reason: collision with root package name */
        final AccessToken f48821b;

        /* renamed from: c  reason: collision with root package name */
        final String f48822c;

        /* renamed from: d  reason: collision with root package name */
        final String f48823d;

        /* renamed from: e  reason: collision with root package name */
        final Request f48824e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f48825f;

        /* renamed from: g  reason: collision with root package name */
        public Map<String, String> f48826g;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(29436);
        }

        /* access modifiers changed from: package-private */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            public final String loggingValue;

            static {
                Covode.recordClassIndex(29438);
            }

            private a(String str) {
                this.loggingValue = str;
            }
        }

        private Result(Parcel parcel) {
            this.f48820a = a.valueOf(parcel.readString());
            this.f48821b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f48822c = parcel.readString();
            this.f48823d = parcel.readString();
            this.f48824e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f48825f = ad.a(parcel);
            this.f48826g = ad.a(parcel);
        }

        /* synthetic */ Result(Parcel parcel, byte b2) {
            this(parcel);
        }

        static Result a(Request request, AccessToken accessToken) {
            return new Result(request, a.SUCCESS, accessToken, null, null);
        }

        static Result a(Request request, String str) {
            return new Result(request, a.CANCEL, null, str, null);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f48820a.name());
            parcel.writeParcelable(this.f48821b, i2);
            parcel.writeString(this.f48822c);
            parcel.writeString(this.f48823d);
            parcel.writeParcelable(this.f48824e, i2);
            ad.a(parcel, this.f48825f);
            ad.a(parcel, this.f48826g);
        }

        static Result a(Request request, String str, String str2, String str3) {
            return new Result(request, a.ERROR, null, TextUtils.join(": ", ad.a(str, str2)), str3);
        }

        private Result(Request request, a aVar, AccessToken accessToken, String str, String str2) {
            ae.a(aVar, "code");
            this.f48824e = request;
            this.f48821b = accessToken;
            this.f48822c = str;
            this.f48820a = aVar;
            this.f48823d = str2;
        }
    }

    static {
        Covode.recordClassIndex(29432);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        a aVar = this.f48803e;
        if (aVar != null) {
            aVar.a();
        }
    }

    static String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    public final LoginMethodHandler a() {
        int i2 = this.f48800b;
        if (i2 >= 0) {
            return this.f48799a[i2];
        }
        return null;
    }

    private f f() {
        f fVar = this.f48810l;
        if (fVar == null || !fVar.a().equals(this.f48805g.f48814d)) {
            this.f48810l = new f(this.f48801c.getActivity(), this.f48805g.f48814d);
        }
        return this.f48810l;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f48804f) {
            return true;
        }
        if (this.f48801c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            e activity = this.f48801c.getActivity();
            b(Result.a(this.f48805g, activity.getString(R.string.ahw), activity.getString(R.string.ahv), null));
            return false;
        }
        this.f48804f = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i2;
        if (this.f48800b >= 0) {
            a(a().a(), "skipped", null, null, a().f48843b);
        }
        while (true) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f48799a;
            if (loginMethodHandlerArr == null || (i2 = this.f48800b) >= loginMethodHandlerArr.length - 1) {
                Request request = this.f48805g;
            } else {
                this.f48800b = i2 + 1;
                LoginMethodHandler a2 = a();
                if (!a2.f() || b()) {
                    int a3 = a2.a(this.f48805g);
                    this.f48808j = 0;
                    if (a3 > 0) {
                        f f2 = f();
                        String str = this.f48805g.f48815e;
                        String a4 = a2.a();
                        if (!com.facebook.internal.a.b.a.a(f2)) {
                            try {
                                f.a(str).putString("3_method", a4);
                                f2.f48907a.d();
                            } catch (Throwable th) {
                                com.facebook.internal.a.b.a.a(th, f2);
                            }
                        }
                        this.f48809k = a3;
                        return;
                    }
                    f f3 = f();
                    String str2 = this.f48805g.f48815e;
                    String a5 = a2.a();
                    if (!com.facebook.internal.a.b.a.a(f3)) {
                        try {
                            f.a(str2).putString("3_method", a5);
                            f3.f48907a.d();
                        } catch (Throwable th2) {
                            com.facebook.internal.a.b.a.a(th2, f3);
                        }
                    }
                    a("not_tried", a2.a(), true);
                } else {
                    a("no_internet_permission", "1", false);
                }
            }
        }
        Request request2 = this.f48805g;
        if (request2 != null) {
            b(Result.a(request2, "Login attempt failed.", null, null));
        }
    }

    private void d(Result result) {
        b bVar = this.f48802d;
        if (bVar != null) {
            bVar.a(result);
        }
    }

    public LoginClient(Fragment fragment) {
        this.f48801c = fragment;
    }

    /* access modifiers changed from: package-private */
    public final void b(Result result) {
        LoginMethodHandler a2 = a();
        if (a2 != null) {
            a(a2.a(), result, a2.f48843b);
        }
        Map<String, String> map = this.f48806h;
        if (map != null) {
            result.f48825f = map;
        }
        Map<String, String> map2 = this.f48807i;
        if (map2 != null) {
            result.f48826g = map2;
        }
        this.f48799a = null;
        this.f48800b = -1;
        this.f48805g = null;
        this.f48806h = null;
        this.f48808j = 0;
        this.f48809k = 0;
        d(result);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.facebook.login.LoginMethodHandler[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: com.facebook.login.FacebookLiteLoginMethodHandler */
    /* JADX WARN: Multi-variable type inference failed */
    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f48799a = new LoginMethodHandler[readParcelableArray.length];
        for (int i2 = 0; i2 < readParcelableArray.length; i2++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f48799a;
            loginMethodHandlerArr[i2] = readParcelableArray[i2];
            loginMethodHandlerArr[i2].a(this);
        }
        this.f48800b = parcel.readInt();
        this.f48805g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f48806h = ad.a(parcel);
        this.f48807i = ad.a(parcel);
    }

    private void c(Result result) {
        Result result2;
        if (result.f48821b != null) {
            AccessToken accessToken = com.facebook.b.a().f46926b;
            AccessToken accessToken2 = result.f48821b;
            if (!(accessToken == null || accessToken2 == null)) {
                try {
                    if (accessToken.f46502i.equals(accessToken2.f46502i)) {
                        result2 = Result.a(this.f48805g, result.f48821b);
                        b(result2);
                        return;
                    }
                } catch (Exception e2) {
                    b(Result.a(this.f48805g, "Caught exception", e2.getMessage(), null));
                    return;
                }
            }
            result2 = Result.a(this.f48805g, "User logged in as different Facebook user.", null, null);
            b(result2);
            return;
        }
        throw new j("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    public final void a(Result result) {
        if (result.f48821b == null || !AccessToken.a()) {
            b(result);
        } else {
            c(result);
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelableArray(this.f48799a, i2);
        parcel.writeInt(this.f48800b);
        parcel.writeParcelable(this.f48805g, i2);
        ad.a(parcel, this.f48806h);
        ad.a(parcel, this.f48807i);
    }

    private void a(String str, Result result, Map<String, String> map) {
        a(str, result.f48820a.loggingValue, result.f48822c, result.f48823d, map);
    }

    private void a(String str, String str2, boolean z) {
        if (this.f48806h == null) {
            this.f48806h = new HashMap();
        }
        if (this.f48806h.containsKey(str) && z) {
            str2 = this.f48806h.get(str) + "," + str2;
        }
        this.f48806h.put(str, str2);
    }

    private void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f48805g == null) {
            f().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            f().a(this.f48805g.f48815e, str, str2, str3, str4, map);
        }
    }
}
