package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.cn;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final int f95055a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final a f95056b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f95057c = i.a((h.f.a.a) C2286a.f95058a);

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.a$a  reason: collision with other inner class name */
    static final class C2286a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2286a f95058a = new C2286a();

        static {
            Covode.recordClassIndex(60260);
        }

        C2286a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (SettingsManager.a().a("allow_long_video_scrubbing", 0) == a.f95055a) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(60259);
    }

    public static boolean a() {
        if (cn.f89703a) {
            return ((Boolean) f95057c.getValue()).booleanValue();
        }
        if (SettingsManager.a().a("allow_long_video_scrubbing", 0) == f95055a) {
            return true;
        }
        return false;
    }
}
