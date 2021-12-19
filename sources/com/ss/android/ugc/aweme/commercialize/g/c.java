package com.ss.android.ugc.aweme.commercialize.g;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.d;
import h.f.b.l;

public final class c<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final d<INFO>[] f74441a;

    static {
        Covode.recordClassIndex(45915);
    }

    public c(d<INFO>... dVarArr) {
        l.d(dVarArr, "");
        this.f74441a = dVarArr;
    }

    @Override // com.facebook.drawee.c.d
    public final void onRelease(String str) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public final void onFailure(String str, Throwable th) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public final void onIntermediateImageFailed(String str, Throwable th) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public final void onIntermediateImageSet(String str, INFO info) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public final void onSubmit(String str, Object obj) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }
        }
    }

    @Override // com.facebook.drawee.c.d
    public final void onFinalImageSet(String str, INFO info, Animatable animatable) {
        d<INFO>[] dVarArr = this.f74441a;
        if (dVarArr != null) {
            for (d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            }
        }
    }
}
