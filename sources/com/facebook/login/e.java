package com.facebook.login;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.AccessToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class e extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public LoginClient f48900a;

    /* renamed from: b  reason: collision with root package name */
    LoginClient.Request f48901b;

    /* renamed from: c  reason: collision with root package name */
    private String f48902c;

    static {
        Covode.recordClassIndex(29474);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginClient loginClient = this.f48900a;
        if (loginClient.f48800b >= 0) {
            loginClient.a().v_();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View findViewById;
        super.onPause();
        if (getView() != null && (findViewById = getView().findViewById(R.id.a8z)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f48902c == null) {
            getActivity().finish();
            return;
        }
        LoginClient loginClient = this.f48900a;
        LoginClient.Request request = this.f48901b;
        if ((loginClient.f48805g != null && loginClient.f48800b >= 0) || request == null) {
            return;
        }
        if (loginClient.f48805g != null) {
            throw new j("Attempted to authorize while a request is pending.");
        } else if (!AccessToken.a() || loginClient.b()) {
            loginClient.f48805g = request;
            ArrayList arrayList = new ArrayList();
            d dVar = request.f48811a;
            if (dVar.allowsGetTokenAuth) {
                arrayList.add(new GetTokenLoginMethodHandler(loginClient));
            }
            if (dVar.allowsKatanaAuth) {
                arrayList.add(new KatanaProxyLoginMethodHandler(loginClient));
            }
            if (dVar.allowsFacebookLiteAuth) {
                arrayList.add(new FacebookLiteLoginMethodHandler(loginClient));
            }
            if (dVar.allowsCustomTabAuth) {
                arrayList.add(new CustomTabLoginMethodHandler(loginClient));
            }
            if (dVar.allowsWebViewAuth) {
                arrayList.add(new WebViewLoginMethodHandler(loginClient));
            }
            if (dVar.allowsDeviceAuth) {
                arrayList.add(new DeviceAuthMethodHandler(loginClient));
            }
            LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
            arrayList.toArray(loginMethodHandlerArr);
            loginClient.f48799a = loginMethodHandlerArr;
            loginClient.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f48900a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f48900a = loginClient;
            if (loginClient.f48801c == null) {
                loginClient.f48801c = this;
            } else {
                throw new j("Can't set fragment once it is already set.");
            }
        } else {
            this.f48900a = new LoginClient(this);
        }
        this.f48900a.f48802d = new LoginClient.b() {
            /* class com.facebook.login.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29475);
            }

            @Override // com.facebook.login.LoginClient.b
            public final void a(LoginClient.Result result) {
                int i2;
                e eVar = e.this;
                eVar.f48901b = null;
                if (result.f48820a == LoginClient.Result.a.CANCEL) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.facebook.LoginFragment:Result", result);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                if (eVar.isAdded()) {
                    eVar.getActivity().setResult(i2, intent);
                    eVar.getActivity().finish();
                }
            }
        };
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                this.f48902c = callingActivity.getPackageName();
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (bundleExtra != null) {
                    if (context != null) {
                        bundleExtra.setClassLoader(context.getClassLoader());
                    }
                    this.f48901b = (LoginClient.Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = a.a(layoutInflater, R.layout.nd, viewGroup, false);
        final View findViewById = a2.findViewById(R.id.a8z);
        this.f48900a.f48803e = new LoginClient.a() {
            /* class com.facebook.login.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29476);
            }

            @Override // com.facebook.login.LoginClient.a
            public final void a() {
                findViewById.setVisibility(0);
            }

            @Override // com.facebook.login.LoginClient.a
            public final void b() {
                findViewById.setVisibility(8);
            }
        };
        return a2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        LoginClient loginClient = this.f48900a;
        loginClient.f48808j++;
        if (loginClient.f48805g == null) {
            return;
        }
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f46514f, false)) {
            loginClient.c();
        } else if (!loginClient.a().e() || intent != null || loginClient.f48808j >= loginClient.f48809k) {
            loginClient.a().a(i2, i3, intent);
        }
    }
}
