package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.c;
import com.facebook.e.a.a;
import com.facebook.internal.ac;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.facebook.m;
import com.facebook.p;
import com.facebook.r;
import com.facebook.s;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceAuthDialog extends d {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f48760a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public volatile RequestState f48761b;

    /* renamed from: c  reason: collision with root package name */
    public Dialog f48762c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f48763d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f48764e = false;

    /* renamed from: f  reason: collision with root package name */
    public LoginClient.Request f48765f = null;

    /* renamed from: g  reason: collision with root package name */
    private View f48766g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f48767h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f48768i;

    /* renamed from: j  reason: collision with root package name */
    private DeviceAuthMethodHandler f48769j;

    /* renamed from: k  reason: collision with root package name */
    private volatile p f48770k;

    /* renamed from: l  reason: collision with root package name */
    private volatile ScheduledFuture f48771l;

    static {
        Covode.recordClassIndex(29411);
    }

    private static int b(boolean z) {
        return z ? R.layout.ne : R.layout.nc;
    }

    /* access modifiers changed from: package-private */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() {
            /* class com.facebook.login.DeviceAuthDialog.RequestState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29420);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RequestState[] newArray(int i2) {
                return new RequestState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f48787a;

        /* renamed from: b  reason: collision with root package name */
        public String f48788b;

        /* renamed from: c  reason: collision with root package name */
        public String f48789c;

        /* renamed from: d  reason: collision with root package name */
        public long f48790d;

        /* renamed from: e  reason: collision with root package name */
        public long f48791e;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        static {
            Covode.recordClassIndex(29419);
        }

        public final boolean a() {
            if (this.f48791e != 0 && (new Date().getTime() - this.f48791e) - (this.f48790d * 1000) < 0) {
                return true;
            }
            return false;
        }

        protected RequestState(Parcel parcel) {
            this.f48787a = parcel.readString();
            this.f48788b = parcel.readString();
            this.f48789c = parcel.readString();
            this.f48790d = parcel.readLong();
            this.f48791e = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f48787a);
            parcel.writeString(this.f48788b);
            parcel.writeString(this.f48789c);
            parcel.writeLong(this.f48790d);
            parcel.writeLong(this.f48791e);
        }
    }

    private GraphRequest d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f48761b.f48789c);
        return new GraphRequest(null, "device/login_status", bundle, s.POST, new GraphRequest.b() {
            /* class com.facebook.login.DeviceAuthDialog.AnonymousClass4 */

            static {
                Covode.recordClassIndex(29415);
            }

            @Override // com.facebook.GraphRequest.b
            public final void a(r rVar) {
                JSONException e2;
                Date date;
                AnonymousClass4 r8 = this;
                if (!DeviceAuthDialog.this.f48760a.get()) {
                    FacebookRequestError facebookRequestError = rVar.f49019d;
                    if (facebookRequestError != null) {
                        int i2 = facebookRequestError.f46527e;
                        if (i2 != 1349152) {
                            switch (i2) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.b();
                                    return;
                                case 1349173:
                                    DeviceAuthDialog.this.c();
                                    return;
                                default:
                                    DeviceAuthDialog.this.a(rVar.f49019d.n);
                                    return;
                            }
                        } else {
                            if (DeviceAuthDialog.this.f48761b != null) {
                                a.c(DeviceAuthDialog.this.f48761b.f48788b);
                            }
                            if (DeviceAuthDialog.this.f48765f != null) {
                                DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                deviceAuthDialog.a(deviceAuthDialog.f48765f);
                                return;
                            }
                            DeviceAuthDialog.this.c();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = rVar.f49017b;
                            DeviceAuthDialog deviceAuthDialog2 = DeviceAuthDialog.this;
                            String string = jSONObject.getString("access_token");
                            Long valueOf = Long.valueOf(jSONObject.getLong("expires_in"));
                            Long valueOf2 = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                            Bundle bundle = new Bundle();
                            bundle.putString("fields", "id,permissions,name");
                            Date date2 = null;
                            if (valueOf.longValue() != 0) {
                                try {
                                    long time = new Date().getTime();
                                    long longValue = valueOf.longValue();
                                    Long.signum(longValue);
                                    date = new Date(time + (longValue * 1000));
                                } catch (JSONException e3) {
                                    e2 = e3;
                                    DeviceAuthDialog.this.a(new j(e2));
                                }
                            } else {
                                date = null;
                            }
                            if (valueOf2.longValue() != 0) {
                                date2 = new Date(valueOf2.longValue() * 1000);
                            }
                            ae.a();
                            new GraphRequest(new AccessToken(string, m.f48915a, "0", null, null, null, null, date, null, date2), "me", bundle, s.GET, new GraphRequest.b(string, date, date2) {
                                /* class com.facebook.login.DeviceAuthDialog.AnonymousClass7 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f48783a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ Date f48784b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ Date f48785c;

                                static {
                                    Covode.recordClassIndex(29418);
                                }

                                @Override // com.facebook.GraphRequest.b
                                public final void a(r rVar) {
                                    String optString;
                                    if (!DeviceAuthDialog.this.f48760a.get()) {
                                        if (rVar.f49019d != null) {
                                            DeviceAuthDialog.this.a(rVar.f49019d.n);
                                            return;
                                        }
                                        try {
                                            JSONObject jSONObject = rVar.f49017b;
                                            String string = jSONObject.getString("id");
                                            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
                                            ArrayList arrayList = new ArrayList(jSONArray.length());
                                            ArrayList arrayList2 = new ArrayList(jSONArray.length());
                                            ArrayList arrayList3 = new ArrayList(jSONArray.length());
                                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                                                String optString2 = optJSONObject.optString("permission");
                                                if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                                                    if (optString.equals("granted")) {
                                                        arrayList.add(optString2);
                                                    } else if (optString.equals("declined")) {
                                                        arrayList2.add(optString2);
                                                    } else if (optString.equals("expired")) {
                                                        arrayList3.add(optString2);
                                                    }
                                                }
                                            }
                                            ad.c cVar = new ad.c(arrayList, arrayList2, arrayList3);
                                            String string2 = jSONObject.getString(StringSet.name);
                                            a.c(DeviceAuthDialog.this.f48761b.f48788b);
                                            ae.a();
                                            if (!com.facebook.internal.r.a(m.f48915a).f48644e.contains(ac.RequireConfirm) || DeviceAuthDialog.this.f48764e) {
                                                DeviceAuthDialog.this.a(string, cVar, this.f48783a, this.f48784b, this.f48785c);
                                                return;
                                            }
                                            DeviceAuthDialog.this.f48764e = true;
                                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                            String str = this.f48783a;
                                            Date date = this.f48784b;
                                            Date date2 = this.f48785c;
                                            String string3 = deviceAuthDialog.getResources().getString(R.string.aid);
                                            String string4 = deviceAuthDialog.getResources().getString(R.string.aic);
                                            String string5 = deviceAuthDialog.getResources().getString(R.string.aib);
                                            String a2 = com.a.a(string4, new Object[]{string2});
                                            AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                                            builder.setMessage(string3).setCancelable(true).setNegativeButton(a2, new DialogInterface.OnClickListener(string, cVar, str, date, date2) {
                                                /* class com.facebook.login.DeviceAuthDialog.AnonymousClass6 */

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ String f48777a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ ad.c f48778b;

                                                /* renamed from: c  reason: collision with root package name */
                                                final /* synthetic */ String f48779c;

                                                /* renamed from: d  reason: collision with root package name */
                                                final /* synthetic */ Date f48780d;

                                                /* renamed from: e  reason: collision with root package name */
                                                final /* synthetic */ Date f48781e;

                                                static {
                                                    Covode.recordClassIndex(29417);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                                    DeviceAuthDialog.this.a(this.f48777a, this.f48778b, this.f48779c, this.f48780d, this.f48781e);
                                                }

                                                {
                                                    this.f48777a = r2;
                                                    this.f48778b = r3;
                                                    this.f48779c = r4;
                                                    this.f48780d = r5;
                                                    this.f48781e = r6;
                                                }
                                            }).setPositiveButton(string5, new DialogInterface.OnClickListener() {
                                                /* class com.facebook.login.DeviceAuthDialog.AnonymousClass5 */

                                                static {
                                                    Covode.recordClassIndex(29416);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                                    DeviceAuthDialog.this.f48762c.setContentView(DeviceAuthDialog.this.a(false));
                                                    DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                                    deviceAuthDialog.a(deviceAuthDialog.f48765f);
                                                }
                                            });
                                            builder.create().show();
                                        } catch (JSONException e2) {
                                            DeviceAuthDialog.this.a(new j(e2));
                                        }
                                    }
                                }

                                {
                                    this.f48783a = r2;
                                    this.f48784b = r3;
                                    this.f48785c = r4;
                                }
                            }).a();
                        } catch (JSONException e4) {
                            e2 = e4;
                            r8 = this;
                            DeviceAuthDialog.this.a(new j(e2));
                        }
                    }
                }
            }
        });
    }

    public final void a() {
        this.f48761b.f48791e = new Date().getTime();
        this.f48770k = d().a();
    }

    public final void b() {
        this.f48771l = DeviceAuthMethodHandler.c().schedule(new Runnable() {
            /* class com.facebook.login.DeviceAuthDialog.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29414);
            }

            public final void run() {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        DeviceAuthDialog.this.a();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        }, this.f48761b.f48790d, TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f48763d = true;
        this.f48760a.set(true);
        super.onDestroyView();
        if (this.f48770k != null) {
            this.f48770k.cancel(true);
        }
        if (this.f48771l != null) {
            this.f48771l.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.f48760a.compareAndSet(false, true)) {
            if (this.f48761b != null) {
                a.c(this.f48761b.f48788b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f48769j;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.b();
            }
            this.f48762c.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f48763d) {
            c();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f48761b != null) {
            bundle.putParcelable("request_state", this.f48761b);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(j jVar) {
        if (this.f48760a.compareAndSet(false, true)) {
            if (this.f48761b != null) {
                a.c(this.f48761b.f48788b);
            }
            this.f48769j.a(jVar);
            this.f48762c.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        this.f48762c = new Dialog(getActivity(), R.style.vg);
        if (!a.b() || this.f48764e) {
            z = false;
        } else {
            z = true;
        }
        this.f48762c.setContentView(a(z));
        return this.f48762c;
    }

    /* access modifiers changed from: protected */
    public final View a(boolean z) {
        MethodCollector.i(8709);
        View inflate = getActivity().getLayoutInflater().inflate(b(z), (ViewGroup) null);
        this.f48766g = inflate.findViewById(R.id.dc1);
        this.f48767h = (TextView) inflate.findViewById(R.id.acr);
        ((Button) inflate.findViewById(R.id.a1t)).setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.login.DeviceAuthDialog.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29413);
            }

            public final void onClick(View view) {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        DeviceAuthDialog.this.c();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.a8x);
        this.f48768i = textView;
        textView.setText(Html.fromHtml(getString(R.string.aht)));
        MethodCollector.o(8709);
        return inflate;
    }

    public final void a(RequestState requestState) {
        this.f48761b = requestState;
        this.f48767h.setText(requestState.f48788b);
        this.f48768i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), a.b(requestState.f48787a)), (Drawable) null, (Drawable) null);
        this.f48767h.setVisibility(0);
        this.f48766g.setVisibility(8);
        if (!this.f48764e && a.a(requestState.f48788b)) {
            new com.facebook.a.m(getContext()).b();
        }
        if (requestState.a()) {
            b();
        } else {
            a();
        }
    }

    public final void a(LoginClient.Request request) {
        this.f48765f = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f48812b));
        String str = request.f48817g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f48819i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        bundle.putString("access_token", ae.b() + "|" + ae.c());
        bundle.putString("device_info", a.a());
        new GraphRequest(null, "device/login", bundle, s.POST, new GraphRequest.b() {
            /* class com.facebook.login.DeviceAuthDialog.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29412);
            }

            @Override // com.facebook.GraphRequest.b
            public final void a(r rVar) {
                if (!DeviceAuthDialog.this.f48763d) {
                    if (rVar.f49019d != null) {
                        DeviceAuthDialog.this.a(rVar.f49019d.n);
                        return;
                    }
                    JSONObject jSONObject = rVar.f49017b;
                    RequestState requestState = new RequestState();
                    try {
                        String string = jSONObject.getString("user_code");
                        requestState.f48788b = string;
                        requestState.f48787a = com.a.a(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                        requestState.f48789c = jSONObject.getString("code");
                        requestState.f48790d = jSONObject.getLong("interval");
                        DeviceAuthDialog.this.a(requestState);
                    } catch (JSONException e2) {
                        DeviceAuthDialog.this.a(new j(e2));
                    }
                }
            }
        }).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f48769j = (DeviceAuthMethodHandler) ((e) ((FacebookActivity) getActivity()).f46521b).f48900a.a();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            a(requestState);
        }
        return onCreateView;
    }

    public final void a(String str, ad.c cVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f48769j;
        ae.a();
        deviceAuthMethodHandler.a(str2, m.f48915a, str, cVar.f48523a, cVar.f48524b, cVar.f48525c, c.DEVICE_AUTH, date, date2);
        this.f48762c.dismiss();
    }
}
