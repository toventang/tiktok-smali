package com.bytedance.ies.web.jsbridge2;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.ad;
import com.bytedance.ies.web.jsbridge2.ae;
import com.bytedance.ies.web.jsbridge2.n;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f35569a;

    /* renamed from: b  reason: collision with root package name */
    final ae f35570b = x.f35707a;

    /* renamed from: c  reason: collision with root package name */
    public n.c f35571c;

    /* renamed from: d  reason: collision with root package name */
    public n.d f35572d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f35573e;

    /* renamed from: f  reason: collision with root package name */
    private final ad f35574f;

    static {
        Covode.recordClassIndex(21260);
    }

    /* access modifiers changed from: package-private */
    public final void a(ae.a aVar) {
        ae aeVar = this.f35570b;
        if (aeVar != null) {
            aeVar.a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Collection<String> collection) {
        this.f35573e.addAll(collection);
    }

    /* access modifiers changed from: package-private */
    public final void a(Collection<String> collection) {
        this.f35569a.addAll(collection);
    }

    ac(ad adVar, Set<String> set, Set<String> set2) {
        this.f35574f = adVar;
        this.f35569a = new LinkedHashSet(set);
        this.f35573e = new LinkedHashSet(set2);
    }

    private synchronized ai a(String str, c cVar, List<TimeLineEvent> list) {
        MethodCollector.i(1275);
        if (this.f35574f == null) {
            new TimeLineEvent.a().a(TimeLineEvent.b.z, TimeLineEvent.b.f35554h).a(TimeLineEvent.b.f35557k, TimeLineEvent.b.f35554h).a(TimeLineEvent.b.aD, list);
            MethodCollector.o(1275);
            return null;
        }
        ae aeVar = this.f35570b;
        if (aeVar == null || aeVar.f35597f) {
            ad adVar = this.f35574f;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String authority = parse.getAuthority();
            String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
            ad.c cVar2 = new ad.c();
            if (authority == null || authority.isEmpty()) {
                new TimeLineEvent.a().a(TimeLineEvent.b.p, TimeLineEvent.b.f35554h).a(TimeLineEvent.b.az, list);
                cVar2.f35589a = ai.PUBLIC;
            } else {
                cVar2 = adVar.f35576b.get(builder);
                if (cVar2 != null) {
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35553g, TimeLineEvent.b.K).a(TimeLineEvent.b.A, cVar2.f35589a.toString()).a(TimeLineEvent.b.B, cVar2.f35590b.toString()).a(TimeLineEvent.b.C, cVar2.f35591c.toString()).a(TimeLineEvent.b.aE, list);
                } else {
                    cVar2 = adVar.a(builder, list);
                    new TimeLineEvent.a().a(TimeLineEvent.b.f35553g, TimeLineEvent.b.L).a(TimeLineEvent.b.ax, list);
                }
            }
            if (cVar2.f35591c.contains(cVar.getName())) {
                MethodCollector.o(1275);
                return null;
            } else if (cVar2.f35590b.contains(cVar.getName())) {
                ai aiVar = ai.PRIVATE;
                MethodCollector.o(1275);
                return aiVar;
            } else if (cVar2.f35589a.compareTo((Enum) cVar.getPermissionGroup()) < 0) {
                MethodCollector.o(1275);
                return null;
            } else {
                ai aiVar2 = cVar2.f35589a;
                MethodCollector.o(1275);
                return aiVar2;
            }
        } else {
            new TimeLineEvent.a().a(TimeLineEvent.b.f35558l, TimeLineEvent.b.f35555i).a(TimeLineEvent.b.aI, list);
            ad.a aVar = new ad.a("Permission configuration has not been fetched");
            MethodCollector.o(1275);
            throw aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a9, code lost:
        if (r6 != false) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.ies.web.jsbridge2.ai a(boolean r10, java.lang.String r11, com.bytedance.ies.web.jsbridge2.c r12, java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r13) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.ac.a(boolean, java.lang.String, com.bytedance.ies.web.jsbridge2.c, java.util.List):com.bytedance.ies.web.jsbridge2.ai");
    }
}
