package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2502a f100918d = new C2502a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f100919a = -1;

    /* renamed from: b  reason: collision with root package name */
    public ai f100920b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a f100921c;

    /* renamed from: e  reason: collision with root package name */
    private final h f100922e = i.a((h.f.a.a) b.f100923a);

    static {
        Covode.recordClassIndex(64558);
    }

    public final List<String> a() {
        return (List) this.f100922e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a$a  reason: collision with other inner class name */
    public static final class C2502a {
        static {
            Covode.recordClassIndex(64559);
        }

        private C2502a() {
        }

        public /* synthetic */ C2502a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100923a = new b();

        static {
            Covode.recordClassIndex(64560);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    public final boolean b() {
        int i2 = this.f100919a;
        if (i2 == 2 || i2 == 3) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "SpotReadState:{" + this.f100920b.getMsgId() + ", " + this.f100919a + ", [" + a() + "]}";
    }

    public final void a(ai aiVar) {
        l.d(aiVar, "");
        this.f100920b = aiVar;
    }

    public a(ai aiVar, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        l.d(aiVar, "");
        l.d(aVar, "");
        this.f100920b = aiVar;
        this.f100921c = aVar;
    }
}
