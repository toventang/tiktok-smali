package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconDailyEffect;
import com.bytedance.android.livesdk.toolbar.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.f;
import h.f.b.l;
import java.util.Objects;

public final class e extends FrameLayout implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f21699a;

    /* renamed from: b  reason: collision with root package name */
    public d f21700b;

    /* renamed from: c  reason: collision with root package name */
    public HSImageView f21701c;

    /* renamed from: d  reason: collision with root package name */
    public f.a.b.a f21702d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    public ImageView f21703e;

    /* renamed from: f  reason: collision with root package name */
    public LiveAutoRtlTextView f21704f;

    /* renamed from: g  reason: collision with root package name */
    public String f21705g = "daily";

    /* renamed from: h  reason: collision with root package name */
    public String f21706h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21707i;

    static {
        Covode.recordClassIndex(12796);
    }

    public static final class c implements com.facebook.d.e<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f21716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f21717b;

        static {
            Covode.recordClassIndex(12802);
        }

        @Override // com.facebook.d.e
        public final void onCancellation(com.facebook.d.c<Void> cVar) {
        }

        @Override // com.facebook.d.e
        public final void onFailure(com.facebook.d.c<Void> cVar) {
        }

        @Override // com.facebook.d.e
        public final void onProgressUpdate(com.facebook.d.c<Void> cVar) {
        }

        public static final class a extends com.facebook.imagepipeline.f.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f21718a;

            static {
                Covode.recordClassIndex(12803);
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            }

            /* renamed from: com.bytedance.android.livesdk.toolbar.e$c$a$a  reason: collision with other inner class name */
            static final class RunnableC0480a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f21719a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Bitmap f21720b;

                static {
                    Covode.recordClassIndex(12804);
                }

                RunnableC0480a(a aVar, Bitmap bitmap) {
                    this.f21719a = aVar;
                    this.f21720b = bitmap;
                }

                public final void run() {
                    ImageView imageView = this.f21719a.f21718a.f21716a.f21703e;
                    if (imageView != null) {
                        imageView.setImageBitmap(this.f21720b);
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f21718a = cVar;
            }

            @Override // com.facebook.imagepipeline.f.b
            public final void a(Bitmap bitmap) {
                this.f21718a.f21716a.post(new RunnableC0480a(this, bitmap));
            }
        }

        @Override // com.facebook.d.e
        public final void onNewResult(com.facebook.d.c<Void> cVar) {
            this.f21716a.f21705g = "event";
            this.f21716a.f21706h = p.a(this.f21717b.f17892i);
            k.a(p.a(this.f21717b.f17889f), new a(this));
        }

        c(e eVar, h hVar) {
            this.f21716a = eVar;
            this.f21717b = hVar;
        }
    }

    public static final class b extends com.facebook.imagepipeline.f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f21713a;

        static {
            Covode.recordClassIndex(12800);
        }

        @Override // com.facebook.d.b
        public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f21714a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f21715b;

            static {
                Covode.recordClassIndex(12801);
            }

            a(b bVar, Bitmap bitmap) {
                this.f21714a = bVar;
                this.f21715b = bitmap;
            }

            public final void run() {
                ImageView imageView = this.f21714a.f21713a.f21703e;
                if (imageView != null) {
                    imageView.setImageBitmap(this.f21715b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f21713a = eVar;
        }

        @Override // com.facebook.imagepipeline.f.b
        public final void a(Bitmap bitmap) {
            this.f21713a.post(new a(this, bitmap));
        }
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f21708a;

        static {
            Covode.recordClassIndex(12797);
        }

        public a(e eVar) {
            this.f21708a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String a2;
            if (!l.a((Object) this.f21708a.f21705g, (Object) "daily") || LiveGiftIconDailyEffect.INSTANCE.getValue()) {
                if (this.f21708a.f21706h != null) {
                    a2 = this.f21708a.f21706h;
                } else if (this.f21708a.f21707i) {
                    a2 = HSAnimImageView.f9268i.a("tiktok_live_basic_resource", "ttlive_gift_icon_effect_normal_without_background.webp");
                } else {
                    a2 = HSAnimImageView.f9268i.a("tiktok_live_basic_resource", "ttlive_gift_icon_effect_normal.webp");
                }
                com.bytedance.android.livesdk.utils.p.a((View) this.f21708a.f21701c, true);
                HSImageView hSImageView = this.f21708a.f21701c;
                if (hSImageView != null) {
                    com.facebook.drawee.a.a.e a3 = com.facebook.drawee.a.a.c.b().a(a2);
                    a3.f47322j = true;
                    a3.f47319g = new com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f>(this) {
                        /* class com.bytedance.android.livesdk.toolbar.e.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f21709a;

                        static {
                            Covode.recordClassIndex(12798);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f21709a = r1;
                        }

                        /* renamed from: com.bytedance.android.livesdk.toolbar.e$a$1$a  reason: collision with other inner class name */
                        public static final class C0479a extends com.facebook.fresco.animation.c.c {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f21710a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ int f21711b;

                            /* renamed from: c  reason: collision with root package name */
                            private int f21712c;

                            static {
                                Covode.recordClassIndex(12799);
                            }

                            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                            public final void b(com.facebook.fresco.animation.c.a aVar) {
                                l.d(aVar, "");
                            }

                            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                            public final void a(com.facebook.fresco.animation.c.a aVar) {
                                l.d(aVar, "");
                                this.f21712c = -1;
                                String str = this.f21710a.f21709a.f21708a.f21705g;
                                l.d(str, "");
                                b.a.a("special_gift_icon_show").a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).a("action_type", com.bytedance.android.livesdk.ab.e.e()).a("animation_type", str).b();
                            }

                            C0479a(AnonymousClass1 r1, int i2) {
                                this.f21710a = r1;
                                this.f21711b = i2;
                            }

                            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                            public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                                l.d(aVar, "");
                                int i3 = this.f21712c;
                                if ((i3 != 0 || this.f21711b > 1) && i3 <= i2) {
                                    this.f21712c = i2;
                                    return;
                                }
                                aVar.stop();
                                ImageView imageView = this.f21710a.f21709a.f21708a.f21703e;
                                if (imageView != null) {
                                    com.bytedance.android.livesdk.utils.p.a((View) imageView, true);
                                }
                                HSImageView hSImageView = this.f21710a.f21709a.f21708a.f21701c;
                                if (hSImageView != null) {
                                    com.bytedance.android.livesdk.utils.p.a((View) hSImageView, false);
                                }
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                            l.d(str, "");
                            ImageView imageView = this.f21709a.f21708a.f21703e;
                            if (imageView != null) {
                                com.bytedance.android.livesdk.utils.p.a((View) imageView, false);
                            }
                            Objects.requireNonNull(animatable, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
                            com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                            aVar.a(new C0479a(this, aVar.c()));
                        }
                    };
                    hSImageView.setController(a3.e());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    @Override // com.bytedance.android.livesdk.toolbar.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.gift.model.h r5) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.toolbar.e.a(com.bytedance.android.livesdk.gift.model.h):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, DataChannel dataChannel) {
        super(context);
        boolean z;
        l.d(context, "");
        l.d(dataChannel, "");
        MethodCollector.i(9299);
        this.f21699a = dataChannel;
        Boolean bool = (Boolean) this.f21699a.b(ea.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f21707i = z;
        MethodCollector.o(9299);
    }
}
