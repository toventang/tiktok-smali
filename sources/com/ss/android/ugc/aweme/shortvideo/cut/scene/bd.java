package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.c;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h;
import com.ss.android.ugc.aweme.shortvideo.edit.g;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bd implements bw {

    /* renamed from: a  reason: collision with root package name */
    public final aa.h f125691a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<com.ss.android.ugc.aweme.shortvideo.c> f125692b;

    /* renamed from: c  reason: collision with root package name */
    final Activity f125693c;

    /* renamed from: d  reason: collision with root package name */
    public int f125694d;

    /* renamed from: e  reason: collision with root package name */
    boolean f125695e;

    /* renamed from: f  reason: collision with root package name */
    public int f125696f;

    /* renamed from: g  reason: collision with root package name */
    int f125697g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f125698h;

    /* renamed from: i  reason: collision with root package name */
    public be f125699i;

    /* renamed from: j  reason: collision with root package name */
    public String f125700j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f125701k;

    /* renamed from: l  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.c f125702l;

    /* renamed from: m  reason: collision with root package name */
    private final g f125703m = new g();
    private final e n;

    static {
        Covode.recordClassIndex(82548);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final a b() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final aa.h c() {
        return this.f125691a;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ bd this$0;

        static {
            Covode.recordClassIndex(82551);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(bd bdVar) {
            super(0);
            this.this$0 = bdVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            be beVar = this.this$0.f125699i;
            if (beVar != null) {
                beVar.a(null, "");
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final com.ss.android.ugc.aweme.shortvideo.c a() {
        com.ss.android.ugc.aweme.shortvideo.c cVar = this.f125702l;
        if (cVar != null) {
            return cVar;
        }
        if (k.a(this.f125692b)) {
            return null;
        }
        aa.h hVar = this.f125691a;
        if (hVar == null) {
            l.b();
        }
        return b(hVar.a());
    }

    public final void d() {
        be beVar = this.f125699i;
        if (beVar != null) {
            beVar.a(null, "");
        }
        this.f125698h = false;
        this.f125695e = false;
        be beVar2 = this.f125699i;
        if (beVar2 != null) {
            beVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final void e() {
        List<VideoSegment> list;
        StringBuilder sb = new StringBuilder();
        be beVar = this.f125699i;
        if (beVar != null) {
            list = beVar.e();
        } else {
            list = null;
        }
        int i2 = 0;
        if (!k.a(list) && !k.a(list)) {
            if (list == null) {
                l.b();
            }
            int size = list.size();
            while (i2 < size) {
                sb.append(list.get(i2).f125478b);
                if (i2 < size - 1) {
                    sb.append(",");
                }
                i2++;
            }
            i2 = size;
        }
        be beVar2 = this.f125699i;
        if (beVar2 != null) {
            beVar2.b();
        }
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g.f125947a.a(i2, sb.toString(), new d(this));
    }

    public static final class c implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bd f125705a;

        static {
            Covode.recordClassIndex(82552);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(bd bdVar) {
            this.f125705a = bdVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            if (!z) {
                this.f125705a.d();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b
        public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            String str;
            be beVar;
            if (z) {
                bd bdVar = this.f125705a;
                if (!bdVar.f125695e || bdVar.f125696f != -1) {
                    bdVar.f125697g = bdVar.f125696f;
                    if (bdVar.f125694d == 0) {
                        bdVar.f125702l = null;
                        aa.h hVar = bdVar.f125691a;
                        if (hVar == null) {
                            l.b();
                        }
                        hVar.b(bdVar.f125691a.b());
                    } else {
                        bdVar.f125702l = cVar;
                        aa.h hVar2 = bdVar.f125691a;
                        if (hVar2 == null) {
                            l.b();
                        }
                        hVar2.b(-1);
                    }
                    if (l.a((Object) bdVar.f125700j, (Object) "sync_page_favorite")) {
                        str = "favorite";
                    } else {
                        str = "recommend";
                    }
                    if (bdVar.f125701k) {
                        int i2 = bdVar.f125696f;
                        l.d(str, "");
                        if (cVar != null) {
                            r.a("select_music", h.a().a("content_source", "upload").a("content_type", "sound_sync").a("music_id", cVar.getMusicId()).a("music_show_rank", i2 + 1).a("music_rec_type", "").a("tab_name", str).f149193a);
                        }
                        bdVar.f125701k = false;
                    }
                } else {
                    bdVar.f125702l = null;
                    ArrayList<com.ss.android.ugc.aweme.shortvideo.c> arrayList = bdVar.f125692b;
                    if (cVar == null) {
                        l.b();
                    }
                    arrayList.add(0, cVar);
                    aa.h hVar3 = bdVar.f125691a;
                    if (hVar3 == null) {
                        l.b();
                    }
                    hVar3.a(cVar);
                    bdVar.f125691a.a(bdVar.f125691a.a() + 1);
                    bdVar.f125691a.b(0);
                    if (cVar != null) {
                        if (AVCommerceServiceImpl.h().a()) {
                            h.a().a("is_commercial", "1");
                        }
                        r.a("change_music", h.a().a("content_source", "upload").a("content_type", "sound_sync").a("music_id", cVar.getMusicId()).a("music_rec_type", "").a("creation_duration", cVar.duration).f149193a);
                    }
                    bdVar.f125697g = 0;
                }
                be beVar2 = bdVar.f125699i;
                if (beVar2 != null) {
                    beVar2.a(cVar, bdVar.f125700j);
                }
                if (!(bdVar.f125696f == -1 || (beVar = bdVar.f125699i) == null)) {
                    beVar.a(bdVar.f125696f + 1);
                }
                bdVar.f125698h = false;
                bdVar.f125695e = false;
                return;
            }
            this.f125705a.d();
        }
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bd f125706a;

        static {
            Covode.recordClassIndex(82553);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(bd bdVar) {
            this.f125706a = bdVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c
        public final void a(Exception exc) {
            be beVar = this.f125706a.f125699i;
            if (beVar != null) {
                beVar.c();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c
        public final void a(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
            if (k.a(list)) {
                be beVar = this.f125706a.f125699i;
                if (beVar != null) {
                    beVar.c();
                    return;
                }
                return;
            }
            bd bdVar = this.f125706a;
            if (list == null) {
                l.b();
            }
            bdVar.b(n.g((Collection) list));
        }
    }

    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bd f125707a;

        static {
            Covode.recordClassIndex(82554);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(bd bdVar) {
            this.f125707a = bdVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final void a(be beVar) {
        l.d(beVar, "");
        this.f125699i = beVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bw
    public final void a(List<com.ss.android.ugc.aweme.shortvideo.c> list) {
        if (k.a(list)) {
            e();
        } else {
            b(list);
        }
    }

    private final com.ss.android.ugc.aweme.shortvideo.c b(int i2) {
        if (!k.a(this.f125692b) && i2 >= 0 && i2 < this.f125692b.size()) {
            return this.f125692b.get(i2);
        }
        return null;
    }

    public bd(Context context) {
        l.d(context, "");
        ArrayList<com.ss.android.ugc.aweme.shortvideo.c> arrayList = new ArrayList<>();
        this.f125692b = arrayList;
        this.f125693c = (Activity) context;
        this.f125696f = -1;
        this.f125697g = -1;
        this.f125700j = "sync_page_recommend";
        this.f125691a = com.ss.android.ugc.aweme.port.in.l.f115658a.b().a(arrayList, new j(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.scene.bd.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bd f125704a;

            static {
                Covode.recordClassIndex(82549);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f125704a = r1;
            }

            @Override // com.ss.android.ugc.aweme.cz.a.j
            public final void a(View view, int i2) {
                l.d(view, "");
                if (!this.f125704a.f125698h) {
                    this.f125704a.f125701k = true;
                    this.f125704a.f125696f = i2;
                    this.f125704a.a(i2);
                    this.f125704a.f125700j = "sync_page_recommend";
                }
            }
        });
        this.n = new e(this);
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        be beVar = this.f125699i;
        if (beVar != null) {
            beVar.h();
        }
        this.f125698h = true;
        com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(this.f125693c, cVar, new c(this));
    }

    public final void b(List<com.ss.android.ugc.aweme.shortvideo.c> list) {
        be beVar = this.f125699i;
        if (beVar != null) {
            beVar.d();
        }
        aa.h hVar = this.f125691a;
        if (hVar == null) {
            l.b();
        }
        hVar.d();
        ArrayList<com.ss.android.ugc.aweme.shortvideo.c> arrayList = this.f125692b;
        if (list == null) {
            l.b();
        }
        arrayList.addAll(list);
        this.f125691a.a(list);
        a(0);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.cz.a.d, z> {
        final /* synthetic */ bd this$0;

        static {
            Covode.recordClassIndex(82550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(bd bdVar) {
            super(1);
            this.this$0 = bdVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.cz.a.d dVar) {
            int i2;
            be beVar;
            com.ss.android.ugc.aweme.cz.a.d dVar2 = dVar;
            l.d(dVar2, "");
            if (dVar2.f79325c != null) {
                bd bdVar = this.this$0;
                com.ss.android.ugc.aweme.shortvideo.c cVar = dVar2.f79325c;
                if (cVar == null) {
                    bdVar.f125695e = false;
                } else {
                    if (!TextUtils.isEmpty(cVar.getMusicId())) {
                        int size = bdVar.f125692b.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            } else if (l.a((Object) cVar.getMusicId(), (Object) bdVar.f125692b.get(i2).getMusicId())) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        f.a(cVar);
                        bdVar.a(cVar);
                    } else {
                        if (com.ss.android.ugc.aweme.shortvideo.af.b.a(cVar.getPath(), bdVar.f125693c)) {
                            int size2 = bdVar.f125692b.size();
                            i2 = 0;
                            while (true) {
                                if (i2 >= size2) {
                                    break;
                                } else if (l.a((Object) cVar.getPath(), (Object) bdVar.f125692b.get(i2).getPath())) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        f.a(cVar);
                        bdVar.a(cVar);
                    }
                    if (i2 != -1) {
                        if (i2 == bdVar.f125697g) {
                            if (!(bdVar.f125696f == -1 || (beVar = bdVar.f125699i) == null)) {
                                beVar.a(bdVar.f125696f + 1);
                            }
                            be beVar2 = bdVar.f125699i;
                            if (beVar2 != null) {
                                beVar2.a(null, "");
                            }
                            bdVar.f125695e = false;
                        } else {
                            bdVar.f125696f = i2;
                            bdVar.a(i2);
                        }
                    }
                    f.a(cVar);
                    bdVar.a(cVar);
                }
            } else {
                be beVar3 = this.this$0.f125699i;
                if (beVar3 != null) {
                    beVar3.a(null, "");
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        if (i2 == -1) {
            this.f125700j = "sync_page_lib ";
            Activity activity = this.f125693c;
            com.ss.android.ugc.aweme.port.in.l.f115658a.b().a(activity, 110, c.a.a(activity.getString(R.string.ab8), 0, false, (Bundle) null, "", "", false, true, false, 512), new a(this), new b(this));
            be beVar = this.f125699i;
            if (beVar != null) {
                beVar.g();
            }
            this.f125695e = true;
            return;
        }
        this.f125700j = "sync_page_recommend";
        com.ss.android.ugc.aweme.shortvideo.c b2 = b(i2);
        aa.h hVar = this.f125691a;
        if (hVar == null) {
            l.b();
        }
        if (hVar.a() != this.f125691a.b() || this.f125691a.a() != i2) {
            this.f125691a.a(i2, false);
            this.f125691a.c();
            be beVar2 = this.f125699i;
            if (beVar2 != null) {
                beVar2.f();
            }
            a(b2);
        }
    }
}
