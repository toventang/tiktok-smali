package com.ss.android.ugc.aweme.choosemusic.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.c.af;
import com.ss.android.ugc.aweme.lego.c.a;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import java.util.ArrayList;

public final class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<af> f70310a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<MusicCollectionItem> f70311b;

    /* renamed from: c  reason: collision with root package name */
    private i f70312c;

    /* renamed from: f  reason: collision with root package name */
    private String f70313f;

    /* renamed from: g  reason: collision with root package name */
    private String f70314g;

    /* renamed from: h  reason: collision with root package name */
    private String f70315h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f70316i;

    /* renamed from: j  reason: collision with root package name */
    private String f70317j;

    /* renamed from: k  reason: collision with root package name */
    private int f70318k;

    /* renamed from: l  reason: collision with root package name */
    private int f70319l;

    static {
        Covode.recordClassIndex(43372);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f70311b.size();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.lego.c.b
    public final /* synthetic */ Fragment a(int i2) {
        af afVar = this.f70310a.get(i2);
        h.f.b.l.b(afVar, "");
        return afVar;
    }

    private l(i iVar) {
        super(iVar);
        this.f70310a = new ArrayList<>();
        this.f70311b = new ArrayList<>();
    }

    public final void a(String str, String str2, boolean z, b<String, Object> bVar, int i2) {
        this.f70310a.add(af.a(str, str2, this.f70315h, this.f70319l, z, this.f70317j, 2, bVar, i2, null, false));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(i iVar, String str, String str2, String str3, int i2, boolean z, String str4, int i3) {
        this(iVar);
        h.f.b.l.d(iVar, "");
        this.f70312c = iVar;
        this.f70313f = str;
        this.f70314g = str2;
        this.f70315h = str3;
        this.f70319l = i2;
        this.f70316i = z;
        this.f70315h = str3;
        this.f70317j = str4;
        this.f70318k = i3;
    }
}
