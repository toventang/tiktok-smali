package com.ss.android.ugc.aweme.tools.music.e.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import h.f.b.l;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f140472b = b.f140475a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f140473c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f140474a;

    public static final class a {
        static {
            Covode.recordClassIndex(91758);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final c f140475a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final b f140476b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(91759);
        }
    }

    static {
        Covode.recordClassIndex(91757);
    }

    public c() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        l.b(applicationService, "");
        this.f140474a = d.a(applicationService.c(), "collect_music", 0);
    }
}
