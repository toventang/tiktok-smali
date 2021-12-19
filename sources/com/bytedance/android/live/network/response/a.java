package com.bytedance.android.live.network.response;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class a<T, R extends Extra> {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public int f12144a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public List<T> f12145b;
    @c(a = "extra")

    /* renamed from: c  reason: collision with root package name */
    public R f12146c;

    /* renamed from: d  reason: collision with root package name */
    public transient RequestError f12147d;

    static {
        Covode.recordClassIndex(6657);
    }
}
