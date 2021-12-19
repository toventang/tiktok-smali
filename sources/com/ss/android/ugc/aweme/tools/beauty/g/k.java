package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.service.e;
import h.f.b.l;
import java.util.List;

public class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final Keva f138998a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f138999c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final String f139000b;

    public static final class a {
        static {
            Covode.recordClassIndex(90913);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            return str + str2 + "_key_selected_album_" + str3;
        }

        public static String a(String str, String str2, String str3, String str4) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            return str + str2 + "_composer_beauty_manual_" + str3 + '_' + str4;
        }
    }

    public static final class b extends com.google.gson.b.a<List<BeautyCategory>> {
        static {
            Covode.recordClassIndex(90914);
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void a(List<BeautyCategory> list) {
        if (list == null) {
            f138998a.erase(this.f139000b + "key_beauty_panel_data");
        } else {
            f138998a.storeString(this.f139000b + "key_beauty_panel_data", com.ss.android.ugc.aweme.tools.beauty.h.b.a().b(list));
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public boolean a() {
        return f138998a.getBoolean("key_disable_all_beauty", false);
    }

    static {
        Covode.recordClassIndex(90912);
        Keva repo = Keva.getRepo("ulike_repo");
        l.b(repo, "");
        f138998a = repo;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final int c() {
        if (!com.ss.android.ugc.aweme.tools.beauty.e.a.f138916f) {
            return f138998a.getInt(this.f139000b + "key_detect_female_count", 0);
        }
        com.ss.android.ugc.aweme.dependence.beauty.a.b("getDetectFemaleCount no work by BeautyClearFemaleRecognize is true. return 0");
        return 0;
    }

    public final boolean d() {
        Keva keva = f138998a;
        boolean z = keva.getBoolean(this.f139000b + "key_need_face_detect", false);
        if (z) {
            keva.storeBoolean(this.f139000b + "key_need_face_detect", false);
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final List<BeautyCategory> b() {
        try {
            return (List) com.ss.android.ugc.aweme.tools.beauty.h.b.a().a(f138998a.getString(this.f139000b + "key_beauty_panel_data", null), new b().type);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public void a(boolean z) {
        f138998a.storeBoolean("key_disable_all_beauty", z);
    }

    public k(String str) {
        l.d(str, "");
        this.f139000b = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final String a(com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(aVar, "");
        return f138998a.getString(this.f139000b + aVar.getFlag() + "_key_selected_category", null);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void a(int i2) {
        if (com.ss.android.ugc.aweme.tools.beauty.e.a.f138916f) {
            com.ss.android.ugc.aweme.dependence.beauty.a.b("saveDetectFemaleCount no work by BeautyClearFemaleRecognize is true.");
        } else {
            f138998a.storeInt(this.f139000b + "key_detect_female_count", i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void b(boolean z) {
        if (z) {
            Keva keva = f138998a;
            if (!keva.getBoolean(this.f139000b + "key_need_face_detect", false)) {
                keva.storeBoolean(this.f139000b + "key_need_face_detect", true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final String b(com.ss.android.ugc.aweme.tools.beauty.a aVar, String str) {
        l.d(aVar, "");
        return f138998a.getString(this.f139000b + aVar.getFlag() + "_key_selected_beauty_" + str, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final String a(com.ss.android.ugc.aweme.tools.beauty.a aVar, ComposerBeauty composerBeauty) {
        l.d(aVar, "");
        l.d(composerBeauty, "");
        return f138998a.getString(a.a(this.f139000b, aVar.getFlag(), composerBeauty.getEffect().getResourceId()), null);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void b(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
        if (composerBeauty.getExtra().getDisableCache()) {
            f138998a.storeString(a.a(this.f139000b, aVar.getFlag(), composerBeauty.getParentResId()), "-1");
        } else {
            f138998a.storeString(a.a(this.f139000b, aVar.getFlag(), composerBeauty.getParentResId()), composerBeauty.getEffect().getResourceId());
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void a(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
        if (composerBeauty.getExtra().getDisableCache()) {
            f138998a.storeString(this.f139000b + aVar.getFlag() + "_key_selected_beauty_" + composerBeauty.getCategoryId(), "-1");
        } else {
            f138998a.storeString(this.f139000b + aVar.getFlag() + "_key_selected_beauty_" + composerBeauty.getCategoryId(), composerBeauty.getEffect().getEffectId());
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void a(com.ss.android.ugc.aweme.tools.beauty.a aVar, String str) {
        l.d(aVar, "");
        f138998a.storeString(this.f139000b + aVar.getFlag() + "_key_selected_category", str);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final boolean b(String str, boolean z) {
        l.d(str, "");
        return f138998a.getBoolean(this.f139000b + "key_switch" + str, true);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public final void a(String str, boolean z) {
        l.d(str, "");
        f138998a.storeBoolean(this.f139000b + "key_switch" + str, z);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public float a(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar, String str, float f2) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
        return f138998a.getFloat(a.a(this.f139000b, aVar.getFlag(), composerBeauty.getEffect().getResourceId(), str), f2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e
    public void b(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar, String str, float f2) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
        String a2 = a.a(this.f139000b, aVar.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        f138998a.storeFloat(a2, f2);
        com.ss.android.ugc.aweme.dependence.beauty.a.c("saveBeautyTagValue key: " + a2 + " val: " + f2);
    }
}
