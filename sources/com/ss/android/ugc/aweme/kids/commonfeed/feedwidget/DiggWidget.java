package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.kids.common.c.e;
import com.ss.android.ugc.aweme.kids.commonfeed.digg.DiggApi;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class DiggWidget extends AbsFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106047a = new a((byte) 0);

    static {
        Covode.recordClassIndex(67841);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67842);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, i, j {

        /* renamed from: a  reason: collision with root package name */
        public DiggAnimationView f106048a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f106049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f106050c;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f106051j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f106052k;

        /* renamed from: l  reason: collision with root package name */
        private int f106053l;

        /* renamed from: m  reason: collision with root package name */
        private long f106054m;

        static {
            Covode.recordClassIndex(67843);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "like";
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(91, new g(b.class, "onChangeDiggEvent", com.ss.android.ugc.aweme.kids.common.b.a.class, ThreadMode.MAIN, 0, false));
            return hashMap;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
            EventBus.a().b(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$b$b  reason: collision with other inner class name */
        public static final class C2703b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f106058a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f106059b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f106060c;

            static {
                Covode.recordClassIndex(67845);
            }

            C2703b(b bVar, int i2, long j2) {
                this.f106058a = bVar;
                this.f106059b = i2;
                this.f106060c = j2;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f106058a.b(this.f106059b);
                e.a("kids_api_digg", -1, -1, this.f106060c);
            }
        }

        private static String a(long j2) {
            if (j2 <= 0) {
                return "0";
            }
            return com.ss.android.ugc.aweme.i18n.b.a(j2);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
            if (dataCenter != null) {
                dataCenter.a("digg_aweme", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            }
        }

        public final void a(int i2) {
            long currentTimeMillis = System.currentTimeMillis();
            Aweme aweme = this.f106099d;
            l.b(aweme, "");
            DiggApi.a(aweme.getAid(), i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, i2, currentTimeMillis), new C2703b(this, i2, currentTimeMillis));
        }

        public final void b(int i2) {
            int i3;
            Context context;
            int i4 = 1;
            if (i2 == 1) {
                i3 = R.string.b7d;
            } else {
                i3 = R.string.h48;
            }
            View view = this.f106050c;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(i3).a();
            a(!this.f106049b);
            Aweme aweme = this.f106099d;
            l.b(aweme, "");
            if (i2 == 1) {
                i4 = 0;
            }
            aweme.setUserDigg(i4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
            if (bVar2 != null && l.a((Object) bVar2.f67014a, (Object) "digg_aweme") && !this.f106049b) {
                DiggAnimationView diggAnimationView = this.f106048a;
                if (diggAnimationView != null) {
                    diggAnimationView.g();
                }
                if (KidsAccountServiceImpl.h().a()) {
                    a(1);
                    Aweme aweme = this.f106099d;
                    l.b(aweme, "");
                    aweme.setUserDigg(1);
                }
                a(true);
                a("click_double_like");
            }
        }

        /* access modifiers changed from: package-private */
        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f106055a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f106056b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f106057c;

            static {
                Covode.recordClassIndex(67844);
            }

            a(b bVar, int i2, long j2) {
                this.f106055a = bVar;
                this.f106056b = i2;
                this.f106057c = j2;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                if (((BaseResponse) obj).status_code != 0) {
                    this.f106055a.b(this.f106056b);
                } else if (this.f106055a.f106104i.equals("like")) {
                    Aweme aweme = this.f106055a.f106099d;
                    l.b(aweme, "");
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    boolean z = true;
                    if (this.f106056b != 1) {
                        z = false;
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.common.b.a(aid, z));
                }
                e.a("kids_api_digg", -1, 0, this.f106057c);
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f106061a;

            static {
                Covode.recordClassIndex(67846);
            }

            c(b bVar) {
                this.f106061a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (KidsAccountServiceImpl.h().a()) {
                    if (!this.f106061a.f106049b) {
                        DiggAnimationView diggAnimationView = this.f106061a.f106048a;
                        if (diggAnimationView != null) {
                            diggAnimationView.g();
                        }
                        this.f106061a.a(1);
                        this.f106061a.a(true);
                        this.f106061a.a("click_like");
                        Aweme aweme = this.f106061a.f106099d;
                        l.b(aweme, "");
                        aweme.setUserDigg(1);
                        return;
                    }
                    DiggAnimationView diggAnimationView2 = this.f106061a.f106048a;
                    if (diggAnimationView2 != null) {
                        diggAnimationView2.g();
                    }
                    this.f106061a.a(0);
                    this.f106061a.a(false);
                    Aweme aweme2 = this.f106061a.f106099d;
                    l.b(aweme2, "");
                    aweme2.setUserDigg(0);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            MethodCollector.i(7934);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ad1, (ViewGroup) null);
                this.f106051j = (LinearLayout) inflate.findViewById(R.id.c_r);
                this.f106048a = (DiggAnimationView) inflate.findViewById(R.id.bn4);
                this.f106052k = (TextView) inflate.findViewById(R.id.f1x);
                EventBus.a(EventBus.a(), this);
                LinearLayout linearLayout = this.f106051j;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new c(this));
                }
                frameLayout.addView(inflate);
            }
            MethodCollector.o(7934);
        }

        @r(a = ThreadMode.MAIN)
        public final void onChangeDiggEvent(com.ss.android.ugc.aweme.kids.common.b.a aVar) {
            long j2;
            AwemeStatistics statistics;
            l.d(aVar, "");
            Aweme aweme = this.f106099d;
            l.b(aweme, "");
            if (TextUtils.equals(aweme.getAid(), aVar.f105881a)) {
                Aweme aweme2 = this.f106099d;
                if (aweme2 == null || (statistics = aweme2.getStatistics()) == null) {
                    j2 = 0;
                } else {
                    j2 = statistics.getDiggCount();
                }
                this.f106054m = j2;
                Aweme aweme3 = this.f106099d;
                l.b(aweme3, "");
                this.f106053l = aweme3.getUserDigg();
                Aweme aweme4 = this.f106099d;
                l.b(aweme4, "");
                int userDigg = aweme4.getUserDigg();
                boolean z = true;
                if (userDigg != 1) {
                    z = false;
                }
                a(z);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
            long j2;
            AwemeStatistics statistics;
            super.a(aVar);
            Aweme aweme = this.f106099d;
            if (aweme == null || (statistics = aweme.getStatistics()) == null) {
                j2 = 0;
            } else {
                j2 = statistics.getDiggCount();
            }
            this.f106054m = j2;
            Aweme aweme2 = this.f106099d;
            l.b(aweme2, "");
            this.f106053l = aweme2.getUserDigg();
            Aweme aweme3 = this.f106099d;
            l.b(aweme3, "");
            int userDigg = aweme3.getUserDigg();
            boolean z = true;
            if (userDigg != 1) {
                z = false;
            }
            a(z);
        }

        public final void a(String str) {
            String str2;
            String str3;
            com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", this.f106104i).a("enter_method", str);
            Aweme aweme = this.f106099d;
            String str4 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.app.f.c a3 = a2.a("group_id", str2);
            Aweme aweme2 = this.f106099d;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.app.f.c a4 = a3.a("author_id", str3);
            Aweme aweme3 = this.f106099d;
            if (aweme3 != null) {
                str4 = aweme3.getLogPbString();
            }
            com.ss.android.ugc.aweme.kids.common.c.f.a("like", a4.a("log_pb", str4).a());
        }

        public final void a(boolean z) {
            long j2;
            this.f106049b = z;
            DiggAnimationView diggAnimationView = this.f106048a;
            if (diggAnimationView != null) {
                diggAnimationView.setSelected(z);
            }
            if (!z) {
                if (this.f106053l == 1) {
                    Aweme aweme = this.f106099d;
                    l.b(aweme, "");
                    if (!aweme.isDelete()) {
                        j2 = this.f106054m - 1;
                    }
                }
                j2 = this.f106054m;
            } else if (this.f106053l == 1) {
                if (this.f106054m < 1) {
                    Aweme aweme2 = this.f106099d;
                    l.b(aweme2, "");
                    if (!aweme2.isDelete()) {
                        this.f106054m = 1;
                    }
                }
                j2 = this.f106054m;
            } else {
                j2 = 1 + this.f106054m;
            }
            if (j2 < 0) {
                j2 = 0;
            }
            try {
                if (this.f106099d != null) {
                    Aweme aweme3 = this.f106099d;
                    l.b(aweme3, "");
                    if (aweme3.isDelete() && j2 == 0) {
                        TextView textView = this.f106052k;
                        if (textView != null) {
                            textView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                }
                TextView textView2 = this.f106052k;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.f106052k;
                if (textView3 != null) {
                    textView3.setText(a(j2));
                }
            } catch (Exception e2) {
                TextView textView4 = this.f106052k;
                if (textView4 != null) {
                    textView4.setText(a(0L));
                }
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                e2.printStackTrace();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view, View view2) {
            super(view2);
            this.f106050c = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new b(view, view);
    }
}
