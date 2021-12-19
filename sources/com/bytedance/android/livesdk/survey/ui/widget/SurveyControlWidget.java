package com.bytedance.android.livesdk.survey.ui.widget;

import android.content.Context;
import androidx.lifecycle.i;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.survey.a.f;
import com.bytedance.android.livesdk.survey.api.SurveyApi;
import com.bytedance.android.livesdk.survey.ui.a;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.h;
import h.z;
import java.util.HashMap;

public final class SurveyControlWidget extends LiveWidget implements a.b, au {

    /* renamed from: a  reason: collision with root package name */
    public a f21590a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.survey.ui.a f21591b;

    /* renamed from: c  reason: collision with root package name */
    public final m<String, Long, z> f21592c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<z> f21593d = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private Room f21594e;

    /* renamed from: f  reason: collision with root package name */
    private final SurveyControlWidget$mActivityLifecycleObserver$1 f21595f = new SurveyControlWidget$mActivityLifecycleObserver$1(this);

    static {
        Covode.recordClassIndex(12739);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f21596a;

        /* renamed from: b  reason: collision with root package name */
        public final DataChannel f21597b;

        /* renamed from: c  reason: collision with root package name */
        private a f21598c;

        /* renamed from: d  reason: collision with root package name */
        private a f21599d;

        /* renamed from: e  reason: collision with root package name */
        private final h f21600e;

        /* renamed from: f  reason: collision with root package name */
        private final h f21601f;

        /* renamed from: g  reason: collision with root package name */
        private a f21602g;

        static {
            Covode.recordClassIndex(12740);
        }

        private final SurveyCardWidget e() {
            return (SurveyCardWidget) this.f21600e.getValue();
        }

        @Override // com.bytedance.android.livesdk.survey.ui.widget.a
        public final void a() {
            a aVar = this.f21602g;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.ui.widget.a
        public final void b() {
            a aVar = this.f21602g;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.ui.widget.a
        public final void c() {
            a aVar = this.f21602g;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.bytedance.android.livesdk.survey.ui.widget.a
        public final void d() {
            a aVar = this.f21602g;
            if (aVar != null) {
                aVar.d();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget$a$a  reason: collision with other inner class name */
        static final class C0475a extends h.f.b.m implements h.f.a.a<SurveyCardWidget> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0475a f21603a = new C0475a();

            static {
                Covode.recordClassIndex(12741);
            }

            C0475a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ SurveyCardWidget invoke() {
                return ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).getSurveyCardWidget();
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<c> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(12742);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ c invoke() {
                boolean z;
                Context context = this.this$0.f21596a;
                DataChannel dataChannel = this.this$0.f21597b;
                Boolean bool = (Boolean) this.this$0.f21597b.b(cp.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                return new c(context, dataChannel, z);
            }
        }

        @Override // com.bytedance.android.livesdk.survey.ui.widget.a
        public final void a(com.bytedance.android.livesdk.survey.a.a aVar) {
            l.d(aVar, "");
            b(aVar);
            a aVar2 = this.f21602g;
            if (aVar2 != null) {
                aVar2.a(aVar);
            }
        }

        private final void b(com.bytedance.android.livesdk.survey.a.a aVar) {
            a aVar2;
            com.bytedance.android.livesdk.survey.a.d dVar = aVar.f21494d;
            l.b(dVar, "");
            if (dVar.f21501a == 2) {
                if (com.bytedance.android.live.u.h.b()) {
                    aVar2 = (c) this.f21601f.getValue();
                } else {
                    aVar2 = this.f21599d;
                }
            } else if (com.bytedance.android.live.u.h.b()) {
                aVar2 = e();
            } else {
                aVar2 = this.f21598c;
            }
            this.f21602g = aVar2;
        }

        public a(Context context, DataChannel dataChannel) {
            a aVar;
            boolean z;
            l.d(context, "");
            l.d(dataChannel, "");
            this.f21596a = context;
            this.f21597b = dataChannel;
            if (!com.bytedance.android.live.u.h.b()) {
                this.f21598c = ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).getSurveyCardWidget();
                Boolean bool = (Boolean) dataChannel.b(cp.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                this.f21599d = new c(context, dataChannel, z);
            }
            this.f21600e = com.bytedance.android.livesdkapi.m.d.a(C0475a.f21603a);
            this.f21601f = com.bytedance.android.livesdkapi.m.d.a(new b(this));
            if (com.bytedance.android.live.u.h.b()) {
                aVar = e();
            } else {
                aVar = this.f21598c;
            }
            this.f21602g = aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a() {
        a aVar = this.f21590a;
        if (aVar == null) {
            l.a("mViewProxy");
        }
        aVar.a();
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void b() {
        a aVar = this.f21590a;
        if (aVar == null) {
            l.a("mViewProxy");
        }
        aVar.b();
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void c() {
        a aVar = this.f21590a;
        if (aVar == null) {
            l.a("mViewProxy");
        }
        aVar.c();
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void d() {
        a aVar = this.f21590a;
        if (aVar == null) {
            l.a("mViewProxy");
        }
        aVar.d();
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SurveyControlWidget this$0;

        static {
            Covode.recordClassIndex(12744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SurveyControlWidget surveyControlWidget) {
            super(0);
            this.this$0 = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.livesdk.survey.ui.a aVar = this.this$0.f21591b;
            if (aVar == null) {
                return null;
            }
            com.bytedance.android.livesdk.survey.ui.a.a aVar2 = aVar.f21528d;
            if (aVar2 != null) {
                aVar2.e();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        androidx.fragment.app.e a2;
        i lifecycle;
        super.onDestroy();
        com.bytedance.android.livesdk.survey.ui.a aVar = this.f21591b;
        if (aVar != null) {
            com.bytedance.android.livesdk.survey.ui.a.a aVar2 = aVar.f21528d;
            if (aVar2 != null) {
                aVar2.b();
            }
            aVar.f21525a.dispose();
        }
        com.bytedance.android.livesdk.survey.ui.a aVar3 = this.f21591b;
        if (aVar3 != null) {
            aVar3.b();
        }
        Context context = this.context;
        if (context != null && (a2 = p.a(context)) != null && (lifecycle = a2.getLifecycle()) != null) {
            lifecycle.b(this.f21595f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        com.bytedance.android.livesdk.survey.ui.a aVar;
        Long l2;
        Long l3;
        androidx.fragment.app.e a2;
        i lifecycle;
        long j2;
        com.bytedance.android.livesdk.survey.ui.a.a aVar2;
        com.bytedance.android.livesdk.survey.ui.a aVar3;
        super.onCreate();
        if (this.dataChannel.b(com.bytedance.android.livesdk.survey.e.class) != null) {
            aVar = (com.bytedance.android.livesdk.survey.ui.a) this.dataChannel.b(com.bytedance.android.livesdk.survey.e.class);
        } else if (this.dataChannel.b(di.class) != null) {
            aVar = new com.bytedance.android.livesdk.survey.ui.a();
        } else {
            return;
        }
        this.f21591b = aVar;
        if (aVar != null) {
            aVar.a((bq) this);
        }
        this.dataChannel.a(com.bytedance.android.livesdk.survey.e.class, this.f21591b);
        this.dataChannel.a(com.bytedance.android.livesdk.survey.c.class, (h.f.a.b) new d(this)).a(com.bytedance.android.livesdk.survey.d.class, (h.f.a.b) new e(this));
        Room room = (Room) this.dataChannel.b(df.class);
        Room room2 = this.f21594e;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        } else {
            l2 = null;
        }
        if (room != null) {
            l3 = Long.valueOf(room.getId());
        } else {
            l3 = null;
        }
        if ((!l.a(l2, l3)) && (aVar3 = this.f21591b) != null) {
            aVar3.f21527c = null;
            aVar3.f21529e = false;
            aVar3.f21530f = false;
        }
        this.f21594e = room;
        Context context = this.context;
        l.b(context, "");
        DataChannel dataChannel = this.dataChannel;
        l.b(dataChannel, "");
        this.f21590a = new a(context, dataChannel);
        com.bytedance.android.livesdk.survey.ui.a aVar4 = this.f21591b;
        if (!(aVar4 == null || (aVar2 = aVar4.f21528d) == null)) {
            aVar2.a();
        }
        com.bytedance.android.livesdk.survey.ui.a aVar5 = this.f21591b;
        if (aVar5 != null) {
            Long l4 = (Long) this.dataChannel.b(di.class);
            if (l4 != null) {
                j2 = l4.longValue();
            } else {
                j2 = 0;
            }
            if (aVar5.f21527c == null) {
                if (aVar5.f21526b) {
                    com.bytedance.android.livesdk.survey.a.a aVar6 = new com.bytedance.android.livesdk.survey.a.a();
                    aVar6.f21491a = "1111";
                    aVar6.f21493c = "thank you";
                    com.bytedance.android.livesdk.survey.a.d dVar = new com.bytedance.android.livesdk.survey.a.d();
                    dVar.f21501a = 2;
                    dVar.f21502b = 2;
                    dVar.f21503c = 3;
                    aVar6.f21494d = dVar;
                    com.bytedance.android.livesdk.survey.a.c cVar = new com.bytedance.android.livesdk.survey.a.c();
                    cVar.f21497a = "9999";
                    cVar.f21498b = "Do you like what you see";
                    com.bytedance.android.livesdk.survey.a.b bVar = new com.bytedance.android.livesdk.survey.a.b();
                    bVar.f21495a = 5001;
                    bVar.f21496b = "Yes";
                    com.bytedance.android.livesdk.survey.a.b bVar2 = new com.bytedance.android.livesdk.survey.a.b();
                    bVar2.f21495a = 5002;
                    bVar2.f21496b = "None";
                    com.bytedance.android.livesdk.survey.a.b bVar3 = new com.bytedance.android.livesdk.survey.a.b();
                    bVar3.f21495a = 5003;
                    bVar3.f21496b = "No";
                    cVar.f21500d = n.b(bVar, bVar2, bVar3);
                    aVar6.f21492b = n.a(cVar);
                    aVar5.f21527c = aVar6;
                    aVar5.a(aVar5.f21527c);
                } else {
                    aVar5.f21525a.a(((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((SurveyApi) com.bytedance.android.live.network.e.a().a(SurveyApi.class)).list(j2).a(new f()).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((androidx.lifecycle.m) aVar5.y))).a(new a.c(aVar5), new a.d(aVar5)));
                }
            }
        }
        Context context2 = this.context;
        if (context2 != null && (a2 = p.a(context2)) != null && (lifecycle = a2.getLifecycle()) != null) {
            lifecycle.a(this.f21595f);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ SurveyControlWidget this$0;

        static {
            Covode.recordClassIndex(12746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SurveyControlWidget surveyControlWidget) {
            super(1);
            this.this$0 = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.f21593d.invoke();
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.survey.b, z> {
        final /* synthetic */ SurveyControlWidget this$0;

        static {
            Covode.recordClassIndex(12745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SurveyControlWidget surveyControlWidget) {
            super(1);
            this.this$0 = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.survey.b bVar) {
            com.bytedance.android.livesdk.survey.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.f21592c.invoke(bVar2.f21512a, Long.valueOf(bVar2.f21513b));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.survey.ui.widget.a
    public final void a(com.bytedance.android.livesdk.survey.a.a aVar) {
        l.d(aVar, "");
        a aVar2 = this.f21590a;
        if (aVar2 == null) {
            l.a("mViewProxy");
        }
        aVar2.a(aVar);
    }

    static final class b extends h.f.b.m implements m<String, Long, z> {
        final /* synthetic */ SurveyControlWidget this$0;

        static {
            Covode.recordClassIndex(12743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SurveyControlWidget surveyControlWidget) {
            super(2);
            this.this$0 = surveyControlWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Long l2) {
            long j2;
            String str2;
            String str3 = str;
            long longValue = l2.longValue();
            l.d(str3, "");
            Long l3 = (Long) this.this$0.dataChannel.b(di.class);
            com.bytedance.android.livesdk.survey.ui.a aVar = this.this$0.f21591b;
            if (aVar != null) {
                if (l3 != null) {
                    j2 = l3.longValue();
                } else {
                    j2 = -1;
                }
                l.d(str3, "");
                f.a aVar2 = new f.a();
                aVar2.f21509a = j2;
                com.bytedance.android.livesdk.survey.a.a aVar3 = aVar.f21527c;
                if (aVar3 != null) {
                    str2 = aVar3.f21491a;
                } else {
                    str2 = null;
                }
                aVar2.f21510b = str2;
                aVar2.f21511c.add(new com.bytedance.android.livesdk.survey.a.e(str3, longValue));
                com.bytedance.android.livesdk.survey.a.f fVar = new com.bytedance.android.livesdk.survey.a.f(aVar2.f21509a, aVar2.f21510b, e.a.f9628b.b(aVar2.f21511c));
                f.a.b.a aVar4 = aVar.f21525a;
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("room_id", Long.valueOf(fVar.f21506a));
                hashMap.put("survey_id", fVar.f21507b);
                hashMap.put("content", fVar.f21508c);
                aVar4.a(((SurveyApi) com.bytedance.android.live.network.e.a().a(SurveyApi.class)).submit(hashMap).a(new com.bytedance.android.livesdk.util.rxutils.f()).g());
            }
            a aVar5 = this.this$0.f21590a;
            if (aVar5 == null) {
                l.a("mViewProxy");
            }
            aVar5.d();
            com.bytedance.android.livesdk.survey.ui.a aVar6 = this.this$0.f21591b;
            if (aVar6 == null) {
                return null;
            }
            com.bytedance.android.livesdk.survey.ui.a.a aVar7 = aVar6.f21528d;
            if (aVar7 != null) {
                aVar7.c();
            }
            aVar6.a(aVar6.a(), a.C0471a.EnumC0472a.SUBMIT, longValue);
            return z.f158842a;
        }
    }
}
