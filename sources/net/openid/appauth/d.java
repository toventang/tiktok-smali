package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f159597a;

    /* renamed from: b  reason: collision with root package name */
    public String f159598b;

    /* renamed from: c  reason: collision with root package name */
    public g f159599c;

    /* renamed from: d  reason: collision with root package name */
    public s f159600d;

    /* renamed from: e  reason: collision with root package name */
    public e f159601e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f159602f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public List<Object> f159603g;

    /* renamed from: h  reason: collision with root package name */
    private i f159604h;

    static {
        Covode.recordClassIndex(106074);
    }

    public d() {
    }

    public final Long a() {
        if (this.f159601e != null) {
            return null;
        }
        s sVar = this.f159600d;
        if (sVar != null && sVar.f159738d != null) {
            return this.f159600d.f159739e;
        }
        g gVar = this.f159599c;
        if (gVar == null || gVar.f159664f == null) {
            return null;
        }
        return this.f159599c.f159665g;
    }

    public d(g gVar, e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4 = false;
        if (gVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (eVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        p.a(z ^ z2, "exactly one of authResponse or authError should be non-null");
        this.f159603g = null;
        if (gVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        p.a((eVar != null ? true : z4) ^ z3, "exactly one of authResponse or authException should be non-null");
        if (eVar == null) {
            this.f159599c = gVar;
            this.f159604h = null;
            this.f159600d = null;
            this.f159597a = null;
            this.f159601e = null;
            if (gVar.f159667i != null) {
                str = gVar.f159667i;
            } else {
                str = gVar.f159660b.f159641i;
            }
            this.f159598b = str;
        } else if (eVar.type == 1) {
            this.f159601e = eVar;
        }
    }
}
