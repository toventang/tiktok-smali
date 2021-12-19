package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.publish.t;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.f.b;
import h.f.a.m;
import h.z;

public final class bd {
    static {
        Covode.recordClassIndex(86121);
    }

    public static final class a implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f131467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f131468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f131469d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f131470e = true;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f131471f;

        static {
            Covode.recordClassIndex(86122);
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            bd.a(this.f131466a, this.f131467b, this.f131468c, this.f131469d, this.f131470e, this.f131471f);
        }

        a(e eVar, VideoPublishEditModel videoPublishEditModel, String str, int i2, boolean z, m mVar) {
            this.f131466a = eVar;
            this.f131467b = videoPublishEditModel;
            this.f131468c = str;
            this.f131469d = i2;
            this.f131471f = mVar;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
    public static final void a(androidx.fragment.app.e r6, int r7, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, java.lang.String r9, h.f.a.m<? super java.lang.Boolean, ? super java.lang.Boolean, h.z> r10) {
        /*
            java.lang.String r0 = ""
            r2 = r6
            h.f.b.l.d(r2, r0)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r5 = r7
            if (r5 == 0) goto L_0x0028
            r0 = 1
            r6 = 1
        L_0x0010:
            boolean r0 = com.ss.android.ugc.aweme.experiment.gs.a()
            r4 = r9
            r7 = r10
            r3 = r8
            if (r0 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x002a
            r7.invoke(r1, r1)
            com.ss.android.ugc.aweme.shortvideo.ui.bd$a r1 = new com.ss.android.ugc.aweme.shortvideo.ui.bd$a
            r6 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(r2, r1)
            return
        L_0x0028:
            r6 = 0
            goto L_0x0010
        L_0x002a:
            a(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.bd.a(androidx.fragment.app.e, int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, h.f.a.m):void");
    }

    public static final void a(e eVar, VideoPublishEditModel videoPublishEditModel, String str, int i2, boolean z, m<? super Boolean, ? super Boolean, z> mVar) {
        String str2;
        String str3;
        t.a(i2);
        if (z) {
            g.a().o().i().a(eVar, str);
        }
        b bVar = new b();
        String str4 = null;
        if (videoPublishEditModel != null) {
            str2 = videoPublishEditModel.creationId;
        } else {
            str2 = null;
        }
        b a2 = bVar.a("creation_id", str2).a("enter_from", "video_post_page");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        b a3 = a2.a("to_status", str3);
        if (videoPublishEditModel != null) {
            str4 = videoPublishEditModel.mShootWay;
        }
        r.a("click_react_download_control", a3.a("shoot_way", str4).a("save_with_captions", -1).f149193a);
        if (mVar != null) {
            mVar.invoke(true, Boolean.valueOf(z));
        }
    }
}
