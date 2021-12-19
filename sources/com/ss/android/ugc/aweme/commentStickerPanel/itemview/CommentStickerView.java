package com.ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.util.bi;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.ArrayList;

public class CommentStickerView extends LinearLayout implements com.ss.android.ugc.aweme.editSticker.interact.h<com.ss.android.ugc.aweme.shortvideo.sticker.d.a> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f73194c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f73195a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.z.c f73196b;

    /* renamed from: d  reason: collision with root package name */
    private CommentVideoModel f73197d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.sticker.d.b f73198e;

    /* renamed from: f  reason: collision with root package name */
    private String f73199f;

    /* renamed from: g  reason: collision with root package name */
    private long f73200g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f73201h = true;

    /* renamed from: i  reason: collision with root package name */
    private long f73202i;

    /* renamed from: j  reason: collision with root package name */
    private SafeHandler f73203j;

    /* renamed from: k  reason: collision with root package name */
    private View f73204k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.z.b f73205l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f73206m = i.a((h.f.a.a) new b(this));
    private final h.h n = i.a((h.f.a.a) new d(this));
    private final h.h o = i.a((h.f.a.a) new e(this));
    private final h.h p = i.a((h.f.a.a) new h(this));
    private boolean q;

    static {
        Covode.recordClassIndex(45088);
    }

    private final CircleImageView getAvatarView() {
        return (CircleImageView) this.f73206m.getValue();
    }

    private final TuxTextView getCommentTextView() {
        return (TuxTextView) this.n.getValue();
    }

    private final LinearLayout getTextLayout() {
        return (LinearLayout) this.p.getValue();
    }

    /* access modifiers changed from: protected */
    public int getMLayoutId() {
        return R.layout.nh;
    }

    /* access modifiers changed from: protected */
    public int getMReplyTextId() {
        return R.string.fcp;
    }

    /* access modifiers changed from: protected */
    public final TuxTextView getReplyTextView() {
        return (TuxTextView) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45089);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final CommentVideoModel getData() {
        return this.f73197d;
    }

    /* access modifiers changed from: protected */
    public final View getMHintIcon() {
        return this.f73204k;
    }

    /* access modifiers changed from: protected */
    public final String getMUserName() {
        return this.f73199f;
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentStickerView f73208a;

        static {
            Covode.recordClassIndex(45094);
        }

        f(CommentStickerView commentStickerView) {
            this.f73208a = commentStickerView;
        }

        public final void run() {
            this.f73208a.e();
        }
    }

    static final class b extends m implements h.f.a.a<CircleImageView> {
        final /* synthetic */ CommentStickerView this$0;

        static {
            Covode.recordClassIndex(45090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CommentStickerView commentStickerView) {
            super(0);
            this.this$0 = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CircleImageView invoke() {
            return CommentStickerView.a(this.this$0).findViewById(R.id.a9u);
        }
    }

    static final class d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommentStickerView this$0;

        static {
            Covode.recordClassIndex(45092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommentStickerView commentStickerView) {
            super(0);
            this.this$0 = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return CommentStickerView.a(this.this$0).findViewById(R.id.aa7);
        }
    }

    static final class e extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommentStickerView this$0;

        static {
            Covode.recordClassIndex(45093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CommentStickerView commentStickerView) {
            super(0);
            this.this$0 = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return CommentStickerView.a(this.this$0).findViewById(R.id.aae);
        }
    }

    static final class h extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ CommentStickerView this$0;

        static {
            Covode.recordClassIndex(45096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CommentStickerView commentStickerView) {
            super(0);
            this.this$0 = commentStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return CommentStickerView.a(this.this$0).findViewById(R.id.ejn);
        }
    }

    private final void f() {
        getViewTreeObserver().addOnGlobalLayoutListener(new g(this));
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentStickerView f73207a;

        static {
            Covode.recordClassIndex(45091);
        }

        public final void onGlobalLayout() {
            if (CommentStickerView.a(this.f73207a).getWidth() > 0) {
                this.f73207a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f73207a.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(CommentStickerView commentStickerView) {
            this.f73207a = commentStickerView;
        }
    }

    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentStickerView f73209a;

        static {
            Covode.recordClassIndex(45095);
        }

        public final void onGlobalLayout() {
            this.f73209a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f73209a.setVisibility(0);
            com.ss.android.ugc.aweme.z.c cVar = this.f73209a.f73196b;
            if (cVar != null) {
                cVar.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(CommentStickerView commentStickerView) {
            this.f73209a = commentStickerView;
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int d() {
        if (getData() == null) {
            return 0;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            l.b();
        }
        if (!data.hasTimeData()) {
            return 0;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            l.b();
        }
        return data2.getStartTime();
    }

    public final boolean e() {
        boolean z;
        int i2 = 0;
        if (this.f73197d != null) {
            com.ss.android.ugc.aweme.z.b bVar = this.f73205l;
            if (bVar == null) {
                l.a("controller");
            }
            if (!bVar.a() && !this.q) {
                CommentVideoModel commentVideoModel = this.f73197d;
                if (commentVideoModel == null) {
                    l.b();
                }
                boolean isVisibleWhen = commentVideoModel.isVisibleWhen(this.f73200g);
                if (!isVisibleWhen || 8 != getVisibility()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!isVisibleWhen) {
                    i2 = 8;
                }
                eu.b(this, i2);
                this.f73201h = isVisibleWhen;
                return z;
            }
        }
        return false;
    }

    public final void a() {
        int width = getTextLayout().getWidth();
        View view = this.f73195a;
        if (view == null) {
            l.a("root");
        }
        int width2 = view.getWidth() - getTextLayout().getWidth();
        if (getCommentTextView().getWidth() >= width || getReplyTextView().getWidth() >= width) {
            if (getCommentTextView().getLineCount() <= 6) {
                a(15.0f, 18.0f);
            } else if (getCommentTextView().getLineCount() <= 9) {
                a(13.0f, 15.0f);
            } else {
                a(11.0f, 12.0f);
            }
            getCommentTextView().setMaxLines(8);
            f();
            return;
        }
        getLayoutParams().width = width2 + Math.max(getCommentTextView().getWidth(), getReplyTextView().getWidth());
        requestLayout();
        f();
    }

    /* renamed from: b */
    public final com.ss.android.ugc.aweme.shortvideo.sticker.d.a c() {
        CommentVideoModel commentVideoModel;
        InteractStickerStruct interactStickerStruct;
        InteractStickerStruct c2;
        if (this.f73197d == null) {
            this.f73197d = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        }
        CommentVideoModel commentVideoModel2 = this.f73197d;
        if (commentVideoModel2 == null) {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
        } else {
            commentVideoModel = new CommentVideoModel(null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, 65535, null);
            commentVideoModel.setStartTime(commentVideoModel2.getStartTime());
            commentVideoModel.setEndTime(commentVideoModel2.getEndTime());
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar = this.f73198e;
        if (bVar == null || (c2 = bVar.c()) == null) {
            interactStickerStruct = new InteractStickerStruct();
        } else {
            interactStickerStruct = new InteractStickerStruct();
            interactStickerStruct.setType(c2.getType());
            interactStickerStruct.setIndex(c2.getIndex());
            interactStickerStruct.setAttr(c2.getAttr());
            interactStickerStruct.setTrackList(c2.getTrackList());
        }
        return new com.ss.android.ugc.aweme.shortvideo.sticker.d.a(commentVideoModel, interactStickerStruct);
    }

    public final void setEnableEdit(boolean z) {
        this.f73201h = z;
    }

    /* access modifiers changed from: protected */
    public final void setMHintIcon(View view) {
        this.f73204k = view;
    }

    /* access modifiers changed from: protected */
    public final void setMUserName(String str) {
        this.f73199f = str;
    }

    public final void setPlayPosition(long j2) {
        this.f73200g = j2;
    }

    public final void setController(com.ss.android.ugc.aweme.z.b bVar) {
        l.d(bVar, "");
        this.f73205l = bVar;
    }

    public final void setDumpData(com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar) {
        l.d(bVar, "");
        this.f73198e = bVar;
    }

    public static final /* synthetic */ View a(CommentStickerView commentStickerView) {
        View view = commentStickerView.f73195a;
        if (view == null) {
            l.a("root");
        }
        return view;
    }

    private final void setAvatarImage(UrlModel urlModel) {
        if (urlModel != null) {
            com.ss.android.ugc.tools.c.a.a(getAvatarView(), urlModel, -1, -1);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.c
    public void setAlpha(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        setAlpha(f2);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int b(int i2) {
        if (getData() == null) {
            return i2;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            l.b();
        }
        if (!data.hasTimeData()) {
            return i2;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            l.b();
        }
        return data2.getEndTime();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int c(int i2) {
        if (getData() == null) {
            return i2;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            l.b();
        }
        if (!data.hasTimeData()) {
            return i2;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            l.b();
        }
        return data2.getEndTime();
    }

    public final void setTouching(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (!z) {
                this.f73202i = SystemClock.elapsedRealtime();
                SafeHandler safeHandler = this.f73203j;
                if (safeHandler == null) {
                    l.a("handler");
                }
                safeHandler.postDelayed(new f(this), 1000);
            }
        }
    }

    private final void setCommentMsg(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (gb.a(getContext())) {
                getCommentTextView().setGravity(5);
            }
            getCommentTextView().setText(str);
            EmojiServiceImplDiff.a().a(getCommentTextView());
            bj.a(" commentMsg: " + str + "  commentTextView： " + getCommentTextView().getText() + ' ' + " color: " + getCommentTextView().getCurrentTextColor() + "  setColor: " + androidx.core.content.b.c(getContext(), R.color.bx));
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int a(int i2) {
        if (getData() == null) {
            return i2;
        }
        CommentVideoModel data = getData();
        if (data == null) {
            l.b();
        }
        if (!data.hasTimeData()) {
            return i2;
        }
        CommentVideoModel data2 = getData();
        if (data2 == null) {
            l.b();
        }
        return data2.getStartTime();
    }

    private final void a(float f2, float f3) {
        getCommentTextView().setTextSize(0, com.ss.android.ttve.utils.b.b(getContext(), f2));
        bi.a(getCommentTextView(), (int) com.ss.android.ttve.utils.b.b(getContext(), f3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(1940);
        l.d(context, "");
        View a2 = com.a.a(LayoutInflater.from(context), getMLayoutId(), this, true);
        l.b(a2, "");
        this.f73195a = a2;
        setOrientation(0);
        setVisibility(4);
        Activity a3 = com.ss.android.ugc.aweme.scene.a.a(context);
        if (a3 != null) {
            this.f73203j = new SafeHandler((androidx.appcompat.app.d) a3);
            MethodCollector.o(1940);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.o(1940);
        throw nullPointerException;
    }

    public final void a(CommentVideoModel commentVideoModel, com.ss.android.ugc.aweme.z.c cVar) {
        UrlModel urlModel;
        String str;
        this.f73197d = commentVideoModel;
        this.f73196b = cVar;
        String str2 = null;
        if (commentVideoModel != null) {
            urlModel = commentVideoModel.getUserAvatar();
        } else {
            urlModel = null;
        }
        setAvatarImage(urlModel);
        CommentVideoModel commentVideoModel2 = this.f73197d;
        if (commentVideoModel2 != null) {
            str = commentVideoModel2.getCommentMsg();
        } else {
            str = null;
        }
        setCommentMsg(str);
        CommentVideoModel commentVideoModel3 = this.f73197d;
        if (commentVideoModel3 != null) {
            str2 = commentVideoModel3.getUserName();
        }
        this.f73199f = str2;
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView replyTextView = getReplyTextView();
            Context context = getContext();
            l.b(context, "");
            replyTextView.setText(context.getResources().getString(getMReplyTextId(), this.f73199f));
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.shortvideo.sticker.d.a aVar, int i2, int i3) {
        InteractStickerStruct interactStickerStruct;
        int i4;
        int i5;
        com.ss.android.ugc.aweme.shortvideo.sticker.d.a aVar2 = aVar;
        l.d(aVar2, "");
        CommentVideoModel commentVideoModel = this.f73197d;
        if (commentVideoModel != null) {
            CommentVideoModel commentVideoModel2 = aVar2.f130261a;
            if (commentVideoModel2 != null) {
                i5 = commentVideoModel2.getStartTime();
            } else {
                i5 = 0;
            }
            commentVideoModel.setStartTime(i5);
        }
        CommentVideoModel commentVideoModel3 = this.f73197d;
        if (commentVideoModel3 != null) {
            CommentVideoModel commentVideoModel4 = aVar2.f130261a;
            if (commentVideoModel4 != null) {
                i4 = commentVideoModel4.getEndTime();
            } else {
                i4 = 0;
            }
            commentVideoModel3.setEndTime(i4);
        }
        NormalTrackTimeStamp a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(aVar2.f130262b);
        com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar = this.f73198e;
        if (bVar != null) {
            interactStickerStruct = bVar.c();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(interactStickerStruct);
        if (a2 != null && a3 != null) {
            a2.setRotation(a2.getRotation() - a3.getRotation());
            if (!l.a(a3.getScale(), 0.0f)) {
                float floatValue = a2.getScale().floatValue();
                Float scale = a3.getScale();
                l.b(scale, "");
                a2.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            String b2 = com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(arrayList);
            InteractStickerStruct interactStickerStruct2 = aVar2.f130262b;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(b2);
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar2 = this.f73198e;
            if (bVar2 != null) {
                bVar2.b(false);
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar3 = this.f73198e;
            if (bVar3 != null) {
                bVar3.a(aVar2.f130262b, false);
            }
            com.ss.android.ugc.aweme.shortvideo.sticker.d.b bVar4 = this.f73198e;
            if (bVar4 != null) {
                bVar4.b(true);
            }
        }
    }
}
