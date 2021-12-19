package com.bytedance.android.livesdk.a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.dd;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class l extends v {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13287a;

    /* renamed from: b  reason: collision with root package name */
    final h.h f13288b = com.bytedance.android.livesdkapi.m.d.a(C0281l.f13309a);

    /* renamed from: c  reason: collision with root package name */
    final h.h f13289c = com.bytedance.android.livesdkapi.m.d.a(f.f13305a);

    /* renamed from: d  reason: collision with root package name */
    final h.h f13290d = com.bytedance.android.livesdkapi.m.d.a(a.f13298a);

    /* renamed from: e  reason: collision with root package name */
    final h.h f13291e = com.bytedance.android.livesdkapi.m.d.a(k.f13308a);

    /* renamed from: f  reason: collision with root package name */
    final h.h f13292f = com.bytedance.android.livesdkapi.m.d.a(new g(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f13293g = com.bytedance.android.livesdkapi.m.d.a(c.f13300a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f13294h = com.bytedance.android.livesdkapi.m.d.a(d.f13301a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f13295i = com.bytedance.android.livesdkapi.m.d.a(b.f13299a);

    /* renamed from: j  reason: collision with root package name */
    private final e f13296j = new e(this);

    /* renamed from: k  reason: collision with root package name */
    private HashMap f13297k;

    static {
        Covode.recordClassIndex(7393);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f13297k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f13297k == null) {
            this.f13297k = new HashMap();
        }
        View view = (View) this.f13297k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13297k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final n d() {
        return (n) this.f13293g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final p e() {
        return (p) this.f13294h.getValue();
    }

    public final o f() {
        return (o) this.f13295i.getValue();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    static final class b extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13299a = new b();

        static {
            Covode.recordClassIndex(7395);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return new o();
        }
    }

    static final class c extends m implements h.f.a.a<n> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13300a = new c();

        static {
            Covode.recordClassIndex(7396);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n();
        }
    }

    static final class d extends m implements h.f.a.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13301a = new d();

        static {
            Covode.recordClassIndex(7397);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ p invoke() {
            return new p();
        }
    }

    static final class k extends m implements h.f.a.a<r> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f13308a = new k();

        static {
            Covode.recordClassIndex(7407);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            return new r();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.l$l  reason: collision with other inner class name */
    static final class C0281l extends m implements h.f.a.a<s> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0281l f13309a = new C0281l();

        static {
            Covode.recordClassIndex(7408);
        }

        C0281l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ s invoke() {
            return new s();
        }
    }

    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f13302a;

        /* renamed from: b  reason: collision with root package name */
        private final h.h f13303b = h.i.a((h.f.a.a) a.f13304a);

        static {
            Covode.recordClassIndex(7398);
        }

        private final float a() {
            return ((Number) this.f13303b.getValue()).floatValue();
        }

        static final class a extends m implements h.f.a.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13304a = new a();

            static {
                Covode.recordClassIndex(7399);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(((float) y.b()) * 0.75f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(l lVar) {
            this.f13302a = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
            if (r4.a() != false) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLayoutChange(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.a.l.e.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    }

    static final class a extends m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13298a = new a();

        static {
            Covode.recordClassIndex(7394);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.k.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.k.a.class)).getAddModeratorFragment();
        }
    }

    static final class f extends m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13305a = new f();

        static {
            Covode.recordClassIndex(7400);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.k.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.k.a.class)).getModeratorListFragment();
        }
    }

    static final class g extends m implements h.f.a.a<Fragment> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(7401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getMuteDurationSettingFragment(new View.OnClickListener(this) {
                /* class com.bytedance.android.livesdk.a.l.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f13306a;

                static {
                    Covode.recordClassIndex(7402);
                }

                {
                    this.f13306a = r1;
                }

                public final void onClick(View view) {
                    DataChannel dataChannel = this.f13306a.this$0.p;
                    if (dataChannel != null) {
                        dataChannel.b(r.class, s.a(q.COMMENT_SETTING));
                    }
                }
            }, new h.f.a.b<com.bytedance.android.live.broadcast.model.j, z>(this) {
                /* class com.bytedance.android.livesdk.a.l.g.AnonymousClass2 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(7403);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.j jVar) {
                    Room room;
                    boolean z;
                    String str;
                    long j2;
                    Boolean bool;
                    com.bytedance.android.live.broadcast.model.j jVar2 = jVar;
                    h.f.b.l.d(jVar2, "");
                    DataChannel dataChannel = this.this$0.this$0.p;
                    if (dataChannel != null) {
                        room = (Room) dataChannel.b(df.class);
                    } else {
                        room = null;
                    }
                    DataChannel dataChannel2 = this.this$0.this$0.p;
                    if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
                        z = false;
                    } else {
                        z = bool.booleanValue();
                    }
                    com.bytedance.android.live.adminsetting.b bVar = (com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class);
                    if (z) {
                        str = "anchor";
                    } else {
                        str = "admin";
                    }
                    long j3 = 0;
                    if (room != null) {
                        j2 = room.getOwnerUserId();
                        j3 = room.getId();
                    } else {
                        j2 = 0;
                    }
                    bVar.reportDefaultMuteDurationChange(str, jVar2, "live_take_detail", j2, Long.valueOf(j3));
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7d);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2d;
        bVar.f22382i = -1;
        bVar.f22385l = 18;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismiss() {
        if (this.f13287a) {
            o f2 = f();
            if (f2.isViewValid()) {
                ((BlockWordView) f2.a(R.id.u5)).a();
            }
        }
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 != null) {
            a2.c(dd.class);
        }
        super.dismiss();
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f13307a;

        static {
            Covode.recordClassIndex(7405);
        }

        i(l lVar) {
            this.f13307a = lVar;
        }

        public final void onClick(View view) {
            this.f13307a.dismiss();
        }
    }

    static final class h extends m implements h.f.a.b<z, z> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(7404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a(Dialog dialog) {
        View decorView;
        h.f.b.l.d(dialog, "");
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.addOnLayoutChangeListener(this.f13296j);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.a.class, (h.f.a.b) new h(this));
        }
    }

    static final /* synthetic */ class j extends h.f.b.j implements h.f.a.b<q, z> {
        static {
            Covode.recordClassIndex(7406);
        }

        j(l lVar) {
            super(1, lVar, l.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0057 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r3v8, types: [com.bytedance.android.livesdk.a.s] */
        /* JADX WARN: Type inference failed for: r3v10, types: [com.bytedance.android.livesdk.a.r] */
        /* JADX WARN: Type inference failed for: r3v12, types: [androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r3v14, types: [androidx.fragment.app.Fragment] */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
            if (r3 == null) goto L_0x0016;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
        /* JADX WARNING: Unknown variable types count: 5 */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.j.q r5) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.a.l.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        a_(R.id.e00).setOnClickListener(new i(this));
        getChildFragmentManager().a().a(R.id.hz, d()).b();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, r.class, (h.f.a.b) new j(this));
        }
    }
}
