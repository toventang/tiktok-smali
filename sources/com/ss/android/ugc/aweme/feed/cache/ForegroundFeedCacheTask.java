package com.ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.video.preload.s;
import h.f.b.l;
import java.util.List;

public final class ForegroundFeedCacheTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f92682a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ae f92683b;

    static {
        Covode.recordClassIndex(58781);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(58782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return this.f92683b;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public ForegroundFeedCacheTask(ae aeVar) {
        l.d(aeVar, "");
        this.f92683b = aeVar;
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92684a = new b();

        static {
            Covode.recordClassIndex(58783);
        }

        b() {
        }

        @Override // b.g
        public final Object then(i<Void> iVar) {
            com.ss.android.ugc.aweme.video.preload.i b2 = s.b();
            if (b2 != null) {
                b2.a(i.f92735c);
            }
            new f.c().b((w) new ForegroundFeedCacheTask(ae.IDLE)).a();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (s.b() == null || !s.b().g()) {
            return;
        }
        if (this.f92683b == ae.IDLE) {
            e.o.a(false);
        } else if (this.f92683b == ae.BOOT_FINISH) {
            i.a(180000).a(b.f92684a, i.f4826c, null);
        }
    }
}
