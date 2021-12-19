package com.ss.android.ugc.aweme.kids.liked.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2728a f106700a = new C2728a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private c f106701b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106702c;

    static {
        Covode.recordClassIndex(68199);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.a$a  reason: collision with other inner class name */
    public static final class C2728a {
        static {
            Covode.recordClassIndex(68200);
        }

        private C2728a() {
        }

        public /* synthetic */ C2728a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f106702c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Fragment a2 = getChildFragmentManager().a("favorite_grid_fragment");
        if (!(a2 instanceof c)) {
            a2 = null;
        }
        c cVar = (c) a2;
        this.f106701b = cVar;
        if (cVar == null && getContext() != null) {
            Bundle bundle2 = new Bundle();
            b bVar = new b((byte) 0);
            bVar.f105946b = new c();
            bVar.setArguments(bundle2);
            n a3 = getChildFragmentManager().a();
            l.b(a3, "");
            a3.b(R.id.c_t, bVar, "favorite_grid_fragment");
            a3.c();
            this.f106701b = bVar;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.adf, viewGroup, false);
    }
}
