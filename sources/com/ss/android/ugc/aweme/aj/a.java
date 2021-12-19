package com.ss.android.ugc.aweme.aj;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.VEImageDetectUtils;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private VEImageDetectUtils f66344a;

    static {
        Covode.recordClassIndex(40765);
    }

    public final void a() {
        VEImageDetectUtils vEImageDetectUtils = this.f66344a;
        if (vEImageDetectUtils != null) {
            vEImageDetectUtils.stopDetectImagesContentIfNeed();
        }
    }

    public final synchronized void a(String str, List<String> list, List<String> list2, VEImageDetectUtils.IDetectImageResultWithNumListener iDetectImageResultWithNumListener) {
        MethodCollector.i(2925);
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(iDetectImageResultWithNumListener, "");
        VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
        vEImageDetectUtils.init();
        vEImageDetectUtils.setDetectImageContentWithNumListener(iDetectImageResultWithNumListener);
        vEImageDetectUtils.detectImagesContentWithSize(str, list, list2, 1280, 1280);
        vEImageDetectUtils.destroy();
        this.f66344a = vEImageDetectUtils;
        MethodCollector.o(2925);
    }
}
