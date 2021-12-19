package com.ss.android.ugc.aweme.kids.choosemusic.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.kids.choosemusic.c.p;
import com.ss.android.ugc.aweme.lego.c.a;
import h.f.b.l;
import java.util.ArrayList;

public final class j extends a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<p> f105477a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f105478b;

    /* renamed from: c  reason: collision with root package name */
    private i f105479c;

    /* renamed from: f  reason: collision with root package name */
    private String f105480f;

    /* renamed from: g  reason: collision with root package name */
    private String f105481g;

    /* renamed from: h  reason: collision with root package name */
    private String f105482h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f105483i;

    /* renamed from: j  reason: collision with root package name */
    private String f105484j;

    /* renamed from: k  reason: collision with root package name */
    private int f105485k;

    /* renamed from: l  reason: collision with root package name */
    private int f105486l;

    static {
        Covode.recordClassIndex(67587);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f105478b.size();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.lego.c.b
    public final /* synthetic */ Fragment a(int i2) {
        p pVar = this.f105477a.get(i2);
        l.b(pVar, "");
        return pVar;
    }

    private j(i iVar) {
        super(iVar);
        this.f105477a = new ArrayList<>();
        this.f105478b = new ArrayList<>();
    }

    public final void a(String str, String str2, boolean z, b<String, Object> bVar) {
        this.f105477a.add(p.a(str, str2, this.f105482h, this.f105486l, z, this.f105484j, 2, bVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(i iVar, String str, String str2, String str3, int i2, boolean z, String str4, int i3) {
        this(iVar);
        l.d(iVar, "");
        this.f105479c = iVar;
        this.f105480f = str;
        this.f105481g = str2;
        this.f105482h = str3;
        this.f105486l = i2;
        this.f105483i = z;
        this.f105482h = str3;
        this.f105484j = str4;
        this.f105485k = i3;
    }
}
