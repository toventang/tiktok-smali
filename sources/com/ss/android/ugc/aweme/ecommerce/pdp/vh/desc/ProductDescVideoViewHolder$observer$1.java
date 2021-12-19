package com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.extension.player.a.d;
import com.bytedance.tux.extension.player.c;
import com.bytedance.tux.extension.player.e;
import com.bytedance.tux.extension.player.view.PlayerMaskView;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ProductDescVideoViewHolder$observer$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ProductDescVideoViewHolder f86777a;

    static {
        Covode.recordClassIndex(54355);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        TuxPlayerView tuxPlayerView = this.f86777a.f86767j;
        if (tuxPlayerView != null) {
            tuxPlayerView.post(new a(tuxPlayerView, this));
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.p().a(false);
        TuxPlayerView tuxPlayerView = this.f86777a.f86767j;
        if (tuxPlayerView != null) {
            tuxPlayerView.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxPlayerView f86778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductDescVideoViewHolder$observer$1 f86779b;

        static {
            Covode.recordClassIndex(54356);
        }

        a(TuxPlayerView tuxPlayerView, ProductDescVideoViewHolder$observer$1 productDescVideoViewHolder$observer$1) {
            this.f86778a = tuxPlayerView;
            this.f86779b = productDescVideoViewHolder$observer$1;
        }

        public final void run() {
            boolean z;
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            Boolean a2 = s.p().a();
            if (a2 != null) {
                z = a2.booleanValue();
            } else {
                z = false;
            }
            if (!ProductDescVideoViewHolder.a((View) this.f86778a) && !z) {
                this.f86778a.d();
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        k kVar;
        String str;
        Aweme aweme = this.f86777a.f86766g;
        if (!(aweme == null || aweme.getVideo() == null || (kVar = this.f86777a.n().s) == null)) {
            Aweme aweme2 = this.f86777a.f86766g;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            int i2 = (int) this.f86777a.f86765f.n;
            if (str == null) {
                str = "";
            }
            new u(str, i2).c(kVar.f86382a);
        }
        TuxPlayerView tuxPlayerView = this.f86777a.f86767j;
        if (tuxPlayerView != null) {
            tuxPlayerView.getMainHandler().removeCallbacksAndMessages(null);
            tuxPlayerView.f44994b = null;
            PlayerMaskView playerMaskView = (PlayerMaskView) tuxPlayerView.c(R.id.d68);
            d.a().removeCallbacksAndMessages(null);
            d.f44950a = null;
            playerMaskView.f44969a = null;
            playerMaskView.f44970b = false;
            playerMaskView.f44971c = false;
            playerMaskView.f44972d = false;
            com.bytedance.tux.extension.player.a aVar = tuxPlayerView.f44996d;
            if (aVar != null) {
                aVar.c();
            }
            tuxPlayerView.f44993a = false;
            tuxPlayerView.f44995c = true;
            e.a(com.bytedance.tux.extension.player.d.PLAYER_IDLE);
            e.a(c.PREVIEW);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProductDescVideoViewHolder$observer$1(ProductDescVideoViewHolder productDescVideoViewHolder) {
        this.f86777a = productDescVideoViewHolder;
    }
}
