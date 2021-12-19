package com.ss.android.ugc.aweme.ufr;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;
import java.util.NoSuchElementException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f141660a = new c();

    public static final class a implements com.ss.android.ugc.aweme.friends.c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141661a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(92580);
        }

        @Override // com.ss.android.ugc.aweme.friends.c
        public final boolean b() {
            try {
                if (androidx.core.content.b.a(d.a(), "android.permission.READ_CONTACTS") != -1) {
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.c
        public final boolean c() {
            if (!a() || !b()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.friends.c
        public final boolean a() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings == null) {
                return false;
            }
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }

        public static void a(boolean z) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings != null) {
                for (T t : socialPlatformSettings) {
                    if (t.getSocialPlatform() == 1) {
                        t.setSyncStatus(z);
                        g2.forceSave();
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.friends.d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141662a = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(92581);
        }

        private static Keva c() {
            Keva repo = Keva.getRepo("tiktok_ufr_cache:facebook");
            l.b(repo, "");
            return repo;
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final boolean b() {
            if (!a()) {
                return false;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            if (!TextUtils.isEmpty(a(curUser.getUid()))) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final boolean a() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings == null) {
                return false;
            }
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final void b(String str) {
            if (!TextUtils.isEmpty(str)) {
                c().erase(str);
                c().erase(l.a(str, (Object) "expiry_date_in_millis"));
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final long c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return c().getLong(l.a(str, (Object) "facebook_upload_timer"), -1);
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final long d(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return c().getLong(l.a(str, (Object) "expiry_date_in_millis"), -1);
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final String a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            float currentTimeMillis = ((float) System.currentTimeMillis()) / 1000.0f;
            long j2 = c().getLong(l.a(str, (Object) "expiry_date_in_millis"), -1);
            if (currentTimeMillis <= 0.0f) {
                return "";
            }
            if (((float) j2) > currentTimeMillis) {
                str2 = c().getString(str, "");
            } else {
                str2 = "";
            }
            l.b(str2, "");
            return str2;
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final void a(boolean z) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            l.b(curUser, "");
            List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
            if (socialPlatformSettings != null) {
                for (T t : socialPlatformSettings) {
                    if (t.getSocialPlatform() == 2) {
                        t.setSyncStatus(z);
                        g2.forceSave();
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final void a(String str, long j2) {
            if (!TextUtils.isEmpty(str)) {
                c().storeLong(l.a(str, (Object) "facebook_upload_timer"), j2);
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.d
        public final void a(String str, String str2, long j2) {
            l.d(str2, "");
            if (!TextUtils.isEmpty(str)) {
                c().storeString(str, str2);
                c().storeLong(l.a(str, (Object) "expiry_date_in_millis"), j2 / 1000);
            }
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(92579);
    }
}
