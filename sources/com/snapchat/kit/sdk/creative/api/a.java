package com.snapchat.kit.sdk.creative.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.creative.a.b;
import com.snapchat.kit.sdk.creative.c.d;
import com.snapchat.kit.sdk.creative.internal.SnapCreativeShareResultHandler;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57285a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57286b;

    /* renamed from: c  reason: collision with root package name */
    private b f57287c;

    /* renamed from: d  reason: collision with root package name */
    private final MetricQueue<ServerEvent> f57288d;

    /* renamed from: e  reason: collision with root package name */
    private final com.snapchat.kit.sdk.creative.a.a f57289e;

    /* renamed from: f  reason: collision with root package name */
    private String f57290f;

    /* renamed from: g  reason: collision with root package name */
    private KitPluginType f57291g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57292h;

    static {
        Covode.recordClassIndex(35823);
    }

    public final void a(com.snapchat.kit.sdk.creative.d.a aVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        com.snapchat.kit.sdk.creative.internal.a aVar2 = new com.snapchat.kit.sdk.creative.internal.a(this.f57286b, aVar);
        String str2 = com.snapchat.kit.sdk.b.a.f57077a;
        PackageManager packageManager = this.f57285a.getPackageManager();
        if (!com.snapchat.kit.sdk.b.b.a(packageManager, str2)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(com.a.a("https://play.google.com/store/apps/details?id=%s", new Object[]{str2})));
            intent.setFlags(268435456);
            a(this.f57285a, intent);
            this.f57287c.a("sendToPlayStore");
            return;
        }
        this.f57287c.a("sendIntentToApp");
        Context context = this.f57285a;
        KitPluginType kitPluginType = this.f57291g;
        boolean z = this.f57292h;
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setDataAndType(Uri.parse(com.a.a("snapchat://%s?link=%s", new Object[]{aVar2.f57315a.a(), aVar2.f57316b})), aVar2.f57315a.b());
        Uri a2 = com.snapchat.kit.sdk.b.b.a(context, aVar2.f57315a.c());
        d dVar = aVar2.f57315a.f57306a;
        if (dVar != null) {
            Uri a3 = com.snapchat.kit.sdk.b.b.a(context, dVar.f57296a);
            intent2.putExtra("sticker", dVar.a(a3, context).toString());
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (a2 != null) {
                arrayList.add(a2);
            }
            arrayList.add(a3);
            if (arrayList.size() > 1) {
                intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
            } else if (!arrayList.isEmpty()) {
                intent2.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
            }
        } else if (a2 != null) {
            intent2.putExtra("android.intent.extra.STREAM", a2);
        }
        String str3 = aVar2.f57315a.f57307b;
        if (!TextUtils.isEmpty(str3)) {
            intent2.putExtra("attachmentUrl", str3);
        }
        String str4 = aVar2.f57315a.f57308c;
        if (!TextUtils.isEmpty(str4)) {
            intent2.putExtra("captionText", str4);
        }
        if (aVar2.f57315a instanceof com.snapchat.kit.sdk.creative.d.b) {
            com.snapchat.kit.sdk.creative.d.b bVar = (com.snapchat.kit.sdk.creative.d.b) aVar2.f57315a;
            String str5 = bVar.f57309d;
            String str6 = bVar.f57310e;
            if (!TextUtils.isEmpty(str5)) {
                intent2.putExtra("lensUUID", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                intent2.putExtra("lensId", str6);
            }
            if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6)) {
                if (bVar.f57311f != null) {
                    str = bVar.f57311f.f57293a;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    intent2.putExtra("lensLaunchData", str);
                }
            }
        }
        if (kitPluginType != KitPluginType.NO_PLUGIN) {
            intent2.putExtra("kitPluginType", kitPluginType.toString());
        }
        intent2.putExtra("sdk_is_from_react_native_plugin", z);
        String a4 = com.snapchat.kit.sdk.creative.internal.a.a(context);
        if (!TextUtils.isEmpty(a4)) {
            intent2.putExtra("CLIENT_APP_NAME", a4);
        }
        intent2.setPackage(str2);
        intent2.putExtra("CLIENT_ID", this.f57286b);
        intent2.putExtra("KIT_VERSION", "1.12.0");
        intent2.putExtra("KIT_VERSION_CODE", 40);
        intent2.putExtra("deep_link_intent", true);
        if (!TextUtils.isEmpty(this.f57290f)) {
            intent2.putExtra("KIT_REDIRECT_URL", this.f57290f);
        }
        intent2.putExtra("RESULT_INTENT", PendingIntent.getBroadcast(this.f57285a, 17, new Intent(this.f57285a, SnapCreativeShareResultHandler.class), 1073741824));
        intent2.setFlags(335544320);
        if (intent2.resolveActivity(packageManager) != null) {
            this.f57288d.push(new ServerEvent.Builder().event_data(new ServerEventData.Builder().creative_kit_share_start(new CreativeKitShareStart.Builder().creative_kit_event_base(new CreativeKitEventBase.Builder().kit_event_base(this.f57289e.f57280a.a(KitType.CREATIVE_KIT, "1.12.0")).build()).build()).build()).build());
            a(this.f57285a, intent2);
            this.f57287c.a("sendLatency", System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        this.f57287c.a("cannotShareContent");
        Toast makeText = Toast.makeText(this.f57285a, (int) R.string.g1w, 0);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public a(Context context, String str, String str2, b bVar, MetricQueue<ServerEvent> metricQueue, com.snapchat.kit.sdk.creative.a.a aVar, KitPluginType kitPluginType, boolean z) {
        this.f57285a = context;
        this.f57286b = str;
        this.f57290f = str2;
        this.f57287c = bVar;
        this.f57288d = metricQueue;
        this.f57289e = aVar;
        this.f57291g = kitPluginType;
        this.f57292h = z;
    }
}
