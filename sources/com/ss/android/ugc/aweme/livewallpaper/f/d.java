package com.ss.android.ugc.aweme.livewallpaper.f;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.b.a.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.d.c;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static d f108899e = new d();

    /* renamed from: a  reason: collision with root package name */
    public List<LiveWallPaperBean> f108900a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public e f108901b;

    /* renamed from: c  reason: collision with root package name */
    public LiveWallPaperBean f108902c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, a> f108903d;

    /* renamed from: f  reason: collision with root package name */
    private f f108904f = new f();

    /* renamed from: g  reason: collision with root package name */
    private ContentResolver f108905g;

    public interface a {
        static {
            Covode.recordClassIndex(69743);
        }

        void a(boolean z, String str);
    }

    static {
        Covode.recordClassIndex(69739);
    }

    public final void b() {
        e eVar = this.f108901b;
        if (eVar != null) {
            eVar.b(this.f108904f.b(this.f108900a));
        }
    }

    private void d() {
        Iterator<LiveWallPaperBean> it = this.f108900a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            LiveWallPaperBean next = it.next();
            if (!next.isValid()) {
                z = true;
                a(next);
                it.remove();
            }
        }
        if (z) {
            b();
        }
    }

    public final List<LiveWallPaperBean> c() {
        if (!b.a((Collection) this.f108900a)) {
            d();
            return this.f108900a;
        }
        e eVar = this.f108901b;
        String str = "";
        if (eVar != null) {
            str = eVar.a(str);
        }
        if (TextUtils.isEmpty(str)) {
            return new LinkedList();
        }
        List list = null;
        try {
            list = (List) this.f108904f.a(str, new com.google.gson.b.a<List<LiveWallPaperBean>>() {
                /* class com.ss.android.ugc.aweme.livewallpaper.f.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69741);
                }
            }.type);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (b.a((Collection) list)) {
            return new LinkedList();
        }
        this.f108900a.addAll(list);
        d();
        return this.f108900a;
    }

    private d() {
        try {
            this.f108901b = (e) e.a(com.bytedance.ies.ugc.appcontext.d.a(), e.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a("LiveWallPaperManager getSP failed " + th.getMessage());
        }
        if (this.f108901b != null) {
            LiveWallPaperBean.a newBuilder = LiveWallPaperBean.newBuilder();
            newBuilder.f108936c = this.f108901b.c("");
            newBuilder.f108937d = this.f108901b.a();
            newBuilder.f108938e = this.f108901b.b();
            newBuilder.f108939f = this.f108901b.e("");
            newBuilder.f108940g = this.f108901b.c();
            newBuilder.f108944k = this.f108901b.d();
            this.f108902c = newBuilder.a();
        } else {
            this.f108902c = LiveWallPaperBean.newBuilder().a();
        }
        this.f108900a = c();
        this.f108903d = new HashMap();
    }

    public final void a() {
        if (this.f108902c.isValid() && !b(this.f108902c.getId())) {
            LiveWallPaperBean.a newBuilder = LiveWallPaperBean.newBuilder();
            newBuilder.f108934a = this.f108902c.getId();
            newBuilder.f108935b = this.f108902c.getThumbnailPath();
            newBuilder.f108936c = this.f108902c.getVideoPath();
            newBuilder.f108937d = this.f108902c.getWidth();
            newBuilder.f108938e = this.f108902c.getHeight();
            newBuilder.f108939f = this.f108902c.getSource();
            newBuilder.f108940g = this.f108902c.getVolume();
            newBuilder.f108944k = this.f108902c.isShouldMute();
            LiveWallPaperBean a2 = newBuilder.a();
            this.f108900a.add(0, a2);
            b();
            com.a.a("Add wallpaper : %s", new Object[]{a2});
        }
    }

    public final void a(final LiveWallPaperBean liveWallPaperBean) {
        i.b(new Callable<Void>() {
            /* class com.ss.android.ugc.aweme.livewallpaper.f.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69740);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() {
                com.ss.android.ugc.aweme.video.e.c(liveWallPaperBean.getThumbnailPath());
                com.ss.android.ugc.aweme.video.e.c(liveWallPaperBean.getVideoPath());
                return null;
            }
        }, i.f4824a);
    }

    private static ComponentName c(Activity activity) {
        if (f.d()) {
            return new ComponentName(c.f108896a, "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        }
        return new ComponentName(activity.getPackageName(), AmeLiveWallpaper.class.getName());
    }

    public final void a(Activity activity) {
        if (f.a(activity, activity.getPackageName())) {
            a((Context) activity);
        } else {
            b(activity);
        }
    }

    public final void a(String str) {
        if (this.f108903d.size() != 0) {
            this.f108903d.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        if (!b.a((Collection) this.f108900a) && !TextUtils.isEmpty(str)) {
            for (LiveWallPaperBean liveWallPaperBean : this.f108900a) {
                if (str.equals(liveWallPaperBean.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(Activity activity) {
        Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
        intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", c(activity));
        try {
            activity.startActivityForResult(intent, 100);
        } catch (Exception e2) {
            if (e2 instanceof ActivityNotFoundException) {
                r.a("not_support_wallpaper_device", new com.ss.android.ugc.aweme.app.f.d().a("brand", Build.BRAND).a("model", Build.MODEL).f66730a);
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.he9).a();
            f.a(1, "start livewallpaper activity fail");
        }
        c.a();
    }

    private void a(Context context) {
        MethodCollector.i(6499);
        if (f.d()) {
            if (this.f108905g == null) {
                this.f108905g = context.getContentResolver();
            }
            Bundle bundle = new Bundle();
            bundle.putString("wallpaper_json", c.a(this.f108902c));
            bundle.putInt("video_width", this.f108902c.getWidth());
            bundle.putInt("video_height", this.f108902c.getHeight());
            bundle.putString("source", this.f108902c.getSource());
            bundle.putFloat("volume", this.f108902c.getVolume());
            try {
                this.f108905g.call(c.f108898c, "call_plugin", "", bundle);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("notifyWallpaperService " + e2.getMessage());
                f.a(1, "notifyWallpaperService Unknow content uri");
            }
            c.a();
            MethodCollector.o(6499);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, AmeLiveWallpaper.class);
        intent.putExtra("wallpaper_json", c.a(this.f108902c));
        if (a(context, intent) == null) {
            f.a(1, "start livewallpaper service fail");
        }
        MethodCollector.o(6499);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.f.d.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public final void a(String str, a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f108903d.put(str, aVar);
        }
    }
}
