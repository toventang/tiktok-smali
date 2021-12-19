package com.ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import com.bytedance.ies.powerpermissions.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.ag;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<? extends ag> f123501a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public static final a f123502b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f123503c = i.a((h.f.a.a) b.f123509a);

    public static String a() {
        return (String) f123503c.getValue();
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(81086);
    }

    static final class b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f123509a = new b();

        static {
            Covode.recordClassIndex(81088);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String path = new File(AVExternalServiceImpl.a().configService().cacheConfig().cacheDir(), "gif").getPath();
            l.b(path, "");
            return path;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.gif.a$a  reason: collision with other inner class name */
    public static final class C3200a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f123504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f123505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f123506c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f123507d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f123508e;

        static {
            Covode.recordClassIndex(81087);
        }

        @Override // com.bytedance.ies.powerpermissions.f
        public final void a(com.bytedance.ies.powerpermissions.c.a... aVarArr) {
            h hVar;
            l.d(aVarArr, "");
            if (aVarArr[0].f34455b == a.EnumC0768a.GRANTED && (hVar = this.f123504a) != null) {
                hVar.a(this.f123505b, this.f123506c, this.f123507d, this.f123508e);
            }
        }

        public C3200a(h hVar, Activity activity, Aweme aweme, String str, String str2) {
            this.f123504a = hVar;
            this.f123505b = activity;
            this.f123506c = aweme;
            this.f123507d = str;
            this.f123508e = str2;
        }
    }

    public static String a(Aweme aweme) {
        l.d(aweme, "");
        String aid = aweme.getAid();
        l.b(aid, "");
        return aid;
    }
}
