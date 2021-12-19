package com.ss.android.ugc.aweme.choosemusic.e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a implements IAccountService.b, b {

    /* renamed from: d  reason: collision with root package name */
    private static String f70521d = "FAKE_USER";

    /* renamed from: a  reason: collision with root package name */
    public int f70522a = -1;

    /* renamed from: b  reason: collision with root package name */
    public List<MusicSearchHistory> f70523b;

    /* renamed from: c  reason: collision with root package name */
    public List<WeakReference<AbstractC1593a>> f70524c;

    /* renamed from: e  reason: collision with root package name */
    private int f70525e = 10;

    /* renamed from: f  reason: collision with root package name */
    private f f70526f = new f();

    /* renamed from: g  reason: collision with root package name */
    private IAccountService f70527g;

    /* renamed from: h  reason: collision with root package name */
    private List<Pair<String, List<MusicSearchHistory>>> f70528h;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a$a  reason: collision with other inner class name */
    public interface AbstractC1593a {
        static {
            Covode.recordClassIndex(43495);
        }

        void a(List<MusicSearchHistory> list);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(String str);

    /* access modifiers changed from: package-private */
    public abstract List<MusicSearchHistory> c();

    /* access modifiers changed from: package-private */
    public abstract String d();

    static {
        Covode.recordClassIndex(43492);
    }

    public final void b() {
        try {
            a(this.f70526f.b(this.f70528h, new com.google.gson.b.a<List<Pair<String, List<MusicSearchHistory>>>>() {
                /* class com.ss.android.ugc.aweme.choosemusic.e.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43493);
                }
            }.type));
        } catch (Exception unused) {
        }
    }

    public final List<MusicSearchHistory> e() {
        ArrayList arrayList = new ArrayList();
        List<MusicSearchHistory> list = this.f70523b;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f70523b);
        }
        return arrayList;
    }

    protected a() {
        IAccountService a2 = AccountService.a();
        this.f70527g = a2;
        a2.a(this);
        this.f70528h = h();
        g();
    }

    public final void a() {
        List<MusicSearchHistory> list = this.f70523b;
        List<WeakReference<AbstractC1593a>> list2 = this.f70524c;
        if (list2 != null) {
            for (WeakReference<AbstractC1593a> weakReference : list2) {
                if (weakReference.get() != null) {
                    weakReference.get().a(list);
                }
            }
        }
    }

    private void g() {
        String str;
        IAccountUserService e2 = this.f70527g.e();
        if (e2.isLogin()) {
            str = e2.getCurUserId();
        } else {
            str = f70521d;
        }
        Iterator<Pair<String, List<MusicSearchHistory>>> it = this.f70528h.iterator();
        this.f70523b = new ArrayList();
        while (it.hasNext()) {
            Pair<String, List<MusicSearchHistory>> next = it.next();
            if (TextUtils.equals((CharSequence) next.first, str)) {
                this.f70523b.addAll((Collection) next.second);
                it.remove();
            }
        }
        this.f70528h.add(0, new Pair<>(str, this.f70523b));
        if (this.f70525e > 0 && this.f70528h.size() > this.f70525e) {
            List<Pair<String, List<MusicSearchHistory>>> list = this.f70528h;
            list.remove(list.size() - 1);
        }
        b();
    }

    private List<Pair<String, List<MusicSearchHistory>>> h() {
        try {
            String d2 = d();
            if (TextUtils.isEmpty(d2)) {
                List<MusicSearchHistory> c2 = c();
                if (c2 == null) {
                    c2 = new ArrayList<>();
                } else {
                    f();
                }
                ArrayList arrayList = new ArrayList();
                this.f70528h = arrayList;
                arrayList.add(new Pair(f70521d, c2));
            } else {
                this.f70528h = (List) this.f70526f.a(d2, new com.google.gson.b.a<List<Pair<String, List<MusicSearchHistory>>>>() {
                    /* class com.ss.android.ugc.aweme.choosemusic.e.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(43494);
                    }
                }.type);
            }
        } catch (Exception unused) {
        }
        if (this.f70528h == null) {
            this.f70528h = new ArrayList();
        }
        return this.f70528h;
    }

    public final void a(MusicSearchHistory musicSearchHistory) {
        this.f70523b.remove(musicSearchHistory);
        b();
        a();
    }

    public final void b(MusicSearchHistory musicSearchHistory) {
        this.f70523b.remove(musicSearchHistory);
        this.f70523b.add(0, musicSearchHistory);
        if (this.f70522a > 0 && this.f70523b.size() > this.f70522a) {
            List<MusicSearchHistory> list = this.f70523b;
            list.remove(list.size() - 1);
        }
        b();
        a();
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public void onAccountResult(int i2, boolean z, int i3, User user) {
        if (i2 != 2) {
            if (i2 == 1 || i2 == 3) {
                Iterator<Pair<String, List<MusicSearchHistory>>> it = this.f70528h.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals((CharSequence) it.next().first, f70521d)) {
                        it.remove();
                    }
                }
                b();
            } else {
                return;
            }
        }
        this.f70528h.clear();
        this.f70528h = h();
        g();
    }
}
