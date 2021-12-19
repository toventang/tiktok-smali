package com.ss.android.ugc.aweme.experiment;

import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.interest.InterestApi;
import com.ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Arrays;

public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public static final String f89882a = "";

    /* renamed from: b  reason: collision with root package name */
    public static final String f89883b = "InterestSelectExperiment";

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f89884c;

    /* renamed from: d  reason: collision with root package name */
    static final Keva f89885d = Keva.getRepo("interest_select");

    /* renamed from: e  reason: collision with root package name */
    public static final h f89886e = i.a((h.f.a.a) a.f89895a);

    /* renamed from: f  reason: collision with root package name */
    public static int f89887f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f89888g = true;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f89889h;

    /* renamed from: i  reason: collision with root package name */
    static volatile Aweme f89890i;

    /* renamed from: j  reason: collision with root package name */
    public static final ea f89891j = new ea();

    /* renamed from: k  reason: collision with root package name */
    private static final String f89892k = "{\"group\": 1,\"start_index\": 4,\"skip_n\": 3,\"skip_s\": 3}";

    /* renamed from: l  reason: collision with root package name */
    private static final String f89893l = "{\"group\": 2,\"skip_n\": 3,\"skip_s\": 3}";

    /* renamed from: m  reason: collision with root package name */
    private static final String f89894m = "interest_select";
    private static final String n = "keva_key_video_seen_once";
    private static final String o = "keva_key_video_seen_once_new";
    private static final boolean p = com.bytedance.ies.abmock.b.a().a(true, "user_interest_show_strategy_android_mock", false);
    private static final dz q;
    private static final h r = i.a((h.f.a.a) b.f89896a);

    private ea() {
    }

    public static int b() {
        try {
            dz dzVar = q;
            if (dzVar != null) {
                return dzVar.f89872a;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int c() {
        try {
            dz dzVar = q;
            if (dzVar != null) {
                return dzVar.f89873b;
            }
            return 4;
        } catch (Throwable unused) {
            return 4;
        }
    }

    public static int g() {
        try {
            dz dzVar = q;
            if (dzVar != null) {
                return dzVar.f89875d;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    public static int h() {
        try {
            dz dzVar = q;
            if (dzVar != null) {
                return dzVar.f89874c;
            }
            return 3;
        } catch (Throwable unused) {
            return 3;
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89896a = new b();

        static {
            Covode.recordClassIndex(56447);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(ea.f89885d.getBoolean(ea.a(), true));
        }
    }

    public static boolean d() {
        return ((Boolean) r.getValue()).booleanValue();
    }

    public final boolean e() {
        if (b() == 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (b() == 2) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<InterestApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89895a = new a();

        static {
            Covode.recordClassIndex(56446);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ InterestApi invoke() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(InterestApi.class);
            l.b(create, "");
            return create;
        }
    }

    public static String a() {
        boolean z;
        Integer num;
        try {
            dz dzVar = q;
            if (dzVar != null) {
                num = Integer.valueOf(dzVar.f89878g);
            } else {
                num = null;
            }
            z = l.a((Object) num, (Object) 1);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return o;
        }
        return n;
    }

    static {
        Covode.recordClassIndex(56445);
        String a2 = com.bytedance.ies.abmock.b.a().a(false, "user_interest_show_strategy", "");
        GsonProvider c2 = GsonHolder.c();
        l.b(c2, "");
        dz dzVar = (dz) c2.b().a(a2, dz.class);
        com.ss.android.ugc.aweme.framework.a.a.b(4, "InterestSelectExperiment", "get experiment,raw:" + a2 + ",end:" + dzVar);
        q = dzVar;
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89898a = new d();

        static {
            Covode.recordClassIndex(56449);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
        }
    }

    public static void a(Context context) {
        if (!(context instanceof e) || f89890i == null) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, f89883b, "not insert cause aweme is null or other reason,just ignore");
            return;
        }
        r.a("enable_interest_lable", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").a("user_id", com.ss.android.ugc.aweme.feed.interest.a.a()).f66730a);
        Aweme aweme = f89890i;
        if (aweme != null) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, f89883b, "insert aid:" + aweme.getAid());
            InterestViewModel.a.a((e) context).f93520a.postValue(aweme);
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89897a = new c();

        static {
            Covode.recordClassIndex(56448);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            Integer num2;
            com.ss.android.ugc.aweme.feed.interest.a.a aVar = (com.ss.android.ugc.aweme.feed.interest.a.a) obj;
            String str = null;
            if (aVar == null || (num2 = aVar.f93512a) == null || num2.intValue() != 0) {
                StringBuilder append = new StringBuilder().append(ea.f89883b).append(",status:");
                if (aVar != null) {
                    num = aVar.f93512a;
                } else {
                    num = null;
                }
                StringBuilder append2 = append.append(num).append(",msg:");
                if (aVar != null) {
                    str = aVar.f93513b;
                }
                String sb = append2.append(str).toString();
                com.ss.android.ugc.aweme.framework.a.a.b(6, ea.f89883b, sb);
                throw new RuntimeException(sb);
            }
            com.ss.android.ugc.aweme.framework.a.a.b(4, ea.f89883b, "request ok");
            Aweme aweme = aVar.f93515d;
            if (aweme != null && aweme.getAid() != null && aVar.f93514c != null) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, ea.f89883b, "requestId:" + aVar.getRequestId() + ",logPb:" + aVar.f93518g);
                aVar.setRequestId("user_interest_show_strategy");
                ac.a.f91473a.a(aVar.getRequestId(), aVar.f93518g);
                k.a(Arrays.asList(aVar.f93515d), aVar.getRequestId(), 0);
                ea.f89890i = aVar.f93515d;
                if (ea.f89891j.e()) {
                    ea.a(com.bytedance.ies.ugc.appcontext.f.j());
                }
            }
        }
    }
}
