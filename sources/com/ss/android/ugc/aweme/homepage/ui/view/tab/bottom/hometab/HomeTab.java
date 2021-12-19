package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.hox.d;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class HomeTab extends TabFragmentGroup {

    /* renamed from: j  reason: collision with root package name */
    public FlippableViewPagerExt f99608j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f99609k;

    /* renamed from: l  reason: collision with root package name */
    private View.OnClickListener f99610l;

    /* renamed from: m  reason: collision with root package name */
    private final h f99611m;

    static {
        Covode.recordClassIndex(63512);
    }

    private final ar j() {
        return (ar) this.f99611m.getValue();
    }

    @Override // com.bytedance.hox.b
    public final boolean b() {
        return true;
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        return "homepage_hot";
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return j().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return j().f82872h;
    }

    static final class a extends m implements h.f.a.a<ar> {
        final /* synthetic */ HomeTab this$0;

        static {
            Covode.recordClassIndex(63513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(HomeTab homeTab) {
            super(0);
            this.this$0 = homeTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            return a.a(this.this$0.f99609k);
        }
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return HomePageUIFrameServiceImpl.e().b(j().f82872h);
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Context context = this.f99609k;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        Intent intent = ((Activity) context).getIntent();
        l.b(intent, "");
        return a(intent);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, com.ss.android.ugc.aweme.by
    public final void h() {
        if (this.f99610l == null) {
            this.f99610l = HomePageUIFrameServiceImpl.e().a(this.f99609k, j().f82872h);
        }
        View.OnClickListener onClickListener = this.f99610l;
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    public HomeTab(Context context) {
        l.d(context, "");
        this.f99609k = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        for (T t : HomeTabViewModel.a.a((e) context).b()) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.bytedance.hox.HoxNode");
            a((d) t);
        }
        this.f99611m = i.a((h.f.a.a) new a(this));
    }

    private static Bundle a(Intent intent) {
        int i2;
        if (intent == null) {
            return null;
        }
        String a2 = a(intent, "tab");
        if (com.bytedance.common.utility.m.a(a2)) {
            i2 = intent.getIntExtra("tab", -1);
        } else {
            try {
                i2 = Integer.parseInt(a2);
            } catch (Throwable unused) {
                i2 = -1;
            }
        }
        int intExtra = intent.getIntExtra("page_type", -1);
        if (i2 < 0 && intExtra < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tab", i2);
        bundle.putInt("page_type", intExtra);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 == null) goto L_0x001c;
     */
    @Override // com.ss.android.ugc.aweme.by
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(com.ss.android.ugc.aweme.bz r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            boolean r0 = com.ss.android.ugc.aweme.experiment.az.a()
            r3 = 1
            if (r0 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon r0 = new com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon
            r0.<init>()
            java.lang.Object r2 = com.ss.android.ugc.aweme.lego.f.a(r0)
            com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon r2 = (com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon) r2
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f99515a
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x001c:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = new com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c
            com.ss.android.ugc.aweme.ar r1 = r4.j()
            r0.<init>(r1)
        L_0x0025:
            r0.setSelected(r3)
            return r0
        L_0x0029:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f99515a
            com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon.a(r0)
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r0 = r2.f99515a
            r2.f99515a = r1
            if (r0 != 0) goto L_0x0025
            goto L_0x001c
        L_0x0035:
            com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c r1 = new com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.c
            com.ss.android.ugc.aweme.ar r0 = r4.j()
            r1.<init>(r0)
            r1.setSelected(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.hometab.HomeTab.a(com.ss.android.ugc.aweme.bz):android.view.View");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.hox.b
    public final void a(String str, Bundle bundle) {
        l.d(str, "");
        l.d(bundle, "");
        Context context = this.f99609k;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        int e2 = Hox.a.a((e) context).e(str);
        boolean z = bundle.getBoolean(be.f68534f, false);
        FlippableViewPagerExt flippableViewPagerExt = this.f99608j;
        if (flippableViewPagerExt != null) {
            flippableViewPagerExt.a(e2, z);
        }
    }
}
