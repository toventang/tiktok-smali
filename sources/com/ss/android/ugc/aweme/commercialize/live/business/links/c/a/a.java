package com.ss.android.ugc.aweme.commercialize.live.business.links.c.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.c.d;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.b;
import com.ss.android.ugc.aweme.bullet.utils.c;
import h.f.b.l;
import java.util.List;

public final class a implements IFrameSlot, h.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1692a f74601c = new C1692a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f74602a = "";

    /* renamed from: b  reason: collision with root package name */
    public Bundle f74603b;

    /* renamed from: d  reason: collision with root package name */
    private BulletContainerView f74604d;

    static {
        Covode.recordClassIndex(45998);
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
    public final void a(View view, Uri uri, i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends d<? extends View>> list, Uri uri, i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.a.a$a  reason: collision with other inner class name */
    public static final class C1692a {
        static {
            Covode.recordClassIndex(45999);
        }

        private C1692a() {
        }

        public /* synthetic */ C1692a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View a(Context context) {
        String str;
        l.d(context, "");
        this.f74604d = new BulletContainerView(context, null, 6, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(300.0d), n.a(120.0d));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = n.a(12.0d);
        layoutParams.bottomMargin = n.a(8.0d);
        BulletContainerView bulletContainerView = this.f74604d;
        if (bulletContainerView != null) {
            bulletContainerView.setLayoutParams(layoutParams);
            bulletContainerView.a(b.a().a());
            Bundle bundle = this.f74603b;
            if (bundle == null || (str = com.ss.android.ugc.aweme.commercialize.live.c.a.a(this.f74602a, bundle)) == null) {
                str = this.f74602a;
            }
            bulletContainerView.a(c.a(str), (Bundle) null, bulletContainerView);
        }
        BulletContainerView bulletContainerView2 = this.f74604d;
        if (bulletContainerView2 != null) {
            bulletContainerView2.setLayoutParams(layoutParams);
        }
        return this.f74604d;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f74602a = str;
    }
}
