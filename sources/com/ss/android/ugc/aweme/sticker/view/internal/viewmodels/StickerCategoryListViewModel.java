package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.m.i;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.c.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import h.f.b.l;
import java.util.List;

public final class StickerCategoryListViewModel extends HumbleViewModel implements au, a {

    /* renamed from: a  reason: collision with root package name */
    long f136632a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f136633b;

    /* renamed from: c  reason: collision with root package name */
    final i f136634c;

    /* renamed from: d  reason: collision with root package name */
    private int f136635d;

    /* renamed from: e  reason: collision with root package name */
    private final t<Boolean> f136636e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<Boolean> f136637f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<com.ss.android.ugc.tools.view.widget.b.a> f136638g;

    /* renamed from: h  reason: collision with root package name */
    private final t<List<EffectCategoryModel>> f136639h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<EffectCategoryModel>> f136640i;

    /* renamed from: j  reason: collision with root package name */
    private final m f136641j;

    /* renamed from: k  reason: collision with root package name */
    private final o f136642k;

    static {
        Covode.recordClassIndex(89237);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final int a() {
        return this.f136635d;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final LiveData<Boolean> b() {
        return this.f136637f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final LiveData<List<EffectCategoryModel>> c() {
        return this.f136640i;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
        return this.f136638g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final void e() {
        this.f136632a = System.currentTimeMillis();
        this.f136642k.c().j().b().observe(this.f136641j, new a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel.f():void");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f136642k.c().a(dVar);
    }

    static final class a<T> implements u<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickerCategoryListViewModel f136643a;

        static {
            Covode.recordClassIndex(89238);
        }

        a(StickerCategoryListViewModel stickerCategoryListViewModel) {
            this.f136643a = stickerCategoryListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar) {
            a.EnumC1574a aVar2;
            com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar3 = aVar;
            if (aVar3 != null && (aVar2 = aVar3.f69569b) != null) {
                int i2 = c.f136647a[aVar2.ordinal()];
                if (i2 == 1) {
                    this.f136643a.f136633b.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                    this.f136643a.f();
                    StickerCategoryListViewModel stickerCategoryListViewModel = this.f136643a;
                    stickerCategoryListViewModel.f136634c.a(System.currentTimeMillis() - stickerCategoryListViewModel.f136632a);
                } else if (i2 == 2) {
                    this.f136643a.f136633b.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
                } else if (i2 == 3) {
                    this.f136643a.f136633b.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerCategoryListViewModel(m mVar, o oVar, com.ss.android.ugc.aweme.sticker.m.i iVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(iVar, "");
        this.f136641j = mVar;
        this.f136642k = oVar;
        this.f136634c = iVar;
        t<Boolean> tVar = new t<>();
        this.f136636e = tVar;
        this.f136637f = tVar;
        t<com.ss.android.ugc.tools.view.widget.b.a> tVar2 = new t<>();
        this.f136633b = tVar2;
        this.f136638g = tVar2;
        t<List<EffectCategoryModel>> tVar3 = new t<>();
        this.f136639h = tVar3;
        this.f136640i = com.bytedance.k.a.a(tVar3);
        f();
    }
}
