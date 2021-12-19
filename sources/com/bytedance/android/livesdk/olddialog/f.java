package com.bytedance.android.livesdk.olddialog;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.c.g;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.wallet.d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.c;
import com.zhiliaoapp.musically.R;
import java.io.File;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final a f20020a;

    static {
        Covode.recordClassIndex(11827);
    }

    f(a aVar) {
        this.f20020a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f20020a;
        d dVar = (d) obj;
        if (dVar != null) {
            aVar.f19999e = dVar.f22416b;
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = aVar.f19996b;
            int i2 = aVar.f19999e;
            File tTLiveGeckoResourceFile = ((IHostContext) a.a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_recharge_anim.webp");
            if (tTLiveGeckoResourceFile != null) {
                HSImageView hSImageView = (HSImageView) liveNewGiftBottomWidget.findViewById(R.id.c0b);
                hSImageView.setVisibility(0);
                com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(hSImageView.getContext()).a(tTLiveGeckoResourceFile).a(ImageView.ScaleType.CENTER_CROP);
                a2.f9023h = true;
                a2.f9017b = new c(i2) {
                    /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ int f20117a;

                    static {
                        Covode.recordClassIndex(11872);
                    }

                    {
                        this.f20117a = r2;
                    }

                    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        if (animatable instanceof com.facebook.fresco.animation.c.a) {
                            ((com.facebook.fresco.animation.c.a) animatable).a(new com.facebook.fresco.animation.c.c() {
                                /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(11873);
                                }

                                @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                                public final void b(com.facebook.fresco.animation.c.a aVar) {
                                    LiveNewGiftBottomWidget liveNewGiftBottomWidget = LiveNewGiftBottomWidget.this;
                                    String concat = "+".concat(String.valueOf(AnonymousClass1.this.f20117a));
                                    TextView textView = (TextView) liveNewGiftBottomWidget.findViewById(R.id.h5);
                                    textView.setText(concat);
                                    textView.setVisibility(0);
                                    ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(400L);
                                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(350L);
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.play(duration);
                                    animatorSet.play(duration2).after(700);
                                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -35.0f).setDuration(300L);
                                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, "translationY", -35.0f, -40.0f).setDuration(700L);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    animatorSet2.play(duration3);
                                    animatorSet2.play(duration4).after(300);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    animatorSet3.playTogether(animatorSet, animatorSet2);
                                    animatorSet3.start();
                                }
                            });
                        }
                    }
                };
                a2.a(hSImageView);
            }
            com.bytedance.android.livesdk.olddialog.giftpanellist.a.a aVar2 = aVar.f19995a.f20132f;
            if (aVar2.f20022a instanceof g) {
                ((g) aVar2.f20022a).a();
            } else if (aVar2.f20022a instanceof com.bytedance.android.livesdk.olddialog.giftpanellist.c.a) {
                ((com.bytedance.android.livesdk.olddialog.giftpanellist.c.a) aVar2.f20022a).f();
            }
            b.a.a("livesdk_recharge_success_anime").a().b();
        }
    }
}
