package com.ss.android.ugc.aweme.mix.d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.b.h;
import com.ss.android.ugc.aweme.mix.b.j;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static com.ss.android.ugc.aweme.mix.model.a f109896a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f109897b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(70418);
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.c f109913a;

        static {
            Covode.recordClassIndex(70424);
        }

        public f(com.ss.android.ugc.aweme.mix.api.c cVar) {
            this.f109913a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f109913a.a(false, a.f109896a);
        }
    }

    public static void a(int i2) {
        Keva.getRepo("keva_mixlist_repo_name").storeInt(a("keva_mixlist_num_key"), i2);
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.d f109910a;

        static {
            Covode.recordClassIndex(70422);
        }

        public d(com.ss.android.ugc.aweme.mix.api.d dVar) {
            this.f109910a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            List<com.ss.android.ugc.aweme.mix.model.d> mixList;
            com.ss.android.ugc.aweme.mix.api.d dVar = this.f109910a;
            com.ss.android.ugc.aweme.mix.model.a aVar = a.f109896a;
            if (aVar == null || (mixList = aVar.getMixList()) == null) {
                i2 = 0;
            } else {
                i2 = mixList.size();
            }
            dVar.a(false, i2);
        }
    }

    public static String a(String str) {
        StringBuilder append = new StringBuilder().append(str);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return append.append(g2.getCurUserId()).toString();
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f109905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.a f109906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f109907c;

        static {
            Covode.recordClassIndex(70420);
        }

        b(int i2, com.ss.android.ugc.aweme.mix.api.a aVar, Activity activity) {
            this.f109905a = i2;
            this.f109906b = aVar;
            this.f109907c = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f109905a == MixFeedApi.b.VIDEOADD.getOperation()) {
                this.f109906b.a(false);
            } else {
                this.f109906b.b(false);
            }
            new com.bytedance.tux.g.b(this.f109907c).e(R.string.g21).b();
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f109908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.d f109909b;

        static {
            Covode.recordClassIndex(70421);
        }

        public c(String str, com.ss.android.ugc.aweme.mix.api.d dVar) {
            this.f109908a = str;
            this.f109909b = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<com.ss.android.ugc.aweme.mix.model.d> mixList;
            int i2;
            List<com.ss.android.ugc.aweme.mix.model.d> mixList2;
            com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
            if (aVar != null) {
                a.f109896a = aVar;
                com.ss.android.ugc.aweme.account.b.a();
                IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                l.b(e2, "");
                int i3 = 0;
                if (l.a((Object) e2.getCurUserId(), (Object) this.f109908a)) {
                    com.ss.android.ugc.aweme.mix.model.a aVar2 = a.f109896a;
                    if (aVar2 == null || (mixList2 = aVar2.getMixList()) == null) {
                        i2 = 0;
                    } else {
                        i2 = mixList2.size();
                    }
                    a.a(i2);
                }
                com.ss.android.ugc.aweme.mix.api.d dVar = this.f109909b;
                com.ss.android.ugc.aweme.mix.model.a aVar3 = a.f109896a;
                if (!(aVar3 == null || (mixList = aVar3.getMixList()) == null)) {
                    i3 = mixList.size();
                }
                dVar.a(true, i3);
            }
        }
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f109911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.c f109912b;

        static {
            Covode.recordClassIndex(70423);
        }

        public e(String str, com.ss.android.ugc.aweme.mix.api.c cVar) {
            this.f109911a = str;
            this.f109912b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            List<com.ss.android.ugc.aweme.mix.model.d> mixList;
            com.ss.android.ugc.aweme.mix.model.a aVar = (com.ss.android.ugc.aweme.mix.model.a) obj;
            if (aVar != null) {
                a.f109896a = aVar;
                com.ss.android.ugc.aweme.account.b.a();
                IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                l.b(e2, "");
                if (l.a((Object) e2.getCurUserId(), (Object) this.f109911a)) {
                    com.ss.android.ugc.aweme.mix.model.a aVar2 = a.f109896a;
                    if (aVar2 == null || (mixList = aVar2.getMixList()) == null) {
                        i2 = 0;
                    } else {
                        i2 = mixList.size();
                    }
                    a.a(i2);
                }
                if (aVar.status_code == 0) {
                    this.f109912b.a(true, a.f109896a);
                } else {
                    this.f109912b.a(false, a.f109896a);
                }
            }
        }
    }

    private static String a(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (i2 != list.size() - 1) {
                sb.append(",");
            } else {
                sb.append("]");
            }
            i2++;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.d.a$a  reason: collision with other inner class name */
    public static final class C2815a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f109898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f109899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.a f109900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f109901d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f109902e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f109903f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Aweme f109904g;

        static {
            Covode.recordClassIndex(70419);
        }

        C2815a(int i2, Activity activity, com.ss.android.ugc.aweme.mix.api.a aVar, String str, String str2, String str3, Aweme aweme) {
            this.f109898a = i2;
            this.f109899b = activity;
            this.f109900c = aVar;
            this.f109901d = str;
            this.f109902e = str2;
            this.f109903f = str3;
            this.f109904g = aweme;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            if (((com.ss.android.ugc.aweme.mix.api.response.b) obj).status_code != 0) {
                if (this.f109898a == MixFeedApi.b.VIDEOADD.getOperation()) {
                    this.f109900c.a(false);
                } else {
                    this.f109900c.b(false);
                }
                new com.bytedance.tux.g.b(this.f109899b).e(R.string.g21).b();
            } else if (this.f109898a == MixFeedApi.b.VIDEOADD.getOperation()) {
                new com.bytedance.tux.g.b(this.f109899b).e(R.string.ps).b();
                this.f109900c.a(true);
                String str3 = this.f109901d;
                String str4 = this.f109902e;
                String str5 = this.f109903f;
                Aweme aweme = this.f109904g;
                if (aweme == null || (str2 = aweme.getGroupId()) == null) {
                    str2 = "";
                }
                l.d(str3, "");
                l.d(str4, "");
                l.d(str5, "");
                l.d(str2, "");
                r.a("add_playlist_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str3).a("enter_method", str4).a("playlist_id", str5).a("group_id", str2).f66730a);
            } else {
                new com.bytedance.tux.g.b(this.f109899b).e(R.string.gj3).b();
                String str6 = this.f109901d;
                String str7 = this.f109902e;
                String str8 = this.f109903f;
                Aweme aweme2 = this.f109904g;
                if (aweme2 == null || (str = aweme2.getGroupId()) == null) {
                    str = "";
                }
                l.d(str6, "");
                l.d(str7, "");
                l.d(str8, "");
                l.d(str, "");
                r.a("remove_playlist_video", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str6).a("enter_method", str7).a("playlist_id", str8).a("group_id", str).f66730a);
                if (this.f109899b instanceof MixVideoDetailActivity) {
                    com.ss.android.ugc.d.a.c.a(new j(false, this.f109904g));
                    com.ss.android.ugc.d.a.c.a(new h(this.f109904g));
                    return;
                }
                this.f109900c.b(true);
            }
        }
    }

    public static void a(Activity activity, Aweme aweme, String str, int i2, com.ss.android.ugc.aweme.mix.api.a aVar, String str2, String str3) {
        String aid;
        String aid2;
        l.d(activity, "");
        l.d(str, "");
        l.d(aVar, "");
        l.d(str2, "");
        l.d(str3, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i2 == MixFeedApi.b.VIDEOADD.getOperation()) {
            if (!(aweme == null || (aid2 = aweme.getAid()) == null)) {
                arrayList.add(aid2);
            }
        } else if (!(i2 != MixFeedApi.b.VIDEOREMOVE.getOperation() || aweme == null || (aid = aweme.getAid()) == null)) {
            arrayList2.add(aid);
        }
        l.b(MixFeedApi.a.a().manageMixFeed(i2, str, "", a(arrayList), a(arrayList2), "").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C2815a(i2, activity, aVar, str2, str3, str, aweme), new b(i2, aVar, activity)), "");
    }
}
