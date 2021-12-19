package com.bytedance.android.live;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.utils.adapter.FeedItemTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.d;
import com.google.gson.f;
import com.google.gson.g;
import java.lang.reflect.Type;

public final class e {
    static {
        Covode.recordClassIndex(4883);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f9627a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f9628b;

        /* renamed from: c  reason: collision with root package name */
        public static final f f9629c = new f();

        static {
            Covode.recordClassIndex(4884);
            g gVar = new g();
            gVar.f54712b = d.LOWER_CASE_WITH_UNDERSCORES;
            g a2 = gVar.a((Type) Room.class, (Object) new RoomTypeAdapter()).a((Type) FeedItem.class, (Object) new FeedItemTypeAdapter()).a((Type) Boolean.class, (Object) new com.bytedance.android.livesdk.model.utils.adapter.a()).a((Type) Boolean.TYPE, (Object) new com.bytedance.android.livesdk.model.utils.adapter.a());
            f9627a = a2;
            f9628b = a2.b();
        }
    }
}
