package com.ss.android.ugc.aweme.canvas;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    String f69705a = "unset";

    /* renamed from: b  reason: collision with root package name */
    public VESize f69706b;

    /* renamed from: c  reason: collision with root package name */
    PhotoCanvasTransformFilterParam f69707c;

    /* renamed from: d  reason: collision with root package name */
    public final t<VEVideoTransformFilterParam> f69708d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, VEVideoTransformFilterParam> f69709e = new HashMap<>();

    static {
        Covode.recordClassIndex(42987);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f69706b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final VEVideoTransformFilterParam b() {
        if (this.f69709e.get(this.f69705a) == null) {
            HashMap<String, VEVideoTransformFilterParam> hashMap = this.f69709e;
            String str = this.f69705a;
            VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = this.f69707c;
            if (photoCanvasTransformFilterParam != null) {
                vEVideoTransformFilterParam.scaleFactor = photoCanvasTransformFilterParam.getScaleFactor();
                vEVideoTransformFilterParam.transX = photoCanvasTransformFilterParam.getTransX();
                vEVideoTransformFilterParam.transY = photoCanvasTransformFilterParam.getTransY();
                vEVideoTransformFilterParam.degree = photoCanvasTransformFilterParam.getDegree();
            }
            hashMap.put(str, vEVideoTransformFilterParam);
        }
        VEVideoTransformFilterParam vEVideoTransformFilterParam2 = this.f69709e.get(this.f69705a);
        if (vEVideoTransformFilterParam2 != null) {
            return vEVideoTransformFilterParam2;
        }
        throw new IllegalStateException("cannot find current filter param");
    }
}
