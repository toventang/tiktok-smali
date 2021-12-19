package com.ss.android.ugc.aweme.ck;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f71154a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f71155b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f71156c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f71157d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f71158e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f71159f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f71160g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f71161h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<String> f71162i;

    static {
        Covode.recordClassIndex(43798);
    }

    public final void a() {
        a(this.f71156c);
        a(this.f71160g);
        a(this.f71161h);
        a(this.f71159f);
        a(this.f71158e);
        a(this.f71154a);
        a(this.f71155b);
        a(this.f71157d);
        a(this.f71156c);
    }

    private static void a(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.clear();
        }
    }

    public final void b(String str) {
        if (this.f71154a == null) {
            this.f71154a = new ArrayList<>();
        }
        this.f71154a.add(str);
    }

    public final void a(String str) {
        if (this.f71162i == null) {
            this.f71162i = new ArrayList<>();
        }
        this.f71162i.add(str);
    }

    static boolean a(ArrayList<String> arrayList, String str) {
        if (arrayList == null) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
