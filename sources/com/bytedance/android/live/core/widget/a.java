package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.android.livesdk.bf;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

public class a extends com.bytedance.android.live.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9301a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9302b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9303c;

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnDismissListener f9304d;

    /* renamed from: e  reason: collision with root package name */
    private d<Object> f9305e = new d<>();

    static {
        Covode.recordClassIndex(4749);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f9302b = false;
    }

    public String j_() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f9305e.f26927a.isEmpty()) {
            Iterator<Object> it = this.f9305e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f9302b = false;
        this.f9303c = true;
        if (!this.f9305e.f26927a.isEmpty()) {
            Iterator<Object> it = this.f9305e.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f9305e.f26927a.clear();
        }
        bf.a().c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9301a = true;
        if (!this.f9305e.f26927a.isEmpty()) {
            Iterator<Object> it = this.f9305e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f9301a = false;
        if (!this.f9305e.f26927a.isEmpty()) {
            Iterator<Object> it = this.f9305e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        try {
            dismiss();
        } catch (IllegalStateException unused) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f9304d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9301a = false;
        this.f9302b = false;
        this.f9303c = false;
        bf.a().b();
    }

    public static void a(e eVar, androidx.fragment.app.d dVar) {
        a(eVar, dVar, dVar.getClass().getCanonicalName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f9302b = true;
        getDialog().setOnKeyListener(new b(this));
    }

    private static void a(e eVar, androidx.fragment.app.d dVar, String str) {
        if (eVar != null && dVar != null) {
            dVar.show(eVar.getSupportFragmentManager(), str);
        }
    }
}
