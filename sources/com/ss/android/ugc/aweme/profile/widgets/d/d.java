package com.ss.android.ugc.aweme.profile.widgets.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.f.w;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.at;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class d extends com.bytedance.assem.arch.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f117727l = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public String f117728j = "";

    /* renamed from: k  reason: collision with root package name */
    public ProfileLiveEventView f117729k;

    /* renamed from: m  reason: collision with root package name */
    private final i f117730m = new i(bQ_(), new a(this, null));
    private long n;

    static {
        Covode.recordClassIndex(76215);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76217);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.d.d.a.invoke():java.lang.Object");
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            this.this$0.a((List<LiveEventStruct>) null);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$d  reason: collision with other inner class name */
    static final class C2992d extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2992d(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            List<LiveEventStruct> list;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                T t2 = aVar2.f25631b;
                if (t2 != null) {
                    list = t2.getLiveEventStructList();
                } else {
                    list = null;
                }
                this.this$0.a(list);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (!(view instanceof ProfileLiveEventView)) {
            view = null;
        }
        this.f117729k = (ProfileLiveEventView) view;
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), e.f117734a, new C2992d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), f.f117735a, new e(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), g.f117736a, new f(this));
    }

    public static final class c implements ProfileLiveEventView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f117731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f117732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f117733c;

        static {
            Covode.recordClassIndex(76218);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView.b
        public final void a(LiveEventStruct liveEventStruct) {
            androidx.fragment.app.e b2;
            androidx.fragment.app.i supportFragmentManager;
            User user;
            LiveEventStruct liveEventStruct2;
            l.d(liveEventStruct, "");
            List list = this.f117732b;
            boolean z = true;
            int i2 = 0;
            if (list == null || list.size() != 1) {
                List list2 = this.f117732b;
                if (!(list2 == null || list2.size() <= 0 || (b2 = com.bytedance.assem.arch.extensions.b.b(this.f117731a)) == null || (supportFragmentManager = b2.getSupportFragmentManager()) == null)) {
                    at.a.a(supportFragmentManager, this.f117733c, this.f117732b);
                }
            } else {
                w.a(this.f117731a.ar_(), liveEventStruct);
            }
            com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this.f117731a, ab.a(j.class));
            if (iVar != null && (user = iVar.f117705a) != null) {
                List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
                if (liveEventStructList == null || (liveEventStruct2 = liveEventStructList.get(0)) == null || !liveEventStruct2.isPaidEvent()) {
                    z = false;
                }
                String str = this.f117731a.f117728j;
                List list3 = this.f117732b;
                if (list3 != null) {
                    i2 = list3.size();
                }
                y.a(str, "click", i2, y.a(user), z);
            }
        }

        c(d dVar, List list, User user) {
            this.f117731a = dVar;
            this.f117732b = list;
            this.f117733c = user;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(76220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
            if (r1 != null) goto L_0x004b;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends java.lang.Boolean> r6) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.d.d.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(List<LiveEventStruct> list) {
        boolean z;
        String str;
        ProfileLiveEventView profileLiveEventView;
        LiveEventStruct liveEventStruct;
        boolean z2;
        int i2;
        LiveEventStruct liveEventStruct2;
        LiveEventStruct liveEventStruct3;
        com.ss.android.ugc.aweme.profile.widgets.common.i iVar = (com.ss.android.ugc.aweme.profile.widgets.common.i) com.bytedance.assem.arch.service.d.f(this, ab.a(j.class));
        User user = null;
        if (iVar != null) {
            user = iVar.f117705a;
        }
        if (list == null || list.isEmpty() || in.d()) {
            z = false;
        } else {
            z = true;
        }
        if (list == null || (liveEventStruct3 = list.get(0)) == null || (str = liveEventStruct3.getId()) == null) {
            str = "";
        }
        this.f117728j = str;
        if (!(user == null || !z || (profileLiveEventView = this.f117729k) == null)) {
            c cVar = new c(this, list, user);
            l.d(cVar, "");
            if (!(list == null || (liveEventStruct = list.get(0)) == null || TextUtils.isEmpty(liveEventStruct.getId()))) {
                TextView textView = profileLiveEventView.f117312b;
                Context context = profileLiveEventView.getContext();
                l.b(context, "");
                Resources resources = context.getResources();
                Object[] objArr = new Object[1];
                String e2 = aa.a.e(liveEventStruct.getStartTime());
                if (gb.a(profileLiveEventView.getContext())) {
                    e2 = "‏".concat(String.valueOf(e2));
                }
                objArr[0] = e2;
                textView.setText(resources.getString(R.string.bqi, objArr));
                profileLiveEventView.f117311a.setOnClickListener(new ProfileLiveEventView.c(cVar, liveEventStruct));
                if (System.currentTimeMillis() - this.n > 500) {
                    List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
                    if (liveEventStructList == null || (liveEventStruct2 = liveEventStructList.get(0)) == null) {
                        z2 = false;
                    } else {
                        z2 = liveEventStruct2.isPaidEvent();
                    }
                    String str2 = this.f117728j;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = 0;
                    }
                    y.a(str2, "show", i2, y.a(user), z2);
                    this.n = System.currentTimeMillis();
                }
                ProfileLiveEventView profileLiveEventView2 = this.f117729k;
                if (profileLiveEventView2 != null) {
                    profileLiveEventView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        ProfileLiveEventView profileLiveEventView3 = this.f117729k;
        if (profileLiveEventView3 != null) {
            profileLiveEventView3.setVisibility(8);
        }
    }
}
