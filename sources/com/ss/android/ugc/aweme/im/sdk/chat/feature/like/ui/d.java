package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.u;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatDiggLayout;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.bu;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final a f100895m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final AppCompatImageView f100896a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f100897b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f100898c;

    /* renamed from: d  reason: collision with root package name */
    public final a f100899d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f100900e;

    /* renamed from: f  reason: collision with root package name */
    public final String f100901f = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, c> f100902g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public ai f100903h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f100904i;

    /* renamed from: j  reason: collision with root package name */
    public AnimatorSet f100905j;

    /* renamed from: k  reason: collision with root package name */
    public final View f100906k;

    /* renamed from: l  reason: collision with root package name */
    public final int f100907l;
    private ChatDiggLayout o;
    private final h p = i.a((h.f.a.a) e.f100914a);
    private final int[] q;
    private final h.f.a.b<Boolean, z> r;

    static {
        Covode.recordClassIndex(64544);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64548);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private boolean d() {
        if (this.f100902g.get(this.f100901f) != null) {
            return true;
        }
        return false;
    }

    private final void e() {
        this.f100896a.setOnClickListener(new b(this));
    }

    static final class e extends m implements h.f.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f100914a = new e();

        static {
            Covode.recordClassIndex(64552);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IMUser invoke() {
            IMUser fromUser;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            if (currentUser == null || (fromUser = IMUser.fromUser(currentUser)) == null) {
                return null;
            }
            return fromUser;
        }
    }

    private final boolean c() {
        ai aiVar = this.f100903h;
        if (aiVar == null) {
            return false;
        }
        com.bytedance.im.core.d.h a2 = a.C0745a.a().a(aiVar.getConversationId());
        if (a2 == null) {
            return true;
        }
        if (!a2.isGroupChat()) {
            return false;
        }
        if (!a2.isMember() || a2.isDissolved()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.f
    public final void a() {
        b();
        this.f100906k.setVisibility(0);
        AppCompatImageView appCompatImageView = this.f100896a;
        l.b(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        ai aiVar = this.f100903h;
        if (aiVar != null) {
            l.d(aiVar, "");
            r.a("like_message_show", e.a(aiVar).f66730a);
        }
        if (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.c()) {
            AnimatorSet animatorSet = this.f100905j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f100905j = null;
            TuxTextView tuxTextView = this.f100897b;
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.f100896a;
            l.b(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f100896a, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f100897b, "alpha", 0.0f, 1.0f));
            animatorSet2.start();
        }
        AppCompatImageView appCompatImageView3 = this.f100896a;
        l.b(appCompatImageView3, "");
        appCompatImageView3.setSelected(false);
        this.f100896a.setImageDrawable(androidx.core.content.b.a(this.f100898c, 2131232256));
        e();
    }

    public final void b() {
        this.f100906k.setVisibility(8);
        TuxTextView tuxTextView = this.f100897b;
        l.b(tuxTextView, "");
        if (tuxTextView.getVisibility() == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f100896a, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f100897b, "alpha", 1.0f, 0.0f));
            animatorSet.addListener(new C2501d(this));
            animatorSet.start();
            this.f100905j = animatorSet;
        } else {
            AppCompatImageView appCompatImageView = this.f100896a;
            l.b(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            TuxTextView tuxTextView2 = this.f100897b;
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        this.f100899d.a();
        h.f.a.b<Boolean, z> bVar = this.r;
        if (bVar != null) {
            bVar.invoke(false);
        }
    }

    public static final class c implements com.bytedance.im.core.a.a.b<an> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ai f100912a;

        static {
            Covode.recordClassIndex(64550);
        }

        c(ai aiVar) {
            this.f100912a = aiVar;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            l.d(uVar, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "addProperty " + this.f100912a.getUuid() + " onFailure");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(an anVar) {
            l.d(anVar, "");
            com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "addProperty " + this.f100912a.getUuid() + " onSuccess");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$d  reason: collision with other inner class name */
    public static final class C2501d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f100913a;

        static {
            Covode.recordClassIndex(64551);
        }

        C2501d(d dVar) {
            this.f100913a = dVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AppCompatImageView appCompatImageView = this.f100913a.f100896a;
            l.b(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            TuxTextView tuxTextView = this.f100913a.f100897b;
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            this.f100913a.f100905j = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.f
    public final void a(ChatDiggLayout chatDiggLayout) {
        l.d(chatDiggLayout, "");
        this.o = chatDiggLayout;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f100911a;

        static {
            Covode.recordClassIndex(64549);
        }

        b(d dVar) {
            this.f100911a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u.a(view, 1000)) {
                this.f100911a.a(null, null, false);
            }
        }
    }

    private final void b(boolean z) {
        if (!z) {
            this.f100902g.remove(this.f100901f);
        } else {
            a((IMUser) this.p.getValue());
        }
        a(this.f100904i);
    }

    private final void a(IMUser iMUser) {
        if (iMUser != null) {
            String uid = iMUser.getUid();
            if (uid == null) {
                com.ss.android.ugc.aweme.im.service.m.a.d("DmHelper", "putItemToItemsMapSafely-> uid is null->".concat(String.valueOf(iMUser)));
            } else {
                this.f100902g.put(uid, new c(0, iMUser, 0, 5));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        String str;
        Collection<c> values = this.f100902g.values();
        if (values.isEmpty()) {
            ai aiVar = this.f100903h;
            if (aiVar != null) {
                Integer.valueOf(aiVar.getMsgType());
            }
            if (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.f101905b.a(z)) {
                a();
            } else {
                b();
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "onBind not like");
            return;
        }
        AppCompatImageView appCompatImageView = this.f100896a;
        l.b(appCompatImageView, "");
        appCompatImageView.setSelected(false);
        this.f100906k.setVisibility(0);
        AppCompatImageView appCompatImageView2 = this.f100896a;
        l.b(appCompatImageView2, "");
        appCompatImageView2.setVisibility(0);
        TuxTextView tuxTextView = this.f100897b;
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        a aVar = this.f100899d;
        l.d(values, "");
        List k2 = n.k(values);
        int size = values.size();
        if (size > 3) {
            k2 = n.a((Collection) k2.subList(0, 3), (Object) new c(1, null, size - 3, 2));
        }
        j.d a2 = j.a(new bu(aVar.f100886a, k2), true);
        l.b(a2, "");
        aVar.f100886a.clear();
        n.a((Collection) aVar.f100886a, (Iterable) k2);
        a2.a(aVar);
        Iterator<c> it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                IMUser iMUser = it.next().f100893b;
                if (iMUser != null) {
                    str = iMUser.getUid();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) this.f100901f)) {
                    AppCompatImageView appCompatImageView3 = this.f100896a;
                    l.b(appCompatImageView3, "");
                    appCompatImageView3.setSelected(true);
                    break;
                }
            } else {
                break;
            }
        }
        this.f100896a.setImageDrawable(androidx.core.content.b.a(this.f100898c, (int) R.drawable.aqb));
        e();
        h.f.a.b<Boolean, z> bVar = this.r;
        if (bVar != null) {
            bVar.invoke(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.f
    public final void a(float f2, float f3) {
        a(Float.valueOf(f2), Float.valueOf(f3), true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.f
    public final void a(ai aiVar, boolean z) {
        List<ag> list;
        l.d(aiVar, "");
        this.f100903h = aiVar;
        this.f100904i = z;
        Map<String, List<ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
        this.f100902g.clear();
        if (!(propertyItemListMap == null || (list = propertyItemListMap.get("e:love")) == null)) {
            for (T t : list) {
                IMUser b2 = g.b(t.idempotent_id, t.sec_uid);
                if (b2 != null) {
                    a(b2);
                }
            }
        }
        a(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(View view, int i2, h.f.a.b<? super Boolean, z> bVar) {
        l.d(view, "");
        this.f100906k = view;
        this.f100907l = i2;
        this.r = bVar;
        this.f100896a = (AppCompatImageView) view.findViewById(R.id.anv);
        this.f100897b = (TuxTextView) view.findViewById(R.id.aow);
        Context context = view.getContext();
        this.f100898c = context;
        l.b(context, "");
        a aVar = new a(context);
        this.f100899d = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.dr_);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.i());
        this.f100900e = recyclerView;
        view.postDelayed(new Runnable(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f100908a;

            static {
                Covode.recordClassIndex(64545);
            }

            {
                this.f100908a = r1;
            }

            public final void run() {
                DmViewModel a2;
                t<Boolean> b2;
                LiveData liveData;
                DmViewModel a3 = DmViewModel.a.a(this.f100908a.f100898c);
                if (!(a3 == null || (liveData = (LiveData) a3.f100878b.getValue()) == null)) {
                    Context context = this.f100908a.f100898c;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    liveData.observe((androidx.lifecycle.m) context, new androidx.lifecycle.u(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f100909a;

                        static {
                            Covode.recordClassIndex(64546);
                        }

                        {
                            this.f100909a = r1;
                        }

                        @Override // androidx.lifecycle.u
                        public final /* synthetic */ void onChanged(Object obj) {
                            ai aiVar;
                            String uuid;
                            p pVar = (p) obj;
                            if (pVar != null && (aiVar = this.f100909a.f100908a.f100903h) != null && (uuid = aiVar.getUuid()) != null && ((String) pVar.getFirst()).equals(uuid)) {
                                if (((Boolean) pVar.getSecond()).booleanValue()) {
                                    this.f100909a.f100908a.b();
                                } else {
                                    this.f100909a.f100908a.a(this.f100909a.f100908a.f100904i);
                                }
                            }
                        }
                    });
                }
                if (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.c() && (a2 = DmViewModel.a.a(this.f100908a.f100898c)) != null && (b2 = a2.b()) != null) {
                    Context context2 = this.f100908a.f100898c;
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    b2.observe((androidx.lifecycle.m) context2, new androidx.lifecycle.u(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d.AnonymousClass1.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f100910a;

                        static {
                            Covode.recordClassIndex(64547);
                        }

                        {
                            this.f100910a = r1;
                        }

                        @Override // androidx.lifecycle.u
                        public final /* synthetic */ void onChanged(Object obj) {
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                bool.booleanValue();
                                TuxTextView tuxTextView = this.f100910a.f100908a.f100897b;
                                l.b(tuxTextView, "");
                                tuxTextView.setVisibility(8);
                            }
                        }
                    });
                }
            }
        }, 20);
        this.q = new int[2];
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r10 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r9 != null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Float r9, java.lang.Float r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d.a(java.lang.Float, java.lang.Float, boolean):void");
    }
}
