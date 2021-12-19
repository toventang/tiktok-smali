package com.ss.android.ugc.aweme.account.n;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.e.c;
import com.bytedance.sdk.a.e.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f65166a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final e f65167b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static String f65168c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f65169d = "";

    public interface a {
        static {
            Covode.recordClassIndex(40065);
        }

        void a();
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(40064);
    }

    public static com.bytedance.sdk.a.e.a a() {
        String str;
        String str2 = f65169d;
        String str3 = f65168c;
        IAccountUserService e2 = cj.f71084b.e();
        l.b(e2, "");
        if (e2.isChildrenMode()) {
            return null;
        }
        com.bytedance.sdk.a.e.a aVar = new com.bytedance.sdk.a.e.a();
        aVar.f43163a = str2;
        aVar.f43165c = str3;
        if (cj.f() != null) {
            User f2 = cj.f();
            l.b(f2, "");
            aVar.f43164b = f2.getNickname();
            if (f2.getAvatarThumb() != null) {
                UrlModel avatarThumb = f2.getAvatarThumb();
                l.b(avatarThumb, "");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = f2.getAvatarThumb();
                    l.b(avatarThumb2, "");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = f2.getAvatarThumb();
                        l.b(avatarThumb3, "");
                        str = avatarThumb3.getUrlList().get(0);
                        aVar.f43166d = str;
                    }
                }
            }
            str = "";
            aVar.f43166d = str;
        }
        f65169d = "";
        f65168c = "";
        return aVar;
    }

    public static void a(String str) {
        l.d(str, "");
        f65168c = str;
    }

    public static void b(String str) {
        l.d(str, "");
        f65169d = str;
    }

    public static void c(String str) {
        l.d(str, "");
        f65166a = str;
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f65170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f65171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f65172c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f65173d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f65174e;

        static {
            Covode.recordClassIndex(40066);
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(com.bytedance.sdk.a.e.a aVar) {
            if (aVar != null) {
                v.a(this.f65170a, this.f65171b.element, 1, 0, this.f65172c, this.f65173d);
            } else {
                v.a(this.f65170a, this.f65171b.element, 0, 0, this.f65172c, this.f65173d);
            }
            a aVar2 = this.f65174e;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(int i2, int i3) {
            v.a(this.f65170a, this.f65171b.element, 0, i2, this.f65172c, this.f65173d);
            a aVar = this.f65174e;
            if (aVar != null) {
                aVar.a();
            }
        }

        b(String str, z.e eVar, String str2, int i2, a aVar) {
            this.f65170a = str;
            this.f65171b = eVar;
            this.f65172c = str2;
            this.f65173d = i2;
            this.f65174e = aVar;
        }
    }

    public static void a(Activity activity, Bundle bundle, a aVar, com.bytedance.sdk.a.e.a aVar2) {
        l.d(aVar2, "");
        if (activity == null || bundle == null) {
            aVar.a();
            return;
        }
        String string = bundle.getString("gms_store_platform");
        if (string == null) {
            string = f65166a;
        }
        l.b(string, "");
        String string2 = bundle.getString("gms_enter_method");
        if (string2 == null) {
            string2 = "";
        }
        l.b(string2, "");
        int i2 = bundle.getInt("gms_use_auto_fill");
        f65166a = "";
        if (!com.ss.android.ugc.aweme.am.a.a()) {
            aVar.a();
            return;
        }
        z.e eVar = new z.e();
        eVar.element = (T) aVar2.f43163a;
        if (cj.f() != null) {
            User f2 = cj.f();
            l.b(f2, "");
            eVar.element = (T) f2.getUid();
        }
        v.a(string, eVar.element, string2);
        d.a().a(activity, aVar2, new b(string, eVar, string2, i2, aVar));
    }

    public static void a(String str, String str2, String str3, com.ss.android.ugc.aweme.account.login.v2.base.c cVar, int i2, String str4) {
        l.d(str2, "");
        l.d(str3, "");
        if (cVar != null) {
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            l.b(arguments, "");
            arguments.putString("gms_store_id", str);
            arguments.putString("gms_store_pwd", str2);
            arguments.putString("gms_store_platform", str3);
            arguments.putInt("gms_use_auto_fill", i2);
            arguments.putString("gms_enter_method", str4);
            cVar.setArguments(arguments);
        }
    }
}
