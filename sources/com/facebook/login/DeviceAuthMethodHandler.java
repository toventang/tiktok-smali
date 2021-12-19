package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.c;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.DeviceAuthMethodHandler.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29422);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new DeviceAuthMethodHandler[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f48792a;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final String a() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29421);
    }

    public final void b() {
        this.f48844c.a(LoginClient.Result.a(this.f48844c.f48805g, "User canceled log in."));
    }

    public static synchronized ScheduledThreadPoolExecutor c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            MethodCollector.i(9777);
            if (f48792a == null) {
                f48792a = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f48792a;
            MethodCollector.o(9777);
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final void a(Exception exc) {
        this.f48844c.a(LoginClient.Result.a(this.f48844c.f48805g, null, exc.getMessage(), null));
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final int a(LoginClient.Request request) {
        e activity = this.f48844c.f48801c.getActivity();
        if (activity == null || activity.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.a(request);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }

    public final void a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, c cVar, Date date, Date date2) {
        this.f48844c.a(LoginClient.Result.a(this.f48844c.f48805g, new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, null, date2)));
    }
}
