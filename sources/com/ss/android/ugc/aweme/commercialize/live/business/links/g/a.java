package com.ss.android.ugc.aweme.commercialize.live.business.links.g;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.utils.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class a extends d implements h.b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1694a f74651a = new C1694a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f74652b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.ies.bullet.ui.common.d f74653c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f74654d;

    static {
        Covode.recordClassIndex(46026);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    @Override // androidx.fragment.app.d
    public final int getTheme() {
        return R.style.vb;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.g.a$a  reason: collision with other inner class name */
    public static final class C1694a {
        static {
            Covode.recordClassIndex(46027);
        }

        private C1694a() {
        }

        public /* synthetic */ C1694a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.i iVar) {
            Fragment a2;
            if (iVar != null && (a2 = iVar.a("BulletContainerWrapperFragment")) != null && (a2 instanceof d)) {
                ((d) a2).dismissAllowingStateLoss();
            }
        }

        public static void a(androidx.fragment.app.i iVar, String str) {
            l.d(str, "");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("SCHEMA", str);
            aVar.setArguments(bundle);
            if (iVar != null) {
                aVar.show(iVar, "BulletContainerWrapperFragment");
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f74654d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(46028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("SCHEMA");
            }
            return null;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        String str = (String) this.f74652b.getValue();
        if (str != null) {
            l.b(str, "");
            Uri a2 = c.a(str);
            com.bytedance.ies.bullet.ui.common.d dVar = this.f74653c;
            if (dVar == null) {
                l.a("bulletContainerFragment");
            }
            dVar.a(a2, (Bundle) null, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.ies.bullet.ui.common.d dVar = new com.bytedance.ies.bullet.ui.common.d();
        d.a a2 = new d.a(dVar).a(BulletService.f().a());
        e requireActivity = requireActivity();
        Objects.requireNonNull(requireActivity, "null cannot be cast to non-null type android.app.Activity");
        a2.a(new BulletActivityWrapper(requireActivity)).a();
        this.f74653c = dVar;
        n a3 = getChildFragmentManager().a();
        com.bytedance.ies.bullet.ui.common.d dVar2 = this.f74653c;
        if (dVar2 == null) {
            l.a("bulletContainerFragment");
        }
        a3.b(R.id.a0g, dVar2).c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0s, viewGroup, false);
    }
}
