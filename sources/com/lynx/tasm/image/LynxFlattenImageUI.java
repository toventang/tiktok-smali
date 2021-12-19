package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.a;
import com.lynx.tasm.image.c;
import java.util.Map;

public class LynxFlattenImageUI extends LynxFlattenUI {

    /* renamed from: b  reason: collision with root package name */
    public d f56663b;

    /* renamed from: c  reason: collision with root package name */
    public d f56664c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f56665d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f56666e;

    /* renamed from: f  reason: collision with root package name */
    private final c f56667f;

    /* renamed from: g  reason: collision with root package name */
    private final b f56668g;

    static {
        Covode.recordClassIndex(35318);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void onAttach() {
        super.onAttach();
        this.f56667f.b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        this.f56666e = null;
        this.f56665d = null;
        this.f56667f.d();
        d dVar = this.f56663b;
        if (dVar != null) {
            dVar.b();
            this.f56663b = null;
        }
        d dVar2 = this.f56664c;
        if (dVar2 != null) {
            dVar2.b();
            this.f56664c = null;
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        this.f56666e = null;
        this.f56665d = null;
        this.f56667f.c();
        d dVar = this.f56663b;
        if (dVar != null) {
            dVar.b();
            this.f56663b = null;
        }
        d dVar2 = this.f56664c;
        if (dVar2 != null) {
            dVar2.b();
            this.f56664c = null;
        }
        super.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f56667f.a(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom, this.mBorderLeftWidth, this.mBorderTopWidth, this.mBorderRightWidth, this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void afterPropsUpdated(v vVar) {
        super.afterPropsUpdated(vVar);
        this.f56667f.a(vVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, a> map) {
        super.setEvents(map);
        this.f56667f.a(map);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        super.updateAttributes(vVar);
        this.f56667f.a(vVar);
    }

    public LynxFlattenImageUI(j jVar) {
        super(jVar);
        c cVar = new c(jVar, this, new c.a() {
            /* class com.lynx.tasm.image.LynxFlattenImageUI.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35321);
            }

            @Override // com.lynx.tasm.image.c.a
            public final void a(Bitmap bitmap) {
                if (LynxFlattenImageUI.this.f56663b != null) {
                    LynxFlattenImageUI.this.f56663b.a();
                }
                LynxFlattenImageUI.this.f56665d = bitmap;
                LynxFlattenImageUI.this.invalidate();
            }

            @Override // com.lynx.tasm.image.c.a
            public final void b(Bitmap bitmap) {
                if (LynxFlattenImageUI.this.f56664c != null) {
                    LynxFlattenImageUI.this.f56664c.a();
                }
                LynxFlattenImageUI.this.f56666e = bitmap;
                LynxFlattenImageUI.this.invalidate();
            }
        });
        this.f56667f = cVar;
        this.f56668g = cVar.f56709a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public final void c(Canvas canvas) {
        super.c(canvas);
        if (this.f56665d != null) {
            if (this.f56663b == null) {
                this.f56663b = com.lynx.tasm.image.b.c.a();
            }
            this.f56663b.a(canvas, this.f56665d, this.f56668g);
        } else if (this.f56666e != null) {
            if (this.f56664c == null) {
                this.f56664c = com.lynx.tasm.image.b.c.b();
            }
            this.f56664c.a(canvas, this.f56666e, this.f56668g);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBorderRadius(int i2, float f2, float f3) {
        super.setBorderRadius(i2, f2, f3);
        this.f56667f.a(i2, f2, f3);
    }
}
