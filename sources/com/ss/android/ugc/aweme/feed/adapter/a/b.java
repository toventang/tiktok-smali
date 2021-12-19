package com.ss.android.ugc.aweme.feed.adapter.a;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.playerkit.videoview.i;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private final h f91582b;

    static {
        Covode.recordClassIndex(57669);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void A() {
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final void a(OnUIPlayListener onUIPlayListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(k kVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void b(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final i c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(boolean z) {
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final j.g j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final int s() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final boolean w() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final Surface x() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void z() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final View y() {
        return (View) this.f91582b.getValue();
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(57670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(8464);
            View view = new View(this.$context);
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            MethodCollector.o(8464);
            return view;
        }
    }

    public b(Context context) {
        l.d(context, "");
        this.f91582b = h.i.a(h.m.NONE, new a(context));
    }
}
