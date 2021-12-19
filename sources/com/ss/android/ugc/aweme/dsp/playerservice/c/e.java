package com.ss.android.ugc.aweme.dsp.playerservice.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f83415c = new e("dsp_recommend", "dsp_recommend");

    /* renamed from: d  reason: collision with root package name */
    public static final e f83416d = new e("my_music", "my_music");

    /* renamed from: e  reason: collision with root package name */
    public static final e f83417e = new e("collection_recommend", "collection_recommend");

    /* renamed from: f  reason: collision with root package name */
    public static final e f83418f = new e("others_music", "others_music");

    /* renamed from: g  reason: collision with root package name */
    public static final e f83419g = new e("_empty", "_empty_queue");

    /* renamed from: h  reason: collision with root package name */
    public static final a f83420h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f83421a;

    /* renamed from: b  reason: collision with root package name */
    public final String f83422b;

    public static final class a {
        static {
            Covode.recordClassIndex(52050);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        return (this.f83421a.hashCode() * 31) + this.f83422b.hashCode();
    }

    static {
        Covode.recordClassIndex(52049);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.playerservice.enums.PlayableQueueType");
        e eVar = (e) obj;
        if (!(!l.a((Object) this.f83421a, (Object) eVar.f83421a)) && !(!l.a((Object) this.f83422b, (Object) eVar.f83422b))) {
            return true;
        }
        return false;
    }

    private e(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f83421a = str;
        this.f83422b = str2;
    }
}
