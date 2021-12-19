package com.bytedance.ies.bullet.service.popup;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.b.a;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.u;
import com.bytedance.ies.bullet.service.base.v;
import com.bytedance.ies.bullet.service.popup.e;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h extends a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v f33003a;

    static {
        Covode.recordClassIndex(19696);
    }

    private /* synthetic */ h() {
        this(null);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final FrameLayout.LayoutParams d() {
        v vVar = this.f33003a;
        if (vVar != null) {
            return vVar.a();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final FrameLayout.LayoutParams e() {
        v vVar = this.f33003a;
        if (vVar != null) {
            return vVar.b();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.u
    public final List<e> b() {
        return n.h((Iterable) new ArrayList(e.u));
    }

    public h(v vVar) {
        this.f33003a = vVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final k a(Context context) {
        l.c(context, "");
        v vVar = this.f33003a;
        if (vVar != null) {
            return vVar.a(context);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.f
    public final com.bytedance.ies.bullet.service.base.h b(Context context) {
        l.c(context, "");
        v vVar = this.f33003a;
        if (vVar != null) {
            return vVar.b(context);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.u
    public final boolean a(String str) {
        T t;
        l.c(str, "");
        T a2 = e.a.a(str);
        if (a2 == null) {
            l.c(str, "");
            Iterator<T> it = e.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.k(), (Object) str)) {
                    break;
                }
            }
            a2 = t;
            if (a2 == null) {
                return false;
            }
        }
        a2.dismissAllowingStateLoss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0374, code lost:
        if (r4.equals("right") == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r0 != 2) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03bb A[Catch:{ all -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0200  */
    @Override // com.bytedance.ies.bullet.service.base.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r53, android.net.Uri r54, com.bytedance.ies.bullet.service.base.a.r r55) {
        /*
        // Method dump skipped, instructions count: 989
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.h.a(android.content.Context, android.net.Uri, com.bytedance.ies.bullet.service.base.a.r):boolean");
    }
}
