package com.ss.android.ugc.aweme.profile.ui.profiletab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.experiment.az;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.metrics.s;
import com.ss.android.ugc.aweme.profile.ui.v2.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class ProfileTab extends TabFragmentNode {

    /* renamed from: b  reason: collision with root package name */
    public final Context f117152b;

    /* renamed from: c  reason: collision with root package name */
    private a f117153c;

    /* renamed from: d  reason: collision with root package name */
    private final h f117154d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(75664);
    }

    private final ar b() {
        return (ar) this.f117154d.getValue();
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return b.class;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return b().f82872h;
    }

    static final class a extends m implements h.f.a.a<ar> {
        final /* synthetic */ ProfileTab this$0;

        static {
            Covode.recordClassIndex(75665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ProfileTab profileTab) {
            super(0);
            this.this$0 = profileTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            return b.a(this.this$0.f117152b);
        }
    }

    @Override // com.bytedance.hox.d
    public final String e() {
        Context context = this.f117152b;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        Fragment g2 = Hox.a.a((e) context).g(b().f82872h);
        if (g2 instanceof com.ss.android.ugc.aweme.profile.ui.v2.i) {
            return "others_homepage";
        }
        if (!(g2 instanceof s)) {
            return "";
        }
        String f2 = ((s) g2).f();
        l.b(f2, "");
        return f2;
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        Context context = this.f117152b;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        bundle.putString("profile_from_scene", a(((Activity) context).getIntent(), "profile_from_scene"));
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d3, code lost:
        if (r11.f25562a.containsKey(new com.bytedance.assem.arch.core.o(r2, null)) == false) goto L_0x01d5;
     */
    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
        // Method dump skipped, instructions count: 613
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.profiletab.ProfileTab.h():void");
    }

    public ProfileTab(Context context) {
        l.d(context, "");
        this.f117152b = context;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        if (!az.a()) {
            return bzVar.a(b());
        }
        View c2 = HomePageUIFrameServiceImpl.e().c();
        if (c2 == null) {
            return bzVar.a(b());
        }
        return c2;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
