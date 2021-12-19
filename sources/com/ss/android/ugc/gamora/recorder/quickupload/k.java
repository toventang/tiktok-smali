package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.als.j;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import java.util.ArrayList;

public final class k extends j<j> implements com.bytedance.o.a, j {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f148216a = {new y(k.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(k.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(k.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(k.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final d f148217b = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.k<Boolean> f148218c;

    /* renamed from: d  reason: collision with root package name */
    final n f148219d;

    /* renamed from: e  reason: collision with root package name */
    v f148220e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f148221f;

    /* renamed from: g  reason: collision with root package name */
    private final d f148222g;

    /* renamed from: h  reason: collision with root package name */
    private final d f148223h;

    /* renamed from: i  reason: collision with root package name */
    private final d f148224i;

    /* renamed from: j  reason: collision with root package name */
    private final f f148225j;

    /* renamed from: k  reason: collision with root package name */
    private final int f148226k = R.id.dj5;

    static {
        Covode.recordClassIndex(97688);
    }

    /* access modifiers changed from: package-private */
    public final ShortVideoContext a() {
        return (ShortVideoContext) this.f148224i.a(this, f148216a[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ j getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148225j;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f148221f.a(this.f148226k, this.f148219d, "QuickUploadScene");
        this.f148219d.f148231b.a(this, new a(this));
        this.f148219d.f148233d.a(this, new b(this));
    }

    static final class b<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f148228a;

        static {
            Covode.recordClassIndex(97690);
        }

        b(k kVar) {
            this.f148228a = kVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148228a.f148218c.a((Boolean) obj);
        }
    }

    static final class a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f148227a;

        static {
            Covode.recordClassIndex(97689);
        }

        a(k kVar) {
            this.f148227a = kVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            MediaModel mediaModel = (MediaModel) obj;
            k kVar = this.f148227a;
            String str = "";
            l.b(mediaModel, str);
            if (!mediaModel.b() || mediaModel.f109396h < di.a()) {
                i2 = 11;
            } else {
                i2 = 13;
            }
            kVar.f148220e = MediaChosenResultProcessFactory.a().a((e) kVar.f148217b.a(kVar, k.f148216a[0]), i2, di.a(), -1);
            Intent intent = new Intent();
            intent.putExtra("key_short_video_context", kVar.a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaModel);
            intent.putExtra("key_choose_media_data", arrayList);
            intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            String str2 = kVar.a().q;
            if (str2 != null) {
                str = str2;
            }
            intent.putExtra("creation_id", str);
            v vVar = kVar.f148220e;
            if (vVar != null) {
                vVar.a(1, -1, intent);
            }
        }
    }

    public k(com.bytedance.scene.group.b bVar, f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f148221f = bVar;
        this.f148225j = fVar;
        d b2 = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
        this.f148222g = b2;
        d b3 = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
        this.f148223h = b3;
        this.f148224i = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.f148218c = new com.bytedance.als.k<>();
        i<?>[] iVarArr = f148216a;
        this.f148219d = new n((com.ss.android.ugc.aweme.shortvideo.h.a) b2.a(this, iVarArr[1]), (com.bytedance.creativex.recorder.gesture.api.b) b3.a(this, iVarArr[2]), getDiContainer(), a());
    }
}
