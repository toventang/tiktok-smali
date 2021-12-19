package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f93072a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final h f93073b = i.a((h.f.a.a) a.f93075a);

    /* renamed from: c  reason: collision with root package name */
    public static final k f93074c = new k();

    private k() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93075a = new a();

        static {
            Covode.recordClassIndex(59026);
        }

        a() {
            super(0);
        }

        private static boolean a() {
            try {
                return SettingsManager.a().a("enable_new_feed_back_card", true);
            } catch (Throwable unused) {
                return k.f93072a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(59025);
    }
}
