package com.bytedance.android.livesdk.manage.b;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.gift.LiveNewAssetsCachePathSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.ugc.live.a.a.a.b;
import com.ss.ugc.live.a.a.c;
import h.f.b.l;
import java.io.File;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static String f18883b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0401a f18884c = new C0401a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f18885a;

    /* renamed from: d  reason: collision with root package name */
    private final String f18886d;

    /* renamed from: com.bytedance.android.livesdk.manage.b.a$a  reason: collision with other inner class name */
    public static final class C0401a {
        static {
            Covode.recordClassIndex(11233);
        }

        private C0401a() {
        }

        public /* synthetic */ C0401a(byte b2) {
            this();
        }
    }

    @Override // com.ss.ugc.live.a.a.a.b
    public final String a() {
        return this.f18886d;
    }

    static {
        String str;
        Covode.recordClassIndex(11232);
        if (LiveNewAssetsCachePathSetting.INSTANCE.getValue()) {
            str = "gift_assets";
        } else {
            str = "assets";
        }
        f18883b = str;
    }

    private static File a(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    @Override // com.ss.ugc.live.a.a.a.b
    public final String a(c cVar) {
        l.d(cVar, "");
        return this.f18886d + File.separator + cVar.f154008e + File.separator;
    }

    public a(Context context) {
        l.d(context, "");
        if (LiveNewAssetsCachePathSetting.INSTANCE.getValue()) {
            StringBuilder sb = new StringBuilder();
            File a2 = a(context);
            l.b(a2, "");
            this.f18886d = sb.append(a2.getAbsolutePath()).append(File.separator).append("gift_assets").toString();
            File dir = context.getDir("assets", 0);
            l.b(dir, "");
            String absolutePath = dir.getAbsolutePath();
            l.b(absolutePath, "");
            this.f18885a = absolutePath;
            return;
        }
        File dir2 = context.getDir("assets", 0);
        l.b(dir2, "");
        String absolutePath2 = dir2.getAbsolutePath();
        l.b(absolutePath2, "");
        this.f18886d = absolutePath2;
        StringBuilder sb2 = new StringBuilder();
        File a3 = a(context);
        l.b(a3, "");
        this.f18885a = sb2.append(a3.getAbsolutePath()).append(File.separator).append("gift_assets").toString();
    }
}
