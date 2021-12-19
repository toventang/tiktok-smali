package com.ss.android.ugc.aweme.ca;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class i {

    /* renamed from: c  reason: collision with root package name */
    private static final String f69609c = i.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, LayoutInflater> f69610a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public a f69611b;

    public interface a {
        static {
            Covode.recordClassIndex(42943);
        }

        LayoutInflater a();
    }

    static {
        Covode.recordClassIndex(42942);
    }

    public final synchronized void a() {
        MethodCollector.i(6839);
        this.f69611b = null;
        this.f69610a.clear();
        MethodCollector.o(6839);
    }

    public final synchronized LayoutInflater a(Context context) {
        MethodCollector.i(6842);
        LayoutInflater layoutInflater = null;
        a aVar = this.f69611b;
        if (aVar != null) {
            layoutInflater = aVar.a();
        }
        if (layoutInflater != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                MethodCollector.o(6842);
                return layoutInflater;
            }
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        MethodCollector.o(6842);
        return layoutInflater;
    }

    public final synchronized void a(a aVar) {
        MethodCollector.i(6838);
        synchronized (this) {
            try {
                this.f69611b = aVar;
            } finally {
                MethodCollector.o(6838);
            }
        }
    }
}
