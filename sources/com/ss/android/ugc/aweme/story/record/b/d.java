package com.ss.android.ugc.aweme.story.record.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.record.ar;

public final class d implements ar {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138184a = new a((byte) 0);

    static {
        Covode.recordClassIndex(90382);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90383);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean b() {
        return l.f115658a.s().a("key_story_default_beauty", false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final Integer a() {
        return Integer.valueOf(l.f115658a.s().a("key_story_default_camera", 0));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final void a(int i2) {
        l.f115658a.s().b("key_story_default_camera", i2);
    }
}
