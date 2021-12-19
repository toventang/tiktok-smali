package com.ss.android.ugc.aweme.autoplay.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import java.util.Objects;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final View f67410a;

    /* renamed from: b  reason: collision with root package name */
    private int f67411b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67412c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f67413d;

    /* renamed from: e  reason: collision with root package name */
    private final h f67414e = h.i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    private boolean f67415f;

    /* renamed from: g  reason: collision with root package name */
    private d f67416g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f67417h;

    static {
        Covode.recordClassIndex(41512);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final boolean C() {
        return this.f67413d;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final int D() {
        return this.f67411b;
    }

    static final class a extends m implements h.f.a.a<l> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return new l(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        this.f67412c = false;
        d dVar = this.f67416g;
        if (dVar != null) {
            dVar.A();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        d dVar = this.f67416g;
        if (dVar != null) {
            return dVar.m();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        d dVar = this.f67416g;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        this.f67412c = true;
        com.ss.android.ugc.aweme.autoplay.e.a.d(this);
        d dVar = this.f67416g;
        if (dVar != null) {
            dVar.x();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        this.f67412c = false;
        d dVar = this.f67416g;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        this.f67412c = false;
        d dVar = this.f67416g;
        if (dVar != null) {
            dVar.z();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(d dVar) {
        this.f67416g = dVar;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(boolean z) {
        this.f67413d = z;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f67415f = true;
        com.ss.android.ugc.aweme.autoplay.e.a.a(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f67415f = false;
        com.ss.android.ugc.aweme.autoplay.e.a.b(this);
        if (this.f67417h) {
            A();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(int i2) {
        com.ss.android.ugc.aweme.flowfeed.utils.i iVar = (com.ss.android.ugc.aweme.flowfeed.utils.i) this.f67414e.getValue();
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autoplay.video.SearchMultiVideoScrollObserver");
        ((l) iVar).f67432a = i2;
        this.f67411b = i2;
    }

    public i(View view, boolean z) {
        this.f67410a = view;
        this.f67417h = z;
    }
}
