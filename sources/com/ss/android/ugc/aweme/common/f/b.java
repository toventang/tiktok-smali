package com.ss.android.ugc.aweme.common.f;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.e;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.common.utility.collection.d<e> f76418a = new com.bytedance.common.utility.collection.d<>();
    public boolean ad;
    public boolean ae;
    public boolean af;

    static {
        Covode.recordClassIndex(47175);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.ae = false;
        EventBus.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f76418a.f26927a.isEmpty()) {
            Iterator<e> it = this.f76418a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.ae = false;
        this.af = true;
        if (!this.f76418a.f26927a.isEmpty()) {
            Iterator<e> it = this.f76418a.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next != null) {
                    next.a();
                }
            }
            this.f76418a.f26927a.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.ad = true;
        if (!this.f76418a.f26927a.isEmpty()) {
            Iterator<e> it = this.f76418a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.ad = false;
        if (!this.f76418a.f26927a.isEmpty()) {
            Iterator<e> it = this.f76418a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        EventBus.a().a(this);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ad = false;
        this.ae = false;
        this.af = false;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getFragmentManager() != null && isAdded()) {
            try {
                dismiss();
            } catch (IllegalStateException unused) {
                dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.ae = true;
    }
}
