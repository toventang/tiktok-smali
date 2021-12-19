package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.c;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.y;
import com.facebook.internal.z;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.push.downgrade.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.GetTokenLoginMethodHandler.AnonymousClass3 */

        static {
            Covode.recordClassIndex(29428);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private c f48793a;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "get_token";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29425);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final void v_() {
        c cVar = this.f48793a;
        if (cVar != null) {
            cVar.f48710c = false;
            this.f48793a.f48709b = null;
            this.f48793a = null;
        }
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final int a(final LoginClient.Request request) {
        Intent a2;
        c cVar = new c(this.f48844c.f48801c.getActivity(), request.f48814d);
        this.f48793a = cVar;
        if (cVar.f48710c || y.b(cVar.f48712e) == -1 || (a2 = y.a(cVar.f48708a)) == null) {
            return 0;
        }
        cVar.f48710c = true;
        Context context = cVar.f48708a;
        if (context == null || !(context instanceof Context)) {
            context.bindService(a2, cVar, 1);
        } else if (!d.a(context, a2)) {
            context.bindService(a2, cVar, 1);
        }
        this.f48844c.d();
        this.f48793a.f48709b = new z.a() {
            /* class com.facebook.login.GetTokenLoginMethodHandler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29426);
            }

            @Override // com.facebook.internal.z.a
            public final void a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.a(request, bundle);
            }
        };
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }

    /* access modifiers changed from: package-private */
    public final void b(LoginClient.Request request, Bundle bundle) {
        this.f48844c.a(LoginClient.Result.a(this.f48844c.f48805g, a(bundle, c.FACEBOOK_APPLICATION_SERVICE, request.f48814d)));
    }

    /* access modifiers changed from: package-private */
    public final void a(final LoginClient.Request request, final Bundle bundle) {
        c cVar = this.f48793a;
        if (cVar != null) {
            cVar.f48709b = null;
        }
        this.f48793a = null;
        LoginClient loginClient = this.f48844c;
        if (loginClient.f48803e != null) {
            loginClient.f48803e.b();
        }
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> set = request.f48812b;
            if (stringArrayList == null || (set != null && !stringArrayList.containsAll(set))) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(",", hashSet));
                }
                ae.a((Object) hashSet, "permissions");
                request.f48812b = hashSet;
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    this.f48844c.d();
                    ad.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (ad.a) new ad.a() {
                        /* class com.facebook.login.GetTokenLoginMethodHandler.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(29427);
                        }

                        @Override // com.facebook.internal.ad.a
                        public final void a(j jVar) {
                            GetTokenLoginMethodHandler.this.f48844c.b(LoginClient.Result.a(GetTokenLoginMethodHandler.this.f48844c.f48805g, "Caught exception", jVar.getMessage(), null));
                        }

                        @Override // com.facebook.internal.ad.a
                        public final void a(JSONObject jSONObject) {
                            try {
                                bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                GetTokenLoginMethodHandler.this.b(request, bundle);
                            } catch (JSONException e2) {
                                GetTokenLoginMethodHandler.this.f48844c.b(LoginClient.Result.a(GetTokenLoginMethodHandler.this.f48844c.f48805g, "Caught exception", e2.getMessage(), null));
                            }
                        }
                    });
                    return;
                }
                b(request, bundle);
                return;
            }
        }
        this.f48844c.c();
    }
}
