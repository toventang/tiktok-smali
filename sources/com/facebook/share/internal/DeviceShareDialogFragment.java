package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.e.a.a;
import com.facebook.internal.ae;
import com.facebook.r;
import com.facebook.s;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceShareDialogFragment extends d {

    /* renamed from: g  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f49047g;

    /* renamed from: a  reason: collision with root package name */
    public Dialog f49048a;

    /* renamed from: b  reason: collision with root package name */
    public ShareContent f49049b;

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f49050c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49051d;

    /* renamed from: e  reason: collision with root package name */
    private volatile RequestState f49052e;

    /* renamed from: f  reason: collision with root package name */
    private volatile ScheduledFuture f49053f;

    static {
        Covode.recordClassIndex(30651);
    }

    /* access modifiers changed from: package-private */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.RequestState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(30656);
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
        public String f49057a;

        /* renamed from: b  reason: collision with root package name */
        public long f49058b;

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        static {
            Covode.recordClassIndex(30655);
        }

        protected RequestState(Parcel parcel) {
            this.f49057a = parcel.readString();
            this.f49058b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f49057a);
            parcel.writeLong(this.f49058b);
        }
    }

    private void a() {
        if (isAdded()) {
            getFragmentManager().a().a(this).b();
        }
    }

    private static synchronized ScheduledThreadPoolExecutor b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            MethodCollector.i(10454);
            if (f49047g == null) {
                f49047g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f49047g;
            MethodCollector.o(10454);
        }
        return scheduledThreadPoolExecutor;
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f49052e != null) {
            bundle.putParcelable("request_state", this.f49052e);
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f49053f != null) {
            this.f49053f.cancel(true);
        }
        a(new Intent());
    }

    private void a(Intent intent) {
        if (this.f49052e != null) {
            a.c(this.f49052e.f49057a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            a(Toast.makeText(getContext(), facebookRequestError.a(), 0));
        }
        if (isAdded()) {
            e activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void a(FacebookRequestError facebookRequestError) {
        a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        a(intent);
    }

    public final void a(RequestState requestState) {
        this.f49052e = requestState;
        this.f49051d.setText(requestState.f49057a);
        this.f49051d.setVisibility(0);
        this.f49050c.setVisibility(8);
        this.f49053f = b().schedule(new Runnable() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.AnonymousClass3 */

            static {
                Covode.recordClassIndex(30654);
            }

            public final void run() {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        DeviceShareDialogFragment.this.f49048a.dismiss();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        }, requestState.f49058b, TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        MethodCollector.i(10301);
        this.f49048a = new Dialog(getActivity(), R.style.vg);
        Bundle bundle2 = null;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.nc, (ViewGroup) null);
        this.f49050c = (ProgressBar) inflate.findViewById(R.id.dc1);
        this.f49051d = (TextView) inflate.findViewById(R.id.acr);
        ((Button) inflate.findViewById(R.id.a1t)).setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.AnonymousClass1 */

            static {
                Covode.recordClassIndex(30652);
            }

            public final void onClick(View view) {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        DeviceShareDialogFragment.this.f49048a.dismiss();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        });
        ((TextView) inflate.findViewById(R.id.a8x)).setText(Html.fromHtml(getString(R.string.aht)));
        this.f49048a.setContentView(inflate);
        ShareContent shareContent = this.f49049b;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                bundle2 = m.a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                bundle2 = m.a((ShareOpenGraphContent) shareContent);
            }
        }
        if (bundle2 == null || bundle2.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        bundle2.putString("access_token", ae.b() + "|" + ae.c());
        bundle2.putString("device_info", a.a());
        new GraphRequest(null, "device/share", bundle2, s.POST, new GraphRequest.b() {
            /* class com.facebook.share.internal.DeviceShareDialogFragment.AnonymousClass2 */

            static {
                Covode.recordClassIndex(30653);
            }

            @Override // com.facebook.GraphRequest.b
            public final void a(r rVar) {
                FacebookRequestError facebookRequestError = rVar.f49019d;
                if (facebookRequestError != null) {
                    DeviceShareDialogFragment.this.a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = rVar.f49017b;
                RequestState requestState = new RequestState();
                try {
                    requestState.f49057a = jSONObject.getString("user_code");
                    requestState.f49058b = jSONObject.getLong("expires_in");
                    DeviceShareDialogFragment.this.a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        }).a();
        Dialog dialog = this.f49048a;
        MethodCollector.o(10301);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            a(requestState);
        }
        return onCreateView;
    }
}
