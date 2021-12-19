package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.eg;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.share.ah;
import f.a.b.b;
import f.a.h.a;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;

final /* synthetic */ class er implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eg.AnonymousClass4 f94737a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94738b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f94739c;

    static {
        Covode.recordClassIndex(60111);
    }

    er(eg.AnonymousClass4 r1, String str, Aweme aweme) {
        this.f94737a = r1;
        this.f94738b = str;
        this.f94739c = aweme;
    }

    public final void run() {
        eg.AnonymousClass4 r4 = this.f94737a;
        t.a(new w<Pair<String, Drawable>>() {
            /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass4.AnonymousClass2 */

            static {
                Covode.recordClassIndex(60096);
            }

            @Override // f.a.w
            public final void subscribe(v<Pair<String, Drawable>> vVar) {
                vVar.a(new Pair<>(ah.f123353b.b((Activity) eg.this.R), ah.f123353b.a((Activity) eg.this.R)));
            }
        }).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new z<Pair<String, Drawable>>(this.f94738b, this.f94739c) {
            /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass4.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f94707a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Aweme f94708b;

            static {
                Covode.recordClassIndex(60093);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(Pair<String, Drawable> pair) {
                Pair<String, Drawable> pair2 = pair;
                String str = (String) pair2.first;
                Drawable drawable = (Drawable) pair2.second;
                if (drawable != null) {
                    eg.this.f94688a.setImageDrawable(drawable);
                    r.a("share_highlight", new d().a("enter_from", this.f94707a).a("group_id", ac.e(this.f94708b)).a("author_id", ac.a(this.f94708b)).a("show_content", str).f66730a);
                }
                eg.this.f94690c.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass4.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60094);
                    }

                    public final void run() {
                        eg.this.f94690c.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass4.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(60095);
                            }

                            public final void run() {
                                ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setDuration(600);
                                scaleAnimation.setRepeatMode(2);
                                scaleAnimation.setRepeatCount(-1);
                                eg.this.f94690c.startAnimation(scaleAnimation);
                            }
                        }).start();
                    }
                }).start();
            }

            {
                this.f94707a = r2;
                this.f94708b = r3;
            }
        });
    }
}
