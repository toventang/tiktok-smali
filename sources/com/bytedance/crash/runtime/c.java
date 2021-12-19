package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.b;
import com.bytedance.crash.util.q;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final q<CrashType, ICrashCallback> f27896a = new q<>();

    /* renamed from: b  reason: collision with root package name */
    public final q<CrashType, b> f27897b = new q<>();

    /* renamed from: c  reason: collision with root package name */
    public final List<IOOMCallback> f27898c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<IOOMCallback> f27899d = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(16327);
    }
}
