package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.k.al;
import com.ss.android.ugc.aweme.search.model.b;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f81895a;

    /* renamed from: b  reason: collision with root package name */
    public String f81896b;

    /* renamed from: c  reason: collision with root package name */
    public String f81897c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f81898d;

    /* renamed from: e  reason: collision with root package name */
    public b f81899e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f81900f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f81901g;

    /* renamed from: h  reason: collision with root package name */
    public int f81902h;

    /* renamed from: i  reason: collision with root package name */
    public String f81903i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f81904j;

    /* renamed from: k  reason: collision with root package name */
    public String f81905k;

    /* renamed from: l  reason: collision with root package name */
    public String f81906l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f81907m;
    public long n;
    public String o;
    public d p;

    static {
        Covode.recordClassIndex(50847);
    }

    public final boolean a() {
        if (this.f81902h != this.f81901g) {
            return true;
        }
        return false;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f81897c = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(al alVar) {
        l.d(alVar, "");
        String str = this.f81897c;
        String str2 = "search_sug";
        switch (str.hashCode()) {
            case -1816950631:
                if (str.equals("recom_search")) {
                    str2 = "recom_search";
                    break;
                }
                str2 = this.f81897c;
                break;
            case -1191929626:
                if (str.equals("related_search_keyword")) {
                    str2 = "related_search_keyword";
                    break;
                }
                str2 = this.f81897c;
                break;
            case -710131922:
                if (str.equals(str2)) {
                    alVar.c(al.w, this.f81903i);
                    break;
                }
                str2 = this.f81897c;
                break;
            case 3452698:
                if (str.equals("push")) {
                    str2 = this.f81905k;
                    break;
                }
                str2 = this.f81897c;
                break;
            default:
                str2 = this.f81897c;
                break;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = "normal_search";
        }
        alVar.p(str2);
    }
}
