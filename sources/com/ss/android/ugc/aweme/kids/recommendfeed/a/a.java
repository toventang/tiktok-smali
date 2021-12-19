package com.ss.android.ugc.aweme.kids.recommendfeed.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.commonfeed.c.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C2739a f106798a = new C2739a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.commonfeed.ui.b f106799b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106800c;

    static {
        Covode.recordClassIndex(68279);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.a.a$a  reason: collision with other inner class name */
    public static final class C2739a {
        static {
            Covode.recordClassIndex(68280);
        }

        private C2739a() {
        }

        public /* synthetic */ C2739a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.b
    public final void a() {
        com.ss.android.ugc.aweme.kids.commonfeed.ui.b bVar = this.f106799b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.commonfeed.c.b
    public final void b() {
        com.ss.android.ugc.aweme.kids.commonfeed.ui.b bVar = this.f106799b;
        if (bVar != null) {
            bVar.f106236a.f();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f106800c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        com.ss.android.ugc.aweme.kids.commonfeed.ui.b bVar = this.f106799b;
        if (bVar != null) {
            bVar.f106236a.f106027h = !z;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Fragment a2 = getChildFragmentManager().a("recommend_feed_fragment");
        if (!(a2 instanceof com.ss.android.ugc.aweme.kids.commonfeed.ui.b)) {
            a2 = null;
        }
        com.ss.android.ugc.aweme.kids.commonfeed.ui.b bVar = (com.ss.android.ugc.aweme.kids.commonfeed.ui.b) a2;
        this.f106799b = bVar;
        if (bVar == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from", "homepage_hot");
            com.ss.android.ugc.aweme.kids.recommendfeed.model.a aVar = new com.ss.android.ugc.aweme.kids.recommendfeed.model.a();
            l.d(bundle2, "");
            l.d(aVar, "");
            com.ss.android.ugc.aweme.kids.commonfeed.ui.b bVar2 = new com.ss.android.ugc.aweme.kids.commonfeed.ui.b();
            bVar2.f106237b = aVar;
            bVar2.setArguments(bundle2);
            n a3 = getChildFragmentManager().a();
            l.b(a3, "");
            a3.b(R.id.a5h, bVar2, "recommend_feed_fragment");
            a3.c();
            this.f106799b = bVar2;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.acx, viewGroup, false);
    }
}
