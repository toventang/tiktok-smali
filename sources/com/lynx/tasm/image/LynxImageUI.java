package com.lynx.tasm.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.a;
import com.lynx.tasm.image.c;
import java.util.Map;

public class LynxImageUI extends LynxUI<e> {

    /* renamed from: a  reason: collision with root package name */
    public final c f56670a;

    static {
        Covode.recordClassIndex(35322);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        this.f56670a.d();
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f56670a.a(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom, this.mBorderLeftWidth, this.mBorderTopWidth, this.mBorderRightWidth, this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void afterPropsUpdated(v vVar) {
        super.afterPropsUpdated(vVar);
        this.f56670a.a(vVar);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ e createView(Context context) {
        e eVar = new e(context);
        eVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.image.LynxImageUI.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private boolean f56673b;

            static {
                Covode.recordClassIndex(35326);
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f56673b) {
                    LynxImageUI.this.f56670a.b();
                }
                this.f56673b = false;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f56673b = true;
                LynxImageUI.this.f56670a.c();
            }
        });
        return eVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, a> map) {
        super.setEvents(map);
        this.f56670a.a(map);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        super.updateAttributes(vVar);
        this.f56670a.a(vVar);
    }

    public LynxImageUI(j jVar) {
        super(jVar);
        c cVar = new c(jVar, this, new c.a() {
            /* class com.lynx.tasm.image.LynxImageUI.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35325);
            }

            @Override // com.lynx.tasm.image.c.a
            public final void a(Bitmap bitmap) {
                e eVar = (e) LynxImageUI.this.mView;
                if (eVar.f56739a != null) {
                    eVar.f56739a.a();
                }
                eVar.f56742d = bitmap;
                eVar.invalidate();
            }

            @Override // com.lynx.tasm.image.c.a
            public final void b(Bitmap bitmap) {
                e eVar = (e) LynxImageUI.this.mView;
                if (eVar.f56740b != null) {
                    eVar.f56740b.a();
                }
                eVar.f56743e = bitmap;
                eVar.invalidate();
            }
        });
        this.f56670a = cVar;
        ((e) this.mView).f56741c = cVar.f56709a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBorderRadius(int i2, float f2, float f3) {
        super.setBorderRadius(i2, f2, f3);
        this.f56670a.a(i2, f2, f3);
    }
}
