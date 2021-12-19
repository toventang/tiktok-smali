package com.bytedance.android.live.core.f;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static o f9101a = new o();

    /* renamed from: b  reason: collision with root package name */
    ExecutorService f9102b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f9103c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9104d = new Object();

    static {
        Covode.recordClassIndex(4655);
    }

    private o() {
        if (!ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            l.a a2 = l.a(com.ss.android.ugc.aweme.cw.o.FIXED);
            a2.f79174c = 1;
            this.f9102b = g.a(a2.a());
        }
        this.f9103c = new LinkedList();
    }

    public final boolean a(ImageModel imageModel) {
        MethodCollector.i(10421);
        if (imageModel == null || h.a(imageModel.getUrls())) {
            MethodCollector.o(10421);
            return false;
        }
        synchronized (this.f9104d) {
            try {
                for (String str : imageModel.getUrls()) {
                    if (this.f9103c.contains(str)) {
                        return true;
                    }
                }
                MethodCollector.o(10421);
                return false;
            } finally {
                MethodCollector.o(10421);
            }
        }
    }
}
