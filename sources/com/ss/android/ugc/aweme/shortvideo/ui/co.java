package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bg;

/* access modifiers changed from: package-private */
public final /* synthetic */ class co implements bg.b {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131641a;

    static {
        Covode.recordClassIndex(86207);
    }

    co(cj cjVar) {
        this.f131641a = cjVar;
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
    @Override // com.ss.android.ugc.aweme.port.in.bg.b
    public final boolean a(android.view.View r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.ui.cj r3 = r4.f131641a
            androidx.appcompat.widget.n r5 = (androidx.appcompat.widget.n) r5
            com.ss.android.ugc.aweme.shortvideo.p r0 = r3.H
            com.ss.android.ugc.aweme.port.in.bg$a r0 = r0.f129529a
            int r0 = r0.b()
            r2 = 0
            r1 = 1
            if (r0 == r1) goto L_0x0025
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f.a(r0)
            if (r0 != 0) goto L_0x0025
            androidx.fragment.app.e r1 = r3.requireActivity()
            com.ss.android.ugc.aweme.shortvideo.ui.eu r0 = new com.ss.android.ugc.aweme.shortvideo.ui.eu
            r0.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(r1, r0)
            return r2
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.co.a(android.view.View):boolean");
    }
}
