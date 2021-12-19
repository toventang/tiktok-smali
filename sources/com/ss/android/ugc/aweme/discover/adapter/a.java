package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.c.a;
import com.ss.android.ugc.aweme.lego.c.b;
import com.ss.android.ugc.aweme.search.j;
import h.f.b.l;

public abstract class a extends b<Fragment> {

    /* renamed from: f  reason: collision with root package name */
    private static final C1872a f80296f = new C1872a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private n f80297a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f80298b = true;

    /* renamed from: c  reason: collision with root package name */
    private final i f80299c;

    static {
        Covode.recordClassIndex(49985);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        l.d(viewGroup, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.a$a  reason: collision with other inner class name */
    static final class C1872a {
        static {
            Covode.recordClassIndex(49986);
        }

        private C1872a() {
        }

        public /* synthetic */ C1872a(byte b2) {
            this();
        }
    }

    public a(i iVar) {
        l.d(iVar, "");
        this.f80299c = iVar;
    }

    @Override // com.ss.android.ugc.aweme.lego.c.b
    public final boolean b(int i2) {
        if (!this.f80298b || !super.b(i2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        n nVar = this.f80297a;
        if (nVar != null) {
            nVar.c();
            this.f80297a = null;
            this.f80299c.b();
        }
    }

    private static String a(int i2, long j2) {
        return "ViewPager:Fragment:" + i2 + ':' + j2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        if (view == ((Fragment) obj).getView()) {
            return true;
        }
        return false;
    }

    private final boolean a(Fragment fragment, String str) {
        if (fragment.isAdded()) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "TikTokSearch", "PagerAdapter added, ignoring");
            return false;
        } else if (this.f80299c.a(str) == null) {
            return true;
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(4, "TikTokSearch", "PagerAdapter manager already found the fragment ");
            return false;
        }
    }

    /* renamed from: a */
    public final Fragment b(ViewGroup viewGroup, int i2) {
        Fragment fragment;
        l.d(viewGroup, "");
        if (!this.f80298b || (fragment = (Fragment) this.f107462d.get(i2)) == null) {
            return null;
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        if (this.f80299c.a(a2) == null) {
            if (this.f80297a == null) {
                this.f80297a = this.f80299c.a();
            }
            n nVar = this.f80297a;
            if (nVar == null) {
                l.b();
            }
            nVar.a(viewGroup.getId(), fragment, a2);
            this.f107462d.remove(i2);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Boolean bool;
        l.d(viewGroup, "");
        if (this.f80297a == null) {
            this.f80297a = this.f80299c.a();
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        Fragment a3 = this.f80299c.a(a2);
        String a4 = j.a(i2);
        StringBuilder append = new StringBuilder("PagerAdapter instantiate check, pos: ").append(i2).append(" (").append(a4).append("), added: ");
        Boolean bool2 = null;
        if (a3 != null) {
            bool = Boolean.valueOf(a3.isAdded());
        } else {
            bool = null;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", append.append(bool).toString());
        if (a3 == null) {
            a3 = (Fragment) a(i2);
            StringBuilder append2 = new StringBuilder("PagerAdapter create, pos: ").append(i2).append(" (").append(a4).append("), added: ");
            if (a3 != null) {
                bool2 = Boolean.valueOf(a3.isAdded());
            }
            com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", append2.append(bool2).toString());
            if (!this.f80298b || !(a3 instanceof a.AbstractC2762a)) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter adding");
                l.b(a3, "");
                if (a(a3, a2)) {
                    n nVar = this.f80297a;
                    if (nVar == null) {
                        l.b();
                    }
                    l.b(nVar.a(viewGroup.getId(), a3, a2), "");
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter added, ignoring");
                }
            } else {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter storing");
                this.f107462d.put(i2, a3);
            }
        } else if (a(a3, a2)) {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter attaching");
            n nVar2 = this.f80297a;
            if (nVar2 == null) {
                l.b();
            }
            l.b(nVar2.e(a3), "");
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter attached, ignoring");
        }
        if (a3 != this.f107463e) {
            a3.setMenuVisibility(false);
            a3.setUserVisibleHint(false);
        }
        return a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.lego.c.b
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        if (b(i2)) {
            startUpdate(viewGroup);
            b(viewGroup, i2);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f107463e) {
            if (this.f107463e != null) {
                ((Fragment) this.f107463e).setMenuVisibility(false);
                Object obj2 = this.f107463e;
                l.b(obj2, "");
                ((Fragment) obj2).setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f107463e = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        if (this.f80297a == null) {
            this.f80297a = this.f80299c.a();
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        com.ss.android.ugc.aweme.framework.a.a.b(4, "TikTokSearch", "PagerAdapter destroyItem, pos: " + i2 + " (" + j.a(i2) + ')');
        if (!this.f80298b || this.f80299c.a(a2) == null) {
            n nVar = this.f80297a;
            if (nVar == null) {
                l.b();
            }
            l.b(nVar.d((Fragment) obj), "");
            return;
        }
        this.f107462d.remove(i2);
    }
}
