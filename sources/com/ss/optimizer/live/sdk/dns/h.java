package com.ss.optimizer.live.sdk.dns;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f151743a;

    /* renamed from: b  reason: collision with root package name */
    public k f151744b;

    /* renamed from: c  reason: collision with root package name */
    final List<String> f151745c = new ArrayList(10);

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, i> f151746d = new a();

    /* renamed from: e  reason: collision with root package name */
    final List<String> f151747e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public String f151748f = null;

    /* renamed from: g  reason: collision with root package name */
    private final Random f151749g;

    /* renamed from: h  reason: collision with root package name */
    private k f151750h;

    /* renamed from: i  reason: collision with root package name */
    private ReentrantLock f151751i = new ReentrantLock();

    static {
        Covode.recordClassIndex(101214);
    }

    /* access modifiers changed from: package-private */
    public final List<String> b() {
        this.f151751i.lock();
        ArrayList arrayList = new ArrayList();
        k kVar = this.f151744b;
        if (!(kVar == null || kVar.f151761b == null || this.f151744b.f151761b.isEmpty())) {
            arrayList.addAll(this.f151744b.f151761b);
        }
        this.f151751i.unlock();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List<String> c() {
        this.f151751i.lock();
        ArrayList arrayList = new ArrayList();
        k kVar = this.f151750h;
        if (!(kVar == null || kVar.f151761b == null || this.f151750h.f151761b.isEmpty())) {
            arrayList.addAll(this.f151750h.f151761b);
        }
        this.f151751i.unlock();
        return arrayList;
    }

    private boolean d() {
        this.f151745c.clear();
        k kVar = this.f151750h;
        if (kVar == null || this.f151744b == null) {
            return false;
        }
        if (kVar.f151761b.size() > 5) {
            this.f151745c.addAll(this.f151750h.f151761b.subList(0, 5));
        } else {
            this.f151745c.addAll(this.f151750h.f151761b);
        }
        ArrayList arrayList = new ArrayList(this.f151744b.f151761b);
        arrayList.removeAll(this.f151750h.f151761b);
        int size = 10 - this.f151745c.size();
        if (arrayList.size() >= size) {
            this.f151745c.addAll(arrayList.subList(0, size));
            return true;
        }
        this.f151745c.addAll(arrayList);
        int size2 = 10 - this.f151745c.size();
        if (this.f151750h.f151761b.size() - 5 > size2) {
            this.f151745c.addAll(this.f151750h.f151761b.subList(5, size2 + 5));
            return true;
        } else if (this.f151750h.f151761b.size() - 5 <= 0) {
            return true;
        } else {
            this.f151745c.addAll(this.f151750h.f151761b.subList(5, this.f151750h.f151761b.size()));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        this.f151751i.lock();
        List<String> list = this.f151747e;
        if (list == null || list.isEmpty()) {
            k kVar = this.f151750h;
            if (kVar == null || kVar.f151761b == null || this.f151750h.f151761b.isEmpty()) {
                k kVar2 = this.f151744b;
                if (kVar2 == null || kVar2.f151761b == null || this.f151744b.f151761b.isEmpty()) {
                    this.f151751i.unlock();
                    return null;
                }
                String str = this.f151744b.f151761b.get(this.f151749g.nextInt(this.f151744b.f151761b.size()));
                this.f151751i.unlock();
                return str;
            }
            String str2 = this.f151750h.f151761b.get(0);
            this.f151751i.unlock();
            return str2;
        }
        List<String> list2 = this.f151747e;
        String str3 = list2.get(this.f151749g.nextInt(list2.size()));
        this.f151751i.unlock();
        return str3;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        k kVar = this.f151750h;
        if (kVar == null || kVar.f151761b == null) {
            return null;
        }
        if (this.f151750h.f151761b.contains(str)) {
            return this.f151748f;
        }
        return "local_dns";
    }

    /* access modifiers changed from: package-private */
    public final boolean b(k kVar) {
        this.f151751i.lock();
        this.f151744b = kVar;
        this.f151751i.unlock();
        return d();
    }

    h(String str) {
        this.f151743a = str;
        this.f151749g = new Random(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final boolean a(k kVar) {
        this.f151751i.lock();
        this.f151750h = kVar;
        this.f151751i.unlock();
        return d();
    }
}
