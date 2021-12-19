package com.ss.ttvideoengine.l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.s.j;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, d.e> f153058a;

    static {
        Covode.recordClassIndex(101709);
    }

    /* renamed from: com.ss.ttvideoengine.l.a$a  reason: collision with other inner class name */
    public static class C4071a {

        /* renamed from: a  reason: collision with root package name */
        public static a f153059a = new a((byte) 0);

        static {
            Covode.recordClassIndex(101710);
        }
    }

    private a() {
        this.f153058a = new ConcurrentHashMap<>();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final d.e a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f153058a.get(str);
        }
        j.e("MediaTaskCenter", "[preload] get, param is invalid key is null");
        return null;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            j.e("MediaTaskCenter", "[preload] remove, param is invalid key is null");
        } else {
            this.f153058a.remove(str);
        }
    }

    public final void a(String str, d.e eVar) {
        if (TextUtils.isEmpty(str) || eVar == null) {
            j.e("MediaTaskCenter", "[preload] param is invalid");
        } else {
            this.f153058a.put(str, eVar);
        }
    }
}
