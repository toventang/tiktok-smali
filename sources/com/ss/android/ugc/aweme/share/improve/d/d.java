package com.ss.android.ugc.aweme.share.improve.d;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.n;
import com.ss.android.ugc.aweme.utils.cr;
import h.f.b.l;
import h.z;
import java.io.File;

public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public final b f123866a;

    static {
        Covode.recordClassIndex(81304);
    }

    public static final class a implements com.ss.android.ugc.aweme.feed.share.a.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f123867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123870d;

        static {
            Covode.recordClassIndex(81305);
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a() {
            this.f123870d.invoke(false);
        }

        @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
        public final void a(String str) {
            b bVar = this.f123867a.f123866a;
            Uri a2 = cr.a(this.f123869c, new File(str));
            l.b(a2, "");
            bVar.a(new n(a2, null, null, null, null, 62), this.f123869c);
            this.f123870d.invoke(true);
        }

        a(d dVar, AwemeSharePackage awemeSharePackage, Context context, h.f.a.b bVar) {
            this.f123867a = dVar;
            this.f123868b = awemeSharePackage;
            this.f123869c = context;
            this.f123870d = bVar;
        }
    }

    public d(b bVar) {
        l.d(bVar, "");
        this.f123866a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.d.o
    public final boolean a(Context context, AwemeSharePackage awemeSharePackage, h.f.a.b<? super Boolean, z> bVar) {
        String str = "";
        l.d(context, str);
        l.d(awemeSharePackage, str);
        l.d(bVar, str);
        Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
        if (a2 != null) {
            Aweme a3 = awemeSharePackage.a();
            int i2 = awemeSharePackage.f124595i.getInt("page_type");
            String a4 = this.f123866a.a();
            a aVar = new a(this, awemeSharePackage, context, bVar);
            String string = awemeSharePackage.f124595i.getString("enter_from");
            if (string != null) {
                str = string;
            }
            h.a.a(a2, a3, true, i2, a4, aVar, str);
        }
        awemeSharePackage.f124595i.putString("share_form", "video_form");
        return true;
    }
}
