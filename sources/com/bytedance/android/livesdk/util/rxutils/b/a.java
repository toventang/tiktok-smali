package com.bytedance.android.livesdk.util.rxutils.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import f.a.l.b;

public final class a extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final b<b> f22183a = new b<>();

    static {
        Covode.recordClassIndex(13093);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f22183a.onNext(b.DESTROY);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f22183a.onNext(b.DESTROY_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f22183a.onNext(b.DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f22183a.onNext(b.PAUSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f22183a.onNext(b.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f22183a.onNext(b.START);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f22183a.onNext(b.STOP);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f22183a.onNext(b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22183a.onNext(b.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f22183a.onNext(b.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22183a.onNext(b.CREATE_VIEW);
        return null;
    }
}
