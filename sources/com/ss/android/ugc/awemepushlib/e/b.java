package com.ss.android.ugc.awemepushlib.e;

import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Keva f145386a = Keva.getRepo("push_video_preload");

    /* renamed from: b  reason: collision with root package name */
    private static final List<a> f145387b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static int f145388c = 10;

    /* renamed from: d  reason: collision with root package name */
    private static final Comparator<a> f145389d = new Comparator<a>() {
        /* class com.ss.android.ugc.awemepushlib.e.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95065);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3.f145385b == aVar4.f145385b) {
                return 0;
            }
            if (aVar3.f145385b > aVar4.f145385b) {
                return -1;
            }
            return 1;
        }
    };

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f145390a;

        static {
            Covode.recordClassIndex(95066);
        }

        public final void run() {
            if (d.a() != null) {
                try {
                    b.f145386a.storeString("preload_items", this.f145390a);
                } catch (Exception unused) {
                }
            }
        }

        private a(String str) {
            this.f145390a = str;
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(95064);
    }

    public static int a(long j2) {
        try {
            String string = f145386a.getString("preload_items", "");
            if (!m.a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (j2 == jSONArray.getJSONObject(i2).optLong("id", 0)) {
                        return 1;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static boolean a(String str) {
        String str2;
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        boolean contains = str.contains("aweme/push_detail");
        if (!"aweme".equals(parse.getHost())) {
            return false;
        }
        try {
            str2 = parse.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str2 = "";
        }
        if ("click_push_recommend".equals(str2) || "click_push_newvideo".equals(str2) || "click_push_ops".equals(str2) || "click_push_commentvideo".equals(str2) || "click_push_commentvideo_reply".equals(str2) || contains) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8 A[Catch:{ Exception -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da A[Catch:{ Exception -> 0x00ff }, LOOP:2: B:42:0x00d4->B:44:0x00da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object a(com.ss.android.ugc.awemepushlib.c.b r15) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.e.b.a(com.ss.android.ugc.awemepushlib.c.b):java.lang.Object");
    }
}
