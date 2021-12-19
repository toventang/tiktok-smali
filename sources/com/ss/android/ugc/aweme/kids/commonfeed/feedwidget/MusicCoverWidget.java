package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.PeriscopeLayout;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.performance.h;
import com.ss.android.ugc.aweme.performance.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class MusicCoverWidget extends AbsFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106074a = new a((byte) 0);

    static {
        Covode.recordClassIndex(67853);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67854);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

        /* renamed from: a  reason: collision with root package name */
        public FrameLayout f106075a;

        /* renamed from: b  reason: collision with root package name */
        public long f106076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f106077c;

        /* renamed from: j  reason: collision with root package name */
        private SmartCircleImageView f106078j;

        /* renamed from: k  reason: collision with root package name */
        private PeriscopeLayout f106079k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f106080l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f106081m;

        static {
            Covode.recordClassIndex(67855);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "music_cover";
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
            d();
        }

        private final void g() {
            PeriscopeLayout periscopeLayout = this.f106079k;
            if (periscopeLayout != null) {
                periscopeLayout.b();
            }
        }

        private final void d() {
            if (this.f106080l) {
                this.f106080l = false;
                e();
                g();
            }
        }

        private final void e() {
            ValueAnimator valueAnimator;
            if (this.f106075a != null && (valueAnimator = this.f106081m) != null) {
                valueAnimator.end();
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final Map<String, String> c() {
            String str;
            Music music;
            HashMap hashMap = new HashMap();
            Aweme aweme = this.f106099d;
            if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
                str = "";
            }
            hashMap.put("music_id", str);
            return hashMap;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
            DataCenter a2;
            DataCenter a3;
            if (dataCenter != null && (a2 = dataCenter.a("start_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this)) != null && (a3 = a2.a("pause_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this)) != null) {
                a3.a("stop_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            }
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f106082a;

            static {
                Covode.recordClassIndex(67856);
            }

            a(b bVar) {
                this.f106082a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f106082a.f106076b > 64) {
                    this.f106082a.f106076b = currentTimeMillis;
                    FrameLayout frameLayout = this.f106082a.f106075a;
                    if (frameLayout != null) {
                        l.b(valueAnimator, "");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        frameLayout.setRotation(((Float) animatedValue).floatValue());
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            MethodCollector.i(8441);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ad2, (ViewGroup) null);
                this.f106075a = (FrameLayout) inflate.findViewById(R.id.cpu);
                this.f106078j = (SmartCircleImageView) inflate.findViewById(R.id.cpt);
                this.f106079k = (PeriscopeLayout) inflate.findViewById(R.id.cwj);
                frameLayout.addView(inflate);
            }
            MethodCollector.o(8441);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
            Music music;
            Music music2;
            super.a(aVar);
            this.f106080l = false;
            Aweme aweme = this.f106099d;
            UrlModel urlModel = null;
            if (aweme != null && (music = aweme.getMusic()) != null && music.getCoverThumb() != null) {
                Aweme aweme2 = this.f106099d;
                if (!(aweme2 == null || (music2 = aweme2.getMusic()) == null)) {
                    urlModel = music2.getCoverThumb();
                }
                v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a(n.a(27.0d), n.a(27.0d));
                a2.K = true;
                v a3 = a2.a("MusicCoverWidget");
                a3.E = this.f106078j;
                a3.c();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f67014a;
                int hashCode = str.hashCode();
                if (hashCode != -463583257) {
                    if (hashCode != -301890681) {
                        if (hashCode == 64864379 && str.equals("pause_animation") && this.f106080l) {
                            this.f106080l = false;
                            e();
                            PeriscopeLayout periscopeLayout = this.f106079k;
                            if (periscopeLayout != null) {
                                periscopeLayout.c();
                                periscopeLayout.f106324k.removeCallbacks(periscopeLayout.f106325l);
                                periscopeLayout.a();
                            }
                        }
                    } else if (str.equals("stop_animation")) {
                        d();
                    }
                } else if (str.equals("start_animation") && !this.f106080l) {
                    this.f106080l = true;
                    if (this.f106075a != null) {
                        ValueAnimator valueAnimator = this.f106081m;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                            ofFloat.setDuration(8000L);
                            ofFloat.setRepeatMode(1);
                            ofFloat.setInterpolator(new LinearInterpolator());
                            ofFloat.setRepeatCount(-1);
                            ofFloat.addUpdateListener(new a(this));
                            this.f106081m = ofFloat;
                        }
                        ValueAnimator valueAnimator2 = this.f106081m;
                        if (valueAnimator2 != null) {
                            valueAnimator2.start();
                        }
                    }
                    PeriscopeLayout periscopeLayout2 = this.f106079k;
                    if (periscopeLayout2 != null) {
                        i.a(new h() {
                            /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.PeriscopeLayout.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ int f106328a = 3000;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ int f106329b = 800;

                            static {
                                Covode.recordClassIndex(67959);
                            }

                            @Override // com.ss.android.ugc.aweme.performance.h
                            public final void a() {
                                PeriscopeLayout.this.f106323j = this.f106328a;
                                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                                periscopeLayout.f106322i = this.f106329b;
                                periscopeLayout.f106324k.removeCallbacksAndMessages(null);
                                periscopeLayout.f106324k.postDelayed(periscopeLayout.f106325l, (long) (periscopeLayout.f106318e.nextInt(4) * 100));
                            }
                        });
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view, View view2) {
            super(view2);
            this.f106077c = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new b(view, view);
    }
}
