package com.ss.android.ugc.aweme.emoji.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f89099a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f89100b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f89101c = i.a((h.f.a.a) C2152a.f89102a);

    public static boolean a() {
        return ((Boolean) f89101c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.a.a$a  reason: collision with other inner class name */
    static final class C2152a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2152a f89102a = new C2152a();

        static {
            Covode.recordClassIndex(56033);
        }

        C2152a() {
            super(0);
        }

        private static boolean a() {
            try {
                return SettingsManager.a().a("im_emoji_compat_text_view_enable", false);
            } catch (Throwable unused) {
                return a.f89099a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(56032);
    }
}
