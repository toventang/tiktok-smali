package com.ss.android.ugc.aweme.music.assem.list.cell.assem;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.music.assem.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;

public final class MusicCellViewModel extends AssemViewModel<k> implements d {

    /* renamed from: j  reason: collision with root package name */
    final com.ss.android.ugc.aweme.favorites.g.a f111199j = new com.ss.android.ugc.aweme.favorites.g.a();

    static {
        Covode.recordClassIndex(71407);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        this.f111199j.a_(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ k f() {
        return new k();
    }

    public final void h() {
        a(b.f111200a);
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(h.class));
        if (bVar != null) {
            return bVar.f111136d;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    static final class b extends m implements h.f.a.b<k, k> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111200a = new b();

        static {
            Covode.recordClassIndex(71409);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            return k.a(kVar2, kVar2.f111236a, null, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        if (str != null) {
            a(new a(str));
        }
    }

    static final class a extends m implements h.f.a.b<k, k> {
        final /* synthetic */ String $msg;

        static {
            Covode.recordClassIndex(71408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.$msg = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            l.d(kVar2, "");
            return k.a(kVar2, false, new com.bytedance.assem.arch.extensions.a(this.$msg), 1);
        }
    }

    static final class c extends m implements h.f.a.b<k, k> {
        final /* synthetic */ boolean $isPin;
        final /* synthetic */ MusicModel $model;
        final /* synthetic */ int $position;
        final /* synthetic */ String $previousPage;
        final /* synthetic */ MusicCellViewModel this$0;

        static {
            Covode.recordClassIndex(71410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MusicCellViewModel musicCellViewModel, String str, MusicModel musicModel, int i2, boolean z) {
            super(1);
            this.this$0 = musicCellViewModel;
            this.$previousPage = str;
            this.$model = musicModel;
            this.$position = i2;
            this.$isPin = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v0, types: [int, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.music.assem.list.cell.assem.k invoke(com.ss.android.ugc.aweme.music.assem.list.cell.assem.k r22) {
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellViewModel.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(MusicModel musicModel, String str, int i2, boolean z) {
        l.d(musicModel, "");
        a(new c(this, str, musicModel, i2, z));
    }
}
