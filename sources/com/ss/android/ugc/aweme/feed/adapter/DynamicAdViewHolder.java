package com.ss.android.ugc.aweme.feed.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.b.c;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize.n.b;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.cg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.j;

public final class DynamicAdViewHolder extends VideoViewCell implements ae, j {

    /* renamed from: a  reason: collision with root package name */
    public final e f91488a;

    static {
        Covode.recordClassIndex(57565);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ad, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void G() {
        this.f91488a.c();
        b.f74918b.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void H() {
        super.H();
        this.f91488a.a(this.f91515j);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ad
    public final void F() {
        this.f91488a.b();
        bd bdVar = this.as;
        if (bdVar != null) {
            bdVar.F();
        }
        b.f74918b.a();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void g() {
        c aH;
        super.g();
        com.ss.android.ugc.aweme.ad.feed.b.b.f65752a = null;
        cg.b(this.f91488a);
        l lVar = this.aF;
        if (!(lVar == null || (aH = lVar.aH()) == null)) {
            this.f91488a.b(aH);
        }
        this.f91488a.d();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ae
    public final boolean o() {
        if (this.f91488a.e()) {
            G();
            return false;
        }
        F();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void n() {
        super.n();
        this.aA.a("ad_on_holder_resume", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("ad_on_fragment_pager_resume", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("ad_on_holder_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aA.a("ad_on_fragment_pager_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ce, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Video video) {
        SmartImageView smartImageView = this.s;
        h.f.b.l.b(smartImageView, "");
        smartImageView.setVisibility(8);
        this.ay = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicAdViewHolder(cf cfVar) {
        super(cfVar);
        h.f.b.l.d(cfVar, "");
        IFeedAdService c2 = FeedAdServiceImpl.c();
        FrameLayout frameLayout = this.I;
        h.f.b.l.b(frameLayout, "");
        this.f91488a = c2.a((ViewGroup) frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(int i2) {
        c aH;
        super.a(i2);
        e eVar = this.f91488a;
        h.f.b.l.d(eVar, "");
        com.ss.android.ugc.aweme.ad.feed.b.b.f65752a = new WeakReference<>(eVar);
        cg.a(this.f91488a);
        l lVar = this.aF;
        if (!(lVar == null || (aH = lVar.aH()) == null)) {
            this.f91488a.a(aH);
        }
        this.f91488a.b();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f67014a;
            switch (str.hashCode()) {
                case -2066092964:
                    if (!str.equals("ad_on_holder_resume")) {
                        return;
                    }
                    F();
                    return;
                case -895459340:
                    if (!str.equals("ad_on_fragment_pager_resume")) {
                        return;
                    }
                    F();
                    return;
                case 347029479:
                    if (!str.equals("ad_on_holder_pause")) {
                        return;
                    }
                    G();
                    return;
                case 1493170511:
                    if (!str.equals("ad_on_fragment_pager_pause")) {
                        return;
                    }
                    G();
                    return;
                default:
                    return;
            }
        }
    }
}
