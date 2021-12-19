package com.ss.android.ugc.aweme.livewallpaper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.service.wallpaper.WallpaperService;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.experiment.hm;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.d.c;
import com.ss.android.ugc.aweme.livewallpaper.f.e;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.f.h;
import com.ss.android.ugc.aweme.livewallpaper.f.i;
import com.ss.android.ugc.aweme.livewallpaper.f.j;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class AmeLiveWallpaper extends WallpaperService implements a.AbstractC2787a {

    /* renamed from: a  reason: collision with root package name */
    public LiveWallPaperBean f108708a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f108709b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private ContentResolver f108710c;

    /* renamed from: d  reason: collision with root package name */
    private e f108711d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f108712e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private SimpleDateFormat f108713f = new SimpleDateFormat("yyyy-MM-dd");

    static {
        Covode.recordClassIndex(69652);
    }

    private void c() {
        this.f108712e.removeMessages(1);
    }

    public WallpaperService.Engine onCreateEngine() {
        i.a("AmeLiveWallpaper", "AmeLiveWallpaper onCreateEngine: service = ".concat(String.valueOf(this)));
        b bVar = new b(this, (byte) 0);
        this.f108709b.add(bVar);
        return bVar;
    }

    public void onDestroy() {
        i.a("AmeLiveWallpaper", "onDestroy: service = ".concat(String.valueOf(this)));
        c();
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        i.a("AmeLiveWallpaper", "AmeLiveWallpaper onCreate");
        this.f108710c = getContentResolver();
        this.f108711d = (e) com.ss.android.ugc.aweme.base.b.a.e.a(d.a(), e.class);
        c();
        a();
    }

    public final void a() {
        if (!this.f108713f.format(new Date(System.currentTimeMillis())).equals(this.f108713f.format(Long.valueOf(h.c())))) {
            h.h();
            String[] b2 = h.b();
            if (b2 == null || b2.length <= 0) {
                h.a(new String[]{new StringBuilder().append(System.currentTimeMillis()).toString()});
            } else {
                if (!this.f108713f.format(new Date(Long.parseLong(b2[b2.length - 1]))).equals(this.f108713f.format(new Date(System.currentTimeMillis())))) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(b2));
                    arrayList.add(new StringBuilder().append(System.currentTimeMillis()).toString());
                    h.a((String[]) arrayList.toArray(new String[0]));
                }
            }
        }
        this.f108712e.sendEmptyMessageDelayed(1, TimeUnit.HOURS.toMillis((long) h.d()));
    }

    public final void b() {
        ContentResolver contentResolver;
        ContentResolver contentResolver2 = this.f108710c;
        if (contentResolver2 != null) {
            this.f108708a = c.a(contentResolver2.getType(WallPaperDataProvider.f108722f));
        }
        if (this.f108708a == null) {
            this.f108708a = LiveWallPaperBean.buildEmptyBean();
        }
        try {
            if (TextUtils.isEmpty(this.f108708a.getVideoPath())) {
                this.f108708a.setVideoPath(this.f108711d.c(""));
            }
            if (!com.ss.android.ugc.aweme.video.e.b(this.f108708a.getVideoPath()) && (contentResolver = this.f108710c) != null) {
                this.f108708a.setVideoPath(contentResolver.getType(WallPaperDataProvider.f108723g));
            }
            com.a.a("current video path: %s", new Object[]{this.f108708a.getVideoPath()});
            if (this.f108708a.getWidth() <= 0) {
                this.f108708a.setWidth(this.f108711d.a());
            }
            if (this.f108708a.getHeight() <= 0) {
                this.f108708a.setHeight(this.f108711d.b());
            }
            if (TextUtils.isEmpty(this.f108708a.getSource())) {
                this.f108708a.setSource(this.f108711d.e(""));
            }
        } catch (Exception unused) {
        }
    }

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<AmeLiveWallpaper> f108714a;

        static {
            Covode.recordClassIndex(69653);
        }

        public a(AmeLiveWallpaper ameLiveWallpaper) {
            this.f108714a = new WeakReference<>(ameLiveWallpaper);
        }

        public final void handleMessage(Message message) {
            AmeLiveWallpaper ameLiveWallpaper;
            if (message.what == 1 && (ameLiveWallpaper = this.f108714a.get()) != null) {
                ameLiveWallpaper.a();
            }
        }
    }

    class b extends WallpaperService.Engine {

        /* renamed from: a  reason: collision with root package name */
        final a f108715a;

        static {
            Covode.recordClassIndex(69654);
        }

        private static Context a(AmeLiveWallpaper ameLiveWallpaper) {
            Context applicationContext = ameLiveWallpaper.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.onSurfaceDestroyed(surfaceHolder);
            this.f108715a.a();
            AmeLiveWallpaper.this.f108709b.remove(this);
        }

        public final void onVisibilityChanged(boolean z) {
            super.onVisibilityChanged(z);
            this.f108715a.a(z);
        }

        private b() {
            super(AmeLiveWallpaper.this);
            a a2 = f.a(a(AmeLiveWallpaper.this), AmeLiveWallpaper.this);
            this.f108715a = a2;
            h.a().storeBoolean("keva_key_last_engine_is_tt_player", hm.a());
            i.a("AmeLiveWallpaper", "new WallpaperEngine = " + a2.getClass().getName());
        }

        public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            AmeLiveWallpaper.this.b();
            if (!com.ss.android.ugc.aweme.video.e.b(AmeLiveWallpaper.this.f108708a.getVideoPath())) {
                SmartRouter.buildRoute(a(AmeLiveWallpaper.this), "//livewallpaper").addFlags(268435456).open();
                return;
            }
            this.f108715a.a(AmeLiveWallpaper.this.f108708a);
            this.f108715a.a(surfaceHolder, AmeLiveWallpaper.this.f108708a.getVideoPath(), AmeLiveWallpaper.this.f108708a.getWidth(), AmeLiveWallpaper.this.f108708a.getHeight());
        }

        /* synthetic */ b(AmeLiveWallpaper ameLiveWallpaper, byte b2) {
            this();
        }

        public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            this.f108715a.a(surfaceHolder, i3, i4);
        }

        public final Bundle onCommand(String str, int i2, int i3, int i4, Bundle bundle, boolean z) {
            a aVar;
            l.d(str, "");
            boolean z2 = true;
            boolean z3 = false;
            if (!l.a((Object) "android.wallpaper.tap", (Object) str)) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j.f108921a <= 300) {
                int i5 = i2 - j.f108922b;
                int i6 = i3 - j.f108923c;
                if ((i5 * i5) + (i6 * i6) >= 10000) {
                    z2 = false;
                }
                z3 = z2;
            }
            j.f108921a = currentTimeMillis;
            j.f108922b = i2;
            j.f108923c = i3;
            if (!z3 || !h.e() || (aVar = this.f108715a) == null) {
                return null;
            }
            aVar.b();
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a.AbstractC2787a
    public final void a(boolean z, String str, String str2) {
        if (this.f108710c != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", str);
            contentValues.put("message", str2);
            try {
                this.f108710c.insert(WallPaperDataProvider.f108724h, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                com.ss.android.ugc.aweme.framework.a.a.a("LiveWallPaper insert failed " + e2.getMessage());
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        i.a("AmeLiveWallpaper", "AmeLiveWallpaper onStartCommand");
        if (intent != null) {
            if ("action_update_volume".equals(a(intent, "action"))) {
                float a2 = f.a(h.f());
                Iterator<b> it = this.f108709b.iterator();
                while (it.hasNext()) {
                    it.next().f108715a.a(a2);
                }
                return super.onStartCommand(intent, i2, i3);
            }
            this.f108708a = c.a(a(intent, "wallpaper_json"));
        }
        LiveWallPaperBean liveWallPaperBean = this.f108708a;
        if (liveWallPaperBean == null || !com.ss.android.ugc.aweme.video.e.b(liveWallPaperBean.getVideoPath()) || this.f108708a.getWidth() <= 0 || this.f108708a.getHeight() <= 0) {
            b();
        }
        Iterator<b> it2 = this.f108709b.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (AmeLiveWallpaper.this.f108708a != null && !TextUtils.isEmpty(AmeLiveWallpaper.this.f108708a.getSource())) {
                next.f108715a.a(AmeLiveWallpaper.this.f108708a);
                next.f108715a.a(AmeLiveWallpaper.this.f108708a.getVideoPath(), AmeLiveWallpaper.this.f108708a.getWidth(), AmeLiveWallpaper.this.f108708a.getHeight());
            }
        }
        c();
        a();
        return super.onStartCommand(intent, i2, i3);
    }
}
