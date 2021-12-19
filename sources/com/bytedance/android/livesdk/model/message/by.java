package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class by extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19386a;
    @c(a = "notify_type")

    /* renamed from: f  reason: collision with root package name */
    public long f19387f;
    @c(a = "notify_class")

    /* renamed from: g  reason: collision with root package name */
    public int f19388g;
    @c(a = "schema")

    /* renamed from: h  reason: collision with root package name */
    public String f19389h;
    @c(a = "extra")

    /* renamed from: i  reason: collision with root package name */
    public RoomNotifyMessageExtra f19390i;
    @c(a = "user")

    /* renamed from: j  reason: collision with root package name */
    public User f19391j;
    @c(a = "source")

    /* renamed from: k  reason: collision with root package name */
    public String f19392k;

    /* renamed from: l  reason: collision with root package name */
    public long f19393l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19394m;
    public ImageModel n;

    static {
        Covode.recordClassIndex(11496);
    }

    public by() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.ROOM_NOTIFY;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}
