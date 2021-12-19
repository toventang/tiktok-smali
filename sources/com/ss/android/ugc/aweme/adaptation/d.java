package com.ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.framework.a.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f66222a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f66223b;

    /* renamed from: c  reason: collision with root package name */
    private final View f66224c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66225d = 47;

    /* renamed from: e  reason: collision with root package name */
    private final c.e f66226e;

    static {
        Covode.recordClassIndex(40701);
    }

    public d(Activity activity, ViewGroup viewGroup, View view, c.e eVar) {
        this.f66222a = activity;
        this.f66223b = viewGroup;
        this.f66224c = view;
        this.f66226e = eVar;
    }

    public final void run() {
        boolean z;
        int a2;
        Activity activity = this.f66222a;
        ViewGroup viewGroup = this.f66223b;
        View view = this.f66224c;
        int i2 = this.f66225d;
        c.e eVar = this.f66226e;
        if (activity != null) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (c.b()) {
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (Exception e2) {
                    a.a((Throwable) e2);
                }
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i3 = displayMetrics.heightPixels;
            int i4 = displayMetrics.widthPixels;
            if (!f.c() || !c.a((Context) activity)) {
                z = false;
                a2 = c.a(activity);
            } else {
                z = true;
                a2 = 0;
            }
            com.ss.android.b.a.a.a.b(new Runnable(activity, viewGroup, view, c.b(activity), i3, i4, a2, c.c(activity), i2, z, eVar) {
                /* class com.ss.android.ugc.aweme.adaptation.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Activity f66204a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ViewGroup f66205b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ View f66206c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f66207d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f66208e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ int f66209f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ int f66210g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ int f66211h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ int f66212i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ boolean f66213j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ e f66214k;

                static {
                    Covode.recordClassIndex(40695);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
                    if (r0 != 0) goto L_0x00be;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
                    if (r10.f66213j != false) goto L_0x00c2;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
                    if (r4 > 0.5d) goto L_0x00d9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
                    r2 = (int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), (float) r10.f66212i);
                    com.ss.android.ugc.aweme.adaptation.c.b.f66221a.f66200i = 0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
                    com.ss.android.ugc.aweme.adaptation.c.b.f66221a.f66200i = 0;
                    r2 = 0;
                    r6 = false;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Can't load method instructions.
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.c.AnonymousClass1.run():void");
                }

                {
                    /*
                        r0 = this;
                        r0.f66204a = r1
                        r0.f66205b = r2
                        r0.f66206c = r3
                        r0.f66207d = r4
                        r0.f66208e = r5
                        r0.f66209f = r6
                        r0.f66210g = r7
                        r0.f66211h = r8
                        r0.f66212i = r9
                        r0.f66213j = r10
                        r0.f66214k = r11
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.c.AnonymousClass1.<init>(android.app.Activity, android.view.ViewGroup, android.view.View, boolean, int, int, int, int, int, boolean, com.ss.android.ugc.aweme.adaptation.c$e):void");
                }
            });
        }
    }
}
