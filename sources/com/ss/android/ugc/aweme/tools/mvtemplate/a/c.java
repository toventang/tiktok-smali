package com.ss.android.ugc.aweme.tools.mvtemplate.a;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.setting.i.i;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPhotoMvFailsStrategy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.f;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.g;
import dmt.av.video.SingleImageCoverBitmapData;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements v {

    /* renamed from: a  reason: collision with root package name */
    public final e f140728a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.view.a f140729b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f140730c = i.a();

    static {
        Covode.recordClassIndex(91902);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(91903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    public final void b() {
        com.ss.android.ugc.aweme.view.a aVar;
        com.ss.android.ugc.aweme.view.a aVar2 = this.f140729b;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f140729b) != null) {
            aVar.dismiss();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        final /* synthetic */ ArrayList $selectedMediaData;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(91904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, ArrayList arrayList, int i2, int i3, Intent intent) {
            super(0);
            this.this$0 = cVar;
            this.$selectedMediaData = arrayList;
            this.$requestCode = i2;
            this.$resultCode = i3;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            if (this.$selectedMediaData.size() > 1) {
                ((IPhotoMvFailsStrategy) ServiceManager.get().getService(IPhotoMvFailsStrategy.class)).multiPicOriginStrategy(this.this$0.f140728a, this.$requestCode, this.$resultCode, this.$data);
            } else {
                ((IPhotoMvFailsStrategy) ServiceManager.get().getService(IPhotoMvFailsStrategy.class)).singlePicOriginStrategy(this.this$0.f140728a, this.$requestCode, this.$resultCode, this.$data);
            }
            return z.f158842a;
        }
    }

    public c(e eVar) {
        l.d(eVar, "");
        this.f140728a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        boolean z;
        l.d(intent, "");
        if (i2 == 1 && i3 == -1) {
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            if (parcelableExtra == null) {
                l.b();
            }
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                l.b();
            }
            l.b(parcelableArrayListExtra, "");
            int intExtra = intent.getIntExtra("key_choose_media_item_size", 0);
            if (this.f140729b == null) {
                com.ss.android.ugc.aweme.view.a aVar = new com.ss.android.ugc.aweme.view.a(this.f140728a);
                this.f140729b = aVar;
                aVar.setCancelable(false);
            }
            com.ss.android.ugc.aweme.view.a aVar2 = this.f140729b;
            if (aVar2 != null) {
                aVar2.show();
            }
            e eVar = this.f140728a;
            if (eVar instanceof w) {
                z = ((w) eVar).i();
            } else {
                z = true;
            }
            if (this.f140730c) {
                Object obj = parcelableArrayListExtra.get(0);
                l.b(obj, "");
                String str = ((MediaModel) obj).f109390b;
                l.b(str, "");
                Object obj2 = parcelableArrayListExtra.get(0);
                l.b(obj2, "");
                long j2 = ((MediaModel) obj2).f109394f;
                Object obj3 = parcelableArrayListExtra.get(0);
                l.b(obj3, "");
                int i4 = ((MediaModel) obj3).f109395g;
                Object obj4 = parcelableArrayListExtra.get(0);
                l.b(obj4, "");
                int i5 = ((MediaModel) obj4).f109400l;
                Object obj5 = parcelableArrayListExtra.get(0);
                l.b(obj5, "");
                shortVideoContext.aV = new SingleImageCoverBitmapData(str, intExtra, j2, i4, i5, ((MediaModel) obj5).f109401m, null, 64, null);
            }
            f.a aVar3 = new f.a(this.f140728a, shortVideoContext, parcelableArrayListExtra, z, new a(this), new b(this, parcelableArrayListExtra, i2, i3, intent));
            l.d(aVar3, "");
            f.a aVar4 = aVar3;
            e eVar2 = new e(aVar4.f140771a, false);
            ShortVideoContext shortVideoContext2 = aVar4.f140772b;
            ArrayList<MediaModel> arrayList = aVar4.f140773c;
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f109390b);
            }
            eVar2.a(shortVideoContext2, arrayList2, new g.a(aVar3), false, Long.valueOf(System.currentTimeMillis()), aVar4.f140774d, aVar4.f140773c);
            e eVar3 = this.f140728a;
            if (eVar3 instanceof w) {
                ((w) eVar3).g();
            }
        }
    }
}
