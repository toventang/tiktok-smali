package com.ss.android.ugc.aweme.upvote.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f142039a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final h f142040b = i.a((h.f.a.a) a.f142042a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f142041c = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142042a = new a();

        static {
            Covode.recordClassIndex(92830);
        }

        a() {
            super(0);
        }

        private static boolean a() {
            try {
                return SettingsManager.a().a("tt_upvote_detail_panel_refresh_setting", true);
            } catch (Throwable unused) {
                return b.f142039a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(92829);
    }
}
