package com.bytedance.tux.table.cell;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.table.cell.a;
import com.bytedance.tux.widget.ExpandableLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;

public interface c {
    static {
        Covode.recordClassIndex(27664);
    }

    /* renamed from: com.bytedance.tux.table.cell.c$c  reason: collision with other inner class name */
    public static final class C1117c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final TuxButton f45441c;

        static {
            Covode.recordClassIndex(27668);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final boolean c() {
            return false;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.C1116a.f45427b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final View b() {
            return this.f45441c;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            TuxButton tuxButton = this.f45441c;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(tuxButton, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ C1117c(Context context) {
            this(context, null);
        }

        public final void a(CharSequence charSequence) {
            this.f45441c.setText(charSequence);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void a(boolean z) {
            super.a(z);
            this.f45441c.setLoading(z);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void b(boolean z) {
            super.b(z);
            this.f45441c.setEnabled(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1117c(Context context, AttributeSet attributeSet) {
            super(context);
            l.c(context, "");
            TuxButton tuxButton = new TuxButton(context, null, 0, 6);
            this.f45441c = tuxButton;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int i2 = obtainStyledAttributes.getInt(19, Integer.MIN_VALUE);
            int i3 = obtainStyledAttributes.getInt(17, Integer.MIN_VALUE);
            String string = obtainStyledAttributes.getString(18);
            obtainStyledAttributes.recycle();
            tuxButton.setButtonVariant(i2);
            tuxButton.setButtonSize(i3);
            a(string);
        }
    }

    public static final class d extends e {
        static {
            Covode.recordClassIndex(27669);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.b.f45428b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            View view = this.f45442c.f45436b;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(view, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ d(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l.c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.c.e
        public final CompoundButton a(Context context, AttributeSet attributeSet) {
            l.c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int i2 = obtainStyledAttributes.getInt(21, 0);
            obtainStyledAttributes.recycle();
            TuxCheckBox tuxCheckBox = new TuxCheckBox(context, null, 0, 6);
            tuxCheckBox.setShape(i2);
            return tuxCheckBox;
        }
    }

    public static final class f extends b {

        /* renamed from: c  reason: collision with root package name */
        public final com.bytedance.tux.table.a.a f45446c;

        /* renamed from: d  reason: collision with root package name */
        private final int f45447d;

        /* renamed from: e  reason: collision with root package name */
        private final int f45448e;

        static {
            Covode.recordClassIndex(27673);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.d.f45429b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final View b() {
            return this.f45446c;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final int d() {
            if (!this.f45446c.getWithIcon$tux_release()) {
                return 0;
            }
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            return h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            int a2;
            com.bytedance.tux.table.a.a aVar = this.f45446c;
            if (aVar.getCustomView$tux_release() == null) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 17.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                a2 = h.g.a.a(TypedValue.applyDimension(1, 15.0f, system2.getDisplayMetrics()));
            }
            com.bytedance.tux.h.i.b(aVar, null, Integer.valueOf(a2), null, null, false, 29);
        }

        public /* synthetic */ f(Context context) {
            this(context, null);
        }

        public final void a(CharSequence charSequence) {
            this.f45446c.setLabel(charSequence);
        }

        public final void a(View.OnClickListener onClickListener) {
            l.c(onClickListener, "");
            this.f45446c.setOnClickListener(onClickListener);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void b(boolean z) {
            int i2;
            int i3;
            super.b(z);
            com.bytedance.tux.table.a.a aVar = this.f45446c;
            if (z) {
                i2 = this.f45447d;
            } else {
                i2 = this.f45448e;
            }
            aVar.setTextColor(i2);
            com.bytedance.tux.table.a.a aVar2 = this.f45446c;
            if (z) {
                i3 = this.f45447d;
            } else {
                i3 = this.f45448e;
            }
            aVar2.setIconColor(i3);
        }

        public final void a(View view, boolean z) {
            int i2;
            com.bytedance.tux.table.a.a aVar = this.f45446c;
            if (aVar.f45403a != null) {
                aVar.removeView(aVar.f45403a);
            }
            int i3 = 0;
            if (view != null) {
                aVar.addView(view, 0);
            }
            aVar.f45403a = view;
            TuxTextView tuxTextView = (TuxTextView) aVar.a(R.id.c48);
            l.a((Object) tuxTextView, "");
            if (view == null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
            TuxIconView tuxIconView = (TuxIconView) aVar.a(R.id.icon_iv);
            l.a((Object) tuxIconView, "");
            if (view != null && !z) {
                i3 = 8;
            }
            tuxIconView.setVisibility(i3);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Context context, AttributeSet attributeSet) {
            super(context);
            l.c(context, "");
            com.bytedance.tux.table.a.a aVar = new com.bytedance.tux.table.a.a(context, (byte) 0);
            this.f45446c = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int color = obtainStyledAttributes.getColor(6, 0);
            this.f45447d = color;
            this.f45448e = obtainStyledAttributes.getColor(13, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            a(obtainStyledAttributes.getString(23));
            int i2 = obtainStyledAttributes.getInt(7, 0);
            obtainStyledAttributes.recycle();
            aVar.setFont(i2);
            aVar.setTextColor(color);
            aVar.setIconRes(resourceId);
            aVar.setIconColor(color);
        }
    }

    public static final class g extends b {

        /* renamed from: c  reason: collision with root package name */
        final TuxIconView f45449c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45450d;

        /* renamed from: e  reason: collision with root package name */
        public final View f45451e = null;

        /* renamed from: f  reason: collision with root package name */
        private final h.h f45452f;

        /* renamed from: g  reason: collision with root package name */
        private final h.h f45453g;

        static {
            Covode.recordClassIndex(27674);
        }

        /* access modifiers changed from: package-private */
        public final RotateAnimation g() {
            return (RotateAnimation) this.f45452f.getValue();
        }

        /* access modifiers changed from: package-private */
        public final RotateAnimation h() {
            return (RotateAnimation) this.f45453g.getValue();
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.e.f45430b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final View b() {
            return this.f45449c;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void e() {
            g().cancel();
            h().cancel();
        }

        static final class a extends m implements h.f.a.a<RotateAnimation> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f45455a = new a();

            static {
                Covode.recordClassIndex(27676);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ RotateAnimation invoke() {
                RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(200);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(com.bytedance.tux.a.a.a.c());
                return rotateAnimation;
            }
        }

        static final class b extends m implements h.f.a.a<RotateAnimation> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f45456a = new b();

            static {
                Covode.recordClassIndex(27677);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ RotateAnimation invoke() {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(200);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(com.bytedance.tux.a.a.a.c());
                return rotateAnimation;
            }
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            TuxIconView tuxIconView = this.f45449c;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(tuxIconView, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void b(boolean z) {
            super.b(z);
            this.f45449c.setEnabled(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Context context, AttributeSet attributeSet) {
            super(context);
            l.c(context, "");
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
            this.f45449c = tuxIconView;
            this.f45452f = h.i.a((h.f.a.a) b.f45456a);
            this.f45453g = h.i.a((h.f.a.a) a.f45455a);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int color = obtainStyledAttributes.getColor(4, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            obtainStyledAttributes.recycle();
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            tuxIconView.setIconWidth(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            tuxIconView.setIconHeight(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
            tuxIconView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.table.cell.c.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f45454a;

                static {
                    Covode.recordClassIndex(27675);
                }

                {
                    this.f45454a = r1;
                }

                public final void onClick(View view) {
                    ViewParent parent;
                    ViewParent parent2;
                    l.a((Object) view, "");
                    if (view.isEnabled()) {
                        if (this.f45454a.f45450d) {
                            g gVar = this.f45454a;
                            gVar.f45450d = false;
                            View view2 = gVar.f45451e;
                            if (view2 == null || (parent2 = view2.getParent()) == null) {
                                throw new w("null cannot be cast to non-null type");
                            }
                            ExpandableLayout expandableLayout = (ExpandableLayout) parent2;
                            expandableLayout.f45577b.reverse();
                            expandableLayout.f45579d = true;
                            gVar.f45449c.startAnimation(gVar.h());
                            return;
                        }
                        g gVar2 = this.f45454a;
                        gVar2.f45450d = true;
                        View view3 = gVar2.f45451e;
                        if (view3 == null || (parent = view3.getParent()) == null) {
                            throw new w("null cannot be cast to non-null type");
                        }
                        ExpandableLayout expandableLayout2 = (ExpandableLayout) parent;
                        expandableLayout2.f45577b.start();
                        expandableLayout2.f45579d = false;
                        gVar2.f45449c.startAnimation(gVar2.g());
                    }
                }
            });
        }
    }

    public static final class h extends b {

        /* renamed from: c  reason: collision with root package name */
        private final TuxTextView f45457c;

        /* renamed from: d  reason: collision with root package name */
        private final int f45458d;

        /* renamed from: e  reason: collision with root package name */
        private final int f45459e;

        static {
            Covode.recordClassIndex(27678);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final boolean c() {
            return false;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.f.f45431b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final View b() {
            return this.f45457c;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            TuxTextView tuxTextView = this.f45457c;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(tuxTextView, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 17.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void b(boolean z) {
            int i2;
            super.b(z);
            TuxTextView tuxTextView = this.f45457c;
            if (z) {
                i2 = this.f45458d;
            } else {
                i2 = this.f45459e;
            }
            tuxTextView.setTextColor(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Context context, AttributeSet attributeSet) {
            super(context);
            l.c(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            this.f45457c = tuxTextView;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int i2 = obtainStyledAttributes.getInt(7, 0);
            int color = obtainStyledAttributes.getColor(6, 0);
            this.f45458d = color;
            this.f45459e = obtainStyledAttributes.getColor(13, 0);
            tuxTextView.setText(obtainStyledAttributes.getString(23));
            obtainStyledAttributes.recycle();
            tuxTextView.setTuxFont(i2);
            tuxTextView.setTextColor(color);
            tuxTextView.setMaxLines(1);
            tuxTextView.setSingleLine();
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public static final class i extends e {
        static {
            Covode.recordClassIndex(27679);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.g.f45432b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            View view = this.f45442c.f45436b;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(view, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ i(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l.c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.c.e
        public final CompoundButton a(Context context, AttributeSet attributeSet) {
            l.c(context, "");
            return new TuxRadio(context, null, 0, 6);
        }
    }

    public static final class j extends e {
        static {
            Covode.recordClassIndex(27680);
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final /* bridge */ /* synthetic */ a a() {
            return a.h.f45433b;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void f() {
            View view = this.f45442c.f45436b;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            com.bytedance.tux.h.i.b(view, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 13.5f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ j(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            l.c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.c.e
        public final CompoundButton a(Context context, AttributeSet attributeSet) {
            l.c(context, "");
            return new TuxSwitch(context, null, 0, 6);
        }
    }

    public static abstract class e extends b {

        /* renamed from: c  reason: collision with root package name */
        public final a<CompoundButton> f45442c;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.a<Boolean> f45443d;

        static {
            Covode.recordClassIndex(27670);
        }

        public abstract CompoundButton a(Context context, AttributeSet attributeSet);

        @Override // com.bytedance.tux.table.cell.c.b
        public final View b() {
            return this.f45442c.f45436b;
        }

        public final boolean g() {
            return ((CompoundButton) this.f45442c.f45435a).isChecked();
        }

        public final void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            ((CompoundButton) this.f45442c.f45435a).setOnClickListener(new a(this, onCheckedChangeListener));
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void b(boolean z) {
            super.b(z);
            ((CompoundButton) this.f45442c.f45435a).setEnabled(z);
        }

        public final void c(boolean z) {
            ((CompoundButton) this.f45442c.f45435a).setChecked(z);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f45444a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CompoundButton.OnCheckedChangeListener f45445b;

            static {
                Covode.recordClassIndex(27672);
            }

            a(e eVar, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
                this.f45444a = eVar;
                this.f45445b = onCheckedChangeListener;
            }

            public final void onClick(View view) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f45445b;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged((CompoundButton) this.f45444a.f45442c.f45435a, this.f45444a.g());
                }
            }
        }

        public final void a(h.f.a.a<Boolean> aVar) {
            CompoundButton compoundButton = (CompoundButton) this.f45442c.f45435a;
            if (compoundButton instanceof com.bytedance.tux.input.a) {
                ((com.bytedance.tux.input.a) compoundButton).setInterceptToggleListener(aVar);
            }
            this.f45443d = aVar;
        }

        @Override // com.bytedance.tux.table.cell.c.b
        public final void a(boolean z) {
            int i2;
            super.a(z);
            a<CompoundButton> aVar = this.f45442c;
            T t = aVar.f45435a;
            int i3 = 0;
            if (z) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            t.setVisibility(i2);
            TuxSpinner tuxSpinner = aVar.f45437c;
            if (!z) {
                i3 = 8;
            }
            tuxSpinner.setVisibility(i3);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(final Context context, final AttributeSet attributeSet) {
            super(context);
            l.c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            this.f45442c = new a<>(context, attributeSet, new h.f.a.a<CompoundButton>(this) {
                /* class com.bytedance.tux.table.cell.c.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(27671);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ CompoundButton invoke() {
                    return this.this$0.a(context, attributeSet);
                }
            });
            c(z);
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.a<z> f45439a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f45440b;

        static {
            Covode.recordClassIndex(27667);
        }

        public abstract a a();

        public void a(boolean z) {
        }

        public abstract View b();

        public void b(boolean z) {
        }

        public boolean c() {
            return true;
        }

        public int d() {
            return 0;
        }

        public void e() {
        }

        public abstract void f();

        public b(Context context) {
            l.c(context, "");
            this.f45440b = context;
        }
    }

    public static final class a<T extends View> {

        /* renamed from: a  reason: collision with root package name */
        public final T f45435a;

        /* renamed from: b  reason: collision with root package name */
        public final View f45436b;

        /* renamed from: c  reason: collision with root package name */
        final TuxSpinner f45437c;

        static {
            Covode.recordClassIndex(27665);
        }

        public a(Context context, AttributeSet attributeSet, h.f.a.a<? extends T> aVar) {
            l.c(context, "");
            l.c(aVar, "");
            MethodCollector.i(8690);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.gj, R.attr.gk, R.attr.aom, R.attr.aon, R.attr.aoo, R.attr.aop, R.attr.aor, R.attr.ap8, R.attr.apt, R.attr.aqq, R.attr.ar7, R.attr.arq}, R.attr.cc, 0);
            l.a((Object) obtainStyledAttributes, "");
            int resourceId = obtainStyledAttributes.getResourceId(8, 0);
            int color = obtainStyledAttributes.getColor(9, 0);
            obtainStyledAttributes.recycle();
            FrameLayout frameLayout = new FrameLayout(context);
            this.f45436b = frameLayout;
            T t = (T) ((View) aVar.invoke());
            this.f45435a = t;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            t.setLayoutParams(layoutParams);
            TuxSpinner tuxSpinner = new TuxSpinner(context, null, 0, 6);
            this.f45437c = tuxSpinner;
            tuxSpinner.a(resourceId, color);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics())));
            layoutParams2.gravity = 17;
            tuxSpinner.setLayoutParams(layoutParams2);
            frameLayout.addView(t);
            frameLayout.addView(tuxSpinner);
            frameLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.table.cell.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f45438a;

                static {
                    Covode.recordClassIndex(27666);
                }

                {
                    this.f45438a = r1;
                }

                public final void onClick(View view) {
                    this.f45438a.f45435a.performClick();
                }
            });
            tuxSpinner.setVisibility(8);
            MethodCollector.o(8690);
        }
    }
}
