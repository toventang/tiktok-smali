package com.ss.android.ugc.aweme.im.sdk.notification.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.notification.b;
import h.f.b.l;

public final class i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f102861f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final j f102862a;

    /* renamed from: b  reason: collision with root package name */
    public final ai f102863b;

    /* renamed from: c  reason: collision with root package name */
    public final l f102864c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f102865d;

    /* renamed from: e  reason: collision with root package name */
    public final b f102866e;

    static {
        Covode.recordClassIndex(65950);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65951);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "MessageNotification(message=" + this.f102863b + ", property=" + this.f102864c + ')';
    }

    private i(j jVar, ai aiVar, l lVar, Integer num, b bVar) {
        l.d(jVar, "");
        this.f102862a = jVar;
        this.f102863b = aiVar;
        this.f102864c = lVar;
        this.f102865d = num;
        this.f102866e = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, ai aiVar, l lVar, Integer num, b bVar, int i2) {
        this(jVar, (i2 & 2) != 0 ? null : aiVar, (i2 & 4) != 0 ? null : lVar, (i2 & 8) != 0 ? null : num, (i2 & 16) == 0 ? bVar : null);
    }
}
