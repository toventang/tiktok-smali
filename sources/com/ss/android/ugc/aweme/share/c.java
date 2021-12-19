package com.ss.android.ugc.aweme.share;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f123414a = "share_panel";

    /* renamed from: b  reason: collision with root package name */
    public static String f123415b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final c f123416c = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(81050);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f123422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f123423b;

        static {
            Covode.recordClassIndex(81051);
        }

        a(Aweme aweme, String str) {
            this.f123422a = aweme;
            this.f123423b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
            if (com.bytedance.ies.abmock.SettingsManager.a().a("ug_diff_download_report_only_diff", false) == false) goto L_0x0070;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 310
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.c.a.call():java.lang.Object");
        }
    }

    private static void a(AwemeACLStruct.ACLCommonStruct aCLCommonStruct) {
        l.d(aCLCommonStruct, "");
        aCLCommonStruct.setCode(0);
        aCLCommonStruct.setShowType(2);
        aCLCommonStruct.setToastMsg("");
        aCLCommonStruct.setExtra("");
    }

    public static final void a(String str, Aweme aweme) {
        if (aweme != null && !com.ss.android.ugc.aweme.share.d.c.b()) {
            i.b(new a(aweme, str), i.f4824a);
        }
    }

    public static final void a(e.b bVar, String str, Aweme aweme) {
        h next;
        int i2;
        l.d(bVar, "");
        a(AwemeACLStruct.a());
        f123414a = "share_panel";
        Iterator<h> it = bVar.f124663b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            i2 = 1;
            if (l.a((Object) next.c(), (Object) "download") || l.a((Object) next.c(), (Object) "save")) {
                AwemeACLStruct.a().setCode(0);
            } else {
                AwemeACLStruct.a().setShowType(0);
                AwemeACLStruct.a().setCode(1);
            }
        }
        AwemeACLStruct.a().setCode(0);
        if (next.f()) {
            i2 = 2;
        }
        AwemeACLStruct.a().setShowType(i2);
        if (AwemeACLStruct.a().getShowType() == 0) {
            a(str, aweme);
        }
    }

    public static final void a(boolean z, String str, Aweme aweme) {
        a(AwemeACLStruct.a());
        if (!z) {
            AwemeACLStruct.a().setShowType(0);
            AwemeACLStruct.a().setCode(1);
            f123414a = "long_press_download";
            a(str, aweme);
        }
    }
}
