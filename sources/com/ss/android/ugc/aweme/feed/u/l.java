package com.ss.android.ugc.aweme.feed.u;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.d;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.dl;
import com.ss.android.ugc.aweme.experiment.fl;
import com.ss.android.ugc.aweme.feed.i.m;
import com.ss.android.ugc.aweme.feed.i.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.x;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.player.a.a;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.d.a.c;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class l extends b<d> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f94045a;

    /* renamed from: b  reason: collision with root package name */
    public x f94046b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94047c;

    /* renamed from: d  reason: collision with root package name */
    public t f94048d;

    /* renamed from: e  reason: collision with root package name */
    public int f94049e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f94050f;

    /* renamed from: g  reason: collision with root package name */
    private String f94051g = "";

    /* renamed from: l  reason: collision with root package name */
    private Fragment f94052l;

    /* renamed from: m  reason: collision with root package name */
    private String f94053m;
    private x n;
    private int o;
    private long p;
    private boolean q;
    private boolean r;
    private volatile boolean s;

    static {
        Covode.recordClassIndex(59784);
    }

    private static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? "" : "load_more" : "load_latest" : "refresh";
    }

    private static String c(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "" : "homepage_fresh" : "homepage_follow" : "homepage_hot";
    }

    static final /* synthetic */ Object d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 200);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a("feed_error", jSONObject);
        return null;
    }

    private void e() {
        if (this.f94045a) {
            this.f94045a = false;
            ((d) this.f76396h).f94002a = false;
        }
        c.a(new y());
    }

    private FeedAppLogParams f() {
        return new FeedAppLogParams(this.f76396h.mData, ((d) this.f76396h).f94003b, ((a) this.f76396h).getItems());
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
        Aweme aweme;
        boolean z;
        if (!this.s && dl.c()) {
            MainLooperOptService mainLooperOptService = (MainLooperOptService) f.a(MainLooperOptService.class);
            if (mainLooperOptService.a(mainLooperOptService.f107700c, mainLooperOptService.f107702e, 0)) {
                MainLooperOptService.f107696a.booleanValue();
            }
            d.f41460d = true;
            this.s = true;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedFetchModel", "FeedFetchPresenter called onSuccess!");
        a.b.f109011a.b("feed_ui_post_msg_to_feed_ui", false);
        a.b.f109011a.b("cold_boot_start_to_feed_ui", false);
        a.b.f109011a.b("method_first_feed_request", false);
        a.b.f109011a.b("feed_post_cache_message_to_success", false);
        a.b.f109011a.b("feed_render_to_ui", false);
        a.b.f109011a.b("player_prerender_to_ui", false);
        if (a.b.f109011a.a("feed_parse_to_ui") && !a.b.f109011a.b("feed_parse_to_ui")) {
            a.b.f109011a.b("feed_parse_to_ui", true);
        }
        if (!a.b.f109011a.a("feed_ui_duration")) {
            a.b.f109011a.a("feed_ui_duration", true);
        }
        a.b.f109011a.b("cold_boot_main_focus_to_feed_success", false);
        if (a.b.f109011a.a("cold_boot_new_user_journey_pause_to_data_fetched")) {
            a.b.f109011a.b("cold_boot_new_user_journey_pause_to_data_fetched", false);
        }
        if (com.ss.android.ugc.aweme.experiment.b.f89587b) {
            fr.a(5000);
        }
        Boolean bool = true;
        com.ss.android.ugc.aweme.feed.p.b.f.f93675a.set(bool.booleanValue());
        this.n.a(1, this.f94051g, f());
        this.n.a(1, this.f94051g, f(), null);
        if (this.f76396h.mData != null && this.f76396h.mData.isFromLocalCache) {
            this.f76396h.mData.isFromLocalCache = false;
        }
        e();
        x xVar = this.f94046b;
        if (xVar != null) {
            if (!this.f94050f || this.f94047c) {
                z = true;
            } else {
                z = false;
            }
            xVar.c(z);
        }
        this.f94050f = false;
        this.f94047c = false;
        if (!(this.f76396h.mData == null || this.f76396h.mData.getItems() == null || this.f76396h.mData.getItems().size() <= 0)) {
            a.b.f109011a.a("preload_feed_item", false);
            List<Aweme> items = this.f76396h.mData.getItems();
            if (!fl.f90052a || this.r || items == null || items.size() == 0 || items.size() <= 0 || (aweme = items.get(0)) == null || !com.ss.android.ugc.aweme.video.preload.b.b(com.ss.android.ugc.aweme.video.preload.b.a(aweme.getAid()))) {
                if (fq.a.f142946a.a(fp.FEED_FIRST_VIDEO_PRELOAD)) {
                    ac.a(items);
                }
                this.r = true;
            }
            a.b.f109011a.b("preload_feed_item", false);
            Aweme aweme2 = this.f76396h.mData.getItems().get(0);
            if (aweme2 != null && aweme2.getVideo() != null && com.bytedance.ies.abmock.b.a().a(true, "player_precreateplayer", 0) == 1 && fq.a.f142946a.a(fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                v.O().a(aweme2);
            }
        }
        if (!this.q) {
            AVMDLDataLoader.tryLoadVcnverifylib();
            this.q = true;
        }
        a.b.f109011a.a("feed_fetch_super_onsuccess", false);
        if (((d) this.f76396h).f94004c) {
            this.f94048d.d(((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems(), ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isHasMore());
        } else {
            super.c();
        }
        a.b.f109011a.b("feed_fetch_super_onsuccess", false);
        if (this.f76396h.mData != null) {
            this.p = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.player.a.a aVar = a.C2940a.f114915a;
            String requestId = this.f76396h.mData.getRequestId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (requestId != null) {
                aVar.f114914a.put(requestId, Long.valueOf(elapsedRealtime));
            }
        }
        if (this.f76396h != null && !com.bytedance.common.utility.collection.b.a((Collection) ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems())) {
            p a2 = p.a.a();
            List items2 = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
            if (a2.f104889f) {
                a2.f104889f = false;
                a2.f104890g = 0;
            } else if (a2.f104890g == -1) {
                a2.f104890g = 2;
            }
            if ((a2.f104890g == 2 || a2.f104890g == 0) && items2 != null && (!items2.isEmpty()) && ((Aweme) items2.get(0)).isFakeResponse()) {
                a2.f104890g = 1;
            }
        }
        if (this.f76396h.mData == null || this.f76396h.mData.getItems() == null || this.f76396h.mData.getItems().isEmpty()) {
            i.b(n.f94055a, r.a());
        }
        if (!(this.f76396h == null || this.f76396h.mData == null || !this.f76396h.mData.isFromUnusedFeed)) {
            this.f76396h.mData.isFromUnusedFeed = false;
            c.a(new m("from_full_recommend"));
        }
        if (a.b.f109011a.a("feed_ui_duration") && !a.b.f109011a.b("feed_ui_duration")) {
            a.b.f109011a.b("feed_ui_duration", true);
        }
        if (!a.b.f109011a.a("feed_ui_to_video")) {
            a.b.f109011a.a("feed_ui_to_video", true);
        }
        a.b.f109011a.a("feed_ui_to_texture_available", false);
    }

    public final boolean b(Object... objArr) {
        this.o = 5;
        return a(objArr);
    }

    @Override // com.ss.android.ugc.aweme.common.e.b, com.ss.android.ugc.aweme.common.e.f
    public final boolean a(com.ss.android.ugc.aweme.common.e.i iVar) {
        if (this.f76409k != null) {
            return this.f76409k.a(iVar);
        }
        return false;
    }

    public l(Fragment fragment) {
        this.f94052l = fragment;
        this.n = new x(fragment);
    }

    static final /* synthetic */ Object b(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", com.bytedance.ies.b.a.a.a(exc, (String[]) null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a("feed_error", jSONObject);
        return null;
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems() != null) {
            for (int size = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems().size() - 1; size >= 0; size--) {
                Aweme aweme = (Aweme) ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems().get(size);
                if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                    ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems().remove(size);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        boolean z;
        com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedFetchModel", "FeedFetchPresenter called onFailed!");
        this.n.a(0, this.f94051g, null);
        this.n.a(0, this.f94051g, null, exc);
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            i.b(new m(exc), r.a());
            p a2 = p.a.a();
            try {
                if (a2.f104890g == -1) {
                    a2.f104890g = com.bytedance.ies.b.a.a.a(exc, (String[]) null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        e();
        x xVar = this.f94046b;
        if (xVar != null) {
            if (!this.f94050f || this.f94047c) {
                z = true;
            } else {
                z = false;
            }
            xVar.c(z);
        }
        this.f94050f = false;
        this.f94047c = false;
        super.a_(exc);
        f.d();
    }

    public final boolean b(Object obj) {
        List items = ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).getItems();
        if (com.bytedance.common.utility.collection.b.a((Collection) items)) {
            items = new ArrayList();
        }
        if (items.size() < 0) {
            return false;
        }
        items.add(0, obj);
        ((com.ss.android.ugc.aweme.common.e.a) this.f76396h).setItems(items);
        if (this.f76397i == null) {
            return true;
        }
        if (((com.ss.android.ugc.aweme.common.e.a) this.f76396h).isDataEmpty()) {
            ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).f();
            return true;
        }
        a(items, 0);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        this.f94051g = b(((Integer) objArr[0]).intValue());
        if (5 == this.o) {
            this.f94051g = "press_back";
        }
        this.f94053m = c(((Integer) objArr[1]).intValue());
        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedFetchModel", "FeedFetchPresenter sendRequest on:" + this.f94053m);
        this.n.a(this.f94051g);
        x xVar = this.f94046b;
        if (xVar != null) {
            xVar.c(this.f94047c);
        }
        boolean a2 = super.a(objArr);
        this.f94050f = a2;
        return a2;
    }
}
