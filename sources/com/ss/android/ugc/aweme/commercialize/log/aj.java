package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.android.a.a.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.f;
import h.f.a.m;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f74734a = new aj();

    private aj() {
    }

    static {
        Covode.recordClassIndex(46092);
    }

    private static boolean a() {
        return b.a().a(true, "enable_tracker_sdk", false);
    }

    private static Boolean a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements ah {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f74735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f74736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f74737c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f74738d;

        static {
            Covode.recordClassIndex(46093);
        }

        a(String str, Long l2, String str2, m mVar) {
            this.f74735a = str;
            this.f74736b = l2;
            this.f74737c = str2;
            this.f74738d = mVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.log.ah
        public final void a(String str, String str2, long j2) {
            f.b a2 = f.a(str, str2, j2);
            a2.f74809f = "track_url";
            a2.f74804a = "track_ad";
            f.b a3 = a2.d(this.f74735a).a(this.f74736b);
            String str3 = this.f74737c;
            if (str3 == null) {
                str3 = "";
            }
            f.b e2 = a3.e(str3);
            m mVar = this.f74738d;
            if (mVar != null) {
                l.b(e2, "");
                mVar.invoke(e2, true);
            }
            e2.b();
        }
    }

    public static void a(String str, UrlModel urlModel, Long l2, String str2, m<? super f.b, ? super Boolean, ? extends f.b> mVar) {
        List<String> list;
        l.d(str, "");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        a(str, list, l2, str2, null, mVar);
    }

    public static void a(String str, List<String> list, Long l2, String str2, m<? super f.b, ? super Boolean, ? extends f.b> mVar) {
        l.d(str, "");
        a(str, list, l2, str2, null, mVar);
    }

    private static void a(List<String> list, String str, Long l2, String str2, m<? super f.b, ? super Boolean, ? extends f.b> mVar) {
        g.a((ah) new a(str, l2, str2, mVar), (Collection<String>) list, true);
    }

    public static void a(String str, List<String> list, Long l2, String str2, JSONObject jSONObject, m<? super f.b, ? super Boolean, ? extends f.b> mVar) {
        long j2;
        l.d(str, "");
        Boolean a2 = a(list);
        if (a2 != null) {
            a2.booleanValue();
            if (a()) {
                b.a aVar = new b.a();
                aVar.f6637f = str;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                aVar.f6632a = j2;
                b.a a3 = aVar.a(list);
                a3.f6635d = str2;
                a3.f6633b = true;
                a3.f6636e = jSONObject;
                a3.f6639h = true;
                am.f74745b.a().a(a3.a());
                return;
            }
            if (list == null) {
                l.b();
            }
            a(list, str, l2, str2, mVar);
        }
    }
}
