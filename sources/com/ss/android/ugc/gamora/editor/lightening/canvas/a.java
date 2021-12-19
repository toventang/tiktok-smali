package com.ss.android.ugc.gamora.editor.lightening.canvas;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.j;
import com.bytedance.o.f;
import com.bytedance.ui_component.b;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.io.Serializable;

public final class a extends b<EditPhotoCanvasViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.a<EditPhotoCanvasViewModel> f146158a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f146159b;

    /* renamed from: c  reason: collision with root package name */
    private n f146160c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f146161d;

    /* renamed from: e  reason: collision with root package name */
    private final f f146162e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.scene.group.b f146163f;

    /* renamed from: k  reason: collision with root package name */
    private final int f146164k = R.id.c9b;

    /* renamed from: l  reason: collision with root package name */
    private final h.f.a.a<j> f146165l;

    static {
        Covode.recordClassIndex(96054);
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditPhotoCanvasViewModel> b() {
        return this.f146158a;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146163f;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f146162e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.canvas.a$a  reason: collision with other inner class name */
    static final class C3903a extends m implements h.f.a.a<EditPhotoCanvasViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3903a f146166a = new C3903a();

        static {
            Covode.recordClassIndex(96055);
        }

        C3903a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditPhotoCanvasViewModel invoke() {
            return new EditPhotoCanvasViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        Serializable serializableExtra = this.f146161d.getSerializableExtra("photo_canvas_data");
        if (!(serializableExtra instanceof CanvasVideoData)) {
            serializableExtra = null;
        }
        CanvasVideoData canvasVideoData = (CanvasVideoData) serializableExtra;
        if (canvasVideoData != null) {
            this.f146159b = true;
            n nVar = new n(getDiContainer(), this.f146165l);
            this.f146163f.a(this.f146164k, nVar, "StoryEditCanvasScene");
            this.f146160c = nVar;
            nVar.a("12345", canvasVideoData);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.f.a.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Intent intent, f fVar, com.bytedance.scene.group.b bVar, h.f.a.a<? extends j> aVar) {
        l.d(intent, "");
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(aVar, "");
        this.f146161d = intent;
        this.f146162e = fVar;
        this.f146163f = bVar;
        this.f146165l = aVar;
        this.f146158a = C3903a.f146166a;
    }
}
