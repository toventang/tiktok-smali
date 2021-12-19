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
import org.json.JSONObject;

public final class PublishTileService extends TileService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f138726b = 2500;

    /* renamed from: c  reason: collision with root package name */
    public static final a f138727c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f138728a;

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90741);
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
        Covode.recordClassIndex(90740);
    }

    private final void a() {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
            qsTile.setLabel(getString(a.f138731a));
            qsTile.updateTile();
        }
    }

    public final void onTileAdded() {
        super.onTileAdded();
        r.a("add_to_notificationbar", new d().a("features", "record_video").f66730a);
    }

    public final void onTileRemoved() {
        super.onTileRemoved();
        r.a("delete_from_notificationbar", new d().a("features", "record_video").f66730a);
    }

    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - a.b.f109011a.f109008i;
        if (uptimeMillis <= 1000) {
            r.a("active_in_notificationbar", new d().a("time", uptimeMillis).a("features", "record_video").f66730a);
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
        intent2.setData(Uri.parse("snssdk" + i2 + "://openRecord?recordParam=withStickerPanel&_t=" + System.currentTimeMillis()));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.f138728a = false;
            f.c().d(new b(this));
            i.a(f138726b).b(new c(this), i.f4826c);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.bytedance.c.a.a.a.b.a(e2);
        }
        r.a("click_notificationbar", new d().a("features", "record_video").f66730a);
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishTileService f138729a;

        static {
            Covode.recordClassIndex(90742);
        }

        b(PublishTileService publishTileService) {
            this.f138729a = publishTileService;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            if (obj instanceof f.c) {
                this.f138729a.f138728a = true;
            }
        }
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishTileService f138730a;

        static {
            Covode.recordClassIndex(90743);
        }

        c(PublishTileService publishTileService) {
            this.f138730a = publishTileService;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", this.f138730a.f138728a ? 1 : 0);
            com.bytedance.apm.b.a("tile_service_open", jSONObject, (JSONObject) null, (JSONObject) null);
            return iVar;
        }
    }
}
