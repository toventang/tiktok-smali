package com.ss.android.ugc.aweme.compliance.privacy.settings.account.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.b;
import com.bytedance.tux.e.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class a extends Fragment implements b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f77463a;

    static {
        Covode.recordClassIndex(47919);
    }

    public View a(int i2) {
        if (this.f77463a == null) {
            this.f77463a = new SparseArray();
        }
        View view = (View) this.f77463a.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77463a.put(i2, findViewById);
        return findViewById;
    }

    public void b() {
        SparseArray sparseArray = this.f77463a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onBeforeActivityCreated(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onNewIntent(Intent intent) {
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onBackPressed_Activity() {
        a();
    }

    public void a() {
        e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        a.C1099a.a(this).a(true).a(R.color.nd).f44923a.d();
        e activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 0);
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onActivityResult_Activity(int i2, int i3, Intent intent) {
        onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.uv, viewGroup, false);
    }
}
