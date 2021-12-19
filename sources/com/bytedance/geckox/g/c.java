package com.bytedance.geckox.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f29894a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public String f29895b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, a> f29896c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private String f29897d;

    static {
        Covode.recordClassIndex(17335);
    }

    public final Map<String, Long> a() {
        MethodCollector.i(8869);
        HashMap hashMap = new HashMap();
        synchronized (this.f29896c) {
            try {
                Collection<a> values = this.f29896c.values();
                if (values == null) {
                    return hashMap;
                }
                for (a aVar : values) {
                    hashMap.put(aVar.f29886a, aVar.f29887b);
                }
                MethodCollector.o(8869);
                return hashMap;
            } finally {
                MethodCollector.o(8869);
            }
        }
    }

    public final a a(String str) {
        a aVar;
        MethodCollector.i(8868);
        int indexOf = str.indexOf("/");
        if (indexOf == -1) {
            new RuntimeException("channel is needed：".concat(String.valueOf(str)));
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.f29896c) {
            try {
                aVar = this.f29896c.get(substring);
                if (aVar == null) {
                    aVar = new a(this.f29897d, this.f29895b, substring);
                    this.f29896c.put(substring, aVar);
                }
            } finally {
                MethodCollector.o(8868);
            }
        }
        return aVar;
    }

    public c(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f29897d = str;
            if (file == null) {
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = context.getFilesDir();
                }
                this.f29895b = new File(d.f107195c, "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
                return;
            }
            this.f29895b = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key empty");
    }
}
