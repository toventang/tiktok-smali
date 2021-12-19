package com.ss.android.ugc.aweme.utils;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.c.e;
import com.google.gson.f;
import com.ss.android.ugc.aweme.am;
import com.ss.android.ugc.aweme.api.IAppWidgetApi;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;
import com.ss.android.ugc.aweme.model.ChallengeStruct;
import com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static final long f143141a = TimeUnit.HOURS.toMillis(3);

    /* renamed from: b  reason: collision with root package name */
    static final long f143142b = TimeUnit.DAYS.toMillis(2);

    /* renamed from: c  reason: collision with root package name */
    public static final o f143143c = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(93699);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f143148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f143149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f143150c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f143151d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int[] f143152e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int[] f143153f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143154g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Float f143155h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int[] f143156i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int[] f143157j;

        static {
            Covode.recordClassIndex(93701);
        }

        b(Context context, Integer num, String str, Integer num2, int[] iArr, int[] iArr2, h.f.a.a aVar, Float f2, int[] iArr3, int[] iArr4) {
            this.f143148a = context;
            this.f143149b = num;
            this.f143150c = str;
            this.f143151d = num2;
            this.f143152e = iArr;
            this.f143153f = iArr2;
            this.f143154g = aVar;
            this.f143155h = f2;
            this.f143156i = iArr3;
            this.f143157j = iArr4;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AppWidgetStruct b2;
            AppWidgetStruct b3;
            Bitmap bitmap = null;
            if (in.e()) {
                l.d("is kids mode", "");
                Context context = this.f143148a;
                Integer num = this.f143149b;
                String str = this.f143150c;
                Integer num2 = this.f143151d;
                int[] iArr = this.f143152e;
                int[] iArr2 = this.f143153f;
                if (!(num == null || num2 == null || iArr2 == null)) {
                    int length = iArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = iArr2[i2];
                        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), num2.intValue());
                        remoteViews.setImageViewResource(R.id.c2b, R.drawable.ao7);
                        remoteViews.setTextViewText(R.id.f9w, context.getResources().getString(R.string.un));
                        remoteViews.setTextViewText(R.id.f9z, context.getResources().getString(R.string.uh));
                        remoteViews.setTextViewText(R.id.f_j, "");
                        if (iArr != null) {
                            for (int i4 : iArr) {
                                remoteViews.setImageViewBitmap(i4, bitmap);
                            }
                        }
                        Intent a2 = AppWidgetLinkProxyActivity.a.a(context, str);
                        a2.putExtra("extra_jump_type", 3);
                        PendingIntent activity = PendingIntent.getActivity(context, 0, a2, 134217728);
                        l.b(activity, "");
                        remoteViews.setOnClickPendingIntent(R.id.dqe, activity);
                        remoteViews.setOnClickPendingIntent(R.id.c2d, activity);
                        if (num.intValue() != am.f66368b) {
                            remoteViews.setOnClickPendingIntent(R.id.c2b, activity);
                            remoteViews.setOnClickPendingIntent(R.id.f9z, activity);
                            remoteViews.setOnClickPendingIntent(R.id.f9w, activity);
                            if (iArr != null) {
                                for (int i5 : iArr) {
                                    remoteViews.setOnClickPendingIntent(i5, activity);
                                }
                            }
                        }
                        AppWidgetManager.getInstance(context).updateAppWidget(i3, remoteViews);
                        i2++;
                        bitmap = null;
                    }
                }
                h.f.a.a aVar = this.f143154g;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                l.d("not kids mode", "");
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = n.a().getLong("keva_key_last_cache_time", 0);
                long j3 = currentTimeMillis - j2;
                l.d("curTime: " + currentTimeMillis + ", lastCacheTime: " + j2 + ", deltaTime: " + j3, "");
                if (j3 <= 0 || j3 >= o.f143141a || (b3 = n.f143138b.b()) == null) {
                    try {
                        String str2 = this.f143150c;
                        l.d("hashtag", "");
                        l.d(str2, "");
                        r.a("widget_request", new d().a("request_type", "hashtag").a("widget_type", str2).f66730a);
                        T t = ((IAppWidgetApi) com.ss.android.ugc.aweme.api.b.f66445a.getValue()).fetchChallenge(1, n.a().getLong("keva_key_request_cursor", 0), 4).execute().f42630b;
                        l.b(t, "");
                        T t2 = t;
                        n.a().storeLong("keva_key_last_cache_time", System.currentTimeMillis());
                        n.f143137a = t2;
                        n.a().storeString("keva_key_cache_data", new f().b(t2));
                        n.a().storeLong("keva_key_request_cursor", t2.getCursor());
                        for (int i6 : this.f143153f) {
                            o.a(this.f143148a, this.f143149b.intValue(), this.f143150c, i6, this.f143151d.intValue(), this.f143152e, this.f143155h, this.f143156i, this.f143157j, t2);
                        }
                        p.a("hashtag", this.f143150c, 1, 0, "");
                        h.f.a.a aVar2 = this.f143154g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                    } catch (Exception e2) {
                        String str3 = this.f143150c;
                        int a3 = com.bytedance.ies.b.a.a.a(e2, (String[]) null);
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        p.a("hashtag", str3, 0, a3, message);
                        if (j3 > 0 && j3 < o.f143142b && (b2 = n.f143138b.b()) != null) {
                            l.d("long expired cache is valid, use it directly", "");
                            for (int i7 : this.f143153f) {
                                o.a(this.f143148a, this.f143149b.intValue(), this.f143150c, i7, this.f143151d.intValue(), this.f143152e, this.f143155h, this.f143156i, this.f143157j, b2);
                            }
                        }
                        h.f.a.a aVar3 = this.f143154g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                    }
                } else {
                    l.d("cache is valid, use it directly", "");
                    for (int i8 : this.f143153f) {
                        o.a(this.f143148a, this.f143149b.intValue(), this.f143150c, i8, this.f143151d.intValue(), this.f143152e, this.f143155h, this.f143156i, this.f143157j, b3);
                    }
                    h.f.a.a aVar4 = this.f143154g;
                    if (aVar4 != null) {
                        aVar4.invoke();
                    }
                }
            }
            return z.f158842a;
        }
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RemoteViews f143144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f143145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f143146c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f143147d;

        static {
            Covode.recordClassIndex(93700);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            Bitmap bitmap2;
            if (bitmap != null) {
                RemoteViews remoteViews = this.f143144a;
                int[] iArr = this.f143145b;
                if (iArr != null) {
                    bitmap2 = p.a(iArr, bitmap);
                } else {
                    bitmap2 = null;
                }
                remoteViews.setImageViewBitmap(R.id.c2b, bitmap2);
                AppWidgetManager.getInstance(this.f143146c).updateAppWidget(this.f143147d, this.f143144a);
            }
        }

        a(RemoteViews remoteViews, int[] iArr, Context context, int i2) {
            this.f143144a = remoteViews;
            this.f143145b = iArr;
            this.f143146c = context;
            this.f143147d = i2;
        }
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Float f143158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteViews f143159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f143160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int[] f143161d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f143162e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f143163f;

        static {
            Covode.recordClassIndex(93702);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            float f2;
            int width;
            int i2;
            int height;
            MethodCollector.i(14395);
            if (bitmap != null) {
                Float f3 = this.f143158a;
                if (f3 != null) {
                    f2 = f3.floatValue();
                } else {
                    f2 = 1.0f;
                }
                l.d(bitmap, "");
                int i3 = 0;
                if ((((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth()) < f2) {
                    i2 = bitmap.getHeight();
                    width = (int) (((float) i2) / f2);
                    i3 = (bitmap.getWidth() - width) / 2;
                    height = 0;
                } else {
                    width = bitmap.getWidth();
                    i2 = (int) (((float) width) * f2);
                    height = (bitmap.getHeight() - i2) / 2;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, i3, height, width, i2);
                l.b(createBitmap, "");
                this.f143159b.setImageViewBitmap(this.f143160c, p.a(this.f143161d, createBitmap));
                AppWidgetManager.getInstance(this.f143162e).updateAppWidget(this.f143163f, this.f143159b);
                MethodCollector.o(14395);
                return;
            }
            MethodCollector.o(14395);
        }

        c(Float f2, RemoteViews remoteViews, int i2, int[] iArr, Context context, int i3) {
            this.f143158a = f2;
            this.f143159b = remoteViews;
            this.f143160c = i2;
            this.f143161d = iArr;
            this.f143162e = context;
            this.f143163f = i3;
        }
    }

    private static PendingIntent a(Context context, String str, ChallengeStruct challengeStruct) {
        String str2;
        Intent a2 = AppWidgetLinkProxyActivity.a.a(context, str);
        a2.putExtra("extra_jump_type", 1);
        Challenge challenge = challengeStruct.getChallenge();
        if (challenge == null || (str2 = challenge.getCid()) == null) {
            str2 = "";
        }
        a2.putExtra("extra_challenge_id", str2);
        PendingIntent activity = PendingIntent.getActivity(context, 0, a2, 134217728);
        l.b(activity, "");
        return activity;
    }

    private static void a(Context context, int i2, String str, RemoteViews remoteViews, int[] iArr, ChallengeStruct challengeStruct) {
        String str2;
        Aweme aweme;
        if (i2 == am.f66368b) {
            remoteViews.setOnClickPendingIntent(R.id.dqe, a(context, str, challengeStruct));
            return;
        }
        PendingIntent a2 = a(context, str, challengeStruct);
        remoteViews.setOnClickPendingIntent(R.id.c2d, a2);
        remoteViews.setOnClickPendingIntent(R.id.c2b, a2);
        remoteViews.setOnClickPendingIntent(R.id.f9z, a2);
        remoteViews.setOnClickPendingIntent(R.id.f9w, a2);
        if (iArr != null) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr[i3];
                int i6 = i4 + 1;
                Intent a3 = AppWidgetLinkProxyActivity.a.a(context, str);
                a3.putExtra("extra_jump_type", 2);
                Challenge challenge = challengeStruct.getChallenge();
                if (challenge == null || (str2 = challenge.getCid()) == null) {
                    str2 = "";
                }
                a3.putExtra("extra_challenge_id", str2);
                List<Aweme> awemeList = challengeStruct.getAwemeList();
                if (awemeList != null) {
                    aweme = awemeList.get(i4);
                } else {
                    aweme = null;
                }
                a3.putExtra("extra_aweme", aweme);
                PendingIntent activity = PendingIntent.getActivity(context, i5, a3, 134217728);
                l.b(activity, "");
                remoteViews.setOnClickPendingIntent(i5, activity);
                i3++;
                i4 = i6;
            }
        }
    }

    private static void a(Context context, int i2, int i3, RemoteViews remoteViews, int[] iArr, Float f2, ChallengeStruct challengeStruct, int[] iArr2) {
        List<Aweme> awemeList;
        Aweme aweme;
        Video video;
        UrlModel cover;
        List<String> urlList;
        if (i2 != am.f66368b && (awemeList = challengeStruct.getAwemeList()) != null && !awemeList.isEmpty() && iArr != null) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = iArr[i4];
                int i7 = i5 + 1;
                if (i5 < awemeList.size() && (aweme = awemeList.get(i5)) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && !urlList.isEmpty()) {
                    if (iArr2 != null) {
                        String str = urlList.get(0);
                        l.b(str, "");
                        context = context;
                        p.a(context, str, new c(f2, remoteViews, i6, iArr2, context, i3));
                    }
                    i4++;
                    i5 = i7;
                } else {
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void a(Context context, Integer num, Integer num2, int[] iArr, Float f2, int[] iArr2, String str, int[] iArr3, int[] iArr4) {
        a(context, num, num2, iArr, f2, iArr2, str, iArr3, iArr4, (h.f.a.a<z>) null);
    }

    public static void a(Context context, int i2, String str, int i3, int i4, int[] iArr, Float f2, int[] iArr2, int[] iArr3, AppWidgetStruct appWidgetStruct) {
        long j2;
        String str2;
        String str3 = "";
        l.d("AppWidgetId: " + i3 + ", bindData", str3);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i4);
        List<ChallengeStruct> challengeStructList = appWidgetStruct.getChallengeStructList();
        if (challengeStructList != null && !challengeStructList.isEmpty()) {
            List<ChallengeStruct> challengeStructList2 = appWidgetStruct.getChallengeStructList();
            if (challengeStructList2 == null) {
                l.b();
            }
            ChallengeStruct challengeStruct = challengeStructList2.get(0);
            List<String> coverUrlList = challengeStruct.getCoverUrlList();
            if (coverUrlList != null && !coverUrlList.isEmpty()) {
                p.a(context, coverUrlList.get(0), new a(remoteViews, iArr2, context, i3));
            }
            Challenge challenge = challengeStruct.getChallenge();
            if (challenge != null) {
                j2 = challenge.getDisplayCount();
            } else {
                j2 = 0;
            }
            String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
            a.C0730a aVar = new a.C0730a();
            Resources resources = context.getResources();
            l.b(resources, str3);
            com.bytedance.ies.dmt.ui.d.a aVar2 = aVar.a(resources, R.string.aat, a2.toString()).f33382a;
            StringBuilder sb = new StringBuilder("#");
            Challenge challenge2 = challengeStruct.getChallenge();
            if (challenge2 == null || (str2 = challenge2.getChallengeName()) == null) {
                str2 = str3;
            }
            remoteViews.setTextViewText(R.id.f9w, sb.append(str2).toString());
            String desc = challengeStruct.getDesc();
            if (desc != null) {
                str3 = desc;
            }
            remoteViews.setTextViewText(R.id.f9z, str3);
            remoteViews.setTextViewText(R.id.f_j, aVar2);
            a(context, i2, i3, remoteViews, iArr, f2, challengeStruct, iArr3);
            a(context, i2, str, remoteViews, iArr, challengeStruct);
            AppWidgetManager.getInstance(context).updateAppWidget(i3, remoteViews);
        }
    }

    public static void a(Context context, Integer num, Integer num2, int[] iArr, Float f2, int[] iArr2, String str, int[] iArr3, int[] iArr4, h.f.a.a<z> aVar) {
        l.d(context, "");
        l.d(str, "");
        if (num != null && num2 != null && iArr2 != null && iArr2.length != 0) {
            i.b(new b(context, num, str, num2, iArr, iArr2, aVar, f2, iArr3, iArr4), i.f4824a);
        }
    }
}
