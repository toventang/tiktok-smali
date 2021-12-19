package com.bytedance.android.live.publicscreen.impl.c;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExternalConfigSetting;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class f extends RelativeLayout implements OnMessageListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f12273i = new a((byte) 0);
    private static final String r = f.class.getSimpleName();
    private static final int s = 4;
    private static final int t = 99;
    private static final int u = 50;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f12274a;

    /* renamed from: b  reason: collision with root package name */
    f.a.b.b f12275b;

    /* renamed from: c  reason: collision with root package name */
    f.a.b.b f12276c;

    /* renamed from: d  reason: collision with root package name */
    f.a.b.b f12277d;

    /* renamed from: e  reason: collision with root package name */
    f.a.b.b f12278e;

    /* renamed from: f  reason: collision with root package name */
    public int f12279f;

    /* renamed from: g  reason: collision with root package name */
    ValueAnimator f12280g;

    /* renamed from: h  reason: collision with root package name */
    public int f12281h;

    /* renamed from: j  reason: collision with root package name */
    private e f12282j;

    /* renamed from: k  reason: collision with root package name */
    private SmoothLinearLayoutManager f12283k;

    /* renamed from: l  reason: collision with root package name */
    private int f12284l;

    /* renamed from: m  reason: collision with root package name */
    private int f12285m;
    private Room n;
    private final ArrayList<d> o = new ArrayList<>();
    private final h.h p;
    private final IMessageManager q;

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f12292a = new h();

        static {
            Covode.recordClassIndex(6763);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final j f12294a = new j();

        static {
            Covode.recordClassIndex(6765);
        }

        j() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private final com.bytedance.android.livesdk.chatroom.model.j getLiveExternalConfigSetting() {
        return (com.bytedance.android.livesdk.chatroom.model.j) this.p.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6756);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<com.bytedance.android.livesdk.chatroom.model.j> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12288a = new d();

        static {
            Covode.recordClassIndex(6759);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.j invoke() {
            return LiveExternalConfigSetting.INSTANCE.getValue();
        }
    }

    private final void f() {
        b(this.o.size() - 1);
    }

    public final void c() {
        if (this.f12285m > 0) {
            this.o.add(new a(this.f12285m));
            f();
            this.f12285m = 0;
        }
    }

    static {
        Covode.recordClassIndex(6755);
    }

    private final void d() {
        this.f12275b = t.b((Object) 1).e((long) getLiveExternalConfigSetting().f15785b, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(this), j.f12294a);
    }

    private final void e() {
        this.f12277d = t.b((Object) 1).e((long) getLiveExternalConfigSetting().f15784a, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new g(this), h.f12292a);
    }

    public final void a() {
        this.f12276c = com.bytedance.android.livesdk.utils.b.b.b((long) getLiveExternalConfigSetting().f15786c, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new C0259f(this));
    }

    public final void b() {
        if (this.f12284l > 0) {
            this.o.add(new b(this.f12284l));
            f();
            this.f12284l = 0;
            this.f12278e = t.b((Object) 1).e(1, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new e(this));
            return;
        }
        c();
    }

    public final void setRoom(Room room) {
        this.n = room;
    }

    public static final class c extends RecyclerView.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12287a;

        static {
            Covode.recordClassIndex(6758);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f12287a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            rect.top = this.f12287a.f12281h;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12289a;

        static {
            Covode.recordClassIndex(6760);
        }

        e(f fVar) {
            this.f12289a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f12289a.c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.f$f  reason: collision with other inner class name */
    public static final class C0259f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12290a;

        static {
            Covode.recordClassIndex(6761);
        }

        C0259f(f fVar) {
            this.f12290a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f12290a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12291a;

        static {
            Covode.recordClassIndex(6762);
        }

        g(f fVar) {
            this.f12291a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f12291a.b();
            this.f12291a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12293a;

        static {
            Covode.recordClassIndex(6764);
        }

        i(f fVar) {
            this.f12293a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f12293a.b();
            this.f12293a.a();
        }
    }

    public final void a(int i2) {
        if (i2 == 1) {
            a(this.n);
        } else if (i2 == 2) {
            d();
        } else if (i2 == 3 || i2 == 4) {
            b(this.n);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f12286a;

        static {
            Covode.recordClassIndex(6757);
        }

        b(f fVar) {
            this.f12286a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f12286a.f12274a;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = -((int) ((1.0f - floatValue) * ((float) this.f12286a.f12279f)));
                RecyclerView recyclerView2 = this.f12286a.f12274a;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int i2;
        l.d(iMessage, "");
        if ((iMessage instanceof com.bytedance.android.livesdk.model.message.i) || (iMessage instanceof cc)) {
            int i3 = this.f12285m;
            if (i3 < t) {
                this.f12285m = i3 + 1;
            }
        } else if ((iMessage instanceof az) && (i2 = this.f12284l) < t) {
            this.f12284l = i2 + 1;
        }
    }

    private final void a(Room room) {
        FansClubMember fansClub;
        FansClubData data;
        if (room != null) {
            e eVar = this.f12282j;
            if (eVar != null) {
                eVar.a(room);
            }
            User owner = room.getOwner();
            if (owner == null || (fansClub = owner.getFansClub()) == null || (data = fansClub.getData()) == null || data.anchorId == 0) {
                Integer valueOf = Integer.valueOf(room.getUserCount());
                if (valueOf.intValue() > u && valueOf != null) {
                    this.o.add(new g(g.f12297d, valueOf.intValue()));
                    f();
                    return;
                }
                return;
            }
            this.o.add(new g(g.f12295b));
            f();
        }
    }

    private void b(int i2) {
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams;
        e eVar = this.f12282j;
        if (eVar != null) {
            eVar.notifyItemInserted(i2);
            RecyclerView recyclerView = this.f12274a;
            if (recyclerView != null) {
                recyclerView.d(eVar.getItemCount() - 1);
            }
        }
        if (i2 <= 2) {
            float f2 = (float) i2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2 / 3.0f, (f2 + 1.0f) / 3.0f);
            this.f12280g = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new b(this));
            }
            ValueAnimator valueAnimator = this.f12280g;
            if (valueAnimator != null) {
                valueAnimator.setDuration(200L);
            }
            ValueAnimator valueAnimator2 = this.f12280g;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
        if (i2 == 1 && this.f12282j != null && (i3 = e.f12255i) > 0 && this.f12279f < (i4 = (i3 * 3) + (this.f12281h * 3))) {
            RecyclerView recyclerView2 = this.f12274a;
            if (recyclerView2 != null) {
                layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i4;
                }
            } else {
                layoutParams = null;
            }
            RecyclerView recyclerView3 = this.f12274a;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutParams(layoutParams);
            }
        }
    }

    private final void a(Context context) {
        com.a.a(LayoutInflater.from(context), R.layout.b8u, this, true);
        this.f12274a = (RecyclerView) findViewById(R.id.clw);
        this.f12282j = new e();
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager();
        this.f12283k = smoothLinearLayoutManager;
        smoothLinearLayoutManager.f15815a = 200.0f;
        RecyclerView recyclerView = this.f12274a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f12283k);
        }
        this.f12281h = (int) n.b(context, (float) s);
        RecyclerView recyclerView2 = this.f12274a;
        if (recyclerView2 != null) {
            recyclerView2.a(new c(this));
        }
        RecyclerView recyclerView3 = this.f12274a;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f12282j);
        }
        RecyclerView recyclerView4 = this.f12274a;
        ViewGroup.LayoutParams layoutParams = null;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(null);
        }
        RecyclerView recyclerView5 = this.f12274a;
        if (recyclerView5 != null) {
            layoutParams = recyclerView5.getLayoutParams();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f12279f = -((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        e eVar = this.f12282j;
        if (eVar != null) {
            LayoutInflater from = LayoutInflater.from(context);
            l.b(from, "");
            l.d(from, "");
            eVar.f12257a = from;
            ArrayList<d> arrayList = this.o;
            l.d(arrayList, "");
            eVar.f12258b = arrayList;
            eVar.notifyDataSetChanged();
            RecyclerView recyclerView6 = this.f12274a;
            if (recyclerView6 != null) {
                recyclerView6.setFadingEdgeLength(0);
            }
        }
        IMessageManager iMessageManager = this.q;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.CHAT.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.q;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SCREEN.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.q;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType(), this);
        }
    }

    private final void b(Room room) {
        FansClubMember fansClub;
        FansClubData data;
        if (room != null) {
            e eVar = this.f12282j;
            if (eVar != null) {
                eVar.a(room);
            }
            User owner = room.getOwner();
            if (owner == null || (fansClub = owner.getFansClub()) == null || (data = fansClub.getData()) == null || data.anchorId == 0) {
                Integer valueOf = Integer.valueOf(room.getUserCount());
                if (valueOf.intValue() > u && valueOf != null) {
                    this.o.add(new g(g.f12297d, valueOf.intValue()));
                    f();
                    e();
                    return;
                }
            } else {
                this.o.add(new g(g.f12295b));
                f();
                e();
                return;
            }
        }
        d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, IMessageManager iMessageManager) {
        super(context);
        l.d(context, "");
        MethodCollector.i(6345);
        this.q = iMessageManager;
        a(context);
        this.p = h.i.a((h.f.a.a) d.f12288a);
        MethodCollector.o(6345);
    }
}
