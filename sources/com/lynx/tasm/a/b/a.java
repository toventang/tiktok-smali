package com.lynx.tasm.a.b;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.a.b;
import com.lynx.tasm.a.c;
import com.lynx.tasm.behavior.ui.LynxUI;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected b f55646a = new b();

    static {
        Covode.recordClassIndex(34824);
    }

    /* access modifiers changed from: package-private */
    public abstract Animation a(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float f2);

    public final boolean a() {
        b bVar = this.f55646a;
        if (bVar == null || bVar.f55634b <= 0) {
            return false;
        }
        return true;
    }

    public final void a(int i2) {
        this.f55646a.f55636d = i2;
    }

    public final void b(long j2) {
        this.f55646a.f55634b = j2;
    }

    public final void a(long j2) {
        this.f55646a.f55635c = j2;
    }

    public final void a(ReadableArray readableArray) {
        this.f55646a.a(readableArray, 0);
    }

    public final void a(int i2, float f2, float f3, float f4, float f5, int i3) {
        this.f55646a.a(i2, f2, f3, f4, f5, i3);
    }

    /* access modifiers changed from: protected */
    public final Animation b(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float f2) {
        if (!a()) {
            return null;
        }
        Animation a2 = a(lynxUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect, f2);
        if (a2 != null) {
            a2.setDuration(this.f55646a.f55634b);
            a2.setStartOffset(this.f55646a.f55635c);
            a2.setInterpolator(c.a(this.f55646a));
        }
        return a2;
    }
}
