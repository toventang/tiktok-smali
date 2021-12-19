package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class RoomNotifyMessageExtra {
    @c(a = "highlighted")

    /* renamed from: a  reason: collision with root package name */
    public List<Object> f19105a;
    @c(a = "background")

    /* renamed from: b  reason: collision with root package name */
    public Background f19106b;
    @c(a = "content_list")

    /* renamed from: c  reason: collision with root package name */
    public bc f19107c;
    @c(a = "duration")

    /* renamed from: d  reason: collision with root package name */
    public long f19108d;

    public static class Background extends ImageModel {
        static {
            Covode.recordClassIndex(11388);
        }
    }

    static {
        Covode.recordClassIndex(11387);
    }
}
