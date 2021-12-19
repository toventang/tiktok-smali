package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.experiment.ht;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.sharer.ext.s;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.util.o;
import com.ss.android.ugc.aweme.util.q;
import com.ss.android.ugc.aweme.util.u;
import com.ss.android.ugc.aweme.util.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;

public final class RemoteImageSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b  reason: collision with root package name */
    public static final a f123985b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f123986a;

    static {
        Covode.recordClassIndex(81406);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81407);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static RemoteImageSharePackage a(Context context, com.ss.android.ugc.aweme.web.c.a.b bVar, String str, String str2) {
            String str3 = "";
            l.d(context, str3);
            l.d(bVar, str3);
            l.d(str, str3);
            SharePackage.a b2 = new SharePackage.a().a("pic").b("web");
            String str4 = bVar.f144901a;
            l.b(str4, str3);
            SharePackage.a c2 = b2.c(str4);
            String str5 = bVar.f144902b;
            l.b(str5, str3);
            SharePackage.a d2 = c2.d(str5);
            String b3 = com.ss.android.ugc.aweme.share.improve.c.b.b(bVar.f144904d);
            if (b3 != null) {
                str3 = b3;
            }
            RemoteImageSharePackage remoteImageSharePackage = new RemoteImageSharePackage(d2.e(str3));
            remoteImageSharePackage.f123986a = str;
            Bundle bundle = remoteImageSharePackage.f124595i;
            bundle.putString("app_name", context.getString(R.string.uh));
            bundle.putString("thumb_url", "file://" + bVar.f144906f);
            bundle.putString("thumb_path", bVar.f144906f);
            bundle.putString("url_for_im_share", str2);
            return remoteImageSharePackage;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoteImageSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public static final class b extends v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RemoteImageSharePackage f123988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123990d;

        static {
            Covode.recordClassIndex(81408);
        }

        @Override // com.ss.android.ugc.aweme.util.u.b, com.ss.android.ugc.aweme.util.v
        public final void a(Uri uri) {
            super.a(uri);
            if (uri != null) {
                String a2 = c.d.a.a(this.f123987a, uri);
                l.b(a2, "");
                com.ss.android.ugc.aweme.sharer.l lVar = new com.ss.android.ugc.aweme.sharer.l(uri, a2, null, 60);
                if (this.f123990d.a(this.f123989c, lVar)) {
                    this.f123990d.a((h) lVar, this.f123989c);
                    return;
                }
                String string = d.a().getString(R.string.cc2);
                l.b(string, "");
                new s(string).a(lVar, this.f123989c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity, Activity activity2, RemoteImageSharePackage remoteImageSharePackage, Context context, com.ss.android.ugc.aweme.sharer.b bVar) {
            super(activity2);
            this.f123987a = activity;
            this.f123988b = remoteImageSharePackage;
            this.f123989c = context;
            this.f123990d = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        ah.f123353b.a(bVar.a(), 1);
        if (ht.a()) {
            e<Boolean, String> a2 = new o(new WeakReference(context)).a(this.f123986a, new q(com.ss.android.ugc.aweme.share.improve.c.b.a(context)));
            if (!l.a((Object) a2.f2397a, (Object) true) || a2.f2398b == null) {
                return false;
            }
            S s = a2.f2398b;
            if (s == null) {
                l.b();
            }
            l.b(s, "");
            Uri a3 = c.a(s, context);
            S s2 = a2.f2398b;
            if (s2 == null) {
                l.b();
            }
            l.b(s2, "");
            com.ss.android.ugc.aweme.sharer.l lVar = new com.ss.android.ugc.aweme.sharer.l(a3, s2, null, 60);
            if (bVar.a(context, lVar)) {
                bVar.a((h) lVar, context);
                return false;
            }
            String string = d.a().getString(R.string.cc2);
            l.b(string, "");
            new s(string).a(lVar, context);
            return false;
        }
        Activity a4 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
        if (a4 == null) {
            return false;
        }
        new u(new WeakReference(context)).a(this.f123986a, new b(a4, a4, this, context, bVar));
        return false;
    }
}
