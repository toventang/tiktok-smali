package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.Live;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    Fragment f108570a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f108571b;

    static {
        Covode.recordClassIndex(69587);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f108571b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Live.getService();
        super.onCreate(bundle);
        if (this.f108570a != null) {
            n a2 = getChildFragmentManager().a();
            Fragment fragment = this.f108570a;
            if (fragment == null) {
                l.b();
            }
            a2.b(R.id.d8w, fragment);
            a2.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return a.a(layoutInflater, R.layout.an2, viewGroup, false);
    }
}
