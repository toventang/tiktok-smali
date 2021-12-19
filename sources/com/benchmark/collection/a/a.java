package com.benchmark.collection.a;

import com.benchmark.tools.g;
import com.bytedance.covode.number.Covode;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;

public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f6113a;

    /* renamed from: b  reason: collision with root package name */
    protected static ArrayList<Object> f6114b = new ArrayList<>();

    static {
        Covode.recordClassIndex(2963);
    }

    public static void a() {
        if (!f6113a) {
            com.benchmark.tools.a.a();
            ArrayList arrayList = new ArrayList();
            arrayList.add("bytevc0");
            arrayList.addAll(FFmpegLibLoaderWrapper.a());
            arrayList.add("ByteVC1_dec");
            arrayList.add("bytenn");
            arrayList.add("btch_collection");
            if (f6380d != null) {
                if (!f6380d.a(arrayList)) {
                    f6113a = false;
                    return;
                }
            } else if (!f6381e.a(arrayList)) {
                f6113a = false;
                return;
            }
            f6113a = true;
        }
    }
}
