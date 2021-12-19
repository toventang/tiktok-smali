package com.ss.android.ugc.aweme.sharer.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final String f124506b = "com.nhn.android.appstore";

    /* renamed from: c  reason: collision with root package name */
    public static final String f124507c = "market://details?id=com.nhn.android.blog";

    /* renamed from: d  reason: collision with root package name */
    public static final String f124508d = "appstore://store?version=7&action=view&packageName=com.nhn.android.blog";

    /* renamed from: e  reason: collision with root package name */
    public static final String f124509e = "naverblog";

    /* renamed from: f  reason: collision with root package name */
    public static final String f124510f = "write";

    /* renamed from: g  reason: collision with root package name */
    public static final String f124511g = "version";

    /* renamed from: h  reason: collision with root package name */
    public static final String f124512h = "title";

    /* renamed from: i  reason: collision with root package name */
    public static final String f124513i = "content";

    /* renamed from: j  reason: collision with root package name */
    public static final String f124514j = "imageUrls";

    /* renamed from: k  reason: collision with root package name */
    public static final String f124515k = "videoUrls";

    /* renamed from: l  reason: collision with root package name */
    public static final String f124516l = "ogTagUrls";

    /* renamed from: m  reason: collision with root package name */
    public static final String f124517m = "tags";
    public static final b n = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f124518a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124519a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(81772);
        }

        public static void a(Uri.Builder builder, String str, List<String> list) {
            if (list != null) {
                builder.appendQueryParameter(str, new JSONArray((Collection) list).toString());
            }
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81773);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(81771);
    }

    public c(Context context) {
        l.d(context, "");
        this.f124518a = context;
    }

    public final boolean a(String str) {
        try {
            if (this.f124518a.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }
}
