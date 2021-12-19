package com.ss.android.ugc.awemepushlib.manager;

import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.awemepushlib.interaction.g;
import com.ss.android.ugc.awemepushlib.interaction.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MessageShowHandler {

    /* renamed from: a  reason: collision with root package name */
    static boolean f145483a = true;

    /* renamed from: b  reason: collision with root package name */
    static NotificationManager f145484b;

    /* renamed from: c  reason: collision with root package name */
    static final List<a> f145485c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f145486d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    static final Comparator<a> f145487e = new Comparator<a>() {
        /* class com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.AnonymousClass2 */

        static {
            Covode.recordClassIndex(95134);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3.f145496b == aVar4.f145496b) {
                return 0;
            }
            if (aVar3.f145496b > aVar4.f145496b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static final Object f145488f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f145489g = false;

    /* renamed from: h  reason: collision with root package name */
    private static DownloadImageApi f145490h;

    /* renamed from: i  reason: collision with root package name */
    private static WeakHandler f145491i = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.AnonymousClass1 */

        static {
            Covode.recordClassIndex(95133);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    public interface DownloadImageApi {
        static {
            Covode.recordClassIndex(95136);
        }

        @h
        com.bytedance.retrofit2.b<TypedInput> downloadImageWithUrl(@ag String str);
    }

    private static void a(Intent intent) {
        if (intent != null) {
            intent.putExtra("from_notification", true);
            String uuid = UUID.randomUUID().toString();
            f145486d.add(uuid);
            intent.putExtra("from_notification_uuid", uuid);
        }
    }

    public static void a(Context context, String str, int i2) {
        com.ss.android.ugc.awemepushlib.c.b from;
        if (!m.a(str) && (from = com.ss.android.ugc.awemepushlib.c.b.from(str)) != null && !AwemeRedBadgerManager.f145477b.a(context, from)) {
            i.a(from, i2);
            i.a(from.openUrl, true);
            from.extra.turn_screen_on = false;
            a(context, i2, from);
            a.a().a(System.currentTimeMillis());
        }
    }

    private static boolean a(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("need_filter_uid");
        if (queryParameter == null) {
            queryParameter = "0";
        }
        if (queryParameter.equals("0")) {
            return false;
        }
        try {
            String secUid = AccountService.a().e().getCurUser().getSecUid();
            String queryParameter2 = parse.getQueryParameter("sec_target_uid");
            if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.equals(secUid, queryParameter2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private static boolean a(Context context, com.ss.android.ugc.awemepushlib.c.b bVar, int i2, JSONObject jSONObject) {
        i.a(context, "news_achieve", bVar.id, (long) i2, jSONObject);
        if (bVar.isPing == 1) {
            return true;
        }
        if (m.a(bVar.text)) {
            if (bVar.pass_through == 0) {
                a(context);
            }
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar.pass_through == 0 || bVar.filter == 0 || !a.a().a(bVar.id, currentTimeMillis)) {
            return false;
        }
        Logger.debug();
        i.a(context, "news_forbid", bVar.id, 2, new JSONObject[0]);
        com.bytedance.ies.f.a.a();
        return true;
    }

    private static void a(com.ss.android.ugc.awemepushlib.c.b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.extra.notificationChannelId)) {
            bVar.extra.notificationChannelId = g.a(bVar.extra.notificationChannelId, bVar.soundType);
        }
    }

    private static void a(String str, String str2, String str3, Bitmap bitmap, int i2, String str4) {
        JSONObject a2 = new com.ss.android.ugc.aweme.app.f.c().a("content", str2).a("title", str).a("imageUrl", str3).a("errorMsg", str4).a("imageType", String.valueOf(i2)).a();
        if (bitmap != null) {
            com.bytedance.apm.b.a("aweme_push_image_load_error_rate", 0, a2);
        } else if (TextUtils.isEmpty(str4) || !str4.contains("network not available")) {
            com.bytedance.apm.b.a("aweme_push_image_load_error_rate", 1, a2);
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f145497a;

        static {
            Covode.recordClassIndex(95138);
        }

        public final void run() {
            Context a2 = d.a();
            if (a2 != null) {
                try {
                    MessageShowHandler.a(a2, this.f145497a);
                } catch (Exception unused) {
                }
            }
        }

        private b(String str) {
            this.f145497a = str;
        }

        /* synthetic */ b(String str, byte b2) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(95132);
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f145498a;

        static {
            Covode.recordClassIndex(95139);
        }

        public final void run() {
            String[] strArr = this.f145498a;
            if (strArr != null && strArr.length > 0) {
                try {
                    String str = strArr[0];
                    String str2 = strArr[1];
                    String str3 = strArr[2];
                    String str4 = strArr[3];
                    if (!TextUtils.isEmpty(str)) {
                        Logger.debug();
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("did", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("id", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("url", str4);
                        }
                        if ("success".equals(new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), NetworkUtils.e.GZIP, "application/json")).optString("message"))) {
                            Logger.debug();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        c(String[] strArr) {
            this.f145498a = strArr;
        }
    }

    private static void a(Context context) {
        if (context != null) {
            try {
                Intent a2 = f.a(context, context.getPackageName());
                if (a2 != null) {
                    a2.addFlags(268435456);
                    a(a2);
                    a(context, a2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static Bitmap b(String str) {
        MethodCollector.i(7716);
        if (f145490h == null) {
            f145490h = (DownloadImageApi) RetrofitFactory.a().b(str).d().a(DownloadImageApi.class);
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(f145490h.downloadImageWithUrl(str).execute().f42630b.in());
            MethodCollector.o(7716);
            return decodeStream;
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(7716);
            return null;
        }
    }

    private static void b(Context context) {
        String string;
        MethodCollector.i(7872);
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (f145488f) {
                try {
                    string = com.ss.android.ugc.aweme.bf.d.a(context, "app_notify_info", 0).getString("notify_list", null);
                } catch (Throwable th) {
                    MethodCollector.o(7872);
                    throw th;
                }
            }
            if (!m.a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    long optLong = jSONObject.optLong("time", 0);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new a((long) optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                List<a> list = f145485c;
                list.clear();
                list.addAll(arrayList);
                MethodCollector.o(7872);
                return;
            } catch (Exception unused2) {
            }
        }
        MethodCollector.o(7872);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f145495a;

        /* renamed from: b  reason: collision with root package name */
        public long f145496b;

        static {
            Covode.recordClassIndex(95137);
        }

        a(long j2, long j3) {
            this.f145495a = j2;
            this.f145496b = j3;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(7622);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(7622);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, String str) {
        MethodCollector.i(7819);
        synchronized (f145488f) {
            try {
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(context, "app_notify_info", 0).edit();
                edit.putString("notify_list", str);
                edit.commit();
            } finally {
                MethodCollector.o(7819);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(final android.content.Context r16, final int r17, final com.ss.android.ugc.awemepushlib.c.b r18) {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.a(android.content.Context, int, com.ss.android.ugc.awemepushlib.c.b):void");
    }

    public static void a(Context context, int i2, String str, int i3) {
        if (context != null && str != null) {
            try {
                if (a.a().d(context) && !TextUtils.isEmpty(str)) {
                    a(context, str, i3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static Intent a(Context context, int i2, com.ss.android.ugc.awemepushlib.c.b bVar, int i3) {
        Intent intent;
        if (i3 == 2) {
            try {
                Intent intent2 = new Intent();
                try {
                    intent2.setPackage(context.getPackageName());
                    intent = intent2;
                } catch (Throwable unused) {
                    return intent2;
                }
            } catch (Throwable unused2) {
                return null;
            }
        } else {
            Intent a2 = com.ss.android.ugc.awemepushlib.c.a.a(context, bVar);
            if (a2 == null) {
                return null;
            }
            try {
                a2.addFlags(268435456);
                intent = a2;
            } catch (Throwable unused3) {
                return a2;
            }
        }
        a(intent);
        boolean z = true;
        if (i3 == 0) {
            intent.putExtra("msg_from", 1);
        } else if (i3 == 1) {
            intent.putExtra("msg_from", 2);
        }
        intent.putExtra("msg_id", bVar.id);
        intent.putExtra("message_from", i2);
        if (!m.a(bVar.extra.toJsonString())) {
            intent.putExtra("message_extra", bVar.extra.toJsonString());
        }
        if (!(bVar.extra.activeClickValid == 1 || com.bytedance.ies.abmock.b.a().a(true, "cancel_other_push", 0) == 1)) {
            z = false;
        }
        intent.putExtra("clear_all_notifications", z);
        intent.putExtra("imageType", bVar.imageType);
        return intent;
    }

    static final /* synthetic */ Object a(Bitmap[] bitmapArr, com.ss.android.ugc.awemepushlib.c.b bVar, Context context, Bitmap[] bitmapArr2, int i2) {
        String str;
        boolean z;
        try {
            bitmapArr[0] = b(bVar.imageUrl);
            if (bitmapArr[0] == null) {
                bitmapArr[0] = b(bVar.imageUrl);
                com.ss.android.ugc.awemepushlib.f.c cVar = new com.ss.android.ugc.awemepushlib.f.c();
                if (bitmapArr[0] != null) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.f145395a.put("retrySuccess", Boolean.valueOf(z));
                com.ss.android.ugc.awemepushlib.interaction.i.a(context, "push_image_retry", 0, 0, cVar.a());
            }
            if (!TextUtils.isEmpty(bVar.extra.largeModeIconUrl)) {
                bitmapArr2[0] = b(bVar.extra.largeModeIconUrl);
            }
            String str2 = bVar.title;
            String str3 = bVar.text;
            String str4 = bVar.imageUrl;
            Bitmap bitmap = bitmapArr[0];
            int i3 = bVar.imageType;
            if (bitmapArr[0] == null) {
                str = "imageUrlbitmap==null";
            } else {
                str = "";
            }
            a(str2, str3, str4, bitmap, i3, str);
        } catch (Exception e2) {
            a(bVar.title, bVar.text, bVar.imageUrl, null, bVar.imageType, Log.getStackTraceString(e2));
            a(context, (Bitmap) null, (Bitmap) null, i2, bVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (com.ss.android.ugc.aweme.utils.d.c.f142797a == 1) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r2 == 1) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ad A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01af A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b8 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bd A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0 A[ADDED_TO_REGION, Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, Catch:{ Exception -> 0x01cd }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r21, android.graphics.Bitmap r22, android.graphics.Bitmap r23, int r24, com.ss.android.ugc.awemepushlib.c.b r25) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler.a(android.content.Context, android.graphics.Bitmap, android.graphics.Bitmap, int, com.ss.android.ugc.awemepushlib.c.b):void");
    }
}
