package com.ss.android.ugc.aweme.music.ui.widget;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.ui.b;
import com.ss.android.ugc.aweme.music.ui.bg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;

public final class a extends com.bytedance.assem.arch.d.a implements b {

    /* renamed from: j  reason: collision with root package name */
    private final i f112102j = new i(bQ_(), new C2865a(this, "music_info"));

    /* renamed from: k  reason: collision with root package name */
    private Fragment f112103k;

    /* renamed from: l  reason: collision with root package name */
    private bg f112104l;

    static {
        Covode.recordClassIndex(72037);
    }

    private final b u() {
        return (b) this.f112102j.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ c e() {
        return new c();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.widget.a$a  reason: collision with other inner class name */
    public static final class C2865a extends m implements h.f.a.a<b> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(72038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2865a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.ui.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.music.ui.b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.music.ui.b> r1 = com.ss.android.ugc.aweme.music.ui.b.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.a.C2865a.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.widget.b
    public final void a(ExternalMusicInfo externalMusicInfo) {
        l.d(externalMusicInfo, "");
        bg bgVar = this.f112104l;
        if (bgVar == null) {
            l.a("thirdMusicLogic");
        }
        Fragment fragment = this.f112103k;
        if (fragment == null) {
            l.a("fragment");
        }
        bgVar.c(fragment.getContext(), n.a(externalMusicInfo));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.ss.android.ugc.aweme.music.ui.widget.b
    public final void b(com.ss.android.ugc.aweme.music.model.ExternalMusicInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r4, r0)
            androidx.fragment.app.Fragment r0 = r3.f112103k
            java.lang.String r1 = "fragment"
            if (r0 != 0) goto L_0x000e
            h.f.b.l.a(r1)
        L_0x000e:
            com.bytedance.tux.sheet.sheet.a.b.a(r0)
            com.ss.android.ugc.aweme.music.ui.bg r2 = r3.f112104l
            if (r2 != 0) goto L_0x001a
            java.lang.String r0 = "thirdMusicLogic"
            h.f.b.l.a(r0)
        L_0x001a:
            androidx.fragment.app.Fragment r0 = r3.f112103k
            if (r0 != 0) goto L_0x0021
            h.f.b.l.a(r1)
        L_0x0021:
            android.content.Context r1 = r0.getContext()
            r0 = 1
            r2.a(r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.a.b(com.ss.android.ugc.aweme.music.model.ExternalMusicInfo):void");
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        boolean z;
        l.d(view, "");
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this);
        if (a2 != null) {
            this.f112103k = a2;
            this.f112104l = new bg(u().f111909b, u().f111910c, u().f111911d, u().f111912e);
            PowerList powerList = (PowerList) view;
            Fragment fragment = this.f112103k;
            if (fragment == null) {
                l.a("fragment");
            }
            fragment.getContext();
            powerList.setLayoutManager(new LinearLayoutManager());
            powerList.a(ThirdMusicViewHolder.class);
            powerList.setLifecycleOwner(this);
            ArrayList arrayList = new ArrayList();
            int size = u().f111908a.size();
            int i2 = 0;
            for (T t : u().f111908a) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                if (i2 == size - 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new d(t2, z));
                i2 = i3;
            }
            powerList.getState().b(arrayList);
        }
    }
}
