package com.bytedance.android.livesdk.live;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdk.widget.i;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class a extends i {

    /* renamed from: a  reason: collision with root package name */
    private final f f18647a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f18648b;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, com.bytedance.android.livesdkapi.depend.d.i> f18649e = new androidx.c.a();

    /* renamed from: f  reason: collision with root package name */
    public i.a f18650f;

    static {
        Covode.recordClassIndex(10445);
    }

    public final void a() {
        this.f18647a.b(this.f18648b);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f18647a.a();
    }

    public final com.bytedance.android.livesdkapi.depend.d.i b(int i2) {
        return this.f18649e.get(c(i2));
    }

    @Override // com.bytedance.android.livesdk.widget.i
    public final String c(int i2) {
        return a(this.f18647a.a(i2));
    }

    @Override // com.bytedance.android.livesdk.widget.i
    public final Fragment a(int i2) {
        br brVar = new br();
        brVar.a(this.f18647a.a(i2), this.f18647a.c(i2));
        return brVar.n();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        EnterRoomConfig w;
        int a2;
        if ((obj instanceof com.bytedance.android.livesdkapi.depend.d.i) && (w = ((com.bytedance.android.livesdkapi.depend.d.i) obj).w()) != null && (a2 = this.f18647a.a(w)) >= 0) {
            return a2;
        }
        return -2;
    }

    private static String a(EnterRoomConfig enterRoomConfig) {
        if (!TextUtils.isEmpty(enterRoomConfig.f23299c.as)) {
            return enterRoomConfig.f23299c.as;
        }
        String str = enterRoomConfig.f23299c.R + "_" + enterRoomConfig.f23298b.f23309a;
        enterRoomConfig.f23299c.as = str;
        return str;
    }

    public a(androidx.fragment.app.i iVar, f fVar) {
        super(iVar);
        b bVar = new b(this);
        this.f18648b = bVar;
        this.f18647a = fVar;
        fVar.a(bVar);
    }

    @Override // com.bytedance.android.livesdk.widget.i, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        com.bytedance.android.livesdkapi.depend.d.i iVar = (com.bytedance.android.livesdkapi.depend.d.i) super.instantiateItem(viewGroup, i2);
        iVar.c(i2);
        this.f18649e.put(c(i2), iVar);
        iVar.a(this.f18650f);
        return iVar;
    }

    @Override // com.bytedance.android.livesdk.widget.i, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (obj instanceof com.bytedance.android.livesdkapi.depend.d.i) {
            com.bytedance.android.livesdkapi.depend.d.i iVar = (com.bytedance.android.livesdkapi.depend.d.i) obj;
            iVar.c();
            this.f18647a.a(iVar.A());
            this.f18649e.remove(a(iVar.w()));
        }
        super.destroyItem(viewGroup, i2, obj);
    }
}
