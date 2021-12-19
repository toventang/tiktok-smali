package com.bytedance.scene;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;

public final class f extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public a f42796a;

    /* renamed from: b  reason: collision with root package name */
    public m f42797b;

    public interface a {
        static {
            Covode.recordClassIndex(26279);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(26278);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.e();
        }
    }

    public final void onDetach() {
        super.onDetach();
        a aVar = this.f42796a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void onPause() {
        super.onPause();
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.c();
        }
    }

    public final void onResume() {
        super.onResume();
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void onStart() {
        super.onStart();
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.a();
        }
    }

    public final void onStop() {
        super.onStop();
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.d();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.a(bundle);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m mVar = this.f42797b;
        if (mVar != null) {
            mVar.a(getActivity(), bundle);
            return;
        }
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        k.a(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
    }
}
