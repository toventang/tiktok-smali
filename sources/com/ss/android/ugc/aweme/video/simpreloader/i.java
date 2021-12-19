package com.ss.android.ugc.aweme.video.simpreloader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f143974a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f143975b;

    /* renamed from: c  reason: collision with root package name */
    private int f143976c;

    /* renamed from: d  reason: collision with root package name */
    private int f143977d;

    /* renamed from: e  reason: collision with root package name */
    private String f143978e;

    static {
        Covode.recordClassIndex(94205);
    }

    public i() {
        this(null, null, 3);
    }

    @Override // com.ss.android.ugc.aweme.video.simpreloader.h
    public final void b() {
        this.f143975b.size();
        e();
        this.f143975b.size();
    }

    @Override // com.ss.android.ugc.aweme.video.simpreloader.h
    public final void a() {
        int i2 = this.f143977d;
        if (i2 != -1) {
            int i3 = i2 + 1;
            this.f143977d = i3;
            if (i3 >= this.f143975b.size() || (this.f143977d - this.f143976c) + 1 > m.f143982d.f143604d) {
                this.f143975b.size();
                e();
                this.f143975b.size();
                return;
            }
            this.f143975b.get(this.f143977d).a();
        }
    }

    public final void c() {
        this.f143976c = -1;
        this.f143977d = -1;
        this.f143978e = "";
        for (T t : this.f143975b) {
            c<Void> cVar = t.f143970b;
            if (cVar != null) {
                cVar.g();
            }
            t.f143970b = null;
            Aweme aweme = t.f143971c.get();
            if (aweme != null) {
                aweme.getAid();
            }
        }
    }

    public final void d() {
        this.f143976c = -1;
        this.f143977d = -1;
        this.f143978e = "";
        Iterator<T> it = this.f143975b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f143975b.clear();
    }

    public final void e() {
        if (this.f143975b.size() > 0) {
            for (int size = this.f143975b.size() - 1; size >= 0; size--) {
                if (this.f143975b.get(size).f143971c.get() == null) {
                    this.f143975b.remove(size);
                }
            }
        }
    }

    public final int b(String str) {
        String str2;
        l.d(str, "");
        int size = this.f143975b.size();
        for (int i2 = 0; i2 < size; i2++) {
            Aweme aweme = this.f143975b.get(i2).f143971c.get();
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str, str2)) {
                return i2;
            }
        }
        return -1;
    }

    public final void a(String str) {
        l.d(str, "");
        int b2 = b(str);
        if (b2 >= 0 && !l.a((Object) this.f143978e, (Object) str)) {
            this.f143978e = str;
            int i2 = b2;
            do {
                this.f143975b.get(i2).b();
                if (i2 < b2) {
                    this.f143975b.remove(i2);
                }
                i2--;
            } while (i2 >= 0);
            this.f143976c = b2;
            int i3 = b2 + 1;
            this.f143976c = i3;
            this.f143977d = i3;
            if (i3 < this.f143975b.size()) {
                this.f143975b.get(this.f143977d).a();
            }
        }
    }

    private i(String str, ArrayList<d> arrayList) {
        l.d(str, "");
        l.d(arrayList, "");
        this.f143974a = str;
        this.f143975b = arrayList;
        this.f143976c = -1;
        this.f143977d = -1;
        this.f143978e = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, ArrayList arrayList, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
