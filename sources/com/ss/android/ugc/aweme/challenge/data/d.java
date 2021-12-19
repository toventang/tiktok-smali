package com.ss.android.ugc.aweme.challenge.data;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.b.a;
import com.google.gson.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d implements IAccountService.b {

    /* renamed from: c  reason: collision with root package name */
    private static String f69933c = "FAKE_USER";

    /* renamed from: d  reason: collision with root package name */
    private static d f69934d;

    /* renamed from: a  reason: collision with root package name */
    public int f69935a = 20;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f69936b;

    /* renamed from: e  reason: collision with root package name */
    private int f69937e = 10;

    /* renamed from: f  reason: collision with root package name */
    private f f69938f = new f();

    /* renamed from: g  reason: collision with root package name */
    private IAccountService f69939g;

    /* renamed from: h  reason: collision with root package name */
    private List<Pair<String, List<a>>> f69940h;

    static {
        Covode.recordClassIndex(43127);
    }

    public final void b() {
        try {
            a(this.f69938f.b(this.f69940h, new a<List<Pair<String, List<a>>>>() {
                /* class com.ss.android.ugc.aweme.challenge.data.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43128);
                }
            }.type));
        } catch (Exception unused) {
        }
    }

    d() {
        IAccountService a2 = AccountService.a();
        this.f69939g = a2;
        a2.a(this);
        this.f69940h = d();
        c();
    }

    public static d a() {
        MethodCollector.i(3183);
        if (f69934d == null) {
            synchronized (d.class) {
                try {
                    if (f69934d == null) {
                        f69934d = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3183);
                    throw th;
                }
            }
        }
        d dVar = f69934d;
        MethodCollector.o(3183);
        return dVar;
    }

    private List<Pair<String, List<a>>> d() {
        try {
            this.f69940h = (List) this.f69938f.a(com.ss.android.ugc.aweme.base.h.d.d().a("hash_tag_history", ""), new a<List<Pair<String, List<a>>>>() {
                /* class com.ss.android.ugc.aweme.challenge.data.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43129);
                }
            }.type);
        } catch (Exception unused) {
        }
        if (this.f69940h == null) {
            this.f69940h = new ArrayList();
        }
        return this.f69940h;
    }

    private void c() {
        String str;
        IAccountUserService e2 = this.f69939g.e();
        if (e2.isLogin()) {
            str = e2.getCurUserId();
        } else {
            str = f69933c;
        }
        Iterator<Pair<String, List<a>>> it = this.f69940h.iterator();
        this.f69936b = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<a>> next = it.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, str) && next.second != null && ((List) next.second).size() > 0) {
                this.f69936b.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.f69940h.add(0, new Pair<>(str, this.f69936b));
        if (this.f69937e > 0 && this.f69940h.size() > this.f69937e) {
            List<Pair<String, List<a>>> list = this.f69940h;
            list.remove(list.size() - 1);
        }
        b();
    }

    private static void a(String str) {
        com.ss.android.ugc.aweme.base.h.d.d().b("hash_tag_history", str);
    }

    public final void a(List<e> list) {
        String str;
        if (list != null && list.size() > 0) {
            for (e eVar : list) {
                List<a> list2 = this.f69936b;
                if (eVar == null) {
                    str = "";
                } else {
                    str = eVar.f69943a;
                }
                list2.add(new a(str, true));
            }
            b();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public void onAccountResult(int i2, boolean z, int i3, User user) {
        if (i2 != 2) {
            if (i2 == 1 || i2 == 3) {
                Iterator<Pair<String, List<a>>> it = this.f69940h.iterator();
                while (it.hasNext()) {
                    Pair<String, List<a>> next = it.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, f69933c)) {
                        it.remove();
                    }
                }
                b();
            } else {
                return;
            }
        }
        this.f69940h.clear();
        this.f69940h = d();
        c();
    }
}
