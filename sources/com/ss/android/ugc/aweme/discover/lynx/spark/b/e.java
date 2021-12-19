package com.ss.android.ugc.aweme.discover.lynx.spark.b;

import android.content.Context;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.k;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.bullet.e.c;
import com.ss.android.ugc.aweme.discover.lynx.b.b;
import com.ss.android.ugc.aweme.discover.lynx.b.d;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f81587a = new e();

    private e() {
    }

    public static final class a implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f81588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f81589b;

        static {
            Covode.recordClassIndex(50699);
        }

        public a(Context context, String str) {
            this.f81588a = context;
            this.f81589b = str;
        }

        public final boolean queueIdle() {
            b.f81440b.a(this.f81588a, this.f81589b, null);
            return false;
        }
    }

    static {
        Covode.recordClassIndex(50698);
    }

    public static void a(String str, String str2) {
        BulletContainerView bulletContainerView;
        d dVar;
        d dVar2;
        l.d(str, "");
        if (!TextUtils.isEmpty(str2)) {
            com.ss.android.ugc.aweme.discover.lynx.b.a aVar = null;
            if (b.b(str)) {
                b a2 = c.a(str);
                if (a2 != null) {
                    dVar2 = a2.f81571c;
                } else {
                    dVar2 = null;
                }
                if (dVar2 == d.SUCCEED) {
                    h kitView = a2.f81570b.getKitView();
                    if (!(kitView instanceof k)) {
                        kitView = null;
                    }
                    k kVar = (k) kitView;
                    if (kVar != null) {
                        com.ss.android.ugc.aweme.discover.mixfeed.d dVar3 = new com.ss.android.ugc.aweme.discover.mixfeed.d();
                        dVar3.setSchema(str);
                        dVar3.setRawData(str2);
                        com.ss.android.ugc.aweme.discover.lynx.spark.b.a(kVar, dVar3, null);
                        a2.f81572d = true;
                        return;
                    }
                    return;
                }
                return;
            }
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            c b2 = com.ss.android.ugc.aweme.bullet.e.b.b(parse);
            if (b2 != null && (bulletContainerView = b2.f69288a) != null) {
                Object tag = bulletContainerView.getTag();
                if (!(tag instanceof com.ss.android.ugc.aweme.discover.lynx.b.a)) {
                    tag = null;
                }
                com.ss.android.ugc.aweme.discover.lynx.b.a aVar2 = (com.ss.android.ugc.aweme.discover.lynx.b.a) tag;
                if (aVar2 != null) {
                    dVar = aVar2.f81434a;
                } else {
                    dVar = null;
                }
                if (dVar == d.SUCCEED) {
                    TemplateData a3 = TemplateData.a(str2);
                    l.b(a3, "");
                    com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
                    bVar.b(TemplateData.class, a3);
                    bulletContainerView.a(bVar, (h.b) null);
                    Object tag2 = bulletContainerView.getTag();
                    if (tag2 instanceof com.ss.android.ugc.aweme.discover.lynx.b.a) {
                        aVar = tag2;
                    }
                    com.ss.android.ugc.aweme.discover.lynx.b.a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.f81438e = true;
                    }
                }
            }
        }
    }
}
