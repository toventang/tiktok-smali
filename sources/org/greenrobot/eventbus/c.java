package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.b.b;

public class c {
    private static final ExecutorService n = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    boolean f159792a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f159793b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f159794c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f159795d = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f159796e;

    /* renamed from: f  reason: collision with root package name */
    boolean f159797f = true;

    /* renamed from: g  reason: collision with root package name */
    boolean f159798g;

    /* renamed from: h  reason: collision with root package name */
    boolean f159799h;

    /* renamed from: i  reason: collision with root package name */
    ExecutorService f159800i = n;

    /* renamed from: j  reason: collision with root package name */
    ExecutorService f159801j;

    /* renamed from: k  reason: collision with root package name */
    List<b> f159802k;

    /* renamed from: l  reason: collision with root package name */
    l f159803l;

    /* renamed from: m  reason: collision with root package name */
    m f159804m;

    static Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(106472);
    }

    c() {
    }
}
