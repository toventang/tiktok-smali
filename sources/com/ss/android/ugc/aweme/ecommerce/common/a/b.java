package com.ss.android.ugc.aweme.ecommerce.common.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f85718d = "url";

    /* renamed from: e  reason: collision with root package name */
    public static final a f85719e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FallbackView f85720a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f85721b;

    /* renamed from: c  reason: collision with root package name */
    public final IEventCenter.b f85722c = new c(this);

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f85723m;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final View a(int i2) {
        if (this.f85723m == null) {
            this.f85723m = new SparseArray();
        }
        View view = (View) this.f85723m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85723m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void a() {
        SparseArray sparseArray = this.f85723m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53607);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Uri uri, int i2, i iVar, String str, boolean z) {
            l.d(uri, "");
            l.d(iVar, "");
            l.d(str, "");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable(b.f85718d, uri);
            bundle.putInt("height", i2);
            bundle.putBoolean("use_react_id_close", z);
            bVar.setArguments(bundle);
            bVar.show(iVar, str);
        }
    }

    public b() {
        super((byte) 0);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.a
    public final void onDestroy() {
        super.onDestroy();
        EventCenter.a().b("ec_close_sheet", this.f85722c);
    }

    static {
        Covode.recordClassIndex(53606);
    }

    public static final class c implements IEventCenter.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85725a;

        static {
            Covode.recordClassIndex(53609);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f85725a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
        public final void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            if (this.f85725a.f85721b) {
                try {
                    String optString = new JSONObject(str2).optString("react_id");
                    FallbackView fallbackView = this.f85725a.f85720a;
                    if (fallbackView != null) {
                        l.b(optString, "");
                        l.d(optString, "");
                        BulletContainerView bulletContainerView = fallbackView.f87201c;
                        if (bulletContainerView == null) {
                            l.a("bulletContainerView");
                        }
                        if (l.a((Object) optString, (Object) bulletContainerView.getReactId())) {
                            this.f85725a.dismiss();
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.services.apm.api.a.a(th);
                }
            } else {
                this.f85725a.dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new DialogInterface$OnKeyListenerC2051b(this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        MethodCollector.i(4416);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        e activity = getActivity();
        boolean z = false;
        if (activity != null) {
            FrameLayout frameLayout = (FrameLayout) a(R.id.ad7);
            l.b(activity, "");
            FallbackView fallbackView = new FallbackView(activity);
            this.f85720a = fallbackView;
            Bundle arguments = getArguments();
            if (!(arguments == null || (uri = (Uri) arguments.getParcelable(f85718d)) == null)) {
                if (!uri.getBooleanQueryParameter("enable_draggable", true)) {
                    fallbackView.setDraggable(false);
                }
                l.b(uri, "");
                fallbackView.a(activity, uri, false);
            }
            fallbackView.a(this);
            frameLayout.addView(fallbackView);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("use_react_id_close");
        }
        this.f85721b = z;
        EventCenter.a().a("ec_close_sheet", this.f85722c);
        MethodCollector.o(4416);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.o9, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnKeyListenerC2051b implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85724a;

        static {
            Covode.recordClassIndex(53608);
        }

        DialogInterface$OnKeyListenerC2051b(b bVar) {
            this.f85724a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            FallbackView fallbackView;
            if (i2 != 4) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() == 1 && (fallbackView = this.f85724a.f85720a) != null && fallbackView.a()) {
                return true;
            }
            return false;
        }
    }
}
