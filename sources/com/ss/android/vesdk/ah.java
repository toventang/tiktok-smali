package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.List;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    private VEImageDetectUtils f150915a;

    static {
        Covode.recordClassIndex(99267);
    }

    public final synchronized void a(String str, String str2, List<String> list, VEImageDetectUtils.IDetectImageResultListener iDetectImageResultListener) {
        MethodCollector.i(13366);
        VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
        this.f150915a = vEImageDetectUtils;
        vEImageDetectUtils.init();
        this.f150915a.setDetectImageContentListener(iDetectImageResultListener);
        this.f150915a.detectImageContent(str, str2, list, 1280, 1280);
        this.f150915a.destroy();
        MethodCollector.o(13366);
    }
}
