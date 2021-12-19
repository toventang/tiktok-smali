package com.ss.android.ugc.aweme.dsp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.bz;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class MusicDspTab extends TabFragmentNode {

    /* renamed from: d  reason: collision with root package name */
    public static final a f83948d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public FlippableViewPagerExt f83949b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f83950c;

    /* renamed from: j  reason: collision with root package name */
    private b f83951j;

    /* renamed from: k  reason: collision with root package name */
    private final h f83952k = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(52362);
    }

    private final ar b() {
        return (ar) this.f83952k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52363);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.hox.d
    public final Class<? extends Fragment> f() {
        return com.ss.android.ugc.aweme.dsp.b.class;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final String U_() {
        return b().f82873i;
    }

    @Override // com.ss.android.ugc.aweme.by, com.bytedance.hox.d
    public final String d() {
        return b().f82872h;
    }

    @Override // com.ss.android.ugc.aweme.by, com.ss.android.ugc.aweme.TabFragmentNode
    public final void h() {
        if (this.f83951j == null) {
            this.f83951j = new b(this.f83950c);
        }
        b bVar = this.f83951j;
        if (bVar != null) {
            bVar.onClick(null);
        }
    }

    static final class b extends m implements h.f.a.a<ar> {
        final /* synthetic */ MusicDspTab this$0;

        static {
            Covode.recordClassIndex(52364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MusicDspTab musicDspTab) {
            super(0);
            this.this$0 = musicDspTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ar invoke() {
            Context context = this.this$0.f83950c;
            l.d(context, "");
            String string = context.getResources().getString(R.string.dc3);
            l.b(string, "");
            return new ar(context, "MUSIC_DSP", string, R.id.ck6, 0, false, 0, 0);
        }
    }

    @Override // com.bytedance.hox.d
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("enter_method", "homepage_music_tab");
        Context context = this.f83950c;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        bundle.putString("profile_from_scene", a(((Activity) context).getIntent(), "profile_from_scene"));
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.by
    public final View a(bz bzVar) {
        l.d(bzVar, "");
        return new a(b());
    }

    public MusicDspTab(Context context) {
        l.d(context, "");
        this.f83950c = context;
    }

    private final void b(String str) {
        Context context = this.f83950c;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        int a2 = TTDspViewModel.a.a((e) context).a(str);
        FlippableViewPagerExt flippableViewPagerExt = this.f83949b;
        if (flippableViewPagerExt != null) {
            flippableViewPagerExt.a(a2, false);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        b(str);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
