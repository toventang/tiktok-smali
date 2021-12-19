package com.ss.android.ugc.aweme.kids.commonfeed.report;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.commonfeed.report.api.ReportApi;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static List<com.ss.android.ugc.aweme.kids.commonfeed.report.a.a> f106167a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static Set<Integer> f106168b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.d f106169c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f106170d = new b();

    private b() {
    }

    public static boolean a() {
        if (!f106168b.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.d d() {
        com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.d dVar = f106169c;
        if (dVar == null) {
            l.a("reportReasonReasonList");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(67892);
    }

    public static String b() {
        String arrayList = new ArrayList(f106168b).toString();
        l.b(arrayList, "");
        return arrayList;
    }

    public static void c() {
        com.ss.android.ugc.aweme.kids.common.c.f.a("submit_report_reason", new com.ss.android.ugc.aweme.app.f.c().a("object_type", "video").a("is_success", (Integer) 0).a("reason_id", b()).a());
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$b  reason: collision with other inner class name */
    static final class C2708b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f106174a;

        static {
            Covode.recordClassIndex(67894);
        }

        C2708b(long j2) {
            this.f106174a = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.c();
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_report", -1, -1, this.f106174a);
        }
    }

    public static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ String $aid;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $ownerId;

        static {
            Covode.recordClassIndex(67898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Context context, String str, String str2) {
            super(1);
            this.$context = context;
            this.$aid = str;
            this.$ownerId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(R.string.ctm, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.kids.commonfeed.report.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(67899);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    if (b.a()) {
                        aVar2.f44816b = true;
                        Context context = this.this$0.$context;
                        while (true) {
                            if (context != null) {
                                if (!(context instanceof Activity)) {
                                    if (!(context instanceof ContextWrapper)) {
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                } else {
                                    Activity activity = (Activity) context;
                                    if (activity != null) {
                                        String str = this.this$0.$aid;
                                        String str2 = this.this$0.$ownerId;
                                        Object obj = new ArrayList(b.f106168b).get(0);
                                        l.b(obj, "");
                                        int intValue = ((Number) obj).intValue();
                                        String b2 = b.b();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long parseLong = Long.parseLong(str);
                                        long parseLong2 = Long.parseLong(str2);
                                        l.d("video", "");
                                        l.d(b2, "");
                                        ReportApi.f106165a.reportAwame("video", parseLong, parseLong2, intValue, b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(activity, str, currentTimeMillis), new C2708b(currentTimeMillis));
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        b.d().setErrorVisibility(false);
                        com.ss.android.ugc.aweme.kids.common.c.f.a("report_reason_error", new com.ss.android.ugc.aweme.app.f.c().a("object_type", "video").a());
                        aVar2.f44816b = false;
                    }
                    return z.f158842a;
                }
            });
            dVar2.b(R.string.cto, AnonymousClass2.f106177a);
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f106178a = new e();

        static {
            Covode.recordClassIndex(67901);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            com.bytedance.tux.dialog.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f44794a.getAction() instanceof com.bytedance.tux.dialog.b.d) {
                g action = aVar2.f44794a.getAction();
                Objects.requireNonNull(action, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                ((com.bytedance.tux.dialog.b.d) action).f44828a.get(0).a(AnonymousClass1.f106179a);
            }
            return z.f158842a;
        }
    }

    public static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f106180a = new f();

        static {
            Covode.recordClassIndex(67903);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            com.bytedance.tux.dialog.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f44884j == null) {
                com.ss.android.ugc.aweme.kids.common.c.f.a("cancel_report_reason", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "dismiss page").a());
            }
            return z.f158842a;
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f106171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f106172b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f106173c;

        static {
            Covode.recordClassIndex(67893);
        }

        a(Context context, String str, long j2) {
            this.f106171a = context;
            this.f106172b = str;
            this.f106173c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((BaseResponse) obj).status_code == 0) {
                Context context = this.f106171a;
                String str = this.f106172b;
                while (true) {
                    if (context != null) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            Activity activity = (Activity) context;
                            if (activity != null) {
                                new com.bytedance.tux.g.b(activity).e(R.string.ctn).b();
                                ReportAwemeManager.a().a(str);
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.common.b.b(str));
                                com.ss.android.ugc.aweme.kids.common.c.f.a("submit_report_reason", new com.ss.android.ugc.aweme.app.f.c().a("object_type", "video").a("is_success", (Integer) 1).a("reason_id", b.b()).a());
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                b.c();
            }
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_report", -1, 0, this.f106173c);
        }
    }

    public static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ com.bytedance.tux.dialog.a $dialog;
        final /* synthetic */ com.ss.android.ugc.aweme.kids.commonfeed.report.a.a $item;

        static {
            Covode.recordClassIndex(67895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.ss.android.ugc.aweme.kids.commonfeed.report.a.a aVar, com.bytedance.tux.dialog.a aVar2) {
            super(1);
            this.$item = aVar;
            this.$dialog = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                b.f106168b.add(Integer.valueOf(this.$item.f106164e));
            } else if (b.f106168b.contains(Integer.valueOf(this.$item.f106164e))) {
                b.f106168b.remove(Integer.valueOf(this.$item.f106164e));
            }
            if (!b.a()) {
                if (this.$dialog.f44794a.getAction() instanceof com.bytedance.tux.dialog.b.d) {
                    g action = this.$dialog.f44794a.getAction();
                    Objects.requireNonNull(action, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                    ((com.bytedance.tux.dialog.b.d) action).f44828a.get(0).a(AnonymousClass1.f106175a);
                }
            } else if (this.$dialog.f44794a.getAction() instanceof com.bytedance.tux.dialog.b.d) {
                g action2 = this.$dialog.f44794a.getAction();
                Objects.requireNonNull(action2, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                ((com.bytedance.tux.dialog.b.d) action2).f44828a.get(0).a(AnonymousClass2.f106176a);
            }
            return z.f158842a;
        }
    }
}
