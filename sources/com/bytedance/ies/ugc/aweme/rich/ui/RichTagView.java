package com.bytedance.ies.ugc.aweme.rich.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;

public final class RichTagView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35164a;

    /* renamed from: b  reason: collision with root package name */
    private final h f35165b;

    /* renamed from: c  reason: collision with root package name */
    private final h f35166c;

    /* renamed from: d  reason: collision with root package name */
    private final h f35167d;

    /* renamed from: e  reason: collision with root package name */
    private final h f35168e;

    static {
        Covode.recordClassIndex(21070);
    }

    public RichTagView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public RichTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RelativeLayout getMContentView() {
        return (RelativeLayout) this.f35166c.getValue();
    }

    private final TuxTextView getMDescTextView() {
        return (TuxTextView) this.f35167d.getValue();
    }

    private final ImageView getMImageView() {
        return (ImageView) this.f35168e.getValue();
    }

    public final int getDescId() {
        return R.id.dn1;
    }

    public final int getImageId() {
        return R.id.dn2;
    }

    public final View getMRootView() {
        return (View) this.f35165b.getValue();
    }

    static final class a extends m implements h.f.a.a<RelativeLayout> {
        final /* synthetic */ RichTagView this$0;

        static {
            Covode.recordClassIndex(21071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RichTagView richTagView) {
            super(0);
            this.this$0 = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn3);
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ RichTagView this$0;

        static {
            Covode.recordClassIndex(21072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RichTagView richTagView) {
            super(0);
            this.this$0 = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn1);
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ RichTagView this$0;

        static {
            Covode.recordClassIndex(21073);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RichTagView richTagView) {
            super(0);
            this.this$0 = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.getMRootView().findViewById(R.id.dn2);
        }
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        ViewGroup.LayoutParams layoutParams = getMDescTextView().getLayoutParams();
        l.a((Object) layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        ViewGroup.LayoutParams layoutParams = getMImageView().getLayoutParams();
        l.a((Object) layoutParams, "");
        return layoutParams;
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        ViewGroup.LayoutParams layoutParams = getMContentView().getLayoutParams();
        l.a((Object) layoutParams, "");
        return layoutParams;
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ RichTagView this$0;

        static {
            Covode.recordClassIndex(21074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RichTagView richTagView) {
            super(0);
            this.this$0 = richTagView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            MethodCollector.i(1504);
            View inflate = View.inflate(this.this$0.f35164a, R.layout.as8, this.this$0);
            MethodCollector.o(1504);
            return inflate;
        }
    }

    public final void a(a aVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        l.c(aVar, "");
        if (!TextUtils.isEmpty(aVar.f35169a)) {
            Integer num = aVar.s;
            int i9 = 0;
            if (num != null) {
                int intValue = num.intValue();
                ViewGroup.LayoutParams descViewParams = getDescViewParams();
                if (descViewParams != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) descViewParams;
                    ViewGroup.LayoutParams imageViewParams = getImageViewParams();
                    if (imageViewParams != null) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageViewParams;
                        layoutParams.addRule(1, 0);
                        if (intValue == 1 || intValue == 2) {
                            layoutParams.addRule(15);
                            layoutParams2.addRule(15);
                        } else {
                            layoutParams.addRule(14);
                            layoutParams2.addRule(14);
                        }
                        if (intValue == 1) {
                            layoutParams.addRule(1, getImageId());
                            Integer num2 = aVar.t;
                            if (num2 != null) {
                                i5 = num2.intValue();
                            } else {
                                i5 = 0;
                            }
                            layoutParams.leftMargin = i5;
                        } else if (intValue == 2) {
                            layoutParams2.addRule(1, getDescId());
                            Integer num3 = aVar.t;
                            if (num3 != null) {
                                i6 = num3.intValue();
                            } else {
                                i6 = 0;
                            }
                            layoutParams2.leftMargin = i6;
                        } else if (intValue == 3) {
                            layoutParams.addRule(3, getImageId());
                            Integer num4 = aVar.t;
                            if (num4 != null) {
                                i7 = num4.intValue();
                            } else {
                                i7 = 0;
                            }
                            layoutParams.topMargin = i7;
                        } else if (intValue == 4) {
                            layoutParams2.addRule(3, getDescId());
                            Integer num5 = aVar.t;
                            if (num5 != null) {
                                i8 = num5.intValue();
                            } else {
                                i8 = 0;
                            }
                            layoutParams2.topMargin = i8;
                        }
                        getMDescTextView().setLayoutParams(layoutParams);
                        getMImageView().setLayoutParams(layoutParams2);
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            if (!(aVar.f35177i == null && aVar.f35178j == null)) {
                ViewGroup.LayoutParams tagViewParams = getTagViewParams();
                if (tagViewParams != null) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tagViewParams;
                    Integer num6 = aVar.f35177i;
                    if (num6 != null) {
                        layoutParams3.width = num6.intValue();
                    }
                    Integer num7 = aVar.f35178j;
                    if (num7 != null) {
                        layoutParams3.height = num7.intValue();
                    }
                    getMContentView().setLayoutParams(layoutParams3);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            RelativeLayout.LayoutParams layoutParams4 = aVar.p;
            if (layoutParams4 != null) {
                getMContentView().setLayoutParams(layoutParams4);
            }
            RelativeLayout.LayoutParams layoutParams5 = aVar.q;
            if (layoutParams5 != null) {
                getMDescTextView().setLayoutParams(layoutParams5);
            }
            RelativeLayout.LayoutParams layoutParams6 = aVar.r;
            if (layoutParams6 != null) {
                getMImageView().setLayoutParams(layoutParams6);
            }
            getMDescTextView().setText(aVar.f35169a);
            Integer num8 = aVar.f35170b;
            if (num8 != null) {
                getMDescTextView().setTextColor(num8.intValue());
            }
            Float f2 = aVar.f35171c;
            if (f2 != null) {
                getMDescTextView().setTextSize(f2.floatValue());
            }
            Integer num9 = aVar.f35172d;
            if (num9 != null) {
                getMDescTextView().setTuxFont(num9.intValue());
            }
            TextUtils.TruncateAt truncateAt = aVar.f35173e;
            if (truncateAt != null) {
                getMDescTextView().setEllipsize(truncateAt);
            }
            Integer num10 = aVar.f35174f;
            if (num10 != null) {
                getMDescTextView().setMaxLines(num10.intValue());
            }
            Integer num11 = aVar.o;
            if (num11 != null) {
                getMImageView().setImageResource(num11.intValue());
                getMImageView().setVisibility(0);
            }
            if (aVar.f35175g != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                Integer num12 = aVar.f35175g;
                if (num12 != null) {
                    gradientDrawable.setColor(num12.intValue());
                }
                Float f3 = aVar.f35176h;
                if (f3 != null) {
                    gradientDrawable.setCornerRadius(f3.floatValue());
                }
                getMContentView().setBackground(gradientDrawable);
            }
            if (aVar.f35181m != null || aVar.n != null || aVar.f35179k != null || aVar.f35180l != null) {
                int i10 = Build.VERSION.SDK_INT;
                RelativeLayout mContentView = getMContentView();
                Integer num13 = aVar.f35179k;
                if (num13 != null) {
                    i2 = num13.intValue();
                } else {
                    i2 = 0;
                }
                Integer num14 = aVar.f35181m;
                if (num14 != null) {
                    i3 = num14.intValue();
                } else {
                    i3 = 0;
                }
                Integer num15 = aVar.f35180l;
                if (num15 != null) {
                    i4 = num15.intValue();
                } else {
                    i4 = 0;
                }
                Integer num16 = aVar.n;
                if (num16 != null) {
                    i9 = num16.intValue();
                }
                mContentView.setPaddingRelative(i2, i3, i4, i9);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RichTagView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RichTagView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(1871);
        this.f35164a = context;
        this.f35165b = i.a((h.f.a.a) new d(this));
        this.f35166c = i.a((h.f.a.a) new a(this));
        this.f35167d = i.a((h.f.a.a) new b(this));
        this.f35168e = i.a((h.f.a.a) new c(this));
        MethodCollector.o(1871);
    }
}
