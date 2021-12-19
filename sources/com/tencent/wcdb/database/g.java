package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Locale;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f154633a;

    /* renamed from: b  reason: collision with root package name */
    public final String f154634b;

    /* renamed from: c  reason: collision with root package name */
    public String f154635c;

    /* renamed from: d  reason: collision with root package name */
    public int f154636d;

    /* renamed from: e  reason: collision with root package name */
    public int f154637e;

    /* renamed from: f  reason: collision with root package name */
    public Locale f154638f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f154639g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f154640h;

    /* renamed from: i  reason: collision with root package name */
    public int f154641i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f154642j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f154643k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<SQLiteCustomFunction> f154644l = new ArrayList<>();

    static {
        Covode.recordClassIndex(103058);
    }

    public final boolean a() {
        return this.f154633a.equalsIgnoreCase(":memory:");
    }

    public g(g gVar) {
        if (gVar != null) {
            this.f154633a = gVar.f154633a;
            this.f154634b = gVar.f154634b;
            a(gVar);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public final void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("other must not be null.");
        } else if (this.f154633a.equals(gVar.f154633a)) {
            this.f154636d = gVar.f154636d;
            this.f154637e = gVar.f154637e;
            this.f154638f = gVar.f154638f;
            this.f154639g = gVar.f154639g;
            this.f154640h = gVar.f154640h;
            this.f154642j = gVar.f154642j;
            this.f154643k = gVar.f154643k;
            this.f154641i = gVar.f154641i;
            this.f154635c = gVar.f154635c;
            this.f154644l.clear();
            this.f154644l.addAll(gVar.f154644l);
        } else {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
    }

    public g(String str, int i2) {
        String str2;
        if (str != null) {
            this.f154633a = str;
            this.f154634b = str;
            this.f154636d = i2;
            this.f154641i = 2;
            this.f154637e = 25;
            this.f154638f = Locale.getDefault();
            if ((i2 & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.f154635c = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
