package com.ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d implements com.ss.android.ugc.aweme.music.service.b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f111387f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f111388a;

    /* renamed from: b  reason: collision with root package name */
    public final String f111389b;

    /* renamed from: c  reason: collision with root package name */
    public final String f111390c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.music.service.b f111391d;

    /* renamed from: e  reason: collision with root package name */
    public final String f111392e;

    /* renamed from: g  reason: collision with root package name */
    private final h f111393g;

    static {
        Covode.recordClassIndex(71567);
    }

    private final IAVMobService c() {
        return (IAVMobService) this.f111393g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71568);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<IAVMobService> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111395a = new b();

        static {
            Covode.recordClassIndex(71569);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVMobService invoke() {
            return AVExternalServiceImpl.a().getAVMobService();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void b() {
        this.f111388a = System.currentTimeMillis();
        com.ss.android.ugc.aweme.music.service.b bVar = this.f111391d;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f111388a;
        com.ss.android.ugc.aweme.music.service.b bVar = this.f111391d;
        if (bVar != null) {
            bVar.a();
        }
        IAVMobService c2 = c();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("resource_type", "music").a("duration", currentTimeMillis).a("status", 2).a("resource_id", this.f111389b).a("error_domain", this.f111390c);
        String str = this.f111392e;
        if (str == null) {
            str = "";
        }
        c2.onEventV3("tool_performance_resource_download", a2.a("enter_from", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(int i2) {
        com.ss.android.ugc.aweme.music.service.b bVar = this.f111391d;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(com.ss.android.ugc.musicprovider.a aVar) {
        String str = "";
        l.d(aVar, str);
        long currentTimeMillis = System.currentTimeMillis() - this.f111388a;
        com.ss.android.ugc.aweme.music.service.b bVar = this.f111391d;
        if (bVar != null) {
            bVar.a(aVar);
        }
        IAVMobService c2 = c();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("resource_type", "music").a("duration", currentTimeMillis).a("status", 1).a("resource_id", this.f111389b).a("error_domain", this.f111390c).a("error_code", aVar.getErrorCode());
        String errorMsg = aVar.getErrorMsg();
        if (errorMsg == null) {
            errorMsg = "empty_error_msg";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("error_msg", errorMsg);
        String str2 = this.f111392e;
        if (str2 != null) {
            str = str2;
        }
        c2.onEventV3("tool_performance_resource_download", a3.a("enter_from", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.music.service.b
    public final void a(String str, MusicWaveBean musicWaveBean) {
        String str2 = "";
        l.d(str, str2);
        long currentTimeMillis = System.currentTimeMillis() - this.f111388a;
        com.ss.android.ugc.aweme.music.service.b bVar = this.f111391d;
        if (bVar != null) {
            bVar.a(str, musicWaveBean);
        }
        IAVMobService c2 = c();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("resource_type", "music").a("duration", currentTimeMillis).a("status", 0).a("resource_id", this.f111389b);
        String str3 = this.f111392e;
        if (str3 != null) {
            str2 = str3;
        }
        c2.onEventV3("tool_performance_resource_download", a2.a("enter_from", str2).f66730a);
    }

    private d(String str, String str2, com.ss.android.ugc.aweme.music.service.b bVar, String str3) {
        this.f111389b = str;
        this.f111390c = str2;
        this.f111391d = bVar;
        this.f111392e = str3;
        this.f111393g = i.a((h.f.a.a) b.f111395a);
    }

    public /* synthetic */ d(String str, String str2, com.ss.android.ugc.aweme.music.service.b bVar, String str3, byte b2) {
        this(str, str2, bVar, str3);
    }
}
