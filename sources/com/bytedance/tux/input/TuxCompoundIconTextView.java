package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.b;
import com.bytedance.tux.c.c;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class TuxCompoundIconTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    private b f45125a;

    /* renamed from: b  reason: collision with root package name */
    private b f45126b;

    /* renamed from: e  reason: collision with root package name */
    private b f45127e;

    /* renamed from: f  reason: collision with root package name */
    private b f45128f;

    static {
        Covode.recordClassIndex(27522);
    }

    public TuxCompoundIconTextView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxCompoundIconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private final void a() {
        if (i.a(this)) {
            setCompoundDrawablesWithIntrinsicBounds(this.f45126b, this.f45127e, this.f45125a, this.f45128f);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.f45125a, this.f45127e, this.f45126b, this.f45128f);
        }
    }

    public final void setBottomIcon(com.bytedance.tux.c.a aVar) {
        l.c(aVar, "");
        Context context = getContext();
        l.a((Object) context, "");
        this.f45128f = aVar.a(context);
        a();
    }

    public final void setEndIcon(com.bytedance.tux.c.a aVar) {
        l.c(aVar, "");
        Context context = getContext();
        l.a((Object) context, "");
        this.f45126b = aVar.a(context);
        a();
    }

    public final void setStartIcon(com.bytedance.tux.c.a aVar) {
        l.c(aVar, "");
        Context context = getContext();
        l.a((Object) context, "");
        this.f45125a = aVar.a(context);
        a();
    }

    public final void setTopIcon(com.bytedance.tux.c.a aVar) {
        l.c(aVar, "");
        Context context = getContext();
        l.a((Object) context, "");
        this.f45127e = aVar.a(context);
        a();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $icon;
        final /* synthetic */ int $iconHeight;
        final /* synthetic */ boolean $iconShadow;
        final /* synthetic */ int $iconWidth;
        final /* synthetic */ z.e $tintColor;

        static {
            Covode.recordClassIndex(27523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, z.e eVar, int i3, int i4, boolean z) {
            super(1);
            this.$icon = i2;
            this.$tintColor = eVar;
            this.$iconWidth = i3;
            this.$iconHeight = i4;
            this.$iconShadow = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.c(aVar2, "");
            aVar2.f44749a = this.$icon;
            aVar2.f44752d = this.$tintColor.element;
            aVar2.f44750b = this.$iconWidth;
            aVar2.f44751c = this.$iconHeight;
            aVar2.f44754f = this.$iconShadow;
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCompoundIconTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap9, R.attr.ap_, R.attr.apb, R.attr.apc, R.attr.apd, R.attr.ape, R.attr.apf, R.attr.aph, R.attr.api, R.attr.apj, R.attr.apk, R.attr.apl, R.attr.apm, R.attr.apo, R.attr.app, R.attr.apq, R.attr.apr, R.attr.arm, R.attr.arn, R.attr.aro, R.attr.arp}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        this.f45125a = a(obtainStyledAttributes, 11, 19, 15, 4, 9);
        this.f45126b = a(obtainStyledAttributes, 1, 18, 14, 3, 8);
        this.f45127e = a(obtainStyledAttributes, 12, 20, 16, 5, 10);
        this.f45128f = a(obtainStyledAttributes, 0, 17, 13, 2, 7);
        setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        obtainStyledAttributes.recycle();
        a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxCompoundIconTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.ce : i2);
    }

    private final b a(TypedArray typedArray, int i2, int i3, int i4, int i5, int i6) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        z.e eVar = new z.e();
        eVar.element = null;
        if (typedArray.hasValue(i3)) {
            eVar.element = (T) Integer.valueOf(typedArray.getColor(i3, 0));
        }
        com.bytedance.tux.c.a a2 = c.a(new a(resourceId, eVar, typedArray.getDimensionPixelSize(i4, -1), typedArray.getDimensionPixelSize(i5, -1), typedArray.getBoolean(i6, false)));
        Context context = getContext();
        l.a((Object) context, "");
        return a2.a(context);
    }
}
