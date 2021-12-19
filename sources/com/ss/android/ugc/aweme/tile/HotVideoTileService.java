package com.ss.android.ugc.aweme.tile;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.logger.a;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

public final class HotVideoTileService extends TileService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f138721b = 2500;

    /* renamed from: c  reason: collision with root package name */
    public static final a f138722c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f138723a;

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90737);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onStartListening() {
        super.onStartListening();
        a();
    }

    static {
        Covode.recordClassIndex(90736);
    }

    private final void a() {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
            qsTile.setLabel(getString(R.string.b44));
            qsTile.updateTile();
        }
    }

    public final void onTileAdded() {
        super.onTileAdded();
        r.a("add_to_notificationbar", new d().a("features", "watch_video").f66730a);
    }

    public final void onTileRemoved() {
        super.onTileRemoved();
        r.a("delete_from_notificationbar", new d().a("features", "watch_video").f66730a);
    }

    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - a.b.f109011a.f109008i;
        if (uptimeMillis <= 1000) {
            r.a("active_in_notificationbar", new d().a("time", uptimeMillis).a("features", "watch_video").f66730a);
        }
        a();
    }

    public final void onClick() {
        super.onClick();
        if (!f.f34637l) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, DeepLinkActivityV2.class);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        int i2 = com.bytedance.ies.ugc.appcontext.d.n;
        if (i2 <= 0) {
            i2 = 1233;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, DeepLinkActivityV2.class);
        intent2.setData(Uri.parse("snssdk" + i2 + "://feed?tab=1"));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.f138723a = false;
            f.c().d(new b(this));
            i.a(f138721b).b(new c(this), i.f4826c);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.c.a.a.a.b.a(e2);
        }
        r.a("click_notificationbar", new d().a("features", "watch_video").f66730a);
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HotVideoTileService f138724a;

        static {
            Covode.recordClassIndex(90738);
        }

        b(HotVideoTileService hotVideoTileService) {
            this.f138724a = hotVideoTileService;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            if (obj instanceof f.c) {
                this.f138724a.f138723a = true;
            }
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HotVideoTileService f138725a;

        static {
            Covode.recordClassIndex(90739);
        }

        c(HotVideoTileService hotVideoTileService) {
            this.f138725a = hotVideoTileService;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", this.f138725a.f138723a ? 1 : 0);
            com.bytedance.apm.b.a("tile_service_open", jSONObject, (JSONObject) null, (JSONObject) null);
            return iVar;
        }
    }
}
