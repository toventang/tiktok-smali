package com.ss.android.ugc.aweme.utils;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.do  reason: invalid class name */
public final class Cdo {

    /* renamed from: a  reason: collision with root package name */
    static Cdo f142829a = new Cdo();

    /* renamed from: b  reason: collision with root package name */
    ExecutorService f142830b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f142831c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f142832d = new Object();

    static {
        Covode.recordClassIndex(93442);
    }

    private Cdo() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        this.f142830b = g.a(a2.a());
        this.f142831c = new LinkedList();
    }

    public final boolean a(ImageModel imageModel) {
        MethodCollector.i(8979);
        if (imageModel == null || h.a(imageModel.getUrls())) {
            MethodCollector.o(8979);
            return false;
        }
        synchronized (this.f142832d) {
            try {
                for (String str : imageModel.getUrls()) {
                    if (this.f142831c.contains(str)) {
                        return true;
                    }
                }
                MethodCollector.o(8979);
                return false;
            } finally {
                MethodCollector.o(8979);
            }
        }
    }
}
