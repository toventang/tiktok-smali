package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.ss.android.ugc.aweme.sharer.f;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class u extends f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f124559a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f124560b;

    /* renamed from: c  reason: collision with root package name */
    private URL f124561c;

    /* renamed from: d  reason: collision with root package name */
    private String f124562d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f124563e;

    static {
        Covode.recordClassIndex(81851);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "twitter";
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "Twitter";
    }

    @Override // com.ss.android.ugc.aweme.sharer.f
    public final String e() {
        return "com.twitter.android";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81852);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final Intent f() {
        String valueOf;
        URL url = this.f124561c;
        if (url == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(url);
        }
        String a2 = com.a.a("https://twitter.com/intent/tweet?text=%s&url=%s", Arrays.copyOf(new Object[]{a(this.f124560b), a(valueOf)}, 2));
        l.b(a2, "");
        return new Intent("android.intent.action.VIEW", Uri.parse(a2));
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f124564a = new b();

        static {
            Covode.recordClassIndex(81853);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_color_twitter_circle;
            return z.f158842a;
        }
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF8");
            l.b(encode, "");
            return encode;
        } catch (Throwable unused) {
            return "";
        }
    }

    private final Intent c(Context context) {
        Intent d2 = d(context);
        if (d2 != null) {
            return d2;
        }
        return f();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        if (context != null) {
            return c.a(b.f124564a).a(context);
        }
        return null;
    }

    private final Intent d(Context context) {
        boolean z;
        ActivityInfo activityInfo;
        String str;
        Intent intent = new Intent("android.intent.action.SEND");
        StringBuilder sb = new StringBuilder();
        String str2 = this.f124562d;
        if (str2 != null) {
            sb.append(str2);
        }
        URL url = this.f124561c;
        if (url != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(url.toString());
        }
        String str3 = this.f124560b;
        if (str3 != null) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(str3);
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setType("text/plain");
        Uri uri = this.f124563e;
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/*");
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        l.b(queryIntentActivities, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) queryIntentActivities, 10));
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.name);
        }
        ArrayList arrayList2 = arrayList;
        String a2 = com.ss.android.ugc.aweme.sharer.ext.a.b.a();
        if (a2 == null || a2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !arrayList2.contains(a2)) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!(resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo.packageName) == null || !p.b(str, "com.twitter.android", false))) {
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    return intent;
                }
            }
            return null;
        }
        intent.setClassName("com.twitter.android", a2);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        this.f124563e = lVar.f124575b;
        return a(context, c(context));
    }

    @Override // com.ss.android.ugc.aweme.sharer.f, com.ss.android.ugc.aweme.sharer.b
    public final boolean a(com.ss.android.ugc.aweme.sharer.m mVar, Context context) {
        String str;
        String str2 = "";
        l.d(mVar, str2);
        l.d(context, str2);
        if (!TextUtils.isEmpty(mVar.f124581d)) {
            str = mVar.f124581d;
        } else {
            str = mVar.f124582e;
        }
        this.f124560b = str;
        if (!TextUtils.isEmpty(mVar.f124582e)) {
            str2 = mVar.f124582e;
        }
        this.f124562d = str2;
        return a(context, c(context));
    }
}
