package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.bytedance.scene.group.f;
import com.bytedance.scene.ui.a;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.a.n;
import h.a.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class l extends a {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends MvImageChooseAdapter.MyMediaModel> f129414a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final b f129415b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, c> f129416c = new LinkedHashMap();

    static {
        Covode.recordClassIndex(84954);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f129414a.size();
    }

    public final c b(int i2) {
        c cVar = this.f129416c.get(Integer.valueOf(i2));
        if (cVar == null) {
            cVar = null;
        }
        return cVar;
    }

    @Override // com.bytedance.scene.ui.a
    public final f a(int i2) {
        f eVar;
        MediaModel mediaModel = (MediaModel) n.b((List) this.f129414a, i2);
        if (mediaModel == null || !mediaModel.b()) {
            eVar = new e();
        } else {
            eVar = new n();
        }
        c cVar = (c) eVar;
        cVar.a(i2, this.f129415b);
        cVar.a((MvImageChooseAdapter.MyMediaModel) n.b((List) this.f129414a, i2));
        this.f129416c.put(Integer.valueOf(i2), cVar);
        return eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(b bVar, b bVar2) {
        super(bVar);
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        this.f129415b = bVar2;
    }

    @Override // com.bytedance.scene.ui.a, androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
        if ((obj instanceof c) && obj != null) {
            this.f129416c.remove(Integer.valueOf(i2));
        }
    }
}
