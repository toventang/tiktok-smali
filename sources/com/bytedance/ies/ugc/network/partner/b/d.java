package com.bytedance.ies.ugc.network.partner.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f35262a = " \"<>^`{}|/\\?#";

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f35263b;

    /* renamed from: c  reason: collision with root package name */
    private String f35264c;

    static {
        Covode.recordClassIndex(21130);
    }

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f35263b = arrayList;
        arrayList.add("");
    }

    public final String a() {
        String str = this.f35264c;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : this.f35263b) {
            sb.append('/').append(str2);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        this.f35264c = sb2;
        return sb2;
    }

    public final void a(StringBuilder sb) {
        l.d(sb, "");
        int size = this.f35263b.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            String str = this.f35263b.get(i2);
            sb.append(a.a(str, 0, str.length(), this.f35262a, false, false, true));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0 A[SYNTHETIC] */
    public final void a(java.lang.String r15, int r16, int r17) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.network.partner.b.d.a(java.lang.String, int, int):void");
    }
}
