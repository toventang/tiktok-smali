package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.ss.android.ugc.aweme.editSticker.a.b;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.sticker.d.a;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;

public class d extends g {
    protected CommentStickerView q;
    private int r;
    private int s;
    private int t;
    private EditCommentStickerViewModel u;

    static {
        Covode.recordClassIndex(83419);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public View getDrawView() {
        return this.q;
    }

    public final void s() {
        this.q.setVisibility(0);
    }

    public final a u() {
        return this.q.c();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final b a() {
        return new com.ss.android.ugc.aweme.shortvideo.sticker.a.b(this, new g.a());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean d() {
        if (this.q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean i() {
        return ((EditCommentStickerState) this.u.a((androidx.core.app.d) this.f88212a)).getInTimeEditView();
    }

    /* access modifiers changed from: protected */
    public void r() {
        MethodCollector.i(6064);
        LayoutInflater.from(this.f88212a).inflate(R.layout.ai0, this);
        MethodCollector.o(6064);
    }

    public final void t() {
        if (this.q.e()) {
            post(new f(this));
        }
    }

    public final void v() {
        int c2;
        if (this.f88218g != null) {
            if (c.a(this.f88212a)) {
                this.f88218g.setX(n.b(getContext(), -32.0f));
            } else {
                this.f88218g.setX(n.b(getContext(), 32.0f));
            }
            if (com.ss.android.ugc.aweme.adaptation.a.f66177a.e()) {
                c2 = 0;
            } else {
                c2 = dh.c(this.f88212a);
            }
            this.f88218g.setY(n.b(getContext(), 130.0f) + ((float) c2));
        }
    }

    public d(Context context) {
        this(context, (byte) 0);
    }

    public void setAlpha(float f2) {
        this.q.setAlpha(f2);
    }

    public void setController(a aVar) {
        this.q.setController(aVar);
    }

    public void setDumpData(com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar) {
        CommentStickerView commentStickerView = this.q;
        if (commentStickerView != null) {
            commentStickerView.setDumpData(bVar);
        }
    }

    public void setPlayPosition(long j2) {
        this.q.setPlayPosition(j2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean b(MotionEvent motionEvent) {
        boolean b2 = super.b(motionEvent);
        this.q.setTouching(false);
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.z.c cVar) {
        this.f88218g.post(new g(this, cVar));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean a(MotionEvent motionEvent) {
        boolean a2 = super.a(motionEvent);
        if (a2) {
            this.q.setTouching(true);
        }
        return a2;
    }

    public final void a(CommentVideoModel commentVideoModel, com.ss.android.ugc.aweme.z.c cVar) {
        setVisibility(4);
        this.q.a(commentVideoModel, new e(this, cVar));
    }

    public d(Context context, byte b2) {
        super(context, null);
        this.f88212a = context;
        this.s = (int) n.b(context, 32.0f);
        int a2 = n.a(context) - this.s;
        this.r = a2;
        this.t = a2;
        this.u = (EditCommentStickerViewModel) t.a((e) this.f88212a).a(EditCommentStickerViewModel.class);
        r();
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        this.q = (CommentStickerView) findViewById(R.id.aek);
        setVisibility(8);
    }
}
