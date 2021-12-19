package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import androidx.core.app.d;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.f.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.z.b;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;

public class a extends c implements b {
    private VideoPublishEditModel A;
    private EditCommentStickerViewModel B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    public CommentVideoModel f127169a;

    /* renamed from: b  reason: collision with root package name */
    public String f127170b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f127171c;

    static {
        Covode.recordClassIndex(83415);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int e() {
        return 4;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.ay0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.f127169a != null) {
            return true;
        }
        return false;
    }

    private boolean r() {
        VideoPublishEditModel videoPublishEditModel = this.A;
        if (videoPublishEditModel == null) {
            return false;
        }
        return videoPublishEditModel.mIsFromDraft;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void d() {
        super.d();
        this.f127169a = null;
        this.B.a(false);
    }

    private static String q() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean g() {
        return ((EditCommentStickerState) this.B.a((d) this.t)).getInTimeEditView();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        if (!b() || this.f127193l == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        if (this.f127169a.isQuestion()) {
            interactStickerStruct.setType(7);
            interactStickerStruct.setIndex(5);
        } else {
            interactStickerStruct.setType(4);
            interactStickerStruct.setIndex(2);
        }
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(b(this.f127193l.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f127193l.getScale()));
        PointF a2 = a(this.f127193l.getCenterViewPoint());
        normalTrackTimeStamp.setX(a2.x);
        normalTrackTimeStamp.setY(a2.y);
        normalTrackTimeStamp.setStartTime((float) this.f127169a.getStartTime());
        normalTrackTimeStamp.setEndTime((float) this.f127169a.getEndTime());
        PointF a3 = a(new PointF((float) this.f127193l.getContentViewWidth(), (float) this.f127193l.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a3.x);
        normalTrackTimeStamp.setHeight(a3.y);
        linkedList.add(normalTrackTimeStamp);
        e.a(interactStickerStruct, linkedList);
        HashMap hashMap = new HashMap();
        hashMap.put("comment_sticker_id", "0");
        interactStickerStruct.setAttr(g.a().C().getRetrofitFactoryGson().b(hashMap));
        return interactStickerStruct;
    }

    public a(VideoPublishEditModel videoPublishEditModel) {
        this.A = videoPublishEditModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final com.ss.android.ugc.aweme.editSticker.interact.view.g a(Context context) {
        CommentVideoModel commentVideoModel = this.f127169a;
        if (commentVideoModel == null || !commentVideoModel.isQuestion()) {
            d dVar = new d(context);
            dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dVar.setController(this);
            dVar.setDumpData(this);
            dVar.setLockMode(true);
            return dVar;
        }
        f fVar = new f(context);
        fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fVar.setController(this);
        fVar.setDumpData(this);
        fVar.setLockMode(true);
        return fVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(String str) {
        if (m.a(str)) {
            return;
        }
        if (str.contains("pi_start") && str.contains("pi_end")) {
            super.a(str.replaceAll("pi_start(.*?)pi_end", q()));
        } else if (str.endsWith(File.separator)) {
            super.a(str + q());
        } else {
            super.a(str + q());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(boolean z) {
        super.a(z);
        if (!(this.f127193l instanceof d)) {
            return;
        }
        if (!r() || this.C) {
            ((d) this.f127193l).v();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar) {
        if (!(gVar instanceof d)) {
            return false;
        }
        boolean a2 = super.a(gVar);
        this.f127169a = null;
        this.B.a(false);
        if (this.A.commentVideoModel.isCommentFromEditPanel()) {
            this.A.commentVideoModel = null;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(Context context, FrameLayout frameLayout) {
        super.a(context, frameLayout);
        this.B = (EditCommentStickerViewModel) t.a((androidx.fragment.app.e) this.t).a(EditCommentStickerViewModel.class);
        this.f127171c = false;
    }

    public final void a(InteractStickerStruct interactStickerStruct, CommentVideoModel commentVideoModel) {
        this.f127169a = commentVideoModel;
        this.B.a(true);
        if (!(interactStickerStruct == null || commentVideoModel == null)) {
            a(commentVideoModel, true, false);
            this.f127170b = (String) ((HashMap) g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new com.google.gson.b.a<HashMap<String, String>>() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(83416);
                }
            }.type)).get("comment_sticker_id");
        }
        ((d) this.f127193l).a(commentVideoModel, new b(this, interactStickerStruct));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(boolean z, boolean z2) {
        super.a(z);
        if (!(this.f127193l instanceof d)) {
            return;
        }
        if (z2 || !r() || this.C) {
            ((d) this.f127193l).v();
        }
    }

    public final void a(CommentVideoModel commentVideoModel, boolean z, boolean z2) {
        this.B.a(true);
        this.f127169a = commentVideoModel;
        this.C = z2;
        a(z, true);
        if (this.n != null) {
            this.n.f();
        }
    }
}
