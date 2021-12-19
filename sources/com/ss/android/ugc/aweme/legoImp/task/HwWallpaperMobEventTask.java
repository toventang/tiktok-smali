package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.livewallpaper.e.b;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class HwWallpaperMobEventTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final String f107777a = "HwWallpaperMobEventTask";

    /* renamed from: b  reason: collision with root package name */
    private final long f107778b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c  reason: collision with root package name */
    private final h f107779c = i.a((h.f.a.a) a.f107780a);

    static {
        Covode.recordClassIndex(68986);
    }

    private final SimpleDateFormat c() {
        return (SimpleDateFormat) this.f107779c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class a extends m implements h.f.a.a<SimpleDateFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107780a = new a();

        static {
            Covode.recordClassIndex(68987);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        if (((Boolean) com.ss.android.ugc.aweme.lego.m.f107603k.getValue()).booleanValue()) {
            return ae.APP_BACKGROUND;
        }
        return ae.BOOT_FINISH;
    }

    private final long a(long j2) {
        Date parse = c().parse(c().format(new Date(j2)));
        l.b(parse, "");
        return parse.getTime();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.d(context, "");
        if (f.d()) {
            com.ss.android.ugc.aweme.feed.cache.h.a().storeInt("wallpaper_cache_feed_expire_hour", ((Number) b.f108887b.getValue()).intValue());
            com.ss.android.ugc.aweme.livewallpaper.f.h.a().storeInt("keva_key_active_check_interval_hour", ((Number) com.ss.android.ugc.aweme.livewallpaper.e.a.f108883b.getValue()).intValue());
            String[] b2 = com.ss.android.ugc.aweme.livewallpaper.f.h.b();
            if (!(b2 == null || b2.length == 0)) {
                com.ss.android.ugc.aweme.livewallpaper.f.h.a().erase("keva_key_wallpaper_active_date");
                int abs = (int) (Math.abs(a(System.currentTimeMillis()) - a(Long.parseLong(b2[0]))) / this.f107778b);
                for (String str : b2) {
                    long parseLong = Long.parseLong(str);
                    r.a("hw_wall_paper_active", new d().a("date", c().format(new Date(parseLong))).a("is_today", l.a(c().format(new Date(parseLong)), c().format(new Date(System.currentTimeMillis()))) ? 1 : 0).a("no_active_days", abs).f66730a);
                }
                com.ss.android.ugc.aweme.livewallpaper.f.h.a().storeLong("keva_key_already_upload_date", System.currentTimeMillis());
            }
        }
    }
}
