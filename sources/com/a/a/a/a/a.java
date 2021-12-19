package com.a.a.a.a;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.SimpleDraweeView;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f4914a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable f4915b;

    /* renamed from: c  reason: collision with root package name */
    public q.b f4916c;

    /* renamed from: d  reason: collision with root package name */
    public q.b f4917d;

    /* renamed from: e  reason: collision with root package name */
    public float f4918e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4919f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4920g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4921h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4922i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4923j = true;

    static {
        Covode.recordClassIndex(1936);
    }

    public a() {
        q.b bVar = q.b.f47441g;
        l.a((Object) bVar, "");
        this.f4916c = bVar;
        q.b bVar2 = q.b.f47441g;
        l.a((Object) bVar2, "");
        this.f4917d = bVar2;
    }

    private static e a(SimpleDraweeView simpleDraweeView) {
        com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) simpleDraweeView.getHierarchy();
        l.a((Object) aVar, "");
        e eVar = aVar.f47454a;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) simpleDraweeView.getHierarchy();
        l.a((Object) aVar2, "");
        aVar2.a(eVar2);
        return eVar2;
    }

    private static q.b a(String str) {
        switch (str.hashCode()) {
            case -1928367066:
                if (str.equals("fitBottomStart")) {
                    q.b bVar = q.b.f47444j;
                    l.a((Object) bVar, "");
                    return bVar;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    q.b bVar2 = q.b.f47440f;
                    l.a((Object) bVar2, "");
                    return bVar2;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    q.b bVar3 = q.b.f47439e;
                    l.a((Object) bVar3, "");
                    return bVar3;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    q.b bVar4 = q.b.f47437c;
                    l.a((Object) bVar4, "");
                    return bVar4;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    q.b bVar5 = q.b.f47441g;
                    l.a((Object) bVar5, "");
                    return bVar5;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    q.b bVar6 = q.b.f47436b;
                    l.a((Object) bVar6, "");
                    return bVar6;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    q.b bVar7 = q.b.f47438d;
                    l.a((Object) bVar7, "");
                    return bVar7;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    q.b bVar8 = q.b.f47442h;
                    l.a((Object) bVar8, "");
                    return bVar8;
                }
                break;
            case 1628133256:
                if (str.equals("focusCrop")) {
                    q.b bVar9 = q.b.f47443i;
                    l.a((Object) bVar9, "");
                    return bVar9;
                }
                break;
        }
        throw new IllegalArgumentException("fresco unsupported scale attr ".concat(String.valueOf(str)));
    }

    public final void a(SimpleDraweeView simpleDraweeView, ViewGroup.LayoutParams layoutParams) {
        float f2;
        float f3;
        float f4;
        l.c(simpleDraweeView, "");
        l.c(layoutParams, "");
        Drawable drawable = this.f4914a;
        if (drawable != null) {
            ((com.facebook.drawee.f.a) simpleDraweeView.getHierarchy()).a(drawable, this.f4916c);
        }
        if (this.f4915b != null) {
            ((com.facebook.drawee.f.a) simpleDraweeView.getHierarchy()).b(this.f4915b, this.f4917d);
        }
        if (this.f4919f) {
            float f5 = 0.0f;
            if (this.f4920g) {
                f2 = this.f4918e;
            } else {
                f2 = 0.0f;
            }
            if (this.f4921h) {
                f3 = this.f4918e;
            } else {
                f3 = 0.0f;
            }
            if (this.f4922i) {
                f4 = this.f4918e;
            } else {
                f4 = 0.0f;
            }
            if (this.f4923j) {
                f5 = this.f4918e;
            }
            a(simpleDraweeView).a(f2, f3, f5, f4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        if (r1.equals("roundBottomStart") != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r5.f4919f = true;
        r0 = r7.f4926a;
        h.f.b.l.a((java.lang.Object) r0, "");
        r5.f4922i = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (r1.equals("roundBottomRight") != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r1.equals("roundTopStart") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if (r1.equals("roundTopRight") != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        if (r1.equals("roundTopLeft") != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r5.f4919f = true;
        r0 = r7.f4926a;
        h.f.b.l.a((java.lang.Object) r0, "");
        r5.f4920g = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (r1.equals("roundBottomLeft") != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        if (r1.equals("roundBottomEnd") != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0170, code lost:
        r5.f4919f = true;
        r0 = r7.f4926a;
        h.f.b.l.a((java.lang.Object) r0, "");
        r5.f4923j = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0196, code lost:
        if (r1.equals("roundTopEnd") != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0198, code lost:
        r5.f4919f = true;
        r0 = r7.f4926a;
        h.f.b.l.a((java.lang.Object) r0, "");
        r5.f4921h = java.lang.Boolean.parseBoolean(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a5, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r6, com.a.b.a.a r7, com.facebook.drawee.view.SimpleDraweeView r8, android.view.ViewGroup.LayoutParams r9) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.a.a.a(java.lang.String, com.a.b.a.a, com.facebook.drawee.view.SimpleDraweeView, android.view.ViewGroup$LayoutParams):boolean");
    }
}
