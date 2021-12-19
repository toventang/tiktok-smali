package com.ss.android.ugc.gamora.editor;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.infosticker.view.a.e;
import com.ss.android.ugc.tools.infosticker.view.internal.base.b;
import com.ss.android.ugc.tools.infosticker.view.internal.main.j;
import com.ss.android.ugc.tools.infosticker.view.internal.main.k;
import com.ss.android.ugc.tools.infosticker.view.internal.main.l;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.p;
import h.z;
import java.util.List;

public final class x {
    static {
        Covode.recordClassIndex(97099);
    }

    public static final AnimationSet a() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f147341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f147342b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.infosticker.view.internal.l f147343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f147344d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f147345e = true;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f147346f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f147347g;

        static {
            Covode.recordClassIndex(97100);
        }

        @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.l
        public final e<EffectCategoryResponse, Effect> a(TabLayout tabLayout) {
            h.f.b.l.d(tabLayout, "");
            return new C3952a(tabLayout, tabLayout);
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.x$a$a  reason: collision with other inner class name */
        public static final class C3952a extends k {

            /* renamed from: a  reason: collision with root package name */
            public final double f147348a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ TabLayout f147349b;

            /* renamed from: e  reason: collision with root package name */
            private final int f147350e;

            /* renamed from: f  reason: collision with root package name */
            private final int f147351f;

            /* renamed from: g  reason: collision with root package name */
            private final double f147352g;

            static {
                Covode.recordClassIndex(97101);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>>>] */
            @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.e
            public final void a(List<? extends p<? extends EffectCategoryResponse, ? extends List<? extends Effect>>> list) {
                h.f.b.l.d(list, "");
                super.a((List) list);
                if (this.f147350e <= this.f147351f || list.size() >= 8) {
                    this.f147349b.setTabMode(0);
                } else {
                    this.f147349b.setTabMode(1);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, java.lang.Object] */
            @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.k, com.ss.android.ugc.tools.infosticker.view.internal.base.e
            public final /* bridge */ /* synthetic */ View a(Context context, EffectCategoryResponse effectCategoryResponse) {
                return a(context, effectCategoryResponse);
            }

            @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.k, com.ss.android.ugc.tools.infosticker.view.internal.base.e
            public final void a(View view, int i2) {
                if (!(view instanceof j)) {
                    view = null;
                }
                j jVar = (j) view;
                if (jVar != null) {
                    jVar.getContentView().setBackground(null);
                }
                View c2 = this.f147349b.c(i2);
                if (c2 != null) {
                    c2.setBackground(null);
                }
            }

            @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.k, com.ss.android.ugc.tools.infosticker.view.internal.base.e
            public final void b(View view, int i2) {
                if (!(view instanceof j)) {
                    view = null;
                }
                j jVar = (j) view;
                if (jVar != null) {
                    View contentView = jVar.getContentView();
                    Context context = this.f147349b.getContext();
                    h.f.b.l.b(context, "");
                    contentView.setBackground(context.getResources().getDrawable(R.drawable.s5));
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.x$a$a$a  reason: collision with other inner class name */
            static final class View$OnTouchListenerC3953a implements View.OnTouchListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f147353a;

                static {
                    Covode.recordClassIndex(97102);
                }

                View$OnTouchListenerC3953a(j jVar) {
                    this.f147353a = jVar;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h.f.b.l.b(motionEvent, "");
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        SimpleDraweeView iconImgView = this.f147353a.getIconImgView();
                        AnimationSet animationSet = new AnimationSet(true);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(100);
                        animationSet.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation);
                        iconImgView.startAnimation(animationSet);
                        return false;
                    } else if (action == 1) {
                        this.f147353a.getIconImgView().startAnimation(x.a());
                        return false;
                    } else if (action != 2) {
                        return false;
                    } else {
                        this.f147353a.getIconImgView().startAnimation(x.a());
                        return false;
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3952a(TabLayout tabLayout, TabLayout tabLayout2) {
                super(tabLayout2);
                this.f147349b = tabLayout;
                this.f147350e = r.a(tabLayout.getContext());
                Context context = tabLayout.getContext();
                h.f.b.l.b(context, "");
                this.f147351f = (int) r.a(context, 320.0f);
                Context context2 = tabLayout.getContext();
                h.f.b.l.b(context2, "");
                this.f147352g = (double) r.a(context2, 32.0f);
                Context context3 = tabLayout.getContext();
                h.f.b.l.b(context3, "");
                this.f147348a = (double) r.a(context3, 12.0f);
            }

            @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.k
            public final View a(Context context, EffectCategoryResponse effectCategoryResponse) {
                View view;
                h.f.b.l.d(context, "");
                h.f.b.l.d(effectCategoryResponse, "");
                View a2 = super.a(context, effectCategoryResponse);
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                if (!(a2 instanceof j)) {
                    view = null;
                } else {
                    view = a2;
                }
                j jVar = (j) view;
                if (jVar != null) {
                    jVar.getTextView().setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = jVar.getContentView().getLayoutParams();
                    layoutParams.width = (int) this.f147352g;
                    layoutParams.height = (int) this.f147352g;
                    jVar.getContentView().setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = jVar.getIconImgView().getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = layoutParams2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    if (marginLayoutParams2 != null) {
                        int i2 = Build.VERSION.SDK_INT;
                        marginLayoutParams2.setMarginStart(0);
                    }
                    jVar.getIconImgView().setAlpha(1.0f);
                    jVar.setOnTouchListener(new View$OnTouchListenerC3953a(jVar));
                }
                return a2;
            }

            @Override // com.ss.android.ugc.tools.infosticker.view.internal.main.k
            public final void a(View view, EffectCategoryResponse effectCategoryResponse, int i2, int i3) {
                double d2;
                double d3;
                double d4;
                double d5;
                h.f.b.l.d(view, "");
                h.f.b.l.d(effectCategoryResponse, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i4 = this.f147350e;
                    if (i4 <= this.f147351f) {
                        double d6 = (double) i4;
                        double d7 = this.f147348a;
                        Double.isNaN(d6);
                        d2 = (d6 - d7) - (this.f147352g * 6.5d);
                        d3 = 6.0d;
                    } else if (i3 > 8) {
                        double d8 = (double) i4;
                        double d9 = this.f147348a;
                        Double.isNaN(d8);
                        d2 = (d8 - d9) - (this.f147352g * 8.5d);
                        d3 = 8.0d;
                    } else {
                        double d10 = (double) i4;
                        Double.isNaN(d10);
                        double d11 = d10 - (this.f147348a * 2.0d);
                        double d12 = (double) i3;
                        double d13 = this.f147352g;
                        Double.isNaN(d12);
                        d2 = d11 - (d12 * d13);
                        d3 = (double) (i3 - 1);
                        Double.isNaN(d3);
                    }
                    double d14 = d2 / d3;
                    if (i2 == 0) {
                        d4 = this.f147348a;
                    } else {
                        d4 = d14 / 2.0d;
                    }
                    if (i2 == i3 - 1) {
                        d5 = this.f147348a;
                    } else {
                        d5 = d14 / 2.0d;
                    }
                    int i5 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginStart((int) d4);
                    marginLayoutParams.setMarginEnd((int) d5);
                    marginLayoutParams.leftMargin = (int) d4;
                    marginLayoutParams.rightMargin = (int) d5;
                    view.setLayoutParams(marginLayoutParams);
                    view.invalidate();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, m mVar, com.ss.android.ugc.tools.infosticker.view.internal.l lVar, boolean z, boolean z2, boolean z3, ViewGroup viewGroup2, m mVar2, com.ss.android.ugc.tools.infosticker.view.internal.l lVar2, h.f.a.b bVar) {
            super(viewGroup2, mVar2, lVar2, bVar, (byte) 0);
            this.f147341a = viewGroup;
            this.f147342b = mVar;
            this.f147343c = lVar;
            this.f147344d = z;
            this.f147346f = z2;
            this.f147347g = z3;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<l.c, z> {
        final /* synthetic */ boolean $enableCategory = true;
        final /* synthetic */ boolean $enableLazyPopulate;
        final /* synthetic */ boolean $enableProvider;
        final /* synthetic */ boolean $stopImageLoadWhenScroll;

        static {
            Covode.recordClassIndex(97103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(boolean z, boolean z2, boolean z3) {
            super(1);
            this.$enableProvider = z;
            this.$enableLazyPopulate = z2;
            this.$stopImageLoadWhenScroll = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(l.c cVar) {
            l.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            cVar2.f149780a = this.$enableProvider;
            cVar2.f149781b = this.$enableCategory;
            cVar2.f149788i = this.$enableLazyPopulate;
            l.a aVar = new l.a(0, new h.f.a.b<b.c, z>(this) {
                /* class com.ss.android.ugc.gamora.editor.x.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(97104);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(b.c cVar) {
                    b.c cVar2 = cVar;
                    h.f.b.l.d(cVar2, "");
                    cVar2.f149565a = this.this$0.$stopImageLoadWhenScroll;
                    return z.f158842a;
                }
            }, 7);
            h.f.b.l.d(aVar, "");
            cVar2.f149790k = aVar;
            return z.f158842a;
        }
    }
}
