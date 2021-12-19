package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.views.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f130935d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f130936a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f130937b;

    /* renamed from: c  reason: collision with root package name */
    public l f130938c;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f130939e;

    /* renamed from: f  reason: collision with root package name */
    private View f130940f;

    /* renamed from: g  reason: collision with root package name */
    private final h f130941g;

    static {
        Covode.recordClassIndex(85818);
    }

    public final Animation getMShakeAnim() {
        return (Animation) this.f130941g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85822);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Animation> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(85823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.i(5655);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.$context, R.anim.dc);
            loadAnimation.setInterpolator(new CycleInterpolator(3.0f));
            MethodCollector.o(5655);
            return loadAnimation;
        }
    }

    public final void setOnCaptionWelcomeViewCallback(l lVar) {
        this.f130938c = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private g(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3943);
        View inflate = View.inflate(context, R.layout.na, this);
        this.f130939e = (ImageView) inflate.findViewById(R.id.bve);
        this.f130936a = (ImageView) inflate.findViewById(R.id.bv6);
        this.f130940f = inflate.findViewById(R.id.f7r);
        this.f130937b = (LinearLayout) inflate.findViewById(R.id.cey);
        ImageView imageView = this.f130939e;
        if (imageView != null) {
            imageView.setOnClickListener(new d(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f130942a;

                static {
                    Covode.recordClassIndex(85819);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f130942a = r1;
                }

                @Override // com.ss.android.ugc.aweme.views.d
                public final void a(View view) {
                    l lVar = this.f130942a.f130938c;
                    if (lVar != null) {
                        lVar.a();
                    }
                }
            });
        }
        LinearLayout linearLayout = this.f130937b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new d(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f130943a;

                static {
                    Covode.recordClassIndex(85820);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f130943a = r1;
                }

                @Override // com.ss.android.ugc.aweme.views.d
                public final void a(View view) {
                    boolean z;
                    ImageView imageView = this.f130943a.f130936a;
                    if (imageView != null) {
                        ImageView imageView2 = this.f130943a.f130936a;
                        if (imageView2 != null) {
                            z = imageView2.isSelected();
                        } else {
                            z = false;
                        }
                        imageView.setSelected(!z);
                    }
                }
            });
        }
        View view = this.f130940f;
        if (view != null) {
            view.setOnClickListener(new d(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.subtitle.g.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f130944a;

                static {
                    Covode.recordClassIndex(85821);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f130944a = r1;
                }

                @Override // com.ss.android.ugc.aweme.views.d
                public final void a(View view) {
                    ImageView imageView = this.f130944a.f130936a;
                    if (imageView == null || !imageView.isSelected()) {
                        LinearLayout linearLayout = this.f130944a.f130937b;
                        if (linearLayout != null) {
                            linearLayout.startAnimation(this.f130944a.getMShakeAnim());
                            return;
                        }
                        return;
                    }
                    l lVar = this.f130944a.f130938c;
                    if (lVar != null) {
                        lVar.a();
                    }
                    l lVar2 = this.f130944a.f130938c;
                    if (lVar2 != null) {
                        lVar2.b();
                    }
                }
            });
        }
        this.f130941g = i.a((h.f.a.a) new b(context));
        MethodCollector.o(3943);
    }

    public /* synthetic */ g(Context context, byte b2) {
        this(context);
    }
}
