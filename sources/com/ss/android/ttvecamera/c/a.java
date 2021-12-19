package com.ss.android.ttvecamera.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Integer, EnumC1339a> f61456d;

    /* renamed from: a  reason: collision with root package name */
    public List<b> f61457a;

    /* renamed from: b  reason: collision with root package name */
    public d f61458b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61459c;

    public interface d {
        static {
            Covode.recordClassIndex(37836);
        }

        c a(EnumC1339a aVar);

        void a(List<b> list);
    }

    public final void a() {
        this.f61458b.a(this.f61457a);
        this.f61457a.clear();
    }

    static {
        Covode.recordClassIndex(37832);
        HashMap hashMap = new HashMap();
        f61456d = hashMap;
        hashMap.put(8, EnumC1339a.DEPTH_OUTPUT);
        hashMap.put(1, EnumC1339a.MANUAL_3A);
        hashMap.put(11, EnumC1339a.LOGICAL_MULTI_CAMERA);
    }

    /* renamed from: com.ss.android.ttvecamera.c.a$a  reason: collision with other inner class name */
    public enum EnumC1339a {
        DEPTH_OUTPUT,
        PREVIEW_SIZE,
        FPS_RANGE,
        MANUAL_3A,
        HIGH_SPEED_VIDEO_FPS_RANGE,
        SUPPORT_APERTURES,
        LOGICAL_MULTI_CAMERA;

        static {
            Covode.recordClassIndex(37833);
        }
    }

    public enum c {
        UNKNOWN,
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING;

        static {
            Covode.recordClassIndex(37835);
        }
    }

    public final c a(EnumC1339a aVar) {
        return this.f61458b.a(aVar);
    }

    public final void a(b bVar) {
        List<b> list = this.f61457a;
        if (list != null) {
            list.add(bVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public EnumC1339a f61461a;

        /* renamed from: b  reason: collision with root package name */
        public c f61462b;

        /* renamed from: c  reason: collision with root package name */
        public Object f61463c;

        static {
            Covode.recordClassIndex(37834);
        }

        public b(EnumC1339a aVar, c cVar, Object obj) {
            this.f61461a = aVar;
            this.f61462b = cVar;
            this.f61463c = obj;
        }
    }
}
