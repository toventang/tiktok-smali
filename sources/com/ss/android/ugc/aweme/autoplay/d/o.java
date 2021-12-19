package com.ss.android.ugc.aweme.autoplay.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public abstract class o extends b implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f67461a;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f67462f;

    static {
        Covode.recordClassIndex(41533);
    }

    private b a() {
        return (b) this.f67461a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        a().A();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        a().x();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        a().y();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        a().z();
    }

    static final class a extends m implements h.f.a.a<i> {
        final /* synthetic */ View $itemView;
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(41534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, View view) {
            super(0);
            this.this$0 = oVar;
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.$itemView, this.this$0.f67462f);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final boolean C() {
        return a().C();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final int D() {
        return a().D();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return a().w();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(int i2) {
        a().a(i2);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public void onViewAttachedToWindow(View view) {
        l.d(view, "");
        super.onViewAttachedToWindow(view);
        a().onViewAttachedToWindow(view);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        super.onViewDetachedFromWindow(view);
        a().onViewDetachedFromWindow(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private o(View view) {
        super(view);
        l.d(view, "");
        this.f67462f = true;
        this.f67461a = i.a((h.f.a.a) new a(this, view));
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(d dVar) {
        a().a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.b
    public final void a(boolean z) {
        a().a(z);
    }

    public /* synthetic */ o(View view, byte b2) {
        this(view);
    }
}
